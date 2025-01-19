package com.josias.prescricao_api.prescriptionrequest;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.Optional;

import static com.josias.prescricao_api.prescriptionrequest.PrescriptionRequestConverter.toPrescriptRequest;

@Service
@RequiredArgsConstructor
public class PrescriptionRequestService {
    private PrescriptionRequestRepository prescriptionRequestRepository;
    @Value("${prescription.status.waiting}")
    private Integer statusWaiting;
    @Value("${header.login}")
    private String headerLogin;

    public PrescriptionRequest savePrescriptionRequestDebit(PrescriptionRequestDto prescriptionRequestDto,
                                                            HttpServletRequest request) {
        return savePrescriptionRequest(toPrescriptRequest(
                1L,
                Objects.requireNonNull(request.getHeader("headerLogin")),
                LocalDateTime.now(ZoneId.systemDefault()))
        );
    }

    public PrescriptionRequest savePrescriptionRequest(PrescriptionRequest prescriptionRequest) {
        return prescriptionRequestRepository.save(prescriptionRequest);
    }

    public Optional<PrescriptionRequest> getPrescriptionRequestsById(Long idPrescriptionRequest) {
        return prescriptionRequestRepository.findById(idPrescriptionRequest);
    }

    public Page<PrescriptionRequest> getAllPrescriptionRequests(Pageable pageable) {
        return prescriptionRequestRepository.findAll(pageable);
    }
}
