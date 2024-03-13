<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%--<%@ taglib prefix="s" uri="/struts-tags"%>--%>

<%--
<%@page import="model.UserData"%>
<jsp:useBean id="userData" class="model.UserData" />
--%>

<%--
    Object sslogin = session.getAttribute("ss_login");
    //UserData sspfUser = (UserData) session.getAttribute("pfUser");
--%>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ASRM-API</title>
        <link rel="icon" href="<%=request.getContextPath()%>/images/iconweb.png" type="image/png">
        <link type="text/css" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link type="text/css" href="<%=request.getContextPath()%>/css/theme.css" rel="stylesheet">
        <link type="text/css" href="<%=request.getContextPath()%>/images/icons/css/font-awesome.css" rel="stylesheet">
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600'
              rel='stylesheet'>
    </head>

    <style>
        .modal-loader {
            display: block; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(0,0,0,0.2); /* Black w/ opacity */
        }

        .loader {
            position: fixed;
            left: 45%;
            top: 35%;
            margin-top: -50px;
            margin-left: -50px;
            border: 16px solid #f3f3f3;
            border-radius: 50%;
            border-top: 16px solid #bb161c;
            border-bottom: 16px solid #bb161c;
            width: 200px;
            height: 200px;
            -webkit-animation: spin 2s linear infinite;
            animation: spin 2s linear infinite;
        }

        @-webkit-keyframes spin {
            0% { -webkit-transform: rotate(0deg); }
            100% { -webkit-transform: rotate(360deg); }
        }

        @keyframes spin {
            0% { transform: rotate(0deg); }
            100% { transform: rotate(360deg); }
        }
        
        /* Add animation to "page content" */
    .animate-bottom {
        position: relative;
        -webkit-animation-name: animatebottom;
        -webkit-animation-duration: 1s;
        animation-name: animatebottom;
        animation-duration: 1s
    }

    .animate-bottom-2 {
        position: relative;
        -webkit-animation-name: animatebottom;
        -webkit-animation-duration: 1s;
        animation-name: animatebottom;
        animation-duration: 1.3s
    }

    @-webkit-keyframes animatebottom {
        from { bottom:-100px; opacity:0 } 
        to { bottom:0px; opacity:1 }
    }

    @keyframes animatebottom { 
        from{ bottom:-1000px; opacity:0 } 
        to{ bottom:0; opacity:1 }
    }
    
    .animate-top {
        position: relative;
        -webkit-animation-name: animatetop;
        -webkit-animation-duration: 1s;
        animation-name: animatetop;
        animation-duration: 1s
    }

    @-webkit-keyframes animatetop {
        from { bottom:-100px; opacity:0 } 
        to { bottom:0px; opacity:1 }
    }

    @keyframes animatetop { 
        from{ bottom:1000px; opacity:0 } 
        to{ bottom:0; opacity:1 }
    }
    </style>

    <body>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                        <i class="icon-reorder shaded"></i></a>
                    <a class="brand" href="<%=request.getContextPath()%>">
                        <img src="<%=request.getContextPath()%>/images/logo_true.png" class="nav-logo"/> ASRM-API</a>
                    <!-- /.nav-collapse -->
                    <%
/*
                        if (sslogin != null) {
                            String img = "";
                            if (sspfUser.getImage().equals("") || sspfUser.getImage() == null) {
                                img = request.getContextPath() + "/images/user.png";
                            } else {
                                img = sspfUser.getImage();
                            }
                            out.print("<ul class='nav pull-right'>"
                                    + "<li class='nav-user dropdown'>"
                                    + "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>"
                                    + "<img src='" + img + "' class='nav-avatar'>"
                                    + " " + sspfUser.getFirstname() + " "
                                    + "<b class='caret'></b>"
                                    + "</a>"
                                    + "<ul class='dropdown-menu'>"
                                    //                                    + "<li><a href=" + request.getContextPath() + ">Your Profile</a></li>"
                                    //                                    + "<li class='divider'></li>"
                                    + "<li><a href='" + request.getContextPath() + "/logout.jsp'>Logout</a></li>"
                                    + "</ul>"
                                    + "</li>"
                                    + "</ul>");
                        }
*/
                    %>

                </div>
            </div>
            <!-- /navbar-inner -->
        </div>
        <!-- /navbar -->