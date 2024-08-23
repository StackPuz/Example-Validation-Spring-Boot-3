package com.stackpuz.example.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @NotNull
    private Integer id;

    @Size(max = 10)
    private String name;

    @Pattern(regexp = "^\\S+@\\S+\\.\\S+$", message = "Invalid email address")
    private String email;

    @Min(1)
    @Max(100)
    private Integer age;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
}