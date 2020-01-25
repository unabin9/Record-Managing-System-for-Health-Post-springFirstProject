<html>
 <link href='resources/cssmenu/styles.css' rel='stylesheet'>

  <div class="navbar">
  <a href="mainpage">Home</a>
  
</div>   
    <style>
        body{
          font-family: 'Open Sans', sans-serif;
          background:white;
            
          width:100%; 
          text-align:center;
             
        }
        p{
          font-size:12px;
          text-decoration: none;
          color:#ffffff;
        }
        h1{
          font-size:1.5em;
          color:#525252;
        }
        .box{
          background-image:white;
          width:300px;
          border-radius:6px;
          margin: 0 auto 0 auto;
          padding:0px 0px 70px 0px;
          border: #2980b9 4px solid; 
        }
        .username{
          background:#ecf0f1;
          border: #ccc 1px solid;
          border-bottom: #ccc 2px solid;
          padding: 8px;
          width:250px;
          color:black;
          margin-top:10px;
          font-size:1em;
          border-radius:4px;
        }
        .button{
          background:#2ecc71;
          width:125px;
          padding-top:5px;
          padding-bottom:5px;
          color:white;
          border-radius:4px;
          border: #27ae60 1px solid;
          margin-top:20px;
          margin-bottom:20px;
          float:left;
          margin-left:88px;
          font-weight:800;
          font-size:0.8em;
        }
        .button:hover{
          background:blue; 
        }
        .fpwd{
            color:#f1c40f;
            text-decoration: underline;
        }
       #absoluteCenteredDiv{
            position: absolute;
            top:0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
            width:400px;
            height: 300px;
            text-align: center;
       }
    </style>
<body style="background-image:url(resources/cssmenu/bg.jpg); background-position: center;
  background-repeat: no-repeat;
  background-size:cover; height:100%; width:100%;">
  <h1 style="color:#FFD700;font-style:inherit; font-size:xx-large; text-decoration: underline;">RECORD KEEPING SYSTEM</h1>
    <div id="absoluteCenteredDiv">
        <form action="receptionistLoginform" method="post">
            <div class="box">
                <h1>Receptionist Login</h1>
                <P style="color:pink; font-size:large;">${error}</P>
                <input class="username" name="loginid" type="text" placeholder="User Name">
                <input class="username" name="password" type="password" placeholder="Password">
                <div><br><button type="submit">Sign In</button></div>
             
            </div>
        </form> 
    </div>        
</body>
<html>
