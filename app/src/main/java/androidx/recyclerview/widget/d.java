package androidx.recyclerview.widget;

import androidx.recyclerview.widget.n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f4399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f4400b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f4401d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f4402e;

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public class a extends n.b {
        public a() {
        }

        @Override // androidx.recyclerview.widget.n.b
        public final boolean a(int i10, int i11) {
            d dVar = d.this;
            Object obj = dVar.f4399a.get(i10);
            Object obj2 = dVar.f4400b.get(i11);
            if (obj != null && obj2 != null) {
                return dVar.f4402e.f4409b.f4395b.a(obj, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        @Override // androidx.recyclerview.widget.n.b
        public final boolean b(int i10, int i11) {
            d dVar = d.this;
            Object obj = dVar.f4399a.get(i10);
            Object obj2 = dVar.f4400b.get(i11);
            if (obj != null && obj2 != null) {
                return dVar.f4402e.f4409b.f4395b.b(obj, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.n.b
        public final void c(int i10, int i11) {
            d dVar = d.this;
            Object obj = dVar.f4399a.get(i10);
            Object obj2 = dVar.f4400b.get(i11);
            if (obj != null && obj2 != null) {
                dVar.f4402e.f4409b.f4395b.getClass();
                return;
            }
            throw new AssertionError();
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n.d f4404a;

        public b(n.d dVar) {
            this.f4404a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar;
            int[] iArr;
            int i10;
            n.b bVar;
            int i11;
            n.d dVar;
            e eVar;
            int i12;
            int i13;
            d dVar2 = d.this;
            e eVar2 = dVar2.f4402e;
            if (eVar2.f4413g == dVar2.c) {
                Collection collection = eVar2.f4412f;
                List<T> list = dVar2.f4400b;
                eVar2.f4411e = list;
                eVar2.f4412f = Collections.unmodifiableList(list);
                n.d dVar3 = this.f4404a;
                dVar3.getClass();
                w wVar = eVar2.f4408a;
                if (wVar instanceof f) {
                    fVar = (f) wVar;
                } else {
                    fVar = new f(wVar);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                List<n.c> list2 = dVar3.f4491a;
                int size = list2.size() - 1;
                int i14 = dVar3.f4494e;
                int i15 = dVar3.f4495f;
                int i16 = i14;
                while (size >= 0) {
                    n.c cVar = list2.get(size);
                    int i17 = cVar.f4489a;
                    int i18 = cVar.c;
                    int i19 = i17 + i18;
                    int i20 = cVar.f4490b;
                    int i21 = i18 + i20;
                    List<n.c> list3 = list2;
                    while (true) {
                        iArr = dVar3.f4492b;
                        i10 = i20;
                        bVar = dVar3.f4493d;
                        if (i16 <= i19) {
                            break;
                        }
                        i16--;
                        int i22 = iArr[i16];
                        if ((i22 & 12) != 0) {
                            i12 = i15;
                            int i23 = i22 >> 4;
                            i13 = i19;
                            n.f a10 = n.d.a(arrayDeque, i23, false);
                            if (a10 != null) {
                                eVar = eVar2;
                                int i24 = (i14 - a10.f4498b) - 1;
                                fVar.a(i16, i24);
                                if ((i22 & 4) != 0) {
                                    bVar.c(i16, i23);
                                    fVar.d(i24, 1, null);
                                }
                            } else {
                                eVar = eVar2;
                                arrayDeque.add(new n.f(i16, (i14 - i16) - 1, true));
                            }
                        } else {
                            eVar = eVar2;
                            i12 = i15;
                            i13 = i19;
                            fVar.c(i16, 1);
                            i14--;
                        }
                        i20 = i10;
                        i15 = i12;
                        i19 = i13;
                        eVar2 = eVar;
                    }
                    e eVar3 = eVar2;
                    while (i15 > i21) {
                        i15--;
                        int i25 = dVar3.c[i15];
                        if ((i25 & 12) != 0) {
                            int i26 = i25 >> 4;
                            i11 = i21;
                            dVar = dVar3;
                            n.f a11 = n.d.a(arrayDeque, i26, true);
                            if (a11 == null) {
                                arrayDeque.add(new n.f(i15, i14 - i16, false));
                            } else {
                                fVar.a((i14 - a11.f4498b) - 1, i16);
                                if ((i25 & 4) != 0) {
                                    bVar.c(i26, i15);
                                    fVar.d(i16, 1, null);
                                }
                            }
                        } else {
                            i11 = i21;
                            dVar = dVar3;
                            fVar.b(i16, 1);
                            i14++;
                        }
                        i21 = i11;
                        dVar3 = dVar;
                    }
                    n.d dVar4 = dVar3;
                    i16 = cVar.f4489a;
                    int i27 = i16;
                    int i28 = i10;
                    for (int i29 = 0; i29 < i18; i29++) {
                        if ((iArr[i27] & 15) == 2) {
                            bVar.c(i27, i28);
                            fVar.d(i27, 1, null);
                        }
                        i27++;
                        i28++;
                    }
                    size--;
                    list2 = list3;
                    i15 = i10;
                    dVar3 = dVar4;
                    eVar2 = eVar3;
                }
                fVar.e();
                eVar2.a(collection, dVar2.f4401d);
            }
        }
    }

    public d(e eVar, List list, ArrayList arrayList, int i10) {
        this.f4402e = eVar;
        this.f4399a = list;
        this.f4400b = arrayList;
        this.c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (r6[(r13 + 1) + r7] > r6[(r13 - 1) + r7]) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.run():void");
    }
}
