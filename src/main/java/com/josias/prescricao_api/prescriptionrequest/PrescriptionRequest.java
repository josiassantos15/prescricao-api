package com.josias.prescricao_api.prescriptionrequest;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRESCRIPTION_REQUEST")
public class PrescriptionRequest {
    @Id
    @Column(name = "TPR_ID_REQUEST")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRequest;

    @Column(name = "TPR_PROTOCOL", nullable = false)
    private Long protocol;

    @Column(name = "TPR_APPLICANT", nullable = false)
    private String applicant;

    @Column(name = "TPR_REGISTRATION_DATE")
    private LocalDateTime registrationDate;

    public PrescriptionRequest(Long protocol, String applicant, LocalDateTime registrationDate) {
        this.protocol = protocol;
        this.applicant = applicant;
        this.registrationDate = registrationDate;
    }
}
