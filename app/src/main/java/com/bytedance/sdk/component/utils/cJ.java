package com.bytedance.sdk.component.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;

/* compiled from: ActivityUtil.java */
/* loaded from: classes.dex */
public class cJ {

    /* compiled from: ActivityUtil.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();

        void Qhi(Throwable th2);
    }

    public static boolean Qhi(Context context, Intent intent, Qhi qhi) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (qhi != null) {
                    qhi.Qhi();
                    return true;
                }
                return true;
            } catch (Throwable th2) {
                if (qhi != null) {
                    qhi.Qhi(th2);
                }
            }
        }
        return false;
    }

    public static Activity Qhi(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(16908290)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
