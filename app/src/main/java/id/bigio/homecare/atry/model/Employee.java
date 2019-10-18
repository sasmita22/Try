package id.bigio.homecare.atry.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Company.class,parentColumns = "id",childColumns = "company_id"))
public class Employee {
    @PrimaryKey
    private int id;
    private String name;
    @ColumnInfo(name = "company_id")
    private int companyId;
}
