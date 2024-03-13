<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%--<%@ taglib prefix="s" uri="/struts-tags" %>--%>

<!-- Footer -->

<div class="footer">
    <div class="container">
        <b class="copyright">&copy; 2021 ASRM Support team </b>All rights reserved.
        <br />
        <b class="copyright">Contact: </b>ITDS-ASRM@truecorp.co.th
    </div>
</div>

<script>
    window.onload = function (){
        document.getElementById("myModalLoader").style.display = "none";
    };
</script>

<script src="<%=request.getContextPath()%>/scripts/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/scripts/flot/jquery.flot.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/scripts/flot/jquery.flot.resize.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/scripts/datatables/jquery.dataTables.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/scripts/common.js" type="text/javascript"></script>
</body>
</html>