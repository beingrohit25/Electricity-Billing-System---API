<h1 align="center">Electric Bill Payment Project</h1>

<h3 align="left">Languages and Tools used:</h3>
<p align="left"> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>
<br><br>
<h2>Create schema in MySql named "ebp"</h2>
<h3>Tables will be auto generated</h3>

<h1 align="center">Modules</h1>
<h4 align="left">2. User Module</h4>
<h4 align="left">3. Customer Module</h4>
<h4 align="left">4. Connection Module</h4>
<h4 align="left">5. Reading Module</h4>
<h4 align="left">6. Bill Module</h4>
<h4 align="left">7. Payment Module</h4>

![ER- Diagram](https://github.com/rohitparih/Electricity-Bill-Payment/blob/e1d3dba94fb2e78a9bd683460275906e9393cbec/Electricity%20Bill%20Payment/src/main/resources/static/EBP_ER.png)


<h2 align="left">Customer Module</h2>
<h4>1. Create Customer :http://localhost:8080/ebp/customer/</h4>
<div>
  <table>
<tr>
 <td>
   <h4 align="center">Input</h4>
<h6>{<br>
            &nbsp&nbsp&nbsp&nbsp"firstName": "Rohit",<br>
            &nbsp&nbsp&nbsp&nbsp"lastName": "Parihar",<br>
            &nbsp&nbsp&nbsp&nbsp"aadharNumber": "564576888776",<br>
            &nbsp&nbsp&nbsp&nbsp"email": "rohit@gmail.com",<br>
            &nbsp&nbsp&nbsp&nbsp"mobileNumber": "7687908768",<br>
            &nbsp&nbsp&nbsp&nbsp"gender": "Male"<br>
&nbsp}</h6>
  </td> 
  <td>
    <h4 align="center">Output</h4>
  <h6>{<br>
    &nbsp&nbsp&nbsp&nbsp"customerId": 1,<br>
    &nbsp&nbsp&nbsp&nbsp"firstName": "Rohit",<br>
    &nbsp&nbsp&nbsp&nbsp"lastName": "Parihar",<br>
    &nbsp&nbsp&nbsp&nbsp"aadharNumber": "564576888776",<br>
    &nbsp&nbsp&nbsp&nbsp"email": "rohit@gmail.com",<br>
    &nbsp&nbsp&nbsp&nbsp"mobileNumber": "7687908768",<br>
    &nbsp&nbsp&nbsp&nbsp"gender": "Male",<br>
    &nbsp&nbsp&nbsp&nbsp"dateCreated": "2022-09-06",<br>
    &nbsp&nbsp&nbsp&nbsp"dateEdited": null,<br>
    &nbsp&nbsp&nbsp&nbsp"name": "Rohit Parihar"<br>
&nbsp}</h6>
  </td>
</tr>
    </table>
</div>
