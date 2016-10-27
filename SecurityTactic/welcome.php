<?php
   include('session.php');
   
   $page = $_SERVER['PHP_SELF'];
   $sec = "59";
   header("Refresh: $sec; url=$page");
   echo session_id();
   $role =  $_SESSION['role'];
   echo nl2br("\n role type: ") ;
   echo $role;
    if($_SERVER["REQUEST_METHOD"] == "POST") {
         if ($role == "admin")
         header("location: addUsers.php");
		 else echo  nl2br("\nYou are not authorized to perform this activity ");
   }
   
   if (!isset($_SESSION['login_user'])) {
        echo "Please Login again";
        echo "<a href='http://localhost/SecurityTactic/login.php'>Click Here to Login</a>";
    }
    else {
        $now = time(); // Checking the time now when home page starts.
        if ($now > $_SESSION['expire']) {
            session_destroy();
            header ("location:expire.php");
        }
        else { //Starting this else one [else1]
?>

   <html>
   
   <head>
      <title>Welcome </title>
   </head>
   
   <body>
   
      <h1>Welcome <?php echo $login_session;
	
	  ?></h1> 
      <h2><a href = "logout.php">Sign Out</a></h2>
	  <!-- adding some content for all users -->
	  <h3>Status of Self driving car components</h3>
	  <!-- adding some content for admin only -->
	  <div style = "margin:30px">  
	   <form action = "" method = "post">
		  <input type = "submit" value = " Add users"/><br />
	   </form> 
	   <!-- <div style = "font-size:11px; color:#cc0000; margin-top:10px"><?php echo $error; ?></div>	 -->
      </div>
   </body>
   
</html>
<?php
        }
    }
?>
