Algoritmo Ejercicio_10
	Escribir "Por favor, introduzca sus 3 números:";
	Leer n1,n2,n3;
	Si n1 > n2 Entonces
		mayor = n1;
		menor = n2;
		Si n1 > n3 Entonces
			mayor = n1;
		SiNo
			mayor = n3;
		Fin Si
		Si n2 < n3 Entonces
			menor = n2;
		SiNo
			menor = n3;
		Fin Si
	SiNo
		mayor = n2;
		menor = n1;
		Si n2 > n3 Entonces
			mayor = n2;
		SiNo
			mayor = n3;
		Fin Si
		Si n1 < n3 Entonces
			menor = n1;
		SiNo
			menor = n3;
		Fin Si
	Fin Si
	Escribir "Mayor: " mayor;
	Escribir "Menor: " menor;
FinAlgoritmo