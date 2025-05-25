package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class h extends i {
    @Override // androidx.constraintlayout.core.widgets.i
    public final void V(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        int i14 = this.C0 + this.D0 + 0;
        int i15 = this.f2940y0 + this.f2941z0 + 0;
        if (this.f5503x0 > 0) {
            i14 += this.f5502w0[0].u();
            i15 += this.f5502w0[0].o();
        }
        int max = Math.max(this.f2817e0, i14);
        int max2 = Math.max(this.f2819f0, i15);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(max, i11);
            } else if (i10 == 0) {
                i11 = max;
            } else {
                i11 = 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(max2, i13);
            } else if (i12 == 0) {
                i13 = max2;
            } else {
                i13 = 0;
            }
        }
        this.F0 = i11;
        this.G0 = i13;
        R(i11);
        O(i13);
        if (this.f5503x0 > 0) {
            z10 = true;
        }
        this.E0 = z10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        super.e(cVar, z10);
        if (this.f5503x0 > 0) {
            ConstraintWidget constraintWidget = this.f5502w0[0];
            constraintWidget.H();
            constraintWidget.f2823h0 = 0.5f;
            constraintWidget.f2821g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.h(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.h(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.h(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.h(type4, this, type4, 0);
        }
    }
}
