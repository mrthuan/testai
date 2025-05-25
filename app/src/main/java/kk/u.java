package kk;

/* compiled from: Segment.kt */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f19849a;

    /* renamed from: b  reason: collision with root package name */
    public int f19850b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19851d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19852e;

    /* renamed from: f  reason: collision with root package name */
    public u f19853f;

    /* renamed from: g  reason: collision with root package name */
    public u f19854g;

    public u() {
        this.f19849a = new byte[8192];
        this.f19852e = true;
        this.f19851d = false;
    }

    public final u a() {
        u uVar = this.f19853f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f19854g;
        kotlin.jvm.internal.g.b(uVar2);
        uVar2.f19853f = this.f19853f;
        u uVar3 = this.f19853f;
        kotlin.jvm.internal.g.b(uVar3);
        uVar3.f19854g = this.f19854g;
        this.f19853f = null;
        this.f19854g = null;
        return uVar;
    }

    public final void b(u uVar) {
        uVar.f19854g = this;
        uVar.f19853f = this.f19853f;
        u uVar2 = this.f19853f;
        kotlin.jvm.internal.g.b(uVar2);
        uVar2.f19854g = uVar;
        this.f19853f = uVar;
    }

    public final u c() {
        this.f19851d = true;
        return new u(this.f19849a, this.f19850b, this.c, true);
    }

    public final void d(u uVar, int i10) {
        if (uVar.f19852e) {
            int i11 = uVar.c;
            int i12 = i11 + i10;
            byte[] bArr = uVar.f19849a;
            if (i12 > 8192) {
                if (!uVar.f19851d) {
                    int i13 = uVar.f19850b;
                    if (i12 - i13 <= 8192) {
                        kotlin.collections.f.x(bArr, 0, i13, bArr, i11);
                        uVar.c -= uVar.f19850b;
                        uVar.f19850b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = uVar.c;
            int i15 = this.f19850b;
            kotlin.collections.f.x(this.f19849a, i14, i15, bArr, i15 + i10);
            uVar.c += i10;
            this.f19850b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public u(byte[] data, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.g.e(data, "data");
        this.f19849a = data;
        this.f19850b = i10;
        this.c = i11;
        this.f19851d = z10;
        this.f19852e = false;
    }
}
