package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdiw extends zzcru {
    private final Executor zzc;
    private final zzdjb zzd;
    private final zzdjj zze;
    private final zzdkb zzf;
    private final zzdjg zzg;
    private final zzdjm zzh;
    private final zzhew zzi;
    private final zzhew zzj;
    private final zzhew zzk;
    private final zzhew zzl;
    private final zzhew zzm;
    private zzdkx zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final zzbxw zzr;
    private final zzauo zzs;
    private final VersionInfoParcel zzt;
    private final Context zzu;
    private final zzdiy zzv;
    private final zzemn zzw;
    private final Map zzx;
    private final List zzy;

    static {
        zzfxr.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    }

    public zzdiw(zzcrt zzcrtVar, Executor executor, zzdjb zzdjbVar, zzdjj zzdjjVar, zzdkb zzdkbVar, zzdjg zzdjgVar, zzdjm zzdjmVar, zzhew zzhewVar, zzhew zzhewVar2, zzhew zzhewVar3, zzhew zzhewVar4, zzhew zzhewVar5, zzbxw zzbxwVar, zzauo zzauoVar, VersionInfoParcel versionInfoParcel, Context context, zzdiy zzdiyVar, zzemn zzemnVar, zzaxy zzaxyVar) {
        super(zzcrtVar);
        this.zzc = executor;
        this.zzd = zzdjbVar;
        this.zze = zzdjjVar;
        this.zzf = zzdkbVar;
        this.zzg = zzdjgVar;
        this.zzh = zzdjmVar;
        this.zzi = zzhewVar;
        this.zzj = zzhewVar2;
        this.zzk = zzhewVar3;
        this.zzl = zzhewVar4;
        this.zzm = zzhewVar5;
        this.zzr = zzbxwVar;
        this.zzs = zzauoVar;
        this.zzt = versionInfoParcel;
        this.zzu = context;
        this.zzv = zzdiyVar;
        this.zzw = zzemnVar;
        this.zzx = new HashMap();
        this.zzy = new ArrayList();
    }

    public static boolean zzX(View view) {
        zzbbn zzbbnVar = zzbbw.zzjJ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            long H = com.google.android.gms.ads.internal.util.zzt.H(view);
            if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
                if (H >= ((Integer) zzbaVar.c.zza(zzbbw.zzjK)).intValue()) {
                    return true;
                }
            }
            return false;
        } else if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            return true;
        } else {
            return false;
        }
    }

    private final synchronized ImageView.ScaleType zzZ() {
        zzdkx zzdkxVar = this.zzn;
        if (zzdkxVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj = zzdkxVar.zzj();
        if (zzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.L0(zzj);
        }
        return zzdkb.zza;
    }

    private final void zzaa(String str, boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeH)).booleanValue()) {
            y9.a zzw = this.zzd.zzw();
            if (zzw == null) {
                return;
            }
            zzgcj.zzr(zzw, new zzdiu(this, "Google", true), this.zzc);
            return;
        }
        zzf("Google", true);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzf.zzd(this.zzn);
        this.zze.zzq(view, map, map2, zzZ());
        this.zzp = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzeeo zzeeoVar) {
        zzcej zzr = this.zzd.zzr();
        if (this.zzg.zzd() && zzeeoVar != null && zzr != null && view != null) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzj(zzeeoVar.zza(), view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad */
    public final synchronized void zzz(zzdkx zzdkxVar) {
        Iterator<String> keys;
        View view;
        zzauk zzc;
        if (!this.zzo) {
            this.zzn = zzdkxVar;
            this.zzf.zze(zzdkxVar);
            this.zze.zzy(zzdkxVar.zzf(), zzdkxVar.zzm(), zzdkxVar.zzn(), zzdkxVar, zzdkxVar);
            zzbbn zzbbnVar = zzbbw.zzcq;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && (zzc = this.zzs.zzc()) != null) {
                zzc.zzo(zzdkxVar.zzf());
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbA)).booleanValue()) {
                zzfel zzfelVar = this.zzb;
                if (zzfelVar.zzak && (keys = zzfelVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        WeakReference weakReference = (WeakReference) this.zzn.zzl().get(next);
                        this.zzx.put(next, Boolean.FALSE);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzaxx zzaxxVar = new zzaxx(this.zzu, view);
                            this.zzy.add(zzaxxVar);
                            zzaxxVar.zzc(new zzdit(this, next));
                        }
                    }
                }
            }
            if (zzdkxVar.zzi() != null) {
                zzdkxVar.zzi().zzc(this.zzr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae */
    public final void zzA(zzdkx zzdkxVar) {
        this.zze.zzz(zzdkxVar.zzf(), zzdkxVar.zzl());
        if (zzdkxVar.zzh() != null) {
            zzdkxVar.zzh().setClickable(false);
            zzdkxVar.zzh().removeAllViews();
        }
        if (zzdkxVar.zzi() != null) {
            zzdkxVar.zzi().zze(this.zzr);
        }
        this.zzn = null;
    }

    public static void zzl(zzdiw zzdiwVar) {
        try {
            zzdjb zzdjbVar = zzdiwVar.zzd;
            int zzc = zzdjbVar.zzc();
            if (zzc != 1) {
                if (zzc != 2) {
                    if (zzc != 3) {
                        if (zzc != 6) {
                            if (zzc != 7) {
                                com.google.android.gms.ads.internal.util.client.zzm.c("Wrong native template id!");
                                return;
                            }
                            zzdjm zzdjmVar = zzdiwVar.zzh;
                            if (zzdjmVar.zzg() != null) {
                                zzdjmVar.zzg().zzg((zzblk) zzdiwVar.zzl.zzb());
                            }
                        } else if (zzdiwVar.zzh.zzf() != null) {
                            zzdiwVar.zzaa("Google", true);
                            zzdiwVar.zzh.zzf().zze((zzbha) zzdiwVar.zzk.zzb());
                        }
                    } else if (zzdiwVar.zzh.zzd(zzdjbVar.zzA()) != null) {
                        if (zzdiwVar.zzd.zzs() != null) {
                            zzdiwVar.zzf("Google", true);
                        }
                        zzdiwVar.zzh.zzd(zzdiwVar.zzd.zzA()).zze((zzbfx) zzdiwVar.zzm.zzb());
                    }
                } else if (zzdiwVar.zzh.zza() != null) {
                    zzdiwVar.zzaa("Google", true);
                    zzdiwVar.zzh.zza().zze((zzbfs) zzdiwVar.zzj.zzb());
                }
            } else if (zzdiwVar.zzh.zzb() != null) {
                zzdiwVar.zzaa("Google", true);
                zzdiwVar.zzh.zzb().zze((zzbfu) zzdiwVar.zzi.zzb());
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final synchronized void zzB(View view, Map map, Map map2, boolean z10) {
        if (!this.zzp) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbA)).booleanValue() && this.zzb.zzak) {
                for (String str : this.zzx.keySet()) {
                    if (!((Boolean) this.zzx.get(str)).booleanValue()) {
                        break;
                    }
                }
            }
            if (!z10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdy)).booleanValue() && map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        View view2 = (View) ((WeakReference) entry.getValue()).get();
                        if (view2 != null && zzX(view2)) {
                            zzab(view, map, map2);
                            return;
                        }
                    }
                }
            } else {
                zzab(view, map, map2);
            }
        }
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zze.zzj(zzcwVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z10) {
        this.zzf.zzc(this.zzn);
        this.zze.zzk(view, view2, map, map2, z10, zzZ());
        if (this.zzq) {
            zzdjb zzdjbVar = this.zzd;
            if (zzdjbVar.zzs() != null) {
                zzdjbVar.zzs().zzd("onSdkAdUserInteractionClick", new y.b());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkE)).booleanValue()) {
            return;
        }
        zzdkx zzdkxVar = this.zzn;
        if (zzdkxVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        final boolean z10 = zzdkxVar instanceof zzdjv;
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiq
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.this.zzx(view, z10, i10);
            }
        });
    }

    public final synchronized void zzF(String str) {
        this.zze.zzl(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zze.zzm(bundle);
    }

    public final synchronized void zzH() {
        zzdkx zzdkxVar = this.zzn;
        if (zzdkxVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z10 = zzdkxVar instanceof zzdjv;
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdis
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.this.zzy(z10);
            }
        });
    }

    public final synchronized void zzI() {
        if (this.zzp) {
            return;
        }
        this.zze.zzr();
    }

    public final void zzJ(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeH)).booleanValue()) {
            zzbzt zzp = this.zzd.zzp();
            if (zzp == null) {
                return;
            }
            zzgcj.zzr(zzp, new zzdiv(this, view), this.zzc);
            return;
        }
        zzac(view, this.zzd.zzu());
    }

    public final synchronized void zzK(View view, MotionEvent motionEvent, View view2) {
        this.zze.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzL(Bundle bundle) {
        this.zze.zzt(bundle);
    }

    public final synchronized void zzM(View view) {
        this.zze.zzu(view);
    }

    public final synchronized void zzN() {
        this.zze.zzv();
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zze.zzw(zzcsVar);
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzw.zza(zzdgVar);
    }

    public final synchronized void zzQ(zzbgx zzbgxVar) {
        this.zze.zzx(zzbgxVar);
    }

    public final synchronized void zzR(final zzdkx zzdkxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzby)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.zzz(zzdkxVar);
                }
            });
        } else {
            zzz(zzdkxVar);
        }
    }

    public final synchronized void zzS(final zzdkx zzdkxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzby)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdin
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiw.this.zzA(zzdkxVar);
                }
            });
        } else {
            zzA(zzdkxVar);
        }
    }

    public final boolean zzT() {
        return this.zzg.zze();
    }

    public final synchronized boolean zzU() {
        return this.zze.zzA();
    }

    public final synchronized boolean zzV() {
        return this.zze.zzB();
    }

    public final boolean zzW() {
        return this.zzg.zzd();
    }

    public final synchronized boolean zzY(Bundle bundle) {
        if (this.zzp) {
            return true;
        }
        boolean zzC = this.zze.zzC(bundle);
        this.zzp = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final synchronized void zzb() {
        this.zzo = true;
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdir
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.this.zzw();
            }
        });
        super.zzb();
    }

    public final zzdiy zzc() {
        return this.zzv;
    }

    public final zzeeo zzf(String str, boolean z10) {
        boolean z11;
        boolean z12;
        String str2;
        VersionInfoParcel versionInfoParcel;
        zzeel zzeelVar;
        zzeel zzeelVar2;
        zzeek zzeekVar;
        String str3;
        if (!this.zzg.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdjb zzdjbVar = this.zzd;
        zzcej zzr = zzdjbVar.zzr();
        zzcej zzs = zzdjbVar.zzs();
        if (zzr == null && zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z13 = false;
        if (zzr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zzs != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeF)).booleanValue()) {
            this.zzg.zza();
            int zzc = this.zzg.zza().zzc();
            int i10 = zzc - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (zzc != 1) {
                        if (zzc != 2) {
                            str3 = "UNKNOWN";
                        } else {
                            str3 = "DISPLAY";
                        }
                    } else {
                        str3 = "VIDEO";
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.e("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                } else if (zzr != null) {
                    z12 = false;
                    z13 = true;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs != null) {
                z12 = true;
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e("Omid media type was video but there was no video webview.");
                return null;
            }
        } else {
            z13 = z11;
        }
        if (z13) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzr = zzs;
        }
        zzr.zzG();
        Context context = this.zzu;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        if (!zzuVar.f10573w.zzl(context)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        String str4 = this.zzt.f10346b + "." + versionInfoParcel.c;
        if (z12) {
            zzeekVar = zzeek.VIDEO;
            zzeelVar2 = zzeel.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdjb zzdjbVar2 = this.zzd;
            zzeek zzeekVar2 = zzeek.NATIVE_DISPLAY;
            if (zzdjbVar2.zzc() == 3) {
                zzeelVar = zzeel.UNSPECIFIED;
            } else {
                zzeelVar = zzeel.ONE_PIXEL;
            }
            zzeelVar2 = zzeelVar;
            zzeekVar = zzeekVar2;
        }
        zzeeo zzb = zzuVar.f10573w.zzb(str4, zzr.zzG(), "", "javascript", str2, str, zzeelVar2, zzeekVar, this.zzb.zzal);
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zzd.zzW(zzb);
        zzr.zzat(zzb);
        zzeei zzeeiVar = zzuVar.f10573w;
        if (z12) {
            zzeeiVar.zzj(zzb.zza(), zzs.zzF());
            this.zzq = true;
        }
        if (z10) {
            zzeeiVar.zzk(zzb.zza());
            zzr.zzd("onSdkLoaded", new y.b());
        }
        return zzb;
    }

    public final String zzg() {
        return this.zzg.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zze.zze(view, map, map2, zzZ());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zze.zzf(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zzk() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // java.lang.Runnable
            public final void run() {
                zzdiw.zzl(zzdiw.this);
            }
        });
        if (this.zzd.zzc() != 7) {
            Executor executor = this.zzc;
            final zzdjj zzdjjVar = this.zze;
            Objects.requireNonNull(zzdjjVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdip
                @Override // java.lang.Runnable
                public final void run() {
                    zzdjj.this.zzp();
                }
            });
        }
        super.zzk();
    }

    public final void zzu(View view) {
        zzeeo zzu = this.zzd.zzu();
        if (this.zzg.zzd() && zzu != null && view != null) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzg(zzu.zza(), view);
        }
    }

    public final synchronized void zzv() {
        this.zze.zzh();
    }

    public final /* synthetic */ void zzw() {
        this.zze.zzi();
        this.zzd.zzI();
    }

    public final /* synthetic */ void zzx(View view, boolean z10, int i10) {
        this.zze.zzo(view, this.zzn.zzf(), this.zzn.zzl(), this.zzn.zzm(), z10, zzZ(), i10);
    }

    public final /* synthetic */ void zzy(boolean z10) {
        this.zze.zzo(null, this.zzn.zzf(), this.zzn.zzl(), this.zzn.zzm(), z10, zzZ(), 0);
    }
}
