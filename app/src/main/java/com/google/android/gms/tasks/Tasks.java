package com.google.android.gms.tasks;

import androidx.core.content.e;
import com.android.billingclient.api.h0;
import com.google.android.gms.common.internal.Preconditions;
import d8.a;
import d8.b;
import d8.m;
import d8.n;
import d8.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult a(Task<TResult> task) {
        Preconditions.i("Must not be called on the main application thread");
        Preconditions.h();
        if (task != null) {
            if (task.n()) {
                return (TResult) h(task);
            }
            a aVar = new a();
            m mVar = TaskExecutors.f11980b;
            task.f(mVar, aVar);
            task.d(mVar, aVar);
            task.a(mVar, aVar);
            aVar.f16122a.await();
            return (TResult) h(task);
        }
        throw new NullPointerException("Task must not be null");
    }

    public static <TResult> TResult b(Task<TResult> task, long j10, TimeUnit timeUnit) {
        Preconditions.i("Must not be called on the main application thread");
        Preconditions.h();
        if (task != null) {
            if (timeUnit != null) {
                if (task.n()) {
                    return (TResult) h(task);
                }
                a aVar = new a();
                m mVar = TaskExecutors.f11980b;
                task.f(mVar, aVar);
                task.d(mVar, aVar);
                task.a(mVar, aVar);
                if (aVar.f16122a.await(j10, timeUnit)) {
                    return (TResult) h(task);
                }
                throw new TimeoutException("Timed out waiting for Task");
            }
            throw new NullPointerException("TimeUnit must not be null");
        }
        throw new NullPointerException("Task must not be null");
    }

    @Deprecated
    public static o c(Callable callable, Executor executor) {
        if (executor != null) {
            if (callable != null) {
                o oVar = new o();
                executor.execute(new h0(3, oVar, callable));
                return oVar;
            }
            throw new NullPointerException("Callback must not be null");
        }
        throw new NullPointerException("Executor must not be null");
    }

    public static o d(Exception exc) {
        o oVar = new o();
        oVar.t(exc);
        return oVar;
    }

    public static o e(Object obj) {
        o oVar = new o();
        oVar.u(obj);
        return oVar;
    }

    public static o f(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            o oVar = new o();
            b bVar = new b(list.size(), oVar);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Task task = (Task) it2.next();
                m mVar = TaskExecutors.f11980b;
                task.f(mVar, bVar);
                task.d(mVar, bVar);
                task.a(mVar, bVar);
            }
            return oVar;
        }
        return e(null);
    }

    public static Task<List<Task<?>>> g(Task<?>... taskArr) {
        if (taskArr.length == 0) {
            return e(Collections.emptyList());
        }
        List asList = Arrays.asList(taskArr);
        n nVar = TaskExecutors.f11979a;
        if (asList != null && !asList.isEmpty()) {
            return f(asList).i(nVar, new e(asList));
        }
        return e(Collections.emptyList());
    }

    public static Object h(Task task) {
        if (task.o()) {
            return task.k();
        }
        if (task.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.j());
    }
}
