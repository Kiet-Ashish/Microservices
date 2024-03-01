package com.wedspay.MarriageRegistration.Repository;

import com.wedspay.MarriageRegistration.Entity.MarriageRegistrationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarriageRepository extends MongoRepository<MarriageRegistrationEntity, String> {
    public Optional<List<MarriageRegistrationEntity>> findByUserId(long userId);
}
