package com.example.activitysample.ui.main;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.activitysample.R;
import com.example.activitysample.common.Constant;
import com.example.activitysample.common.models.MessageEvent;
import com.example.activitysample.databinding.ActivityMainBinding;
import com.example.activitysample.ui.base.BaseBindingActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import timber.log.Timber;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding, MainViewModel> {
    private final static int REQUEST_CODE_PERMISSIONS = 2020;
    private final static String[] permissions = {"android.permission.READ_SMS"};


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Class<MainViewModel> getViewModel() {
        return MainViewModel.class;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        if (!isAllPermissionGranted()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(permissions, REQUEST_CODE_PERMISSIONS);
            } else {
                onPermissionGranted();
            }
        } else {
            onPermissionGranted();
        }
    }

    @Override
    public void setupView(Bundle savedInstanceState) {

    }

    @Override
    public void setupData() {
        if (isAllPermissionGranted()) {
        }
    }

    private void onPermissionGranted() {
        setupData();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        switch (event.getTypeEvent()) {
            case Constant.EVENT_CHANGE_CONFIG:
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            Timber.e("onRequestPermissionsResult");
            if (isAllPermissionGranted()) {
                onPermissionGranted();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    protected boolean isAllPermissionGranted() {
        boolean isNotGranted = false;
        for (String permission :
                permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                isNotGranted = true;
            }
        }
        Timber.e("isAllPermissionGranted %b", isNotGranted);
        return !isNotGranted;
    }


}
