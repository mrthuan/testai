package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbab implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbad zza;

    public zzbab(zzbad zzbadVar) {
        this.zza = zzbadVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbag zzbagVar;
        zzbag zzbagVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbad zzbadVar = this.zza;
                zzbagVar = zzbadVar.zzd;
                if (zzbagVar != null) {
                    zzbagVar2 = zzbadVar.zzd;
                    zzbadVar.zzf = zzbagVar2.zzq();
                }
            } catch (DeadObjectException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                zzbad.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
