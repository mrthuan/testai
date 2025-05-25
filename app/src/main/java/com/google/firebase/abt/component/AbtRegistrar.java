package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ba.a;
import com.google.firebase.components.ComponentRegistrar;
import ga.b;
import ga.c;
import ga.k;
import java.util.Arrays;
import java.util.List;
import lb.f;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.d(da.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.a a10 = b.a(a.class);
        a10.f17709a = LIBRARY_NAME;
        a10.a(k.a(Context.class));
        a10.a(new k(da.a.class, 0, 1));
        a10.f17713f = new ba.b(0);
        return Arrays.asList(a10.b(), f.a(LIBRARY_NAME, "21.1.1"));
    }
}
