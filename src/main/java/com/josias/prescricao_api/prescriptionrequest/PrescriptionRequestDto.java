package com.josias.prescricao_api.prescriptionrequest;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

public record PrescriptionRequestDto(

        @NotEmpty(message = "The debit number list cannot be empty")
        @Schema(
                description = "List of debit numbers for prescription",
                example = "[\"2017570003\", \"2019570275\"]"
        )
        Set<Long> debitNumberSet
) {
}
