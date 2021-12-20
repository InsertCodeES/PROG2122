Algoritmo Ejercicio_19
	random = Aleatorio(0,100)
	Escribir "Intenta adivinar un número del 1 al 100"
	Leer num
	Mientras num <> random O dato <> "fin" Hacer
		Si num > random Entonces
			Escribir "El número es más BAJO. Inténtalo de nuevo"
		SiNo
			Escribir "El número es más ALTO. Vuelve a intentarlo"
		Fin Si
		Leer dato
	Fin Mientras
	Si ConvertirATexto(num) = "fin" Entonces
		Escribir "El juego ha finalizado"
	SiNo
		Escribir "¡Enhorabuena! El número era " num
	Fin Si
FinAlgoritmo