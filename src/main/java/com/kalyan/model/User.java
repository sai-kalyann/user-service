package com.kalyan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDate;


@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String fullName;

   private String email;

   private String phone;

   private String role;

   private LocalDate createdAt;

   private LocalDate updatedAt;

   public User(String fullName,
               String email,
               String phone,
               String role,
               LocalDate createdAt,
               LocalDate updatedAt) {

      this.fullName = fullName;
      this.email = email;
      this.phone = phone;
      this.role = role;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
   }

   public User() {
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public LocalDate getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(LocalDate createdAt) {
      this.createdAt = createdAt;
   }

   public LocalDate getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(LocalDate updatedAt) {
      this.updatedAt = updatedAt;
   }

   @Override
   public String toString() {
      return "User{" +
              "fullName='" + fullName + '\'' +
              ", email='" + email + '\'' +
              ", phone='" + phone + '\'' +
              ", role='" + role + '\'' +
              ", createdAt=" + createdAt +
              ", updatedAt=" + updatedAt +
              '}';
   }
}
