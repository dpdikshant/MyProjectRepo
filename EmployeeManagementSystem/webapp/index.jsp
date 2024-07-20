<!DOCTYPE html>
<html>
<head>

    <title>Employee portal</title>
     
     <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="one.css" />
</head>

<body>

    <div id="header">
       
        <div id="h1right">  
            <h1>Ishita Chourasia</h1>
          <button type="button" id="btn1">Create Employee Type</button>
          <button type="button" id="btn2">Delete Employee Type</button>
          <button type="button" id="btn3">Employee List</button>
          <button type="button" id="btn4">Add Employee</button>
        </div>
    </div>

    <div id="content">

     <div id="div1">
         Create Employee Type

         <form>
  <div class="form-group">
    <label for="name1">Name</label>
    <input type="input" class="form-control" id="name1" placeholder="Name">
  </div>
 
  <button type="button" class="btn btn-default" id="btn5">Add</button>

  <button type="button" class="btn btn-default" id="btn6">Cancel</button>
</form>

     </div>

  <div id="div2">
         Remove Employee type

          <form>
  <div class="form-group">
   <div id="myDropdown" class="dropdown-content">
       <select id="select1">
    <!--<option value="Developer">Developer</option>
    <option value="Tester">Tester</option>-->
       </select>
  </div>
  </div>    
 
  <button type="button" id="btn7" class="btn btn-default">Remove</button>

  <button type="button" id="btn8" class="btn btn-default">Cancel</button>
</form>

     </div>  

     <div id="div3">
          Employee List
<!--<nav class="navbar navbar-default">
  <div class="container-fluid">-->
    <!--<div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>-->
    <br>
<ul id="listemp">
  <!--<li><a class="active" href="#dev" id="dev">Developer</a></li>
  <li><a href="#man" id="man">Manager</a></li>
  -->
</ul>

  <!--</div>
</nav>-->
<div id="eldiv">
<ul id="list1" >
</ul>

</div>

  <button type="button" id="eledit" class="btn btn-default" disabled="">Edit</button>
  <button type="button" id="elrem" class="btn btn-default" disabled="">Remove</button>

     </div> 

      <div id="div4">
         Add Employee 
         <form>
  <div class="form-group">
    <label for="name2">Name</label>
    <input type="input" class="form-control" id="name2" placeholder="Name">
  </div>

   <div class="form-group">
    <label for="des">Designation</label>
    <input type="input" class="form-control" id="des" placeholder="Designation">
  </div>
 
    <select id="select2">
    <!--<option value="Developer">Developer</option>
    <option value="Tester">Tester</option>-->
       </select>

  <button type="button" id="addadd" class="btn btn-default">Add</button>

  <button type="button" id="addundo" class="btn btn-default">Undo</button>
</form>
     </div>

            </div>  

               
<script type="text/javascript" src="./create.js"> </script>
</body>
</html>