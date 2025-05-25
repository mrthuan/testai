package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbap implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbah zza;
    final /* synthetic */ zzbzt zzb;
    final /* synthetic */ zzbar zzc;

    public zzbap(zzbar zzbarVar, zzbah zzbahVar, zzbzt zzbztVar) {
        this.zza = zzbahVar;
        this.zzb = zzbztVar;
        this.zzc = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z10;
        final zzbag zzbagVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbar zzbarVar = this.zzc;
            z10 = zzbarVar.zzb;
            if (!z10) {
                zzbarVar.zzb = true;
                zzbagVar = this.zzc.zza;
                if (zzbagVar == null) {
                    return;
                }
                zzgcu zzgcuVar = zzbzo.zza;
                final zzbah zzbahVar = this.zza;
                final zzbzt zzbztVar = this.zzb;
                final y9.a zza = zzgcuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbam
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbae zzf;
                        zzbap zzbapVar = zzbap.this;
                        zzbag zzbagVar2 = zzbagVar;
                        zzbzt zzbztVar2 = zzbztVar;
                        try {
                            zzbaj zzq = zzbagVar2.zzq();
                            boolean zzp = zzbagVar2.zzp();
                            zzbah zzbahVar2 = zzbahVar;
                            if (zzp) {
                                zzf = zzq.zzg(zzbahVar2);
                            } else {
                                zzf = zzq.zzf(zzbahVar2);
                            }
                            if (!zzf.zze()) {
                                zzbztVar2.zzd(new RuntimeException("No entry contents."));
                                zzbar.zze(zzbapVar.zzc);
                                return;
                            }
                            zzbao zzbaoVar = new zzbao(zzbapVar, zzf.zzc(), 1);
                            int read = zzbaoVar.read();
                            if (read != -1) {
                                zzbaoVar.unread(read);
                                zzbztVar2.zzc(zzbat.zzb(zzbaoVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException | IOException e10) {
                            com.google.android.gms.ads.internal.util.client.zzm.g(6);
                            zzbztVar2.zzd(e10);
                            zzbar.zze(zzbapVar.zzc);
                        }
                    }
                });
                final zzbzt zzbztVar2 = this.zzb;
                zzbztVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzban
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzbzt.this.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzbzo.zzf);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
