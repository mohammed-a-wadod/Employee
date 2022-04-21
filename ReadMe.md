## How to Start

- You should have JDK 8 or later installed in you machine.
- You should have MAVEN installed in your machine.
- To build the code, you can use the following cmd command inside the project path:
```sh
mvn clean install
```
- After building the app you can run it using the following command inside the project path:
```sh
java -jar target/employee.jar
```
- This application provide **CRUD** operations for empolyee:
	- Create\update employee.
	- Retrieve all employees.
	- Retrieve Employee by id.
	- Delete Employee by id.

In order to try the REST APIs, you have to import postman collection ***Employee_APIs.json***  in to postman.
Also, I added API documentation using swagger, you can check it through [this URL after you run the app](http://localhost:8081/swagger-ui.html)

You want to run the app through **Docker**, you should go to path where ***docker-compose.yml*** is located and run the following command:
```sh
docker-compose up -d --remove-orphans --build
```
Or you can pull the image from **DockerHub** by the following command:
```sh
docker pull mwadod/employee-backend-h2-db
```