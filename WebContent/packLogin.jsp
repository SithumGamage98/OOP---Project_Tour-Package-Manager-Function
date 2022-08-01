<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<style> 


header>.container{
    height: 23vh;
    background: rgba(0,0,0,0.7);
}

.loginButton{
    float: right;
    height:5vh;
    margin: 20px 20px;
}

.button{
    font-size: 14px;
    border: 2px solid #ff9d00;
    border-radius: 20px;
    padding:5px 20px;
    color: #ff9d00;
    transition: 0.5s ease;
}
.button:hover{
    background-color:#ff9d00;
    color: #fff;
}

.menu{
    position: relative;
    height: 7vh;
    margin-right: 150px;
    margin-top: 80px;
    font-size: 18px;
    float: right;
    list-style-type: none;  
}
ul li.nav{
    display: inline-block;
}

ul li.nav a{
    text-decoration: none;
    color: #fff;
    font-weight: bold;
    padding: 4px 30px;
    border-radius: 20px;
    transition: 0.5s ease;
}    

ul li.nav a:hover{
    background-color:#ff9d00;
    color:#fff;
}
ul li .active {
    background-color: #ff9d00;
    color: #fff;
}








.contents{
   width: 100%;
   margin: auto;
}

.navigationBar{
	background: #aeb6bf;
    display: flex;
    align-items: center;
    padding: 20px;
}	
.navigationBar{
	background: #aeb6bf;
    display: flex;
    align-items: center;
    padding: 20px;
}	
	
nav{
    flex: 1;
    text-align: right;
}

nav ul{
    display: inline-block;
    list-style-type: none;
}

nav ul li{
    display: inline-block;
    margin-right: 20px;
	font-family: 'Montserrat', sans-serif;
}

a{
   text-decoration: none;
   color: #000000;
}
p{
   color: #000000;
}







.button1 {
  background-color: green;
  border: 1;
  color: black;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  font-weight: bold;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}


.frm{

position:absolute;
top:200px;
width:600px;'


}




.button {
  background-color: #000000;
  border: 1;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}



body{
			font-family: Hind SemiBold;
			background-color:#633974 ;
			
		    }








input[type=text] {
  
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px white;
  border-radius: 4px;
}





.footerContent{
    position: relative;
    top:400px;
    background:rgba(71, 71, 71, 0.589);
    height: 160px;
   
}
.socialTags{
   
    margin: 50px 530px;
    height: 40px;
}
.socialmedia a{
    display: inline-block;    
    height: 45px;
    width: 45px;
   
    background-color: rgba(15, 14, 14, 0.719);
    margin: 30px 20px 20px 0;
    text-align:center;
    line-height:30px;
    border-radius: 50%;
    color: #ffffff;
    transition: all 0.5s ease;
    
}
.socialmedia a i{
    margin: 15px;
    color:#ffffff;
}
.socialmedia a:hover{
    color:#ffffff;
    background-color:#ff9d00;
}
.footer-about{
    position: relative;
}
.contact{
    position: relative;
    top:-30px;
    margin-bottom: 10px;
    margin-left: 70px;
    color:0000000;
}
h4{
    font-family: 'Segoe UI', Tahoma, Verdana, sans-serif;
}
.text{
    font-family: 'Segoe UI', Tahoma, Verdana, sans-serif;
}
.footerBottom{
    color: #F1C40F;
    background-color: black;
    font-size:12.5px;
    text-align:center;
}






</style>




<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header>
            <div class="container">
                <div class="loginButton">
                    <a href="login.jsp" class="button">Login</a>
                    <a href="register.html" class="button">Register</a>
                </div>

                    <img class="logo" src="img/logonew.jpg">

                <ul class="menu">
                    <li class="nav"><a class="active" href="homePrac.jsp">Home</a></li>
                 
              
                </ul>
            </div>
        </header>

     









<div class="frm">
  <form action="log" method="post">
  
     <lable for="pidd"><b>01)Enter Package ID Here</b></lable>
     <input type="text" name="pid"><br>
     
     <lable for="pnn"><b>02)Enter Package Name Here</b></lable>
    <input type="text" name="pn"><br>
     
     <input type="submit" name="Submit" value="DISPLAY PACKAGE DETAILS" class="button1">
  
  </form>



<a href="Admin.jsp">
<input type="button" name="update" value="Back to admin's page" class="button"><br>
</a>

</div>




  <footer>
          <div class="footerContent">
            <div class="socialTags">
                <div class="socialmedia">
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-youtube"></i></a>
                </div>
            </div>
            <div class="footer-about">
                <div class="contact">
                    <h4>Contact Us</h4>
                    <div class="phone">
                        <span class="fas fa-phone"></span>
                        <span class="text">+94 71 258 8935</span>
                    </div>
                    <div class="email">
                        <span class="fas fa-envelope"></span>
                        <span class="text">vistlanka99@gmail.com</span>
                    </div>
                    
                </div>
            </div>

            <div class="footerBottom">
                &copy; UMawards.com (All Rights Reserved) | Designed by MLB02.01.09 team
            </div>    
          </div> 
        </footer>





</body>
</html>