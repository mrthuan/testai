package w1;

/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends j {
    public abstract void d(b2.e eVar, T t4);

    public final void e(T t4) {
        b2.e a10 = a();
        try {
            d(a10, t4);
            a10.f5320b.executeInsert();
        } finally {
            c(a10);
        }
    }

    public final long f(T t4) {
        b2.e a10 = a();
        try {
            d(a10, t4);
            return a10.f5320b.executeInsert();
        } finally {
            c(a10);
        }
    }
}
