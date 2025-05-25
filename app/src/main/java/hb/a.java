package hb;

import com.google.android.play.core.assetpacks.b1;
import eb.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: RequestLimiter.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final long f18140d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f18141e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final k f18142a;

    /* renamed from: b  reason: collision with root package name */
    public long f18143b;
    public int c;

    public a() {
        if (b1.f13179b == null) {
            Pattern pattern = k.c;
            b1.f13179b = new b1();
        }
        b1 b1Var = b1.f13179b;
        if (k.f16549d == null) {
            k.f16549d = new k(b1Var);
        }
        this.f18142a = k.f16549d;
    }

    public final synchronized long a(int i10) {
        boolean z10;
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return f18140d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.f18142a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f18141e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.c != 0) {
            this.f18142a.f16550a.getClass();
            if (System.currentTimeMillis() <= this.f18143b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i10) {
        boolean z10;
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            c();
            return;
        }
        this.c++;
        long a10 = a(i10);
        this.f18142a.f16550a.getClass();
        this.f18143b = System.currentTimeMillis() + a10;
    }
}
