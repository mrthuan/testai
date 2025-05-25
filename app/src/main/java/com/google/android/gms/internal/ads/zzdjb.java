package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdjb {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbew zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcej zzi;
    private zzcej zzj;
    private zzcej zzk;
    private zzeeo zzl;
    private y9.a zzm;
    private zzbzt zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfd zzs;
    private zzbfd zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final y.i zzv = new y.i();
    private final y.i zzw = new y.i();
    private List zzf = Collections.emptyList();

    public static zzdjb zzag(zzbox zzboxVar) {
        try {
            zzdja zzak = zzak(zzboxVar.zzg(), null);
            zzbew zzh = zzboxVar.zzh();
            String zzo = zzboxVar.zzo();
            List zzr = zzboxVar.zzr();
            String zzm = zzboxVar.zzm();
            Bundle zzf = zzboxVar.zzf();
            String zzn = zzboxVar.zzn();
            IObjectWrapper zzl = zzboxVar.zzl();
            String zzq = zzboxVar.zzq();
            String zzp = zzboxVar.zzp();
            double zze = zzboxVar.zze();
            zzbfd zzi = zzboxVar.zzi();
            zzdjb zzdjbVar = new zzdjb();
            zzdjbVar.zza = 2;
            zzdjbVar.zzb = zzak;
            zzdjbVar.zzc = zzh;
            zzdjbVar.zzd = (View) zzam(zzboxVar.zzj());
            zzdjbVar.zzZ("headline", zzo);
            zzdjbVar.zze = zzr;
            zzdjbVar.zzZ("body", zzm);
            zzdjbVar.zzh = zzf;
            zzdjbVar.zzZ("call_to_action", zzn);
            zzdjbVar.zzo = (View) zzam(zzboxVar.zzk());
            zzdjbVar.zzq = zzl;
            zzdjbVar.zzZ("store", zzq);
            zzdjbVar.zzZ(InMobiNetworkValues.PRICE, zzp);
            zzdjbVar.zzr = zze;
            zzdjbVar.zzs = zzi;
            return zzdjbVar;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    public static zzdjb zzah(zzboy zzboyVar) {
        try {
            zzdja zzak = zzak(zzboyVar.zzf(), null);
            zzbew zzg = zzboyVar.zzg();
            String zzo = zzboyVar.zzo();
            List zzp = zzboyVar.zzp();
            String zzm = zzboyVar.zzm();
            Bundle zze = zzboyVar.zze();
            String zzn = zzboyVar.zzn();
            IObjectWrapper zzk = zzboyVar.zzk();
            String zzl = zzboyVar.zzl();
            zzbfd zzh = zzboyVar.zzh();
            zzdjb zzdjbVar = new zzdjb();
            zzdjbVar.zza = 1;
            zzdjbVar.zzb = zzak;
            zzdjbVar.zzc = zzg;
            zzdjbVar.zzd = (View) zzam(zzboyVar.zzi());
            zzdjbVar.zzZ("headline", zzo);
            zzdjbVar.zze = zzp;
            zzdjbVar.zzZ("body", zzm);
            zzdjbVar.zzh = zze;
            zzdjbVar.zzZ("call_to_action", zzn);
            zzdjbVar.zzo = (View) zzam(zzboyVar.zzj());
            zzdjbVar.zzq = zzk;
            zzdjbVar.zzZ("advertiser", zzl);
            zzdjbVar.zzt = zzh;
            return zzdjbVar;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    public static zzdjb zzai(zzbox zzboxVar) {
        try {
            return zzal(zzak(zzboxVar.zzg(), null), zzboxVar.zzh(), (View) zzam(zzboxVar.zzj()), zzboxVar.zzo(), zzboxVar.zzr(), zzboxVar.zzm(), zzboxVar.zzf(), zzboxVar.zzn(), (View) zzam(zzboxVar.zzk()), zzboxVar.zzl(), zzboxVar.zzq(), zzboxVar.zzp(), zzboxVar.zze(), zzboxVar.zzi(), null, 0.0f);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    public static zzdjb zzaj(zzboy zzboyVar) {
        try {
            return zzal(zzak(zzboyVar.zzf(), null), zzboyVar.zzg(), (View) zzam(zzboyVar.zzi()), zzboyVar.zzo(), zzboyVar.zzp(), zzboyVar.zzm(), zzboyVar.zze(), zzboyVar.zzn(), (View) zzam(zzboyVar.zzj()), zzboyVar.zzk(), null, null, -1.0d, zzboyVar.zzh(), zzboyVar.zzl(), 0.0f);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    private static zzdja zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbpb zzbpbVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdja(zzdqVar, zzbpbVar);
    }

    private static zzdjb zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbew zzbewVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d10, zzbfd zzbfdVar, String str6, float f10) {
        zzdjb zzdjbVar = new zzdjb();
        zzdjbVar.zza = 6;
        zzdjbVar.zzb = zzdqVar;
        zzdjbVar.zzc = zzbewVar;
        zzdjbVar.zzd = view;
        zzdjbVar.zzZ("headline", str);
        zzdjbVar.zze = list;
        zzdjbVar.zzZ("body", str2);
        zzdjbVar.zzh = bundle;
        zzdjbVar.zzZ("call_to_action", str3);
        zzdjbVar.zzo = view2;
        zzdjbVar.zzq = iObjectWrapper;
        zzdjbVar.zzZ("store", str4);
        zzdjbVar.zzZ(InMobiNetworkValues.PRICE, str5);
        zzdjbVar.zzr = d10;
        zzdjbVar.zzs = zzbfdVar;
        zzdjbVar.zzZ("advertiser", str6);
        zzdjbVar.zzR(f10);
        return zzdjbVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.L0(iObjectWrapper);
    }

    public static zzdjb zzt(zzbpb zzbpbVar) {
        try {
            return zzal(zzak(zzbpbVar.zzj(), zzbpbVar), zzbpbVar.zzk(), (View) zzam(zzbpbVar.zzm()), zzbpbVar.zzs(), zzbpbVar.zzv(), zzbpbVar.zzq(), zzbpbVar.zzi(), zzbpbVar.zzr(), (View) zzam(zzbpbVar.zzn()), zzbpbVar.zzo(), zzbpbVar.zzu(), zzbpbVar.zzt(), zzbpbVar.zze(), zzbpbVar.zzl(), zzbpbVar.zzp(), zzbpbVar.zzf());
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF(InMobiNetworkValues.PRICE);
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.getOrDefault(str, null);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcej zzcejVar = this.zzi;
        if (zzcejVar != null) {
            zzcejVar.destroy();
            this.zzi = null;
        }
        zzcej zzcejVar2 = this.zzj;
        if (zzcejVar2 != null) {
            zzcejVar2.destroy();
            this.zzj = null;
        }
        zzcej zzcejVar3 = this.zzk;
        if (zzcejVar3 != null) {
            zzcejVar3.destroy();
            this.zzk = null;
        }
        y9.a aVar = this.zzm;
        if (aVar != null) {
            aVar.cancel(false);
            this.zzm = null;
        }
        zzbzt zzbztVar = this.zzn;
        if (zzbztVar != null) {
            zzbztVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbew zzbewVar) {
        this.zzc = zzbewVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbfd zzbfdVar) {
        this.zzs = zzbfdVar;
    }

    public final synchronized void zzN(String str, zzbeq zzbeqVar) {
        if (zzbeqVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbeqVar);
        }
    }

    public final synchronized void zzO(zzcej zzcejVar) {
        this.zzj = zzcejVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfd zzbfdVar) {
        this.zzt = zzbfdVar;
    }

    public final synchronized void zzR(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcej zzcejVar) {
        this.zzk = zzcejVar;
    }

    public final synchronized void zzU(y9.a aVar) {
        this.zzm = aVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzeeo zzeeoVar) {
        this.zzl = zzeeoVar;
    }

    public final synchronized void zzX(zzbzt zzbztVar) {
        this.zzn = zzbztVar;
    }

    public final synchronized void zzY(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i10) {
        this.zza = i10;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcej zzcejVar) {
        this.zzi = zzcejVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        if (this.zzj != null) {
            return true;
        }
        return false;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized y.i zzh() {
        return this.zzv;
    }

    public final synchronized y.i zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbew zzl() {
        return this.zzc;
    }

    public final zzbfd zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfc.zzg((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    public final synchronized zzbfd zzn() {
        return this.zzs;
    }

    public final synchronized zzbfd zzo() {
        return this.zzt;
    }

    public final synchronized zzbzt zzp() {
        return this.zzn;
    }

    public final synchronized zzcej zzq() {
        return this.zzj;
    }

    public final synchronized zzcej zzr() {
        return this.zzk;
    }

    public final synchronized zzcej zzs() {
        return this.zzi;
    }

    public final synchronized zzeeo zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized y9.a zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
