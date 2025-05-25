package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, HashSet<WeakReference<a>>> f3461a;

    /* compiled from: SharedValues.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b() {
        new SparseIntArray();
        this.f3461a = new HashMap<>();
    }

    public final void a(int i10, a aVar) {
        HashMap<Integer, HashSet<WeakReference<a>>> hashMap = this.f3461a;
        HashSet<WeakReference<a>> hashSet = hashMap.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
