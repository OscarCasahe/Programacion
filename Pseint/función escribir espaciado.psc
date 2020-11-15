Funcion c<- espaciado ( cad )
	definir pos como entero	
	c=""
	Para pos<-1 hasta Longitud(cad) Hacer
		c = c+ Subcadena(cad,pos,pos) + "-"
	FinPara
	

fin funcion

Algoritmo escribir_espaciado
	Definir cad Como Caracter	
	
	Escribir  "Introduzca un texto"
	Leer cad
	
	Escribir espaciado(cad)
FinAlgoritmo
