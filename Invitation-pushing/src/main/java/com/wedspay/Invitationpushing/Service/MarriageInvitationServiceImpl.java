package com.wedspay.Invitationpushing.Service;

import com.wedspay.Invitationpushing.Entity.Invitation;
import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;
import com.wedspay.Invitationpushing.External.Service.MarriageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarriageInvitationServiceImpl implements MarriageInvitationService{

    private final MarriageService service;
    @Autowired
    public MarriageInvitationServiceImpl(MarriageService service){
        this.service = service;
    }
    @Override
    public List<MarriageRegistrationEntity> getAllInvitation(List<Invitation> list) {
        // make use of feign client to get data.
        List<MarriageRegistrationEntity> ans = new ArrayList<>();
        for(Invitation invitation : list){
            MarriageRegistrationEntity registration = service.getMarriageById(invitation.getMarriageId()).getBody();
            ans.add(registration);
        }
        return ans;
    }


}
