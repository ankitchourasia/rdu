import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin.component';
import {AddDeviceModule} from './add-device/add-device.module';
import {ConsumerModule} from './consumer/consumer.module';
import {AdminRoutingModule} from './admin.routing';
import {ViewDetailsModule} from './view-details/view-details.module';

@NgModule({
  imports: [
    CommonModule,
    ConsumerModule,
    AddDeviceModule,
    ViewDetailsModule,
    AdminRoutingModule
  ],
  declarations: [AdminComponent]
})
export class AdminModule { }
