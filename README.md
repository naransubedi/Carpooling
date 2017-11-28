# Carpooling


Application specifications and requirements:
When you first visit your web application, you will be prompted with a screen to login or create a new
profile.
Profile should include the following data: (Full Name, Gender, State, City, Street, Zip code, Birth Year,
Email, Password).
Password complexity should be at least 6 letters and have at least one capital letter, one small letter,
one number (use RegEx).
For a safer community and rides, only members with 18+ years old are allowed to use the application.
When users finish the sign up process they should be logged in automatically.
After login, users will see latest 25 car-pooling ride-offering posts sorted by date (latest post is first).
An automatic infinite scroll pagination should be implemented: so when you scroll down the next 15
posts will fade-in using AJAX.
Every user should be able to add a new text post to the application wall. There should be an option for
users to delete their own posts using AJAX.
Posts have two types: Asking for a ride, offering a ride (default display). A tab should be provided to
change the view using AJAX.
When a new post is submitted by other users while you are on screen, you should see a notification on
top of your page. If you click that notification it will append all the new posts to the DOM.
Users should be able to like a post, read all previous comments and add a new comment using AJAX.
Users should be able to update their profile information.
The application will provide a weather service to help users plan their trips and drive safely. A link
should be located in the Navigation bar for the weather service.
The application will display two things (Current weather map, 5 days/3 hour forecast data) based on
their city/zip code in their profile, if missing the app should read their current GPS location.
Users should also be able to search and display weather information about their destination cities/zip
code.
Technical information:
There is a suggested MySQL database structure file in the project directory db.sql , you can import the
file into MySQL database on your machine.
You will need to install MySQL Server:•
•
Standalone: MySQL Community Server http://dev.mysql.com/downloads/
Download MySQL Workbench to manage your DB
Download mysql-connector-java and configure the connector with your Web Project in Eclipse.
To import the database manually from the command line:
1. mysql – u root –p (where root is your username as appropriate)
2. source d:\db.sql (assuming you have downloaded the db.sql file to the root of your d directory
3. You can find a sample of how we can connect to MYSQL using the JDBC java file
DBconnection.java provided in the project folder (tune it to your taste).
You should format all data coming from DB into a JSON string and return that to your Ajax query.
•
•
Use JSON-Simple https://code.google.com/archive/p/json-simple/downloads
Example of parsing JSON http://www.mkyong.com/java/json-simple-example-read-and-write-
json/
You can retrieve map information from openweathermap.org API, you will have to integrate the data
coming from the service API with Google Maps. First you will need to sign up for a free account and get
an API token that will allow you to query their services.
A guide on displaying weather data with the Google Maps API and OpenWeatherMap will be provided
for you in the project folder (OpenWeatherMapLayer.pdf)
Important notes:
•
•
•
•
You must use MVC architecture.
You must use at least one Custom Tag to show your content.
You must use Ajax to perform posting and commenting... etc
You must use JSON parser and retrieve all your map data as JSON.
Notes and daily routine:
Every team member will be responsible for one part of the project, there should be a slide in your
presentation showing which part of the project each one has worked on and all tasks performed.
A detailed project plan should be submitted by Monday 01:00 pm.
Before you start you better setup and use an online SVN service (Git is advised).
Every team member should be assigned on one part of the application, so they can "divide-and-
conquer" that part into small tasks:
•
•
•
Java MVC Backend, Login, User profile, Homepage and Custom Tags
CSS frameworks, responsive layout, JavaScript modules and AJAX calls
Weather Service and Google API
Despite the fact that projects will be presented in teams, every team member will be graded individually
based on their contribution and completion of their tasks.
