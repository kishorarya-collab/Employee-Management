import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import {NgxPaginationModule} from 'ngx-pagination';

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
import { OrgProfileComponent } from './modules/Organization/org-profile/org-profile.component';
import { DepProfileComponent } from './modules/Department/dep-profile/dep-profile.component';
import { EmpProfileComponent } from './modules/Employee/emp-profile/emp-profile.component';
import { LoginComponent } from './modules/login/login.component';

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
    OrgProfileComponent,
    DepProfileComponent,
    EmpProfileComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxPaginationModule
  ],
  providers: [EmployeeManagementService,ListEmployeeComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
