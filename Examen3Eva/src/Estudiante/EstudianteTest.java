package Estudiante;

import static org.junit.Assert.*;

import org.junit.Test;


public class EstudianteTest {

	@Test
	public void testGetNombre() {
		System.out.println("getNombre");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		assertTrue(e.getNombre() == "Arcadio");
	}
	@Test
	public void testSetNombre() {
		System.out.println("setNombre");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		e.setNombre("Adrian");
		assertTrue(e.getNombre() == "Adrian");
	}
	@Test
	public void testGetCodigo() {
		System.out.println("getCodigo");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		assertTrue(e.getCodigo() == "A123");
	}
	@Test
	public void testSetCodigo() {
		System.out.println("setCodigo");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		e.setCodigo("B789");
		assertTrue(e.getCodigo() == "B789");
	}
	@Test
	public void testGetNota() {
		System.out.println("getNota");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		assertTrue(e.getNota() == 4.23);
	}
	@Test
	public void testSetNota() {
		System.out.println("SetNota");
		Estudiante e = new Estudiante("Arcadio", "A123", 4.23, 5.82);
		e.setNota(7.25);
		assertTrue(e.getNota() == 7.25);
	}

}
