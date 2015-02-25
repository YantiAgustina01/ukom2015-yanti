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

public class webviewktimur extends Activity {

    private android.webkit.WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewktimur);
        webView = (android.webkit.WebView) findViewById(R.id.webView);
        openBrowser();
    }

    private void openBrowser() {
        // TODO Auto-generated method stub
        String url = "https://www.youtube.com/watch?v=CAF8217WisQ";
        WebChromeClient wcc = new WebChromeClient();

        webView.setWebChromeClient(wcc);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl(url);
    }

}
