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
public class EventsFragment extends Fragment {

    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_events, container, false);

        webView = (WebView) rootView.findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadData("<iframe src=\"https://www.google.com/calendar/embed?showTz=0&amp;src=students.rowan.edu_gj0umqr01gtm1ofgc576fu3ujs%40group.calendar.google.com&amp;ctz=America/New_York\" style=\"border: 0\" width=\"" + "100%" + "\" height=\"" + "100%" + "\" frameborder=\"0\" scrolling=\"no\"> </iframe>", "text/html", "utf-8");
        //initial calendar iframe load

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
