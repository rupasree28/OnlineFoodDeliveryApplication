<%@page import="com.tap.model.Cart"%>
<%@page import="com.tap.model.CartItem"%>
<%@page import="java.util.Collection"%>

<%
Cart cart = (Cart) session.getAttribute("cart");
Integer restaurantId = (Integer) session.getAttribute("restaurantId");
%>

<!DOCTYPE html>
<html>
<head>
<style>
@import url('https://fonts.googleapis.com/css2?family=Outfit:wght@300;400;500;600;700;800&family=Poppins:wght@300;400;500;600;700;800&display=swap');
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Outfit',sans-serif;
}

html{
    scroll-behavior:smooth;
}

/* ---------- CUSTOM GLOW CURSOR ---------- */

body{
    cursor:url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='34' height='34'%3E%3Ccircle cx='8' cy='8' r='5' fill='white'/%3E%3Ccircle cx='8' cy='8' r='10' stroke='%2300ffff' stroke-width='2' fill='none'/%3E%3C/svg%3E"),auto;

    min-height:100vh;

    overflow-x:hidden;

    color:white;

    background:
    linear-gradient(
    -45deg,
    #430089,
    #7B2CBF,
    #00B4D8,
    #1DB954,
    #FFD60A,
    #8A2BE2);

    background-size:600% 600%;

    animation:gradientAnimation 18s ease infinite;
}

/* ---------- ANIMATED BACKGROUND ---------- */

@keyframes gradientAnimation{

0%{
background-position:0% 50%;
}

25%{
background-position:50% 100%;
}

50%{
background-position:100% 50%;
}

75%{
background-position:50% 0%;
}

100%{
background-position:0% 50%;
}

}

/* ---------- SPARKLING PARTICLES ---------- */

body::before{

content:"";

position:fixed;

top:0;
left:0;

width:100%;
height:100%;

pointer-events:none;

background-image:

radial-gradient(white 1px,transparent 1px),
radial-gradient(#ffd60a 1px,transparent 1px),
radial-gradient(#00ffff 1px,transparent 1px),
radial-gradient(#7b2cbf 1px,transparent 1px);

background-size:

140px 140px,
180px 180px,
220px 220px,
260px 260px;

animation:

sparklesMove 30s linear infinite;

opacity:.55;

}

@keyframes sparklesMove{

from{

transform:translateY(0px);

}

to{

transform:translateY(-250px);

}

}

/* ---------- HEADING ---------- */

h2{

margin-top:35px;

margin-bottom:35px;

font-size:55px;

font-weight:800;

text-align:center;

letter-spacing:3px;

color:white;

text-shadow:

0 0 10px white,

0 0 25px #ffd60a,

0 0 45px #00ffff,

0 0 65px #7b2cbf;

animation:glowTitle 2.5s ease-in-out infinite alternate;

}
.total-box h2{

font-size:22px;

margin-bottom:10px;

}

.total-box h1{

font-size:42px;

margin:10px 0;

color:#FFD60A;

text-shadow:

0 0 20px #FFD60A;

}

.total-box p{

opacity:.9;

}
.hero{

text-align:center;

padding:40px 20px 20px;

}

.hero h1{

font-size:60px;

font-weight:800;

margin-bottom:10px;

letter-spacing:2px;

text-shadow:

0 0 20px #fff,

0 0 40px #7B2CBF,

0 0 60px #00ffff,

0 0 80px #FFD60A;

}

.hero p{

font-size:20px;

opacity:.95;

font-family:'Poppins',sans-serif;

}

.food-icon{

font-size:22px;

margin-right:8px;

}

.cart-footer{

    width:90%;

    margin:45px auto;

    display:flex;

    justify-content:center;

    align-items:center;

    gap:70px;

}

.left-btn,
.right-btn{

    display:flex;

    align-items:center;

    justify-content:center;

    height:170px;

}

.left-btn{

    flex:1;

    justify-content:flex-end;

}

.right-btn{

    flex:1;

    justify-content:flex-start;

}
@keyframes glowTitle{

from{

transform:scale(1);

}

to{

transform:scale(1.04);

}

}

/* ---------- GLASS TABLE ---------- */

table{

width:88%;

margin:auto;

border-collapse:collapse;

background:rgba(255,255,255,.12);

backdrop-filter:blur(18px);

border-radius:22px;

overflow:hidden;

box-shadow:

0 20px 40px rgba(0,0,0,.35),

0 0 25px rgba(255,255,255,.12);

}

/* ---------- HEADER ---------- */

th{

padding:22px;

font-size:20px;

font-weight:700;

background:

linear-gradient(90deg,

#7B2CBF,

#00B4D8,

#1DB954,

#FFD60A);

color:white;

text-transform:uppercase;

letter-spacing:1px;

}

/* ---------- ROWS ---------- */

td{

padding:20px;

font-size:19px;

text-align:center;

border-bottom:

1px solid rgba(255,255,255,.15);

transition:.35s;

}

tr{

transition:.4s;

}

tr:hover{

background:

rgba(255,255,255,.12);

transform:scale(1.01);

box-shadow:

0 0 15px rgba(255,255,255,.15);

}

/* ---------- PRICE ---------- */

td:nth-child(2){

font-weight:bold;

color:#FFD60A;

}

/* ---------- TOTAL ---------- */

td:nth-child(4){

font-weight:bold;

color:#00FFFF;

}

/* ---------- ACTION BUTTONS ---------- */

button{

padding:10px 20px;

margin:4px;

border:none;

border-radius:30px;

font-size:15px;

font-weight:700;

cursor:pointer;

color:white;

background:

linear-gradient(
45deg,
#7B2CBF,
#00B4D8,
#1DB954,
#FFD60A);

background-size:300%;

transition:.4s;

box-shadow:

0 0 12px rgba(255,255,255,.25);

}

button:hover{

background-position:right;

transform:

translateY(-3px)

scale(1.08);

box-shadow:

0 0 18px #00ffff,

0 0 30px #7b2cbf,

0 0 42px #ffd60a;

}

button:active{

transform:scale(.96);

}

/* ---------- LINKS ---------- */

a{

text-decoration:none;

}

/* ---------- CONTROLS ---------- */

.controls{

display:flex;

justify-content:center;

align-items:center;

gap:18px;

margin-top:35px;

flex-wrap:wrap;

}

/* ---------- GRAND TOTAL CARD ---------- */

.total-box{

width:320px;

margin:35px auto;

padding:22px;

text-align:center;

border-radius:18px;

background:

rgba(255,255,255,.15);

backdrop-filter:blur(16px);

font-size:28px;

font-weight:700;

box-shadow:

0 0 20px rgba(255,255,255,.15);

color:white;

text-shadow:

0 0 10px cyan;

}
</style>

</head>
<body>

<div class="hero">

    <h1> NiruDine Cart</h1>

    <p>
        Delicious food. Premium experience. Freshly prepared with love.
    </p>

</div>

<%

if(cart != null && !cart.getItems().isEmpty())
{

%>

<table>

<tr>

<th>Item</th>
<th>Price</th>
<th>Quantity</th>
<th>Total</th>
<th>Action</th>

</tr>

<%

Collection<CartItem> items = cart.getItems().values();

for(CartItem item : items)
{

%>

<tr>

<td>

<span class="food-icon"></span>

<%=item.getName()%>

</td>

<td>

 <%=item.getPrice()%>

</td>

<td><%=item.getQuantity()%></td>

<td>

<%=item.getTotalPrice()%>

</td>

<td>

<!-- Plus -->

<form action="CartServlet" method="post" style="display:inline;">

<input type="hidden" name="menuId"
value="<%=item.getMenuId()%>">

<input type="hidden" name="quantity"
value="<%=item.getQuantity()+1%>">

<input type="hidden" name="action"
value="update">

<button title="Increase Quantity">

+

</button>

</form>


<!-- Minus -->

<form action="CartServlet" method="post" style="display:inline;">

<input type="hidden" name="menuId"
value="<%=item.getMenuId()%>">

<input type="hidden" name="quantity"
value="<%=item.getQuantity()-1%>">

<input type="hidden" name="action"
value="update">

<button title="Decrease Quantity">

-

</button>

</form>


<!-- Remove -->

<form action="CartServlet" method="post" style="display:inline;">

<input type="hidden"
name="menuId"
value="<%=item.getMenuId()%>">

<input type="hidden"
name="action"
value="delete">

<button title="Remove Item">

Remove

</button>

</form>

</td>

</tr>

<%

}

%>

</table>

<br>
<div class="cart-footer">

    <div class="left-btn">
        <a href="menu?restaurantId=<%=restaurantId%>">
            <button>Add More Items</button>
        </a>
    </div>

    <div class="total-box">

        <h2>Grand Total</h2>

        <h1><%=cart.getGrandTotal()%></h1>

    </div>

    <div class="right-btn">
        <a href="checkout.jsp">
            <button>Proceed To Checkout</button>
        </a>
    </div>

</div>

<%

}
else
{

%>

<div class="empty-cart">

<h1>



</h1>

<h2>

Your Cart is Empty

</h2>

<p>

Looks like you haven't discovered today's delicious dishes yet.

</p>

<a href="RestaurantServlet">

<button>

Explore Restaurants

</button>

</a>

</div>

<%

}

%>

</body>
</html>