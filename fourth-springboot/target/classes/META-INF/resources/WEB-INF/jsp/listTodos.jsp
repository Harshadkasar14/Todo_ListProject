<%@ include file="comman/header.jspf"%>
<%@ include file="comman/navbar.jspf"%>
<div class="container">
	<h3>Your ToDos</h3>

	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="update-todo?id=${todo.id}"
						class="btn btn-warning">UPDATE</a></td>
					<td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">Add ToDo</a>
</div>
<script type="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script type="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>