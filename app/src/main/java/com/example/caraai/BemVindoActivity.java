package com.example.caraai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");

        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome + ", seja bem vindo.");
    }
}