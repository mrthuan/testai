package c0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.g;
import d0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class b extends ConstraintWidget implements a {

    /* renamed from: w0  reason: collision with root package name */
    public ConstraintWidget[] f5502w0 = new ConstraintWidget[4];

    /* renamed from: x0  reason: collision with root package name */
    public int f5503x0 = 0;

    public final void U(int i10, j jVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f5503x0; i11++) {
            ConstraintWidget constraintWidget = this.f5502w0[i11];
            ArrayList<ConstraintWidget> arrayList2 = jVar.f16030a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i12 = 0; i12 < this.f5503x0; i12++) {
            g.a(this.f5502w0[i12], i10, arrayList, jVar);
        }
    }

    @Override // c0.a
    public final void a() {
        this.f5503x0 = 0;
        Arrays.fill(this.f5502w0, (Object) null);
    }

    @Override // c0.a
    public final void b(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i10 = this.f5503x0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f5502w0;
            if (i10 > constraintWidgetArr.length) {
                this.f5502w0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f5502w0;
            int i11 = this.f5503x0;
            constraintWidgetArr2[i11] = constraintWidget;
            this.f5503x0 = i11 + 1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.j(constraintWidget, hashMap);
        b bVar = (b) constraintWidget;
        this.f5503x0 = 0;
        int i10 = bVar.f5503x0;
        for (int i11 = 0; i11 < i10; i11++) {
            b(hashMap.get(bVar.f5502w0[i11]));
        }
    }

    public void c() {
    }
}
