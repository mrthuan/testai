package h5;

import android.content.Context;

/* compiled from: SPRepo.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f18014h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static volatile c f18015i;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18016a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f18017b;
    public Integer c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f18018d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f18019e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f18020f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f18021g;

    /* compiled from: SPRepo.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final c a(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            c cVar = c.f18015i;
            if (cVar == null) {
                synchronized (this) {
                    cVar = c.f18015i;
                    if (cVar == null) {
                        Context applicationContext = context.getApplicationContext();
                        kotlin.jvm.internal.g.d(applicationContext, "context.applicationContext");
                        cVar = new c(applicationContext);
                        c.f18015i = cVar;
                    }
                }
            }
            return cVar;
        }
    }

    public c(Context context) {
        this.f18016a = context;
    }

    public final int a() {
        if (this.c == null) {
            this.c = Integer.valueOf(j5.a.f19040b.a(this.f18016a).a("pi_mdit", 0));
        }
        Integer num = this.c;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int b() {
        if (this.f18019e == null) {
            this.f18019e = Integer.valueOf(j5.a.f19040b.a(this.f18016a).a("pi_mdstt", 0));
        }
        Integer num = this.f18019e;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int c() {
        if (this.f18020f == null) {
            this.f18020f = Integer.valueOf(j5.a.f19040b.a(this.f18016a).a("pi_oat", 0));
        }
        Integer num = this.f18020f;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int d() {
        if (this.f18017b == null) {
            this.f18017b = Integer.valueOf(j5.a.f19040b.a(this.f18016a).a("pi_udsmu", 100000));
        }
        Integer num = this.f18017b;
        if (num == null) {
            return 100000;
        }
        return num.intValue();
    }

    public final boolean e() {
        if (this.f18018d == null) {
            this.f18018d = Boolean.valueOf(j5.a.f19040b.a(this.f18016a).f19041a.getBoolean("pb_iluaf", false));
        }
        Boolean bool = this.f18018d;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void f(boolean z10) {
        this.f18018d = Boolean.valueOf(z10);
        j5.a.f19040b.a(this.f18016a).f19041a.edit().putBoolean("pb_iluaf", z10).apply();
    }

    public final void g(int i10) {
        this.f18020f = Integer.valueOf(i10);
        j5.a.b(j5.a.f19040b.a(this.f18016a), "pi_oat", i10);
    }

    public final void h(int i10) {
        this.f18017b = Integer.valueOf(i10);
        j5.a.b(j5.a.f19040b.a(this.f18016a), "pi_udsmu", i10);
    }
}
