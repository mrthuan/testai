package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class a {
    @SuppressLint({"DiscouragedApi", "InternalInsetResource"})
    public static final int a(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "<this>");
        try {
            int identifier = activity.getResources().getIdentifier(ea.a.p("GHQEdBxzEGIpcjloUWkwaHQ=", "qgkeiOiF"), ea.a.p("V2kmZW4=", "R2fPtScR"), ea.a.p("OW4IchppZA==", "D1Xlu9l2"));
            if (identifier > 0) {
                return activity.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final boolean b(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "<this>");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static final boolean c(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "<this>");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static final void d(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "<this>");
        Window window = activity.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            i.j(window, 1286);
            View decorView = window.getDecorView();
            kotlin.jvm.internal.g.d(decorView, ea.a.p("K2VSbwtWXmV3", "BtAMcCYg"));
            i.f(window, decorView, 1, 2);
        }
    }
}
