import { Component, OnInit } from '@angular/core';
import {BirthCity, ContractType, Department, Employee, Status} from '../model/employee';
import { EmployeeService } from '../service/employee.service';
import {ActivatedRoute, Router} from '@angular/router';
import {RelevantService} from '../service/RelevantService';
import {HttpErrorResponse} from '@angular/common/http';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  public birthCities: BirthCity[];
  public departments: Department [];
  public types: ContractType[];
  public statuses: Status[];
  public status: Status;
  employee: Employee = new Employee();
  id: number;
  constructor(private employeeService: EmployeeService, private relevantService: RelevantService,
               private router: Router) { }

  ngOnInit(): void {
     this.getBirthCities();
    this.getDepartments();
    this.getStatus();
    this.getContractTypes();

   }
  public getBirthCities(): void {
    this.relevantService.getBirthCities().subscribe(
      (response: BirthCity[]) => {
        this.birthCities = response;
        console.log(this.birthCities);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public getDepartments(): void {
    this.relevantService.getDepartments().subscribe(
      (response: Department[]) => {
        this.departments = response;
        console.log(this.departments);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public getStatus(): void {
    this.relevantService.getStatus().subscribe(
      (response: Status[]) => {
        this.statuses = response;
        console.log(this.statuses);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public getContractTypes(): void {
    this.relevantService.getContractTypes().subscribe(
      (response: ContractType[]) => {
        this.types = response;
        console.log(this.types);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  saveEmployee(): void{
    this.employeeService.createEmployee(this.employee).subscribe( data => {
      console.log(data);
      this.goToEmployeeList();
    },
    error => console.log(error));
  }

  goToEmployeeList(): void{
    this.router.navigate(['/employees']);
  }

  onSubmit(): void{
    this.employee.id = 0;
     this.saveEmployee();
  }
}
