<?php
	require "includes/db.php";

	$queryEmp= $mysqli->query("
		SELECT CONCAT(FirstName,' ', LastName) AS Fullname, Title,BirthDate, Address, HomePhone FROM employees;");

	$data= [];

	while($row=$queryEmp->fetch_assoc()){
		$data[]= $row;
	}
?>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Fancy Grid</title>
	<link href="https://cdn.fancygrid.com/fancy.min.css" rel="stylesheet">
	<style>
		a[href= 'http://www.fancygrid.com']{
			display: none !important;
		}
	</style> 
</head>
<body>
	<h1>FancyGrid</h1>
	<div id="grid"></div>

	<script src="https://cdn.fancygrid.com/fancy.min.js"></script>
	
	<script>
		var data= <?php echo json_encode($data); ?>

		document.addEventListener('DOMContentLoaded',function(){
			new FancyGrid({
				renderTo: 'grid',
				height: 'fit',
				theme: 'bootstrap',
				data: data,
				nativeScroller: true, //Para hacer scroll en fono
				selModel: 'cell', //click en un elemento
				cellTrackOver: true, //pintar filas al pasar el mouse
				defaults: {
					sortable: true,
					resizable: true
				},
				columns: [
					{
						index: 'Fullname',
						title: 'Nombre Completo',
						flex: 1, //Peso de la columna
						filter: {header: true}
					},
					{
						index: 'Title',
						title: 'Titulo',
						flex: 1, //Peso de la columna
						filter: {header: true}
					},
					{
						index: 'BirthDate',
						title: 'Fecha Nacimiento',
						flex: 1, //Peso de la columna
						filter: {header: true}
					},
					{
						index: 'Address',
						title: 'Direccion',
						flex: 1, //Peso de la columna
						filter: {header: true}
					},
					{
						index: 'HomePhone',
						title: 'Numero de casa',
						flex: 1, //Peso de la columna
						filter: {header: true}
					},

				]
			});
		});

	</script>

</body>
</html>
