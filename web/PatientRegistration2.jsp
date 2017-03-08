<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<title> Smart Health App</title>
	<meta name="description" content="Smart Health App">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	
</head>
	
<script>
    function myFunction() {
        var password1 = document.getElementById("password").value;
        var password2 = document.getElementById("confirmpassword").value;
        if (password1 != password2) {
            //alert("Passwords Do not match");
            document.getElementById("password").style.borderColor = "#E34234";
            document.getElementById("confirmpassword").style.borderColor = "#E34234";
        }
        else {
            //alert("Passwords Match!!!");
            document.getElementById("patientReg").submit();
        }
    }
</script>


	
<body>

  		<nav class= "navbar navbar-inverse navbar-fixed-top" id="my-navbar">
  			
  		</nav> 

  		

  		<div class="jumbotron">
			<div class="container text-center" style="max-height: 100px">
				<h1>Disease Prediction</h1>
				<p> Using Data Mining</p>
			</div>
		</div>


 <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
          <h1 class="text-center">Enter your LogIn Details</h1>
        </div>
        <form class="form-horizontal" id="patientReg" method="post" action="PatientLoginReg" onsubmit="myFunction()">
             <p style="color: red">
                                    <%
                                        String message=request.getParameter("message");
                                        if(message!=null)
                                        {%>
                                        <%=message%>
                                     <% }
                                    %>
                                </p>
         <div class="modal-body">
             <div class="form-group">
                 <input type="text" name="name" id="name" required="required" class="form-control"   placeholder="Enter your UserName"/>
                </div>

             <div class="form-group">
                <input type="password"  name="password" id="password" required="required" class="form-control"   placeholder="Enter your password"/>
                </div>

            <div class="form-group">
                <input type="password"  name="confirmpassword" id="confirmpassword" required="required" class="form-control"   placeholder="Re-Enter the password"/>
                </div>  
             
             
             <div class="form-group">
              
                 <input type="submit" class="btn btn-block btn-lg btn-primary" value="Register"/>
                
             </div>
         </div>
                          </form>

    </div>
 </div>

  		
    <script src="https://code.jquery.com/jquery-3.1.1.js"> </script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"> </script>
</body>	
</html> 




