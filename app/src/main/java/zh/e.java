package zh;

import java.util.Iterator;

/* compiled from: ElementCollectionImpl.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f32384a;

    /* renamed from: b  reason: collision with root package name */
    public h[] f32385b;

    /* compiled from: ElementCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static final class a<D> implements Iterator<D> {

        /* renamed from: a  reason: collision with root package name */
        public final D[] f32386a;

        /* renamed from: b  reason: collision with root package name */
        public int f32387b = 0;
        public final int c;

        public a(D[] dArr, int i10) {
            this.f32386a = dArr;
            this.c = i10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f32387b < this.c) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final D next() {
            int i10 = this.f32387b;
            if (i10 < this.c) {
                this.f32387b = i10 + 1;
                return this.f32386a[i10];
            }
            throw new RuntimeException("No more elements to return.");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new RuntimeException("Cannot remove elements from this collection.");
        }
    }

    public e(int i10) {
        this.f32385b = new h[i10];
    }

    public final void a(h hVar) {
        int i10 = this.f32384a;
        h[] hVarArr = this.f32385b;
        if (i10 >= hVarArr.length) {
            h[] hVarArr2 = new h[i10 + 5];
            System.arraycopy(hVarArr, 0, hVarArr2, 0, i10);
            this.f32385b = hVarArr2;
        }
        h[] hVarArr3 = this.f32385b;
        int i11 = this.f32384a;
        hVarArr3[i11] = hVar;
        this.f32384a = i11 + 1;
    }

    public final void b() {
        if (this.f32385b != null) {
            for (int i10 = 0; i10 < this.f32384a; i10++) {
                this.f32385b[i10].dispose();
                this.f32385b[i10] = null;
            }
        }
        this.f32384a = 0;
    }

    public final h c(long j10) {
        int i10;
        int i11 = this.f32384a;
        int i12 = -1;
        if (i11 != 0 && j10 >= 0 && j10 < this.f32385b[i11 - 1].a()) {
            int i13 = this.f32384a;
            int i14 = 0;
            while (true) {
                i10 = (i13 + i14) / 2;
                h hVar = this.f32385b[i10];
                long b10 = hVar.b();
                long a10 = hVar.a();
                if (j10 >= b10 && j10 < a10) {
                    break;
                } else if (b10 > j10) {
                    i13 = i10 - 1;
                } else if (a10 <= j10) {
                    i14 = i10 + 1;
                }
            }
            i12 = i10;
        }
        return d(i12);
    }

    public final h d(int i10) {
        if (i10 >= 0 && i10 < this.f32384a) {
            return this.f32385b[i10];
        }
        return null;
    }
}
