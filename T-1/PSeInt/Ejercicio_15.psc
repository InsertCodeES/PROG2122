Algoritmo Ejercicio_15
	Repetir
		Escribir Sin Saltar "Dame la edad del alumno " estudiantes + 1 ":";
		Leer edad;
		edades = edades + edad;
		estudiantes = estudiantes + 1;
		Escribir Sin Saltar"¿Quiere seguir? (Enter para seguir, N para no)";
		Leer yn;
	Hasta Que yn == 'N' O yn == "n"
	Escribir "Edad media de los estudiantes: " edades / estudiantes;
FinAlgoritmo