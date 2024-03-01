package com.wedspay.MarriageRegistration.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    public String address;
    public String city;
    public String state;
    public String country;
}
