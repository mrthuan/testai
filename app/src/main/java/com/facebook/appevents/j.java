package com.facebook.appevents;

/* compiled from: AppEventStore.kt */
/* loaded from: classes.dex */
public final class j {
    static {
        new j();
    }

    public static final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, s sVar) {
        synchronized (j.class) {
            if (k6.a.b(j.class)) {
                return;
            }
            int i10 = c6.f.f5607a;
            PersistedEvents a10 = d.a();
            a10.addEvents(accessTokenAppIdPair, sVar.d());
            d.b(a10);
        }
    }

    public static final synchronized void b(c eventsToPersist) {
        synchronized (j.class) {
            if (k6.a.b(j.class)) {
                return;
            }
            kotlin.jvm.internal.g.e(eventsToPersist, "eventsToPersist");
            int i10 = c6.f.f5607a;
            PersistedEvents a10 = d.a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.e()) {
                s b10 = eventsToPersist.b(accessTokenAppIdPair);
                if (b10 != null) {
                    a10.addEvents(accessTokenAppIdPair, b10.d());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            d.b(a10);
        }
    }
}
