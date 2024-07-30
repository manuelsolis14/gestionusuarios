package com.demo.gestion.alumnos.gestionalumnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.gestion.alumnos.gestionalumnos.entity.Estudiantes;

@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {

	List<Estudiantes> findByIsActive(boolean isActive);

	List<Estudiantes> findByIsExtranjero(boolean isExtranjero);

	List<Estudiantes> findBynombre(String fullName);

	List<Estudiantes> findByEdad(int age);

	List<Estudiantes> findByGradoActual(String currentGrade);

}
