package f2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class y extends x {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f17093k = true;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f17094l = true;

    @SuppressLint({"NewApi"})
    public void i0(View view, Matrix matrix) {
        if (f17093k) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f17093k = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void j0(View view, Matrix matrix) {
        if (f17094l) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f17094l = false;
            }
        }
    }
}
