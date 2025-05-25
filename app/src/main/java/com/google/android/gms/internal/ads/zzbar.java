package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbar {
    private zzbag zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbar(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbar zzbarVar) {
        synchronized (zzbarVar.zzd) {
            zzbag zzbagVar = zzbarVar.zza;
            if (zzbagVar == null) {
                return;
            }
            zzbagVar.disconnect();
            zzbarVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzbah zzbahVar) {
        zzbal zzbalVar = new zzbal(this);
        zzbap zzbapVar = new zzbap(this, zzbahVar, zzbalVar);
        zzbaq zzbaqVar = new zzbaq(this, zzbalVar);
        synchronized (this.zzd) {
            zzbag zzbagVar = new zzbag(this.zzc, com.google.android.gms.ads.internal.zzu.B.f10568r.a(), zzbapVar, zzbaqVar);
            this.zza = zzbagVar;
            zzbagVar.checkAvailabilityAndConnect();
        }
        return zzbalVar;
    }
}
