package vh;

import ai.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import lh.f;
import lh.g;
import lh.i;
import lh.k;
import lh.l;
import lh.m;
import lh.n;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.pg.control.Presentation;
import rh.e;
import sg.e;
import th.c;
import th.d;
import zh.j;

/* compiled from: SlideDrawKit.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f30811a;

    public static void a(d dVar) {
        l lVar;
        n nVar;
        h hVar;
        if (dVar != null) {
            int f10 = dVar.f();
            for (int i10 = 0; i10 < f10; i10++) {
                g e10 = dVar.e(i10);
                if (e10.getType() == 1) {
                    n nVar2 = (n) e10;
                    h hVar2 = nVar2.f20644o;
                    if (hVar2 != null) {
                        hVar2.dispose();
                        nVar2.f20644o = null;
                    }
                } else if (e10.getType() == 6) {
                    m mVar = (m) e10;
                    int length = mVar.f20633m.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        l[] lVarArr = mVar.f20633m;
                        if (i11 >= lVarArr.length) {
                            lVar = null;
                        } else {
                            lVar = lVarArr[i11];
                        }
                        if (lVar != null && (nVar = lVar.f20630e) != null && (hVar = nVar.f20644o) != null) {
                            hVar.dispose();
                            nVar.f20644o = null;
                        }
                    }
                }
            }
        }
    }

    public static void b(Canvas canvas, c cVar, e eVar, int i10, g gVar, float f10, HashMap hashMap) {
        int i11;
        l lVar;
        int i12;
        char c;
        Paint paint;
        int i13;
        int i14;
        Paint paint2;
        eh.b bVar;
        eh.b bVar2;
        eh.b bVar3;
        eh.b bVar4;
        Rectangle rectangle;
        int i15;
        int i16;
        Rect f11;
        g[] r4;
        canvas.save();
        char c10 = 0;
        if (gVar instanceof f) {
            Rect f12 = f(gVar, f10);
            if (gVar.d()) {
                canvas.translate(f12.left, f12.bottom);
                canvas.scale(1.0f, -1.0f);
                canvas.translate(-f12.left, -f12.top);
            }
            if (gVar.c()) {
                canvas.translate(f12.right, f12.top);
                canvas.scale(-1.0f, 1.0f);
                canvas.translate(-f12.left, -f12.top);
            }
            if (gVar.getRotation() != 0.0f) {
                canvas.rotate(gVar.getRotation(), f12.exactCenterX(), f12.exactCenterY());
            }
            for (g gVar2 : ((f) gVar).r()) {
                if (!gVar.a()) {
                    b(canvas, cVar, eVar, i10, gVar2, f10, hashMap);
                }
            }
        } else if (gVar.getType() == 8) {
            k kVar = (k) gVar;
            sg.a.d(canvas, eVar.getControl(), i10, kVar, f(gVar, f10), f10);
            canvas.translate(f11.left, f11.top);
            for (g gVar3 : kVar.q()) {
                b(canvas, cVar, eVar, i10, gVar3, f10, hashMap);
            }
        } else if (gVar.getType() == 1) {
            e(canvas, cVar, eVar, i10, (n) gVar, f10, hashMap);
        } else {
            short type = gVar.getType();
            sg.e eVar2 = e.a.f29807a;
            if (type != 4 && gVar.getType() != 2) {
                if (gVar.getType() == 0) {
                    i iVar = (i) gVar;
                    canvas.save();
                    h(canvas, iVar, f10);
                    Rectangle rectangle2 = iVar.f20604e;
                    sg.a.d(canvas, eVar.getControl(), i10, iVar, f(iVar, f10), f10);
                    jh.c.f19238d.g(canvas, eVar.getControl(), i10, iVar.q(eVar.getControl()), rectangle2.f20688x * f10, rectangle2.f20689y * f10, f10, rectangle2.width * f10, rectangle2.height * f10, iVar.f20625o, iVar.f20609j);
                    canvas.restore();
                } else {
                    short type2 = gVar.getType();
                    sg.d dVar = sg.d.f29801b;
                    if (type2 == 5) {
                        lh.a aVar = (lh.a) gVar;
                        qh.d dVar2 = aVar.f20609j;
                        if (dVar2 == null || dVar2.e().f29343a != 0) {
                            canvas.save();
                            Rectangle rectangle3 = aVar.f20604e;
                            Paint a10 = dVar.a();
                            if (dVar2 != null) {
                                qh.e d10 = dVar2.d();
                                int i17 = d10.c;
                                int i18 = d10.f29347d;
                                if ((i17 == -2 && i18 == -2) || (i17 == -1 && i18 == -1)) {
                                    int i19 = dVar2.e().f29343a;
                                    a10.setAlpha(i19);
                                    float f13 = (i19 / 255.0f) * 0.5f;
                                    double centerX = rectangle3.getCenterX();
                                    double centerY = rectangle3.getCenterY();
                                    Rectangle rectangle4 = new Rectangle(rectangle3);
                                    rectangle4.f20688x = Math.round((float) (centerX - (rectangle4.width * f13)));
                                    rectangle4.f20689y = Math.round((float) (centerY - (rectangle4.height * f13)));
                                    float f14 = f13 * 2.0f;
                                    rectangle4.width = (int) (rectangle4.width * f14);
                                    rectangle4.height = (int) (rectangle4.height * f14);
                                    float f15 = f13 * f10 * 2.0f;
                                    h(canvas, aVar, f15);
                                    aVar.f20600m.l(f15);
                                    aVar.f20600m.a(canvas, eVar.getControl(), (int) (rectangle4.f20688x * f10), (int) (rectangle4.f20689y * f10), (int) (rectangle4.width * f10), (int) (rectangle4.height * f10), a10);
                                }
                            }
                            h(canvas, aVar, f10);
                            aVar.f20600m.l(f10);
                            aVar.f20600m.a(canvas, eVar.getControl(), (int) (rectangle3.f20688x * f10), (int) (rectangle3.f20689y * f10), (int) (rectangle3.width * f10), (int) (rectangle3.height * f10), a10);
                            canvas.restore();
                        }
                    } else if (gVar.getType() == 6) {
                        m mVar = (m) gVar;
                        canvas.save();
                        h(canvas, mVar, f10);
                        qh.d dVar3 = mVar.f20609j;
                        int i20 = FunctionEval.FunctionID.EXTERNAL_FUNC;
                        if (dVar3 != null) {
                            i11 = dVar3.e().f29343a;
                            if (i11 != 255 && (rectangle = mVar.f20604e) != null) {
                                canvas.saveLayerAlpha(rectangle.f20688x * f10, rectangle.f20689y * f10, (i15 + rectangle.width + 1) * f10, (rectangle.height + i16 + 1) * f10, i11, 31);
                            }
                        } else {
                            i11 = 255;
                        }
                        l[] lVarArr = mVar.f20633m;
                        int length = lVarArr.length;
                        int i21 = 0;
                        while (i21 < length) {
                            if (i21 >= lVarArr.length) {
                                lVar = null;
                            } else {
                                lVar = lVarArr[i21];
                            }
                            l lVar2 = lVar;
                            if (lVar2 != null) {
                                lib.zj.office.java.awt.a aVar2 = lVar2.f20631f;
                                Rect e10 = eVar2.e("SlideDrawKit");
                                e10.set(Math.round(aVar2.f20690a * f10), Math.round(aVar2.f20691b * f10), Math.round((aVar2.f20690a + aVar2.c) * f10), Math.round((aVar2.f20691b + aVar2.f20692d) * f10));
                                sg.a.a(canvas, eVar.getControl(), i10, lVar2.f20632g, e10, f10);
                                Paint a11 = dVar.a();
                                int color = a11.getColor();
                                canvas.save();
                                float max = Math.max(1.0f, f10);
                                gh.b bVar5 = lVar2.f20627a;
                                if (bVar5 != null && (bVar4 = bVar5.f17807b) != null) {
                                    a11.setColor(bVar4.f16571d);
                                    a11.setStrokeWidth(bVar5.f17806a * f10);
                                    float f16 = aVar2.f20690a * f10;
                                    float f17 = aVar2.f20691b;
                                    c = 0;
                                    i13 = i21;
                                    i14 = color;
                                    paint = a11;
                                    canvas.drawRect(f16, f17 * f10, f16 + max, (f17 + aVar2.f20692d) * f10, a11);
                                } else {
                                    c = 0;
                                    paint = a11;
                                    i13 = i21;
                                    i14 = color;
                                }
                                gh.b bVar6 = lVar2.c;
                                if (bVar6 != null && (bVar3 = bVar6.f17807b) != null) {
                                    Paint paint3 = paint;
                                    paint3.setColor(bVar3.f16571d);
                                    paint3.setStrokeWidth(bVar6.f17806a * f10);
                                    float f18 = aVar2.f20690a;
                                    float f19 = aVar2.f20691b * f10;
                                    canvas.drawRect(f18 * f10, f19, (f18 + aVar2.c) * f10, f19 + max, paint3);
                                }
                                gh.b bVar7 = lVar2.f20628b;
                                if (bVar7 != null && (bVar2 = bVar7.f17807b) != null) {
                                    Paint paint4 = paint;
                                    paint4.setColor(bVar2.f16571d);
                                    paint4.setStrokeWidth(bVar7.f17806a * f10);
                                    float f20 = (aVar2.f20690a + aVar2.c) * f10;
                                    float f21 = aVar2.f20691b;
                                    canvas.drawRect(f20, f21 * f10, f20 + max, (f21 + aVar2.f20692d) * f10, paint4);
                                }
                                gh.b bVar8 = lVar2.f20629d;
                                if (bVar8 != null && (bVar = bVar8.f17807b) != null) {
                                    Paint paint5 = paint;
                                    paint5.setColor(bVar.f16571d);
                                    paint5.setStrokeWidth(bVar8.f17806a * f10);
                                    float f22 = aVar2.f20690a;
                                    float f23 = (aVar2.f20691b + aVar2.f20692d) * f10;
                                    paint2 = paint5;
                                    canvas.drawRect(f22 * f10, f23, (f22 + aVar2.c) * f10, f23 + max, paint5);
                                } else {
                                    paint2 = paint;
                                }
                                paint2.setColor(i14);
                                canvas.restore();
                                n nVar = lVar2.f20630e;
                                if (nVar != null) {
                                    i12 = i13;
                                    e(canvas, cVar, eVar, i10, nVar, f10, hashMap);
                                } else {
                                    i12 = i13;
                                }
                            } else {
                                i12 = i21;
                                c = c10;
                            }
                            i21 = i12 + 1;
                            c10 = c;
                            i20 = FunctionEval.FunctionID.EXTERNAL_FUNC;
                        }
                        if (i11 != i20) {
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                }
            } else {
                lib.zj.office.system.f control = eVar.getControl();
                lh.e eVar3 = (lh.e) gVar;
                Rectangle bounds = eVar3.getBounds();
                int round = Math.round(bounds.f20688x * f10);
                int round2 = Math.round(bounds.f20689y * f10);
                int round3 = Math.round(bounds.width * f10);
                int round4 = Math.round(bounds.height * f10);
                Rect e11 = eVar2.e("AutoShapeKit");
                e11.set(round, round2, round3 + round, round4 + round2);
                tg.a.a(canvas, control, i10, eVar3, e11, f10);
            }
        }
        canvas.restore();
    }

    public static void c(Canvas canvas, c cVar, rh.e eVar, d dVar, int i10, float f10, HashMap hashMap) {
        boolean z10;
        if (dVar != null) {
            int f11 = dVar.f();
            for (int i11 = 0; i11 < f11; i11++) {
                g e10 = dVar.e(i11);
                if (!e10.a()) {
                    int g10 = e10.g();
                    if (dVar.c != 2 && g10 != 0 && g10 != 19 && g10 != 20 && g10 != 21 && g10 != 22 && g10 != 23 && g10 != 24) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        b(canvas, cVar, eVar, i10, e10, f10, hashMap);
                    }
                }
            }
        }
    }

    public static void e(Canvas canvas, c cVar, rh.e eVar, int i10, n nVar, float f10, HashMap hashMap) {
        boolean z10;
        Rectangle rectangle = nVar.f20604e;
        zh.l lVar = nVar.f20643n;
        if (lVar != null && lVar.f32372b - lVar.f32371a != 0) {
            canvas.save();
            h hVar = nVar.f20644o;
            Presentation presentation = eVar.c;
            if (presentation != null && hVar == null && (nVar.f20645p == 1 || nVar.f20611l == 8)) {
                zh.k kVar = cVar.f30028a;
                kVar.getClass();
                kVar.f32390a = lVar;
                String text = lVar.getText();
                if (text != null && text.contains("*")) {
                    String replace = text.replace("*", String.valueOf(i10 + presentation.getPGModel().f30033g));
                    zh.l lVar2 = new zh.l();
                    lVar2.f32371a = 0L;
                    lVar2.f32372b = replace.length();
                    lVar2.c = ((zh.c) nVar.f20643n.c).clone();
                    j jVar = (j) nVar.f20643n.f32391e.d(0);
                    j jVar2 = new j();
                    jVar2.f32371a = 0L;
                    jVar2.f32372b = replace.length();
                    jVar2.c = ((zh.c) jVar.c).clone();
                    lVar2.e(jVar2);
                    zh.i iVar = new zh.i(replace);
                    iVar.f32371a = 0L;
                    iVar.f32372b = replace.length();
                    iVar.c = ((zh.c) ((zh.i) jVar.f(0)).c).clone();
                    jVar2.e(iVar);
                    nVar.f20643n = lVar2;
                    lVar = lVar2;
                }
            }
            if (hVar == null) {
                zh.k kVar2 = cVar.f30028a;
                kVar2.getClass();
                kVar2.f32390a = lVar;
                hVar = new h(eVar, kVar2);
                hVar.f532p = nVar.f20642m;
                hVar.G();
                nVar.f20644o = hVar;
            }
            if (hashMap != null) {
                int i11 = nVar.f20602b;
                if (i11 >= 0) {
                    eVar.f29563d = (Map) hashMap.get(Integer.valueOf(i11));
                } else {
                    eVar.f29563d = (Map) hashMap.get(Integer.valueOf(nVar.c));
                }
                hVar.g(canvas, (int) (rectangle.f20688x * f10), (int) (rectangle.f20689y * f10), f10);
            } else {
                if (nVar == eVar.f29561a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xh.b bVar = eVar.f29562b;
                bVar.c = z10;
                hVar.g(canvas, (int) (rectangle.f20688x * f10), (int) (rectangle.f20689y * f10), f10);
                bVar.c = false;
            }
            canvas.restore();
        }
    }

    public static Rect f(g gVar, float f10) {
        Rectangle bounds = gVar.getBounds();
        int round = Math.round(bounds.f20688x * f10);
        int round2 = Math.round(bounds.f20689y * f10);
        return new Rect(round, round2, Math.round(bounds.width * f10) + round, Math.round(bounds.height * f10) + round2);
    }

    public static a g() {
        if (f30811a == null) {
            f30811a = new a();
        }
        return f30811a;
    }

    public static void h(Canvas canvas, g gVar, float f10) {
        Rectangle bounds = gVar.getBounds();
        float rotation = gVar.getRotation();
        if (gVar.d()) {
            rotation += 180.0f;
        }
        qh.d o10 = gVar.o();
        if (o10 != null && o10.d().f29346b == 1) {
            rotation += o10.e().f29344b;
        }
        if (rotation != 0.0f) {
            canvas.rotate(rotation, ((bounds.width / 2.0f) + bounds.f20688x) * f10, ((bounds.height / 2.0f) + bounds.f20689y) * f10);
        }
    }

    public static Bitmap i(c cVar, rh.e eVar, d dVar, float f10, HashMap hashMap, boolean z10) {
        if (dVar == null) {
            return null;
        }
        jh.c.f19238d.f19241a.set(true);
        Dimension dimension = cVar.c;
        int i10 = (int) (dimension.width * f10);
        int i11 = (int) (dimension.height * f10);
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Rect e10 = e.a.f29807a.e("SlideDrawKit");
        e10.set(0, 0, i10, i11);
        Canvas canvas = new Canvas(createBitmap);
        if (z10) {
            canvas.drawColor(Color.white.getRGB());
        }
        if (!sg.a.a(canvas, eVar.getControl(), dVar.f30036b, dVar.f30041h, e10, f10) && !z10) {
            canvas.drawColor(Color.white.getRGB());
        }
        int i12 = 0;
        while (true) {
            int[] iArr = dVar.f30042i;
            if (i12 < iArr.length) {
                c(canvas, cVar, eVar, cVar.e(iArr[i12]), dVar.f30036b, f10, hashMap);
                i12++;
            } else {
                c(canvas, cVar, eVar, dVar, dVar.f30036b, f10, hashMap);
                jh.c.f19238d.f19241a.set(false);
                return createBitmap;
            }
        }
    }

    public final void d(Canvas canvas, c cVar, rh.e eVar, d dVar, float f10, HashMap hashMap) {
        synchronized (this) {
            try {
                Dimension dimension = cVar.c;
                Rect e10 = e.a.f29807a.e("SlideDrawKit");
                e10.set(0, 0, (int) (dimension.width * f10), (int) (dimension.height * f10));
                if (!sg.a.a(canvas, eVar.getControl(), dVar.f30036b, dVar.f30041h, e10, f10)) {
                    canvas.drawColor(Color.white.getRGB());
                }
                for (int i10 : dVar.f30042i) {
                    c(canvas, cVar, eVar, cVar.e(i10), dVar.f30036b, f10, hashMap);
                }
                c(canvas, cVar, eVar, dVar, dVar.f30036b, f10, hashMap);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
