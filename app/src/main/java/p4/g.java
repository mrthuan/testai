package p4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f23698a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f23699b;
    public long c;

    public g(long j10) {
        this.f23699b = j10;
    }

    public final synchronized Y a(T t4) {
        return (Y) this.f23698a.get(t4);
    }

    public int b(Y y10) {
        return 1;
    }

    public final synchronized Y d(T t4, Y y10) {
        long b10 = b(y10);
        if (b10 >= this.f23699b) {
            c(t4, y10);
            return null;
        }
        if (y10 != null) {
            this.c += b10;
        }
        Y y11 = (Y) this.f23698a.put(t4, y10);
        if (y11 != null) {
            this.c -= b(y11);
            if (!y11.equals(y10)) {
                c(t4, y11);
            }
        }
        e(this.f23699b);
        return y11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j10) {
        while (this.c > j10) {
            Iterator it = this.f23698a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.c -= b(value);
            Object key = entry.getKey();
            it.remove();
            c(key, value);
        }
    }

    public void c(T t4, Y y10) {
    }
}
