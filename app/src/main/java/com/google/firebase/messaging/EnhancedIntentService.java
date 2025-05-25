package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.b;
import d8.o;
import ha.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.f0;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes2.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f13634f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13635a;

    /* renamed from: b  reason: collision with root package name */
    public b f13636b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public int f13637d;

    /* renamed from: e  reason: collision with root package name */
    public int f13638e;

    /* loaded from: classes2.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13635a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.f13638e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            f0.b(intent);
        }
        synchronized (this.c) {
            int i10 = this.f13638e - 1;
            this.f13638e = i10;
            if (i10 == 0) {
                stopSelfResult(this.f13637d);
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.f13636b == null) {
            this.f13636b = new b(new a());
        }
        return this.f13636b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f13635a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.c) {
            this.f13637d = i11;
            this.f13638e++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13635a.execute(new e(1, this, b10, taskCompletionSource));
        o oVar = taskCompletionSource.f11978a;
        if (oVar.n()) {
            a(intent);
            return 2;
        }
        oVar.c(new t1.c(2), new OnCompleteListener() { // from class: jb.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                int i12 = EnhancedIntentService.f13634f;
                EnhancedIntentService.this.a(intent);
            }
        });
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
