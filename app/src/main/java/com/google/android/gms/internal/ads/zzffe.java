package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffe {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfk zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbes zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzblh zzn;
    private zzemk zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcf zzu;
    private int zzm = 1;
    private final zzfer zzo = new zzfer();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public static /* bridge */ /* synthetic */ String zzK(zzffe zzffeVar) {
        return zzffeVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzM(zzffe zzffeVar) {
        return zzffeVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzN(zzffe zzffeVar) {
        return zzffeVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzO(zzffe zzffeVar) {
        return zzffeVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzP(zzffe zzffeVar) {
        return zzffeVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzQ(zzffe zzffeVar) {
        return zzffeVar.zzs;
    }

    public static /* bridge */ /* synthetic */ boolean zzR(zzffe zzffeVar) {
        return zzffeVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcf zzU(zzffe zzffeVar) {
        return zzffeVar.zzu;
    }

    public static /* bridge */ /* synthetic */ int zza(zzffe zzffeVar) {
        return zzffeVar.zzm;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzffe zzffeVar) {
        return zzffeVar.zzt;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzc(zzffe zzffeVar) {
        return zzffeVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzd(zzffe zzffeVar) {
        return zzffeVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zze(zzffe zzffeVar) {
        return zzffeVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzg(zzffe zzffeVar) {
        return zzffeVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzi(zzffe zzffeVar) {
        return zzffeVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zzj(zzffe zzffeVar) {
        return zzffeVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfk zzk(zzffe zzffeVar) {
        return zzffeVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbes zzl(zzffe zzffeVar) {
        return zzffeVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzblh zzm(zzffe zzffeVar) {
        return zzffeVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzemk zzn(zzffe zzffeVar) {
        return zzffeVar.zzr;
    }

    public static /* bridge */ /* synthetic */ zzfer zzo(zzffe zzffeVar) {
        return zzffeVar.zzo;
    }

    public final zzffe zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzffe zzB(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzffe zzC(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzffe zzD(zzbes zzbesVar) {
        this.zzh = zzbesVar;
        return this;
    }

    public final zzffe zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzffe zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzffe zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.f10088a;
            this.zzl = publisherAdViewOptions.f10089b;
        }
        return this;
    }

    public final zzffe zzH(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzffe zzI(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        this.zzd = zzfkVar;
        return this;
    }

    public final zzffg zzJ() {
        Preconditions.k(this.zzc, "ad unit must not be null");
        Preconditions.k(this.zzb, "ad size must not be null");
        Preconditions.k(this.zza, "ad request must not be null");
        return new zzffg(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzffe zzV(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzu = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzh() {
        return this.zzb;
    }

    public final zzfer zzp() {
        return this.zzo;
    }

    public final zzffe zzq(zzffg zzffgVar) {
        this.zzo.zza(zzffgVar.zzo.zza);
        this.zza = zzffgVar.zzd;
        this.zzb = zzffgVar.zze;
        this.zzu = zzffgVar.zzt;
        this.zzc = zzffgVar.zzf;
        this.zzd = zzffgVar.zza;
        this.zzf = zzffgVar.zzg;
        this.zzg = zzffgVar.zzh;
        this.zzh = zzffgVar.zzi;
        this.zzi = zzffgVar.zzj;
        zzr(zzffgVar.zzl);
        zzG(zzffgVar.zzm);
        this.zzp = zzffgVar.zzp;
        this.zzq = zzffgVar.zzq;
        this.zzr = zzffgVar.zzc;
        this.zzs = zzffgVar.zzr;
        this.zzt = zzffgVar.zzs;
        return this;
    }

    public final zzffe zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.f10074a;
        }
        return this;
    }

    public final zzffe zzs(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzffe zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzffe zzu(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzffe zzv(zzemk zzemkVar) {
        this.zzr = zzemkVar;
        return this;
    }

    public final zzffe zzw(zzblh zzblhVar) {
        this.zzn = zzblhVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfk(false, true, false);
        return this;
    }

    public final zzffe zzx(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzffe zzy(boolean z10) {
        this.zzq = z10;
        return this;
    }

    public final zzffe zzz(boolean z10) {
        this.zzs = true;
        return this;
    }
}
