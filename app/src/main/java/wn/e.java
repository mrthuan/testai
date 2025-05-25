package wn;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: StatusBarLightDarkHelper.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f31402a;

    static {
        ea.a.p("BXRXdEJzDGFy", "k2V67Nfq");
        f31402a = 0;
    }

    public static void a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            b(activity.getWindow());
        }
    }

    public static void b(Window window) {
        if (window == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.addFlags(67108864);
                window.setAttributes(attributes);
            } else {
                window.addFlags(67109888);
            }
            window.getDecorView().setSystemUiVisibility(4102);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
