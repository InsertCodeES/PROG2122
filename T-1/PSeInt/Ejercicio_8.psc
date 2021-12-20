Algoritmo Ejercicio_8
	Escribir "Introduzca su nota para sabes su calificación";
	Leer nota;
	// He decidido hacerlo con Ifs anidados porque quería cubrir los decimales,
	// y en los switches no me dejaba definir rangos o hacer operaciones (<= que).
	Si nota < 4 Entonces
		Escribir "Muy deficiente";
	Sino
		Si nota < 5 Entonces
			Escribir "Insuficiente";
		SiNo
			Si nota < 6 Entonces
				Escribir "Suficiente";
			SiNo
				Si nota < 7 Entonces
					Escribir "Bien";
				SiNo
					Si nota < 9 Entonces
						Escribir "Notable";
					SiNo
						Escribir "Sobresaliente";
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
