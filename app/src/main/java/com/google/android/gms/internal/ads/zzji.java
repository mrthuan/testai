package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzji implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaay, zzpe, zzwl, zztg, zzhk, zzhg {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjm zza;

    public /* synthetic */ zzji(zzjm zzjmVar, zzjh zzjhVar) {
        this.zza = zzjmVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjm.zzK(this.zza, surfaceTexture);
        zzjm.zzI(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjm.zzL(this.zza, null);
        zzjm.zzI(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzjm.zzI(this.zza, i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        zzjm.zzI(this.zza, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzjm.zzI(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zza(Exception exc) {
        zzjm.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzb(String str, long j10, long j11) {
        zzjm.zzF(this.zza).zzw(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzc(String str) {
        zzjm.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzd(zzhn zzhnVar) {
        zzjm.zzF(this.zza).zzy(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zze(zzhn zzhnVar) {
        zzjm.zzF(this.zza).zzz(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzf(zzaf zzafVar, zzho zzhoVar) {
        zzjm.zzF(this.zza).zzA(zzafVar, zzhoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzg(long j10) {
        zzjm.zzF(this.zza).zzB(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzh(Exception exc) {
        zzjm.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzi(zzpf zzpfVar) {
        zzjm.zzF(this.zza).zzD(zzpfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzj(zzpf zzpfVar) {
        zzjm.zzF(this.zza).zzE(zzpfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzk(int i10, long j10, long j11) {
        zzjm.zzF(this.zza).zzF(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzl(int i10, long j10) {
        zzjm.zzF(this.zza).zzG(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzm(Object obj, long j10) {
        zzjm.zzF(this.zza).zzH(obj, j10);
        zzjm zzjmVar = this.zza;
        if (zzjm.zzG(zzjmVar) == obj) {
            zzdz zzD = zzjm.zzD(zzjmVar);
            zzD.zzd(26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj2) {
                    zzbu zzbuVar = (zzbu) obj2;
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzn(final boolean z10) {
        zzjm zzjmVar = this.zza;
        if (zzjm.zzQ(zzjmVar) == z10) {
            return;
        }
        zzjm.zzH(zzjmVar, z10);
        zzdz zzD = zzjm.zzD(this.zza);
        zzD.zzd(23, new zzdw() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbu) obj).zzn(z10);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzo(Exception exc) {
        zzjm.zzF(this.zza).zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzp(String str, long j10, long j11) {
        zzjm.zzF(this.zza).zzJ(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzq(String str) {
        zzjm.zzF(this.zza).zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzr(zzhn zzhnVar) {
        zzjm.zzF(this.zza).zzL(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzs(zzhn zzhnVar) {
        zzjm.zzF(this.zza).zzM(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzt(long j10, int i10) {
        zzjm.zzF(this.zza).zzN(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzu(zzaf zzafVar, zzho zzhoVar) {
        zzjm.zzF(this.zza).zzO(zzafVar, zzhoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzv(final zzcp zzcpVar) {
        zzdz zzD = zzjm.zzD(this.zza);
        zzD.zzd(25, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzbu) obj).zzr(zzcp.this);
            }
        });
        zzD.zzc();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
