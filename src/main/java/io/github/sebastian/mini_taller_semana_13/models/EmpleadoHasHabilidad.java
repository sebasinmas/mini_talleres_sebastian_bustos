package io.github.sebastian.mini_taller_semana_13.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
public class EmpleadoHasHabilidad {
    @EmbeddedId
    private EmpleadoHabilidadId id = new EmpleadoHabilidadId();
    @ManyToOne
    @MapsId("empleadoId")
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @ManyToOne
    @MapsId("habilidadId")
    @JoinColumn(name = "habilidad_id")
    private Habilidad habilidad;

    // Se pueden añadir más atributos

}
@Embeddable
@Data
class EmpleadoHabilidadId implements Serializable {

    private int empleadoId;
    private int habilidadId;

    public EmpleadoHabilidadId() {}

    public EmpleadoHabilidadId(int empleadoId, int habilidadId) {
        this.empleadoId = empleadoId;
        this.habilidadId = habilidadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoHabilidadId that = (EmpleadoHabilidadId) o;
        return Objects.equals(empleadoId, that.empleadoId) &&
                Objects.equals(habilidadId, that.habilidadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empleadoId, habilidadId);
    }

}