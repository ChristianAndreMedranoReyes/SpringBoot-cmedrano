package com.christianmedrano.webapp.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;

@Entity
@Table(
   name = "Clientes"
)
public class Cliente {
   @Id
   private long DPI;
   private String nombre;
   private String apellido;
   private String telefono;

   @Generated
   public long getDPI() {
      return this.DPI;
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
   public void setDPI(final long DPI) {
      this.DPI = DPI;
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
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Cliente)) {
         return false;
      } else {
         Cliente other = (Cliente)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getDPI() != other.getDPI()) {
            return false;
         } else {
            label49: {
               Object this$nombre = this.getNombre();
               Object other$nombre = other.getNombre();
               if (this$nombre == null) {
                  if (other$nombre == null) {
                     break label49;
                  }
               } else if (this$nombre.equals(other$nombre)) {
                  break label49;
               }

               return false;
            }

            Object this$apellido = this.getApellido();
            Object other$apellido = other.getApellido();
            if (this$apellido == null) {
               if (other$apellido != null) {
                  return false;
               }
            } else if (!this$apellido.equals(other$apellido)) {
               return false;
            }

            Object this$telefono = this.getTelefono();
            Object other$telefono = other.getTelefono();
            if (this$telefono == null) {
               if (other$telefono != null) {
                  return false;
               }
            } else if (!this$telefono.equals(other$telefono)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Cliente;
   }

   @Generated
   public int hashCode() {
      boolean PRIME = true;
      int result = 1;
      long $DPI = this.getDPI();
      result = result * 59 + (int)($DPI ^ $DPI >>> 32);
      Object $nombre = this.getNombre();
      result = result * 59 + ($nombre == null ? 43 : $nombre.hashCode());
      Object $apellido = this.getApellido();
      result = result * 59 + ($apellido == null ? 43 : $apellido.hashCode());
      Object $telefono = this.getTelefono();
      result = result * 59 + ($telefono == null ? 43 : $telefono.hashCode());
      return result;
   }

   @Generated
   public String toString() {
      long var10000 = this.getDPI();
      return "Cliente(DPI=" + var10000 + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + ", telefono=" + this.getTelefono() + ")";
   }

   @Generated
   public Cliente() {
   }
}
