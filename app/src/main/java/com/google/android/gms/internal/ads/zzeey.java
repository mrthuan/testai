package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeey {
    private final String zzc;
    private zzfeo zzd = null;
    private zzfel zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeey(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfel zzfelVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdi)).booleanValue()) {
            return zzfelVar.zzap;
        }
        return zzfelVar.zzw;
    }

    private final synchronized void zzk(zzfel zzfelVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfelVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfelVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfelVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgd)).booleanValue()) {
            str = zzfelVar.zzF;
            str2 = zzfelVar.zzG;
            str3 = zzfelVar.zzH;
            str4 = zzfelVar.zzI;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfelVar.zzE, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i10, zzuVar);
        } catch (IndexOutOfBoundsException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzuVar);
    }

    private final void zzl(zzfel zzfelVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String zzj = zzj(zzfelVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfelVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(zzj);
            zzuVar.f10256b = j10;
            zzuVar.c = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzge)).booleanValue() && z10) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcwj zzb() {
        return new zzcwj(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfel zzfelVar) {
        zzk(zzfelVar, this.zza.size());
    }

    public final void zze(zzfel zzfelVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfelVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
                    zzuVar.f10256b = 0L;
                    zzuVar.c = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfel zzfelVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfelVar, j10, zzeVar, false);
    }

    public final void zzg(zzfel zzfelVar, long j10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfelVar, j10, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfel) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfeo zzfeoVar) {
        this.zzd = zzfeoVar;
    }
}
