package com.mycompany.tarea_grupo_05_persona_poo;

// Clase abstracta Persona
abstract class Persona {
private String nombre;
private int edad;
private double sueldo;
private char sexo;

// Constructor de Persona
public Persona(String nombre, int edad, double sueldo, char sexo) {
this.nombre = nombre;
this.edad = edad;
this.sueldo = sueldo;
this.sexo = sexo;
}

// Metodos getter y setter
public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}

public double getSueldo() {
return sueldo;
}

public void setSueldo(double sueldo) {
this.sueldo = sueldo;
}

public char getSexo() {
return sexo;
}

public void setSexo(char sexo) {
this.sexo = sexo;
}

// Metodo abstracto que se implementara en las subclases
public abstract void mostrarInfo();
}

// Clase principal para probar el codigo
public class TAREA_GRUPO_05_PERSONA_POO {
public static void main(String[] args) {
  System.out.println("Codigo en blanco para llenar el programa");       
}
}


