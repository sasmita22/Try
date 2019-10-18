package id.bigio.homecare.atry.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import id.bigio.homecare.atry.model.Company;
import id.bigio.homecare.atry.model.Employee;

public class MainViewModel extends AndroidViewModel {
    MutableLiveData<List<Company>> companyLiveData = new MutableLiveData<>();
    MutableLiveData<List<Employee>> employeeLiveData = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    void fetchData(){

    }

}
