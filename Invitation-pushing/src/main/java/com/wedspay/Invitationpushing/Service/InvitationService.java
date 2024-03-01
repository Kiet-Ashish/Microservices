package com.wedspay.Invitationpushing.Service;

import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;

import java.util.List;

public interface InvitationService {
    public List<MarriageRegistrationEntity> getInvitations(String email);
}
