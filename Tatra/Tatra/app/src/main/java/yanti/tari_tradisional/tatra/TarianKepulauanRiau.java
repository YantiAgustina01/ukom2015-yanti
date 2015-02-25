package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TarianKepulauanRiau extends ActionBarActivity {

    Button btnJateng;
    Button btnpersembahan;
    Button btngmln;
    Button btntgapita;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian_kepulauan_riau);
        {
            btnJateng = (Button) findViewById(R.id.btnJateng);

            btnJateng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent kriau = new Intent(getApplicationContext(), TampilanVideoKepulauanRiau.class);
                    startActivity(kriau);
                }
            });
        }

        {
            btnpersembahan = (Button) findViewById(R.id.btnpersembahan);

            btnpersembahan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btnpersembahan = new Intent(getApplicationContext(), Tampilanvideopersembahan.class);
                    startActivity(btnpersembahan);
                }
            });
        }

        {

            btngmln = (Button) findViewById(R.id.btngmln);

            btngmln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btngmln = new Intent(getApplicationContext(), Tampilanvideogemelan.class);
                    startActivity(btngmln);
                }
            });
        }

            {

             btntgapita = (Button) findViewById(R.id.btntgapita);

             btntgapita.setOnClickListener(new View.OnClickListener()
             {
                @Override
                public void onClick(View v)
                   {
                     Intent btntgapita = new Intent (getApplicationContext(),Tampilantabalgepita.class);
                     startActivity(btntgapita);
                   }
             });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarian_kepulauan_riau, menu);
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
