package com.iesdoctorbalmis.spring.repository;

import com.iesdoctorbalmis.spring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByCodigoCliente(String codigoCliente);
    boolean existsByEmail(String email);
    boolean existsByCodigoCliente(String codigoCliente);
}