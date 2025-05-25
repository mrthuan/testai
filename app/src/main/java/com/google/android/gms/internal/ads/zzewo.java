package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewo implements zzevo {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyv zzg;

    public zzewo(zzbyv zzbyvVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.zzg = zzbyvVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzbbn zzbbnVar = zzbbw.zzaL;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return zzgcj.zze((zzgca) zzgcj.zzo(zzgcj.zzm(zzgca.zzu(this.zzg.zza(this.zza, this.zzd)), new zzful() { // from class: com.google.android.gms.internal.ads.zzewm
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    return zzewo.this.zzc((AdvertisingIdClient.Info) obj);
                }
            }, this.zzc), ((Long) zzbaVar.c.zza(zzbbw.zzaM)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzewn
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    return zzewo.this.zzd((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzgcj.zzg(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = com.google.android.gms.internal.ads.zzfsb.zzj(r7.zza);
        java.util.Objects.requireNonNull(r8);
        r2 = r8.getId();
        java.util.Objects.requireNonNull(r2);
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzcR)).longValue(), r7.zzf);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzcL)).booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zzcM)).booleanValue() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzewp zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfry r0 = new com.google.android.gms.internal.ads.zzfry
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbbn r1 = com.google.android.gms.internal.ads.zzbbw.zzcL
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zzbbn r1 = com.google.android.gms.internal.ads.zzbbw.zzcM
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfsb r1 = com.google.android.gms.internal.ads.zzfsb.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzcR     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfry r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.google.android.gms.ads.internal.zzu r1 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.internal.ads.zzbze r1 = r1.f10557g
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzfry r0 = new com.google.android.gms.internal.ads.zzfry
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.zzewp r1 = new com.google.android.gms.internal.ads.zzewp
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewo.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzewp");
    }

    public final zzewp zzd(Throwable th2) {
        String string;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzewp(null, string, new zzfry());
    }
}
