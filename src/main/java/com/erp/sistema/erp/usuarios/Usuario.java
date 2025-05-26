package com.erp.sistema.erp.usuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Usuario {

    @Id 
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        ADMIN, VENDAS, FINANCEIRO, RH
    }
    
}
