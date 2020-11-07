package com.uptcasa.uptocasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deplaySplashScrean();
    }

    private void deplaySplashScrean() {
        Completable.timer(5, TimeUnit.SECONDS,
                AndroidSchedulers.mainThread()).subscribe(() -> Toast.makeText(SplashScreenActivity.this,"splash screan is done",Toast.LENGTH_SHORT).show());
    }
}