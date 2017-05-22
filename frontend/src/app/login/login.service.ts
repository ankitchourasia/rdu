import { Injectable } from '@angular/core';
import {User} from './login.models';
import {Http,Response} from '@angular/http';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

@Injectable()
export class LoginService{

constructor(private http : Http){

}
  authenticate(user : User){
    return this.http.post('/backend/login',user).map((response : Response)=>response);
  }
}
