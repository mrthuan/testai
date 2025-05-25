package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzccv implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzccv(zzcbk zzcbkVar) {
        Context context = zzcbkVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzu.B.c.v(context, zzcbkVar.zzn().f10345a);
        this.zzc = new WeakReference(zzcbkVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzccv zzccvVar, String str, Map map) {
        zzcbk zzcbkVar = (zzcbk) zzccvVar.zzc.get();
        if (zzcbkVar != null) {
            zzcbkVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzccu(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzccs(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzcct(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzccr(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzccq(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzccn zzccnVar) {
        return zzt(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public void zzp(int i10) {
    }

    public void zzq(int i10) {
    }

    public void zzr(int i10) {
    }

    public void zzs(int i10) {
    }
}
