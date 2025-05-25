package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdbn extends zzdch implements zzbhp {
    public zzdbn(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdbm
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
