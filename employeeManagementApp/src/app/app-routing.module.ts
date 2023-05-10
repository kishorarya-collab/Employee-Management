import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmployeeComponent } from './modules/list-employee/list-employee.component';
import { AddEmployeeComponent } from './modules/add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

const routes: Routes = [
  {path: 'employees',component:ListEmployeeComponent},
  {path:'',redirectTo:'employees',pathMatch:'full'},
  {path:'addEmployee',component:AddEmployeeComponent},
  {path:'updateEmployee/:id',component:UpdateEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
