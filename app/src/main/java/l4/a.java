package l4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c4.g;
import c4.k;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import l4.a;
import lib.zj.office.fc.hpsf.Variant;
import p4.j;
import t3.h;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public int f20479a;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f20482e;

    /* renamed from: f  reason: collision with root package name */
    public int f20483f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f20484g;

    /* renamed from: h  reason: collision with root package name */
    public int f20485h;

    /* renamed from: m  reason: collision with root package name */
    public boolean f20490m;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f20492o;

    /* renamed from: p  reason: collision with root package name */
    public int f20493p;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20497t;

    /* renamed from: u  reason: collision with root package name */
    public Resources.Theme f20498u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f20499v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f20500w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f20501x;

    /* renamed from: z  reason: collision with root package name */
    public boolean f20503z;

    /* renamed from: b  reason: collision with root package name */
    public float f20480b = 1.0f;
    public v3.f c = v3.f.c;

    /* renamed from: d  reason: collision with root package name */
    public Priority f20481d = Priority.NORMAL;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20486i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f20487j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f20488k = -1;

    /* renamed from: l  reason: collision with root package name */
    public t3.b f20489l = o4.c.f22740b;

    /* renamed from: n  reason: collision with root package name */
    public boolean f20491n = true;

    /* renamed from: q  reason: collision with root package name */
    public t3.e f20494q = new t3.e();

    /* renamed from: r  reason: collision with root package name */
    public p4.b f20495r = new p4.b();

    /* renamed from: s  reason: collision with root package name */
    public Class<?> f20496s = Object.class;

    /* renamed from: y  reason: collision with root package name */
    public boolean f20502y = true;

    public static boolean l(int i10, int i11) {
        if ((i10 & i11) != 0) {
            return true;
        }
        return false;
    }

    public final T A(h<Bitmap>... hVarArr) {
        if (hVarArr.length > 1) {
            return z(new t3.c(hVarArr), true);
        }
        if (hVarArr.length == 1) {
            return z(hVarArr[0], true);
        }
        s();
        return this;
    }

    public final a B() {
        if (this.f20499v) {
            return clone().B();
        }
        this.f20503z = true;
        this.f20479a |= 1048576;
        s();
        return this;
    }

    public T a(a<?> aVar) {
        if (this.f20499v) {
            return (T) clone().a(aVar);
        }
        if (l(aVar.f20479a, 2)) {
            this.f20480b = aVar.f20480b;
        }
        if (l(aVar.f20479a, 262144)) {
            this.f20500w = aVar.f20500w;
        }
        if (l(aVar.f20479a, 1048576)) {
            this.f20503z = aVar.f20503z;
        }
        if (l(aVar.f20479a, 4)) {
            this.c = aVar.c;
        }
        if (l(aVar.f20479a, 8)) {
            this.f20481d = aVar.f20481d;
        }
        if (l(aVar.f20479a, 16)) {
            this.f20482e = aVar.f20482e;
            this.f20483f = 0;
            this.f20479a &= -33;
        }
        if (l(aVar.f20479a, 32)) {
            this.f20483f = aVar.f20483f;
            this.f20482e = null;
            this.f20479a &= -17;
        }
        if (l(aVar.f20479a, 64)) {
            this.f20484g = aVar.f20484g;
            this.f20485h = 0;
            this.f20479a &= -129;
        }
        if (l(aVar.f20479a, 128)) {
            this.f20485h = aVar.f20485h;
            this.f20484g = null;
            this.f20479a &= -65;
        }
        if (l(aVar.f20479a, 256)) {
            this.f20486i = aVar.f20486i;
        }
        if (l(aVar.f20479a, 512)) {
            this.f20488k = aVar.f20488k;
            this.f20487j = aVar.f20487j;
        }
        if (l(aVar.f20479a, 1024)) {
            this.f20489l = aVar.f20489l;
        }
        if (l(aVar.f20479a, 4096)) {
            this.f20496s = aVar.f20496s;
        }
        if (l(aVar.f20479a, 8192)) {
            this.f20492o = aVar.f20492o;
            this.f20493p = 0;
            this.f20479a &= -16385;
        }
        if (l(aVar.f20479a, 16384)) {
            this.f20493p = aVar.f20493p;
            this.f20492o = null;
            this.f20479a &= -8193;
        }
        if (l(aVar.f20479a, Variant.VT_RESERVED)) {
            this.f20498u = aVar.f20498u;
        }
        if (l(aVar.f20479a, 65536)) {
            this.f20491n = aVar.f20491n;
        }
        if (l(aVar.f20479a, 131072)) {
            this.f20490m = aVar.f20490m;
        }
        if (l(aVar.f20479a, 2048)) {
            this.f20495r.putAll(aVar.f20495r);
            this.f20502y = aVar.f20502y;
        }
        if (l(aVar.f20479a, 524288)) {
            this.f20501x = aVar.f20501x;
        }
        if (!this.f20491n) {
            this.f20495r.clear();
            this.f20490m = false;
            this.f20479a = this.f20479a & (-2049) & (-131073);
            this.f20502y = true;
        }
        this.f20479a |= aVar.f20479a;
        this.f20494q.f29923b.i(aVar.f20494q.f29923b);
        s();
        return this;
    }

    public final T c() {
        return (T) x(DownsampleStrategy.c, new c4.f());
    }

    public final T d() {
        return (T) r(DownsampleStrategy.f7041b, new g(), true);
    }

    @Override // 
    /* renamed from: e */
    public T clone() {
        try {
            T t4 = (T) super.clone();
            t3.e eVar = new t3.e();
            t4.f20494q = eVar;
            eVar.f29923b.i(this.f20494q.f29923b);
            p4.b bVar = new p4.b();
            t4.f20495r = bVar;
            bVar.putAll(this.f20495r);
            t4.f20497t = false;
            t4.f20499v = false;
            return t4;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f20480b, this.f20480b) == 0 && this.f20483f == aVar.f20483f && j.a(this.f20482e, aVar.f20482e) && this.f20485h == aVar.f20485h && j.a(this.f20484g, aVar.f20484g) && this.f20493p == aVar.f20493p && j.a(this.f20492o, aVar.f20492o) && this.f20486i == aVar.f20486i && this.f20487j == aVar.f20487j && this.f20488k == aVar.f20488k && this.f20490m == aVar.f20490m && this.f20491n == aVar.f20491n && this.f20500w == aVar.f20500w && this.f20501x == aVar.f20501x && this.c.equals(aVar.c) && this.f20481d == aVar.f20481d && this.f20494q.equals(aVar.f20494q) && this.f20495r.equals(aVar.f20495r) && this.f20496s.equals(aVar.f20496s) && j.a(this.f20489l, aVar.f20489l) && j.a(this.f20498u, aVar.f20498u)) {
                return true;
            }
        }
        return false;
    }

    public final T f(Class<?> cls) {
        if (this.f20499v) {
            return (T) clone().f(cls);
        }
        this.f20496s = cls;
        this.f20479a |= 4096;
        s();
        return this;
    }

    public final T g(v3.f fVar) {
        if (this.f20499v) {
            return (T) clone().g(fVar);
        }
        com.google.android.play.core.assetpacks.c.l(fVar);
        this.c = fVar;
        this.f20479a |= 4;
        s();
        return this;
    }

    public final T h() {
        return t(g4.h.f17664b, Boolean.TRUE);
    }

    public final int hashCode() {
        float f10 = this.f20480b;
        char[] cArr = j.f23703a;
        return j.e(j.e(j.e(j.e(j.e(j.e(j.e((((((((((((((j.e((j.e((j.e(((Float.floatToIntBits(f10) + 527) * 31) + this.f20483f, this.f20482e) * 31) + this.f20485h, this.f20484g) * 31) + this.f20493p, this.f20492o) * 31) + (this.f20486i ? 1 : 0)) * 31) + this.f20487j) * 31) + this.f20488k) * 31) + (this.f20490m ? 1 : 0)) * 31) + (this.f20491n ? 1 : 0)) * 31) + (this.f20500w ? 1 : 0)) * 31) + (this.f20501x ? 1 : 0), this.c), this.f20481d), this.f20494q), this.f20495r), this.f20496s), this.f20489l), this.f20498u);
    }

    public final T i() {
        if (this.f20499v) {
            return (T) clone().i();
        }
        this.f20495r.clear();
        this.f20490m = false;
        this.f20491n = false;
        this.f20479a = (this.f20479a & (-2049) & (-131073)) | 65536;
        this.f20502y = true;
        s();
        return this;
    }

    public final T j(int i10) {
        if (this.f20499v) {
            return (T) clone().j(i10);
        }
        this.f20483f = i10;
        this.f20482e = null;
        this.f20479a = (this.f20479a | 32) & (-17);
        s();
        return this;
    }

    public final T k(Drawable drawable) {
        if (this.f20499v) {
            return (T) clone().k(drawable);
        }
        this.f20482e = drawable;
        this.f20483f = 0;
        this.f20479a = (this.f20479a | 16) & (-33);
        s();
        return this;
    }

    public final a m(DownsampleStrategy downsampleStrategy, c4.d dVar) {
        if (this.f20499v) {
            return clone().m(downsampleStrategy, dVar);
        }
        t3.d dVar2 = DownsampleStrategy.f7044f;
        com.google.android.play.core.assetpacks.c.l(downsampleStrategy);
        t(dVar2, downsampleStrategy);
        return z(dVar, false);
    }

    public final T n(int i10, int i11) {
        if (this.f20499v) {
            return (T) clone().n(i10, i11);
        }
        this.f20488k = i10;
        this.f20487j = i11;
        this.f20479a |= 512;
        s();
        return this;
    }

    public final T o(int i10) {
        if (this.f20499v) {
            return (T) clone().o(i10);
        }
        this.f20485h = i10;
        this.f20484g = null;
        this.f20479a = (this.f20479a | 128) & (-65);
        s();
        return this;
    }

    public final T p(Drawable drawable) {
        if (this.f20499v) {
            return (T) clone().p(drawable);
        }
        this.f20484g = drawable;
        this.f20485h = 0;
        this.f20479a = (this.f20479a | 64) & (-129);
        s();
        return this;
    }

    public final T q(Priority priority) {
        if (this.f20499v) {
            return (T) clone().q(priority);
        }
        com.google.android.play.core.assetpacks.c.l(priority);
        this.f20481d = priority;
        this.f20479a |= 8;
        s();
        return this;
    }

    public final a r(DownsampleStrategy downsampleStrategy, c4.d dVar, boolean z10) {
        a m10;
        if (z10) {
            m10 = x(downsampleStrategy, dVar);
        } else {
            m10 = m(downsampleStrategy, dVar);
        }
        m10.f20502y = true;
        return m10;
    }

    public final void s() {
        if (!this.f20497t) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final <Y> T t(t3.d<Y> dVar, Y y10) {
        if (this.f20499v) {
            return (T) clone().t(dVar, y10);
        }
        com.google.android.play.core.assetpacks.c.l(dVar);
        com.google.android.play.core.assetpacks.c.l(y10);
        this.f20494q.f29923b.put(dVar, y10);
        s();
        return this;
    }

    public final T u(t3.b bVar) {
        if (this.f20499v) {
            return (T) clone().u(bVar);
        }
        com.google.android.play.core.assetpacks.c.l(bVar);
        this.f20489l = bVar;
        this.f20479a |= 1024;
        s();
        return this;
    }

    public final T v(float f10) {
        if (this.f20499v) {
            return (T) clone().v(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.f20480b = f10;
            this.f20479a |= 2;
            s();
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public final a w() {
        if (this.f20499v) {
            return clone().w();
        }
        this.f20486i = false;
        this.f20479a |= 256;
        s();
        return this;
    }

    public final a x(DownsampleStrategy downsampleStrategy, c4.d dVar) {
        if (this.f20499v) {
            return clone().x(downsampleStrategy, dVar);
        }
        t3.d dVar2 = DownsampleStrategy.f7044f;
        com.google.android.play.core.assetpacks.c.l(downsampleStrategy);
        t(dVar2, downsampleStrategy);
        return z(dVar, true);
    }

    public final <Y> T y(Class<Y> cls, h<Y> hVar, boolean z10) {
        if (this.f20499v) {
            return (T) clone().y(cls, hVar, z10);
        }
        com.google.android.play.core.assetpacks.c.l(hVar);
        this.f20495r.put(cls, hVar);
        this.f20491n = true;
        int i10 = this.f20479a | 2048 | 65536;
        this.f20479a = i10;
        this.f20502y = false;
        if (z10) {
            this.f20479a = i10 | 131072;
            this.f20490m = true;
        }
        s();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T z(h<Bitmap> hVar, boolean z10) {
        if (this.f20499v) {
            return (T) clone().z(hVar, z10);
        }
        k kVar = new k(hVar, z10);
        y(Bitmap.class, hVar, z10);
        y(Drawable.class, kVar, z10);
        y(BitmapDrawable.class, kVar, z10);
        y(g4.c.class, new g4.e(hVar), z10);
        s();
        return this;
    }
}
