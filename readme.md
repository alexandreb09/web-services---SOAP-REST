# Web Services

This project is the ranked TP from Web Service class, ISIMA ZZ3 [(source)](http://olivier.coupelon.net/t/cours-webservices). I developped all the both project using IntelliJ.

The project has three parts:
  1. Implementation of a *SOAP* service following a top-down approach.
  2. Translation of the *SOAP* service into a *REST* service.
  3. Test both services with [*SOAP UI*](https://www.soapui.org/) tools. 

The service is a simple service managing **comments**. It has 5 methods: `create`, `update`, `read`, `delete`, `readAll`. For convenience in tests, I added a `deleteAll` method. 

## I. Project Structure
 The project is composed by 5 folders:
 - `Project_REST`: java implementation of the *REST* in Java
 - `Project_SOAP`: java implementation of the *SOAP* service in Java
 - `SOAPUI`: test of ours web services (one for the *SOAP* project and the other for the *REST* project).
 - `WSDL`: WSDL file used in the *SOAP* implementation.


## II. Instructions
   
**Step 1**: Build *SOAP* or *REST* web application through `Maven`. The build results in the creation of a `target` folder with `.war` file.

**Step 2**: Run Payara server:
  1. Download `payara5` server and unzip it. (version used `payara-5.194`)
  2. Move to the `payara5\bin` folder.
  3. Run : `asadmin start-domain`. Expected output:
  ```
  Waiting for domain1 to start .....................................
  Successfully started the domain : domain1
  domain  Location: path\to\payara5\glassfish\domains\domain1
  Log File: path\to\payara5\glassfish\domains\domain1\logs\server.log
  Admin Port: 4848
  Command start-domain executed successfully.
  ```

**Step 3**: Upload the `.war` file (from step 1) to the server. 
  1. From a web browser, go to the `localhost:4848` URL (default port). 
  2. From the tab `List of applications`, **deploy** the `.war` file. 

**Step 4**: Perform tests from `SOAP UI`
  1. Open SOAP UI (install it if it's not)
  2. Open test case from the `SOAPUI` folder 
  3. Run tests!


## III. Potential issues

  #### Potential issue 1:
  - **Problem**: Cache reloading error:
   - **Solution**: delete the `payara5\glassfish\domains\domain1\osgi-cache`
   - **Error message**:
  ```
  The server exited prematurely with exit code 1.
  Before it died, it produced the following output:
  
  Launching Payara Server on Felix platform
  ERROR: Error reloading cached bundle, removing it: path\to\payara5\glassfish\domains\domain1\osgi-cache\felix\bundle106
  ...
  ```
  
  #### Potential issue 2:
  - **Problem**: the `sun-jaxws.xml` isn't loaded during the building process
  - **Solution**: Check the project structure: `src/main/java` and `src/main/webapp/WEB-INF/sun-jaxws.xml`
   
  
  
    