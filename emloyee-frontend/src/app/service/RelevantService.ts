import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {BirthCity, ContractType, Department, Employee, Status} from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class RelevantService {

  private baseURL = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }
  public getBirthCities(): Observable<BirthCity[]> {
    return this.httpClient.get<BirthCity[]>(`${this.baseURL}/birthCity/getAllCities`);
  }
  public getDepartments(): Observable<Department[]> {
    return this.httpClient.get<Department[]>(`${this.baseURL}/department/getAllDepartments`);
  }
  public getStatus(): Observable<Status[]> {
    return this.httpClient.get<Status[]>(`${this.baseURL}/status/getAllStatus`);
  }

  public getContractTypes(): Observable<ContractType[]> {
    return this.httpClient.get<ContractType[]>(`${this.baseURL}/contractType/getAllTypes`);
  }

}

