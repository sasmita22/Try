package id.bigio.homecare.atry.model.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import id.bigio.homecare.atry.model.Company;

@Dao
public interface CompanyDao {
    @Insert
    public void insert(Company... companies);

    @Query("Select * from Company")
    public List<Company> getAllCompany();
}
