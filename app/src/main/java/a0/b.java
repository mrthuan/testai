package a0;

import androidx.activity.s;
import androidx.constraintlayout.core.SolverVariable;
import b7.h;
import b7.i;
import com.google.android.play.core.assetpacks.d0;
import com.google.android.play.core.assetpacks.g1;
import com.google.android.play.core.assetpacks.y0;
import java.util.concurrent.Executor;
import q9.k;
import q9.l;
import q9.m;

/* compiled from: Cache.java */
/* loaded from: classes.dex */
public final class b implements x6.b, l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f13d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f11a = obj;
        this.f12b = obj2;
        this.c = obj3;
        this.f13d = obj4;
    }

    @Override // q9.m
    public final Object a() {
        return new g1((d0) ((m) this.f11a).a(), new k(s.j((m) this.f12b)), (y0) ((m) this.c).a());
    }

    @Override // pf.a
    public final Object get() {
        return new h((Executor) ((pf.a) this.f11a).get(), (c7.d) ((pf.a) this.f12b).get(), (i) ((pf.a) this.c).get(), (d7.a) ((pf.a) this.f13d).get());
    }

    public b() {
        this.f11a = new c();
        this.f12b = new c();
        this.c = new c();
        this.f13d = new SolverVariable[32];
    }
}
