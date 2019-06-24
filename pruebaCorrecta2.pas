unit miLibreria;


	function sumar (i:INTEGER): INTEGER;
	var calculadora: INTEGER;
	begin
		sumar := numero + i;
	end;

	function restar (j:INTEGER): INTEGER;
	begin
		restar := numero - j;
	end;

	function multPorSumas (i:INTEGER; k:INTEGER): INTEGER;
	var j: INTEGER;
	begin
		for j := 0 to i do begin
			numero := numero + k;
		end
		multPorSumas := numero ; 
	end;

	function dividir (i:INTEGER): INTEGER;
	begin
		dividir := numero div i;
	end;

.
