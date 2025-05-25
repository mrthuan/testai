package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final b f4407h = new b();

    /* renamed from: a  reason: collision with root package name */
    public final w f4408a;

    /* renamed from: b  reason: collision with root package name */
    public final c<T> f4409b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f4410d;

    /* renamed from: e  reason: collision with root package name */
    public List<T> f4411e;

    /* renamed from: f  reason: collision with root package name */
    public List<T> f4412f;

    /* renamed from: g  reason: collision with root package name */
    public int f4413g;

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f4414a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f4414a.post(runnable);
        }
    }

    public e() {
        throw null;
    }

    public e(RecyclerView.Adapter adapter, kn.a aVar) {
        androidx.recyclerview.widget.b bVar = new androidx.recyclerview.widget.b(adapter);
        c.a aVar2 = new c.a(aVar);
        if (aVar2.f4397a == null) {
            synchronized (c.a.f4396b) {
                try {
                    if (c.a.c == null) {
                        c.a.c = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar2.f4397a = c.a.c;
        }
        c<T> cVar = new c<>(aVar2.f4397a, aVar);
        this.f4410d = new CopyOnWriteArrayList();
        this.f4412f = Collections.emptyList();
        this.f4408a = bVar;
        this.f4409b = cVar;
        this.c = f4407h;
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.f4410d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(list, this.f4412f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = this.f4413g + 1;
        this.f4413g = i10;
        List<T> list = this.f4411e;
        if (arrayList != list) {
            List<T> list2 = this.f4412f;
            if (list == null) {
                this.f4411e = arrayList;
                this.f4412f = Collections.unmodifiableList(arrayList);
                this.f4408a.b(0, arrayList.size());
                a(list2, null);
                return;
            }
            this.f4409b.f4394a.execute(new d(this, list, arrayList, i10));
        }
    }
}
