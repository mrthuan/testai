package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ga.b;
import ga.c;
import ga.k;
import ha.n;
import java.util.Arrays;
import java.util.List;
import s6.f;
import t6.a;
import v6.w;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        w.b((Context) cVar.a(Context.class));
        return w.a().c(a.f29950f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.a a10 = b.a(f.class);
        a10.f17709a = LIBRARY_NAME;
        a10.a(k.a(Context.class));
        a10.f17713f = new n(1);
        return Arrays.asList(a10.b(), lb.f.a(LIBRARY_NAME, "18.1.7"));
    }
}
