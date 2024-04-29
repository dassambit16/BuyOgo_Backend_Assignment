package com.traini8.traini8registry.dto;

import com.traini8.traini8registry.model.Address;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenterDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String centerName;

    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 characters alphanumeric")
    private String centerCode;

    @NotNull(message = "Invalid input! Provide valid Center Address.")
    @Valid
    private Address address;

    @Column(nullable = false)
    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "\\d{10}", message = "Invalid phone number format")
    private String contactPhone;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdOn;

}
