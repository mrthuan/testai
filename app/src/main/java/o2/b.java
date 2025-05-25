package o2;

import android.os.Build;
import androidx.work.NetworkType;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f22668i = new b(new a());

    /* renamed from: a  reason: collision with root package name */
    public NetworkType f22669a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22670b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22671d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22672e;

    /* renamed from: f  reason: collision with root package name */
    public long f22673f;

    /* renamed from: g  reason: collision with root package name */
    public long f22674g;

    /* renamed from: h  reason: collision with root package name */
    public c f22675h;

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public NetworkType f22676a = NetworkType.NOT_REQUIRED;

        /* renamed from: b  reason: collision with root package name */
        public final long f22677b = -1;
        public final long c = -1;

        /* renamed from: d  reason: collision with root package name */
        public final c f22678d = new c();
    }

    public b() {
        this.f22669a = NetworkType.NOT_REQUIRED;
        this.f22673f = -1L;
        this.f22674g = -1L;
        this.f22675h = new c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22670b != bVar.f22670b || this.c != bVar.c || this.f22671d != bVar.f22671d || this.f22672e != bVar.f22672e || this.f22673f != bVar.f22673f || this.f22674g != bVar.f22674g || this.f22669a != bVar.f22669a) {
            return false;
        }
        return this.f22675h.equals(bVar.f22675h);
    }

    public final int hashCode() {
        long j10 = this.f22673f;
        long j11 = this.f22674g;
        return this.f22675h.hashCode() + (((((((((((((this.f22669a.hashCode() * 31) + (this.f22670b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.f22671d ? 1 : 0)) * 31) + (this.f22672e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public b(a aVar) {
        this.f22669a = NetworkType.NOT_REQUIRED;
        this.f22673f = -1L;
        this.f22674g = -1L;
        this.f22675h = new c();
        this.f22670b = false;
        int i10 = Build.VERSION.SDK_INT;
        this.c = false;
        this.f22669a = aVar.f22676a;
        this.f22671d = false;
        this.f22672e = false;
        if (i10 >= 24) {
            this.f22675h = aVar.f22678d;
            this.f22673f = aVar.f22677b;
            this.f22674g = aVar.c;
        }
    }

    public b(b bVar) {
        this.f22669a = NetworkType.NOT_REQUIRED;
        this.f22673f = -1L;
        this.f22674g = -1L;
        this.f22675h = new c();
        this.f22670b = bVar.f22670b;
        this.c = bVar.c;
        this.f22669a = bVar.f22669a;
        this.f22671d = bVar.f22671d;
        this.f22672e = bVar.f22672e;
        this.f22675h = bVar.f22675h;
    }
}
