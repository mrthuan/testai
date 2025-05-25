package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.f0;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3949b;
    public final /* synthetic */ ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3950d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3951e;

    public v0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3948a = i10;
        this.f3949b = arrayList;
        this.c = arrayList2;
        this.f3950d = arrayList3;
        this.f3951e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f3948a; i10++) {
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.v((View) this.f3949b.get(i10), (String) this.c.get(i10));
            f0.i.v((View) this.f3950d.get(i10), (String) this.f3951e.get(i10));
        }
    }
}
