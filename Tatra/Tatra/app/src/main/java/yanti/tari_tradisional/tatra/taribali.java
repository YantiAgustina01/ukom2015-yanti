package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class taribali extends ActionBarActivity {

    Button btnpndt;
    Button btnkck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taribali);

        btnpndt = (Button) findViewById(R.id.btnpndt);

        btnpndt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnpndt = new Intent (getApplicationContext(),Tampilanvideopendet.class);
                startActivity(btnpndt);
            }
        });
        {
            btnkck = (Button) findViewById(R.id.btnkck);

            btnkck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btnkck = new Intent (getApplicationContext(),Tampilanvideokecak.class);
                    startActivity(btnkck);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_taribali, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
