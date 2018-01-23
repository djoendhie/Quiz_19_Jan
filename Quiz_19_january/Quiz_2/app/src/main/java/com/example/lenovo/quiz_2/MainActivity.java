package com.example.lenovo.quiz_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = editText.getText().toString();
                int anomor = Integer.parseInt(nomor);

                if (anomor % 2 == 1) {
                    textView.setText(anomor + " Adalah bil Ganjil");
                } else if (anomor % 2 == 0) {
                    textView.setText(anomor + " Adalah bil Genap");
                }
            }
        });
    }
}
