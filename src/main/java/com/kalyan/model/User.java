package com.kalyan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String fullName;

   @NotBlank(message="userName is mandatory")
   private String userName;

   @NotBlank(message="email is mandatory")
   @Email(message="email should be valid")
   private String email;

   private String phone;

   @NotBlank(message="role is mandatory")
   private String role;

   @CreationTimestamp
   private LocalDate createdAt;

   @UpdateTimestamp
   private LocalDate updatedAt;

   @NotBlank(message="password is mandatory")
   private String password;
}
