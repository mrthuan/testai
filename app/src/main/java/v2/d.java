package v2;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import o2.h;

/* compiled from: ConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f30483f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final z2.a f30484a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f30485b;
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f30486d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public T f30487e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f30488a;

        public a(ArrayList arrayList) {
            this.f30488a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (t2.a aVar : this.f30488a) {
                aVar.a(d.this.f30487e);
            }
        }
    }

    static {
        h.e("ConstraintTracker");
    }

    public d(Context context, z2.a aVar) {
        this.f30485b = context.getApplicationContext();
        this.f30484a = aVar;
    }

    public abstract T a();

    public final void b(u2.c cVar) {
        synchronized (this.c) {
            if (this.f30486d.remove(cVar) && this.f30486d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(T t4) {
        synchronized (this.c) {
            T t10 = this.f30487e;
            if (t10 != t4 && (t10 == null || !t10.equals(t4))) {
                this.f30487e = t4;
                ((z2.b) this.f30484a).c.execute(new a(new ArrayList(this.f30486d)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
