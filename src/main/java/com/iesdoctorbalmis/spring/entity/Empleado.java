package com.iesdoctorbalmis.spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero_empleado", nullable = false, unique = true, length = 20)
    private String numeroEmpleado;
    
    @Column(nullable = false, length = 100)
    private String nombre;
    
    @Column(nullable = false, length = 100)
    private String apellidos;
    
    @Column(nullable = false, length = 100)
    private String cargo;
    
    @Column(nullable = false, length = 100)
    private String departamento;
    
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    
    @Column(name = "fecha_incorporacion", nullable = false)
    private LocalDate fechaIncorporacion;
    
    @Column(name = "activo", nullable = false)
    private Boolean activo;
}