package com.leonela.serviciocitas.Cita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    
    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> obtenerPorId(Long id) {
        return citaRepository.findById(id);
    }

    public Cita crear(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita actualizar(Long id, Cita citaActualizada) {
        return citaRepository.findById(id).map(cita -> {
            cita.setPacienteId(citaActualizada.getPacienteId());
            cita.setMotivo(citaActualizada.getMotivo());
            cita.setFecha(citaActualizada.getFecha());
            cita.setConfirmada(citaActualizada.getConfirmada());
            cita.setDuracionMinutos(citaActualizada.getDuracionMinutos());
            return citaRepository.save(cita);
        }).orElseThrow(() -> new RuntimeException("Cita no encontrada con id " + id));
    }

    public void eliminar(Long id) {
        citaRepository.deleteById(id);
    }
}
