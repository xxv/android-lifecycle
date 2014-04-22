package com.example.lifecyclelog;

import android.text.TextUtils;
import android.util.Log;

/**
 * Lifecycle monitoring utility
 */
public final class Util {

    public enum LifecycleState {
        CALL_TO_SUPER,
        RETURN_FROM_SUPER
    }

    public static void recLifeCycle(Class<?> callingClass, LifecycleState state) {
        final String note;
        switch (state) {

            case CALL_TO_SUPER:
                note = "→☐";
                break;
            case RETURN_FROM_SUPER:
                note = "☐→";
                break;
            default:
                note = null;
        }
        recLifeCycle(callingClass, note);
    }

    private static void recLifeCycle(Class<?> callingClass, String note) {
        String className = callingClass.getSimpleName();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        String methodName = s[4].getMethodName();

        Log.i("LifecycleLog",
                className + "." + methodName + (TextUtils.isEmpty(note) ? "" : " / " + note));
    }
}
