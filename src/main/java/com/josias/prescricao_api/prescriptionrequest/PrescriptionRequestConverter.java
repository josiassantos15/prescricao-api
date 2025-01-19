package com.josias.prescricao_api.prescriptionrequest;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PrescriptionRequestConverter {

    public static PrescriptionRequest toPrescriptRequest(PrescriptionRequestDto prescriptRequestDto) {
        return new PrescriptionRequest();
    }
}
