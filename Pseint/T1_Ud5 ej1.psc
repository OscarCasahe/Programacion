Algoritmo ejercicio_1_UD5
	//Crea un programa que pida al usuario una contrase�a, de forma repetitiva mientras que no introduzca "1234". 
	//Cuando finalmente escriba la contrase�a correcta, se le dir� "Bienvenido" y terminar� el programa.
	Definir password Como real
	Escribir "Introduzca la contrase�a"
	leer password
	Mientras password <> 1234 Hacer
		Escribir "Contrase�a incorrecta int�ntelo de nuevo"
		Leer password
		
		Escribir "Ha entrado usted en el sistema"
	Fin Mientras
FinAlgoritmo



