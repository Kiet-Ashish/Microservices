package com.wedspay.Invitationpushing.External.Service;

import com.wedspay.Invitationpushing.External.Model.MarriageRegistrationEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "MARRIAGE-SERVICE")
public interface MarriageService {
    @GetMapping("/id/{marriageId}")
    public ResponseEntity<MarriageRegistrationEntity> getMarriageById(@PathVariable String marriageId);
}
