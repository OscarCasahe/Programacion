Algoritmo sin_titulo
	Definir f, tam, c como enteros
	Repetir
		Escribir "Introduce el tama�o.Mayor que 3 e impar."
		Leer tam
	Hasta Que  tam>3 y tam%2=1
	
	Para f<-0 Hasta tam-1 Hacer
		Si f%3<>0 Entonces
			Escribir "XXXXXXX"
		SiNo
			Escribir  "XX---XX"
		FinSi
	FinPara
FinAlgoritmo
