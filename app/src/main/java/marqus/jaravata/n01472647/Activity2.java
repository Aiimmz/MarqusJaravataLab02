package marqus.jaravata.n01472647;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Activity2 extends AppCompatActivity {

    private TextView textviewer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textviewer = findViewById(R.id.textview_second);
        String pass = getIntent().getStringExtra("Name");
        textviewer.setText(pass);

    }

}