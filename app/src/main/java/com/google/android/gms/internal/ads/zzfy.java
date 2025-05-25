package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfy {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzbd.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder g10 = b.a.g("DataSpec[GET ", this.zza.toString(), ", ");
        g10.append(this.zze);
        g10.append(", ");
        g10.append(this.zzf);
        g10.append(", null, ");
        return a6.h.g(g10, this.zzg, "]");
    }

    public final zzfw zza() {
        return new zzfw(this, null);
    }

    public final boolean zzb(int i10) {
        if ((this.zzg & i10) == i10) {
            return true;
        }
        return false;
    }

    private zzfy(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z10 = false;
        boolean z11 = j11 >= 0;
        zzdi.zzd(z11);
        zzdi.zzd(z11);
        if (j12 <= 0) {
            j12 = j12 == -1 ? -1L : j12;
            zzdi.zzd(z10);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j11;
            this.zzf = j12;
            this.zzg = i11;
        }
        z10 = true;
        zzdi.zzd(z10);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j11;
        this.zzf = j12;
        this.zzg = i11;
    }

    @Deprecated
    public zzfy(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }
}
