package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.f;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.o;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q7.a;
import y.i;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public class Rpc {

    /* renamed from: h  reason: collision with root package name */
    public static int f10835h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f10836i;

    /* renamed from: j  reason: collision with root package name */
    public static final zzz f10837j = zzz.f10871a;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f10838k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b  reason: collision with root package name */
    public final Context f10840b;
    public final zzt c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10841d;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f10843f;

    /* renamed from: g  reason: collision with root package name */
    public zzd f10844g;

    /* renamed from: a  reason: collision with root package name */
    public final i<String, TaskCompletionSource<Bundle>> f10839a = new i<>();

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f10842e = new Messenger(new a(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f10840b = context;
        this.c = new zzt(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10841d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (Rpc.class) {
            int i10 = f10835h;
            f10835h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (f10836i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f10836i = com.google.android.gms.internal.cloudmessaging.zza.zza(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
            }
            intent.putExtra("app", f10836i);
        }
    }

    public final o a(Bundle bundle) {
        final String b10 = b();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f10839a) {
            this.f10839a.put(b10, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f10840b, intent);
        intent.putExtra("kid", f.o(new StringBuilder(String.valueOf(b10).length() + 5), "|ID|", b10, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra("google.messenger", this.f10842e);
        if (this.f10843f != null || this.f10844g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f10843f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f10844g.f10845a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            final ScheduledFuture<?> schedule = this.f10841d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.c(new IOException("TIMEOUT"));
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.f11978a.c(f10837j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Rpc rpc = Rpc.this;
                    String str = b10;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (rpc.f10839a) {
                        rpc.f10839a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return taskCompletionSource.f11978a;
        }
        if (this.c.a() == 2) {
            this.f10840b.sendBroadcast(intent);
        } else {
            this.f10840b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f10841d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.c(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.f11978a.c(f10837j, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc rpc = Rpc.this;
                String str = b10;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (rpc.f10839a) {
                    rpc.f10839a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.f11978a;
    }

    public final void d(Bundle bundle, String str) {
        synchronized (this.f10839a) {
            TaskCompletionSource<Bundle> remove = this.f10839a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Missing callback for ".concat(valueOf);
                }
                return;
            }
            remove.b(bundle);
        }
    }
}
