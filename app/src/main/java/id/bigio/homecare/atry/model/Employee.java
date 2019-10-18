package id.bigio.homecare.atry.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Company.class,parentColumns = "id",childColumns = "company_id"),
        indices = {@Index(name = "idIndex",value = {"company_id"})})
public class Employee {
    @PrimaryKey
    private int id;
    private String name;
    @ColumnInfo(name = "company_id")
    private int companyId;

    public Employee(int id, String name, int companyId) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
