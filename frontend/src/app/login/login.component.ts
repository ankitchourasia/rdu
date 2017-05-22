import { Component, OnInit } from '@angular/core';
import { User } from './login.models';
import { LoginService } from './login.service';
import {Router} from '@angular/router'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user : User;
  constructor(private  loginService : LoginService, private router : Router ) {
    this.user=new User();
   }

  ngOnInit() {
  }

  authenticate(){
    console.log("inside component");
    console.log(this.user);
    this.loginService.authenticate(this.user).subscribe(success => {
      console.log("logged in succesfully.");
      console.log(success.json());
      this.router.navigate(['/admin'])    },error=>{
      console.log(error);
      console.log("Fat gaya");
    });
  }
}
