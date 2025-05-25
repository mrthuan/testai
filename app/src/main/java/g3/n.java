package g3;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import h3.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public final class n implements m, a.InterfaceC0242a, k {

    /* renamed from: b  reason: collision with root package name */
    public final String f17575b;
    public final e3.k c;

    /* renamed from: d  reason: collision with root package name */
    public final PolystarShape.Type f17576d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17577e;

    /* renamed from: f  reason: collision with root package name */
    public final h3.c f17578f;

    /* renamed from: g  reason: collision with root package name */
    public final h3.a<?, PointF> f17579g;

    /* renamed from: h  reason: collision with root package name */
    public final h3.c f17580h;

    /* renamed from: i  reason: collision with root package name */
    public final h3.c f17581i;

    /* renamed from: j  reason: collision with root package name */
    public final h3.c f17582j;

    /* renamed from: k  reason: collision with root package name */
    public final h3.c f17583k;

    /* renamed from: l  reason: collision with root package name */
    public final h3.c f17584l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17586n;

    /* renamed from: a  reason: collision with root package name */
    public final Path f17574a = new Path();

    /* renamed from: m  reason: collision with root package name */
    public final b f17585m = new b(0);

    /* compiled from: PolystarContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17587a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f17587a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17587a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(e3.k kVar, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.c = kVar;
        this.f17575b = polystarShape.f6061a;
        PolystarShape.Type type = polystarShape.f6062b;
        this.f17576d = type;
        this.f17577e = polystarShape.f6069j;
        h3.a<?, ?> a10 = polystarShape.c.a();
        this.f17578f = (h3.c) a10;
        h3.a<PointF, PointF> a11 = polystarShape.f6063d.a();
        this.f17579g = a11;
        h3.a<?, ?> a12 = polystarShape.f6064e.a();
        this.f17580h = (h3.c) a12;
        h3.a<?, ?> a13 = polystarShape.f6066g.a();
        this.f17582j = (h3.c) a13;
        h3.a<?, ?> a14 = polystarShape.f6068i.a();
        this.f17584l = (h3.c) a14;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f17581i = (h3.c) polystarShape.f6065f.a();
            this.f17583k = (h3.c) polystarShape.f6067h.a();
        } else {
            this.f17581i = null;
            this.f17583k = null;
        }
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        aVar.e(a13);
        aVar.e(a14);
        if (type == type2) {
            aVar.e(this.f17581i);
            aVar.e(this.f17583k);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (type == type2) {
            this.f17581i.a(this);
            this.f17583k.a(this);
        }
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f17586n = false;
        this.c.invalidateSelf();
    }

    @Override // g3.c
    public final void b(List<c> list, List<c> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f17585m.f17514a).add(sVar);
                        sVar.c(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // j3.e
    public final void c(n3.a aVar, Object obj) {
        h3.c cVar;
        h3.c cVar2;
        if (obj == e3.o.f16431s) {
            this.f17578f.j(aVar);
        } else if (obj == e3.o.f16432t) {
            this.f17580h.j(aVar);
        } else if (obj == e3.o.f16422j) {
            this.f17579g.j(aVar);
        } else if (obj == e3.o.f16433u && (cVar2 = this.f17581i) != null) {
            cVar2.j(aVar);
        } else if (obj == e3.o.f16434v) {
            this.f17582j.j(aVar);
        } else if (obj == e3.o.f16435w && (cVar = this.f17583k) != null) {
            cVar.j(aVar);
        } else if (obj == e3.o.f16436x) {
            this.f17584l.j(aVar);
        }
    }

    @Override // j3.e
    public final void g(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        p3.f.d(dVar, i10, arrayList, dVar2, this);
    }

    @Override // g3.c
    public final String getName() {
        return this.f17575b;
    }

    @Override // g3.m
    public final Path getPath() {
        double floatValue;
        float f10;
        float f11;
        float f12;
        float cos;
        float f13;
        double d10;
        float f14;
        n nVar;
        Path path;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Path path2;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        double floatValue2;
        int i10;
        h3.a<?, PointF> aVar;
        double d11;
        double d12;
        float f28;
        double d13;
        boolean z10 = this.f17586n;
        Path path3 = this.f17574a;
        if (z10) {
            return path3;
        }
        path3.reset();
        if (this.f17577e) {
            this.f17586n = true;
            return path3;
        }
        int i11 = a.f17587a[this.f17576d.ordinal()];
        h3.a<?, PointF> aVar2 = this.f17579g;
        h3.c cVar = this.f17584l;
        h3.c cVar2 = this.f17582j;
        h3.c cVar3 = this.f17580h;
        h3.c cVar4 = this.f17578f;
        if (i11 != 1) {
            if (i11 == 2) {
                int floor = (int) Math.floor(cVar4.f().floatValue());
                if (cVar3 == null) {
                    floatValue2 = 0.0d;
                } else {
                    floatValue2 = cVar3.f().floatValue();
                }
                double radians = Math.toRadians(floatValue2 - 90.0d);
                double d14 = floor;
                float floatValue3 = cVar.f().floatValue() / 100.0f;
                float floatValue4 = cVar2.f().floatValue();
                double d15 = floatValue4;
                float cos2 = (float) (Math.cos(radians) * d15);
                float sin = (float) (Math.sin(radians) * d15);
                path3.moveTo(cos2, sin);
                double d16 = (float) (6.283185307179586d / d14);
                double d17 = radians + d16;
                double ceil = Math.ceil(d14);
                int i12 = 0;
                double d18 = d16;
                while (i12 < ceil) {
                    float cos3 = (float) (Math.cos(d17) * d15);
                    float sin2 = (float) (Math.sin(d17) * d15);
                    if (floatValue3 != 0.0f) {
                        double d19 = d15;
                        i10 = i12;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        aVar = aVar2;
                        d11 = d17;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f29 = floatValue4 * floatValue3 * 0.25f;
                        d12 = d18;
                        f28 = sin2;
                        d13 = d19;
                        path3.cubicTo(cos2 - (cos4 * f29), sin - (((float) Math.sin(atan2)) * f29), (((float) Math.cos(atan22)) * f29) + cos3, (f29 * ((float) Math.sin(atan22))) + sin2, cos3, f28);
                    } else {
                        i10 = i12;
                        aVar = aVar2;
                        d11 = d17;
                        d12 = d18;
                        f28 = sin2;
                        d13 = d15;
                        path3.lineTo(cos3, f28);
                    }
                    double d20 = d11 + d12;
                    sin = f28;
                    d15 = d13;
                    d18 = d12;
                    aVar2 = aVar;
                    d17 = d20;
                    cos2 = cos3;
                    i12 = i10 + 1;
                }
                PointF f30 = aVar2.f();
                path3.offset(f30.x, f30.y);
                path3.close();
            }
            nVar = this;
            path = path3;
        } else {
            h3.a<?, PointF> aVar3 = aVar2;
            float floatValue5 = cVar4.f().floatValue();
            if (cVar3 == null) {
                floatValue = 0.0d;
            } else {
                floatValue = cVar3.f().floatValue();
            }
            double radians2 = Math.toRadians(floatValue - 90.0d);
            double d21 = floatValue5;
            float f31 = (float) (6.283185307179586d / d21);
            float f32 = f31 / 2.0f;
            float f33 = floatValue5 - ((int) floatValue5);
            int i13 = (f33 > 0.0f ? 1 : (f33 == 0.0f ? 0 : -1));
            if (i13 != 0) {
                radians2 += (1.0f - f33) * f32;
            }
            float floatValue6 = cVar2.f().floatValue();
            float floatValue7 = this.f17581i.f().floatValue();
            h3.c cVar5 = this.f17583k;
            if (cVar5 != null) {
                f10 = cVar5.f().floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            if (cVar != null) {
                f11 = cVar.f().floatValue() / 100.0f;
            } else {
                f11 = 0.0f;
            }
            if (i13 != 0) {
                float l10 = androidx.activity.r.l(floatValue6, floatValue7, f33, floatValue7);
                double d22 = l10;
                f12 = floatValue7;
                cos = (float) (Math.cos(radians2) * d22);
                float sin3 = (float) (d22 * Math.sin(radians2));
                path3.moveTo(cos, sin3);
                f13 = sin3;
                d10 = radians2 + ((f31 * f33) / 2.0f);
                f14 = l10;
            } else {
                f12 = floatValue7;
                double d23 = floatValue6;
                cos = (float) (Math.cos(radians2) * d23);
                float sin4 = (float) (d23 * Math.sin(radians2));
                path3.moveTo(cos, sin4);
                f13 = sin4;
                d10 = radians2 + f32;
                f14 = 0.0f;
            }
            double ceil2 = Math.ceil(d21) * 2.0d;
            int i14 = 0;
            double d24 = 2.0d;
            double d25 = d10;
            boolean z11 = false;
            while (true) {
                double d26 = i14;
                if (d26 >= ceil2) {
                    break;
                }
                if (z11) {
                    f15 = floatValue6;
                } else {
                    f15 = f12;
                }
                int i15 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
                if (i15 != 0 && d26 == ceil2 - d24) {
                    f16 = f14;
                    f17 = (f31 * f33) / 2.0f;
                } else {
                    f16 = f14;
                    f17 = f32;
                }
                if (i15 != 0 && d26 == ceil2 - 1.0d) {
                    f18 = f31;
                    f19 = f32;
                    f15 = f16;
                } else {
                    f18 = f31;
                    f19 = f32;
                }
                double d27 = f15;
                h3.a<?, PointF> aVar4 = aVar3;
                float cos5 = (float) (Math.cos(d25) * d27);
                float sin5 = (float) (d27 * Math.sin(d25));
                if (f10 == 0.0f && f11 == 0.0f) {
                    path3.lineTo(cos5, sin5);
                    path2 = path3;
                    f27 = f17;
                    f20 = sin5;
                    f25 = f12;
                    f26 = floatValue6;
                } else {
                    float f34 = floatValue6;
                    float f35 = f13;
                    double atan23 = (float) (Math.atan2(f13, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    float f36 = f17;
                    f20 = sin5;
                    path2 = path3;
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z11) {
                        f21 = f10;
                    } else {
                        f21 = f11;
                    }
                    if (z11) {
                        f22 = f11;
                    } else {
                        f22 = f10;
                    }
                    if (z11) {
                        f23 = f12;
                    } else {
                        f23 = f34;
                    }
                    if (z11) {
                        f24 = f34;
                    } else {
                        f24 = f12;
                    }
                    float f37 = f23 * f21 * 0.47829f;
                    float f38 = cos6 * f37;
                    float f39 = f37 * sin6;
                    float f40 = f24 * f22 * 0.47829f;
                    float f41 = cos7 * f40;
                    float f42 = f40 * sin7;
                    if (i13 != 0) {
                        if (i14 == 0) {
                            f38 *= f33;
                            f39 *= f33;
                        } else if (d26 == ceil2 - 1.0d) {
                            f41 *= f33;
                            f42 *= f33;
                        }
                    }
                    f25 = f12;
                    f26 = f34;
                    path2.cubicTo(cos - f38, f35 - f39, cos5 + f41, f20 + f42, cos5, f20);
                    f27 = f36;
                }
                d25 += f27;
                z11 = !z11;
                i14++;
                d24 = 2.0d;
                cos = cos5;
                f12 = f25;
                floatValue6 = f26;
                f14 = f16;
                f31 = f18;
                f32 = f19;
                aVar3 = aVar4;
                f13 = f20;
                path3 = path2;
            }
            nVar = this;
            PointF f43 = aVar3.f();
            path = path3;
            path.offset(f43.x, f43.y);
            path.close();
        }
        path.close();
        nVar.f17585m.b(path);
        nVar.f17586n = true;
        return path;
    }
}
