package id.bigio.homecare.atry.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.bigio.homecare.atry.R;
import id.bigio.homecare.atry.model.Company;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    ArrayList<Company> companies;

    public DataAdapter() {
        companies = new ArrayList<>();
    }

    public DataAdapter(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public void addNewData(List<Company> companies){
        this.companies.addAll(companies);
        notifyDataSetChanged();
    }

    public void clearData(){
        companies.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(companies.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
