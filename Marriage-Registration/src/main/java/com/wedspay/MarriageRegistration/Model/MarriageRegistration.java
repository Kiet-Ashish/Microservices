package com.wedspay.MarriageRegistration.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MarriageRegistration {
    public String girlName;
    public String boyName;
    public LocalDate marriageDate;
    public long mobileNumber;
    public String email;
    public String address;
    public String city;
    public String state;
    public String country;
}
