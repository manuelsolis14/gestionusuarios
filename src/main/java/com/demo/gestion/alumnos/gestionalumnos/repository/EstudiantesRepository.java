package com.demo.gestion.alumnos.gestionalumnos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.gestion.alumnos.gestionalumnos.entity.Estudiantes;

@Repository
public interface EstudiantesRepository extends CrudRepository<Estudiantes, Long> {

	List<Estudiantes> findByIsActive(boolean isActive);

	List<Estudiantes> findByIsExtranjero(boolean isExtranjero);

	List<Estudiantes> findBynombreIgnoreCase(String fullName);

	List<Estudiantes> findByEdad(int age);

	List<Estudiantes> findByGradoActual(String currentGrade);

}
