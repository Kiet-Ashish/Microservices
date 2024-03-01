package com.wedspay.MarriageRegistration.Controller;

import com.wedspay.MarriageRegistration.Entity.MarriageRegistrationEntity;
import com.wedspay.MarriageRegistration.Model.MarriageRegistration;
import com.wedspay.MarriageRegistration.Service.MarriageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marriage")
public class MarriageController {

    private final MarriageService service;

    @Autowired
    public MarriageController(MarriageService service){
        this.service = service;
    }
    @PostMapping("/new")
    public ResponseEntity<MarriageRegistrationEntity> createMarriage(@RequestBody MarriageRegistration registration){
        // create service layer and put business logic there.
        MarriageRegistrationEntity marriage = service.createMarriage(registration);
        return new ResponseEntity<>(marriage, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MarriageRegistrationEntity>> getAllMarriages(){
        // get userId from somewhere let have some brainstorming


        // get all Marriage registration from service layer.
        List<MarriageRegistrationEntity> list = service.getAllMarriages(1); // temp it is 1.

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/id/{marriageId}")
    public ResponseEntity<MarriageRegistrationEntity> getMarriageById(@PathVariable String marriageId){
        // get data from service layer and send that data
        MarriageRegistrationEntity marriage = service.getMarriageById(marriageId);
        return new ResponseEntity<>(marriage, HttpStatus.OK);
    }
}
