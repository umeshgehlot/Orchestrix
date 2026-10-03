package com.orchestrix.auth_service.mapper;

import com.orchestrix.auth_service.dto.CreateInvitationRequest;
import com.orchestrix.auth_service.model.Invitation;
import com.orchestrix.auth_service.model.Organization;
import org.springframework.stereotype.Component;

@Component
public class InvitationMapper {

    public Invitation toEntity(CreateInvitationRequest request, Organization organization) {
        return Invitation.builder()
                .email(request.getEmail())
                .role(request.getRole())
                .organization(organization)
                .build();
    }
}
