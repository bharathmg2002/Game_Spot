<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <title>Administrator</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Calibri;
            overflow: hidden; /* Prevent default scrolling */
        }

        .background-container {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            overflow: hidden;
        }

        .header {
            position: absolute;
            top: 50px;
            left: 50%;
            transform: translateX(-50%);
            color: white;
            z-index: 2;
        }

        .main {
            position: relative;
            width: 100%;
            height: 100%;
            opacity: 0.8;
        }

        .carousel {
            width: 100%;
            height: 100%;
        }

        .carousel-inner {
            width: 100%;
            height: 100%;
        }

        .carousel-inner img {
            width: 100%;
            height: 100%;
        }

        input[type="submit"] {
            padding: 40px 50px;
            color: green;
        }

        .button-link1 {
            position: absolute;
            top: 40%;
            left: 25%;
            z-index: 2;
        }

        .button-link2 {
            position: absolute;
            top: 40%;
            right: 25%;
            z-index: 2;
        }
    </style>
    <%
    
	 String uname = (String) session.getAttribute("username");
    if (null == uname) {
    session.setAttribute("errorMessage", "Login Failed ");
    response.sendRedirect("Admin.jsp");
    }
 %>
</head>
<body>
    <div class="background-container">
        <div class="header">
            <h1>Welcome to Administrator Dashboard</h1>
        </div>
        <div class="content">
            <div class="button-link1">
                <a href="displayGameHistory.jsp"><input type="submit" value="Games List" class="add-button" /></a>
            </div>
            <div class="button-link2">
                <a href="displayUserHistory.jsp"><input type="submit" value="Registered Users List" class="add-button" /></a>
            </div>
            <div class="main">
                <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="images/game25_1.jpg" alt="Los Angeles">
                        </div>
                        <div class="item">
                            <img src="images/mainSlideShow.jpg" alt="Chicago">
                        </div>
                        <div class="item">
                            <img src="images/game23.jpg" alt="New york">
                        </div>
                        <div class="item">
                            <img src="images/game24_11.jpg" alt="New york">
                        </div>
                    </div>
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <!-- Add this script at the end of the <body> section -->
    <script>
        $(document).ready(function () {
            // Initialize the carousel
            $('#myCarousel').carousel();

            // Start the automatic slideshow
            $('#myCarousel').carousel('cycle');
        });
    </script>
</body>
</html>
