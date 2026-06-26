<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.*"%>
<%@ page import="com.tap.model.Menu"%>
 

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Restaurant Menu</title>

<link rel="stylesheet" href="menu.css">
<link href="https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css">

</head>

<body>

<header>

<div class="navbar">

<h2><i class="fa-solid fa-utensils"></i> NiruDine <img src="logo.png" width="25px; height=8px;"></h2>

<div>

<a href="home.html">Home</a>
<a href="restaurants.jsp">Restaurants</a>
<a href="cart.jsp"><i class="fa-solid fa-cart-shopping"></i></a>

</div>

</div>

</header>



<section class="menu">

<h2>Menu Items</h2>

<div class="menu-grid">

<!-- Item -->

<%List<Menu> ll=(List<Menu>)(request.getAttribute("l"));
for(Menu i:ll){%>
<div class="food-card">

<img src="<%=i.getImage()%>" alt="not found">

<span class="veg"><%=i.getCategory() %></span>


<h3><%=i.getItemName()  %></h3>



<p><%=i.getDescription() %></p>

<div class="price">

₹<%=i.getPrice()%>



<form action="CartServlet" method="post">

<input type="hidden" name="menuId" value="<%=i.getMenuId()%>">
<input type="hidden" name="restaurantId" value="<%=i.getRestaurantId()%>">
<input type="hidden" name="itemName" value="<%=i.getItemName()%>">
<input type="hidden" name="price" value="<%=i.getPrice()%>">
<input type="hidden" name="quantity" value="1">
<input type="hidden" name="action" value="add">

<input type="hidden" type="submit">
<button>Add to Cart</button>

</div>


</form>
</div>

<%} %>


<!-- Item -->



<!-- Item -->



<!-- Item -->



<!-- Item -->


<!-- Item -->



</div>

</section>

</body>

</html>