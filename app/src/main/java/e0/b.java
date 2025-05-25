package e0;

import b0.k;
import b0.m;
import b0.n;
import f0.o;

/* compiled from: StopLogic.java */
/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: a  reason: collision with root package name */
    public final n f16318a;

    /* renamed from: b  reason: collision with root package name */
    public k f16319b;
    public m c;

    public b() {
        n nVar = new n();
        this.f16318a = nVar;
        this.c = nVar;
    }

    @Override // f0.o
    public final float a() {
        return this.c.b();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        n nVar = this.f16318a;
        this.c = nVar;
        nVar.f5256l = f10;
        if (f10 > f11) {
            z10 = true;
        } else {
            z10 = false;
        }
        nVar.f5255k = z10;
        if (z10) {
            nVar.d(-f12, f10 - f11, f14, f15, f13);
        } else {
            nVar.d(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.c.getInterpolation(f10);
    }
}
