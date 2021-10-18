<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="header.html" />
<link rel="stylesheet" href="main.css" type="text/css" />
<div class="card">
	<div class="container">
		<h1>Join our email list</h1>
		<p>To join our email list, enter your name and email address
			below.</p>
		
		<c:if test=" ${message != null }">
			<p>
				<i>${message}</i>
			</p>
		</c:if>
		<form action="email" method="post">
			<input type="hidden" name="action" value="add"> <label
				class="pad_top">Email: </label> <input type="email" name="email"
				required><br> <label class="pad_top">First
				Name: </label> <input type="text" name="firstname" required><br>
			<label class="pad_top">Last Name: </label> <input type="text"
				name="lastname" required><br> <label class="pad_top">Heard
				from: </label> <input type="text" name="Heardfrom" required><br>
			<label class="pad_top">Updates: </label> <input type="text"
				name="updates" required><br> <label class="pad_top">Contact
				via: </label> <input type="text" name="contactVia" required><br>
			<label>&nbsp;</label> 
			<input type="submit" value="Join Now" id="submit">
		</form>
	</div>
</div>

<c:import url="footer.jsp" />
