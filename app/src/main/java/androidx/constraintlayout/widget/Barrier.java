package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import g0.d;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: i  reason: collision with root package name */
    public int f3259i;

    /* renamed from: j  reason: collision with root package name */
    public int f3260j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f3261k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f3261k.f2860z0;
    }

    public int getMargin() {
        return this.f3261k.A0;
    }

    public int getType() {
        return this.f3259i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f3261k = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f3261k.f2860z0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f3261k.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3273d = this.f3261k;
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(a.C0012a c0012a, c0.b bVar, Constraints.a aVar, SparseArray sparseArray) {
        super.o(c0012a, bVar, aVar, sparseArray);
        if (bVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) bVar;
            boolean z10 = ((androidx.constraintlayout.core.widgets.d) bVar.W).B0;
            a.b bVar2 = c0012a.f3373e;
            u(aVar2, bVar2.f3401g0, z10);
            aVar2.f2860z0 = bVar2.f3417o0;
            aVar2.A0 = bVar2.f3403h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(ConstraintWidget constraintWidget, boolean z10) {
        u(constraintWidget, this.f3259i, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f3261k.f2860z0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f3261k.A0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f3261k.A0 = i10;
    }

    public void setType(int i10) {
        this.f3259i = i10;
    }

    public final void u(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f3260j = i10;
        if (z10) {
            int i11 = this.f3259i;
            if (i11 == 5) {
                this.f3260j = 1;
            } else if (i11 == 6) {
                this.f3260j = 0;
            }
        } else {
            int i12 = this.f3259i;
            if (i12 == 5) {
                this.f3260j = 0;
            } else if (i12 == 6) {
                this.f3260j = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).f2859y0 = this.f3260j;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
