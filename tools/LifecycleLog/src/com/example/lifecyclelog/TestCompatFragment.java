package com.example.lifecyclelog;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.lifecyclelog.Util.recLifeCycle;

public class TestCompatFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onActivityCreated(savedInstanceState);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public View
            onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        recLifeCycle(getClass(), "→☐");
        View v = inflater.inflate(R.layout.fragment_test, container, false);
        recLifeCycle(getClass(), "☐→");
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onViewCreated(view, savedInstanceState);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        recLifeCycle(getClass(), "→☐");
        super.onActivityResult(requestCode, resultCode, data);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onAttach(Activity activity) {
        recLifeCycle(getClass(), "→☐");
        super.onAttach(activity);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        recLifeCycle(getClass(), "→☐");
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onDestroy() {
        recLifeCycle(getClass(), "→☐");
        super.onDestroy();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onDestroyView() {
        recLifeCycle(getClass(), "→☐");
        super.onDestroyView();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onDetach() {
        recLifeCycle(getClass(), "→☐");
        super.onDetach();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onInflate(activity, attrs, savedInstanceState);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onPause() {
        recLifeCycle(getClass(), "→☐");
        super.onPause();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onResume() {
        recLifeCycle(getClass(), "→☐");
        super.onResume();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        recLifeCycle(getClass(), "→☐");
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onStart() {
        recLifeCycle(getClass(), "→☐");
        super.onStart();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onStop() {
        recLifeCycle(getClass(), "→☐");
        super.onStop();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onViewStateRestored(savedInstanceState);
        recLifeCycle(getClass(), "☐→");

    }
}
