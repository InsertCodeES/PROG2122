Algoritmo Ejercicio_20
	Escribir "Introduce un n�mero para calcular si es primo"
	Leer num
	Para i=2 Hasta num-1
		Si num MOD i = 0 Entonces
			Escribir "El n�mero no es primo"
			i = num-1
		SiNo
			contador = contador + 1
		Fin Si
	Fin Para
	Si contador = num-2 Entonces
		Escribir "El n�mero es primo"
	Fin Si
FinAlgoritmo