package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    Button btnDangNhap, btnDangKy;
    EditText txtTenDangNhap, txtMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnDangKy = findViewById(R.id.btnDangKy);
        txtTenDangNhap = findViewById(R.id.txtTenDangNhap);
        txtMatKhau = findViewById(R.id.txtMatKhau);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               String usr = txtTenDangNhap.getText().toString();
                                               String pwd = txtMatKhau.getText().toString();
                                               if (usr.isEmpty() || pwd.isEmpty()) {
                                                   Toast.makeText(LoginScreen.this,
                                                           "Vui lòng nhập tên đăng nhập và mật khẩu",
                                                           Toast.LENGTH_SHORT).show();
                                               } else {
                                                   if (usr.equals("tranlongvu") && pwd.equals("1")) {
                                                       Toast.makeText(LoginScreen.this,
                                                               "Đăng Nhập Thành công",
                                                               Toast.LENGTH_SHORT).show();
                                                       Intent i = new Intent(LoginScreen.this, trangchu.class);
                                                       Bundle bundle = new Bundle();
                                                       bundle.putString("TenDangNhap", usr);
                                                       bundle.putString("MatKhau", pwd);
                                                       i.putExtra("data", bundle);
                                                       startActivity(i);

                                                   } else {
                                                       Toast.makeText(LoginScreen.this,
                                                               "Tài khoản hoặc mật khẩu sai",
                                                               Toast.LENGTH_SHORT).show();
                                                   }
                                               }

                                           }
                                       }
        );
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreen.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}