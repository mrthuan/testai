package com.google.firebase.messaging;

import ab.d;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import ga.b;
import ga.k;
import java.util.Arrays;
import java.util.List;
import lb.g;
import s6.f;
import z9.e;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ga.c cVar) {
        return new FirebaseMessaging((e) cVar.a(e.class), (cb.a) cVar.a(cb.a.class), cVar.d(g.class), cVar.d(HeartBeatInfo.class), (eb.e) cVar.a(eb.e.class), (f) cVar.a(f.class), (d) cVar.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ga.b<?>> getComponents() {
        b.a a10 = ga.b.a(FirebaseMessaging.class);
        a10.f17709a = LIBRARY_NAME;
        a10.a(k.a(e.class));
        a10.a(new k(cb.a.class, 0, 0));
        a10.a(new k(g.class, 0, 1));
        a10.a(new k(HeartBeatInfo.class, 0, 1));
        a10.a(new k(f.class, 0, 0));
        a10.a(k.a(eb.e.class));
        a10.a(k.a(d.class));
        a10.f17713f = new ba.b(1);
        a10.c(1);
        return Arrays.asList(a10.b(), lb.f.a(LIBRARY_NAME, "23.1.2"));
    }
}
