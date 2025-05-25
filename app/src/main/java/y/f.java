package y;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public final class f<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f31922e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f31923a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f31924b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f31925d;

    public f() {
        this(10);
    }

    public final void a(long j10, Long l10) {
        int i10 = this.f31925d;
        if (i10 != 0 && j10 <= this.f31924b[i10 - 1]) {
            h(j10, l10);
            return;
        }
        if (this.f31923a && i10 >= this.f31924b.length) {
            e();
        }
        int i11 = this.f31925d;
        if (i11 >= this.f31924b.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f31924b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f31924b = jArr;
            this.c = objArr;
        }
        this.f31924b[i11] = j10;
        this.c[i11] = l10;
        this.f31925d = i11 + 1;
    }

    public final void c() {
        int i10 = this.f31925d;
        Object[] objArr = this.c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f31925d = 0;
        this.f31923a = false;
    }

    /* renamed from: d */
    public final f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f31924b = (long[]) this.f31924b.clone();
            fVar.c = (Object[]) this.c.clone();
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void e() {
        int i10 = this.f31925d;
        long[] jArr = this.f31924b;
        Object[] objArr = this.c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f31922e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f31923a = false;
        this.f31925d = i11;
    }

    public final Object f(long j10, Long l10) {
        Object obj;
        int k10 = b.b.k(this.f31924b, this.f31925d, j10);
        if (k10 >= 0 && (obj = this.c[k10]) != f31922e) {
            return obj;
        }
        return l10;
    }

    public final long g(int i10) {
        if (this.f31923a) {
            e();
        }
        return this.f31924b[i10];
    }

    public final void h(long j10, E e10) {
        int k10 = b.b.k(this.f31924b, this.f31925d, j10);
        if (k10 >= 0) {
            this.c[k10] = e10;
            return;
        }
        int i10 = ~k10;
        int i11 = this.f31925d;
        if (i10 < i11) {
            Object[] objArr = this.c;
            if (objArr[i10] == f31922e) {
                this.f31924b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f31923a && i11 >= this.f31924b.length) {
            e();
            i10 = ~b.b.k(this.f31924b, this.f31925d, j10);
        }
        int i12 = this.f31925d;
        if (i12 >= this.f31924b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f31924b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f31924b = jArr;
            this.c = objArr2;
        }
        int i17 = this.f31925d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f31924b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f31925d - i10);
        }
        this.f31924b[i10] = j10;
        this.c[i10] = e10;
        this.f31925d++;
    }

    public final void i(long j10) {
        int k10 = b.b.k(this.f31924b, this.f31925d, j10);
        if (k10 >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[k10];
            Object obj2 = f31922e;
            if (obj != obj2) {
                objArr[k10] = obj2;
                this.f31923a = true;
            }
        }
    }

    public final int j() {
        if (this.f31923a) {
            e();
        }
        return this.f31925d;
    }

    public final E k(int i10) {
        if (this.f31923a) {
            e();
        }
        return (E) this.c[i10];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f31925d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f31925d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            E k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public f(int i10) {
        this.f31923a = false;
        if (i10 == 0) {
            this.f31924b = b.b.f5175h;
            this.c = b.b.f5176i;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f31924b = new long[i14];
        this.c = new Object[i14];
    }
}
