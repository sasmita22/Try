package id.bigio.homecare.atry.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import id.bigio.homecare.atry.R;
import id.bigio.homecare.atry.model.Company;
import id.bigio.homecare.atry.model.Employee;
import id.bigio.homecare.atry.view.adapter.DataAdapter;
import id.bigio.homecare.atry.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    ArrayList<Company> companies;
    RecyclerView recyclerView;
    MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        /*ArrayList<Company> companies = new ArrayList<>();

        for (int i = 0; i < 5;i++){
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee(111+i,"Andrew",1+i));
            employees.add(new Employee(111+i,"Reino",1+i));
            employees.add(new Employee(111+i,"Susan",1+i));
            Company company = new Company(1+i,"Sasmita Corps",employees);
            companies.add(company);
        }*/
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        DataAdapter dataAdapter = new DataAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dataAdapter);

    }
}
