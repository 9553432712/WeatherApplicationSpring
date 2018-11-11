<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>

<body>
<h2>Weather Report</h2>

<form name="search-form" id="search-form">
	<input type="text" name="city" id="city">
	<input type="button" value="Get" id="Get">
</form>

<div id="result" ></div>


<script>
	jQuery(document).ready(function($) {

	  	$("#Get").click(function(event) {
			
			if($("#city").val().trim() == '')
				{
					alert("Enter city..");
					$("#city").focus();
				}
			else
				{
					searchViaAjax();
				}
		});

	
 
	function searchViaAjax() {
		alert("<%=request.getContextPath()%>");
		 $("#result").html( 'his' );
		
		
		var request = $.ajax({
			  url: "http://localhost:8080/WeatherApplicationSpring/search/getSearchResult/"+$("#city").val(),
			  type: "POST",
			 // data: {id : menuId},
			 // dataType: "JSON"
			});

			request.done(function(msg) {
			  $("#result").html(msg);
			});

			request.fail(function(jqXHR, textStatus) {
			  alert( "Request failed: " + textStatus );
			});

	}
	});
</script>

</body>
</html>
