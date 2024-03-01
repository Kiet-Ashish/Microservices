package com.wedspay.Invitationpushing.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvitationKafka {
    public String id;
    public String marriageId;
    public String message;
    public List<String> emails;
}
