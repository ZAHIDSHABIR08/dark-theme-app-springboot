Project Structure
The application includes:

A Maven-configured Spring Boot project set to generate a WAR file
A clean, responsive UI with dark gray background and dark green accents
Three functioning buttons: Action 1, Action 2, and a text input with Submit button
Java controller to handle the form submissions
Thymeleaf template for the frontend

Building and Deploying

Build the WAR file:
bashCopycd dark-theme-app
mvn clean package

The WAR file will be generated at: dark-theme-app/target/dark-theme-app.war
Deploy to your Tomcat 9 server by copying the WAR file to Tomcat's webapps directory.
Access the application at: http://<your-server-ip>:<port>/dark-theme-app/

The application uses Spring Boot 2.7.18 with Java 11, which is compatible with Tomcat 9. All form actions work as designed, with the results displayed in the message area at the top of the page.
