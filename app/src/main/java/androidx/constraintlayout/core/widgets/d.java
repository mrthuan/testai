package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class d extends c0.c {
    public int D0;
    public int E0;

    /* renamed from: z0  reason: collision with root package name */
    public int f2908z0;

    /* renamed from: x0  reason: collision with root package name */
    public final d0.b f2906x0 = new d0.b(this);

    /* renamed from: y0  reason: collision with root package name */
    public final d0.e f2907y0 = new d0.e(this);
    public b.InterfaceC0188b A0 = null;
    public boolean B0 = false;
    public final androidx.constraintlayout.core.c C0 = new androidx.constraintlayout.core.c();
    public int F0 = 0;
    public int G0 = 0;
    public c[] H0 = new c[4];
    public c[] I0 = new c[4];
    public int J0 = 257;
    public boolean K0 = false;
    public boolean L0 = false;
    public WeakReference<ConstraintAnchor> M0 = null;
    public WeakReference<ConstraintAnchor> N0 = null;
    public WeakReference<ConstraintAnchor> O0 = null;
    public WeakReference<ConstraintAnchor> P0 = null;
    public final HashSet<ConstraintWidget> Q0 = new HashSet<>();
    public final b.a R0 = new b.a();

    public static void Y(ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        if (interfaceC0188b == null) {
            return;
        }
        if (constraintWidget.f2827j0 != 8 && !(constraintWidget instanceof f) && !(constraintWidget instanceof a)) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            aVar.f16008a = dimensionBehaviourArr[0];
            boolean z14 = true;
            aVar.f16009b = dimensionBehaviourArr[1];
            aVar.c = constraintWidget.u();
            aVar.f16010d = constraintWidget.o();
            aVar.f16015i = false;
            aVar.f16016j = 0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f16008a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f16009b == dimensionBehaviour2) {
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
            if (z10 && constraintWidget.x(0) && constraintWidget.f2844s == 0 && !z12) {
                aVar.f16008a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z11 && constraintWidget.f2846t == 0) {
                    aVar.f16008a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z10 = false;
            }
            if (z11 && constraintWidget.x(1) && constraintWidget.f2846t == 0 && !z13) {
                aVar.f16009b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z10 && constraintWidget.f2844s == 0) {
                    aVar.f16009b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z11 = false;
            }
            if (constraintWidget.E()) {
                aVar.f16008a = ConstraintWidget.DimensionBehaviour.FIXED;
                z10 = false;
            }
            if (constraintWidget.F()) {
                aVar.f16009b = ConstraintWidget.DimensionBehaviour.FIXED;
                z11 = false;
            }
            int[] iArr = constraintWidget.f2848u;
            if (z12) {
                if (iArr[0] == 4) {
                    aVar.f16008a = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z11) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f16009b;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i11 = aVar.f16010d;
                    } else {
                        aVar.f16008a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.c) interfaceC0188b).b(constraintWidget, aVar);
                        i11 = aVar.f16012f;
                    }
                    aVar.f16008a = dimensionBehaviour4;
                    aVar.c = (int) (constraintWidget.Z * i11);
                }
            }
            if (z13) {
                if (iArr[1] == 4) {
                    aVar.f16009b = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z10) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f16008a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i10 = aVar.c;
                    } else {
                        aVar.f16009b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.c) interfaceC0188b).b(constraintWidget, aVar);
                        i10 = aVar.f16011e;
                    }
                    aVar.f16009b = dimensionBehaviour6;
                    if (constraintWidget.f2810a0 == -1) {
                        aVar.f16010d = (int) (i10 / constraintWidget.Z);
                    } else {
                        aVar.f16010d = (int) (constraintWidget.Z * i10);
                    }
                }
            }
            ((ConstraintLayout.c) interfaceC0188b).b(constraintWidget, aVar);
            constraintWidget.R(aVar.f16011e);
            constraintWidget.O(aVar.f16012f);
            constraintWidget.F = aVar.f16014h;
            int i12 = aVar.f16013g;
            constraintWidget.f2815d0 = i12;
            if (i12 <= 0) {
                z14 = false;
            }
            constraintWidget.F = z14;
            aVar.f16016j = 0;
            return;
        }
        aVar.f16011e = 0;
        aVar.f16012f = 0;
    }

    @Override // c0.c, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void G() {
        this.C0.t();
        this.D0 = 0;
        this.E0 = 0;
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void S(boolean z10, boolean z11) {
        super.S(z10, z11);
        int size = this.f5504w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5504w0.get(i10).S(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:352:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x061c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0696 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0822 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x082e A[LOOP:14: B:494:0x082c->B:495:0x082e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x091d  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // c0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.U():void");
    }

    public final void V(int i10, ConstraintWidget constraintWidget) {
        if (i10 == 0) {
            int i11 = this.F0 + 1;
            c[] cVarArr = this.I0;
            if (i11 >= cVarArr.length) {
                this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.I0;
            int i12 = this.F0;
            cVarArr2[i12] = new c(constraintWidget, 0, this.B0);
            this.F0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.G0 + 1;
            c[] cVarArr3 = this.H0;
            if (i13 >= cVarArr3.length) {
                this.H0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.H0;
            int i14 = this.G0;
            cVarArr4[i14] = new c(constraintWidget, 1, this.B0);
            this.G0 = i14 + 1;
        }
    }

    public final void W(androidx.constraintlayout.core.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean Z = Z(64);
        e(cVar, Z);
        int size = this.f5504w0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.f5504w0.get(i11);
            boolean[] zArr = constraintWidget.U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = this.f5504w0.get(i12);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i13 = 0; i13 < aVar.f5503x0; i13++) {
                        ConstraintWidget constraintWidget3 = aVar.f5502w0[i13];
                        if (aVar.f2860z0 || constraintWidget3.f()) {
                            int i14 = aVar.f2859y0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    constraintWidget3.U[1] = true;
                                }
                            } else {
                                constraintWidget3.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.Q0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget4 = this.f5504w0.get(i15);
            constraintWidget4.getClass();
            if (!(constraintWidget4 instanceof i) && !(constraintWidget4 instanceof f)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                if (constraintWidget4 instanceof i) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.e(cVar, Z);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                int i16 = 0;
                while (true) {
                    if (i16 < iVar.f5503x0) {
                        if (hashSet.contains(iVar.f5502w0[i16])) {
                            z12 = true;
                            continue;
                            break;
                        }
                        i16++;
                    } else {
                        z12 = false;
                        continue;
                        break;
                    }
                }
                if (z12) {
                    iVar.e(cVar, Z);
                    hashSet.remove(iVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().e(cVar, Z);
                }
                hashSet.clear();
            }
        }
        if (androidx.constraintlayout.core.c.f2777p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget5 = this.f5504w0.get(i17);
                constraintWidget5.getClass();
                if (!(constraintWidget5 instanceof i) && !(constraintWidget5 instanceof f)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    hashSet2.add(constraintWidget5);
                }
            }
            if (this.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            d(this, cVar, hashSet2, i10, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, cVar, next);
                next.e(cVar, Z);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                ConstraintWidget constraintWidget6 = this.f5504w0.get(i18);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Q(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.e(cVar, Z);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Q(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, cVar, constraintWidget6);
                    if (!(constraintWidget6 instanceof i) && !(constraintWidget6 instanceof f)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        constraintWidget6.e(cVar, Z);
                    }
                }
            }
        }
        if (this.F0 > 0) {
            b.a(this, cVar, null, 0);
        }
        if (this.G0 > 0) {
            b.a(this, cVar, null, 1);
        }
    }

    public final boolean X(int i10, boolean z10) {
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12 = true;
        boolean z13 = z10 & true;
        d0.e eVar = this.f2907y0;
        d dVar = eVar.f16019a;
        ConstraintWidget.DimensionBehaviour n10 = dVar.n(0);
        ConstraintWidget.DimensionBehaviour n11 = dVar.n(1);
        int v10 = dVar.v();
        int w7 = dVar.w();
        ArrayList<WidgetRun> arrayList = eVar.f16022e;
        if (z13 && (n10 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || n11 == dimensionBehaviour)) {
            Iterator<WidgetRun> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.f2877f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && n10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    dVar.P(ConstraintWidget.DimensionBehaviour.FIXED);
                    dVar.R(eVar.d(dVar, 0));
                    dVar.f2814d.f2876e.d(dVar.u());
                }
            } else if (z13 && n11 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                dVar.Q(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.O(eVar.d(dVar, 1));
                dVar.f2816e.f2876e.d(dVar.o());
            }
        }
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar.V[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int u7 = dVar.u() + v10;
                dVar.f2814d.f2880i.d(u7);
                dVar.f2814d.f2876e.d(u7 - v10);
                z11 = true;
            }
            z11 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar.V[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int o10 = dVar.o() + w7;
                dVar.f2816e.f2880i.d(o10);
                dVar.f2816e.f2876e.d(o10 - w7);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.f2877f == i10 && (next2.f2874b != dVar || next2.f2878g)) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next3 = it3.next();
            if (next3.f2877f == i10 && (z11 || next3.f2874b != dVar)) {
                if (!next3.f2879h.f2869j || !next3.f2880i.f2869j || (!(next3 instanceof d0.c) && !next3.f2876e.f2869j)) {
                    z12 = false;
                    break;
                }
            }
        }
        dVar.P(n10);
        dVar.Q(n11);
        return z12;
    }

    public final boolean Z(int i10) {
        if ((this.J0 & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void r(StringBuilder sb2) {
        sb2.append(this.f2828k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.f5504w0.iterator();
        while (it.hasNext()) {
            it.next().r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
