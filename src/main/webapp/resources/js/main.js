/**
 * 
 */

$( "body" ).click(function( event ) {
	console.log(event);
	 var id = "#"+event.target.id;
	 console.log($(id).html());
     //$( "#log" ).html();
});
function getdocumentdata(){
	
	alert("Hello");
	var urlMark = "getDocument";
	
	$.ajax({
		url : urlMark,
		success : function(data) {
						
			$('#right').append(data);
			
		}
	});
}