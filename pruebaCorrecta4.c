#define mensaje 'Operacion realizada'
#define num 123E456

void sumar (int numero) {
	numero = numero  + num  + 1;
}

int restar (int i) {
	return i  - 234;
}

void main (void){
	int contador,j;
	write ('Introduzca un numero: ');
	readln (contador );
	while (num  < 10){
		if (num  % 2 == 0) {
			sumar (num );
		} else{
			restar (num );
		}
		contador = contador  + 1;
	}
	writeln (mensaje );
}

