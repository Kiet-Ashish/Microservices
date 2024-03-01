package com.wedspay.Invitationpushing.External.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MarriageRegistrationEntity {
    public String marriageId;
    public long userId;
    public String girlName;
    public String boyName;
    public LocalDate marriageDate;
    public long mobileNumber;
    public String email;
    public Address address;
}
