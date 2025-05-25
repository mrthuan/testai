package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfpa {
    private final Context zza;
    private final Executor zzb;
    private final zzfoh zzc;
    private final zzfoj zzd;
    private final zzfoz zze;
    private final zzfoz zzf;
    private Task zzg;
    private Task zzh;

    public zzfpa(Context context, Executor executor, zzfoh zzfohVar, zzfoj zzfojVar, zzfox zzfoxVar, zzfoy zzfoyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfohVar;
        this.zzd = zzfojVar;
        this.zze = zzfoxVar;
        this.zzf = zzfoyVar;
    }

    public static zzfpa zze(Context context, Executor executor, zzfoh zzfohVar, zzfoj zzfojVar) {
        final zzfpa zzfpaVar = new zzfpa(context, executor, zzfohVar, zzfojVar, new zzfox(), new zzfoy());
        if (zzfpaVar.zzd.zzd()) {
            zzfpaVar.zzg = zzfpaVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfou
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfpa.this.zzc();
                }
            });
        } else {
            zzfpaVar.zzg = Tasks.e(zzfpaVar.zze.zza());
        }
        zzfpaVar.zzh = zzfpaVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfov
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfpa.this.zzd();
            }
        });
        return zzfpaVar;
    }

    private static zzasj zzg(Task task, zzasj zzasjVar) {
        if (!task.o()) {
            return zzasjVar;
        }
        return (zzasj) task.k();
    }

    private final Task zzh(Callable callable) {
        d8.o c = Tasks.c(callable, this.zzb);
        c.d(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfow
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfpa.this.zzf(exc);
            }
        });
        return c;
    }

    public final zzasj zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzasj zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final /* synthetic */ zzasj zzc() {
        zzaro zza = zzasj.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        String id2 = advertisingIdInfo.getId();
        if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id2 = Base64.encodeToString(bArr, 11);
        }
        if (id2 != null) {
            zza.zzs(id2);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzasj) zza.zzbr();
    }

    public final /* synthetic */ zzasj zzd() {
        Context context = this.zza;
        return zzfop.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
