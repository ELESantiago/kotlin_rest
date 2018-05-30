import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from './authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [AuthenticationService]
})
export class LoginComponent implements OnInit {
  credentials = {
    username: '', 
    password: '',
  }

  constructor(
    private authService: AuthenticationService,
  ) { }

  ngOnInit() {
  }

  login() {
    console.log(this.credentials);
    this.authService.login(this.credentials)
    .subscribe();
  }

}
