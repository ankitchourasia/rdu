import { Component, OnInit } from '@angular/core';
import {Device} from './device.model';
import {DeviceService} from './device.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-device',
  templateUrl: './add-device.component.html',
  styleUrls: ['./add-device.component.css']
})
export class AddDeviceComponent implements OnInit {
  device : Device;
  constructor(private deviceService:DeviceService, private router: Router) {
    this.device = new Device();
  }

  ngOnInit() {
  }
  addDevice(){
    console.log("inside add Device Method");
    console.log(this.device);
    this.deviceService.addDevice(this.device).subscribe(success => {
      console.log("Created Successfully.");
      console.log(success.json());
      this.router.navigate(['/addDevice'])    },error=>{
      console.log(error);
      console.log("Fat gaya");
    });
  }

}
