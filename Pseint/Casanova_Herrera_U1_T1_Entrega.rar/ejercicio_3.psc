Algoritmo sin_titulo
	//EJERCICIO 3 (ej3.psc)
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, 
	//que debe ser un n�mero entero impar mayor o igual que 5. Si el n�mero introducido no es correcto, el programa deber� 
	//mostrar un mensaje de error y volver a solicitarlo. A continuaci�n se muestran algunos ejemplos.
	//La anchura de la figura siempre ser� de 6 caracteres.
	
	Definir f,tam Como Entero
	
	Escribir "Introduce el tama�o mayor o igual que 5 "
	leer tam
	
	Si tam<5
		Repetir
			Escribir "El n�mero no es mayor o igual que 5"
			Leer tam
		Hasta Que tam>=5 y tam%2=1
		
	SiNo 
		Escribir "Su figura es la siguiente"
	FinSi
	
	Para f<-0 Hasta tam-1 Hacer
		Si (f%2=0) Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M----M"
		FinSi
	FinPara

FinAlgoritmo
