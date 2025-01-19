package com.josias.prescricao_api.prescriptionrequest;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PrescriptionRequestConverter {

    public static PrescriptionRequest toPrescriptRequest(Long protocol,
                                                         String applicant,
                                                         LocalDateTime registrationDate) {
        return new PrescriptionRequest(
                1L,
                protocol,
                applicant,
                registrationDate
        );
    }
}
