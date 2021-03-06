<div class="container">

	<div class="row">

		<!-- to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!--  to display the actual pet -->
		<div class="col-md-9">
			<!-- added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllPets == true}">
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Pets</li>

						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryPets == true}">
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>

						</ol>
					</c:if>

				</div>
			</div>

		</div>

	</div>

</div>