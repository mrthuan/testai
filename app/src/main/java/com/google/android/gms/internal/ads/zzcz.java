package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcz {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcz() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = SlideAtom.USES_MASTER_SLIDE_ID;
        this.zzg = SlideAtom.USES_MASTER_SLIDE_ID;
        this.zzh = -3.4028235E38f;
        this.zzi = SlideAtom.USES_MASTER_SLIDE_ID;
        this.zzj = SlideAtom.USES_MASTER_SLIDE_ID;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = SlideAtom.USES_MASTER_SLIDE_ID;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzcz zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcz zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcz zze(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcz zzf(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzcz zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcz zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcz zzi(int i10) {
        this.zzi = i10;
        return this;
    }

    public final zzcz zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcz zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcz zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcz zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcz zzn(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcz zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzdb zzp() {
        return new zzdb(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, null);
    }

    public final CharSequence zzq() {
        return this.zza;
    }

    public /* synthetic */ zzcz(zzdb zzdbVar, zzcy zzcyVar) {
        this.zza = zzdbVar.zza;
        this.zzb = zzdbVar.zzd;
        this.zzc = zzdbVar.zzb;
        this.zzd = zzdbVar.zzc;
        this.zze = zzdbVar.zze;
        this.zzf = zzdbVar.zzf;
        this.zzg = zzdbVar.zzg;
        this.zzh = zzdbVar.zzh;
        this.zzi = zzdbVar.zzi;
        this.zzj = zzdbVar.zzl;
        this.zzk = zzdbVar.zzm;
        this.zzl = zzdbVar.zzj;
        this.zzm = zzdbVar.zzk;
        this.zzn = zzdbVar.zzn;
        this.zzo = zzdbVar.zzo;
    }
}
