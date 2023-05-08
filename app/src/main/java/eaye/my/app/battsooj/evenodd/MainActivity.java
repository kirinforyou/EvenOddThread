package eaye.my.app.battsooj.evenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_query = findViewById(R.id.edit_query);
        findViewById(R.id.buttonPanel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edit_query.getText().toString();
                if (!data.isEmpty()) {
                    char c = data.charAt(0);
                    if (c%2==0)
                        Toast.makeText(MainActivity.this, c + " is even", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, c + " is odd.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}