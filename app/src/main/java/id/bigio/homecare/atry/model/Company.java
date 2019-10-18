package id.bigio.homecare.atry.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Company {
    @PrimaryKey
    private int id;
    private String name;
    private ArrayList<Employee> employees;
}
