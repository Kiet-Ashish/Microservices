package com.wedspay.Invitationpushing.Controller;

import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;
import com.wedspay.Invitationpushing.Model.InvitationModel;
import com.wedspay.Invitationpushing.Service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invitation")
public class InvitationController {
    private final InvitationService service;
    @Autowired
    public InvitationController(InvitationService service){
        this.service = service;
    }
    @PostMapping("/new")
    public ResponseEntity<String> createInvitation(@RequestBody InvitationModel model){
        // make all related change to service. Then we can send data via kafka....

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MarriageRegistrationEntity>> getInvitations(){
        // find user email id
        // then find value from invitation table how many invitation are there for user.
        // then I need to find all send all marriage data also according to date 2 days cooling period.
        // use feign client here.
        List<MarriageRegistrationEntity> list = service.getInvitations("dummyemail@gmail.com");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
