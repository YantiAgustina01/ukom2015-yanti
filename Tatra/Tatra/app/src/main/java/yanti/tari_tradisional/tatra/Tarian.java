package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Tarian extends ActionBarActivity {

    Button btnJatim;
    Button btnjabar;
    Button btnjtg;
    Button btnDKK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarian);

        btnJatim = (Button) findViewById(R.id.btnJatim);

        btnJatim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Masukwebview = new Intent (getApplicationContext(),tampilanvideo.class);
                startActivity(Masukwebview);
            }
        });
        {
            btnjabar = (Button) findViewById(R.id.btnjabar);

            btnjabar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btb = new Intent (getApplicationContext(),Tampilanvideokicir.class);
                    startActivity(btb);
                }
            });
            {
                btnjtg = (Button) findViewById(R.id.btnjtg);

                btnjtg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btnjtg = new Intent (getApplicationContext(),Tampilanvideonandak.class);
                        startActivity(btnjtg);
                    }
                });
                {
                    btnDKK = (Button) findViewById(R.id.btnDKK);

                    btnDKK.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent btnDKK = new Intent (getApplicationContext(),Tampilanvideojali.class);
                            startActivity(btnDKK);
                        }
                    });
                }
            }
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarian, menu);
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
