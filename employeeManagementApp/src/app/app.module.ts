import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddEmployeeComponent } from './modules/Employee/add-employee/add-employee.component';
import { EmployeeManagementService } from './employee-management.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListEmployeeComponent } from './modules/Employee/list-employee/list-employee.component';
import { UpdateEmployeeComponent } from './modules/Employee/update-employee/update-employee.component';
import { AdminDashboardComponent } from './modules/admin-dashboard/admin-dashboard.component';
import { AddDepartmentComponent } from './modules/Department/add-department/add-department.component';
import { ListDepartmentComponent } from './modules/Department/list-department/list-department.component';
import { UpdateDepartmentComponent } from './modules/Department/update-department/update-department.component';
import { ListOrganizationComponent } from './modules/Organization/list-organization/list-organization.component';
import { AddOrganizationComponent } from './modules/Organization/add-organization/add-organization.component';
import { UpdateOrganizationComponent } from './modules/Organization/update-organization/update-organization.component';
import { OrgDetailsComponent } from './modules/org-details/org-details.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeComponent,
    ListEmployeeComponent,
    UpdateEmployeeComponent,
    AdminDashboardComponent,
    AddDepartmentComponent,
    ListDepartmentComponent,
    UpdateDepartmentComponent,
    ListOrganizationComponent,
    UpdateOrganizationComponent,
    AddOrganizationComponent,
    OrgDetailsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [EmployeeManagementService,ListEmployeeComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
