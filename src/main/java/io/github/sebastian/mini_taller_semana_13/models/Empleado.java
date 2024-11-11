package io.github.sebastian.mini_taller_semana_13.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;

    @OneToMany(mappedBy = "empleado")
    private Set<EmpleadoHasHabilidad> empleadoHasHabilidades = new HashSet<>();
}
