## Project Setup

### Prerequisites
- Java 21
- Maven
- MySQL Database


## API Endpoints

### **1️⃣ Create Training Center (POST)**
```http
POST /api/training-centers
```
**Request Body (JSON):**
```json
{
  "centerName": "Tech Academy",
  "centerCode": "TCH1234567890",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "Metropolis",
    "state": "NY",
    "pincode": "10001"
  },
  "studentCapacity": 500,
  "coursesOffered": ["Java", "Spring Boot"],
  "contactEmail": "info@techacademy.com",
  "contactPhone": "1234567890"
}
```

### **2️⃣ Get All Training Centers (GET)**
```http
GET /api/training-centers
```
**Response (JSON Example):**
```json
[
  {
    "id": 1,
    "centerName": "Tech Academy",
    "centerCode": "TCH1234567890",
    "address": {
      "detailedAddress": "123 Main St",
      "city": "Metropolis",
      "state": "NY",
      "pincode": "10001"
    },
    "studentCapacity": 500,
    "coursesOffered": ["Java", "Spring Boot"],
    "createdOn": 1700000000,
    "contactEmail": "info@techacademy.com",
    "contactPhone": "1234567890"
  }
]
```

---

## **Notes**
- Validations are enforced (e.g., email format, phone number, center code length).
- Uses Spring Boot with JPA for database persistence.
- Handles validation errors using a global exception handler.
- Ensure MySQL is running before starting the application.


Thank you!


