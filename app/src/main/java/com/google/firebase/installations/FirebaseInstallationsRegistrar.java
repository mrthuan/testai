package com.google.firebase.installations;

import a6.h;
import androidx.activity.s;
import androidx.annotation.Keep;
import bb.f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.SequentialExecutor;
import d9.g;
import eb.e;
import fa.b;
import ga.b;
import ga.c;
import ga.k;
import ga.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(c cVar) {
        return new a((z9.e) cVar.a(z9.e.class), cVar.d(f.class), (ExecutorService) cVar.f(new q(fa.a.class, ExecutorService.class)), new SequentialExecutor((Executor) cVar.f(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ga.b<?>> getComponents() {
        b.a a10 = ga.b.a(e.class);
        a10.f17709a = LIBRARY_NAME;
        a10.a(k.a(z9.e.class));
        a10.a(new k(f.class, 0, 1));
        a10.a(new k(new q(fa.a.class, ExecutorService.class), 1, 0));
        a10.a(new k(new q(fa.b.class, Executor.class), 1, 0));
        a10.f17713f = new h();
        s sVar = new s();
        b.a a11 = ga.b.a(bb.e.class);
        a11.f17712e = 1;
        a11.f17713f = new g(sVar, 0);
        return Arrays.asList(a10.b(), a11.b(), lb.f.a(LIBRARY_NAME, "17.1.3"));
    }
}
