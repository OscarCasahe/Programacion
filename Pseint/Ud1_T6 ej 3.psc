Algoritmo ejercicio_3
	//Prepara un programa que divida dos números que introduzca el usuario. Si el segundo número es cero, 
	//se le deberá avisar y volver a pedir tantas veces como sea necesario, hasta que introduzca un número 
	//distinto de cero, momento en que se calculará y mostrará el resultado de la división.
	Definir n1, n2 como enteros
	Escribir "Introduzca el primer número"
	Leer n1
	Escribir "Introduzca el segundo número"
	Repetir
		Leer n2
		Si n2=0 Entonces
			Escribir "Introduzca un segundo número distinto a 0"
		SiNo
			Escribir "el resultado es " (n1/n2)
		FinSi
		
	Hasta Que n2<>0
	
	
FinAlgoritmo
