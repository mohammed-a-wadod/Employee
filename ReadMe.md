## How to Start

- You should have JDK 8 or later installed in you machine.
- You should have MAVEN installed in your machine.
- To build the code, you can use the following cmd command inside the project path:
```sh
mvn clean install
```
- After building the app you can run it using the following command inside the project path:
```sh
java -jar target/demo-0.0.1-SNAPSHOT.jar
```
- This application provide **CRUD** operations for empolyee:
	- Create\update employee.
	- Retrieve all employees.
	- Retrieve Employee by id.
	- Delete Employee by id.

In order to try the REST APIs, you have to import postman collection ***Employee_APIs.json***  in to postman.