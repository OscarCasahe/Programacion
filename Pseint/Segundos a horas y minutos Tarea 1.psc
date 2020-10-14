Algoritmo Segundo_en_horas_y_minutos
	Definir seg Como Entero
	Definir h Como Entero
	definir minutos Como Entero
	Escribir "Introduzca el número de segundos"
	Leer seg
	h<- trunc(seg/3600)
	minutos<- trunc((seg - (h*3600))/60)
	Escribir seg " segundos son " h " horas y " minutos " minutos"
FinAlgoritmo
