package androidx.recyclerview.widget;

import androidx.recyclerview.widget.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4488a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f4489a - cVar2.f4489a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f4489a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4490b;
        public final int c;

        public c(int i10, int i11, int i12) {
            this.f4489a = i10;
            this.f4490b = i11;
            this.c = i12;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f4491a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f4492b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final b f4493d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4494e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4495f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f4496g;

        public d(d.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            c cVar;
            b bVar;
            int[] iArr3;
            int[] iArr4;
            int i10;
            c cVar2;
            int i11;
            int i12;
            int i13;
            this.f4491a = arrayList;
            this.f4492b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4493d = aVar;
            androidx.recyclerview.widget.d dVar = androidx.recyclerview.widget.d.this;
            int size = dVar.f4399a.size();
            this.f4494e = size;
            int size2 = dVar.f4400b.size();
            this.f4495f = size2;
            this.f4496g = true;
            if (arrayList.isEmpty()) {
                cVar = null;
            } else {
                cVar = (c) arrayList.get(0);
            }
            if (cVar == null || cVar.f4489a != 0 || cVar.f4490b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(size, size2, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bVar = this.f4493d;
                iArr3 = this.c;
                iArr4 = this.f4492b;
                if (!hasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i14 = 0; i14 < cVar3.c; i14++) {
                    int i15 = cVar3.f4489a + i14;
                    int i16 = cVar3.f4490b + i14;
                    if (bVar.a(i15, i16)) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    iArr4[i15] = (i16 << 4) | i13;
                    iArr3[i16] = (i15 << 4) | i13;
                }
            }
            if (this.f4496g) {
                Iterator it2 = arrayList.iterator();
                int i17 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i10 = cVar4.f4489a;
                        if (i17 < i10) {
                            if (iArr4[i17] == 0) {
                                int size3 = arrayList.size();
                                int i18 = 0;
                                int i19 = 0;
                                while (true) {
                                    if (i18 < size3) {
                                        cVar2 = (c) arrayList.get(i18);
                                        while (true) {
                                            i11 = cVar2.f4490b;
                                            if (i19 < i11) {
                                                if (iArr3[i19] == 0 && bVar.b(i17, i19)) {
                                                    if (bVar.a(i17, i19)) {
                                                        i12 = 8;
                                                    } else {
                                                        i12 = 4;
                                                    }
                                                    iArr4[i17] = (i19 << 4) | i12;
                                                    iArr3[i19] = i12 | (i17 << 4);
                                                } else {
                                                    i19++;
                                                }
                                            }
                                        }
                                    }
                                    i19 = cVar2.c + i11;
                                    i18++;
                                }
                            }
                            i17++;
                        }
                    }
                    i17 = cVar4.c + i10;
                }
            }
        }

        public static f a(ArrayDeque arrayDeque, int i10, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = (f) it.next();
                    if (fVar.f4497a == i10 && fVar.c == z10) {
                        it.remove();
                        break;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f4498b--;
                } else {
                    fVar2.f4498b++;
                }
            }
            return fVar;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class e<T> {
        public abstract boolean a(T t4, T t10);

        public abstract boolean b(T t4, T t10);
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f4497a;

        /* renamed from: b  reason: collision with root package name */
        public int f4498b;
        public final boolean c;

        public f(int i10, int i11, boolean z10) {
            this.f4497a = i10;
            this.f4498b = i11;
            this.c = z10;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f4499a;

        /* renamed from: b  reason: collision with root package name */
        public int f4500b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4501d;

        public g() {
        }

        public g(int i10, int i11) {
            this.f4499a = 0;
            this.f4500b = i10;
            this.c = 0;
            this.f4501d = i11;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f4502a;

        /* renamed from: b  reason: collision with root package name */
        public int f4503b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4504d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4505e;

        public final int a() {
            return Math.min(this.c - this.f4502a, this.f4504d - this.f4503b);
        }
    }
}
