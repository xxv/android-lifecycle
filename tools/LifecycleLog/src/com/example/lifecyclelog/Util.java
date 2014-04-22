package com.example.lifecyclelog;

import android.text.TextUtils;
import android.util.Log;

/**
 * Lifecycle monitoring utility
 */
public final class Util {

    public static void recLifeCycle(Class<?>callingClass, String note) {
        String className = callingClass.getSimpleName();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        String methodName = s[3].getMethodName();

        Log.i("LifecycleLog", className + "." + methodName + (TextUtils.isEmpty(note) ? "" : " / " + note));
    }

}
