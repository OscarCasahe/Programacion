Funcion linea <- escribircentrado ( cad)
	definir tam Como Entero
	tam = Longitud(cad)
	esp = trunc ((80-tam)/2)
	linea=""
	para contador<-1 hasta esp Hacer
		linea=Concatenar(linea,"-")	
	FinPara
    linea = linea + cad + linea
Fin funcion

Algoritmo centrado
	definir tex como  caracteres
	Escribir "Introduce la cadena"
	Leer tex
	
	Escribir escribircentrado(tex)
FinAlgoritmo


		