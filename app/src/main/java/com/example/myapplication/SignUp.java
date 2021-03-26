package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class SignUp extends AppCompatActivity {
    EditText txtTenDangNhap, txtMatKhau, txtNhapLaiMatKhau;
    Button btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        txtTenDangNhap = findViewById(R.id.txtTenDangNhap);
        txtMatKhau = findViewById(R.id.txtMatKhau);
        txtNhapLaiMatKhau = findViewById(R.id.txtNhapLaiMatKhau);
        btnDangKy = findViewById(R.id.btnDangKy);
        btnDangKy.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             String usr = txtTenDangNhap.getText().toString();
                                             String pwd = txtMatKhau.getText().toString();
                                             String cfpwd = txtNhapLaiMatKhau.getText().toString();
                                             if (usr.isEmpty() || pwd.isEmpty() || cfpwd.isEmpty()) {
                                                 Toast.makeText(SignUp.this,
                                                         "Không bỏ trống",
                                                         Toast.LENGTH_SHORT).show();

                                             } else {
                                                 if (!pwd.equals(cfpwd)) {
                                                     Toast.makeText(SignUp.this,
                                                             "mật khẩu không khớp",
                                                             Toast.LENGTH_SHORT).show();
                                                 } else {
                                                     Toast.makeText(SignUp.this,
                                                             "tên đăng nhập" + usr + "mạtkhua" + pwd + "cfpas" + cfpwd,
                                                             Toast.LENGTH_LONG).show();
                                                 }
                                             }

                                         }
                                     }
        );
    }

    ;
};