package g3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.model.content.GradientType;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f17558o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f17559p;

    /* renamed from: q  reason: collision with root package name */
    public final y.f<LinearGradient> f17560q;

    /* renamed from: r  reason: collision with root package name */
    public final y.f<RadialGradient> f17561r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f17562s;

    /* renamed from: t  reason: collision with root package name */
    public final GradientType f17563t;

    /* renamed from: u  reason: collision with root package name */
    public final int f17564u;

    /* renamed from: v  reason: collision with root package name */
    public final h3.d f17565v;

    /* renamed from: w  reason: collision with root package name */
    public final h3.j f17566w;

    /* renamed from: x  reason: collision with root package name */
    public final h3.j f17567x;

    /* renamed from: y  reason: collision with root package name */
    public h3.p f17568y;

    public i(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.a aVar2) {
        super(kVar, aVar, aVar2.f6095h.toPaintCap(), aVar2.f6096i.toPaintJoin(), aVar2.f6097j, aVar2.f6091d, aVar2.f6094g, aVar2.f6098k, aVar2.f6099l);
        this.f17560q = new y.f<>();
        this.f17561r = new y.f<>();
        this.f17562s = new RectF();
        this.f17558o = aVar2.f6089a;
        this.f17563t = aVar2.f6090b;
        this.f17559p = aVar2.f6100m;
        this.f17564u = (int) (kVar.f16369b.b() / 32.0f);
        h3.a<l3.c, l3.c> a10 = aVar2.c.a();
        this.f17565v = (h3.d) a10;
        a10.a(this);
        aVar.e(a10);
        h3.a<PointF, PointF> a11 = aVar2.f6092e.a();
        this.f17566w = (h3.j) a11;
        a11.a(this);
        aVar.e(a11);
        h3.a<PointF, PointF> a12 = aVar2.f6093f.a();
        this.f17567x = (h3.j) a12;
        a12.a(this);
        aVar.e(a12);
    }

    @Override // g3.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        if (obj == e3.o.D) {
            h3.p pVar = this.f17568y;
            com.airbnb.lottie.model.layer.a aVar2 = this.f17502f;
            if (pVar != null) {
                aVar2.m(pVar);
            }
            if (aVar == null) {
                this.f17568y = null;
                return;
            }
            h3.p pVar2 = new h3.p(aVar, null);
            this.f17568y = pVar2;
            pVar2.a(this);
            aVar2.e(this.f17568y);
        }
    }

    public final int[] e(int[] iArr) {
        h3.p pVar = this.f17568y;
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
    @Override // g3.a, g3.e
    public final void f(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        float f10;
        float f11;
        if (this.f17559p) {
            return;
        }
        d(this.f17562s, matrix, false);
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = this.f17563t;
        h3.d dVar = this.f17565v;
        h3.j jVar = this.f17567x;
        h3.j jVar2 = this.f17566w;
        if (gradientType2 == gradientType) {
            long h10 = h();
            y.f<LinearGradient> fVar = this.f17560q;
            shader = (LinearGradient) fVar.f(h10, null);
            if (shader == null) {
                PointF f12 = jVar2.f();
                PointF f13 = jVar.f();
                l3.c f14 = dVar.f();
                shader = new LinearGradient(f12.x, f12.y, f13.x, f13.y, e(f14.f20451b), f14.f20450a, Shader.TileMode.CLAMP);
                fVar.h(h10, shader);
            }
        } else {
            long h11 = h();
            y.f<RadialGradient> fVar2 = this.f17561r;
            shader = (RadialGradient) fVar2.f(h11, null);
            if (shader == null) {
                PointF f15 = jVar2.f();
                PointF f16 = jVar.f();
                l3.c f17 = dVar.f();
                int[] e10 = e(f17.f20451b);
                float[] fArr = f17.f20450a;
                shader = new RadialGradient(f15.x, f15.y, (float) Math.hypot(f16.x - f10, f16.y - f11), e10, fArr, Shader.TileMode.CLAMP);
                fVar2.h(h11, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.f17505i.setShader(shader);
        super.f(canvas, matrix, i10);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17558o;
    }

    public final int h() {
        int i10;
        float f10 = this.f17566w.f17962d;
        float f11 = this.f17564u;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f17567x.f17962d * f11);
        int round3 = Math.round(this.f17565v.f17962d * f11);
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
