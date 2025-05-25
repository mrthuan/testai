package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehy {
    private final zzgdc zzc;
    private zzeio zzf;
    private final String zzh;
    private final int zzi;
    private final zzein zzj;
    private zzfel zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private boolean zzl = false;

    public zzehy(zzfex zzfexVar, zzein zzeinVar, zzgdc zzgdcVar) {
        this.zzi = zzfexVar.zzb.zzb.zzr;
        this.zzj = zzeinVar;
        this.zzc = zzgdcVar;
        this.zzh = zzeiu.zzc(zzfexVar);
        List list = zzfexVar.zzb.zza;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.put((zzfel) list.get(i10), Integer.valueOf(i10));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zze() {
        this.zzj.zzi(this.zzk);
        zzeio zzeioVar = this.zzf;
        if (zzeioVar != null) {
            this.zzc.zzc(zzeioVar);
        } else {
            this.zzc.zzd(new zzeir(3, this.zzh));
        }
    }

    private final synchronized boolean zzf(boolean z10) {
        int i10;
        for (zzfel zzfelVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfelVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            Integer valueOf = Integer.valueOf(i10);
            if (z10 || !this.zze.contains(zzfelVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        int i10;
        for (zzfel zzfelVar : this.zzd) {
            Integer num = (Integer) this.zza.get(zzfelVar);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (Integer.valueOf(i10).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized boolean zzi() {
        if (this.zzl) {
            return false;
        }
        if (!this.zzb.isEmpty() && ((zzfel) this.zzb.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized zzfel zza() {
        if (zzi()) {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzfel zzfelVar = (zzfel) this.zzb.get(i10);
                String str = zzfelVar.zzat;
                if (!this.zze.contains(str)) {
                    if (zzfelVar.zzav) {
                        this.zzl = true;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.zze.add(str);
                    }
                    this.zzd.add(zzfelVar);
                    return (zzfel) this.zzb.remove(i10);
                }
            }
        }
        return null;
    }

    public final synchronized void zzb(Throwable th2, zzfel zzfelVar) {
        this.zzl = false;
        this.zzd.remove(zzfelVar);
        this.zze.remove(zzfelVar.zzat);
        if (!zzd() && !zzh()) {
            zze();
        }
    }

    public final synchronized void zzc(zzeio zzeioVar, zzfel zzfelVar) {
        int i10;
        this.zzl = false;
        this.zzd.remove(zzfelVar);
        if (zzd()) {
            zzeioVar.zzr();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfelVar);
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfelVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzeioVar;
        this.zzk = zzfelVar;
        if (!zzh()) {
            zze();
        }
    }

    public final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
