package com.demo.gestion.alumnos.gestionalumnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gestion.alumnos.gestionalumnos.entity.Estudiantes;
import com.demo.gestion.alumnos.gestionalumnos.repository.EstudiantesRepository;

@Service
public class EstudiantesService {

	@Autowired
	private EstudiantesRepository studentRepository;

	public List<Estudiantes> getAllStudents() {
		return studentRepository.findAll();
	}

	public Optional<Estudiantes> getStudentById(Long id) {
		return studentRepository.findById(id);
	}

	public List<Estudiantes> getStudentsByStatus(boolean isActive) {
		return studentRepository.findByIsActive(isActive);
	}

	public List<Estudiantes> getStudentsByInternationalStatus(boolean isExtranjero) {
		return studentRepository.findByIsExtranjero(isExtranjero);
	}

	public List<Estudiantes> getStudentsByName(String name) {
		return studentRepository.findBynombre(name);
	}

	public List<Estudiantes> getStudentsByAge(int age) {
		return studentRepository.findByEdad(age);
	}

	public List<Estudiantes> getStudentsByGrade(String grade) {
		return studentRepository.findByGradoActual(grade);
	}

	public Estudiantes saveStudent(Estudiantes student) {
		return studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
