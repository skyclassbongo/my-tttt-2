package com.example.office;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class s2 extends AppCompatActivity {
    private WebView myWebView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1);

        myWebView = (WebView) findViewById(R.id.web);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        String path = Uri.parse("file:///android_asset/s2.html").toString();
        myWebView.loadUrl(path);

        this.button = (Button) findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s2.this.startActivity(new Intent(s2.this, s1.class));
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                if (myWebView.canGoBack()) {
                    myWebView.goBack();
                } else {
                    finish();
                }
                return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

}