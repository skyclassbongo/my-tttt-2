package com.example.office;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class s5 extends AppCompatActivity {
    private WebView myWebView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1);

        myWebView = (WebView) findViewById(R.id.web);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        String path = Uri.parse("file:///android_asset/s1.html").toString();
        myWebView.loadUrl(path);

        this.button = (Button) findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s5.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/dnps48kWkZRxnwvU9")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });
    }
}