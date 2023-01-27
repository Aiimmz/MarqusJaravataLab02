package marqus.jaravata.n01472647;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button button_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_first = findViewById(R.id.button_first);
        button_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.a_Have_a_label_with_ur_name_center_of_screen), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Name", "Marqus Jaravata");
                startActivity(intent);
            }
        });
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
