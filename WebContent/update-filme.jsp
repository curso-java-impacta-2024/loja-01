<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href='https://fonts.googleapis.com/css?family=Abril+Fatface' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="./css/update.css">

<title>UPDATE FILME</title>

</head>
<body>
	
	<section id="container">

<div id="pwdError">
  <p>Password is too short!</p>
  <img src="http://www.airrickdunfield.com/media/planets/pwdError.svg" alt="" />
</div>
  
<div id="emlError">
  <p>Not a valid email!</p>
  <img src="http://www.airrickdunfield.com/media/planets/pwdError.svg" alt="" />
</div>
  
 <div id="typeError">
  <p>Passwords don't match!</p>
  <img src="http://www.airrickdunfield.com/media/planets/pwdError.svg" alt="" />
</div>
  
 <div id="fNameError">
  <p>Enter a first name!</p>
  <img src="http://www.airrickdunfield.com/media/planets/pwdError.svg" alt="" />
</div>
  
<div id="LNameError">
  <p>Enter a last name!</p>
  <img src="http://www.airrickdunfield.com/media/planets/pwdError.svg" alt="" />
</div>

  <section>
    <article>
      <h1>Sign Up</h1>
      <form action="#">

        <div>
          <label for="firstName">First Name:</label>
          <input type="text" name="firstName" id="firstName" placeholder="John" />
        </div>

         <div>
          <label for="lastName">Last Name:</label>
          <input type="text" name="lastName" id="lastName" placeholder="Doe" />
        </div>
        
        <div>
          <label for="email">Email:</label>
          <input type="text" name="email" id="email" placeholder="address@example.com" />
        </div>
        
        <div>
          <label for="password">Password:</label>
          <input type="password" name="password" id="password" placeholder="must be 8 characters" />
        </div>

        <div>
          <label for="rPassword">Retype Password:</label>
          <input type="password" name="rPassword" id="rPassword" placeholder="********" />
        </div>
        
        <div id="submit">
          <input type="submit" value="Submit" id="submit" />
        </div>
      </form>  
    </article>
  </section>
  
  
</section>
	
</body>
</html>