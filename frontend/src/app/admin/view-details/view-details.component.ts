import { Component, OnInit } from '@angular/core';
import {ViewDetailsService} from './view-details.service';
import {Device} from '../add-device/device.model';
import {Consumer} from '../consumer/consumer.model';
import {ConsumerService} from '../consumer/consumer.service';
import {Observable} from 'rxjs/Rx';
@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.css']
})
export class ViewDetailsComponent implements OnInit {

  devices : Device[];
  constructor(private viewDetailsService : ViewDetailsService, private consumerService:ConsumerService) {
    this.devices = [];
    this.currentDevice = new Device();
    Observable.interval(200*60).subscribe(x=>{
      this.deviceChanged();
    })
  }

  ngOnInit() {
    this.viewDetailsService.getAllDevices().subscribe(success=>{
      this.devices = success.json();
      console.log(this.devices[0]);
    },error=>{
      console.log(error);
    });
  }

  selectedDevice: any;
  currentDevice : any;

  deviceChanged(){
    //this.currentDevice.consumers([]);
    console.log("New device selectedDevice");
    console.log(this.selectedDevice.deviceName);
    this.viewDetailsService.getDeviceStatus(this.selectedDevice.deviceName).subscribe(success => {
      console.log("Successfully fetched device status");
      var response = success.json();
      this.selectedDevice.status=response.status;
      this.currentDevice = this.selectedDevice;
      console.log(this.currentDevice);
    },error =>{
      console.log(error);
      console.log("In error after device changed");
      this.currentDevice = null;
    });
  }

  statusChanged(consumer){
    console.log("status changed for consumer");
    console.log(consumer);
    this.currentDevice.status = 'N';
    if(consumer.status === '0') consumer.status = '1';
    else consumer.status = '0';
    this.viewDetailsService.addResponse(this.currentDevice).subscribe(success=>{
      console.log(success.json);
    },error=>{
      console.log(error);
    })

  }


}
