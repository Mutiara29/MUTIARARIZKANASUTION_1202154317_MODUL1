package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edJml, edMkn;
    Button btupnormal, bteatbuss, btkembali;
    TextView txtmenu, txtjumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edJml = (EditText) findViewById(R.id.editText);
        edMkn = (EditText) findViewById(R.id.editTextMenu);
        btupnormal = (Button) findViewById(R.id.btnupnormal);
        bteatbuss = (Button) findViewById(R.id.btneatbus);



        btupnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.abnormal);
                double vJmlh;
                String vMenu ;
                vJmlh=Double.valueOf(edJml.getText().toString().trim());
                vMenu=String.valueOf(edMkn.getText().toString().trim());
                Toast.makeText(getApplicationContext(), "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();

            }
        });
        bteatbuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView (R.layout.eatbus);
                double vJmlh;
                String vMenu;
                vJmlh=Double.valueOf(edJml.getText().toString().trim());
                vMenu=String.valueOf(edMkn.getText().toString().trim());
                Toast.makeText(getApplicationContext(), "Jangan disni makan malamnya , kamu ga akan kuat,Sertifikast SCM belum diambil :'(", Toast.LENGTH_SHORT).show();


            }
        });

    }

}
