package y2;

import androidx.work.impl.WorkDatabase;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class p implements o2.e {

    /* renamed from: a  reason: collision with root package name */
    public final z2.a f32026a;

    /* renamed from: b  reason: collision with root package name */
    public final w2.a f32027b;
    public final x2.q c;

    static {
        o2.h.e("WMFgUpdater");
    }

    public p(WorkDatabase workDatabase, w2.a aVar, z2.a aVar2) {
        this.f32027b = aVar;
        this.f32026a = aVar2;
        this.c = workDatabase.p();
    }
}
