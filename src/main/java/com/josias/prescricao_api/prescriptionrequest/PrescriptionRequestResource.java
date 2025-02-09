package com.josias.prescricao_api.prescriptionrequest;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("extranet/prescription")
public class PrescriptionRequestResource implements PrescriptionRequestOperations {

    private PrescriptionRequestService prescriptionRequestService;

    @PostMapping()
    public ResponseEntity<PrescriptionRequest> savePrescriptionRequest(
            @RequestBody PrescriptionRequestDto prescriptionRequestDto, HttpServletRequest request) {
        PrescriptionRequest prescriptionRequestSalved = prescriptionRequestService
                .savePrescriptionRequestDebit(prescriptionRequestDto, request);
        return ResponseEntity.created(URI.create("extranet/prescription/"))
                .body(prescriptionRequestSalved);
    }
}
