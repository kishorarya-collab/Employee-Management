import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeeManagementService } from 'src/app/employee-management.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit{

  employee :Employee = new Employee();
constructor(private employeeService : EmployeeManagementService, 
  private router : Router){}

  ngOnInit(): void {}
  
  goToEmployeeList(){
    this.router.navigate(['/employees'])
  }

  onSubmit(){
    console.log(this.employee);
    this.employeeService.addEmployee(this.employee).subscribe(data=>{
      console.log(data);
      this.goToEmployeeList();
      alert("Employee has been added")
    }),
    (error)=>alert('Employee was not added')
    
  }
}
