package yanti.tari_tradisional.tatra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Button;

import yanti.tari_tradisional.tatra.R;

public class webviewnandak extends Activity {

    private android.webkit.WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewnandak);
        webView = (android.webkit.WebView) findViewById(R.id.webView);
        openBrowser();
    }

    private void openBrowser() {
        // TODO Auto-generated method stub
        String url = "https://www.youtube.com/watch?v=12ACzmbjq2g";
        WebChromeClient wcc = new WebChromeClient();

        webView.setWebChromeClient(wcc);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl(url);
    }

}
