import { Component } from '@angular/core';
import { Employee } from '../add-employee/employee';
import { EmployeeManagementService } from 'src/app/employee-management.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent {

  employees: Employee[];
  constructor(private employeeService:EmployeeManagementService, private router:Router){}

  id : Number;
  
  ngOnInit(): void{
    this.getEmployees();
  }

  getEmployees(){
    this.employeeService.getEmployeeList().subscribe(data=>{
      console.log(data);
      this.employees=data;
    })
  }

  updateEmployee(id:Number){
    this.router.navigate(['/updateEmployee',id]);
  }

  deleteEmployee(id:Number){
    this.employeeService.deleteEmployee(id).subscribe(data=>{
      console.log(data);
    });
    this.router.navigate([''])
  }
}
