package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzax {
    public final Uri zza;
    public final String zzb;
    public final zzas zzc;
    public final zzal zzd;
    public final List zze;
    public final String zzf;
    public final zzfxr zzg;
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzax(Uri uri, String str, zzas zzasVar, zzal zzalVar, List list, String str2, zzfxr zzfxrVar, Object obj, long j10, zzaw zzawVar) {
        this.zza = uri;
        int i10 = zzbn.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfxrVar;
        zzfxo zzfxoVar = new zzfxo();
        if (zzfxrVar.size() <= 0) {
            zzfxoVar.zzi();
            this.zzh = null;
            this.zzi = -9223372036854775807L;
            return;
        }
        zzba zzbaVar = (zzba) zzfxrVar.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zza.equals(zzaxVar.zza) && zzet.zzG(null, null) && zzet.zzG(null, null) && zzet.zzG(null, null) && this.zze.equals(zzaxVar.zze) && zzet.zzG(null, null) && this.zzg.equals(zzaxVar.zzg) && zzet.zzG(null, null) && zzet.zzG(-9223372036854775807L, -9223372036854775807L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zze.hashCode();
        return (int) ((((this.zzg.hashCode() + ((hashCode + (this.zza.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
