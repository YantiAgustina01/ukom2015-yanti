package yanti.tari_tradisional.tatra;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class VideoI extends ActionBarActivity {

    Button btnDKI;
    Button btnN2;
    Button btnjwtim;
    Button btntb;
    Button btnpapuabrtt;
    Button btnsutara;
    Button btnygyakarta;
    Button btnGorontaloo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_i);

        btnDKI = (Button) findViewById(R.id.btnDKI);

        btnDKI.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent dki = new Intent (getApplicationContext(),Tarian.class);
                startActivity(dki);
            }
        });
        {
            btnN2 = (Button) findViewById(R.id.btnN2);

            btnN2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bt = new Intent (getApplicationContext(),ListVideoII.class);
                    startActivity(bt);
                }
            });
            {
                btnjwtim = (Button) findViewById(R.id.btnjwtim);

                btnjwtim.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent btnjwtim = new Intent (getApplicationContext(),tarianjwtimur.class);
                        startActivity(btnjwtim);
                    }
                });
                {
                    btntb = (Button) findViewById(R.id.btntb);

                    btntb.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            Intent btntb = new Intent (getApplicationContext(),tarianntb.class);
                            startActivity(btntb);
                        }
                    });
                    {
                        btnpapuabrtt = (Button) findViewById(R.id.btnpapuabrtt);

                        btnpapuabrtt.setOnClickListener(new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                Intent btnpapuabrtt = new Intent (getApplicationContext(),tarianpbarat.class);
                                startActivity(btnpapuabrtt);
                            }
                        });
                        {
                            btnsutara = (Button) findViewById(R.id.btnsutara);

                            btnsutara.setOnClickListener(new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v)
                                {
                                    Intent btnsutara = new Intent (getApplicationContext(),tariansutara.class);
                                    startActivity(btnsutara);
                                }
                            });
                            {
                                btnygyakarta = (Button) findViewById(R.id.btnygyakarta);

                                btnygyakarta.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View v)
                                    {
                                        Intent btnygyakarta = new Intent (getApplicationContext(),tarianyogya.class);
                                        startActivity(btnygyakarta);
                                    }
                                });

                                {
                                    btnGorontaloo = (Button) findViewById(R.id.btnGorontaloo);

                                    btnGorontaloo.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View v)
                                        {
                                            Intent btnGorontaloo = new Intent (getApplicationContext(),tariangrntl.class);
                                            startActivity(btnGorontaloo);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video_i, menu);
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
