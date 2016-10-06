package himkmr.and_prtflo_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //only method that deals with button clicks
    public void onButtonClick(View view) {
        Toast toast;
        switch (view.getId()) {
            case (R.id.button_bigger):
                toast = Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_cap):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Capstone app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_hawk):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Stock Hawk app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_material):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Material app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_movie):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Movies app", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case (R.id.button_ub):
                toast = Toast.makeText(getApplicationContext(), "This will launch my Ubiquitous app", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }


}
