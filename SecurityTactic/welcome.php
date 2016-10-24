<?php
   include('session.php');
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
	  <?php
	  if ($login_session == "admin")
	  echo "<h2><a href = 'addUsers.php'>Add users</a></h2>"
	  ?>
   </body>
   
</html>