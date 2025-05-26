package com.erp.sistema.erp.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Custom query methods can be defined here if needed
    // For example, to find a user by email:
    // Optional<Usuario> findByEmail(String email);

    // Additional methods for user management can be added as required

    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByNome(String nome);
}
