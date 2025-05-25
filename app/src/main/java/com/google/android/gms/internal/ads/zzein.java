package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzein {
    private final Clock zza;
    private final zzeip zzb;
    private final zzfll zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgh)).booleanValue();
    private final zzeey zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzein(Clock clock, zzeip zzeipVar, zzeey zzeeyVar, zzfll zzfllVar) {
        this.zza = clock;
        this.zzb = zzeipVar;
        this.zzf = zzeeyVar;
        this.zzc = zzfllVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfel zzfelVar) {
        zzeim zzeimVar = (zzeim) this.zzd.get(zzfelVar);
        if (zzeimVar == null) {
            return false;
        }
        if (zzeimVar.zzc != 8) {
            return false;
        }
        return true;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized y9.a zzf(zzfex zzfexVar, zzfel zzfelVar, y9.a aVar, zzflh zzflhVar) {
        zzfeo zzfeoVar = zzfexVar.zzb.zzb;
        long b10 = this.zza.b();
        String str = zzfelVar.zzw;
        if (str != null) {
            this.zzd.put(zzfelVar, new zzeim(str, zzfelVar.zzaf, 9, 0L, null));
            zzgcj.zzr(aVar, new zzeil(this, b10, zzfeoVar, zzfelVar, str, zzflhVar, zzfexVar), zzbzo.zzf);
        }
        return aVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.zzd.entrySet()) {
            zzeim zzeimVar = (zzeim) entry.getValue();
            if (zzeimVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzeimVar.toString());
            }
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfel zzfelVar) {
        this.zzh = this.zza.b() - this.zzi;
        if (zzfelVar != null) {
            this.zzf.zze(zzfelVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.b() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfel zzfelVar = (zzfel) it.next();
            if (!TextUtils.isEmpty(zzfelVar.zzw)) {
                this.zzd.put(zzfelVar, new zzeim(zzfelVar.zzw, zzfelVar.zzaf, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.b();
    }

    public final synchronized void zzm(zzfel zzfelVar) {
        zzeim zzeimVar = (zzeim) this.zzd.get(zzfelVar);
        if (zzeimVar != null && !this.zzg) {
            zzeimVar.zzc = 8;
        }
    }
}
