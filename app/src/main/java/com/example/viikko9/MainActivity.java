package com.example.viikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void switchToAddUser(View view){
        Intent intent = new Intent(this, Add_user.class);
        startActivity(intent);
    }
    public void switchToUserList(View view){
        Intent intent = new Intent(this, User_list.class);
        startActivity(intent);
    }
}