package com.example.office;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class s1 extends AppCompatActivity {
    private WebView myWebView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        this.button = (Button) findViewById(R.id.button1);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/dnps48kWkZRxnwvU9")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button2);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.7714342,  39.2397831/@-6.7716015,39.2373711,17z\n")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button3);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.771327,39.240084/@-6.7713458,39.1700875,28698m/data=!3m1!1e3")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button4);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.770888,  39.239993/")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button5);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.7718116,  39.2407572/")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button6);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.7722896, 39.2408889/")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button7);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.7729278, 39.2413026/")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        this.button = (Button) findViewById(R.id.button8);
        this.button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s1.this.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//-6.7705720, 39.2406237/")));
                Intent browserIntent = new Intent();
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });
    }
}