package com.wedspay.Invitationpushing.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Invitation {
    @MongoId
    public String id;
    public String marriageId;
    public String message;
    public String email; // user email id. where we need to find...
    public LocalDate date;
}
