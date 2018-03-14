
        <!-- Navigation -->
        <nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    
                    <%
                        Object object = request.getSession(false).getAttribute("isFirst");
                        

                        if (object != null) {
                    %>
                    <a class="navbar-brand" href="../PRJ321_ThanhMQ_Assign3/index.jsp">Welcome to the board!</a>
                    <%
                    } else {
                    %>
                    <a class="navbar-brand" href="../PRJ321_ThanhMQ_Assign3/index.jsp">Welcome back!</a>
                    <% }%>
                 
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        
                        
                        <li class="page-scroll">
                            <a href="../PRJ321_ThanhMQ_Assign3/profile.jsp">Profile</a>
                        </li>
                        <li class="page-scroll">
                            <a href="../PRJ321_ThanhMQ_Assign3/userCounter.jsp">UserCounter</a>
                        </li>
                        
                        <li class="page-scroll">
                            <a href="../PRJ321_ThanhMQ_Assign3/Register.jsp">Register</a>
                        </li>
                        <li class="page-scroll">
                            <a href="../PRJ321_ThanhMQ_Assign3/Login.jsp">Login</a>
                        </li>
                        <li class="page-scroll">
                            <a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>
