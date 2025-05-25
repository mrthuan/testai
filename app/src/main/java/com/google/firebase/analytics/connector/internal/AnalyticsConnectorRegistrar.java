package com.google.firebase.analytics.connector.internal;

import ab.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import da.a;
import ga.b;
import ga.c;
import ga.k;
import java.util.Arrays;
import java.util.List;
import lb.f;
import z9.e;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        e eVar = (e) cVar.a(e.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        Preconditions.j(eVar);
        Preconditions.j(context);
        Preconditions.j(dVar);
        Preconditions.j(context.getApplicationContext());
        if (da.c.c == null) {
            synchronized (da.c.class) {
                if (da.c.c == null) {
                    Bundle bundle = new Bundle(1);
                    eVar.a();
                    if ("[DEFAULT]".equals(eVar.f32309b)) {
                        dVar.a(da.d.f16183a, da.e.f16184a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.g());
                    }
                    da.c.c = new da.c(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return da.c.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<b<?>> getComponents() {
        b.a a10 = b.a(a.class);
        a10.a(k.a(e.class));
        a10.a(k.a(Context.class));
        a10.a(k.a(d.class));
        a10.f17713f = ea.a.f16517a;
        a10.c(2);
        return Arrays.asList(a10.b(), f.a("fire-analytics", "21.2.2"));
    }
}
