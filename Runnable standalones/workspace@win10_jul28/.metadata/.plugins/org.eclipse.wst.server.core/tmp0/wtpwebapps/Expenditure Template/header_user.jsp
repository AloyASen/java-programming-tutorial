<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="user_index.jsp"><span class="logo_colour">Expenditure tracker & Home budget System</span></a></h1>
          <h2>Manage your Own Expense</h2>
        </div>
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
          <li><a href="insert.jsp">Entry</a></li>
          <li><a href="#">Expense Reports</a>
          <ul>
              <li><a href="report_daily.jsp">Daily Report</a></li>
                <li><a href="report_monthly.jsp">Monthly Report</a></li>
                 <li><a href="report_yearly.jsp">Yearly Report</a></li>
              </li>
              
            </ul>
          </li>
        
        
          <li><a href="edit_expense.jsp">Edit Expense</a>
           
          </li>
          <li><a href="logout1.jsp">Logout</a></li>
        </ul>
      </nav>
    </header>