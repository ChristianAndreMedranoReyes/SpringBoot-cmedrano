package com.christianmedrano.webapp.biblioteca.service;

import com.christianmedrano.webapp.biblioteca.model.Empleados;
import com.christianmedrano.webapp.biblioteca.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadosService {
   @Autowired
   EmpleadoRepository empleadoRepository;

   public EmpleadoService() {
   }

   public List<Empleados> listarEmpleados() {
      return this.empleadoRepository.findAll();
   }

   public void guardarEmpleado(Empleados empleado) {
      this.empleadoRepository.save(empleado);
   }

   public Empleados buscarEmpleados(Long id) {
      return (Empleados)this.empleadoRepository.findById(id).orElse(null);
   }

   public void eliminarEmpleado(Empleados empleado) {
      this.empleadoRepository.delete(empleado);
   }
}
