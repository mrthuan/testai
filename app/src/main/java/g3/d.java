package g3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h3.a;
import java.util.ArrayList;
import java.util.List;
import p3.g;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public final class d implements e, m, a.InterfaceC0242a, j3.e {

    /* renamed from: a  reason: collision with root package name */
    public final f3.a f17515a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f17516b;
    public final Matrix c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f17517d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f17518e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17519f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17520g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f17521h;

    /* renamed from: i  reason: collision with root package name */
    public final e3.k f17522i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f17523j;

    /* renamed from: k  reason: collision with root package name */
    public final h3.o f17524k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(e3.k r8, com.airbnb.lottie.model.layer.a r9, l3.i r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f20474a
            boolean r4 = r10.c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List<l3.b> r10 = r10.f20475b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L11:
            int r2 = r10.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r10.get(r1)
            l3.b r2 = (l3.b) r2
            g3.c r2 = r2.a(r8, r9)
            if (r2 == 0) goto L26
            r5.add(r2)
        L26:
            int r1 = r1 + 1
            goto L11
        L29:
            int r1 = r10.size()
            if (r0 >= r1) goto L40
            java.lang.Object r1 = r10.get(r0)
            l3.b r1 = (l3.b) r1
            boolean r2 = r1 instanceof k3.k
            if (r2 == 0) goto L3d
            k3.k r1 = (k3.k) r1
            r6 = r1
            goto L42
        L3d:
            int r0 = r0 + 1
            goto L29
        L40:
            r10 = 0
            r6 = r10
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.d.<init>(e3.k, com.airbnb.lottie.model.layer.a, l3.i):void");
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17522i.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        int size = list.size();
        List<c> list3 = this.f17521h;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = list3.get(size2);
            cVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        h3.o oVar = this.f17524k;
        if (oVar != null) {
            oVar.c(aVar, obj);
        }
    }

    @Override // g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        h3.o oVar = this.f17524k;
        if (oVar != null) {
            matrix2.preConcat(oVar.d());
        }
        RectF rectF2 = this.f17518e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<c> list = this.f17521h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = list.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).d(rectF2, matrix2, z10);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final List<m> e() {
        if (this.f17523j == null) {
            this.f17523j = new ArrayList();
            int i10 = 0;
            while (true) {
                List<c> list = this.f17521h;
                if (i10 >= list.size()) {
                    break;
                }
                c cVar = list.get(i10);
                if (cVar instanceof m) {
                    this.f17523j.add((m) cVar);
                }
                i10++;
            }
        }
        return this.f17523j;
    }

    @Override // g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int intValue;
        if (this.f17520g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        h3.o oVar = this.f17524k;
        if (oVar != null) {
            matrix2.preConcat(oVar.d());
            h3.a<Integer, Integer> aVar = oVar.f17996j;
            if (aVar == null) {
                intValue = 100;
            } else {
                intValue = aVar.f().intValue();
            }
            i10 = (int) androidx.activity.r.b(intValue / 100.0f, i10, 255.0f, 255.0f);
        }
        boolean z11 = this.f17522i.f16382p;
        boolean z12 = false;
        List<c> list = this.f17521h;
        if (z11) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 < list.size()) {
                    if ((list.get(i11) instanceof e) && (i12 = i12 + 1) >= 2) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && i10 != 255) {
                z12 = true;
            }
        }
        if (z12) {
            RectF rectF = this.f17516b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix2, true);
            f3.a aVar2 = this.f17515a;
            aVar2.setAlpha(i10);
            g.a aVar3 = p3.g.f23679a;
            canvas.saveLayer(rectF, aVar2);
            androidx.activity.s.y();
        }
        if (z12) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(canvas, matrix2, i10);
            }
        }
        if (z12) {
            canvas.restore();
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        String str = this.f17519f;
        if (!dVar.c(i10, str)) {
            return;
        }
        if (!"__container".equals(str)) {
            dVar2.getClass();
            j3.d dVar3 = new j3.d(dVar2);
            dVar3.f19032a.add(str);
            if (dVar.a(i10, str)) {
                j3.d dVar4 = new j3.d(dVar3);
                dVar4.f19033b = this;
                arrayList.add(dVar4);
            }
            dVar2 = dVar3;
        }
        if (dVar.d(i10, str)) {
            int b10 = dVar.b(i10, str) + i10;
            int i11 = 0;
            while (true) {
                List<c> list = this.f17521h;
                if (i11 < list.size()) {
                    c cVar = list.get(i11);
                    if (cVar instanceof j3.e) {
                        ((j3.e) cVar).g(dVar, b10, arrayList, dVar2);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // g3.c
    public final String getName() {
        return this.f17519f;
    }

    @Override // g3.m
    public final Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        h3.o oVar = this.f17524k;
        if (oVar != null) {
            matrix.set(oVar.d());
        }
        Path path = this.f17517d;
        path.reset();
        if (this.f17520g) {
            return path;
        }
        List<c> list = this.f17521h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof m) {
                path.addPath(((m) cVar).getPath(), matrix);
            }
        }
        return path;
    }

    public d(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, String str, boolean z10, ArrayList arrayList, k3.k kVar2) {
        this.f17515a = new f3.a();
        this.f17516b = new RectF();
        this.c = new Matrix();
        this.f17517d = new Path();
        this.f17518e = new RectF();
        this.f17519f = str;
        this.f17522i = kVar;
        this.f17520g = z10;
        this.f17521h = arrayList;
        if (kVar2 != null) {
            h3.o oVar = new h3.o(kVar2);
            this.f17524k = oVar;
            oVar.a(aVar);
            oVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
