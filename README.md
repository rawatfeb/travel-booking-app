# Travel Booking App

A full-stack travel booking platform similar to Advika Cab, built with React frontend and Spring Boot backend.

## Features

### User Features
- 🔐 User registration and authentication
- 🚗 Browse available vehicles/rides
- 📍 Real-time location tracking
- 💳 Secure payment integration
- 📅 Booking history and management
- ⭐ Rating and reviews
- 🔔 Push notifications
- 💬 In-app chat with driver

### Driver Features
- 📱 Real-time ride acceptance/rejection
- 📍 Live location sharing
- 💰 Earnings dashboard
- 📊 Trip history and analytics
- 🔧 Vehicle management
- ⭐ Performance ratings

### Admin Features
- 👥 User and driver management
- 📊 Analytics and reporting
- 💰 Payment and commission management
- 🚨 Support ticket management
- 📋 Ride verification and monitoring
- 📈 Platform statistics

## Tech Stack

### Frontend
- **React 18+** - UI library
- **Redux Toolkit** - State management
- **Tailwind CSS** - Styling
- **Axios** - HTTP client
- **Socket.io-client** - Real-time communication
- **Mapbox/Google Maps** - Location services

### Backend
- **Java 17+** - Language
- **Spring Boot 3.x** - Framework
- **Spring Data JPA** - ORM
- **Spring Security** - Authentication
- **MySQL/PostgreSQL** - Database
- **Redis** - Caching & sessions
- **Socket.io** - Real-time events
- **JWT** - Token-based authentication

### DevOps
- **Docker** - Containerization
- **AWS/GCP** - Cloud deployment
- **GitHub Actions** - CI/CD

## Project Structure

```
travel-booking-app/
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── redux/
│   │   └── utils/
│   ├── public/
│   └── package.json
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/travelbooking/
│   │   │   │       ├── controller/
│   │   │   │       ├── service/
│   │   │   │       ├── repository/
│   │   │   │       ├── entity/
│   │   │   │       ├── dto/
│   │   │   │       ├── config/
│   │   │   │       └── security/
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
├── docker-compose.yml
├── .github/
│   └── workflows/
└── README.md
```

## Getting Started

### Prerequisites
- Node.js 16+ and npm/yarn
- Java 17+
- MySQL/PostgreSQL
- Docker (optional)

### Frontend Setup

```bash
cd frontend
npm install
npm start
```

### Backend Setup

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

### Docker Setup

```bash
docker-compose up -d
```

## API Documentation

Base URL: `http://localhost:8080/api`

### Authentication
- `POST /auth/register` - User registration
- `POST /auth/login` - User login
- `POST /auth/refresh` - Refresh token
- `POST /auth/logout` - User logout

### Bookings
- `GET /bookings` - Get user bookings
- `POST /bookings` - Create new booking
- `GET /bookings/{id}` - Get booking details
- `PATCH /bookings/{id}/cancel` - Cancel booking
- `PATCH /bookings/{id}/complete` - Complete booking

### Rides
- `GET /rides/available` - Get available rides
- `GET /rides/{id}` - Get ride details
- `POST /rides/{id}/book` - Book a ride

### Payments
- `POST /payments/process` - Process payment
- `GET /payments/history` - Payment history

## Database Schema

Key tables:
- `users` - User profiles
- `drivers` - Driver information
- `vehicles` - Vehicle details
- `bookings` - Booking records
- `rides` - Available rides
- `payments` - Payment transactions
- `reviews` - User/driver ratings

## Contributing

1. Create a feature branch (`git checkout -b feature/amazing-feature`)
2. Commit changes (`git commit -m 'Add amazing feature'`)
3. Push to branch (`git push origin feature/amazing-feature`)
4. Open a Pull Request

## License

MIT License - feel free to use this project

## Support

For support, email: contact@travelbooking.com

## Author

- Febi Rawat (@rawatfeb)
