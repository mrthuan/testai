package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdvd {
    private final zzdun zza;
    private final zzdpy zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdvd(zzdun zzdunVar, zzdpy zzdpyVar) {
        this.zza = zzdunVar;
        this.zzb = zzdpyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        zzdpx zza;
        zzbra zzbraVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbkv zzbkvVar = (zzbkv) it.next();
                    zzbbn zzbbnVar = zzbbw.zziw;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        zzdpx zza2 = this.zzb.zza(zzbkvVar.zza);
                        if (zza2 != null && (zzbraVar = zza2.zzc) != null) {
                            str = zzbraVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzbaVar.c.zza(zzbbw.zzix)).booleanValue() && (zza = this.zzb.zza(zzbkvVar.zza)) != null && zza.zzd) {
                        z10 = true;
                        List list2 = this.zzd;
                        String str3 = zzbkvVar.zza;
                        list2.add(new zzdvc(str3, str2, this.zzb.zzb(str3), zzbkvVar.zzb ? 1 : 0, zzbkvVar.zzd, zzbkvVar.zzc, z10));
                    }
                    z10 = false;
                    List list22 = this.zzd;
                    String str32 = zzbkvVar.zza;
                    list22.add(new zzdvc(str32, str2, this.zzb.zzb(str32), zzbkvVar.zzb ? 1 : 0, zzbkvVar.zzd, zzbkvVar.zzc, z10));
                }
                this.zze = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdvc zzdvcVar : this.zzd) {
                jSONArray.put(zzdvcVar.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdvb(this));
    }
}
