package com.camstarts.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find id
        mWebView = (WebView)findViewById(R.id.web_view);
        //create web settings
        WebSettings webSettings = mWebView.getSettings();

        mWebView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
        //Allow in html5
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);

        //String URL
        String url = "https://m.youtube.com/";
        mWebView.loadUrl(url);

    }
}
