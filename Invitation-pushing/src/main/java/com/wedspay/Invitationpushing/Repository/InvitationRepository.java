package com.wedspay.Invitationpushing.Repository;

import com.wedspay.Invitationpushing.Entity.Invitation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitationRepository extends MongoRepository<Invitation, String> {
    public List<Invitation> findAllByEmail(String email);
}
