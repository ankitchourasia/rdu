import {Injectable} from '@angular/core';
import {Http,Response} from '@angular/http';
import {Consumer} from './consumer.model';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
@Injectable()
export class ConsumerService{

constructor(private http:Http){

}
  addConsumer(consumer : Consumer){
    return this.http.post("/backend/consumer",consumer).map((response : Response)=>response);
  }
  getConsumerByDevice(device:String){
    return this.http.get("/backend/consumer",device).map((response : Response) => response);
  }
}
