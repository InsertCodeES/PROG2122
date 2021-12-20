Algoritmo Ejercicio_17
	Escribir "Introduce el número de la serie de Fibonacci a seleccionar: ";
	Leer n;
	num1=0; num2=1
	Para i=1 Hasta n Hacer
		Escribir Sin Saltar a ","
		num3 = num1 + num2
		num1 = num2
		num2 = num3
	Fin Para
FinAlgoritmo
