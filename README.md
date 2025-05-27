# Weather Forecast App

A Spring Boot application that fetches and displays real-time weather data using the OpenWeatherMap API. It also integrates Google Maps for location-based weather visualization.

---

## 🔧 Features

- Real-time weather data via OpenWeatherMap API
- Google Maps integration for interactive visuals
- User authentication using Spring Security
- RESTful API support
- Charts using Google Charts

---

##Getting Started

### Prerequisites
- Java 17+
- Maven or Gradle
- Spring Boot
- OpenWeatherMap API Key
- Google Maps API Key

### Clone the Repository
'''bash
git clone https://github.com/Dhanushsaidatha/WeatherForecasts.git
cd WeatherForecasts



Add Your API Keys
Create a file at:
css
Copy code
src/main/resources/application.properties
Add:
properties
Copy code
google.api.key=YOUR_GOOGLE_API_KEY
weather.api.key=YOUR_OPENWEATHER_API_KEY'


Run the app
./mvnw spring-boot:run


src/
├── main/
│   ├── java/
│   │   └── com/example/weatherforecast/
│   ├── resources/
│   │   ├── templates/
│   │   └── application.properties


Technologies Used
Java
Spring Boot
Spring Security
Thymeleaf
REST APIs
Google Maps
OpenWeatherMap

Screenshots:
![image](https://github.com/user-attachments/assets/4f1ffa7c-6709-4614-87a1-6e060643fc9b)
![image](https://github.com/user-attachments/assets/d40abae1-fae2-4bde-ba82-6052778352e0)
![image](https://github.com/user-attachments/assets/5267c2b9-fbb2-43bd-97e9-82ffa2e79350)
![image](https://github.com/user-attachments/assets/c5875807-d7ed-4eab-b82a-74f972faa88d)

 License
This project is open source and available under the MIT License.

















