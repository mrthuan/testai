package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcof implements zzaxw, zzcxl, com.google.android.gms.ads.internal.overlay.zzp, zzcxk {
    private final zzcoa zza;
    private final zzcob zzb;
    private final zzboa zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcoe zzh = new zzcoe();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcof(zzbnx zzbnxVar, zzcob zzcobVar, Executor executor, zzcoa zzcoaVar, Clock clock) {
        this.zza = zzcoaVar;
        zzbni zzbniVar = zzbnl.zza;
        this.zzd = zzbnxVar.zza("google.afma.activeView.handleUpdate", zzbniVar, zzbniVar);
        this.zzb = zzcobVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcej zzcejVar : this.zzc) {
            this.zza.zzf(zzcejVar);
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final synchronized void zzdj(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final synchronized void zzdp(zzaxv zzaxvVar) {
        zzcoe zzcoeVar = this.zzh;
        zzcoeVar.zza = zzaxvVar.zzj;
        zzcoeVar.zzf = zzaxvVar;
        zzg();
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (!this.zzi && this.zzg.get()) {
                try {
                    this.zzh.zzd = this.zzf.b();
                    final JSONObject zzb = this.zzb.zzb(this.zzh);
                    for (final zzcej zzcejVar : this.zzc) {
                        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcod
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcej.this.zzl("AFMA_updateActiveView", zzb);
                            }
                        });
                    }
                    zzbzr.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                    return;
                } catch (Exception unused) {
                    com.google.android.gms.ads.internal.util.zze.i();
                    return;
                }
            }
            return;
        }
        zzj();
    }

    public final synchronized void zzh(zzcej zzcejVar) {
        this.zzc.add(zzcejVar);
        this.zza.zzd(zzcejVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
    }
}
