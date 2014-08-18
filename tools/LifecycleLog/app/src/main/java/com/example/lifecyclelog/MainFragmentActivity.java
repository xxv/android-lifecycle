package com.example.lifecyclelog;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.view.Menu;

import static com.example.lifecyclelog.Util.LifecycleState.CALL_TO_SUPER;
import static com.example.lifecyclelog.Util.LifecycleState.RETURN_FROM_SUPER;
import static com.example.lifecyclelog.Util.recLifeCycle;

/**
 * A standard v4 support version of Activity.
 */
public class MainFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        setContentView(R.layout.activity_main_compat);

        FragmentManager.enableDebugLogging(true);
        LoaderManager.enableDebugLogging(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onActivityResult(requestCode, resultCode, data);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onAttachedToWindow() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttachedToWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttachFragment(fragment);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onContentChanged() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onContentChanged();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onDestroy() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDetachedFromWindow() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDetachedFromWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onNewIntent(intent);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPause() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPause();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

    }

    @Override
    protected void onPostResume() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        boolean result = super.onPrepareOptionsMenu(menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        return result;
    }

    @Override
    protected void onRestart() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestoreInstanceState(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onResume() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onResumeFragments() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onResumeFragments();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onWindowFocusChanged(hasFocus);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onUserLeaveHint() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserLeaveHint();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onStart() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

    }

    @Override
    protected void onStop() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStop();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onUserInteraction() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserInteraction();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

}
