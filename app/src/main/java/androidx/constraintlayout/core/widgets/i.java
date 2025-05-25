package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class i extends c0.b {

    /* renamed from: y0  reason: collision with root package name */
    public int f2940y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f2941z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public boolean E0 = false;
    public int F0 = 0;
    public int G0 = 0;
    public final b.a H0 = new b.a();
    public b.InterfaceC0188b I0 = null;

    public final void W(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.InterfaceC0188b interfaceC0188b;
        boolean z10;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0188b = this.I0;
            if (interfaceC0188b != null || (constraintWidget2 = this.W) == null) {
                break;
            }
            this.I0 = ((d) constraintWidget2).A0;
        }
        b.a aVar = this.H0;
        aVar.f16008a = dimensionBehaviour;
        aVar.f16009b = dimensionBehaviour2;
        aVar.c = i10;
        aVar.f16010d = i11;
        ((ConstraintLayout.c) interfaceC0188b).b(constraintWidget, aVar);
        constraintWidget.R(aVar.f16011e);
        constraintWidget.O(aVar.f16012f);
        constraintWidget.F = aVar.f16014h;
        int i12 = aVar.f16013g;
        constraintWidget.f2815d0 = i12;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        constraintWidget.F = z10;
    }

    @Override // c0.b, c0.a
    public final void c() {
        for (int i10 = 0; i10 < this.f5503x0; i10++) {
            ConstraintWidget constraintWidget = this.f5502w0[i10];
            if (constraintWidget != null) {
                constraintWidget.H = true;
            }
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
    }
}
