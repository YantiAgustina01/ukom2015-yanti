package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class tarianjwtimur extends ActionBarActivity {

    Button btnrmng;
    Button btnponorogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarianjwtimur);

        btnrmng = (Button) findViewById(R.id.btnrmng);

        btnrmng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnrmng = new Intent (getApplicationContext(),tampilanvideoremong.class);
                startActivity(btnrmng);
            }
        });
        {
            btnponorogo = (Button) findViewById(R.id.btnponorogo);

            btnponorogo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btnponorogo = new Intent (getApplicationContext(),tampilanvideoreog.class);
                    startActivity(btnponorogo);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarianjwtimur, menu);
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
