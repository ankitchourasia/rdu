import { Injectable } from '@angular/core';
import {Device} from '../add-device/device.model';
import {Http,Response} from '@angular/http';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

@Injectable()
export class ViewDetailsService{
  constructor(private http : Http){
  }

  getAllDevices(){
    return this.http.get('/backend/device').map((response : Response)=>response);
  }

  getDeviceStatus(deviceName : string){
    console.log("Getting present status of device for device");
    console.log(deviceName);
    return this.http.get('/backend/device/response/'+btoa(deviceName)).map((response:Response) => response);
  }

  addResponse(device : Device){
    return this.http.post("/backend/device/response",device).map((response : Response)=>response);
  }
}
