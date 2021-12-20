Algoritmo Ejercicio_16
	Dimension alumno[40], nota[40];
	Para i<-1 Hasta 40 Con Paso i+1 Hacer
		Escribir Sin Saltar "Nombre del alumno:";
		Leer alumno[i];
		Escribir Sin Saltar "Nota:";
		Leer nota[i];
		// Asigno como máximo y mínimo el primer alumno, porque si la secuencia de entrada es
		// ascendente constante, no entrará nunca en el "SiNo".
		Mientras x<=0
			nmayor = nota[1];
			nmenor = nota[1];
			amayor = alumno[1];
			amenor = alumno[1];
			x = x+1;
		FinMientras
		Si nmayor <= nota[i]
			nmayor = nota[i];
			amayor = alumno[i];
		SiNo
			Si nmenor >= nota[i];
				amenor = alumno[i];
			Fin Si
		FinSi
	Fin Para
	Escribir "Alumno con más nota: " amayor, ", " nmayor;
	Escribir "Alumno con menos nota: " amenor, ", " nmenor;
FinAlgoritmo