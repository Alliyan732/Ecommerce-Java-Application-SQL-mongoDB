# Ecommerce Desktop Application

The Ecommerce Desktop Application is a Java-based application built using NetBeans IDE. It utilizes Oracle SQL and MongoDB for data storage and retrieval, providing a robust solution for managing an ecommerce business.

## Features

- User registration and authentication
- Product catalog management
- Shopping cart functionality
- Order processing and tracking
- Payment integration
- Admin dashboard for managing products, orders, and users

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- NetBeans IDE 
- Oracle Database
- MongoDB

## Configuration Steps

### Oracle SQL

1. Install Oracle Database on your machine, and ensure that it is up and running.
2. Launch NetBeans IDE.
3. Add the Oracle JDBC Driver to the project's classpath:
   - Go to "Libraries" in the NetBeans menu and select "Add JAR/Folder."
   - Navigate to the location where you downloaded the Oracle JDBC driver, select the JAR file, and click "Open."
   - Click "OK" to close the "Libraries" window.
4. Configure the Oracle SQL connection in the project:
   - Go to "Services" in the NetBeans menu.
   - Right-click on "Databases" and select "New Connection."
   - Select "Oracle" as the database driver and click "Next."
   - Enter the connection details (username, password, host, port, SID, or service name) for your Oracle database.
   - Optionally, click the "Test Connection" button to verify the connection settings.
   - Click "Finish" to create the connection.

### MongoDB

1. Install MongoDB on your machine, and make sure it is running.
2. Add the MongoDB Java driver to the project's dependencies:
   - Go to the project's properties in NetBeans.
   - Select "Libraries" and click on the "Add Dependency" button.
   - Search for the MongoDB Java driver and add it to the project.
   - Click "OK" to save the changes.
3. Configure the MongoDB connection in the project:
   - Open the MongoDB configuration file (e.g., `mongodb.properties` or `mongo-config.xml`) in the project.
   - Enter the connection details such as the host, port, database name, and credentials (if required).
   - Save the changes.

## Usage

1. Clone the repository to your local machine.
2. Open the project in NetBeans IDE.
3. Configure the Oracle SQL and MongoDB connections following the steps mentioned above.
4. Build and run the application in NetBeans IDE.
5. Use the provided user interface to navigate through the application features, manage products, process orders, and perform other ecommerce-related tasks.

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to contribute, report issues, and submit pull requests to enhance the functionality and features of this ecommerce desktop application.

## Contact

For any questions or inquiries, please contact [Alliyan Waheed] at [alliyan732@gmail.com].
