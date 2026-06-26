<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="com.tap.model.Cart"%>
<%@ page import="com.tap.model.CartItem"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>NiruDine | Checkout</title>

<link rel="stylesheet" href="checkout.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"/>

</head>

<body>

<!-- Floating Sparkles -->

<div class="sparkles">

<span></span>
<span></span>
<span></span>
<span></span>
<span></span>
<span></span>
<span></span>
<span></span>

</div>

<%

Cart cart=(Cart)session.getAttribute("cart");

Integer restaurantId=
(Integer)session.getAttribute("restaurantId");

if(cart!=null && !cart.getItems().isEmpty()){

double grandTotal=0;

%>

<div class="page-title">

<h1>🍽 Secure Checkout</h1>

<p>
Almost there! Complete your order in just one step.
</p>

</div>

<div class="container">

<!-- ================= Delivery Card ================= -->

<div class="left">

<div class="card-header">

<h2>

<i class="fa-solid fa-location-dot"></i>

Delivery Details

</h2>

<p>
Where should we deliver your delicious food?
</p>

</div>

<form action="OrderServlet" method="post">

<div class="input-group">

<label>

<i class="fa-solid fa-user"></i>

Full Name

</label>

<input
type="text"
name="name"
placeholder="Enter your full name"
required>

</div>

<div class="input-group">

<label>

<i class="fa-solid fa-phone"></i>

Phone Number

</label>

<input

type="tel"

name="phone"

placeholder="9876543210"

pattern="[0-9]{10}"

required>

</div>

<div class="input-group">

<label>

<i class="fa-solid fa-house"></i>

Delivery Address

</label>

<textarea

name="address"

rows="4"

placeholder="House No, Street, Landmark..."

required>

</textarea>

</div>

<div class="input-group">

<label>

<i class="fa-solid fa-note-sticky"></i>

Delivery Instructions

</label>

<textarea

name="instructions"

rows="3"

placeholder="Ring the bell... Leave at the gate... etc.">

</textarea>

</div>

<div class="payment-title">

<h3>

<i class="fa-solid fa-wallet"></i>

Choose Payment Method

</h3>

</div>

<div class="payment-options">

<label class="payment-card">

<input

type="radio"

name="paymentMode"

value="Cash On Delivery"

checked>

<div>

<i class="fa-solid fa-money-bill-wave"></i>

<h4>Cash On Delivery</h4>

<p>Pay once your food arrives</p>

</div>

</label>

<label class="payment-card">

<input

type="radio"

name="paymentMode"

value="UPI">

<div>

<i class="fa-brands fa-google-pay"></i>

<h4>UPI</h4>

<p>Google Pay, PhonePe, Paytm</p>

</div>

</label>

<label class="payment-card">

<input

type="radio"

name="paymentMode"

value="Credit Card">

<div>

<i class="fa-solid fa-credit-card"></i>

<h4>Credit / Debit Card</h4>

<p>Visa • MasterCard • RuPay</p>

</div>

</label>

<label class="payment-card">

<input

type="radio"

name="paymentMode"

value="Net Banking">

<div>

<i class="fa-solid fa-building-columns"></i>

<h4>Net Banking</h4>

<p>All major banks supported</p>

</div>

</label>

</div>

<input

type="hidden"

name="restaurantId"

value="<%=restaurantId%>">

<input

type="hidden"

name="status"

value="Placed">

<input

type="hidden"

name="orderDate"

value="<%=new java.sql.Timestamp(System.currentTimeMillis())%>">

    <!-- ================= Order Summary ================= -->

</div>

<div class="right">

    <div class="card-header">

        <h2>
            <i class="fa-solid fa-cart-shopping"></i>
            Order Summary
        </h2>

        <p>
            Review your delicious order before placing it.
        </p>

    </div>

    <div class="summary-table">

        <table>

            <thead>

            <tr>

                <th>Item</th>

                <th>Price</th>

                <th>Qty</th>

                <th>Total</th>

            </tr>

            </thead>

            <tbody>

<%

Collection<CartItem> items = cart.getItems().values();

for(CartItem item : items){

double total = item.getPrice() * item.getQuantity();

grandTotal += total;

%>

<tr>

<td class="food-name">

🍽 <%=item.getName()%>

</td>

<td>

₹<%=item.getPrice()%>

</td>

<td>

<%=item.getQuantity()%>

</td>

<td>

₹<%=total%>

</td>

</tr>

<%

}

%>

            </tbody>

        </table>

    </div>

    <!-- Grand Total -->

    <div class="grand-total-card">

        <div>

            <span>Total Payable</span>

            <h2>

₹<%=grandTotal%>

            </h2>

        </div>

        <i class="fa-solid fa-wallet"></i>

    </div>

    <!-- Features -->

    <div class="features">

        <div class="feature">

            <i class="fa-solid fa-truck-fast"></i>

            <span>30-40 Min Delivery</span>

        </div>

        <div class="feature">

            <i class="fa-solid fa-shield-heart"></i>

            <span>Safe & Secure Checkout</span>

        </div>

        <div class="feature">

            <i class="fa-solid fa-star"></i>

            <span>Freshly Prepared Food</span>

        </div>

    </div>

    <!-- Place Order -->

    <button type="submit" class="checkout-btn">

        <span>

            <i class="fa-solid fa-bag-shopping"></i>

            Place Order

        </span>

    </button>

</div>

</form>

</div>

<%

}else{

%>

<div class="empty-cart">

<div class="empty-card">

<div class="empty-icon">

🛒

</div>

<h2>Your Cart is Empty</h2>

<p>

Looks like you haven't added any delicious food yet.

</p>

<a href="RestaurantServlet" class="shop-btn">

Browse Restaurants

</a>

</div>

</div>

<%

}

%>

</body>

</html>


