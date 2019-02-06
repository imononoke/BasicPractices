package com.isa.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.isa.myapplication.sort.InsertSort;

public class SecondActivity extends AppCompatActivity {

    private final static String TAG = "Second";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "create");
        Log.e("Task", "Second Task id：" + getTaskId());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "start");
        BlackCat blackCat = new BlackCat();
        WhiteCat whiteCat = new WhiteCat();
        Log.e(TAG, "hashcode bl: " + blackCat.hashCode() + ", wh: " + whiteCat.hashCode());
        if (blackCat.equals(whiteCat)) {
            Log.e(TAG, "equal!");
        }

        int[] arr = {3, 19, 31, 33, 58, 6, 9, 1};

        // test sort
        InsertSort insertSort = new InsertSort();
        insertSort.sort(arr);
    }

    private static class WhatIsWrong implements Runnable {

        private static WhatIsWrong instance = new WhatIsWrong();

        static int c = 0;

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                i++;
            }
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.w(TAG, "newIntent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "destroy second");
    }
}
