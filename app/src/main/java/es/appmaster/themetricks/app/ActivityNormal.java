package es.appmaster.themetricks.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Activity opened as normal
 *
 * @author manolovn
 */
public class ActivityNormal extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

}
