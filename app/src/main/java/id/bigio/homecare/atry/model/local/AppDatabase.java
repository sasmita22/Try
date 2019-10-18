package id.bigio.homecare.atry.model.local;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import id.bigio.homecare.atry.model.Company;
import id.bigio.homecare.atry.model.Employee;

@Database(entities = {Company.class, Employee.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null){
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "mydatabase")
                    .build();
        }
        return instance;
    }

    public abstract CompanyDao companyDao();
    public abstract EmployeeDao employeeDao();
}
