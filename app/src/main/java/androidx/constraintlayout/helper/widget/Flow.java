package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.a;
import c0.b;
import g0.d;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: k  reason: collision with root package name */
    public e f2968k;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f2968k = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f2968k.f2910b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar = this.f2968k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f2940y0 = dimensionPixelSize;
                    eVar.f2941z0 = dimensionPixelSize;
                    eVar.A0 = dimensionPixelSize;
                    eVar.B0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar2 = this.f2968k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.A0 = dimensionPixelSize2;
                    eVar2.C0 = dimensionPixelSize2;
                    eVar2.D0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f2968k.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f2968k.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f2968k.f2940y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f2968k.D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f2968k.f2941z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f2968k.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f2968k.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f2968k.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f2968k.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f2968k.N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f2968k.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f2968k.O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f2968k.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f2968k.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f2968k.T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f2968k.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f2968k.U0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f2968k.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f2968k.X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f2968k.Y0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f2968k.V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f2968k.W0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f2968k.f2909a1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3273d = this.f2968k;
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(a.C0012a c0012a, b bVar, Constraints.a aVar, SparseArray sparseArray) {
        super.o(c0012a, bVar, aVar, sparseArray);
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            int i10 = aVar.V;
            if (i10 != -1) {
                eVar.f2910b1 = i10;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        u(this.f2968k, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void p(ConstraintWidget constraintWidget, boolean z10) {
        e eVar = this.f2968k;
        int i10 = eVar.A0;
        if (i10 > 0 || eVar.B0 > 0) {
            if (z10) {
                eVar.C0 = eVar.B0;
                eVar.D0 = i10;
                return;
            }
            eVar.C0 = i10;
            eVar.D0 = eVar.B0;
        }
    }

    public void setFirstHorizontalBias(float f10) {
        this.f2968k.R0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f2968k.L0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f2968k.S0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f2968k.M0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f2968k.X0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f2968k.P0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f2968k.V0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f2968k.J0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f2968k.T0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f2968k.N0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f2968k.U0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f2968k.O0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f2968k.f2909a1 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2968k.f2910b1 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        e eVar = this.f2968k;
        eVar.f2940y0 = i10;
        eVar.f2941z0 = i10;
        eVar.A0 = i10;
        eVar.B0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f2968k.f2941z0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f2968k.C0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f2968k.D0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f2968k.f2940y0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f2968k.Y0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f2968k.Q0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f2968k.W0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f2968k.K0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f2968k.Z0 = i10;
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void u(i iVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (iVar != null) {
            iVar.V(mode, size, mode2, size2);
            setMeasuredDimension(iVar.F0, iVar.G0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
