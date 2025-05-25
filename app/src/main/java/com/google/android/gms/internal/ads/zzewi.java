package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewi implements zzevo {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgcu zzc;
    private final ScheduledExecutorService zzd;
    private final zzeer zze;
    private final zzffg zzf;
    private final VersionInfoParcel zzg;

    public zzewi(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzeer zzeerVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgcuVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeerVar;
        this.zzf = zzffgVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0.zzd.f10223y != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzevo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y9.a zzb() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewi.zzb():y9.a");
    }

    public final /* synthetic */ y9.a zzc(final Throwable th2) {
        zzewk zzewkVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjA)).booleanValue();
                Throwable th3 = th2;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzx(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th2 instanceof SecurityException) {
            zzewkVar = new zzewk("", 2, null);
        } else if (th2 instanceof IllegalStateException) {
            zzewkVar = new zzewk("", 3, null);
        } else if (th2 instanceof IllegalArgumentException) {
            zzewkVar = new zzewk("", 4, null);
        } else if (th2 instanceof TimeoutException) {
            zzewkVar = new zzewk("", 5, null);
        } else {
            zzewkVar = new zzewk("", 0, null);
        }
        return zzgcj.zzh(zzewkVar);
    }
}
