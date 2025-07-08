package com.leonela.serviciocitas.Cita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leonela.serviciocitas.pacienteDTO.PacienteDTO;
import com.leonela.serviciocitas.pacienteDTO.PacienteFeignApi;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Map;

@RestController
@RequestMapping("/")

public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private PacienteFeignApi pacienteFeignApi;

    @GetMapping
    public List<Cita> obtenerTodas() {
        return citaService.obtenerTodas();
    }

 
    @GetMapping("/{id}")
    public Optional<Cita> obtenerPorId(@PathVariable("id") Long id) {
        return citaService.obtenerPorId(id);
    }

    @PostMapping
    public Cita crear(@RequestBody Cita cita) {
        return citaService.crear(cita);
    }

    @PutMapping("/{id}")
    public Cita actualizar(@PathVariable("id") Long id, @RequestBody Cita cita) {
        return citaService.actualizar(id, cita);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        citaService.eliminar(id);
    }
}
