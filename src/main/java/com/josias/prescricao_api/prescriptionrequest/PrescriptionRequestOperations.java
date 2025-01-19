package com.josias.prescricao_api.prescriptionrequest;

import com.josias.prescricao_api.common.GeneralOperations;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Prescription Request Resouce", description = "Manages all resources related to prescription requests")
public interface PrescriptionRequestOperations extends GeneralOperations {

    @Operation(
            summary = "Save Prescription Request",
            description = "Receives a list of debit numbers and saves them in a prescription request"
    )
    ResponseEntity<PrescriptionRequest> savePrescriptionRequest(
            @Parameter @RequestBody PrescriptionRequestDto prescriptionRequestDto,
            @Parameter HttpServletRequest request);
}
