Algoritmo Ejercicio_20
	Escribir "Introduce un número para calcular si es primo"
	Leer num
	Para i=2 Hasta num-1
		Si num MOD i = 0 Entonces
			Escribir "El número no es primo"
			i = num-1
		SiNo
			contador = contador + 1
		Fin Si
	Fin Para
	Si contador = num-2 Entonces
		Escribir "El número es primo"
	Fin Si
FinAlgoritmo