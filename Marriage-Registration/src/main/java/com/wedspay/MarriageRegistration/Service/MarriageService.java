package com.wedspay.MarriageRegistration.Service;

import com.wedspay.MarriageRegistration.Entity.MarriageRegistrationEntity;
import com.wedspay.MarriageRegistration.Model.MarriageRegistration;

import java.util.List;

public interface MarriageService {
    public MarriageRegistrationEntity createMarriage(MarriageRegistration registration);
    public List<MarriageRegistrationEntity> getAllMarriages(long userId);
    public MarriageRegistrationEntity getMarriageById(String marriageId);
}
