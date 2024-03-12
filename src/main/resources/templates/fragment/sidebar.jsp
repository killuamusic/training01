<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="span3">
    <div class="sidebar">
        <!--no.1-->
        <ul class="widget widget-menu unstyled">
            <li><a href="<%=request.getContextPath()%>/asrmapi.jsp"><i class="menu-icon icon-cog"></i>ASRM API</a></li>
        </ul>
        
        <!--no.2-->
        <ul class="widget widget-menu unstyled">
            <li><a href="<%=request.getContextPath()%>/msisdn_jsp/msisdnall.jsp"><i class="menu-icon icon-desktop"></i>MSISDN </a></li>
            <li><a href="<%=request.getContextPath()%>/sim_jsp/simall.jsp"><i class="menu-icon icon-desktop"></i>SIM </a></li>
        </ul>
        
        <!--no.3-->
        <ul class="widget widget-menu unstyled">
            <li>
                <a class="collapsed" data-toggle="collapse" href="#msisdn">
                    <i class="menu-icon icon-tasks"></i><i class="icon-chevron-down pull-right"></i><i class="icon-chevron-up pull-right"></i>
                    MSISDN 
                </a>
                <ul id="msisdn" class="collapse unstyled">
                    <li><a href="<%=request.getContextPath()%>/msisdn_jsp/msisdnlifecycle.jsp"><i class="menu-icon icon-repeat"></i>MSISDN Life Cycle </a></li>
                    <li><a href="<%=request.getContextPath()%>/msisdn_jsp/msisdnapi.jsp"><i class="menu-icon icon-cogs"></i>MSISDN API </a></li>
                    <li><a href="<%=request.getContextPath()%>/msisdn_jsp/msisdnmnp.jsp"><i class="menu-icon icon-cogs"></i>MSISDN MNP </a></li>
                </ul>
            </li>
            
            <li>
                <a class="collapsed" data-toggle="collapse" href="#sim">
                    <i class="menu-icon icon-tasks"></i><i class="icon-chevron-down pull-right"></i><i class="icon-chevron-up pull-right"></i>
                    SIM 
                </a>
                <ul id="sim" class="collapse unstyled">
                    <li><a href="<%=request.getContextPath()%>/sim_jsp/simlifecycle.jsp"><i class="menu-icon icon-repeat"></i>SIM Life Cycle </a></li>
                    <li><a href="<%=request.getContextPath()%>/sim_jsp/simself.jsp"><i class="menu-icon icon-cogs"></i>SIM Self </a></li>
                    <li><a href="<%=request.getContextPath()%>/sim_jsp/simpair.jsp"><i class="menu-icon icon-cogs"></i>SIM Pair </a></li>
                </ul>
            </li>
        </ul>

        <!--no.4-->
        <ul class="widget widget-menu unstyled">							
            <li>
                <a href="<%=request.getContextPath() + "/logout.jsp"%>">
                    <i class="menu-icon icon-signout"></i>
                    Logout
                </a>
            </li>
        </ul>

        <!--no.5-->
        <ul class="widget widget-menu unstyled">
            <li>
                <a class="collapsed" data-toggle="collapse" href="#mor">
                    <i class="menu-icon icon-cog"></i>
                    <i class="icon-chevron-down pull-right"></i>
                    <i class="icon-chevron-up pull-right"></i>
                    More Pages 
                </a>
                <ul id="mor" class="collapse unstyled">
                    <li><a href="<%=request.getContextPath()%>/loading.jsp"><i class="menu-icon icon-repeat"></i>Loading </a></li>
                    <li><a href="<%=request.getContextPath()%>/loading2.jsp?lo=load"><i class="menu-icon icon-repeat"></i>Loading 2 </a></li>
                    <li><a href="<%=request.getContextPath()%>/maptocallsAPI.jsp"><i class="menu-icon icon-repeat"></i>Calls API </a></li>
                </ul>
            </li>
        </ul>
        <!--/.widget-nav-->

    </div>
    <!--/.sidebar-->
</div>
<!--/.span3-->