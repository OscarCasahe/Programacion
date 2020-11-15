Algoritmo Ejercicio_3
	//Crea un programa que genere dos números al azar entre el 0 y el 100, y pida al usuario 
	//que calcule e introduzca su suma. Si la respuesta no es correcta, deberá volver a pedirla 
	//tantas veces como sea necesario hasta que el usuario acierte.
    //Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes hacer numero <- AZAR(101)
	Definir n1 Como Entero
	Definir n2 Como Entero
	Definir resultado Como entero
	Definir intentos Como Entero
	Escribir "Realiza la suma de los siguientes números"
	intentos=1
	n1= azar(100)
	n2= azar(100)
	
	Escribir "Suma es ", n1+n2
	Escribir "Adivine la suma"
	leer resultado
	leer intentos
	Mientras resultado<>n1+n2 o intentos <5 Hacer
		Escribir "Upsss, prueba otra vez"
		Escribir "Adivine la suma"
		Leer resultado
		intentos= intentos+1
	Fin Mientras
	si resultado = n1+n2 Entonces
		Escribir "Has acertado en ",intentos, "intentos"
		
	FinSi
	Escribir "Correcto"
	

FinAlgoritmo
