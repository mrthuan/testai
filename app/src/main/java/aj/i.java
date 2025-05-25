package aj;

import androidx.fragment.app.w;

/* compiled from: nsDetector.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public r.d[] f615a;

    /* renamed from: b  reason: collision with root package name */
    public w[] f616b;
    public final l c = new l();

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f617d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public final int[] f618e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    public int f619f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f620g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f621h;

    /* renamed from: i  reason: collision with root package name */
    public o f622i;

    public i() {
        this.f615a = null;
        this.f616b = null;
        this.f615a = new r.d[]{new n(1), new m(1), new j(0), new k(1), new k(0), new p(), new g(0), new m(0), new h(1), new g(1), new j(1), new n(0), new h(0), new g(2), new h(2)};
        this.f616b = new w[]{null, null, new c(), null, new d(), null, new a(), new e(), new f(), null, null, null, null, null, null};
        int length = this.f615a.length;
        this.f621h = true;
        this.f620g = false;
        this.f619f = length;
        for (int i10 = 0; i10 < this.f619f; i10++) {
            this.f617d[i10] = 0;
            this.f618e[i10] = i10;
        }
        this.c.a();
        this.f622i = null;
    }

    public final void a(String str) {
        o oVar = this.f622i;
        if (oVar != null) {
            ((b) oVar).getClass();
            ge.a.f17752b = true;
            ge.a.c = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
        if (r1 == false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.i.b(byte[], int, boolean):void");
    }
}
