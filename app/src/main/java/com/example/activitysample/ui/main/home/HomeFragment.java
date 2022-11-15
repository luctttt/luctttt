package com.example.activitysample.ui.main.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.activitysample.R;
import com.example.activitysample.data.model.Country;
import com.example.activitysample.databinding.FragmentHomeBinding;
import com.example.activitysample.ui.adapter.MyAdapter;
import com.example.activitysample.ui.base.BaseBindingFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends BaseBindingFragment<FragmentHomeBinding, HomeViewModel> {

    List<Country> mCountryList = new ArrayList<>();

    @Override
    protected Class<HomeViewModel> getViewModel() {
        return HomeViewModel.class;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        binding.rcCountry.setLayoutManager(new LinearLayoutManager(requireContext()));

        MyAdapter bindingAdapter = new MyAdapter();
        bindingAdapter.setData(getListData());
        binding.rcCountry.setAdapter(bindingAdapter);

        MyClickHandler myClickHandler = new MyClickHandler(requireContext());
//        binding.shimmerViewContainer.stopShimmerAnimation();
//        binding.shimmerViewContainer.setVisibility(View.GONE);
    }

    private List getListData() {
        for (int i = 0; i < 15; i++) {
            mCountryList.add(new Country(i + "", "Trần Đức Lực", "Number 1"));
        }
        return mCountryList;
    }

    @Override
    public void onResume() {
        super.onResume();
//        binding.shimmerViewContainer.startShimmerAnimation();
    }

    public class MyClickHandler{
        Context context;

        public MyClickHandler(Context context) {
            this.context = context;
        }
        public boolean onProfileImageLongPressed(View view) {
            Toast.makeText(context.getApplicationContext(), "Profile image long pressed!", Toast.LENGTH_LONG).show();
            return false;
        }
    }

}