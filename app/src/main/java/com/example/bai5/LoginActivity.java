package com.example.bai5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String username = edtUsername.getText().toString();
            if (username.isEmpty()) {
                Toast.makeText(this, "Chưa nhập Username!", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            i.putExtra("username", username);
            startActivity(i);
        });
    }
}
