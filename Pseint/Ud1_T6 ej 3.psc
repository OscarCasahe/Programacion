Algoritmo ejercicio_3
	//Prepara un programa que divida dos n�meros que introduzca el usuario. Si el segundo n�mero es cero, 
	//se le deber� avisar y volver a pedir tantas veces como sea necesario, hasta que introduzca un n�mero 
	//distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.
	Definir n1, n2 como enteros
	Escribir "Introduzca el primer n�mero"
	Leer n1
	Escribir "Introduzca el segundo n�mero"
	Repetir
		Leer n2
		Si n2=0 Entonces
			Escribir "Introduzca un segundo n�mero distinto a 0"
		SiNo
			Escribir "el resultado es " (n1/n2)
		FinSi
		
	Hasta Que n2<>0
	
	
FinAlgoritmo
