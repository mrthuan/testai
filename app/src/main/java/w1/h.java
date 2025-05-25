package w1;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public final class h implements a2.d, Closeable {

    /* renamed from: i  reason: collision with root package name */
    public static final TreeMap<Integer, h> f30922i = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    public volatile String f30923a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f30924b;
    public final double[] c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f30925d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[][] f30926e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f30927f;

    /* renamed from: g  reason: collision with root package name */
    public final int f30928g;

    /* renamed from: h  reason: collision with root package name */
    public int f30929h;

    public h(int i10) {
        this.f30928g = i10;
        int i11 = i10 + 1;
        this.f30927f = new int[i11];
        this.f30924b = new long[i11];
        this.c = new double[i11];
        this.f30925d = new String[i11];
        this.f30926e = new byte[i11];
    }

    public static h b(int i10, String str) {
        TreeMap<Integer, h> treeMap = f30922i;
        synchronized (treeMap) {
            Map.Entry<Integer, h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                h value = ceilingEntry.getValue();
                value.f30923a = str;
                value.f30929h = i10;
                return value;
            }
            h hVar = new h(i10);
            hVar.f30923a = str;
            hVar.f30929h = i10;
            return hVar;
        }
    }

    @Override // a2.d
    public final void a(b2.d dVar) {
        for (int i10 = 1; i10 <= this.f30929h; i10++) {
            int i11 = this.f30927f[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                dVar.a(i10, this.f30926e[i10]);
                            }
                        } else {
                            dVar.f(i10, this.f30925d[i10]);
                        }
                    } else {
                        dVar.b(this.c[i10], i10);
                    }
                } else {
                    dVar.c(i10, this.f30924b[i10]);
                }
            } else {
                dVar.d(i10);
            }
        }
    }

    @Override // a2.d
    public final String c() {
        return this.f30923a;
    }

    public final void d(int i10, long j10) {
        this.f30927f[i10] = 2;
        this.f30924b[i10] = j10;
    }

    public final void f(int i10) {
        this.f30927f[i10] = 1;
    }

    public final void h(int i10, String str) {
        this.f30927f[i10] = 4;
        this.f30925d[i10] = str;
    }

    public final void i() {
        TreeMap<Integer, h> treeMap = f30922i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f30928g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
