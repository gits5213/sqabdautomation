<body>


<h2> Ticket Price </h2>
<style>
body {
    background-color: lightblue;
}


table {
	
    border-collapse: collapse;
    width: 50%;
}

th, td {
    text-align: left;
    padding: 10px;
}

tr:nth-child(even){background-color: lightgreen}



</style>





</body>




<?php
$cn=mysql_connect("127.0.0.1","root","");

mysql_select_db("station",$cn);


$q="select * from cost ";
$mq=mysql_query($q,$cn);


echo"<table>";
echo"<tr>";
echo"<th>Route_name</th>";
echo"<th>ticket_price</th>";


echo"</tr>";

while($row=mysql_fetch_array($mq))
{
 echo"<tr>";
 echo"<td>".$row['Route_name']."</td>";
 echo"<td>".$row['ticket_price']."</td>";

 
 
 echo"</tr>";
}
?>