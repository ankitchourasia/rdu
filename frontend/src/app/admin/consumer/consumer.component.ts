import { Component, OnInit } from '@angular/core';
import {DeviceService} from '../add-device/device.service';
import {Device} from '../add-device/device.model';
import {Consumer} from './consumer.model';
import {ConsumerService} from './consumer.service';


@Component({
  selector: 'app-consumer',
  templateUrl: './consumer.component.html',
  styleUrls: ['./consumer.component.css']
})
export class ConsumerComponent implements OnInit {

  devices : Array<Device>;
  consumer : Consumer;
  constructor(private deviceService : DeviceService,private consumerService:ConsumerService) {
    this.devices = new Array<Device>();
    this.consumer = new Consumer();

  }
  ngOnInit() {
     this.deviceService.getAllDevices().subscribe(success => {
      this.devices = success.json();
      console.log(this.devices);
    }, error=>{
      console.log("error occurred while fetching the Devices");
      console.log(error);
    });
  }



  addConsumer(){
    this.consumerService.addConsumer(this.consumer).subscribe(success=>{
      console.log(this.consumer);
      console.log(success.json);
    },error=>{
      console.log(error);
    });
  }
  newFunction(){
    console.log("function called");
  }

}
