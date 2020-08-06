package com.lhk.javabottonmenu;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.lhk.javabottonmenu.job.Helpers;

public class JobActivity extends AppCompatActivity {

    public final String TAG = JobActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(TAG, "MainActivity onCreate() PID:" + android.os.Process.myPid() + " TID:" + android.os.Process.myTid());
        setContentView(R.layout.activity_job);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick_Schedule(View view) {
        Log.w(TAG, "MainActivity onClick_Schedule()");
        Helpers.schedule(this);
    }

    public void onClick_Finished(View view) {
        Log.w(TAG, "MainActivity onClick_Finished()");
        Helpers.jobFinished();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick_Cancel(View view) {
        Log.w(TAG, "MainActivity onClick_Cancel()");
        Helpers.cancelJob(this);
    }

    public void onClick_Enqueue(View view) {
        Log.w(TAG, "MainActivity onClick_Enqueue()");
        Helpers.enqueueJob();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "MainActivity onDestroy()");
    }

}
