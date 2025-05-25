package h3;

import android.graphics.Matrix;
import android.graphics.PointF;
import h3.a;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f17988a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f17989b;
    public final Matrix c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f17990d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f17991e;

    /* renamed from: f  reason: collision with root package name */
    public a<PointF, PointF> f17992f;

    /* renamed from: g  reason: collision with root package name */
    public a<?, PointF> f17993g;

    /* renamed from: h  reason: collision with root package name */
    public a<q3.c, q3.c> f17994h;

    /* renamed from: i  reason: collision with root package name */
    public a<Float, Float> f17995i;

    /* renamed from: j  reason: collision with root package name */
    public a<Integer, Integer> f17996j;

    /* renamed from: k  reason: collision with root package name */
    public c f17997k;

    /* renamed from: l  reason: collision with root package name */
    public c f17998l;

    /* renamed from: m  reason: collision with root package name */
    public a<?, Float> f17999m;

    /* renamed from: n  reason: collision with root package name */
    public a<?, Float> f18000n;

    public o(k3.k kVar) {
        a<PointF, PointF> a10;
        a<PointF, PointF> a11;
        a<q3.c, q3.c> a12;
        a<Float, Float> a13;
        c cVar;
        c cVar2;
        k3.e eVar = kVar.f19563a;
        if (eVar == null) {
            a10 = null;
        } else {
            a10 = eVar.a();
        }
        this.f17992f = a10;
        k3.l<PointF, PointF> lVar = kVar.f19564b;
        if (lVar == null) {
            a11 = null;
        } else {
            a11 = lVar.a();
        }
        this.f17993g = a11;
        k3.g gVar = kVar.c;
        if (gVar == null) {
            a12 = null;
        } else {
            a12 = gVar.a();
        }
        this.f17994h = a12;
        k3.b bVar = kVar.f19565d;
        if (bVar == null) {
            a13 = null;
        } else {
            a13 = bVar.a();
        }
        this.f17995i = a13;
        k3.b bVar2 = kVar.f19567f;
        if (bVar2 == null) {
            cVar = null;
        } else {
            cVar = (c) bVar2.a();
        }
        this.f17997k = cVar;
        if (cVar != null) {
            this.f17989b = new Matrix();
            this.c = new Matrix();
            this.f17990d = new Matrix();
            this.f17991e = new float[9];
        } else {
            this.f17989b = null;
            this.c = null;
            this.f17990d = null;
            this.f17991e = null;
        }
        k3.b bVar3 = kVar.f19568g;
        if (bVar3 == null) {
            cVar2 = null;
        } else {
            cVar2 = (c) bVar3.a();
        }
        this.f17998l = cVar2;
        k3.d dVar = kVar.f19566e;
        if (dVar != null) {
            this.f17996j = dVar.a();
        }
        k3.b bVar4 = kVar.f19569h;
        if (bVar4 != null) {
            this.f17999m = bVar4.a();
        } else {
            this.f17999m = null;
        }
        k3.b bVar5 = kVar.f19570i;
        if (bVar5 != null) {
            this.f18000n = bVar5.a();
        } else {
            this.f18000n = null;
        }
    }

    public final void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.e(this.f17996j);
        aVar.e(this.f17999m);
        aVar.e(this.f18000n);
        aVar.e(this.f17992f);
        aVar.e(this.f17993g);
        aVar.e(this.f17994h);
        aVar.e(this.f17995i);
        aVar.e(this.f17997k);
        aVar.e(this.f17998l);
    }

    public final void b(a.InterfaceC0242a interfaceC0242a) {
        a<Integer, Integer> aVar = this.f17996j;
        if (aVar != null) {
            aVar.a(interfaceC0242a);
        }
        a<?, Float> aVar2 = this.f17999m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0242a);
        }
        a<?, Float> aVar3 = this.f18000n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0242a);
        }
        a<PointF, PointF> aVar4 = this.f17992f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0242a);
        }
        a<?, PointF> aVar5 = this.f17993g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0242a);
        }
        a<q3.c, q3.c> aVar6 = this.f17994h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0242a);
        }
        a<Float, Float> aVar7 = this.f17995i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0242a);
        }
        c cVar = this.f17997k;
        if (cVar != null) {
            cVar.a(interfaceC0242a);
        }
        c cVar2 = this.f17998l;
        if (cVar2 != null) {
            cVar2.a(interfaceC0242a);
        }
    }

    public final boolean c(n3.a aVar, Object obj) {
        c cVar;
        c cVar2;
        a<?, Float> aVar2;
        a<?, Float> aVar3;
        if (obj == e3.o.f16417e) {
            a<PointF, PointF> aVar4 = this.f17992f;
            if (aVar4 == null) {
                this.f17992f = new p(aVar, new PointF());
                return true;
            }
            aVar4.j(aVar);
            return true;
        } else if (obj == e3.o.f16418f) {
            a<?, PointF> aVar5 = this.f17993g;
            if (aVar5 == null) {
                this.f17993g = new p(aVar, new PointF());
                return true;
            }
            aVar5.j(aVar);
            return true;
        } else if (obj == e3.o.f16423k) {
            a<q3.c, q3.c> aVar6 = this.f17994h;
            if (aVar6 == null) {
                this.f17994h = new p(aVar, new q3.c());
                return true;
            }
            aVar6.j(aVar);
            return true;
        } else if (obj == e3.o.f16424l) {
            a<Float, Float> aVar7 = this.f17995i;
            if (aVar7 == null) {
                this.f17995i = new p(aVar, Float.valueOf(0.0f));
                return true;
            }
            aVar7.j(aVar);
            return true;
        } else if (obj == e3.o.c) {
            a<Integer, Integer> aVar8 = this.f17996j;
            if (aVar8 == null) {
                this.f17996j = new p(aVar, 100);
                return true;
            }
            aVar8.j(aVar);
            return true;
        } else if (obj == e3.o.f16437y && (aVar3 = this.f17999m) != null) {
            if (aVar3 == null) {
                this.f17999m = new p(aVar, 100);
                return true;
            }
            aVar3.j(aVar);
            return true;
        } else if (obj == e3.o.f16438z && (aVar2 = this.f18000n) != null) {
            if (aVar2 == null) {
                this.f18000n = new p(aVar, 100);
                return true;
            }
            aVar2.j(aVar);
            return true;
        } else if (obj == e3.o.f16425m && (cVar2 = this.f17997k) != null) {
            if (cVar2 == null) {
                this.f17997k = new c(Collections.singletonList(new q3.a(Float.valueOf(0.0f))));
            }
            this.f17997k.j(aVar);
            return true;
        } else if (obj == e3.o.f16426n && (cVar = this.f17998l) != null) {
            if (cVar == null) {
                this.f17998l = new c(Collections.singletonList(new q3.a(Float.valueOf(0.0f))));
            }
            this.f17998l.j(aVar);
            return true;
        } else {
            return false;
        }
    }

    public final Matrix d() {
        c cVar;
        float cos;
        c cVar2;
        float sin;
        float[] fArr;
        float k10;
        Matrix matrix = this.f17988a;
        matrix.reset();
        a<?, PointF> aVar = this.f17993g;
        if (aVar != null) {
            PointF f10 = aVar.f();
            float f11 = f10.x;
            if (f11 != 0.0f || f10.y != 0.0f) {
                matrix.preTranslate(f11, f10.y);
            }
        }
        a<Float, Float> aVar2 = this.f17995i;
        if (aVar2 != null) {
            if (aVar2 instanceof p) {
                k10 = aVar2.f().floatValue();
            } else {
                k10 = ((c) aVar2).k();
            }
            if (k10 != 0.0f) {
                matrix.preRotate(k10);
            }
        }
        if (this.f17997k != null) {
            if (this.f17998l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-cVar.k()) + 90.0f));
            }
            if (this.f17998l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-cVar2.k()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(this.f17997k.k()));
            int i10 = 0;
            while (true) {
                fArr = this.f17991e;
                if (i10 >= 9) {
                    break;
                }
                fArr[i10] = 0.0f;
                i10++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f12 = -sin;
            fArr[3] = f12;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f17989b;
            matrix2.setValues(fArr);
            for (int i11 = 0; i11 < 9; i11++) {
                fArr[i11] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            for (int i12 = 0; i12 < 9; i12++) {
                fArr[i12] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f12;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f17990d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<q3.c, q3.c> aVar3 = this.f17994h;
        if (aVar3 != null) {
            q3.c f13 = aVar3.f();
            float f14 = f13.f29079a;
            if (f14 != 1.0f || f13.f29080b != 1.0f) {
                matrix.preScale(f14, f13.f29080b);
            }
        }
        a<PointF, PointF> aVar4 = this.f17992f;
        if (aVar4 != null) {
            PointF f15 = aVar4.f();
            float f16 = f15.x;
            if (f16 != 0.0f || f15.y != 0.0f) {
                matrix.preTranslate(-f16, -f15.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f10) {
        PointF f11;
        q3.c f12;
        float f13;
        a<?, PointF> aVar = this.f17993g;
        PointF pointF = null;
        if (aVar == null) {
            f11 = null;
        } else {
            f11 = aVar.f();
        }
        a<q3.c, q3.c> aVar2 = this.f17994h;
        if (aVar2 == null) {
            f12 = null;
        } else {
            f12 = aVar2.f();
        }
        Matrix matrix = this.f17988a;
        matrix.reset();
        if (f11 != null) {
            matrix.preTranslate(f11.x * f10, f11.y * f10);
        }
        if (f12 != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(f12.f29079a, d10), (float) Math.pow(f12.f29080b, d10));
        }
        a<Float, Float> aVar3 = this.f17995i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f17992f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            float f14 = floatValue * f10;
            float f15 = 0.0f;
            if (pointF == null) {
                f13 = 0.0f;
            } else {
                f13 = pointF.x;
            }
            if (pointF != null) {
                f15 = pointF.y;
            }
            matrix.preRotate(f14, f13, f15);
        }
        return matrix;
    }
}
