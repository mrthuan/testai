package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfoh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfoh(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfoh zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfof
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.b(zzfqj.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfog
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.b(zzfqj.zzc());
                }
            });
        }
        return new zzfoh(context, executor, taskCompletionSource.f11978a, z10);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.g(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfod
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(task.o());
                }
            });
        }
        Context context = this.zzb;
        final zzara zza2 = zzare.zza();
        zza2.zza(context.getPackageName());
        zza2.zze(j10);
        zza2.zzg(zzf);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzf(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zzb(str2);
        }
        if (str != null) {
            zza2.zzc(str);
        }
        return this.zzd.g(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfoe
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (task.o()) {
                    int i11 = i10;
                    zzfqi zza3 = ((zzfqj) task.k()).zza(((zzare) zzara.this.zzbr()).zzaV());
                    zza3.zza(i11);
                    zza3.zzc();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public final Task zze(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }
}
