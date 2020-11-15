Algoritmo sin_titulo
	Definir tam, f, c Como Entero
	Repetir
		Escribir "Introduce el tamaño. Mayor que 3 e impar"
		Leer tam
		
	Hasta Que tam>3 y tam%2=1
	Para f<-0 Hasta tam-1 Hacer
		Si (f=0) o (f=trunc(tam/2)) Entonces
			Escribir "XXXXX"
		SiNo
			Escribir "X---X"
		FinSi
	
		
	Fin Para
FinAlgoritmo
