<?php
$db_name="evan";
$mysql_username="root";
$mysql_password="";
$server_name="localhost";
$conn=mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name) ;
$childId=$_POST["childId"];
$field=$_POST["field"];
$data=$_POST["Data"];
$update_qry="UPDATE child SET $field='$data' WHERE childId='$childId';";
if ($conn->query($update_qry)==TRUE) {
  echo "successful";
}
else {
  echo "error:".$conn->error;
}
?>
