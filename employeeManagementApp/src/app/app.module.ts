import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddEmployeeComponent } from './modules/add-employee/add-employee.component';
import { EmployeeManagementService } from './employee-management.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListEmployeeComponent } from './modules/list-employee/list-employee.component';
import { UpdateEmployeeComponent } from './modules/update-employee/update-employee.component';
import { AdminDashboardComponent } from './modules/admin-dashboard/admin-dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeComponent,
    ListEmployeeComponent,
    UpdateEmployeeComponent,
    AdminDashboardComponent
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
