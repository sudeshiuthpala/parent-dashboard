<?php
$db_name="evan";
$mysql_username="root";
$mysql_password="";
$server_name="localhost";
$conn=mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name) ;
$User_childId=$_POST["childId"];
$delete_qry="DELETE FROM child WHERE childId='$User_childId';";
if ($conn->query($delete_qry)==TRUE) {
  echo "successful";
}
else {
  echo "error:".$conn->error;
}
?>
