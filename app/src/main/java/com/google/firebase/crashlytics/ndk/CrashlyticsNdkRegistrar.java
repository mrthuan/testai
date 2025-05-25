package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import ga.b;
import ga.k;
import ga.r;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ga.b<?>> getComponents() {
        b.a a10 = ga.b.a(ja.a.class);
        a10.f17709a = "fire-cls-ndk";
        a10.a(k.a(Context.class));
        a10.f17713f = new ga.e() { // from class: com.google.firebase.crashlytics.ndk.a
            @Override // ga.e
            public final Object a(r rVar) {
                boolean z10;
                CrashlyticsNdkRegistrar.this.getClass();
                Context context = (Context) rVar.a(Context.class);
                if (CommonUtils.f(context, "com.google.firebase.crashlytics.unity_version", "string") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new d(new b(context, new JniNativeApi(context), new ra.d(context)), !z10);
            }
        };
        a10.c(2);
        return Arrays.asList(a10.b(), lb.f.a("fire-cls-ndk", "18.3.6"));
    }
}
