package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzftz {
    private final Context zzb;
    private final zzfua zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzfvk zza = zzfvo.zza(new zzfvk("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzftq
        public final /* synthetic */ String zza = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzfvk
        public final Object zza() {
            HandlerThread handlerThread = new HandlerThread(this.zza, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftr
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzftz.this.zzk();
        }
    };

    public zzftz(Context context, zzfua zzfuaVar, String str, Intent intent, zzftf zzftfVar) {
        this.zzb = context;
        this.zzc = zzfuaVar;
        this.zzg = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient zza(zzftz zzftzVar) {
        return zzftzVar.zzh;
    }

    public static /* bridge */ /* synthetic */ IInterface zzb(zzftz zzftzVar) {
        return zzftzVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfua zzd(zzftz zzftzVar) {
        return zzftzVar.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzftz zzftzVar) {
        return zzftzVar.zze;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzftz zzftzVar, boolean z10) {
        zzftzVar.zzf = false;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzftz zzftzVar, IInterface iInterface) {
        zzftzVar.zzj = iInterface;
    }

    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfts
            @Override // java.lang.Runnable
            public final void run() {
                zzftz.this.zzl(runnable);
            }
        });
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftt
            @Override // java.lang.Runnable
            public final void run() {
                zzftz.this.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj == null && !this.zzf) {
            this.zzc.zzc("Initiate binding to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            zzfty zzftyVar = new zzfty(this, null);
            this.zzi = zzftyVar;
            this.zzf = true;
            if (!this.zzb.bindService(this.zzg, zzftyVar, 1)) {
                this.zzc.zzc("Failed to bind to the service.", new Object[0]);
                this.zzf = false;
                synchronized (this.zze) {
                    this.zze.clear();
                }
            }
        } else if (this.zzf) {
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            this.zzc.zza("error caused by ", e10);
        }
    }

    public final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftu
            @Override // java.lang.Runnable
            public final void run() {
                zzftz.this.zzm();
            }
        });
    }
}
