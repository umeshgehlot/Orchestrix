package com.orchestrix.auth_service.controller;

import com.orchestrix.auth_service.dto.CreateInvitationRequest;
import com.orchestrix.auth_service.dto.ApiResponse;
import com.orchestrix.auth_service.dto.CreateInvitationResponse;
import com.orchestrix.auth_service.dto.InvitationInfoResponse;
import com.orchestrix.auth_service.facade.InvitationFacade;
import com.orchestrix.auth_service.security.UserPrincipal;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invitations")
@RequiredArgsConstructor
public class InvitationController {

    private final InvitationFacade invitationFacade;

    @PostMapping
    public ApiResponse<CreateInvitationResponse> createInvitation(@Valid @RequestBody CreateInvitationRequest request,
                                                                   @AuthenticationPrincipal UserPrincipal userPrincipal){
        invitationFacade.createInvitation(request,userPrincipal);
        return ApiResponse.success(new CreateInvitationResponse("Invitation sent to "+request.getEmail()), "Invitation sent successfully");
    }
    
    @PostMapping("/validate")
    public ApiResponse<InvitationInfoResponse> validateToken(@RequestParam String token){
        return ApiResponse.success(invitationFacade.validateToken(token), "Invitation token validated successfully");
    }
}
