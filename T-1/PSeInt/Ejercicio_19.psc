Algoritmo Ejercicio_19
	random = Aleatorio(0,100)
	Escribir "Intenta adivinar un n�mero del 1 al 100"
	Leer num
	Mientras num <> random O dato <> "fin" Hacer
		Si num > random Entonces
			Escribir "El n�mero es m�s BAJO. Int�ntalo de nuevo"
		SiNo
			Escribir "El n�mero es m�s ALTO. Vuelve a intentarlo"
		Fin Si
		Leer dato
	Fin Mientras
	Si ConvertirATexto(num) = "fin" Entonces
		Escribir "El juego ha finalizado"
	SiNo
		Escribir "�Enhorabuena! El n�mero era " num
	Fin Si
FinAlgoritmo