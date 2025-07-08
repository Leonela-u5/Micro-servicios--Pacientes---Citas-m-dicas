package com.leonela.serviciopacientes.Paciente;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String nombreCompleto;      // Texto
    private int edad;                   // Numérico
    private boolean tieneSeguro;       // Booleano
    private LocalDate fechaNacimiento; // Fecha
    private String tipoSangre;         // Texto
}
