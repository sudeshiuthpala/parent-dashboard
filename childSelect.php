<?php
$db_name="evan";
$mysql_username="root";
$mysql_password="";
$server_name="localhost";
$conn=mysqli_connect($server_name,$mysql_username,$mysql_password,$db_name) ;
$User_childId=$_POST['childId'];
$qry="SELECT childId,fname,mname,lname,gender,dob,regDate  FROM child WHERE childId='$User_childId';";
$result = mysqli_query($conn, $qry);
if (mysqli_num_rows($result) > 0) {
  // output data of each row
  while($row = mysqli_fetch_assoc($result)) {
    echo "  Child ID: " . $row["childId"]." | First Name: " . $row["fname"]. " | Middle Name: " . $row["mname"]. " | Last Name: " . $row["lname"].
    " | Gender: " . $row["gender"]." | Date of Birth: " . $row["dob"]." | Registered Date: " . $row["regDate"] ;
  }
} else {
  echo "Not Found !";
}
