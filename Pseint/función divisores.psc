Funcion d<- numDivisores ( n )
	
	definir c Como Entero
	para c<-1 Hasta n Hacer
		Si n%c = 0 Entonces
			Escribir c " es divisor"
			d= d +1
		FinSi
	FinPara
FinFuncion


Algoritmo divisores

	Definir num Como Entero
	Definir c Como Entero
	
	Repetir
		
		Escribir "Introduzca un número"
		Leer num

	Hasta Que num >0
	
	c= numDivisores (num)

	Escribir num " tiene " c
	
FinAlgoritmo