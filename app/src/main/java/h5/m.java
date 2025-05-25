package h5;

import android.content.Context;
import androidx.activity.s;
import com.google.android.gms.tasks.OnFailureListener;
import d8.o;
import o9.q;

/* compiled from: UpgradeManager.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public o9.b f18036a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.activity.result.c<androidx.activity.result.h> f18037b;
    public l c;

    /* renamed from: d  reason: collision with root package name */
    public o9.a f18038d;

    /* renamed from: h  reason: collision with root package name */
    public com.google.android.tools.d f18042h;

    /* renamed from: i  reason: collision with root package name */
    public d5.c f18043i;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18039e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18040f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18041g = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18044j = false;

    /* compiled from: UpgradeManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void h(o9.a aVar);
    }

    public static void f() {
        boolean z10 = c5.a.b().f5565d;
    }

    public final boolean a() {
        boolean z10;
        o9.a aVar = this.f18038d;
        if (aVar == null) {
            return false;
        }
        if (aVar.c == 11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        o9.a aVar = this.f18038d;
        if (aVar != null && s.s(aVar)) {
            return true;
        }
        return false;
    }

    public final void c(Context context, final a aVar) {
        try {
            f();
            o c = e(context).c();
            c.e(new i(this, aVar));
            c.r(new OnFailureListener() { // from class: h5.j
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    m.this.getClass();
                    m.f();
                    aVar.h(null);
                }
            });
            c.q(new androidx.privacysandbox.ads.adservices.java.internal.a(this, aVar));
            c.b(new k(this, 0));
        } catch (Throwable th2) {
            th2.printStackTrace();
            aVar.h(null);
        }
    }

    public final void d(Context context, d5.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18041g = true;
        c(applicationContext, new f(1, this, aVar));
    }

    public final o9.b e(Context context) {
        q qVar;
        if (this.f18036a == null) {
            synchronized (o9.d.class) {
                if (o9.d.f22758a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    o9.d.f22758a = new q(new g3.b(context));
                }
                qVar = o9.d.f22758a;
            }
            this.f18036a = (o9.b) qVar.f22784a.zza();
        }
        return this.f18036a;
    }

    public final int g(boolean z10) {
        String str;
        o9.a aVar;
        boolean z11;
        boolean z12;
        if (!z10) {
            str = "immediate";
        } else {
            str = "flexible";
        }
        try {
            "startUpgrade :".concat(str);
            f();
            aVar = this.f18038d;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (aVar == null) {
            return 1;
        }
        o9.b bVar = this.f18036a;
        if (bVar != null && this.f18037b != null) {
            int i10 = aVar.c;
            if (i10 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return 3;
            }
            if (i10 == 11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (bVar != null) {
                    bVar.b();
                }
                return 3;
            }
            if (s.s(aVar)) {
                if (z10) {
                    if (this.f18038d.a(0)) {
                        boolean a10 = this.f18036a.a(this.f18038d, this.f18037b, o9.c.c(0).a());
                        this.f18040f = a10;
                        if (a10) {
                            this.f18038d = null;
                        }
                        if (!a10) {
                            return -1;
                        }
                        return 0;
                    }
                    f();
                } else if (this.f18038d.a(1)) {
                    boolean a11 = this.f18036a.a(this.f18038d, this.f18037b, o9.c.c(1).a());
                    this.f18039e = a11;
                    if (a11) {
                        this.f18038d = null;
                    }
                    if (!a11) {
                        return -1;
                    }
                    return 0;
                } else {
                    f();
                }
            }
            return -1;
        }
        return 2;
    }
}
