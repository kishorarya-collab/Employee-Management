import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './modules/add-employee/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeManagementService {

  private baseURL="http://localhost:8999";
  constructor(private httpClient:HttpClient) { }

  getEmployeeList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL +'/employee/allEmployee'}`);
  }

  addEmployee(employee: any){
    return this.httpClient.post(`${this.baseURL+"/employee/addEmployee"}`, employee);
  }

  getEmployeeById(id:Number): Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/employee/employeeId/${id}`);
  }

  updateEmployee(id:Number,employee:Employee){
    return this.httpClient.put(`${this.baseURL}/employee/update/${id}`,employee);
  }
  deleteEmployee(id:Number){
    return this.httpClient.delete(`${this.baseURL}/employee/delete/${id}`);
  }
}
