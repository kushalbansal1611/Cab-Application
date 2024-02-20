Cab Booking Application

This is a simple cab booking application implemented using Java and Spring Boot.


Description

The application allows users to book rides on a route. Users can register themselves, and driving partners can onboard on the system with their vehicle details. Users can search and select from multiple available rides on a route with the same source and destination based on the nearest to the user.


Features:-

User Registration

Driver onboarding

Finding available rides

Choosing a ride


Technologies Used:-

Java

Spring Boot

Maven


Installation:-

Clone the repository:

git clone git@github.com:kushalbansal1611/Cab-Application.git

Navigate to the project directory:

cd cab-booking-application

Build the project using Maven:

mvn clean install

Run the application:

mvn spring-boot:run


Usage:-

Register users using the /cab/user endpoint.

Onboard drivers using the /cab/driver endpoint.

Find available rides using the /cab/ride endpoint.

Choose a ride using the /cab/choose endpoint.


API Endpoints:-

POST /cab/user: Register a user.

POST /cab/driver: Onboard a driver.

GET /cab/ride: Find available rides.

POST /cab/choose: Choose a ride.


Sample Request:-

Register User

curl --location --request POST 'http://localhost:8080/cab/user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "John",
    "gender": "M",
    "age": 30
}'

Onboard Driver

curl --location --request POST 'http://localhost:8080/cab/driver' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Driver1",
    "gender": "M",
    "age": 25,
    "vehicleDetails": "Swift KA-01-12345",
    "currentLocation": [10.0, 1.0]
}'

Find Ride

curl --location --request GET 'http://localhost:8080/cab/ride?username=John&source=10.0%2C0.0&destination=15.0%2C3.0'

Choose Ride

curl --location --request POST 'http://localhost:8080/cab/choose?username=John&driverName=Driver1'


Contributors

Kushal Bansal


License

This project is licensed under the MIT License - see the LICENSE file for details.
