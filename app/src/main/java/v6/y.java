package v6;

import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.s0;
import com.google.android.play.core.assetpacks.v1;
import com.google.android.play.core.assetpacks.y0;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class y implements x6.b, q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f30736a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30737b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f30738d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f30739e;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, q9.l lVar) {
        this.f30736a = obj;
        this.f30737b = obj2;
        this.c = obj3;
        this.f30738d = obj4;
        this.f30739e = lVar;
    }

    @Override // q9.m
    public final Object a() {
        Object a10 = ((q9.m) this.f30736a).a();
        return new s0((d0) a10, new q9.k(androidx.activity.s.j((q9.m) this.f30737b)), new q9.k(androidx.activity.s.j((q9.m) this.c)), (y0) ((q9.m) this.f30738d).a(), (v1) ((q9.m) this.f30739e).a());
    }

    @Override // pf.a
    public final Object get() {
        return new w((e7.a) ((pf.a) this.f30736a).get(), (e7.a) ((pf.a) this.f30737b).get(), (a7.e) ((pf.a) this.c).get(), (b7.e) ((pf.a) this.f30738d).get(), (b7.h) ((pf.a) this.f30739e).get());
    }
}
