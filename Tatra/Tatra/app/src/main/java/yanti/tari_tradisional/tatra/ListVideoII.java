package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ListVideoII extends ActionBarActivity {

    Button btnRiau;
    Button btnaceh;
    Button btnGorontalo2;
    Button btnkalimantansltn;
    Button btnkalimantantmr;
    Button btnlampungg;
    Button btnMlk;
    Button btnN1ab;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_video_ii);
        {
            btnRiau = (Button) findViewById(R.id.btnRiau);

            btnRiau.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent btnRiau = new Intent (getApplicationContext(),TarianKepulauanRiau.class);
                    startActivity(btnRiau);
                }
            });
            {
                btnaceh = (Button) findViewById(R.id.btnaceh);

                btnaceh.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent btnaceh = new Intent (getApplicationContext(),Tarianaceh.class);
                        startActivity(btnaceh);
                    }
                });
                {
                    btnGorontalo2 = (Button) findViewById(R.id.btnGorontalo2);

                    btnGorontalo2.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            Intent btnGorontalo2 = new Intent (getApplicationContext(),taribali.class);
                            startActivity(btnGorontalo2);
                        }
                    });
                    {

                        btnkalimantansltn = (Button) findViewById(R.id.btnkalimantansltn);

                        btnkalimantansltn.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Intent btnkalimantansltn = new Intent (getApplicationContext(),tariankselatan.class);
                                startActivity(btnkalimantansltn);
                            }
                        });
                        {
                            btnkalimantantmr = (Button) findViewById(R.id.btnkalimantantmr);

                            btnkalimantantmr.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    Intent btnkalimantantmr = new Intent (getApplicationContext(),tarianktimur.class);
                                    startActivity(btnkalimantantmr);
                                }
                            });
                            {
                                btnlampungg = (Button) findViewById(R.id.btnlampungg);

                                btnlampungg.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent btnlampungg = new Intent (getApplicationContext(),tarianlampung.class);
                                        startActivity(btnlampungg);
                                    }
                                });
                                {
                                    btnMlk = (Button) findViewById(R.id.btnMlk);

                                    btnMlk.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent btnMlk = new Intent (getApplicationContext(),tarianmaluku.class);
                                            startActivity(btnMlk);
                                        }
                                    });
                                    {
                                        btnN1ab = (Button) findViewById(R.id.btnN1ab);

                                        btnN1ab.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent btnN1ab = new Intent (getApplicationContext(),VideoI.class);
                                                startActivity(btnN1ab);
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_video_ii, menu);
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
