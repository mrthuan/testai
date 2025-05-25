package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfxy extends zzfvs {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfuv zzb;

    public zzfxy(Iterator it, zzfuv zzfuvVar) {
        this.zza = it;
        this.zzb = zzfuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfuv zzfuvVar = this.zzb;
            Object next = it.next();
            if (zzfuvVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
