<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>My Profile</title>

<link rel="stylesheet" href="css/profile.css">

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

<li><a href="orders.jsp">Orders</a></li>

</ul>

</nav>

</header>

<section class="profile">

<div class="profile-card">

<div class="profile-image">

<img src="images/user.jpg">

<button>

<i class="fa-solid fa-camera"></i>

</button>

</div>

<h2>Ruu</h2>

<p>Food Lover 🍕</p>

</div>

<div class="details">

<h2>Profile Information</h2>

<form>

<div class="row">

<div class="input-box">

<label>Full Name</label>

<input type="text" value="Ruu">

</div>

<div class="input-box">

<label>Username</label>

<input type="text" value="ruu123">

</div>

</div>

<div class="row">

<div class="input-box">

<label>Email</label>

<input type="email" value="ruu@gmail.com">

</div>

<div class="input-box">

<label>Phone</label>

<input type="text" value="+91 9876543210">

</div>

</div>

<div class="input-box">

<label>Address</label>

<textarea>Hyderabad, Telangana</textarea>

</div>

<button class="save">

Save Changes

</button>

</form>

</div>

</section>

</body>

</html>