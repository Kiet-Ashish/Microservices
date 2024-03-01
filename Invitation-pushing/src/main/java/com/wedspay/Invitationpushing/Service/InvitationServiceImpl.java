package com.wedspay.Invitationpushing.Service;

import com.wedspay.Invitationpushing.Entity.Invitation;
import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;
import com.wedspay.Invitationpushing.Repository.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InvitationServiceImpl implements InvitationService{

    private final InvitationRepository repository;
    private final MarriageInvitationService service;
    @Autowired
    public InvitationServiceImpl(InvitationRepository repository, MarriageInvitationService service){
        this.repository = repository;
        this.service = service;
    }
    @Override
    public List<MarriageRegistrationEntity> getInvitations(String email) {
        List<Invitation> list = repository.findAllByEmail(email);

        // now using feign client get all possible marriage data out.
        // using marriage id.
        return service.getAllInvitation(list);
    }
}
