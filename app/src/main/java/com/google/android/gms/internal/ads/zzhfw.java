package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhfw extends u.g {
    private final WeakReference zza;

    public zzhfw(zzbct zzbctVar) {
        this.zza = new WeakReference(zzbctVar);
    }

    @Override // u.g
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.d dVar) {
        zzbct zzbctVar = (zzbct) this.zza.get();
        if (zzbctVar != null) {
            zzbctVar.zzc(dVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbct zzbctVar = (zzbct) this.zza.get();
        if (zzbctVar != null) {
            zzbctVar.zzd();
        }
    }
}
