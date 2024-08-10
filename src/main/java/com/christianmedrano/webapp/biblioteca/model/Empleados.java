package com.christianmedrano.webapp.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(
   name = "empleados"
)
public class Empleados {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private String nombre;
   private String apellido;
   private String telefono;
   private String direccion;
   private Long dpi;

   @Generated
   public Long getId() {
      return this.id;
   }

   @Generated
   public String getNombre() {
      return this.nombre;
   }

   @Generated
   public String getApellido() {
      return this.apellido;
   }

   @Generated
   public String getTelefono() {
      return this.telefono;
   }

   @Generated
   public String getDireccion() {
      return this.direccion;
   }

   @Generated
   public Long getDpi() {
      return this.dpi;
   }

   @Generated
   public void setId(final Long id) {
      this.id = id;
   }

   @Generated
   public void setNombre(final String nombre) {
      this.nombre = nombre;
   }

   @Generated
   public void setApellido(final String apellido) {
      this.apellido = apellido;
   }

   @Generated
   public void setTelefono(final String telefono) {
      this.telefono = telefono;
   }

   @Generated
   public void setDireccion(final String direccion) {
      this.direccion = direccion;
   }

   @Generated
   public void setDpi(final Long dpi) {
      this.dpi = dpi;
   }

   @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Empleados)) {
         return false;
      } else {
         Empleados other = (Empleados)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$dpi = this.getDpi();
            Object other$dpi = other.getDpi();
            if (this$dpi == null) {
               if (other$dpi != null) {
                  return false;
               }
            } else if (!this$dpi.equals(other$dpi)) {
               return false;
            }

            Object this$nombre = this.getNombre();
            Object other$nombre = other.getNombre();
            if (this$nombre == null) {
               if (other$nombre != null) {
                  return false;
               }
            } else if (!this$nombre.equals(other$nombre)) {
               return false;
            }

            label62: {
               Object this$apellido = this.getApellido();
               Object other$apellido = other.getApellido();
               if (this$apellido == null) {
                  if (other$apellido == null) {
                     break label62;
                  }
               } else if (this$apellido.equals(other$apellido)) {
                  break label62;
               }

               return false;
            }

            label55: {
               Object this$telefono = this.getTelefono();
               Object other$telefono = other.getTelefono();
               if (this$telefono == null) {
                  if (other$telefono == null) {
                     break label55;
                  }
               } else if (this$telefono.equals(other$telefono)) {
                  break label55;
               }

               return false;
            }

            Object this$direccion = this.getDireccion();
            Object other$direccion = other.getDireccion();
            if (this$direccion == null) {
               if (other$direccion != null) {
                  return false;
               }
            } else if (!this$direccion.equals(other$direccion)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Empleados;
   }

   @Generated
   public int hashCode() {
      boolean PRIME = true;
      int result = 1;
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $dpi = this.getDpi();
      result = result * 59 + ($dpi == null ? 43 : $dpi.hashCode());
      Object $nombre = this.getNombre();
      result = result * 59 + ($nombre == null ? 43 : $nombre.hashCode());
      Object $apellido = this.getApellido();
      result = result * 59 + ($apellido == null ? 43 : $apellido.hashCode());
      Object $telefono = this.getTelefono();
      result = result * 59 + ($telefono == null ? 43 : $telefono.hashCode());
      Object $direccion = this.getDireccion();
      result = result * 59 + ($direccion == null ? 43 : $direccion.hashCode());
      return result;
   }

   @Generated
   public String toString() {
      String var10000 = String.valueOf(this.getId());
      return "Empleados(id=" + var10000 + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + ", telefono=" + this.getTelefono() + ", direccion=" + this.getDireccion() + ", dpi=" + String.valueOf(this.getDpi()) + ")";
   }

   @Generated
   public Empleados() {
   }
}
