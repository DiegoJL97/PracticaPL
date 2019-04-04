program prueba4;

var contador,j:INTEGER;
const mensaje = 'Operacion realizada';

procedure sumar(numero:INTEGER);
const num = 123E456;
begin
	numero := numero + num;
end;

function restar (i:INTEGER): INTEGER;
begin
	i := i - 234;
end;

begin

	write('Introduzca un numero: ');
	readln(contador);
	while num < 10 do
	begin
		if num mod 2 = 0 then
		begin
			sumar(num);
		end
		else
		begin
			restar(num);
		end
		contador := contador + 1;
	end
	writeln(mensaje);

end.
