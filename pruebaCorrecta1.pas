program prueba1;

	var i,j:INTEGER;
	const max = 20;
	const mensaje = 'Operacion realizada';

	function dividir : INTEGER;
		begin
			i := sumar;
			dividir := i div 5;
		end;

	procedure sumar;
		const num = 123E456;
		begin
			sumar := j + num;
		end;

	begin

		i := 3;
		i := 3 * max;
		i := dividir(5);
		j := 1.23E456;
		j := sumar(5);
		j := j - -000.64E-77;
		writeln(mensaje);

	end.
