package com.wedspay.Invitationpushing.Service;

import com.wedspay.Invitationpushing.Entity.Invitation;
import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;

import java.util.List;

public interface MarriageInvitationService {
    public List<MarriageRegistrationEntity> getAllInvitation(List<Invitation> list);
}
