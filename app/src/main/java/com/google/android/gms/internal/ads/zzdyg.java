package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdyg extends zzdya {
    private String zzg;
    private int zzh = 1;

    public zzdyg(Context context) {
        this.zzf = new zzbty(context, com.google.android.gms.ads.internal.zzu.B.f10568r.a(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdya, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i10 = this.zzh;
                        if (i10 == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdxz(this));
                        } else if (i10 == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdxz(this));
                        } else {
                            this.zza.zzd(new zzdyp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdyp(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzdyp(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdya, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzm.b("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyp(1));
    }

    public final y9.a zza(zzbvb zzbvbVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzgcj.zzg(new zzdyp(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvbVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdye
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyg.this.zzb();
                    }
                }, zzbzo.zzf);
                return this.zza;
            }
        }
    }

    public final y9.a zzd(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzgcj.zzg(new zzdyp(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyg.this.zzb();
                    }
                }, zzbzo.zzf);
                return this.zza;
            }
        }
    }
}
