Algoritmo Ejercicio_21
	primo = 2
	Escribir "Escribe un número para mostrar los números primos hasta este"
	Leer num
	Escribir "1"
	Repetir
		Para i=2 Hasta num-1
			Si primo MOD i = 0 Entonces
				i = num-1
			SiNo
				contador = contador + 1
			Fin Si
		Fin Para
		Si contador = num-2 Entonces
			Escribir primo
		Fin Si
		primo = primo + 1
	Hasta Que primo = num
FinAlgoritmo
	