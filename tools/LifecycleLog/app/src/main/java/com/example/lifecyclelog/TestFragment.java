package com.example.lifecyclelog;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.*;

import static com.example.lifecyclelog.Util.LifecycleState.CALL_TO_SUPER;
import static com.example.lifecyclelog.Util.LifecycleState.RETURN_FROM_SUPER;
import static com.example.lifecyclelog.Util.recLifeCycle;

@TargetApi(Build.VERSION_CODES.M)
public class TestFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onActivityCreated(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public View
    onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        recLifeCycle(getClass(), CALL_TO_SUPER);
        View v = inflater.inflate(R.layout.fragment_test, container, false);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onViewCreated(view, savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onActivityResult(requestCode, resultCode, data);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void onAttach(Context context) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttach(context);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        commonOnAttach(getActivity());
    }

    /*
     * Deprecated on API 23
     * Use onAttachToContext instead
     */
    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttach(activity);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        // Prevent double call - Android M calls both onAttach() lifecycle functions for backward compatibility
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            commonOnAttach(activity);
        }
    }

    private void commonOnAttach(Activity activity) {
        // Do some stuff for attach.
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onCreateOptionsMenu(menu, inflater);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDestroy() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDestroyOptionsMenu() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroyOptionsMenu();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDestroyView() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroyView();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDetach() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDetach();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onInflate(activity, attrs, savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onPause() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPause();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onPrepareOptionsMenu(final Menu menu) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPrepareOptionsMenu(menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onResume() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onStart() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onStop() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStop();

        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onViewStateRestored(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }
}
