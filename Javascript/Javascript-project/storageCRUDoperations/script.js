
document.addEventListener("DOMContentLoaded", function(){
  const employeeForm = document.getElementById("employeeForm");
  const employeeName = document.getElementById("employeeName");
  const employeeTitle = document.getElementById("employeeTitle");
  const employeeList = document.getElementById("employeeList");

  // Load employees from local storage
  function loadEmployees(){
    employeeList.innerHTML = '';
    const employees = JSON.parse(localStorage.getItem("employees")) || [];
    employees.forEach((employee, index) => {
      const row = document.createElement("tr")
      row.innerHTML = `
        <td>${employee.name}</td>
        <td>${employee.title}</td>
        <td>
          <button onclick="editEmployee(${index})">Edit</button>
          <button id="btn" onclick="deleteEmployee(${index})">Delete</button>
        </td>
      `;
      employeeList.appendChild(row);
    })
  }

  // Add a new Employee
  employeeForm.addEventListener("submit", function(e){
    e.preventDefault();
    const newEmployeeName = employeeName.value.trim();
    const newEmployeeTitle = employeeTitle.value.trim();
    if(newEmployeeName !=="" && newEmployeeTitle !== ""){
      const employees = JSON.parse(localStorage.getItem("employees")) || [];
      const newEmployee = { name: newEmployeeName, title: newEmployeeTitle};
      employees.push(newEmployee);
      localStorage.setItem("employees",JSON.stringify(employees));
      employeeName.value = ""
      employeeTitle.value = ""
      loadEmployees();
    }
  });

  // Edit a employee
   window.editEmployee = function(index){
    const employees = JSON.parse(localStorage.getItem("employees")) || [];
    const employee = employees[index];
    const updateName = prompt("Edit Employee Name:", employee.name);
    const updateTitle = prompt("Edit Employee Title:", employee.title);
    if (updateName !== null && updateName !== "" && updateTitle !== null && updateTitle !== ""){
      employee.name = updateName;
      employee.title = updateTitle;
      localStorage.setItem("employees",JSON.stringify(employees));
      loadEmployees();
    }
  };

  //Delete an employee
  window.deleteEmployee = function(index){
    const employees = JSON.parse(localStorage.getItem("employees")) || [];
    employees.splice(index,1);
    localStorage.setItem("employees", JSON.stringify(employees));
    loadEmployees();
  };

  //Initial load of employees
  loadEmployees()
});