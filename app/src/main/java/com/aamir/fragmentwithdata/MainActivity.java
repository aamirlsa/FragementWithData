package com.aamir.fragmentwithdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=editText.getText().toString();
                Bundle b=new Bundle();
                b.putString("key",message);
                MalikFragment malikFragment=new MalikFragment();
                malikFragment.setArguments(b);


                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLayout,malikFragment)
                        .commit();
            }
        });
    }
}
