package com.leonela.serviciopacientes.Paciente;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {
    List<Paciente> findAll();
    // No es necesario redefinir findById
}
