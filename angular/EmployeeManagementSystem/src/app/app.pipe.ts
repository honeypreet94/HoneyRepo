import {Pipe,PipeTransform} from '@angular/core';

@Pipe({
    name:'employeeFilter'
})

export class EmployeeFilterPipe implements PipeTransform{
    transform(value:any[], args:string, filterMetadata:any) : any[]{
        let filter:string = args? args.toLocaleLowerCase() :null;
        let filteredItems=filter? value.filter((employee) => 
        employee.name.toLocaleLowerCase().startsWith(filter) != false) : value;
        filterMetadata.count=filteredItems.length;

        return filteredItems;
        //return filter? value.filter((employee) => 
        //employee.name.toLocaleLowerCase().startsWith(filter) != false) : value;
    }
}