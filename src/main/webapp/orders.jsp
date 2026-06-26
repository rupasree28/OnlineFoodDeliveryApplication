<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>My Orders</title>

<link rel="stylesheet" href="css/orders.css">

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css">

</head>

<body>

<header>

<nav>

<div class="logo">

<i class="fa-solid fa-utensils"></i>

<h2>Niru Foods</h2>

</div>

<ul>

<li><a href="home.jsp">Home</a></li>
<li><a href="restaurants.jsp">Restaurants</a></li>
<li><a href="cart.jsp">Cart</a></li>
<li><a href="profile.jsp">Profile</a></li>

</ul>

</nav>

</header>

<section class="orders">

<h1>My Orders</h1>

<!-- Order -->

<div class="order-card">

<div class="left">

<img src="images/restaurants/kfc.jpg">

<div>

<h2>KFC</h2>

<p>Order ID : #10251</p>

<p>Ordered : Veg Burger, Fries, Coke</p>

<p>₹408</p>

</div>

</div>

<div class="right">

<span class="status delivered">

Delivered

</span>

<a href="orderDetails.jsp">

View Details

</a>

</div>

</div>

<!-- Order -->

<div class="order-card">

<div class="left">

<img src="images/restaurants/dominos.jpg">

<div>

<h2>Domino's Pizza</h2>

<p>Order ID : #10252</p>

<p>Ordered : Farmhouse Pizza</p>

<p>₹549</p>

</div>

</div>

<div class="right">

<span class="status preparing">

Preparing

</span>

<a href="orderDetails.jsp">

Track Order

</a>

</div>

</div>

<!-- Order -->

<div class="order-card">

<div class="left">

<img src="images/restaurants/mehfil.jpg">

<div>

<h2>Mehfil</h2>

<p>Order ID : #10253</p>

<p>Ordered : Chicken Biryani</p>

<p>₹320</p>

</div>

</div>

<div class="right">

<span class="status cancelled">

Cancelled

</span>

<a href="orderDetails.jsp">

Details

</a>

</div>

</div>

</section>

</body>

</html>