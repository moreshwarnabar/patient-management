package com.moray.patientservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientRequestDTO {

    @NotBlank(message = "First Name is required")
    @Size(max = 15, message = "First Name cannot exceed 100 characters.")
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(max = 15, message = "First Name cannot exceed 100 characters.")
    @JsonProperty("last_name")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Date of Birth is required")
    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @NotBlank(message = "Registered Date is required")
    @JsonProperty("registered_date")
    private String registeredDate;

}
