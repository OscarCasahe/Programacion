Algoritmo sin_titulo
	Definir f,c,tam Como Entero
	Repetir
		Escribir "Introduce el tamaño mayor que 3 "
		Leer tam
	Hasta Que tam>3 y tam%2=1
	
	Para f<-0 Hasta tam-1 Hacer
		Si (f%2=0) Entonces
			Escribir "XXXXXX"
		SiNo
			Escribir "X----X"
		FinSi
	FinPara
FinAlgoritmo
