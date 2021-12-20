Algoritmo Ejercicio_11
	m = 0.0
	Escribir Sin Saltar "Introduce los minutos mensuales consumidos: ";
	Leer m;
	Si m <= 300 Entonces
		imp = m * 0.04;
	Fin Si
	Si m > 300 y m <= 500 Entonces
		imp = m * 0.03;
	FinSi
	Si m > 500 y m >= 800 Entonces
		imp = 300 * 0.03 + (m-300) * 0.02;
	FinSi
	Si m > 800 Entonces
		imp = (300 * 0.03 + (m-300) * 0.02) - (imp*1.25/100);
	FinSi
	Escribir "El coste total ha sido de " imp " Euros";
FinAlgoritmo
