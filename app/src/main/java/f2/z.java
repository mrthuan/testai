package f2;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class z extends y {

    /* renamed from: m  reason: collision with root package name */
    public static boolean f17095m = true;

    @SuppressLint({"NewApi"})
    public void k0(View view, int i10, int i11, int i12, int i13) {
        if (f17095m) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f17095m = false;
            }
        }
    }
}
