package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0242a, k, e {

    /* renamed from: e  reason: collision with root package name */
    public final e3.k f17501e;

    /* renamed from: f  reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.a f17502f;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f17504h;

    /* renamed from: i  reason: collision with root package name */
    public final f3.a f17505i;

    /* renamed from: j  reason: collision with root package name */
    public final h3.c f17506j;

    /* renamed from: k  reason: collision with root package name */
    public final h3.e f17507k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f17508l;

    /* renamed from: m  reason: collision with root package name */
    public final h3.c f17509m;

    /* renamed from: n  reason: collision with root package name */
    public h3.p f17510n;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f17498a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f17499b = new Path();
    public final Path c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f17500d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f17503g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: g3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0230a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f17511a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final s f17512b;

        public C0230a(s sVar) {
            this.f17512b = sVar;
        }
    }

    public a(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f10, k3.d dVar, k3.b bVar, List<k3.b> list, k3.b bVar2) {
        f3.a aVar2 = new f3.a(1);
        this.f17505i = aVar2;
        this.f17501e = kVar;
        this.f17502f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f17507k = (h3.e) dVar.a();
        this.f17506j = (h3.c) bVar.a();
        if (bVar2 == null) {
            this.f17509m = null;
        } else {
            this.f17509m = (h3.c) bVar2.a();
        }
        this.f17508l = new ArrayList(list.size());
        this.f17504h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f17508l.add(list.get(i10).a());
        }
        aVar.e(this.f17507k);
        aVar.e(this.f17506j);
        for (int i11 = 0; i11 < this.f17508l.size(); i11++) {
            aVar.e((h3.a) this.f17508l.get(i11));
        }
        h3.c cVar = this.f17509m;
        if (cVar != null) {
            aVar.e(cVar);
        }
        this.f17507k.a(this);
        this.f17506j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((h3.a) this.f17508l.get(i12)).a(this);
        }
        h3.c cVar2 = this.f17509m;
        if (cVar2 != null) {
            cVar2.a(this);
        }
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17501e.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0230a c0230a = null;
        s sVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f17503g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (c0230a != null) {
                        arrayList.add(c0230a);
                    }
                    C0230a c0230a2 = new C0230a(sVar3);
                    sVar3.c(this);
                    c0230a = c0230a2;
                }
            }
            if (cVar2 instanceof m) {
                if (c0230a == null) {
                    c0230a = new C0230a(sVar);
                }
                c0230a.f17511a.add((m) cVar2);
            }
        }
        if (c0230a != null) {
            arrayList.add(c0230a);
        }
    }

    @Override // j3.e
    public void c(n3.a aVar, Object obj) {
        if (obj == e3.o.f16416d) {
            this.f17507k.j(aVar);
        } else if (obj == e3.o.f16427o) {
            this.f17506j.j(aVar);
        } else if (obj == e3.o.C) {
            h3.p pVar = this.f17510n;
            com.airbnb.lottie.model.layer.a aVar2 = this.f17502f;
            if (pVar != null) {
                aVar2.m(pVar);
            }
            if (aVar == null) {
                this.f17510n = null;
                return;
            }
            h3.p pVar2 = new h3.p(aVar, null);
            this.f17510n = pVar2;
            pVar2.a(this);
            aVar2.e(this.f17510n);
        }
    }

    @Override // g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f17499b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17503g;
            if (i10 < arrayList.size()) {
                C0230a c0230a = (C0230a) arrayList.get(i10);
                for (int i11 = 0; i11 < c0230a.f17511a.size(); i11++) {
                    path.addPath(((m) c0230a.f17511a.get(i11)).getPath(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.f17500d;
                path.computeBounds(rectF2, false);
                float k10 = this.f17506j.k() / 2.0f;
                rectF2.set(rectF2.left - k10, rectF2.top - k10, rectF2.right + k10, rectF2.bottom + k10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                androidx.activity.s.y();
                return;
            }
        }
    }

    @Override // g3.e
    public void f(Canvas canvas, Matrix matrix, int i10) {
        float[] fArr;
        float floatValue;
        float f10;
        float f11;
        float f12;
        a aVar = this;
        float[] fArr2 = p3.g.f23681d.get();
        int i11 = 0;
        float f13 = 0.0f;
        fArr2[0] = 0.0f;
        boolean z10 = true;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            z10 = false;
        }
        if (z10) {
            androidx.activity.s.y();
            return;
        }
        h3.e eVar = aVar.f17507k;
        float f14 = 100.0f;
        PointF pointF = p3.f.f23678a;
        int max = Math.max(0, Math.min((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) androidx.activity.r.b(i10 / 255.0f, eVar.k(eVar.b(), eVar.d()), 100.0f, 255.0f)));
        f3.a aVar2 = aVar.f17505i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(p3.g.d(matrix) * aVar.f17506j.k());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            androidx.activity.s.y();
            return;
        }
        ArrayList arrayList = aVar.f17508l;
        float f15 = 1.0f;
        if (arrayList.isEmpty()) {
            androidx.activity.s.y();
        } else {
            float d10 = p3.g.d(matrix);
            int i12 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f17504h;
                if (i12 >= size) {
                    break;
                }
                float floatValue2 = ((Float) ((h3.a) arrayList.get(i12)).f()).floatValue();
                fArr[i12] = floatValue2;
                if (i12 % 2 == 0) {
                    if (floatValue2 < 1.0f) {
                        fArr[i12] = 1.0f;
                    }
                } else if (floatValue2 < 0.1f) {
                    fArr[i12] = 0.1f;
                }
                fArr[i12] = fArr[i12] * d10;
                i12++;
            }
            h3.c cVar = aVar.f17509m;
            if (cVar == null) {
                floatValue = 0.0f;
            } else {
                floatValue = cVar.f().floatValue() * d10;
            }
            aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
            androidx.activity.s.y();
        }
        h3.p pVar = aVar.f17510n;
        if (pVar != null) {
            aVar2.setColorFilter((ColorFilter) pVar.f());
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = aVar.f17503g;
            if (i11 < arrayList2.size()) {
                C0230a c0230a = (C0230a) arrayList2.get(i11);
                s sVar = c0230a.f17512b;
                Path path = aVar.f17499b;
                ArrayList arrayList3 = c0230a.f17511a;
                if (sVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        path.addPath(((m) arrayList3.get(size2)).getPath(), matrix);
                    }
                    PathMeasure pathMeasure = aVar.f17498a;
                    pathMeasure.setPath(path, z11);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    s sVar2 = c0230a.f17512b;
                    float floatValue3 = (sVar2.f17620f.f().floatValue() * length) / 360.0f;
                    float floatValue4 = ((sVar2.f17618d.f().floatValue() * length) / f14) + floatValue3;
                    float floatValue5 = ((sVar2.f17619e.f().floatValue() * length) / f14) + floatValue3;
                    int size3 = arrayList3.size() - 1;
                    float f16 = f13;
                    while (size3 >= 0) {
                        Path path2 = aVar.c;
                        path2.set(((m) arrayList3.get(size3)).getPath());
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z11);
                        float length2 = pathMeasure.getLength();
                        if (floatValue5 > length) {
                            float f17 = floatValue5 - length;
                            if (f17 < f16 + length2 && f16 < f17) {
                                if (floatValue4 > length) {
                                    f12 = (floatValue4 - length) / length2;
                                } else {
                                    f12 = 0.0f;
                                }
                                p3.g.a(path2, f12, Math.min(f17 / length2, f15), 0.0f);
                                canvas.drawPath(path2, aVar2);
                                f13 = 0.0f;
                                f16 += length2;
                                size3--;
                                z11 = false;
                                aVar = this;
                                f15 = 1.0f;
                            }
                        }
                        float f18 = f16 + length2;
                        if (f18 >= floatValue4 && f16 <= floatValue5) {
                            if (f18 <= floatValue5 && floatValue4 < f16) {
                                canvas.drawPath(path2, aVar2);
                            } else {
                                if (floatValue4 < f16) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = (floatValue4 - f16) / length2;
                                }
                                if (floatValue5 > f18) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = (floatValue5 - f16) / length2;
                                }
                                f13 = 0.0f;
                                p3.g.a(path2, f10, f11, 0.0f);
                                canvas.drawPath(path2, aVar2);
                                f16 += length2;
                                size3--;
                                z11 = false;
                                aVar = this;
                                f15 = 1.0f;
                            }
                        }
                        f13 = 0.0f;
                        f16 += length2;
                        size3--;
                        z11 = false;
                        aVar = this;
                        f15 = 1.0f;
                    }
                    androidx.activity.s.y();
                } else {
                    path.reset();
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((m) arrayList3.get(size4)).getPath(), matrix);
                    }
                    androidx.activity.s.y();
                    canvas.drawPath(path, aVar2);
                    androidx.activity.s.y();
                }
                i11++;
                z11 = false;
                f14 = 100.0f;
                aVar = this;
                f15 = 1.0f;
            } else {
                androidx.activity.s.y();
                return;
            }
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }
}
