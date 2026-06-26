<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>My Cart</title>

<link rel="stylesheet" href="css/cart.css">

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css">

</head>

<body>

<header>

<nav>

<h2>
<i class="fa-solid fa-utensils"></i>
Niru Foods
</h2>

<div>

<a href="home.jsp">Home</a>

<a href="restaurants.jsp">Restaurants</a>

<a href="orders.jsp">Orders</a>

</div>

</nav>

</header>

<section class="cart-container">

<div class="cart-items">

<h2>Shopping Cart</h2>

<!-- Item 1 -->

<div class="cart-card">

<img src="images/menu/burger.jpg">

<div class="details">

<h3>Veg Burger</h3>

<p>₹199</p>

<div class="quantity">

<button>-</button>

<span>1</span>

<button>+</button>

</div>

</div>

<button class="delete">

<i class="fa-solid fa-trash"></i>

</button>

</div>

<!-- Item 2 -->

<div class="cart-card">

<img src="images/menu/pizza.jpg">

<div class="details">

<h3>Cheese Pizza</h3>

<p>₹349</p>

<div class="quantity">

<button>-</button>

<span>2</span>

<button>+</button>

</div>

</div>

<button class="delete">

<i class="fa-solid fa-trash"></i>

</button>

</div>

<!-- Item 3 -->

<div class="cart-card">

<img src="images/menu/fries.jpg">

<div class="details">

<h3>French Fries</h3>

<p>₹149</p>

<div class="quantity">

<button>-</button>

<span>1</span>

<button>+</button>

</div>

</div>

<button class="delete">

<i class="fa-solid fa-trash"></i>

</button>

</div>

</div>

<!-- Bill -->

<div class="summary">

<h2>Bill Details</h2>

<div class="row">

<span>Item Total</span>

<span>₹1046</span>

</div>

<div class="row">

<span>Delivery Fee</span>

<span>₹50</span>

</div>

<div class="row">

<span>GST</span>

<span>₹52</span>

</div>

<hr>

<div class="row total">

<span>Total</span>

<span>₹1148</span>

</div>

<a href="checkout.jsp" class="checkout">

Proceed to Checkout

</a>

</div>

</section>

</body>

</html>