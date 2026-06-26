<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>

@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800&display=swap');

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Poppins',sans-serif;
}

body{

    min-height:100vh;

    display:flex;

    justify-content:center;

    align-items:center;

    padding:30px;

    background:
    linear-gradient(
    135deg,
    #d9afd9 0%,
    #97d9e1 35%,
    #c2ffd8 70%,
    #fbc2eb 100%);

    background-size:300% 300%;

    animation:bgMove 10s ease infinite;

}

@keyframes bgMove{

0%{
background-position:0% 50%;
}

50%{
background-position:100% 50%;
}

100%{
background-position:0% 50%;
}

}

.container{

    width:520px;

    background:rgba(255,255,255,.30);

    backdrop-filter:blur(18px);

    border-radius:30px;

    padding:40px;

    text-align:center;

    border:1px solid rgba(255,255,255,.4);

    box-shadow:

    0 20px 60px rgba(103,58,183,.18),

    0 10px 40px rgba(33,150,243,.15),

    0 0 40px rgba(255,255,255,.35);

    transition:.4s;

}

.container:hover{

    transform:translateY(-6px);

}

.success{

    width:120px;

    height:120px;

    margin:auto;

    border-radius:50%;

    display:flex;

    justify-content:center;

    align-items:center;

    font-size:65px;

    background:

    linear-gradient(
    135deg,
    #b2f7cc,
    #8be9fd);

    box-shadow:

    0 0 30px rgba(76,175,80,.35),

    0 0 60px rgba(33,150,243,.25);

    animation:pop 2s infinite;

}

@keyframes pop{

0%,100%{

transform:scale(1);

}

50%{

transform:scale(1.08);

}

}

h1{

    margin:25px 0 10px;

    font-size:34px;

    color:#5e35b1;

    font-weight:700;

}

.subtitle{

    color:#5f6368;

    font-size:16px;

    margin-bottom:30px;

}

.details{

    margin-top:20px;

}

.details p{

    display:flex;

    justify-content:space-between;

    align-items:center;

    padding:16px 18px;

    margin:14px 0;

    border-radius:16px;

    background:

    linear-gradient(

    135deg,

    rgba(255,255,255,.55),

    rgba(255,255,255,.25));

    box-shadow:

    0 8px 20px rgba(0,0,0,.08);

    color:#444;

    font-size:16px;

    font-weight:500;

}

.details b{

    color:#6a1b9a;

}

.btns{

    display:flex;

    gap:15px;

    margin-top:35px;

}

button{

    flex:1;

    padding:15px;

    border:none;

    border-radius:50px;

    color:white;

    font-size:16px;

    font-weight:600;

    cursor:pointer;

    transition:.35s;

}

.home{

    background:

    linear-gradient(

    135deg,

    #7f7fd5,

    #86a8e7,

    #91eae4);

}

.orders{

    background:

    linear-gradient(

    135deg,

    #43cea2,

    #38f9d7);

}

button:hover{

    transform:translateY(-4px);

    box-shadow:

    0 12px 30px rgba(0,0,0,.18);

}

button:active{

    transform:scale(.97);

}

</style>
<%
Integer orderId = (Integer) request.getAttribute("orderId");

if(orderId == null){
    orderId = (Integer) session.getAttribute("orderId");
}

Double totalAmount = (Double) request.getAttribute("totalAmount");

if(totalAmount == null){
    totalAmount = (Double) session.getAttribute("totalAmount");
}

if(totalAmount == null){
    totalAmount = 0.0;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Successful</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{

    height:100vh;

    display:flex;

    justify-content:center;

    align-items:center;

    background:linear-gradient(135deg,#6a11cb,#2575fc);

}

.container{

    width:500px;

    background:white;

    border-radius:20px;

    padding:40px;

    text-align:center;

    box-shadow:0 15px 40px rgba(0,0,0,.25);

}

.success{

    font-size:90px;

}

h1{

    margin:20px 0;

    color:#28a745;

}

.details{

    margin-top:25px;

    text-align:left;

}

.details p{

    margin:12px 0;

    font-size:18px;

}

.btns{

    margin-top:35px;

}

button{

    padding:12px 25px;

    margin:10px;

    border:none;

    border-radius:8px;

    color:white;

    cursor:pointer;

    font-size:16px;

}

.home{

    background:#007bff;

}

.orders{

    background:#28a745;

}

button:hover{

    opacity:.9;

}

</style>

</head>
<body>

<div class="container">

<div class="success">
✅
</div>

<h1>Order Placed Successfully!</h1>

<p>
Thank you for ordering with <b>NiruDine</b>.
</p>

<div class="details">

<p>
<b>Order ID :</b>
<%=orderId%>
</p>

<p>
<b>Total Amount :</b>
₹ <%=totalAmount%>
</p>

<p>
<b>Status :</b>
Placed
</p>

<p>
<b>Estimated Delivery :</b>
30 - 40 Minutes
</p>

</div>

<div class="btns">

<a href="RestaurantServlet">
<button class="home">
Continue Ordering
</button>
</a>

<a href="OrderHistoryServlet">
<button class="orders">
View Orders
</button>
</a>

</div>

</div>

</body>
</html>