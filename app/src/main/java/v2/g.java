package v2;

import android.content.Context;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.m2;
import com.google.android.play.core.assetpacks.s2;
import com.google.android.play.core.assetpacks.u0;
import com.google.android.play.core.assetpacks.z;
import q9.l;
import q9.m;

/* compiled from: Trackers.java */
/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: e  reason: collision with root package name */
    public static g f30496e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f30497a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30498b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f30499d;

    public g(s2 s2Var, l lVar, l lVar2, l lVar3) {
        this.f30497a = s2Var;
        this.f30498b = lVar;
        this.c = lVar2;
        this.f30499d = lVar3;
    }

    public static synchronized g b(Context context, z2.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f30496e == null) {
                f30496e = new g(context, aVar);
            }
            gVar = f30496e;
        }
        return gVar;
    }

    @Override // q9.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new z(((s2) ((m) this.f30497a)).b(), (d0) ((m) this.f30498b).a(), (m2) ((m) this.c).a(), (u0) ((m) this.f30499d).a());
    }

    public g(Throwable th2, ua.b bVar) {
        this.f30497a = th2.getLocalizedMessage();
        this.f30498b = th2.getClass().getName();
        this.c = bVar.f(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f30499d = cause != null ? new g(cause, bVar) : null;
    }

    public g(Context context, z2.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f30497a = new a(applicationContext, aVar);
        this.f30498b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.f30499d = new f(applicationContext, aVar);
    }
}
