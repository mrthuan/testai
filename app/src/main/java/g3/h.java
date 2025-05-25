package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.model.content.GradientType;
import h3.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public final class h implements e, a.InterfaceC0242a, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f17541a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17542b;
    public final com.airbnb.lottie.model.layer.a c;

    /* renamed from: d  reason: collision with root package name */
    public final y.f<LinearGradient> f17543d = new y.f<>();

    /* renamed from: e  reason: collision with root package name */
    public final y.f<RadialGradient> f17544e = new y.f<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f17545f;

    /* renamed from: g  reason: collision with root package name */
    public final f3.a f17546g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f17547h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f17548i;

    /* renamed from: j  reason: collision with root package name */
    public final GradientType f17549j;

    /* renamed from: k  reason: collision with root package name */
    public final h3.d f17550k;

    /* renamed from: l  reason: collision with root package name */
    public final h3.e f17551l;

    /* renamed from: m  reason: collision with root package name */
    public final h3.j f17552m;

    /* renamed from: n  reason: collision with root package name */
    public final h3.j f17553n;

    /* renamed from: o  reason: collision with root package name */
    public h3.p f17554o;

    /* renamed from: p  reason: collision with root package name */
    public h3.p f17555p;

    /* renamed from: q  reason: collision with root package name */
    public final e3.k f17556q;

    /* renamed from: r  reason: collision with root package name */
    public final int f17557r;

    public h(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, l3.d dVar) {
        Path path = new Path();
        this.f17545f = path;
        this.f17546g = new f3.a(1);
        this.f17547h = new RectF();
        this.f17548i = new ArrayList();
        this.c = aVar;
        this.f17541a = dVar.f20457g;
        this.f17542b = dVar.f20458h;
        this.f17556q = kVar;
        this.f17549j = dVar.f20452a;
        path.setFillType(dVar.f20453b);
        this.f17557r = (int) (kVar.f16369b.b() / 32.0f);
        h3.a<l3.c, l3.c> a10 = dVar.c.a();
        this.f17550k = (h3.d) a10;
        a10.a(this);
        aVar.e(a10);
        h3.a<Integer, Integer> a11 = dVar.f20454d.a();
        this.f17551l = (h3.e) a11;
        a11.a(this);
        aVar.e(a11);
        h3.a<PointF, PointF> a12 = dVar.f20455e.a();
        this.f17552m = (h3.j) a12;
        a12.a(this);
        aVar.e(a12);
        h3.a<PointF, PointF> a13 = dVar.f20456f.a();
        this.f17553n = (h3.j) a13;
        a13.a(this);
        aVar.e(a13);
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17556q.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f17548i.add((m) cVar);
            }
        }
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        if (obj == e3.o.f16416d) {
            this.f17551l.j(aVar);
            return;
        }
        ColorFilter colorFilter = e3.o.C;
        com.airbnb.lottie.model.layer.a aVar2 = this.c;
        if (obj == colorFilter) {
            h3.p pVar = this.f17554o;
            if (pVar != null) {
                aVar2.m(pVar);
            }
            if (aVar == null) {
                this.f17554o = null;
                return;
            }
            h3.p pVar2 = new h3.p(aVar, null);
            this.f17554o = pVar2;
            pVar2.a(this);
            aVar2.e(this.f17554o);
        } else if (obj == e3.o.D) {
            h3.p pVar3 = this.f17555p;
            if (pVar3 != null) {
                aVar2.m(pVar3);
            }
            if (aVar == null) {
                this.f17555p = null;
                return;
            }
            this.f17543d.c();
            this.f17544e.c();
            h3.p pVar4 = new h3.p(aVar, null);
            this.f17555p = pVar4;
            pVar4.a(this);
            aVar2.e(this.f17555p);
        }
    }

    @Override // g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f17545f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17548i;
            if (i10 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i10)).getPath(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] e(int[] iArr) {
        h3.p pVar = this.f17555p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f17542b) {
            return;
        }
        Path path = this.f17545f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17548i;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        path.computeBounds(this.f17547h, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f17549j;
        h3.d dVar = this.f17550k;
        h3.j jVar = this.f17553n;
        h3.j jVar2 = this.f17552m;
        if (gradientType2 == gradientType) {
            long h10 = h();
            y.f<LinearGradient> fVar = this.f17543d;
            shader = (LinearGradient) fVar.f(h10, null);
            if (shader == null) {
                PointF f10 = jVar2.f();
                PointF f11 = jVar.f();
                l3.c f12 = dVar.f();
                shader = new LinearGradient(f10.x, f10.y, f11.x, f11.y, e(f12.f20451b), f12.f20450a, Shader.TileMode.CLAMP);
                fVar.h(h10, shader);
            }
        } else {
            long h11 = h();
            y.f<RadialGradient> fVar2 = this.f17544e;
            shader = (RadialGradient) fVar2.f(h11, null);
            if (shader == null) {
                PointF f13 = jVar2.f();
                PointF f14 = jVar.f();
                l3.c f15 = dVar.f();
                int[] e10 = e(f15.f20451b);
                float[] fArr = f15.f20450a;
                float f16 = f13.x;
                float f17 = f13.y;
                float hypot = (float) Math.hypot(f14.x - f16, f14.y - f17);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f16, f17, hypot, e10, fArr, Shader.TileMode.CLAMP);
                fVar2.h(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        f3.a aVar = this.f17546g;
        aVar.setShader(shader);
        h3.p pVar = this.f17554o;
        if (pVar != null) {
            aVar.setColorFilter((ColorFilter) pVar.f());
        }
        PointF pointF = p3.f.f23678a;
        aVar.setAlpha(Math.max(0, Math.min((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) androidx.activity.r.b(i10 / 255.0f, this.f17551l.f().intValue(), 100.0f, 255.0f))));
        canvas.drawPath(path, aVar);
        androidx.activity.s.y();
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17541a;
    }

    public final int h() {
        int i10;
        float f10 = this.f17552m.f17962d;
        float f11 = this.f17557r;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f17553n.f17962d * f11);
        int round3 = Math.round(this.f17550k.f17962d * f11);
        if (round != 0) {
            i10 = round * 527;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
