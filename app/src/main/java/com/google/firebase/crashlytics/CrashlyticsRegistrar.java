package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import ga.b;
import ga.k;
import ia.c;
import ja.a;
import java.util.Arrays;
import java.util.List;
import lb.f;
import z9.e;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        b.a a10 = b.a(FirebaseCrashlytics.class);
        a10.f17709a = "fire-cls";
        a10.a(k.a(e.class));
        a10.a(k.a(eb.e.class));
        a10.a(new k(a.class, 0, 2));
        a10.a(new k(da.a.class, 0, 2));
        a10.f17713f = new c(this, 0);
        a10.c(2);
        return Arrays.asList(a10.b(), f.a("fire-cls", "18.3.6"));
    }
}
