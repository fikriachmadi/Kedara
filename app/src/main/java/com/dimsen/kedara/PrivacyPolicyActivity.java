package com.dimsen.kedara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dimsen.kedara.main.MainActivity;

public class PrivacyPolicyActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        getSupportActionBar().hide();

        Button btn_ok = findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(PrivacyPolicyActivity.this, MainActivity.class);
        startActivity(intent);
    }
}