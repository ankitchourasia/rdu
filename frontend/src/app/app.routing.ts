import {NgModule} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {AdminComponent} from './admin/admin.component';
import {AddDeviceComponent} from './admin/add-device/add-device.component'

const routes: Routes = [
  {
    path:'',
    redirectTo:'/login',
    pathMatch:'full'
  },{
    path:'login',
    component: LoginComponent
  },{
    path:'admin',
    component: AdminComponent,
    pathMatch:'full'
  }
];
@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule{

}
