package es.appmaster.themetricks.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private Button showActivityNormal;
    private Button showActivityPopup;
    private Button showActivityPopupOnLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showActivityNormal = (Button) findViewById(R.id.show_activity_normal);
        showActivityNormal.setOnClickListener(this);
        showActivityPopup = (Button) findViewById(R.id.show_activity_as_dialog);
        showActivityPopup.setOnClickListener(this);
        showActivityPopupOnLarge = (Button) findViewById(R.id.show_activity_as_dialog_on_large_screen);
        showActivityPopupOnLarge.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.show_activity_normal:
                Intent intent1 = new Intent(this, ActivityNormal.class);
                startActivity(intent1);
                break;
            case R.id.show_activity_as_dialog:
                Intent intent2 = new Intent(this, ActivityPopup.class);
                startActivity(intent2);
                break;
            case R.id.show_activity_as_dialog_on_large_screen:
                Intent intent3 = new Intent(this, ActivityPopupLargeScreen.class);
                startActivity(intent3);
                break;
        }
    }
}
