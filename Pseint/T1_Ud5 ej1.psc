Algoritmo ejercicio_1_UD5
	//Crea un programa que pida al usuario una contraseña, de forma repetitiva mientras que no introduzca "1234". 
	//Cuando finalmente escriba la contraseña correcta, se le dirá "Bienvenido" y terminará el programa.
	Definir password Como real
	Escribir "Introduzca la contraseña"
	leer password
	Mientras password <> 1234 Hacer
		Escribir "Contraseña incorrecta inténtelo de nuevo"
		Leer password
		
		Escribir "Ha entrado usted en el sistema"
	Fin Mientras
FinAlgoritmo



