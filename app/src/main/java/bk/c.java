package bk;

import bk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.g;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f5446a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5447b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public a f5448d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5449e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5450f;

    public c(d taskRunner, String name) {
        g.e(taskRunner, "taskRunner");
        g.e(name, "name");
        this.f5446a = taskRunner;
        this.f5447b = name;
        this.f5449e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = ak.b.f665a;
        synchronized (this.f5446a) {
            if (b()) {
                this.f5446a.e(this);
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final boolean b() {
        a aVar = this.f5448d;
        if (aVar != null && aVar.f5443b) {
            this.f5450f = true;
        }
        ArrayList arrayList = this.f5449e;
        int size = arrayList.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (((a) arrayList.get(size)).f5443b) {
                    a aVar2 = (a) arrayList.get(size);
                    d.b bVar = d.f5451h;
                    if (d.f5453j.isLoggable(Level.FINE)) {
                        b.b.f(aVar2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final void c(a task, long j10) {
        g.e(task, "task");
        synchronized (this.f5446a) {
            if (this.c) {
                if (task.f5443b) {
                    d.f5451h.getClass();
                    if (d.f5453j.isLoggable(Level.FINE)) {
                        b.b.f(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                d.f5451h.getClass();
                if (d.f5453j.isLoggable(Level.FINE)) {
                    b.b.f(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (e(task, j10, false)) {
                this.f5446a.e(this);
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final boolean e(a task, long j10, boolean z10) {
        boolean z11;
        String h10;
        boolean z12;
        g.e(task, "task");
        c cVar = task.c;
        if (cVar != this) {
            if (cVar == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                task.c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c = this.f5446a.f5454a.c();
        long j11 = c + j10;
        ArrayList arrayList = this.f5449e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f5444d <= j11) {
                d.b bVar = d.f5451h;
                if (d.f5453j.isLoggable(Level.FINE)) {
                    b.b.f(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f5444d = j11;
        d.b bVar2 = d.f5451h;
        if (d.f5453j.isLoggable(Level.FINE)) {
            if (z10) {
                h10 = g.h(b.b.u(j11 - c), "run again after ");
            } else {
                h10 = g.h(b.b.u(j11 - c), "scheduled after ");
            }
            b.b.f(task, this, h10);
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f5444d - c > j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = arrayList.size();
        }
        arrayList.add(i10, task);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = ak.b.f665a;
        synchronized (this.f5446a) {
            this.c = true;
            if (b()) {
                this.f5446a.e(this);
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final String toString() {
        return this.f5447b;
    }
}
