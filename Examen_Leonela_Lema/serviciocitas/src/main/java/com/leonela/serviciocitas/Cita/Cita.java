package com.leonela.serviciocitas.Cita;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Long pacienteId; //Id del paciente
    private String motivo;  //Motivo de la cita medica
    private LocalDate fecha;  //Fecha para la cita
    private Boolean confirmada;  //Confirmacion por parte del paciente
    private Integer duracionMinutos;  //tiempo estimado de la cita
}
