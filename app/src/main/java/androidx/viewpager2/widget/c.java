package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.g f4855a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f4856b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f4857d;

    /* renamed from: e  reason: collision with root package name */
    public int f4858e;

    /* renamed from: f  reason: collision with root package name */
    public int f4859f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4860g;

    /* renamed from: h  reason: collision with root package name */
    public int f4861h;

    /* renamed from: i  reason: collision with root package name */
    public int f4862i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4863j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4864k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4865l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4866m;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4867a;

        /* renamed from: b  reason: collision with root package name */
        public float f4868b;
        public int c;
    }

    public c(ViewPager2 viewPager2) {
        this.f4856b = viewPager2;
        ViewPager2.k kVar = viewPager2.f4828j;
        this.c = kVar;
        this.f4857d = (LinearLayoutManager) kVar.getLayoutManager();
        this.f4860g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i10, RecyclerView recyclerView) {
        boolean z10;
        boolean z11;
        ViewPager2.g gVar;
        int i11 = this.f4858e;
        boolean z12 = true;
        if ((i11 != 1 || this.f4859f != 1) && i10 == 1) {
            f(false);
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && i10 == 2) {
            if (this.f4864k) {
                d(2);
                this.f4863j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        a aVar = this.f4860g;
        if (z11 && i10 == 0) {
            g();
            if (!this.f4864k) {
                int i12 = aVar.f4867a;
                if (i12 != -1 && (gVar = this.f4855a) != null) {
                    gVar.b(i12, 0.0f, 0);
                }
            } else if (aVar.c == 0) {
                int i13 = this.f4861h;
                int i14 = aVar.f4867a;
                if (i13 != i14) {
                    c(i14);
                }
            } else {
                z12 = false;
            }
            if (z12) {
                d(0);
                e();
            }
        }
        if (this.f4858e == 2 && i10 == 0 && this.f4865l) {
            g();
            if (aVar.c == 0) {
                int i15 = this.f4862i;
                int i16 = aVar.f4867a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    c(i16);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r7 == r8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f4864k = r6
            r5.g()
            boolean r0 = r5.f4863j
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.f4860g
            r3 = 0
            if (r0 == 0) goto L42
            r5.f4863j = r3
            if (r8 > 0) goto L2b
            if (r8 != 0) goto L29
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f4856b
            androidx.viewpager2.widget.ViewPager2$f r8 = r8.f4825g
            int r8 = r8.N()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L2c
        L2b:
            r7 = r6
        L2c:
            if (r7 == 0) goto L36
            int r7 = r2.c
            if (r7 == 0) goto L36
            int r7 = r2.f4867a
            int r7 = r7 + r6
            goto L38
        L36:
            int r7 = r2.f4867a
        L38:
            r5.f4862i = r7
            int r8 = r5.f4861h
            if (r8 == r7) goto L4e
            r5.c(r7)
            goto L4e
        L42:
            int r7 = r5.f4858e
            if (r7 != 0) goto L4e
            int r7 = r2.f4867a
            if (r7 != r1) goto L4b
            r7 = r3
        L4b:
            r5.c(r7)
        L4e:
            int r7 = r2.f4867a
            if (r7 != r1) goto L53
            r7 = r3
        L53:
            float r8 = r2.f4868b
            int r0 = r2.c
            androidx.viewpager2.widget.ViewPager2$g r4 = r5.f4855a
            if (r4 == 0) goto L5e
            r4.b(r7, r8, r0)
        L5e:
            int r7 = r2.f4867a
            int r8 = r5.f4862i
            if (r7 == r8) goto L66
            if (r8 != r1) goto L74
        L66:
            int r7 = r2.c
            if (r7 != 0) goto L74
            int r7 = r5.f4859f
            if (r7 == r6) goto L74
            r5.d(r3)
            r5.e()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i10) {
        ViewPager2.g gVar = this.f4855a;
        if (gVar != null) {
            gVar.c(i10);
        }
    }

    public final void d(int i10) {
        if ((this.f4858e == 3 && this.f4859f == 0) || this.f4859f == i10) {
            return;
        }
        this.f4859f = i10;
        ViewPager2.g gVar = this.f4855a;
        if (gVar != null) {
            gVar.a(i10);
        }
    }

    public final void e() {
        this.f4858e = 0;
        this.f4859f = 0;
        a aVar = this.f4860g;
        aVar.f4867a = -1;
        aVar.f4868b = 0.0f;
        aVar.c = 0;
        this.f4861h = -1;
        this.f4862i = -1;
        this.f4863j = false;
        this.f4864k = false;
        this.f4866m = false;
        this.f4865l = false;
    }

    public final void f(boolean z10) {
        int i10;
        this.f4866m = z10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        this.f4858e = i10;
        int i11 = this.f4862i;
        if (i11 != -1) {
            this.f4861h = i11;
            this.f4862i = -1;
        } else if (this.f4861h == -1) {
            this.f4861h = this.f4857d.Y0();
        }
        d(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
        if (r5[r1 - 1][1] >= r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.g():void");
    }
}
