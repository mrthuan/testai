package mi;

import android.graphics.Rect;
import android.graphics.RectF;
import ei.c;
import ei.d;
import ii.e;
import ii.f;
import java.util.Date;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.ss.util.format.NumericFormatter;

/* compiled from: ModelUtil.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22038b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final RectF f22039a = new RectF();

    public static Rect a(c cVar, int i10, int i11) {
        if (cVar.g(i10) != null && cVar.g(i10).e(i11, true) != null) {
            ei.a e10 = cVar.g(i10).e(i11, true);
            if (e10.g() >= 0) {
                ci.a f10 = cVar.f(e10.g());
                Rect rect = new Rect();
                rect.left = Math.round(g(cVar, f10.f5691b, 0));
                rect.top = Math.round(i(cVar, f10.f5690a, 0));
                rect.right = Math.round(g(cVar, f10.f5692d + 1, 0));
                rect.bottom = Math.round(i(cVar, f10.c + 1, 0));
                return rect;
            }
        }
        Rect rect2 = new Rect();
        rect2.left = Math.round(g(cVar, i11, 0));
        rect2.top = Math.round(i(cVar, i10, 0));
        rect2.right = Math.round(g(cVar, i11 + 1, 0));
        rect2.bottom = Math.round(i(cVar, i10 + 1, 0));
        return rect2;
    }

    public static Rectangle d(c cVar, fi.b bVar) {
        Rectangle rectangle = new Rectangle();
        if (bVar == null) {
            return null;
        }
        fi.a aVar = bVar.f17292b;
        rectangle.f20688x = Math.round(g(cVar, aVar.f17289b, aVar.c));
        fi.a aVar2 = bVar.f17292b;
        rectangle.f20689y = Math.round(i(cVar, aVar2.f17288a, aVar2.f17290d));
        short s4 = bVar.f17291a;
        if (s4 == 1) {
            fi.a aVar3 = bVar.c;
            rectangle.width = Math.round(g(cVar, aVar3.f17289b, aVar3.c) - rectangle.f20688x);
            fi.a aVar4 = bVar.c;
            rectangle.height = Math.round(i(cVar, aVar4.f17288a, aVar4.f17290d) - rectangle.f20689y);
        } else if (s4 == 0) {
            rectangle.width = bVar.f17293d;
            rectangle.height = bVar.f17294e;
        }
        return rectangle;
    }

    public static String f(d dVar, ei.a aVar) {
        boolean z10;
        short s4;
        String c;
        Object obj;
        byte b10;
        Object obj2;
        boolean z11 = false;
        if (aVar.f16592f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        e b11 = aVar.b();
        short s10 = aVar.f16589b;
        if (s10 != 0) {
            if (s10 != 1) {
                if (s10 != 4) {
                    if (s10 == 5) {
                        if (s10 == 5 && (obj2 = aVar.f16592f) != null) {
                            b10 = ((Byte) obj2).byteValue();
                        } else {
                            b10 = -1;
                        }
                        return ErrorEval.getText(b10);
                    }
                } else {
                    if (s10 == 4 && (obj = aVar.f16592f) != null) {
                        z11 = ((Boolean) obj).booleanValue();
                    }
                    return String.valueOf(z11).toUpperCase();
                }
            } else if (aVar.i() >= 0) {
                return dVar.n(aVar.i());
            }
            return "";
        }
        if (b11.f18502a == null) {
            b11.f18502a = new f();
        }
        String str = b11.f18502a.f18507b;
        if (str == null) {
            str = "General";
            s4 = 6;
        } else if (aVar.a() > 0) {
            s4 = aVar.a();
        } else {
            NumericFormatter.f20969b.getClass();
            short f10 = NumericFormatter.f(str);
            if (aVar.f16589b == 0) {
                aVar.f16593g.f((short) 0, Short.valueOf(f10));
            }
            s4 = f10;
        }
        try {
            if (s4 == 10) {
                NumericFormatter numericFormatter = NumericFormatter.f20969b;
                Date c10 = aVar.c(dVar.f16625b);
                numericFormatter.getClass();
                String d10 = NumericFormatter.d(str, c10);
                aVar.f16589b = (short) 1;
                aVar.f16592f = Integer.valueOf(dVar.e(d10));
                c = d10;
            } else {
                c = NumericFormatter.f20969b.c(str, aVar.f(), s4);
            }
            return c;
        } catch (Exception unused) {
            return String.valueOf(aVar.f());
        }
    }

    public static float g(c cVar, int i10, int i11) {
        float f10 = 0.0f;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!cVar.l(i12)) {
                f10 = cVar.d(i12) + f10;
            }
        }
        return i11 + f10;
    }

    public static float h(oi.f fVar, int i10, float f10) {
        int i11;
        float f11 = fVar.c.f23072b;
        c cVar = fVar.f23076b;
        ki.e eVar = fVar.f23086m;
        int i12 = eVar.f19780b;
        if (i12 <= 0) {
            i12 = 0;
        }
        if (i12 < i10 && !eVar.f19783f) {
            i12++;
            f11 = (float) ((eVar.f19785h * fVar.f23079f) + f11);
        }
        if (cVar.f16601a.f16633k) {
            i11 = 256;
        } else {
            i11 = 16384;
        }
        while (i12 < i10 && i12 <= i11) {
            if (!cVar.l(i12)) {
                f11 = (cVar.d(i12) * fVar.f23079f) + f11;
            }
            i12++;
        }
        return f10 + f11;
    }

    public static float i(c cVar, int i10, int i11) {
        float f10;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i10; i12++) {
            ei.b g10 = cVar.g(i12);
            if (g10 == null || !g10.d()) {
                if (g10 == null) {
                    f10 = cVar.f16618s;
                } else {
                    f10 = g10.f16598f;
                }
                f11 += f10;
            }
        }
        return f11 + i11;
    }

    public static float j(oi.f fVar, int i10, float f10) {
        int i11;
        float f11;
        float f12 = fVar.f23079f;
        float f13 = 30.0f * f12;
        c cVar = fVar.f23076b;
        ki.e eVar = fVar.f23086m;
        int i12 = eVar.f19779a;
        if (i12 <= 0) {
            i12 = 0;
        }
        if (i12 < i10 && !eVar.f19782e) {
            i12++;
            f13 = (float) ((eVar.f19784g * f12) + f13);
        }
        if (cVar.f16601a.f16633k) {
            i11 = 65536;
        } else {
            i11 = 1048576;
        }
        while (i12 < i10 && i12 <= i11) {
            ei.b g10 = cVar.g(i12);
            if (g10 == null || !g10.d()) {
                if (g10 == null) {
                    f11 = fVar.f23076b.f16618s;
                } else {
                    f11 = g10.f16598f;
                }
                f13 = (f11 * fVar.f23079f) + f13;
            }
            i12++;
        }
        return f13 + f10;
    }

    public static void k(Rectangle rectangle, float f10) {
        float f11 = f10 % 360.0f;
        if ((f11 > 45.0f && f11 <= 135.0f) || (f11 > 225.0f && f11 < 315.0f)) {
            double centerX = rectangle.getCenterX();
            double centerY = rectangle.getCenterY();
            rectangle.f20688x = (int) Math.round(centerX - (rectangle.height / 2));
            rectangle.f20689y = (int) Math.round(centerY - (rectangle.width / 2));
            int i10 = rectangle.width;
            rectangle.width = rectangle.height;
            rectangle.height = i10;
        }
    }

    public final RectF b(oi.f fVar, int i10, int i11) {
        c cVar = fVar.f23076b;
        if (cVar.g(i10) != null && cVar.g(i10).e(i11, true) != null) {
            ei.a e10 = cVar.g(i10).e(i11, true);
            if (e10.g() >= 0) {
                return e(fVar, cVar.f(e10.g()));
            }
        }
        RectF rectF = this.f22039a;
        rectF.left = h(fVar, i11, 0.0f);
        rectF.top = j(fVar, i10, 0.0f);
        rectF.right = h(fVar, i11 + 1, 0.0f);
        rectF.bottom = j(fVar, i10 + 1, 0.0f);
        return rectF;
    }

    public final RectF c(oi.f fVar, int i10, int i11, int i12) {
        c cVar = fVar.f23076b;
        if (cVar.g(i10) != null && cVar.g(i10).e(i11, true) != null && cVar.g(i10).e(i12, true) != null) {
            ei.a e10 = cVar.g(i10).e(i12, true);
            if (e10.g() >= 0) {
                i12 = cVar.f(e10.g()).f5692d;
            }
        }
        RectF rectF = this.f22039a;
        rectF.left = h(fVar, i11, 0.0f);
        rectF.top = j(fVar, i10, 0.0f);
        rectF.right = h(fVar, i12 + 1, 0.0f);
        rectF.bottom = j(fVar, i10 + 1, 0.0f);
        return rectF;
    }

    public final RectF e(oi.f fVar, ci.a aVar) {
        RectF rectF = this.f22039a;
        rectF.left = h(fVar, aVar.f5691b, 0.0f);
        rectF.top = j(fVar, aVar.f5690a, 0.0f);
        rectF.right = h(fVar, aVar.f5692d + 1, 0.0f);
        rectF.bottom = j(fVar, aVar.c + 1, 0.0f);
        return rectF;
    }
}
