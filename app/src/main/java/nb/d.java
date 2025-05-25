package nb;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d8.o;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f22409d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final t1.e f22410e = new t1.e(3);

    /* renamed from: a  reason: collision with root package name */
    public final Executor f22411a;

    /* renamed from: b  reason: collision with root package name */
    public final j f22412b;
    public o c = null;

    /* compiled from: ConfigCacheClient.java */
    /* loaded from: classes2.dex */
    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f22413a = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void c() {
            this.f22413a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.f22413a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.f22413a.countDown();
        }
    }

    public d(ScheduledExecutorService scheduledExecutorService, j jVar) {
        this.f22411a = scheduledExecutorService;
        this.f22412b = jVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        a aVar = new a();
        Executor executor = f22410e;
        task.f(executor, aVar);
        task.d(executor, aVar);
        task.a(executor, aVar);
        if (aVar.f22413a.await(5L, timeUnit)) {
            if (task.o()) {
                return task.k();
            }
            throw new ExecutionException(task.j());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d c(ScheduledExecutorService scheduledExecutorService, j jVar) {
        d dVar;
        synchronized (d.class) {
            String str = jVar.f22434b;
            HashMap hashMap = f22409d;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new d(scheduledExecutorService, jVar));
            }
            dVar = (d) hashMap.get(str);
        }
        return dVar;
    }

    public final synchronized Task<e> b() {
        o oVar = this.c;
        if (oVar == null || (oVar.n() && !this.c.o())) {
            Executor executor = this.f22411a;
            j jVar = this.f22412b;
            Objects.requireNonNull(jVar);
            this.c = Tasks.c(new t5.h(jVar, 2), executor);
        }
        return this.c;
    }
}
