package marqus.jaravata.n01472647;

import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;


public class Activity2 extends AppCompatActivity {

    private TextView textviewer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textviewer = findViewById(R.id.textview_second);
        String pass = getIntent().getStringExtra("Name");
        textviewer.setText(pass);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home: //go back to activity main
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);


        }
    }
    @Override
    public void onBackPressed() {
        Snackbar mySnacks = Snackbar.make(findViewById(android.R.id.content), R.string.Close_app, Snackbar.LENGTH_LONG);
        mySnacks.setAction(R.string.EXIT_APP, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mySnacks.show();

    }
}
