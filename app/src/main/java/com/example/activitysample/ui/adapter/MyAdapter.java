package com.example.activitysample.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitysample.R;
import com.example.activitysample.common.Constant;
import com.example.activitysample.data.model.Country;
import com.example.activitysample.databinding.Item2Binding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Item2Binding binding;

    private List<Country> mCountryList;

    public void setData(List<Country> mCountryList) {
        this.mCountryList = mCountryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_2, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(mCountryList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mCountryList == null ? 0 : mCountryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Item2Binding binding;

        public ViewHolder(Item2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindData(Country country, int position) {
            binding.setText123(position + "");
            binding.setCountry(country);
            binding.setLink(Constant.LINK_IMAGE_CAT);
            binding.setSubmit(5000000000L);
        }
    }
}
