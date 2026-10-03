package com.orchestrix.auth_service.dto;

import com.orchestrix.auth_service.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvitationInfoResponse {
    private String organizationName;
    private String email;
    private Role role;
}