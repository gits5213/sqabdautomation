<?php 
$connect=mysql_connect("localhost", "root", "");

if(!$connect)
{
	
	die("could not connect to database");
	
}

else
{
	
	echo "successfully connected";
}

//creating database

$sql=mysql_query("CREATE DATABASE registration",$connect);
if(!$sql)
{
 echo"could not create database";
 
}
else
{
 echo"successfully created";
}


//creating table

mysql_select_db("registration",$connect);
$table="CREATE TABLE booking(
Name varchar(100),
Contact int,
Email varchar(100),
Address varchar(100),
Destination varchar(100),
Railway varchar(100)


)";
$sql=mysql_query($table,$connect);
if(!$sql)
{
 echo"could not create table";
 
}
else
{
 echo"successfully created table";
}

//insert data

mysql_select_db("registration",$connect);
$table1="insert into booking(Name,Contact,Email,Address,Destination,Railway)
VALUES('$_POST[Name]','$_POST[Contact]','$_POST[Email]','$_POST[Address]','$_POST[Destination]','$_POST[Railway]')";
$sql=mysql_query($table1,$connect);
if(!$sql)
{
 echo"could not create table";
 
}
else
{
 echo"successfully created table";
}

mysql_close($connect);

?>