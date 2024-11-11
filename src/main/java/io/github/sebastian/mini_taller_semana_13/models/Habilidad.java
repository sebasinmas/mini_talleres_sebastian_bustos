package io.github.sebastian.mini_taller_semana_13.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "habilidad")
    private Set<EmpleadoHasHabilidad> empleadoHasHabilidades = new HashSet<>();
}
