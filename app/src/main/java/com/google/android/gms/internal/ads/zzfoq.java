package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfoq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfpo zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfoh zzf;
    private final long zzg;
    private final int zzh;

    public zzfoq(Context context, int i10, int i11, String str, String str2, String str3, zzfoh zzfohVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfohVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfpo zzfpoVar = new zzfpo(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfpoVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpoVar.checkAvailabilityAndConnect();
    }

    public static zzfqa zza() {
        return new zzfqa(null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfpt zzd = zzd();
        if (zzd != null) {
            try {
                zzfqa zzf = zzd.zzf(new zzfpy(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfqa zzb(int i10) {
        zzfqa zzfqaVar;
        try {
            zzfqaVar = (zzfqa) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfqaVar = null;
        }
        zze(3004, this.zzg, null);
        if (zzfqaVar != null) {
            if (zzfqaVar.zzc == 7) {
                zzfoh.zzg(3);
            } else {
                zzfoh.zzg(2);
            }
        }
        if (zzfqaVar == null) {
            return zza();
        }
        return zzfqaVar;
    }

    public final void zzc() {
        zzfpo zzfpoVar = this.zza;
        if (zzfpoVar != null) {
            if (zzfpoVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfpt zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
