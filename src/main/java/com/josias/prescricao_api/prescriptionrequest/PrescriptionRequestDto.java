package com.josias.prescricao_api.prescriptionrequest;

import java.util.Set;

public record PrescriptionRequestDto(

        Set<Long> debitNumberSet
) {
}
