package f2;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class x extends b.b {

    /* renamed from: j  reason: collision with root package name */
    public static boolean f17092j = true;

    @SuppressLint({"NewApi"})
    public float g0(View view) {
        float transitionAlpha;
        if (f17092j) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f17092j = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void h0(View view, float f10) {
        if (f17092j) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f17092j = false;
            }
        }
        view.setAlpha(f10);
    }
}
