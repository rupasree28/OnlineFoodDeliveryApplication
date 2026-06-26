<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="com.tap.model.OrderTable" %>

<%
List<OrderTable> orders = (List<OrderTable>) request.getAttribute("orders");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="orderHistory.css">
<title>My Orders</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Segoe UI,sans-serif;
}

body{
    background:#f5f5f5;
    padding:40px;
}

h1{
    text-align:center;
    color:#333;
    margin-bottom:30px;
}

.container{
    width:80%;
    margin:auto;
}

.order-card{

    background:#fff;

    border-radius:12px;

    padding:20px;

    margin-bottom:20px;

    box-shadow:0 5px 15px rgba(0,0,0,.1);

}

.header{

    display:flex;

    justify-content:space-between;

    align-items:center;

    margin-bottom:15px;

    border-bottom:1px solid #ddd;

    padding-bottom:10px;

}

.order-id{

    font-size:20px;

    font-weight:bold;

    color:#333;

}

.status{

    color:green;

    font-weight:bold;

}

.details{

    display:grid;

    grid-template-columns:repeat(2,1fr);

    gap:15px;

    margin-top:15px;

}

.details p{

    font-size:17px;

}

.empty{

    text-align:center;

    margin-top:100px;

    font-size:22px;

    color:gray;

}

.btn{

    display:block;

    width:220px;

    margin:40px auto;

    text-align:center;

    text-decoration:none;

    background:#28a745;

    color:white;

    padding:12px;

    border-radius:8px;

    font-size:18px;

}

.btn:hover{

    background:#218838;

}

</style>

</head>

<body>

<h1>📦 My Orders</h1>

<div class="container">

<%
if(orders!=null && !orders.isEmpty()){

    for(OrderTable order : orders){
%>

<div class="order-card">

    <div class="header">

        <div class="order-id">
            Order #<%=order.getOrderId()%>
        </div>

        <div class="status">
            <%=order.getStatus()%>
        </div>

    </div>

    <div class="details">

        <p>
            <b>Restaurant ID :</b>
            <%=order.getRestaurantId()%>
        </p>

        <p>
            <b>Order Date :</b>
            <%=order.getOrderDate()%>
        </p>

        <p>
            <b>Total Amount :</b>
            ₹<%=order.getTotalAmount()%>
        </p>

        <p>
            <b>Payment :</b>
            <%=order.getPaymentMethod()%>
        </p>

    </div>

</div>

<%
    }

}else{
%>

<div class="empty">

    <h2>No Orders Found</h2>

    <br>

    <p>Looks like you haven't placed any orders yet.</p>

</div>

<%
}
%>

<a href="RestaurantServlet" class="btn">
Continue Ordering
</a>

</div>

</body>
</html>