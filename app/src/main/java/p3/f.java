package p3;

import android.graphics.PointF;
import g3.k;
import java.util.ArrayList;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f23678a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        boolean z10;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void d(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2, k kVar) {
        if (dVar.a(i10, kVar.getName())) {
            String name = kVar.getName();
            dVar2.getClass();
            j3.d dVar3 = new j3.d(dVar2);
            dVar3.f19032a.add(name);
            j3.d dVar4 = new j3.d(dVar3);
            dVar4.f19033b = kVar;
            arrayList.add(dVar4);
        }
    }
}
