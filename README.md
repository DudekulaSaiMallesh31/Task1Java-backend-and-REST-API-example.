![image](https://github.com/user-attachments/assets/3c3fe894-b85f-4a11-b150-8a70b78d72c6)# Task1Java-backend-and-REST-API-example.
Task Manager API
Overview
This is a Spring Boot REST API for managing and executing tasks. It supports CRUD operations and task execution via shell commands.
Features
•	Execute shell commands associated with tasks.
•	Store task execution results in MongoDB.
Prerequisites
•	Java 17+
•	Maven
•	MongoDB
•	cURL or Postman (for testing API requests)
Setup
1.	Clone the repository or extract the provided ZIP file.
2.	Navigate to the project directory: 
3.	cd demo
4.	Start MongoDB (if not running): 
5.	mongod --dbpath <your-db-path>
6.	Build and run the project: 
7.	mvn spring-boot:run
Configuration
Modify application.properties if needed:
spring.data.mongodb.uri=mongodb://localhost:27017/taskdb
spring.data.mongodb.database=taskdb
server.port=8080
API Endpoints
Create a Task
curl -X PUT http://localhost:8080/tasks \
     -H "Content-Type: application/json" \
     -d '{
           "id": "123",
           "name": "Print Hello",
           "owner": "Dudekul Sai Mallesh",
           "command": "C:\\Windows\\System32\\cmd.exe /c echo Hello World!",
           "taskExecutions": []
         }'
Get All Tasks
curl -X GET http://localhost:8080/tasks
Get a Task by ID
curl -X GET http://localhost:8080/tasks/123
Execute a Task
curl -X PUT http://localhost:8080/tasks/123/execute
Delete a Task
curl -X DELETE http://localhost:8080/tasks/123
Troubleshooting
•	If you encounter a 500 Internal Server Error, ensure the command path is correct.
•	If MongoDB connection fails, verify that MongoDB is running.
License
This project is for educational purposes. Feel free to modify and expand upon it.

![image](https://github.com/user-attachments/assets/0b4b7fb9-e152-4f90-bc22-bdb90aa1cf6e)

 
Running spring boot 
![image](https://github.com/user-attachments/assets/b7e6bd80-bc1c-4c08-b2df-f2fdc2abeb99)

 
Running mongosh

 ![image](https://github.com/user-attachments/assets/13bdaea2-d787-4e07-8406-9138622191a7)

put in postman
 ![image](https://github.com/user-attachments/assets/c5af5b3c-a57b-442e-94df-b212b2b9be6d)

Put execuation
 ![image](https://github.com/user-attachments/assets/f19ae9a6-56a8-433c-b12f-27a4e8fe5eb9)

delete in postman

