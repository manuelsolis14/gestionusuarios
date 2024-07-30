package com.demo.gestion.alumnos.gestionalumnos.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.gestion.alumnos.gestionalumnos.entity.Estudiantes;
import com.demo.gestion.alumnos.gestionalumnos.service.EstudiantesService;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudiantesController {

	/**
	 * LOGGER
	 */
	private static final Logger log = LoggerFactory.getLogger(EstudiantesController.class);
	
	@Autowired
	private EstudiantesService estudiantesService;

	@GetMapping
	public List<Estudiantes> getAllEstudiantes() {
		log.info("### Busqueda todos los estudiantes");
		return (List<Estudiantes>) estudiantesService.getAllStudents();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Estudiantes> getEstudiantesById(@PathVariable Long id) {
		log.info("getEstudiantesById: {}", id);
		Optional<Estudiantes> student = estudiantesService.getStudentById(id);
		return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/status/{isActive}")
	public List<Estudiantes> getEstudiantesByStatus(@PathVariable boolean isActive) {
		log.info("getEstudiantesByStatus: {}", isActive);
		return estudiantesService.getStudentsByStatus(isActive);
	}

	@GetMapping("/extranjero/{isExtranjero}")
	public List<Estudiantes> getEstudiantesByExtranjero(@PathVariable boolean isExtranjero) {
		log.info("getEstudiantesByExtranjero: {}", isExtranjero);
		return estudiantesService.getStudentsByInternationalStatus(isExtranjero);
	}

	@GetMapping("/name/{name}")
	public List<Estudiantes> getEstudiantesByNombre(@PathVariable String name) {
		log.info("getEstudiantesByNombre: {}", name);
		return estudiantesService.getStudentsByName(name);
	}

	@GetMapping("/edad/{edad}")
	public List<Estudiantes> getEstudiantesByEdad(@PathVariable int edad) {
		log.info("getEstudiantesByEdad: {}", edad);
		return estudiantesService.getStudentsByAge(edad);
	}

	@GetMapping("/grado/{grado}")
	public List<Estudiantes> getEstudiantesByGrado(@PathVariable String grado) {
		log.info("getEstudiantesByGrado: {}", grado);
		return estudiantesService.getStudentsByGrade(grado);
	}

	@PostMapping
	public Estudiantes createEstudiantes(@RequestBody Estudiantes student) {
		log.info("createEstudiantes: {}", student);
		return estudiantesService.saveStudent(student);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Estudiantes> actualizarEstudiantes(@PathVariable Long id, @RequestBody Estudiantes estudiante) {
		
		if (estudiantesService.getStudentById(id).isPresent()) {
			estudiante.setId(id);
			return ResponseEntity.ok(estudiantesService.saveStudent(estudiante));
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
		if (estudiantesService.getStudentById(id).isPresent()) {
			estudiantesService.deleteStudent(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}

}
