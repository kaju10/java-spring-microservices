package com.pm.patient_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank(message = "name is required")
    @Size(max= 100, message = "Name cannot exceed 100 characters ")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String Address;

    public @NotBlank(message = "name is required") @Size(max = 100, message = "Name cannot exceed 100 characters ") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "name is required") @Size(max = 100, message = "Name cannot exceed 100 characters ") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Address is required") String getAddress() {
        return Address;
    }

    public void setAddress(@NotBlank(message = "Address is required") String address) {
        Address = address;
    }

    public @NotBlank(message = "Date of Birth is required") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "Date of Birth is required") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotBlank(message = "Registered date is required") String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(@NotBlank(message = "Registered date is required") String registeredDate) {
        this.registeredDate = registeredDate;
    }

    @NotBlank(message = "Date of Birth is required")
    private String dateOfBirth;

    @NotBlank(message = "Registered date is required")
    private String registeredDate;

}
