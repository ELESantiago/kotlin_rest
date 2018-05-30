import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { AppConfig } from '../../libs/AppConfig';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  apiUrl = AppConfig.apiUrl();
  constructor(private http: HttpClient) { }

  public login(credentials: any) {
    return this.http.post(`${this.apiUrl}/login`, credentials);
    
  }
}
