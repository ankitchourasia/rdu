import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddDeviceComponent } from './add-device.component';
import {DeviceService} from './device.service';
import {FormsModule} from '@angular/forms';
import {ViewDetailsModule} from '../view-details/view-details.module';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    ViewDetailsModule
  ],
  declarations: [AddDeviceComponent],
  providers:[DeviceService]
})
export class AddDeviceModule { }
