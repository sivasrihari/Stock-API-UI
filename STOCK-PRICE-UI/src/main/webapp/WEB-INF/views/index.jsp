<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	<h1>Get Stock Price</h1>
	<center>
		
	<form action="/getTotalCost" method="get">
		<table>
			<tr>
				<th>
					Company Name
				</th>
				<td>
					<input type="text" name="CompanyName" value="Enter Company Name"/>
				</td>
			</tr>
			<tr>
				<th>
					Quantity
				</th>
				<td>
					<input type="text" name="Quantity" value="Enter Quantity"/>
				</td>
			</tr>
			<tr>
				<th>
					
				</th>
				<td>
					<input type="Submit" value="SUBMIT"/>
				</td>
			</tr>
		</table>
		</form>
	</center>
	<h3>${msg}</h3>
</body>
</html>