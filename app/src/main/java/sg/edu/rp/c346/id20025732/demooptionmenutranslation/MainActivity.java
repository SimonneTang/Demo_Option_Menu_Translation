package sg.edu.rp.c346.id20025732.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvtranslatedtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvtranslatedtext = findViewById(R.id.textViewTranslatedtext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvtranslatedtext.setText("Hello ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvtranslatedtext.setText("Ciao");
            return true;
        } else {
            tvtranslatedtext.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }


}