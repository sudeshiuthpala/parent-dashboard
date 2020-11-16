<?php
$db_name="evan";
$mysql_username="root";
$mysql_password="";
$server_name="localhost";
$conn=mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name) ;
$User_Nic=$_POST['Nic'];
$user_field=$_POST['field'];
$User_data=$_POST['Data'];
$update_qry="UPDATE parent SET $user_field='$User_data' WHERE Nic='$User_Nic';";
if ($conn->query($update_qry)==TRUE) {
  echo "successful";
}
else {
  echo "error:".$conn->error;
}
?>
