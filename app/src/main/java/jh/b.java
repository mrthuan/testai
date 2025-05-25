package jh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.system.f;

/* compiled from: PictureConverterMgr.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public f f19234b;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f19233a = new AtomicBoolean(false);
    public final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap<String, Thread> f19235d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentHashMap<String, List<Integer>> f19236e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, List<String>> f19237f = new ConcurrentHashMap<>();

    public b(f fVar) {
        this.f19234b = fVar;
    }

    public final synchronized void a(byte b10, String str, String str2, int i10, int i11, boolean z10) {
        boolean z11;
        Bitmap bitmap;
        if (this.f19233a.get()) {
            return;
        }
        try {
            if (b10 == 3) {
                bitmap = BitmapFactory.decodeFile(str2);
            } else if (b10 == 2) {
                bitmap = zi.a.a(i10, i11, str, str2);
            } else {
                bitmap = null;
            }
        } catch (Exception e10) {
            if (this.f19234b != null && (this.f19235d.get(str2) == null || this.f19234b.getView() == null)) {
                return;
            }
            this.f19234b.o().c().a(false, e10);
            d(str2);
        } catch (OutOfMemoryError e11) {
            this.f19234b.o().g().getClass();
            if (e.f19246h.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f19234b.o().g().g();
                a(b10, str, str2, i10, i11, z10);
            } else {
                this.f19234b.o().c().a(false, e11);
                d(str2);
            }
        }
        if (this.f19233a.get()) {
            return;
        }
        if (this.f19234b != null && (this.f19235d.get(str2) == null || this.f19234b.getView() == null)) {
            return;
        }
        if (bitmap != null) {
            this.f19234b.o().g().a(bitmap, str2);
            d(str2);
            if (!z10) {
                this.f19234b.r(-268435456, null);
            }
        } else {
            d(str2);
        }
    }

    public final void b() {
        this.f19233a.set(true);
        ConcurrentHashMap<String, Thread> concurrentHashMap = this.f19235d;
        if (concurrentHashMap != null) {
            for (Thread thread : concurrentHashMap.values()) {
                try {
                    thread.interrupt();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            concurrentHashMap.clear();
            this.f19236e.clear();
            this.f19237f.clear();
        }
    }

    public final boolean c(String str) {
        boolean containsKey;
        if (this.f19233a.get()) {
            return false;
        }
        synchronized (this.f19234b) {
            containsKey = this.f19236e.containsKey(str);
        }
        return containsKey;
    }

    public final void d(String str) {
        ArrayList arrayList;
        if (this.f19233a.get()) {
            return;
        }
        synchronized (this.f19234b) {
            ConcurrentHashMap<String, Thread> concurrentHashMap = this.f19235d;
            if (concurrentHashMap != null) {
                this.c.remove(concurrentHashMap.remove(str));
                List<Integer> remove = this.f19236e.remove(str);
                ArrayList arrayList2 = null;
                for (int i10 = 0; i10 < remove.size(); i10++) {
                    int intValue = remove.get(i10).intValue();
                    List<String> list = this.f19237f.get(Integer.valueOf(intValue));
                    list.remove(str);
                    if (list.size() == 0) {
                        this.f19237f.remove(Integer.valueOf(intValue));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(Integer.valueOf(intValue));
                    }
                }
                if (this.c.size() > 0) {
                    List<String> list2 = this.f19237f.get(Integer.valueOf(this.f19234b.z()));
                    if (list2 != null && list2.size() > 0) {
                        this.f19235d.get(list2.get(0)).start();
                    } else {
                        ((Thread) this.c.get(arrayList.size() - 1)).start();
                    }
                }
                if (arrayList2 != null && arrayList2.size() > 0) {
                    if (arrayList2.contains(Integer.valueOf(this.f19234b.z()))) {
                        this.f19234b.r(536870922, null);
                    }
                    this.f19234b.r(27, arrayList2);
                }
                if (this.f19235d.size() == 0) {
                    this.f19234b.r(26, Boolean.FALSE);
                }
            }
        }
    }
}
