package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzdff;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfjf;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzhfc;
import com.google.android.gms.internal.ads.zzhfk;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfu;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzau implements zzhfc {

    /* renamed from: a  reason: collision with root package name */
    public final zzhfu f10686a;

    /* renamed from: b  reason: collision with root package name */
    public final zzhfu f10687b;
    public final zzhfu c;

    /* renamed from: d  reason: collision with root package name */
    public final zzhfu f10688d;

    public zzau(zzhfl zzhflVar, zzax zzaxVar, zzcvv zzcvvVar, zzhfl zzhflVar2) {
        this.f10686a = zzhflVar;
        this.f10687b = zzaxVar;
        this.c = zzcvvVar;
        this.f10688d = zzhflVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzax zzaxVar = (zzax) this.f10687b;
        zzaxVar.getClass();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        zzfiq zza = ((zzfjl) this.f10686a.zzb()).zzb(zzfjf.GENERATE_SIGNALS, ((zzcvv) this.c).zzb().zzc()).zzf(new zzaw(zzgcuVar, ((zzdxl) zzaxVar.f10692a).zzb())).zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS).zza();
        zzgcj.zzr(zza, new g3.b((zzdff) this.f10688d.zzb()), zzgcuVar);
        return zza;
    }
}
