package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class trangchu extends AppCompatActivity {
    TextView tvTenDangNhap,tvMatKhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        tvTenDangNhap = findViewById(R.id.tvTenDangNhap);
        tvMatKhau=findViewById(R.id.tvMatKhau);
//        tạo bunler lấy data từ bên loginscreen
        Bundle data = getIntent().getBundleExtra("data");
        String TenDangNhap = data.getString("TenDangNhap");
        String MatKhau = data.getString("MatKhau");
        tvTenDangNhap.setText(TenDangNhap);
        tvMatKhau.setText(MatKhau);

    }

}