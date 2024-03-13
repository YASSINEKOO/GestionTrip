package com.example.gestiontrip.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Account")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Account")
    private Long idAccount;
    private String Username;
    private String Password;
    private boolean isActive;
}