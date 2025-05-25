package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import o2.h;
import p2.a;
import p2.j;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: a  reason: collision with root package name */
    public j f4962a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4963b = new HashMap();

    static {
        h.e("SystemJobService");
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        JobParameters jobParameters;
        h c = h.c();
        String.format("%s executed on JobScheduler", str);
        c.a(new Throwable[0]);
        synchronized (this.f4963b) {
            jobParameters = (JobParameters) this.f4963b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            j e10 = j.e(getApplicationContext());
            this.f4962a = e10;
            e10.f23631f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                h.c().f(new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f4962a;
        if (jVar != null) {
            jVar.f23631f.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            p2.j r0 = r8.f4962a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            o2.h r0 = o2.h.c()
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r0.a(r3)
            r8.jobFinished(r9, r1)
            return r2
        L13:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r4 == 0) goto L27
            boolean r5 = r4.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r5 == 0) goto L27
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r0 = r3
        L28:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L38
            o2.h r9 = o2.h.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r9.b(r0)
            return r2
        L38:
            java.util.HashMap r4 = r8.f4963b
            monitor-enter(r4)
            java.util.HashMap r5 = r8.f4963b     // Catch: java.lang.Throwable -> Laa
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto L57
            o2.h r9 = o2.h.c()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Laa
            r1[r2] = r0     // Catch: java.lang.Throwable -> Laa
            java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Laa
            r9.a(r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Laa
            return r2
        L57:
            o2.h r5 = o2.h.c()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Laa
            r7[r2] = r0     // Catch: java.lang.Throwable -> Laa
            java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Laa
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Laa
            r5.a(r2)     // Catch: java.lang.Throwable -> Laa
            java.util.HashMap r2 = r8.f4963b     // Catch: java.lang.Throwable -> Laa
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Laa
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto La4
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.emoji2.text.s.m(r9)
            if (r4 == 0) goto L8a
            android.net.Uri[] r4 = androidx.emoji2.text.s.m(r9)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4901b = r4
        L8a:
            java.lang.String[] r4 = com.google.android.gms.internal.ads.b.k(r9)
            if (r4 == 0) goto L9a
            java.lang.String[] r4 = com.google.android.gms.internal.ads.b.k(r9)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4900a = r4
        L9a:
            r4 = 28
            if (r2 < r4) goto La4
            android.net.Network r9 = androidx.window.layout.e.d(r9)
            r3.c = r9
        La4:
            p2.j r9 = r8.f4962a
            r9.i(r0, r3)
            return r1
        Laa:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Laa
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            p2.j r0 = r5.f4962a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            o2.h r6 = o2.h.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.a(r0)
            return r1
        L10:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L23
            if (r6 == 0) goto L23
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L23
            if (r3 == 0) goto L23
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L23
            goto L24
        L23:
            r6 = 0
        L24:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L34
            o2.h r6 = o2.h.c()
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r6.b(r0)
            return r2
        L34:
            o2.h r0 = o2.h.c()
            java.lang.String r3 = "onStopJob for %s"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r6
            java.lang.String.format(r3, r4)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r2)
            java.util.HashMap r0 = r5.f4963b
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f4963b     // Catch: java.lang.Throwable -> L5e
            r2.remove(r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            p2.j r0 = r5.f4962a
            r0.j(r6)
            p2.j r0 = r5.f4962a
            p2.c r0 = r0.f23631f
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L5e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
