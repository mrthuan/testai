package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzell extends com.google.android.gms.ads.internal.client.zzbt {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbh zzb;
    private final zzffg zzc;
    private final zzcpk zzd;
    private final ViewGroup zze;
    private final zzdsk zzf;

    public zzell(Context context, com.google.android.gms.ads.internal.client.zzbh zzbhVar, zzffg zzffgVar, zzcpk zzcpkVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = zzbhVar;
        this.zzc = zzffgVar;
        this.zzd = zzcpkVar;
        this.zzf = zzdskVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzd = zzcpkVar.zzd();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        frameLayout.addView(zzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().c);
        frameLayout.setMinimumWidth(zzg().f10242f);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        Preconditions.e("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.e("setAdSize must be called on the main UI thread.");
        zzcpk zzcpkVar = this.zzd;
        if (zzcpkVar != null) {
            zzcpkVar.zzi(this.zze, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        zzemk zzemkVar = this.zzc.zzc;
        if (zzemkVar != null) {
            zzemkVar.zzm(zzcbVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcr zzbcrVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkI)).booleanValue()) {
            zzemk zzemkVar = this.zzc.zzc;
            if (zzemkVar != null) {
                try {
                    if (!zzdgVar.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(3);
                }
                zzemkVar.zzl(zzdgVar);
                return;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.d("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        zzcpk zzcpkVar = this.zzd;
        if (zzcpkVar != null && zzcpkVar.zzs()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        com.google.android.gms.ads.internal.util.client.zzm.d("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        com.google.android.gms.ads.internal.util.client.zzm.d("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.e("getAdSize must be called on the main UI thread.");
        return zzffm.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdn zzk() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return new ObjectWrapper(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        Preconditions.e("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        Preconditions.e("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsw zzbswVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvt zzbvtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsz zzbszVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }
}
