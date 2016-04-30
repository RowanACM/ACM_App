package com.example.acm.acmapp.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.acm.acmapp.R;

/**
 * Created by Nick on 4/30/2016.
 */
public class HomeFragment extends Fragment {

    private final static String ACM_URL = "http://elvis.rowan.edu/acm/v1/";
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        webView = (WebView) rootView.findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(ACM_URL); // initial page load

        // client overrides loadurl after initial page load (in app, not browser)
        class MyWebViewClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        }
        webView.setWebViewClient(new MyWebViewClient());



        return rootView;
    }
}
