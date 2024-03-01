package com.wedspay.MarriageRegistration.Service;

import com.wedspay.MarriageRegistration.Entity.MarriageRegistrationEntity;
import com.wedspay.MarriageRegistration.Model.Address;
import com.wedspay.MarriageRegistration.Model.MarriageRegistration;
import com.wedspay.MarriageRegistration.Repository.MarriageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarriageServiceImpl implements MarriageService{

    private final MarriageRepository repository;

    @Autowired
    public MarriageServiceImpl(MarriageRepository repository){
        this.repository = repository;
    }
    @Override
    public MarriageRegistrationEntity createMarriage(MarriageRegistration registration) {
        // saving my marriage details to database.
        Address address = Address
                .builder()
                .address(registration.getAddress())
                .country(registration.getCountry())
                .state(registration.getState())
                .city(registration.getCity())
                .build();

        MarriageRegistrationEntity entity = MarriageRegistrationEntity
                .builder()
                .boyName(registration.getBoyName())
                .girlName(registration.getGirlName())
                .email(registration.getEmail())
                .mobileNumber(registration.getMobileNumber())
                .marriageDate(registration.getMarriageDate())
                .address(address)
                .build();
        return repository.save(entity);
    }

    @Override
    public List<MarriageRegistrationEntity> getAllMarriages(long userId) {
        Optional<List<MarriageRegistrationEntity>> optional = repository.findByUserId(userId);
        return optional.orElse(null);
    }

    @Override
    public MarriageRegistrationEntity getMarriageById(String marriageId) {
        return repository.findById(marriageId).orElse(null);
    }
}
