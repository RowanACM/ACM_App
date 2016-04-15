package com.example.acm.acmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private final static String ACM_URL = "http://elvis.rowan.edu/acm/v1/";
    private final static String ACM_CALENDAR_IFRAME_URL = "https://www.google.com/calendar/embed?showTz=0&amp;src=students.rowan.edu_gj0umqr01gtm1ofgc576fu3ujs%40group.calendar.google.com&amp;ctz=America/New_York";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadData("<iframe src=\"https://www.google.com/calendar/embed?showTz=0&amp;src=students.rowan.edu_gj0umqr01gtm1ofgc576fu3ujs%40group.calendar.google.com&amp;ctz=America/New_York\" style=\"border: 0\" width=\"" + "100%" + "\" height=\"" + "100%" + "\" frameborder=\"0\" scrolling=\"no\"> </iframe>", "text/html", "utf-8");
        //webView.loadUrl(ACM_CALENDAR_IFRAME_URL); // initial page load

        // client overrides loadurl after initial page load (in app, not browser)
        class MyWebViewClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        }
        webView.setWebViewClient(new MyWebViewClient());

    }




}
