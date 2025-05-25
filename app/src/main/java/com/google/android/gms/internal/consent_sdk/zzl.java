package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import x9.a;
import x9.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzl {
    private final Application zza;
    private final zzap zzb;

    public zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    public final zzci zzc(Activity activity, c cVar) {
        a aVar;
        a aVar2 = cVar.f31630b;
        if (aVar2 == null) {
            a.C0407a c0407a = new a.C0407a(this.zza);
            boolean z10 = true;
            if (!zzct.zza(true) && !c0407a.f31627a.contains(zzcl.zza(c0407a.f31628b))) {
                z10 = false;
            }
            aVar = new a(z10, c0407a);
        } else {
            aVar = aVar2;
        }
        return zzn.zza(new zzn(this, activity, aVar, cVar, null));
    }
}
