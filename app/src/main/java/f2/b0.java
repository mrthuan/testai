package f2;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class b0 extends a0 {
    @Override // f2.a0, b.b
    public final void a0(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // f2.x
    public final float g0(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // f2.x
    public final void h0(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // f2.y
    public final void i0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f2.y
    public final void j0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // f2.z
    public final void k0(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }
}
