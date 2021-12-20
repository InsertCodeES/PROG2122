Algoritmo Ejercicio_12
	Para i<-1 Hasta 30 Con Paso i+1 Hacer
		Escribir Sin Saltar "Por favor, introduzca el nombre del alumno número ", i ,":";
		Leer nombre;
		Escribir Sin Saltar "Sexo (M,F): ";
		Leer sexo;
		// Ejecuto el switch antes de introducir todos los datos aunque tenga que repetir las
		// líneas de Altura y Peso de nuevo para no perder tiempo en dar datos para que de eor
		Segun sexo Hacer
			"M":
				Escribir Sin Saltar "Altura (cm): "
				Leer altura;
				Escribir Sin Saltar "Peso: "
				Leer peso;
				// El signo & sale diferente en la línea de abajo, parece un signo de elevación 
				Si peso > 70 & altura > 170  Entonces
					contM = contM + 1;
				Fin Si
			"F":
				Escribir Sin Saltar "Altura (cm): "
				Leer altura;
				Escribir Sin Saltar "Peso: "
				Leer peso;
				Si peso > 60 & altura > 160 Entonces
					contF = contF + 1;
				Fin Si
			De Otro Modo:
				Escribir "Error: Ha introducido un sexo inválido. Por favor, inténtelo de nuevo";
				i = i-1;
		Fin Segun
	Fin Para
	Escribir "Niños aptos para baloncesto: " contM;
	Escribir "Niñas aptas para baloncesto: " contF;
FinAlgoritmo
