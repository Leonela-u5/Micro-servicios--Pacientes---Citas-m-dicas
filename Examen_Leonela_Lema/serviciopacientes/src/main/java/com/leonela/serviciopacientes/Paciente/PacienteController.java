package com.leonela.serviciopacientes.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor
public class PacienteController {

   //@Autowired
private final PacienteService pacienteService;
private final PacienteRepository pacienteRepository;


 // Obtener todos los pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>> obtenerTodos() {
        List<Paciente> lista = pacienteService.obtenerTodos();
        return ResponseEntity.ok(lista);
    }

    // Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<Paciente> obtenerPorId(@PathVariable("id") Long id) {
        Optional<Paciente> pacienteOpt = pacienteService.obtenerPorId(id);
        return pacienteOpt.map(ResponseEntity::ok)
                          .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear nuevo paciente
    @PostMapping
    public ResponseEntity<Paciente> crearPaciente(@RequestBody Paciente paciente) {
        Paciente nuevo = pacienteRepository.save(paciente);
        return ResponseEntity.ok(nuevo);
    }

    // Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Paciente> actualizar(@PathVariable("id") Long id, @RequestBody Paciente paciente) {
        return ResponseEntity.ok(pacienteService.actualizar(id, paciente));
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Long id) {
        pacienteService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}
