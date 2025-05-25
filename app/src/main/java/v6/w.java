package v6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import v6.j;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f30732e;

    /* renamed from: a  reason: collision with root package name */
    public final e7.a f30733a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.a f30734b;
    public final a7.e c;

    /* renamed from: d  reason: collision with root package name */
    public final b7.e f30735d;

    public w(e7.a aVar, e7.a aVar2, a7.e eVar, b7.e eVar2, b7.h hVar) {
        this.f30733a = aVar;
        this.f30734b = aVar2;
        this.c = eVar;
        this.f30735d = eVar2;
        hVar.getClass();
        hVar.f5370a.execute(new b7.g(hVar, 0));
    }

    public static w a() {
        k kVar = f30732e;
        if (kVar != null) {
            return kVar.f30719f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f30732e == null) {
            synchronized (w.class) {
                if (f30732e == null) {
                    context.getClass();
                    f30732e = new k(context);
                }
            }
        }
    }

    public final t c(t6.a aVar) {
        Set singleton;
        if (aVar instanceof l) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(t6.a.f29948d);
        } else {
            singleton = Collections.singleton(new s6.b("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f30714b = aVar.b();
        return new t(singleton, a10.a(), this);
    }
}
