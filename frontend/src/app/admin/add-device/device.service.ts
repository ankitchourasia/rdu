import { Injectable } from '@angular/core';
import {Device} from './device.model';
import {Http,Response} from '@angular/http';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

@Injectable()
export class DeviceService{

constructor(private http : Http){

}
  addDevice(device : Device){
    return this.http.post('/backend/device',device).map((response : Response)=>response);
  }
  getAllDevices(){
    return this.http.get('/backend/device').map((response : Response)=>response);
  }
}
