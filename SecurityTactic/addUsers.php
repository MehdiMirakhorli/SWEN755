<?php
   include('session.php');
?>
<html>

   <head>
      <title>Welcome </title>
   </head>
   
   <body>
      <h1>Welcome <?php echo $login_session; ?></h1> 
      
	  <!-- adding some content for admin only -->
	  <h2>Add functionality for adding new users</h2>
	  <h2><a href = "logout.php">Sign Out</a></h2>
   </body>
   
</html>