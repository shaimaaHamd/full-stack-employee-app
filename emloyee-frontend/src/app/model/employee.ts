export class Employee {
  id: number;
  employeeCode: string;
  name: string;
  birthDate: Date;
  birthCity: BirthCity;
  department: Department;
  jobTitle: string;
  directManger: string;
  contractType: ContractType;
  status: Status;
}

export class BirthCity {
  id: number;
  birthCity: string;
}

export class ContractType {
  id: number;
  contractType: string;
}

export class Department {
  id: number;
  department: string;
}

export class Status {
  id: number;
  status: string;
}
