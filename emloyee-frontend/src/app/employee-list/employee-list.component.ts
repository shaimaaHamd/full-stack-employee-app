import { Component, OnInit } from '@angular/core';
import {BirthCity, ContractType, Department, Employee, Status} from '../model/employee';
import { EmployeeService } from '../service/employee.service';
import { Router } from '@angular/router';
import {HttpErrorResponse} from '@angular/common/http';
import {FormBuilder, FormGroup} from '@angular/forms';
import {RelevantService} from '../service/RelevantService';
@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
   public birthCities: BirthCity[];
  public departments: Department [];
  public types: ContractType[];
  public statuses: Status[];
  public employees: Employee[];
  public temp: Employee[];
  public actions: any[];
  cityValue: string;
  departmentValue: string;
  typeValue: string;
  statusValue: string;
  public eDate: Date;
  eId: string;
  eTitle: string;
  eManger: string;
  edit: string;
  constructor(private employeeService: EmployeeService, private relevantService: RelevantService,
              private router: Router) {
   }

  ngOnInit(): void {
    this.getEmployees();
    this.getBirthCities();
    this.getDepartments();
    this.getStatus();
    this.getContractTypes();
    }

   public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
        this.temp = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  public deleteEmployee(id: number): void{
    this.employeeService.deleteEmployee(id).subscribe(
      (response: void) => {
        console.log(response);
        this.getEmployees();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
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

  updateFilterCode(event): void{
    const val = event.target.value.toString().toLowerCase();
    console.log(val);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.employeeCode.toLowerCase().indexOf(val) !== -1 );
    });
    this.temp = temp;
  }
  updateFilterName(event): void{
    const val = event.target.value.toString().toLowerCase();
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.name.toLowerCase().indexOf(val) !== -1 );
    });
    this.temp = temp;
  }
  updateFilterDate(event): void{
    console.log(event.target.value);
    console.log(this.eDate.valueOf());
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.birthDate.valueOf() === this.eDate.valueOf() );
    });
    this.temp = temp;
  }
  updateFilterCty(): void{
     console.log(this.cityValue);
     this.temp = this.employees;
     const temp = this.temp.filter(item => {
      return (item.birthCity.birthCity.indexOf(this.cityValue) !== -1 );
    });
     this.temp = temp;
  }
  updateFilterId(event): void{
    const val = event.target.value;
    console.log(val);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.id.valueOf().toString().toLowerCase().indexOf(val) !== -1);
    });
    this.temp = temp;
  }
  updateFilterDepartment(): void{
     console.log(this.departmentValue);
     this.temp = this.employees;
     const temp = this.temp.filter(item => {
      return (item.department.department.indexOf(this.departmentValue) !== -1 );
    });
     this.temp = temp;
  }
  updateFilterTitle(event): void{
    const val = event.target.value.toString().toLowerCase();
    console.log(val);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.jobTitle.toLowerCase().indexOf(val) !== -1 );
    });
    this.temp = temp;
  }
  updateFilterManger(event): void{
    const val = event.target.value.toString().toLowerCase();
    console.log(val);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.directManger.toLowerCase().indexOf(val) !== -1 );
    });
    this.temp = temp;
  }
  updateFilterType(): void{
 //   const val = event.target.value.toString().toLowerCase();
    console.log(this.typeValue);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.contractType.contractType.indexOf(this.typeValue) !== -1 );
    });
    this.temp = temp;
  }
  updateFilterStatus(): void{
    console.log(this.statusValue);
    this.temp = this.employees;
    const temp = this.temp.filter(item => {
      return (item.status.status.indexOf(this.statusValue) !== -1 );
    });
    this.temp = temp;
  }


  // tslint:disable-next-line:typedef
  updateEmployee(id: number){
    this.router.navigate(['update-employee', id]);
  }


}
