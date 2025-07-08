package com.leonela.serviciocitas.pacienteDTO;

import java.time.LocalDate;

public class PacienteDTO {
       private Long id;

    private String nombreCompleto;      // Texto
    private int edad;                   // Numérico
    private boolean tieneSeguro;       // Booleano
    private LocalDate fechaNacimiento; // Fecha
    private String tipoSangre;         // Texto
}