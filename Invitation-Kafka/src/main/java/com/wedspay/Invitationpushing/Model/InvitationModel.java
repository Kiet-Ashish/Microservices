package com.wedspay.Invitationpushing.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvitationModel {
    public String marriageId;
    public String message;
    public String emails; // now split all the email id using "," separate
}
