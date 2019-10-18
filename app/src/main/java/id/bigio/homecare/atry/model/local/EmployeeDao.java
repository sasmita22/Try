package id.bigio.homecare.atry.model.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import id.bigio.homecare.atry.model.Employee;

@Dao
public interface EmployeeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertEmployee(Employee... employees);

    @Query("select * from Employee")
    public List<Employee> getAllEmployee();

    @Query("select * from Employee where company_id=:id")
    public List<Employee> getEmployeeById(int id);
}
