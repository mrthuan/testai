package jb;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber.java */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: i  reason: collision with root package name */
    public static final long f19104i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f19105j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19106a;

    /* renamed from: b  reason: collision with root package name */
    public final p f19107b;
    public final m c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f19108d;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f19110f;

    /* renamed from: h  reason: collision with root package name */
    public final a0 f19112h;

    /* renamed from: e  reason: collision with root package name */
    public final y.b f19109e = new y.b();

    /* renamed from: g  reason: collision with root package name */
    public boolean f19111g = false;

    public c0(FirebaseMessaging firebaseMessaging, p pVar, a0 a0Var, m mVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f19108d = firebaseMessaging;
        this.f19107b = pVar;
        this.f19112h = a0Var;
        this.c = mVar;
        this.f19106a = context;
        this.f19110f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) {
        try {
            Tasks.b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    public final void b(String str) {
        String a10 = this.f19108d.a();
        m mVar = this.c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(mVar.a(mVar.c(bundle, a10, "/topics/" + str)));
    }

    public final void c(String str) {
        String a10 = this.f19108d.a();
        m mVar = this.c;
        mVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(mVar.a(mVar.c(bundle, a10, "/topics/" + str)));
    }

    public final void e(z zVar) {
        synchronized (this.f19109e) {
            String str = zVar.c;
            if (!this.f19109e.containsKey(str)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.f19109e.getOrDefault(str, null);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
            if (taskCompletionSource != null) {
                taskCompletionSource.b(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f19109e.remove(str);
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.f19111g = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046 A[Catch: IOException -> 0x004d, TRY_LEAVE, TryCatch #0 {IOException -> 0x004d, blocks: (B:10:0x0011, B:25:0x003b, B:26:0x003f, B:27:0x0046, B:15:0x0020, B:18:0x002a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[LOOP:0: B:2:0x0000->B:43:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r6 = this;
        L0:
            monitor-enter(r6)
            jb.a0 r0 = r6.f19112h     // Catch: java.lang.Throwable -> L7f
            jb.z r0 = r0.a()     // Catch: java.lang.Throwable -> L7f
            r1 = 1
            if (r0 != 0) goto Lf
            d()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7f
            return r1
        Lf:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7f
            r2 = 0
            java.lang.String r3 = r0.f19171b     // Catch: java.io.IOException -> L4d
            int r4 = r3.hashCode()     // Catch: java.io.IOException -> L4d
            r5 = 83
            if (r4 == r5) goto L2a
            r5 = 85
            if (r4 == r5) goto L20
            goto L34
        L20:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L4d
            if (r3 == 0) goto L34
            r3 = r1
            goto L35
        L2a:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L4d
            if (r3 == 0) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = -1
        L35:
            java.lang.String r4 = r0.f19170a
            if (r3 == 0) goto L46
            if (r3 == r1) goto L3f
            d()     // Catch: java.io.IOException -> L4d
            goto L73
        L3f:
            r6.c(r4)     // Catch: java.io.IOException -> L4d
            d()     // Catch: java.io.IOException -> L4d
            goto L73
        L46:
            r6.b(r4)     // Catch: java.io.IOException -> L4d
            d()     // Catch: java.io.IOException -> L4d
            goto L73
        L4d:
            r1 = move-exception
            java.lang.String r3 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "INTERNAL_SERVER_ERROR"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L67
            goto L6f
        L67:
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L6e
            goto L72
        L6e:
            throw r1
        L6f:
            r1.getMessage()
        L72:
            r1 = r2
        L73:
            if (r1 != 0) goto L76
            return r2
        L76:
            jb.a0 r1 = r6.f19112h
            r1.c(r0)
            r6.e(r0)
            goto L0
        L7f:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.c0.g():boolean");
    }

    public final void h(long j10) {
        this.f19110f.schedule(new d0(this, this.f19106a, this.f19107b, Math.min(Math.max(30L, 2 * j10), f19104i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f19111g = true;
        }
    }
}
