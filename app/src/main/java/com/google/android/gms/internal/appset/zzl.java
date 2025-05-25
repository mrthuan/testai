package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzl implements AppSetIdClient {
    private static AppSetIdClient zza;
    private final Context zzb;
    private boolean zzc;
    private final ScheduledExecutorService zzd;
    private final ExecutorService zze;

    public zzl(Context context) {
        this.zzc = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.zzd = newSingleThreadScheduledExecutor;
        this.zze = Executors.newSingleThreadExecutor();
        this.zzb = context;
        if (!this.zzc) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this, null), 0L, 86400L, TimeUnit.SECONDS);
            this.zzc = true;
        }
    }

    public static synchronized AppSetIdClient zzc(Context context) {
        AppSetIdClient appSetIdClient;
        synchronized (zzl.class) {
            if (context != null) {
                if (zza == null) {
                    zza = new zzl(context.getApplicationContext());
                }
                appSetIdClient = zza;
            } else {
                throw new NullPointerException("Context must not be null");
            }
        }
        return appSetIdClient;
    }

    public static final void zze(Context context) {
        if (!zzf(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(valueOf);
            }
        }
        if (!zzf(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            if (valueOf2.length() != 0) {
                "Failed to clear app set ID last used time for App ".concat(valueOf2);
            }
        }
    }

    private static final SharedPreferences zzf(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void zzg(Context context) {
        SharedPreferences zzf = zzf(context);
        DefaultClock.f11371a.getClass();
        if (!zzf.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to store app set ID last used time for App ".concat(valueOf);
            }
            throw new zzk("Failed to store the app set ID last used time.");
        }
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzl.this.zzd(taskCompletionSource);
            }
        });
        return taskCompletionSource.f11978a;
    }

    public final long zza() {
        long j10 = zzf(this.zzb).getLong("app_set_id_last_used_time", -1L);
        if (j10 == -1) {
            return -1L;
        }
        return j10 + 33696000000L;
    }

    public final void zzd(TaskCompletionSource taskCompletionSource) {
        String string = zzf(this.zzb).getString("app_set_id", null);
        long zza2 = zza();
        try {
            if (string != null) {
                DefaultClock.f11371a.getClass();
                if (System.currentTimeMillis() <= zza2) {
                    try {
                        zzg(this.zzb);
                        taskCompletionSource.b(new AppSetIdInfo(string, 1));
                        return;
                    } catch (zzk e10) {
                        taskCompletionSource.a(e10);
                        return;
                    }
                }
            }
            Context context = this.zzb;
            if (!zzf(context).edit().putString("app_set_id", string).commit()) {
                String valueOf = String.valueOf(context.getPackageName());
                if (valueOf.length() != 0) {
                    "Failed to store app set ID generated for App ".concat(valueOf);
                }
                throw new zzk("Failed to store the app set ID.");
            }
            zzg(context);
            Context context2 = this.zzb;
            SharedPreferences zzf = zzf(context2);
            DefaultClock.f11371a.getClass();
            if (!zzf.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                String valueOf2 = String.valueOf(context2.getPackageName());
                if (valueOf2.length() != 0) {
                    "Failed to store app set ID creation time for App ".concat(valueOf2);
                }
                throw new zzk("Failed to store the app set ID creation time.");
            }
            taskCompletionSource.b(new AppSetIdInfo(string, 1));
            return;
        } catch (zzk e11) {
            taskCompletionSource.a(e11);
            return;
        }
        string = UUID.randomUUID().toString();
    }
}
