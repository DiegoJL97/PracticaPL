
void main (void){
	int num,i,j;
	write ('Introduzca un numero: ');
	readln (num );
	while (num  < 5){
		write ('¡Hola desde el bucle while!');
		num = num  + 1;
	}
	for(i=0;i<10+1;i=i+1){
		write ('¡Hola desde el bucle for!');
	}
	do {
		write ('¡Hola desde el bucle repeat!');
		j = j  + 1;
	} until (j  == 3)
}

