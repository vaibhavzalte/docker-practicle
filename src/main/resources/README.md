Sample Requests:

Add Employee:
POST http://localhost:8080/employees
Body: {"name": "John Doe", "salary": 50000.0}
Get All Employees:
GET http://localhost:8080/employees
Get Employee By ID:
GET http://localhost:8080/employees/1
Edit Employee:
PUT http://localhost:8080/employees/1
Body: {"name": "John Doe Updated", "salary": 65000.0}
Delete Employee:
DELETE http://localhost:8080/employees/1