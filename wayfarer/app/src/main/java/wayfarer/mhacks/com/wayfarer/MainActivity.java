package wayfarer.mhacks.com.wayfarer;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mTransportation;
    Button mCommunication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getActionBar();
        actionBar.hide();
    }

    public void transportation(View view) {

    }

    public void communication(View view) {

    }

    public void directions(View view) {
        EditText from = (EditText) findViewById(R.id.editText);
        EditText destination = (EditText) findViewById(R.id.editText2);
        String sFrom = from.getText().toString();
        String sDestination = destination.getText().toString();

        if(!sFrom.isEmpty() && !sDestination.isEmpty()) {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("4102097369", null, "Hey", null, null);
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter valid values for \"From\" and \"Destination\"", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
