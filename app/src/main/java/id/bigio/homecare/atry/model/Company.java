package id.bigio.homecare.atry.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity/*(indices = {@Index(value = {"id"},unique = true)})*/
public class Company {
    @PrimaryKey
    private int id;
    private String name;
    @Ignore
    private ArrayList<Employee> employees;

    public Company() {
    }

    public Company(int id, String name, ArrayList<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employees) {
        this.employees.add(employees);
    }

    @NonNull
    @Override
    public String toString() {
        String toString = "companyId : "+this.id+"\n" +
                "companyName : "+this.name+"\n" +
                "employees : \n" +
                "";
        if (employees != null){
            for (Employee employee :
                    this.employees) {
                toString+= "- "+employee.getName()+"\n";
            }
        }

        return toString;
    }
}
