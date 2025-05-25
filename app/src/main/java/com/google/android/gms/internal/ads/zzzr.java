package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzzr implements zzabc, zzzj {
    final /* synthetic */ zzzt zza;
    private final Context zzb;
    private final int zzc;
    private final ArrayList zzd;
    private zzaf zze;
    private long zzf;
    private boolean zzg;
    private long zzh;
    private boolean zzi;
    private long zzj;
    private zzaba zzk;
    private Executor zzl;

    public zzzr(zzzt zzztVar, Context context) {
        Executor executor;
        this.zza = zzztVar;
        this.zzb = context;
        this.zzc = true != zzet.zzL(context) ? 5 : 1;
        this.zzd = new ArrayList();
        this.zzh = -9223372036854775807L;
        this.zzk = zzaba.zzb;
        executor = zzzt.zza;
        this.zzl = executor;
    }

    private final void zzl() {
        zzo zzw;
        if (this.zze == null) {
            return;
        }
        new ArrayList().addAll(this.zzd);
        zzaf zzafVar = this.zze;
        zzafVar.getClass();
        zzdi.zzb(null);
        int i10 = zzafVar.zzs;
        int i11 = zzafVar.zzr;
        zzw = zzzt.zzw(zzafVar.zzy);
        zzag zzagVar = new zzag(zzw, i11, i10);
        zzagVar.zza(zzafVar.zzv);
        zzagVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zza(zzzt zzztVar) {
        final zzaba zzabaVar = this.zzk;
        this.zzl.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzq
            @Override // java.lang.Runnable
            public final void run() {
                zzabaVar.zza(zzzr.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzb(zzzt zzztVar) {
        final zzaba zzabaVar = this.zzk;
        this.zzl.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
            @Override // java.lang.Runnable
            public final void run() {
                zzabaVar.zzb(zzzr.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzc(zzzt zzztVar, final zzcp zzcpVar) {
        final zzaba zzabaVar = this.zzk;
        this.zzl.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
            @Override // java.lang.Runnable
            public final void run() {
                zzabaVar.zzc(zzzr.this, zzcpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final long zzd(long j10, boolean z10) {
        zzdi.zzf(false);
        long j11 = this.zzj;
        if (j11 != -9223372036854775807L) {
            if (!zzzt.zzv(this.zza, j11)) {
                return -9223372036854775807L;
            }
            zzl();
            this.zzj = -9223372036854775807L;
        }
        zzdi.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zze() {
        this.zzi = false;
        this.zzh = -9223372036854775807L;
        zzzt.zzn(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzf(int i10, zzaf zzafVar) {
        zzaah zzaahVar;
        boolean z10 = false;
        zzdi.zzf(false);
        zzaahVar = this.zza.zzd;
        zzaahVar.zzk(zzafVar.zzt);
        int i11 = zzet.zza;
        this.zze = zzafVar;
        if (!this.zzi) {
            zzl();
            this.zzi = true;
            this.zzj = -9223372036854775807L;
            return;
        }
        if (this.zzh != -9223372036854775807L) {
            z10 = true;
        }
        zzdi.zzf(z10);
        this.zzj = this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzg(long j10, long j11) {
        try {
            this.zza.zzt(j10, j11);
        } catch (zzhw e10) {
            zzaf zzafVar = this.zze;
            if (zzafVar == null) {
                zzafVar = new zzad().zzad();
            }
            throw new zzabb(e10, zzafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzh(zzaba zzabaVar, Executor executor) {
        this.zzk = zzabaVar;
        this.zzl = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzi(long j10) {
        boolean z10;
        if (this.zzf != j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzg = z10;
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzj(List list) {
        this.zzd.clear();
        this.zzd.addAll(list);
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final boolean zzk() {
        return zzet.zzL(this.zzb);
    }
}
