<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Restaurant Menu</title>

<link rel="stylesheet" href="css/menu.css">

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css">

</head>

<body>

<header>

<div class="navbar">

<h2><i class="fa-solid fa-utensils"></i> Niru Foods</h2>

<div>

<a href="home.jsp">Home</a>
<a href="restaurants.jsp">Restaurants</a>
<a href="cart.jsp"><i class="fa-solid fa-cart-shopping"></i></a>

</div>

</div>

</header>

<section class="restaurant-header">

<img src="images/restaurants/kfc-banner.jpg">

<div>

<h1>KFC</h1>

<p>⭐ 4.6 | 25 mins | Burgers • Chicken • Wraps</p>

<p>📍 Hyderabad</p>

</div>

</section>

<section class="menu">

<h2>Recommended Items</h2>

<div class="menu-grid">

<!-- Item -->

<div class="food-card">

<img src="images/menu/burger.jpg">

<span class="veg">VEG</span>

<h3>Veg Burger</h3>

<p>Crispy patty with fresh veggies.</p>

<div class="price">

₹199

<button>Add</button>

</div>

</div>

<!-- Item -->

<div class="food-card">

<img src="images/menu/chicken.jpg">

<span class="nonveg">NON VEG</span>

<h3>Chicken Bucket</h3>

<p>8 Pieces Hot & Crispy Chicken.</p>

<div class="price">

₹599

<button>Add</button>

</div>

</div>

<!-- Item -->

<div class="food-card">

<img src="images/menu/pizza.jpg">

<span class="veg">VEG</span>

<h3>Cheese Pizza</h3>

<p>Loaded with mozzarella cheese.</p>

<div class="price">

₹349

<button>Add</button>

</div>

</div>

<!-- Item -->

<div class="food-card">

<img src="images/menu/fries.jpg">

<span class="veg">VEG</span>

<h3>French Fries</h3>

<p>Crispy salted fries.</p>

<div class="price">

₹149

<button>Add</button>

</div>

</div>

<!-- Item -->

<div class="food-card">

<img src="images/menu/coke.jpg">

<span class="veg">DRINK</span>

<h3>Coca Cola</h3>

<p>600ml chilled drink.</p>

<div class="price">

₹60

<button>Add</button>

</div>

</div>

<!-- Item -->

<div class="food-card">

<img src="images/menu/icecream.jpg">

<span class="veg">DESSERT</span>

<h3>Chocolate Ice Cream</h3>

<p>Rich chocolate delight.</p>

<div class="price">

₹120

<button>Add</button>

</div>

</div>

</div>

</section>

</body>

</html>