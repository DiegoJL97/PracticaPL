program test;

var j:INTEGER ; 
const mensaje = 'Operacion realizada';

procedure sumar; 
const num = 123E456;
begin 
j := j + num; 
end;

begin 

j := 1.23E456;
j := sumar(5);
j := j - -000.64E-77;
writeln(mensaje);

end.
