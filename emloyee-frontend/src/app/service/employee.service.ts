import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = 'http://localhost:8080/employee';

  constructor(private httpClient: HttpClient) { }
  public getEmployees(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.baseURL}/getAllEmployees`);
  }

  public deleteEmployee(employeeId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseURL}/deleteById/${employeeId}`);
  }

  createEmployee(employee: Employee): Observable<Employee>{
    return this.httpClient.post<Employee>(`${this.baseURL}/createEmployee`, employee);
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/getById/${id}`);
  }

}
