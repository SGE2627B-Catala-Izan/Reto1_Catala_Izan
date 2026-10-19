package com.iesdoctorbalmis.spring.repository;

import com.iesdoctorbalmis.spring.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Optional<Producto> findByReferencia(String referencia);
    boolean existsByReferencia(String referencia);
}