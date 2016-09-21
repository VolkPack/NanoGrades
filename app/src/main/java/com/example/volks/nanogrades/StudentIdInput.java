package com.example.volks.nanogrades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentIdInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_id_input);

        Button proceed = (Button) findViewById(R.id.proceed_to_main);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText editText = (EditText) findViewById(R.id.idInput);
                String id = editText.getText().toString();
                Intent intent = new Intent(StudentIdInput.this, MainActivity.class);
                getIntent().putExtra("STUDENT_ID", id);
                startActivity(intent);
            }
        });
    }
}
