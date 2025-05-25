package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfty implements ServiceConnection {
    final /* synthetic */ zzftz zza;

    public /* synthetic */ zzfty(zzftz zzftzVar, zzftx zzftxVar) {
        this.zza = zzftzVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzftz.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzftz.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // java.lang.Runnable
            public final void run() {
                zzfty zzftyVar = zzfty.this;
                zzftz.zzg(zzftyVar.zza, zzfsi.zzb(iBinder));
                zzftz.zzd(zzftyVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    IInterface zzb = zzftz.zzb(zzftyVar.zza);
                    zzb.getClass();
                    zzb.asBinder().linkToDeath(zzftz.zza(zzftyVar.zza), 0);
                } catch (RemoteException e10) {
                    zzftz.zzd(zzftyVar.zza).zzb(e10, "linkToDeath failed", new Object[0]);
                }
                zzftz.zzf(zzftyVar.zza, false);
                synchronized (zzftz.zze(zzftyVar.zza)) {
                    for (Runnable runnable : zzftz.zze(zzftyVar.zza)) {
                        runnable.run();
                    }
                    zzftz.zze(zzftyVar.zza).clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzftz.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzftz.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftw
            @Override // java.lang.Runnable
            public final void run() {
                zzfty zzftyVar = zzfty.this;
                zzftz.zzd(zzftyVar.zza).zzc("unlinkToDeath", new Object[0]);
                zzftz zzftzVar = zzftyVar.zza;
                IInterface zzb = zzftz.zzb(zzftzVar);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzftz.zza(zzftzVar), 0);
                zzftz.zzg(zzftyVar.zza, null);
                zzftz.zzf(zzftyVar.zza, false);
            }
        });
    }
}
