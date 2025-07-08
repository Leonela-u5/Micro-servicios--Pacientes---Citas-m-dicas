package com.leonela.serviciopacientes.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
 
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerTodos() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> obtenerPorId(Long id) {
        return pacienteRepository.findById(id);
    }

   public Paciente crear(Paciente paciente) {
    System.out.println(">>> Recibido para guardar: " + paciente);
    Paciente guardado = pacienteRepository.save(paciente);
    System.out.println(">>> Paciente guardado con ID: " + guardado.getId());
    return guardado;
}
      
     public Paciente actualizar(Long id, Paciente datos) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe paciente con ID: " + id));

        paciente.setNombreCompleto(datos.getNombreCompleto());
        paciente.setEdad(datos.getEdad());
        paciente.setTieneSeguro(datos.isTieneSeguro());
        paciente.setFechaNacimiento(datos.getFechaNacimiento());
        paciente.setTipoSangre(datos.getTipoSangre());

        return pacienteRepository.save(paciente);
    }

     public void eliminar(Long id) {
        pacienteRepository.deleteById(id);
    }
}
