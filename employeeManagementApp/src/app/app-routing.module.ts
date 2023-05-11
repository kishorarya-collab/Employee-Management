import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmployeeComponent } from './modules/list-employee/list-employee.component';
import { AddEmployeeComponent } from './modules/add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './modules/update-employee/update-employee.component';
import { AdminDashboardComponent } from './modules/admin-dashboard/admin-dashboard.component';

const routes: Routes = [
  {path: 'employees',component:ListEmployeeComponent},
  {path:'adminDashboard',component:AdminDashboardComponent},
  {path:'',redirectTo:'adminDashboard',pathMatch:'full'},
  {path:'addEmployee',component:AddEmployeeComponent},
  {path:'updateEmployee/:id',component:UpdateEmployeeComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
