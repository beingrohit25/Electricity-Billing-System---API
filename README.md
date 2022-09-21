<h1 align="center">Electric Bill Payment Project</h1>
<h3 align="center">Team 3</h3>
<br><br>
<h2 align="left">Contact Us :-</h2>
<h5 align="left">rohitparih@gmail.com, punyam2000@gmail.com, samkaushik2000@gmail.com, sakshibita1999@gmail.com</h5>
<h5 align="left">ritik.sharma7910@gmail.com, vohraanas@outlook.com</h5>
<br><br>
<h2 align="left">Languages and Tools used:</h2>
<p align="center"> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="70" height="70"/> &nbsp  &nbsp </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="70" height="70"/>  &nbsp &nbsp </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="70" height="70"/>  &nbsp &nbsp</a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="70" height="70"/> &nbsp &nbsp </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="70" height="70"/> </a> </p>
<br><br>
<h2>Configure or Add some Essential properties to your System</h2>
<h5>Add your Schema or Database in application.properties</h5>
<h5>One email Id and 16 Digits code in application.properties</h5>
<h5>Install Lombok</h5>
<h5>Java version 8 or greater (If you are using other than Java 11 then change version of Java in pom.xml)</h5>
<br><br>
<h2 align="center">Modules</h2>
<h4 align="left">User Module</h4>
<h4 align="left">Customer Module</h4>
<h4 align="left">Connection Module</h4>
<h4 align="left">Reading Module</h4>
<h4 align="left">Bill Module</h4>
<h4 align="left">Payment Module</h4>

<h2 align="center">Getting Start</h2>
<h4 align="left">1. Import Project in your IDE.</h4>
<h4 align="left">2. Set your schema in application.properties.</h4>
<h4 align="left">3. Update maven Project with the help of IDE</h4>
<h4 align="left">4. Start the main app.</h4>
<h4 align="left">5. Enter your Email Id and generated 16 digit code from Gmail in application.properties.</h4>
<h4 align="left">6. Read the API documentation from the given link http://localhost:8080/swagger-ui/index.html (Use Links from Controllers)</h4>
<h4 align="left">7. From the user controller register for Admin by providing your proper Email id as Username</h4>
<h4 align="left">8. Password will be sent to your Registered email.</h4>
<h4 align="left">9. Login User in User Controller and Generate a unique token</h4>
<h4 align="left">10. Then fill details in createCustomer present in Customer Controller. All the filed must be unique. User can pass First Name, Middle Name, Last Name, Gender, Mobile No., Aadhar No.. Remaining fields will be auto generated. User have to login first by their credentials to fill details</h4>
<h4 align="left">11. One User can create only one customer.</h4>
<h4 align="left">12. Admin have some special funcationalities like getting all customers, searching customer by Id or Username, Delete particular customer by its Id.</h4>
<h4 align="left">13. Then user can apply for new Connection from Connection Controller. One user can have only Connection irrespective of Role. Body must contain ConnectionType and Address.</h4>
<h4 align="left">14. Payment for new Connection from Connection Controller to activate your connection.</h4>
<h4 align="left">15. Admin has the Role to Activate the particular connection with connection Id. Admin can also get all Connections, Delete Connection, get Connection by Id, Search by Consumer No., Search for active or Inactive Connection through a particular field of Address.</h4>
<h4 align="left">16. User can Self Submit Reading from meter present in Reading Controller. After submitting the particular reading user cannot resubmit the reading on that day. After submitting the reading User have to submit the Image of the particular Reading or Meter for the Approval or Proof. user can see the List of all their readings. One user can submit multiple readings.</h4>
<h4 align="left">17. Admin have some special functionalities in Reading module too like Delete reading, get all readings irrespective of zUsers, search reading by Id or Consumer no.</h4>
<h4 align="left">18. After submitting the reading Image user can create bill and to see the List of all bills thorugh Bill Controller.</h4>
<h4 align="left">19. In Bill module too, Admin have some special features like Getting all Bills irrespective of Users, Delete bill, Seach bill by Id or Consumer no..</h4>
<h4 align="left">20. After creating the bill user can pay the Bill for particular Bill Id in the form of NET_BANKING, WALLET, DEBIT and CREDIT.</h4>
<h4 align="left">21. Transaction Id will be Auto generated.</h4>
<h4 align="left">22. User can use Forgot password from User controller to generate new Password. New Password will be sent to your email Id. Length of new Random password will be 8 containing Alpha Numeric.</h4>
<h4 align="left">23. After that User can change their password. Old password will be the password you get in your Email and New password will be your desired password.</h4>
<h4 align="left">24. Admin can track the activity of All the users with the help of given Link http://localhost:8080/access-history/list</h4>
<br><br>
<h1 align="center">Electric Bill Payment Project</h1>
<h3 align="center">Thank You</h3>
