<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="com.tap.model.Restaurant"%>

<!DOCTYPE html>
<html>
<head>
    <title>Restaurants</title>
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="restaurants.css">
</head>
<body>

    <h1>Restaurants</h1>

    
        <main class="main">

    <div class="restaurant-container">
    
    <% 
    List<Restaurant> l=null;
    try{
    l=(List<Restaurant>)(request.getAttribute("restaurantList"));
    }catch(Exception e){
    	e.printStackTrace();
    }
    if(l!=null){
    	
    
    for(Restaurant i:l){
    %>
    	<a href="menu?restaurantId=<%=i.getRestaurantId()%>">

        <div class="card">
           <img src="<%=request.getContextPath()%>/<%=i.getImage()%>"
     alt="<%=i.getRestaurantName()%>">
    
     

            <div class="card-content">
                <h4><%=i.getRestaurantName() %></h4>

                <div class="details">
                    <p style="color:orange;"><%=i.getCuisineType() %></p>
                    <p><%=i.getRating() %>⭐ Ratings</p>
                </div>

                <div class="details">
                    <p style="color:pink;">Address:<%=i.getAddress() %></p>
                    <p style="color:aliceblue;">Delivery Time:<%=i.getDeliveryTime()%>Pm</p>
                </div>

                <button src="menu.jsp">View Menu</button>
            </div>
        </div>
         </a>
       <% } } %>
        

    </main>
   

</body>
</html>