package f2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class a0 extends z {

    /* renamed from: n  reason: collision with root package name */
    public static boolean f16990n = true;

    @Override // b.b
    @SuppressLint({"NewApi"})
    public void a0(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a0(view, i10);
        } else if (f16990n) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f16990n = false;
            }
        }
    }
}
