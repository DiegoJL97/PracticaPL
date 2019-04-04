program prueba3;

var num,i,j:INTEGER;

begin

	write('Introduzca un numero: ');
	readln(num);

	while num < 5 do
	begin
	write('¡Hola desde el bucle while!');
	num := num + 1;
	end

	{Error: debería ser una asignación en lugar de una comparación}
	for i = 0 to 10 do
	begin
	write('¡Hola desde el bucle for!');
	end

	repeat
	begin
	write('¡Hola desde el bucle repeat!');
	j := j + 1;
	end
	until j = 3;

end.
