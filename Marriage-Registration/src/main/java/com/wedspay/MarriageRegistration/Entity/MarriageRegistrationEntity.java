package com.wedspay.MarriageRegistration.Entity;

import com.wedspay.MarriageRegistration.Model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document(collection = "MarriageRegistration")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MarriageRegistrationEntity {
    @MongoId
    public String marriageId;
    public long userId;
    public String girlName;
    public String boyName;
    public LocalDate marriageDate;
    public long mobileNumber;
    public String email;
    public Address address;
}
