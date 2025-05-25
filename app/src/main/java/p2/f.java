package p2;

import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class f extends o2.l {

    /* renamed from: a  reason: collision with root package name */
    public final j f23614a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23615b;
    public final ExistingWorkPolicy c;

    /* renamed from: d  reason: collision with root package name */
    public final List<? extends o2.m> f23616d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f23617e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f23618f;

    /* renamed from: g  reason: collision with root package name */
    public final List<f> f23619g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23620h;

    /* renamed from: i  reason: collision with root package name */
    public b f23621i;

    static {
        o2.h.e("WorkContinuationImpl");
    }

    public f() {
        throw null;
    }

    public f(j jVar, List<? extends o2.m> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        this.f23614a = jVar;
        this.f23615b = null;
        this.c = existingWorkPolicy;
        this.f23616d = list;
        this.f23619g = null;
        this.f23617e = new ArrayList(list.size());
        this.f23618f = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = list.get(i10).f22690a.toString();
            this.f23617e.add(uuid);
            this.f23618f.add(uuid);
        }
    }

    public static boolean c(f fVar, HashSet hashSet) {
        hashSet.addAll(fVar.f23617e);
        HashSet d10 = d(fVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (d10.contains((String) it.next())) {
                return true;
            }
        }
        List<f> list = fVar.f23619g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                if (c(fVar2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(fVar.f23617e);
        return false;
    }

    public static HashSet d(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.f23619g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                hashSet.addAll(fVar2.f23617e);
            }
        }
        return hashSet;
    }
}
