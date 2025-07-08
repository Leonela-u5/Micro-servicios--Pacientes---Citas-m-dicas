package com.leonela.serviciocitas.pacienteDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Aquí debes usar el nombre que registraste en Eureka para el GATEWAY
@FeignClient(name = "serviciopaciente")  

public interface PacienteFeignApi {

    @GetMapping("/pacientes/{id}")
    PacienteDTO obtenerPacientePorId(@PathVariable("id") Long id);

}
