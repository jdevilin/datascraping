<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
	
	<script src="resources/js/jquery-1.7.2.min.js" type="text/javascript"></script>
     <script src="resources/js/main.js" type="text/javascript"></script>
</head>
<body>
<div class="wrapper">
 <div id ="left" style="width:100% ;border: 1px solid; float: left;text-align: center;">
  
   <table>
   
    <tr><input type="text" width="100%"/>  </tr>
    <tr><input type="submit" onclick="getdocumentdata();"/> </tr>
   </table>
 
  </div>
 
 <div id ="right" style="width:100% ;border: 1px solid ; float:right;" >
 Indiaaaaaaaaa
 </div>
</div>
<script>
$( "body" ).click(function( event ) {
	console.log(event);
	 var id = "#"+event.target.id;
	 console.log($(id).html());
     //$( "#log" ).html();
});
</script>
</body>
</html>
