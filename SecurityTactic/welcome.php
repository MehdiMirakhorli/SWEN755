<?php
   include('session.php');
   
   $page = $_SERVER['PHP_SELF'];
   $sec = "2";
   header("Refresh: $sec; url=$page");
   echo "BLABLA";
   
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

            <!-- From here all HTML coding can be done -->
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
	  <?php
	  if ($login_session == "admin")
	  echo "<h2><a href = 'addUsers.php'>Add users</a></h2>"
	  ?>
   </body>
   
</html>
<?php
        }
    }
?>
