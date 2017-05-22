import {NgModule} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import {AddDeviceComponent} from './add-device/add-device.component';
import {ConsumerComponent} from './consumer/consumer.component';
import {AdminComponent} from './admin.component';
import {ViewDetailsComponent} from './view-details/view-details.component';


const adminRoutes: Routes = [
{

    path:'admin',
    component: AdminComponent,
    children: [
      {
        path:'addDevice',
        component: AddDeviceComponent,
        pathMatch:'full'
      },{
        path:'addConsumer',
        component: ConsumerComponent,
        pathMatch:'full'
      },{
        path:'viewDetails',
        component: ViewDetailsComponent,
        pathMatch:'full'
      }]
  },

];
@NgModule({
  imports:[RouterModule.forChild(adminRoutes)],
  exports:[RouterModule]
})
export class AdminRoutingModule{

}
