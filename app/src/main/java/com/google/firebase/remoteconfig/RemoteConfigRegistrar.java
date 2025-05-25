package com.google.firebase.remoteconfig;

import aa.b;
import android.content.Context;
import androidx.annotation.Keep;
import ba.a;
import com.google.firebase.components.ComponentRegistrar;
import d9.g;
import ga.b;
import ga.c;
import ga.k;
import ga.q;
import ga.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import lb.f;
import mb.h;
import z9.e;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ h a(q qVar, r rVar) {
        return lambda$getComponents$0(qVar, rVar);
    }

    public static h lambda$getComponents$0(q qVar, c cVar) {
        b bVar;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.f(qVar);
        e eVar = (e) cVar.a(e.class);
        eb.e eVar2 = (eb.e) cVar.a(eb.e.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            if (!aVar.f5393a.containsKey("frc")) {
                aVar.f5393a.put("frc", new b(aVar.c));
            }
            bVar = (b) aVar.f5393a.get("frc");
        }
        return new h(context, scheduledExecutorService, eVar, eVar2, bVar, cVar.d(da.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ga.b<?>> getComponents() {
        q qVar = new q(fa.b.class, ScheduledExecutorService.class);
        b.a a10 = ga.b.a(h.class);
        a10.f17709a = LIBRARY_NAME;
        a10.a(k.a(Context.class));
        a10.a(new k(qVar, 1, 0));
        a10.a(k.a(e.class));
        a10.a(k.a(eb.e.class));
        a10.a(k.a(a.class));
        a10.a(new k(da.a.class, 0, 1));
        a10.f17713f = new g(qVar, 1);
        a10.c(2);
        return Arrays.asList(a10.b(), f.a(LIBRARY_NAME, "21.3.0"));
    }
}
