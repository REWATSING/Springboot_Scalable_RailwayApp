import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiUrl = 'http://localhost:8080/api/auth';  // Spring Boot backend URL

  constructor(private http: HttpClient) { }

  // Registration method
  register(user: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/register`, user);  // POST request to backend
  }

  // Login method
  login(user: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/login`, user);  // POST request to backend
  }
}
