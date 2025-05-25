package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o2.d;
import o2.e;
import o2.k;
import o2.o;
import y2.p;
import y2.q;
import y2.r;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4880a;

    /* renamed from: b  reason: collision with root package name */
    public final WorkerParameters f4881b;
    public volatile boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4882d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4883e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0025a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f4884a = androidx.work.b.f4909b;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0025a.class == obj.getClass()) {
                    return this.f4884a.equals(((C0025a) obj).f4884a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f4884a.hashCode() + (C0025a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f4884a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f4885a;

            public c() {
                this(androidx.work.b.f4909b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f4885a.equals(((c) obj).f4885a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f4885a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f4885a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f4885a = bVar;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f4880a = context;
                this.f4881b = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.f4880a;
    }

    public Executor getBackgroundExecutor() {
        return this.f4881b.f4895f;
    }

    public y9.a<d> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        aVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    public final UUID getId() {
        return this.f4881b.f4891a;
    }

    public final b getInputData() {
        return this.f4881b.f4892b;
    }

    public final Network getNetwork() {
        return this.f4881b.f4893d.c;
    }

    public final int getRunAttemptCount() {
        return this.f4881b.f4894e;
    }

    public final Set<String> getTags() {
        return this.f4881b.c;
    }

    public z2.a getTaskExecutor() {
        return this.f4881b.f4896g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f4881b.f4893d.f4900a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f4881b.f4893d.f4901b;
    }

    public o getWorkerFactory() {
        return this.f4881b.f4897h;
    }

    public boolean isRunInForeground() {
        return this.f4883e;
    }

    public final boolean isStopped() {
        return this.c;
    }

    public final boolean isUsed() {
        return this.f4882d;
    }

    public final y9.a<Void> setForegroundAsync(d dVar) {
        this.f4883e = true;
        e eVar = this.f4881b.f4899j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        p pVar = (p) eVar;
        pVar.getClass();
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        ((z2.b) pVar.f32026a).a(new y2.o(pVar, aVar, id2, dVar, applicationContext));
        return aVar;
    }

    public y9.a<Void> setProgressAsync(b bVar) {
        k kVar = this.f4881b.f4898i;
        getApplicationContext();
        UUID id2 = getId();
        r rVar = (r) kVar;
        rVar.getClass();
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        ((z2.b) rVar.f32032b).a(new q(rVar, id2, bVar, aVar));
        return aVar;
    }

    public void setRunInForeground(boolean z10) {
        this.f4883e = z10;
    }

    public final void setUsed() {
        this.f4882d = true;
    }

    public abstract y9.a<a> startWork();

    public final void stop() {
        this.c = true;
        onStopped();
    }

    public void onStopped() {
    }
}
