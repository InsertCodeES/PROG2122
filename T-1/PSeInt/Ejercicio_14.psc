Algoritmo Ejercicio_14
	Escribir Sin Saltar "Introduce la cantidad de notas a introducir:";
	Leer n;
	Escribir Sin Saltar "Introduzca las notas a continuaci�n:";
	Para i<-0 Hasta n Con Paso i+1 Hacer
		Leer nota;
		Si nota >= 6 Entonces
			aprob = aprob + 1;
		Fin Si
	Fin Para
	Escribir "N�mero de aprobados: " aprob;
FinAlgoritmo
