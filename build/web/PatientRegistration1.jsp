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
          <h1 class="text-center">Register Yourself</h1>
        </div>
         <form  action="PatientRegistration" method="post">
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
                 <input type="text" name="name" id="name" required="required" class="form-control"   placeholder="Enter your Name"/>
                </div>

             <div class="form-group">
                <input type="text"  name="email" id="email" required="required" class="form-control"   placeholder="Enter your Email"/>
                </div>

              <div class="form-group">
                <input type="text"  name="address" id="address"  required="required"  class="form-control"  placeholder="Enter your Address"/>
                </div>
             <div class="form-group">
              <input type="radio" name="gender" value="M" />Male
<input type="radio" name="gender" value="F" />Female
                  
                </div>
             <div class="form-group">
             <input type="text" name="age" id="age" required = "required"  class="form-control"   placeholder="Enter your Age"/>                    
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