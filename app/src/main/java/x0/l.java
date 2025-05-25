package x0;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f31461a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<n> f31462b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f31463a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.lifecycle.n f31464b;

        public a(Lifecycle lifecycle, androidx.lifecycle.n nVar) {
            this.f31463a = lifecycle;
            this.f31464b = nVar;
            lifecycle.a(nVar);
        }
    }

    public l(Runnable runnable) {
        this.f31461a = runnable;
    }

    public final void a(n nVar) {
        this.f31462b.remove(nVar);
        a aVar = (a) this.c.remove(nVar);
        if (aVar != null) {
            aVar.f31463a.c(aVar.f31464b);
            aVar.f31464b = null;
        }
        this.f31461a.run();
    }
}
