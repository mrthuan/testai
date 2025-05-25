package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfzm extends zzfvs {
    final Iterator zza;
    final /* synthetic */ zzfzn zzb;

    public zzfzm(zzfzn zzfznVar) {
        this.zzb = zzfznVar;
        this.zza = zzfznVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzb.zzb;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
