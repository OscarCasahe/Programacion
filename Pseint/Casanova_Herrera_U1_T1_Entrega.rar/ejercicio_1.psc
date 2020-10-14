Algoritmo ejercicio_1
	
	Definir precioFinal, precio100, precioEntre100y1000, preciomayora1000, unidades Como Entero
	
	
	Escribir "Introduzca la cantidad de unidades:"
	leer unidades
	precioFinal=0
	precio100=1
	precioEntre100y1000=1
	preciomayora1000=1
	
	Si unidades>0 y unidades<=100 Entonces
		Repetir
			precio100=pedidos*5.23
			Escribir "El precio del pedido es: " precio100 "€"
		Hasta Que pedidos<100
	FinSi
	
		Si unidades>100 y unidades<1000 Entonces
			Repetir
				precio100=523
				precioEntre100y1000=unidades*4.16
				Escribir "El precio del pedido es:" precioFinal-preciomayora1000 "€"
			Hasta Que unidades<=1000
		FinSi
		
			Si unidades>1000 Entonces
				Repetir
					preciomayora1000=unidades*2.61
					Escribir "El precio del pedido es:" precioFinal "€"
				Hasta Que unidades>1000
				
			FinSi
			
		

			precioFinal= precio100+precioEntre100y1000+preciomayora1000

	
	
	
	
FinAlgoritmo
