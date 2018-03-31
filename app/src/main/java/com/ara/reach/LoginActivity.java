package com.ara.reach;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.ara.reach.utils.AppConstants;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login_clicked(View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
        Button button=(Button) findViewById(R.id.btn_login);
        button.setAnimation(buttonClick);
    }

    public void link_signup_onclick(View view) {
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivityForResult(intent, AppConstants.SIGN_UP_ACTIVITY_CODE);
    }
}
