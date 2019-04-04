unit miLibreria;

	var numero: INTEGER ;

	function sumar (i:INTEGER ): INTEGER ;
	begin
		numero := numero + i;
	end;

	function restar (j:INTEGER ): INTEGER ;
	begin
		numero := numero - i;
	{Error: Falta un punto y coma en el end de esta función}
	end

	function multPorSumas (i,k:INTEGER ): INTEGER ;
	var j: INTEGER ;
	begin
		for j := 0 to i do begin
			numero := numero + k;
		end
	end;

	function dividir (i:INTEGER ): INTEGER ;
	begin
		numero := numero div i;
	end;

.
