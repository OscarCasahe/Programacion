
	Funcion v<- multiplo(n1, n2)
		Si n1%n2=0 Entonces
			v=Verdadero 
		SiNo
			v=Falso
		FinSi
FinFuncion

Algoritmo funciones
	definir n1, n2 Como Entero
	
	
	Escribir "Introduzca un n�mero "
	Leer n1
	
	Escribir "Introduzca un n�mero m�ltiplo del anterior"
	Leer n2
	
	Si multiplo(n1, n2) Entonces
		Escribir n1," es m�ltiplo de " ,n2
	SiNo
		Escribir n1 " o es m�ltiplo de ",n2
	Fin si
FinAlgoritmo

