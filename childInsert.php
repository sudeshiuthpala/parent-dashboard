<?php
$db_name="evan";
$mysql_username="root";
$mysql_password="";
$server_name="localhost";
$conn=mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name) ;
$User_childId=$_POST["childId"];
$user_fname=$_POST["FName"];
$user_mname=$_POST["MName"];
$user_lname=$_POST["LName"];
$user_gender=$_POST["gender"];
$user_dob=$_POST["dob"];
$user_school=$_POST["school"];
$User_regDate=$_POST["regDate"];
$insert_qry="INSERT into child values ('$User_childId','$user_fname','$user_mname','$user_lname','$user_gender','$user_dob','$user_school','$User_regDate');";
if ($conn->query($insert_qry)==TRUE) {
  echo "successful";
}
else {
  echo "error:".$conn->error;
}
?>
