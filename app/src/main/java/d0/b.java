package d0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f16006a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f16007b = new a();
    public final androidx.constraintlayout.core.widgets.d c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f16008a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f16009b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f16010d;

        /* renamed from: e  reason: collision with root package name */
        public int f16011e;

        /* renamed from: f  reason: collision with root package name */
        public int f16012f;

        /* renamed from: g  reason: collision with root package name */
        public int f16013g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16014h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16015i;

        /* renamed from: j  reason: collision with root package name */
        public int f16016j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: d0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0188b {
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.c = dVar;
    }

    public final boolean a(int i10, ConstraintWidget constraintWidget, InterfaceC0188b interfaceC0188b) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f16007b;
        aVar.f16008a = dimensionBehaviour;
        boolean z14 = true;
        aVar.f16009b = dimensionBehaviourArr[1];
        aVar.c = constraintWidget.u();
        aVar.f16010d = constraintWidget.o();
        aVar.f16015i = false;
        aVar.f16016j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f16008a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour2 == dimensionBehaviour3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.f16009b == dimensionBehaviour3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && constraintWidget.Z > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && constraintWidget.Z > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr = constraintWidget.f2848u;
        if (z12 && iArr[0] == 4) {
            aVar.f16008a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f16009b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.c) interfaceC0188b).b(constraintWidget, aVar);
        constraintWidget.R(aVar.f16011e);
        constraintWidget.O(aVar.f16012f);
        constraintWidget.F = aVar.f16014h;
        int i11 = aVar.f16013g;
        constraintWidget.f2815d0 = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        constraintWidget.F = z14;
        aVar.f16016j = 0;
        return aVar.f16015i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int i13 = dVar.f2817e0;
        int i14 = dVar.f2819f0;
        dVar.f2817e0 = 0;
        dVar.f2819f0 = 0;
        dVar.R(i11);
        dVar.O(i12);
        if (i13 < 0) {
            dVar.f2817e0 = 0;
        } else {
            dVar.f2817e0 = i13;
        }
        if (i14 < 0) {
            dVar.f2819f0 = 0;
        } else {
            dVar.f2819f0 = i14;
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.c;
        dVar2.f2908z0 = i10;
        dVar2.U();
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.f16006a;
        arrayList.clear();
        int size = dVar.f5504w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = dVar.f5504w0.get(i10);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.f2907y0.f16020b = true;
    }
}
