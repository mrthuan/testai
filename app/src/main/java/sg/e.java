package sg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.PathHolder;

/* compiled from: ThreadMapUtil.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, Rect> f29803a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, RectF> f29804b;
    public ConcurrentHashMap<String, Path> c;

    /* renamed from: d  reason: collision with root package name */
    public ConcurrentHashMap<String, ArrayList<tg.b>> f29805d;

    /* renamed from: e  reason: collision with root package name */
    public ConcurrentHashMap<String, Matrix> f29806e;

    /* compiled from: ThreadMapUtil.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f29807a = new e();
    }

    public final void a() {
        ConcurrentHashMap<String, Rect> concurrentHashMap = this.f29803a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, RectF> concurrentHashMap2 = this.f29804b;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        ConcurrentHashMap<String, Path> concurrentHashMap3 = this.c;
        if (concurrentHashMap3 != null) {
            concurrentHashMap3.clear();
        }
        ConcurrentHashMap<String, ArrayList<tg.b>> concurrentHashMap4 = this.f29805d;
        if (concurrentHashMap4 != null) {
            concurrentHashMap4.clear();
        }
        ConcurrentHashMap<String, Matrix> concurrentHashMap5 = this.f29806e;
        if (concurrentHashMap5 != null) {
            concurrentHashMap5.clear();
        }
    }

    public final ArrayList<tg.b> b(String str) {
        Thread currentThread = Thread.currentThread();
        if (this.f29805d == null) {
            this.f29805d = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, ArrayList<tg.b>> concurrentHashMap = this.f29805d;
        StringBuilder k10 = a0.a.k(str);
        k10.append(currentThread.getId());
        ArrayList<tg.b> arrayList = concurrentHashMap.get(k10.toString());
        if (arrayList == null) {
            ArrayList<tg.b> arrayList2 = new ArrayList<>(2);
            this.f29805d.put(currentThread.getName(), arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final Matrix c(String str) {
        Thread currentThread = Thread.currentThread();
        if (this.f29806e == null) {
            this.f29806e = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Matrix> concurrentHashMap = this.f29806e;
        StringBuilder k10 = a0.a.k(str);
        k10.append(currentThread.getId());
        Matrix matrix = concurrentHashMap.get(k10.toString());
        if (matrix == null) {
            Matrix matrix2 = new Matrix();
            this.f29806e.put(currentThread.getName(), matrix2);
            return matrix2;
        }
        return matrix;
    }

    public final Path d(String str) {
        Thread currentThread = Thread.currentThread();
        if (this.c == null) {
            this.c = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Path> concurrentHashMap = this.c;
        StringBuilder k10 = a0.a.k(str);
        k10.append(currentThread.getId());
        Path path = concurrentHashMap.get(k10.toString());
        if (path == null) {
            PathHolder pathHolder = new PathHolder();
            this.c.put(currentThread.getName(), pathHolder);
            return pathHolder;
        }
        return path;
    }

    public final Rect e(String str) {
        Thread currentThread = Thread.currentThread();
        if (this.f29803a == null) {
            this.f29803a = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Rect> concurrentHashMap = this.f29803a;
        StringBuilder k10 = a0.a.k(str);
        k10.append(currentThread.getId());
        Rect rect = concurrentHashMap.get(k10.toString());
        if (rect == null) {
            Rect rect2 = new Rect();
            this.f29803a.put(currentThread.getName(), rect2);
            return rect2;
        }
        return rect;
    }

    public final RectF f(String str) {
        Thread currentThread = Thread.currentThread();
        if (this.f29804b == null) {
            this.f29804b = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, RectF> concurrentHashMap = this.f29804b;
        StringBuilder k10 = a0.a.k(str);
        k10.append(currentThread.getId());
        RectF rectF = concurrentHashMap.get(k10.toString());
        if (rectF == null) {
            RectF rectF2 = new RectF();
            this.f29804b.put(currentThread.getName(), rectF2);
            return rectF2;
        }
        return rectF;
    }
}
