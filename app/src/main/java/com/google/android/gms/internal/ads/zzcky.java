package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcky extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdqb zzc;
    private final zzeev zzd;
    private final zzelg zze;
    private final zzdun zzf;
    private final zzbya zzg;
    private final zzdqg zzh;
    private final zzdvi zzi;
    private final zzbel zzj;
    private final zzfki zzk;
    private final zzfgc zzl;
    private final zzcui zzm;
    private final zzdsk zzn;
    private boolean zzo = false;
    private final Long zzp;

    public zzcky(Context context, VersionInfoParcel versionInfoParcel, zzdqb zzdqbVar, zzeev zzeevVar, zzelg zzelgVar, zzdun zzdunVar, zzbya zzbyaVar, zzdqg zzdqgVar, zzdvi zzdviVar, zzbel zzbelVar, zzfki zzfkiVar, zzfgc zzfgcVar, zzcui zzcuiVar, zzdsk zzdskVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdqbVar;
        this.zzd = zzeevVar;
        this.zze = zzelgVar;
        this.zzf = zzdunVar;
        this.zzg = zzbyaVar;
        this.zzh = zzdqgVar;
        this.zzi = zzdviVar;
        this.zzj = zzbelVar;
        this.zzk = zzfkiVar;
        this.zzl = zzfgcVar;
        this.zzm = zzcuiVar;
        this.zzn = zzdskVar;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzp = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        if (zzuVar.f10557g.zzi().zzR()) {
            String zzl = zzuVar.f10557g.zzi().zzl();
            if (!zzuVar.f10563m.f(this.zza, zzl, this.zzb.f10345a)) {
                zzuVar.f10557g.zzi().c(false);
                zzuVar.f10557g.zzi().f("");
            }
        }
    }

    public final void zzc(Runnable runnable) {
        Preconditions.e("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzh().zze();
        if (!zze.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbog zzbogVar : zze.values()) {
                    for (zzbof zzbofVar : zzbogVar.zza) {
                        String str = zzbofVar.zzb;
                        for (String str2 : zzbofVar.zza) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzeew zza = this.zzd.zza(str3, jSONObject);
                        if (zza != null) {
                            zzfge zzfgeVar = (zzfge) zza.zzb;
                            if (!zzfgeVar.zzC() && zzfgeVar.zzB()) {
                                zzfgeVar.zzj(this.zza, (zzegq) zza.zzc, (List) entry.getValue());
                                com.google.android.gms.ads.internal.util.client.zzm.b("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzffn unused2) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(5);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfgl.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.B.f10558h.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.f10345a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) {
        try {
            zzfsc.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Mobile ads is initialized already.");
            return;
        }
        zzbbw.zza(this.zza);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzb;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10557g.zzu(context, versionInfoParcel);
        this.zzm.zzd();
        zzuVar.f10559i.zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        zzbbn zzbbnVar = zzbbw.zzdE;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzip)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzb();
                }
            });
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzjY)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckv
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzw();
                }
            });
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzcA)).booleanValue()) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcku
                @Override // java.lang.Runnable
                public final void run() {
                    zzcky.this.zzd();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(java.lang.String r16, com.google.android.gms.dynamic.IObjectWrapper r17) {
        /*
            r15 = this;
            r1 = r15
            android.content.Context r0 = r1.zza
            com.google.android.gms.internal.ads.zzbbw.zza(r0)
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzdI
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B     // Catch: android.os.RemoteException -> L23 java.lang.RuntimeException -> L25
            com.google.android.gms.ads.internal.util.zzt r0 = r0.c     // Catch: android.os.RemoteException -> L23 java.lang.RuntimeException -> L25
            android.content.Context r0 = r1.zza     // Catch: android.os.RemoteException -> L23 java.lang.RuntimeException -> L25
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.C(r0)     // Catch: android.os.RemoteException -> L23 java.lang.RuntimeException -> L25
            goto L31
        L23:
            r0 = move-exception
            goto L26
        L25:
            r0 = move-exception
        L26:
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.internal.ads.zzbze r2 = r2.f10557g
            java.lang.String r3 = "NonagonMobileAdsSettingManager_AppId"
            r2.zzw(r0, r3)
        L2f:
            java.lang.String r0 = ""
        L31:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r3 != r2) goto L3b
            r9 = r16
            goto L3c
        L3b:
            r9 = r0
        L3c:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L43
            goto L93
        L43:
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzdC
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r4 = r2.c
            java.lang.Object r0 = r4.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.google.android.gms.internal.ads.zzbbn r4 = com.google.android.gms.internal.ads.zzbbw.zzaH
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c
            java.lang.Object r5 = r2.zza(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = r0 | r5
            java.lang.Object r2 = r2.zza(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7a
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.L0(r17)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            com.google.android.gms.internal.ads.zzckw r2 = new com.google.android.gms.internal.ads.zzckw
            r2.<init>()
            goto L7c
        L7a:
            r2 = 0
            r3 = r0
        L7c:
            r11 = r2
            if (r3 == 0) goto L93
            android.content.Context r5 = r1.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = r1.zzb
            com.google.android.gms.internal.ads.zzfki r12 = r1.zzk
            com.google.android.gms.internal.ads.zzdsk r13 = r1.zzn
            java.lang.Long r14 = r1.zzp
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.zzf r4 = r0.f10561k
            r7 = 1
            r8 = 0
            r10 = 0
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcky.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        this.zzi.zzh(zzdaVar, zzdvh.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.f10401d = str;
        zzauVar.f10402e = this.zzb.f10345a;
        zzauVar.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbom zzbomVar) {
        this.zzl.zzf(zzbomVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzu.B.f10558h.b(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzu.B.f10558h.c(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbbw.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.B.f10561k.a(this.zza, this.zzb, true, null, str, null, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzblc zzblcVar) {
        this.zzf.zzs(zzblcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.B.f10558h.d();
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtv());
    }
}
