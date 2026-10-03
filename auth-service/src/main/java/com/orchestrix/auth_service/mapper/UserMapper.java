package com.orchestrix.auth_service.mapper;

import com.orchestrix.auth_service.dto.RegisterOrgRequest;
import com.orchestrix.auth_service.dto.RegisterWithInviteRequest;
import com.orchestrix.auth_service.enums.Role;
import com.orchestrix.auth_service.model.Invitation;
import com.orchestrix.auth_service.model.Organization;
import com.orchestrix.auth_service.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toManagerEntity(RegisterOrgRequest request, Organization organization, String encodedPassword) {
        return User.builder().fullName(request.getFullName())
                .email(request.getEmail())
                .password(encodedPassword)
                .role(Role.MANAGER)
                .organization(organization).build();

    }

    public User toEntity(RegisterWithInviteRequest request, Invitation invitation, String encodedPassword) {
        return User.builder()
                .fullName(request.getFullName())
                .email(invitation.getEmail())
                .password(encodedPassword)
                .role(invitation.getRole())
                .organization(invitation.getOrganization())
                .build();
    }
}
