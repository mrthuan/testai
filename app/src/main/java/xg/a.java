package xg;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.play.core.assetpacks.b1;
import eh.b;
import java.util.ArrayList;
import lh.e;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import sg.e;

/* compiled from: BaseShapePathBuilder.java */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0954  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(lh.e r17, android.graphics.Rect r18) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.a.a(lh.e, android.graphics.Rect):java.lang.Object");
    }

    public static ArrayList b(e eVar, Rect rect) {
        b bVar;
        ArrayList<tg.b> s4 = s();
        float min = Math.min(rect.height(), rect.width()) * 0.125f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            min = Math.min(rect.height(), rect.width()) * fArr[0].floatValue();
        }
        b bVar2 = eVar.f20603d;
        if (bVar2 != null) {
            bVar = new b();
            bVar.c = (byte) 0;
            int i10 = bVar2.f16571d;
            bVar.f16571d = Color.rgb(b1.o(0.2d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.2d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.2d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar = bVar2;
        }
        tg.b bVar3 = new tg.b();
        PathHolder pathHolder = new PathHolder();
        pathHolder.moveTo(rect.left, rect.top);
        pathHolder.lineTo(rect.right, rect.top);
        pathHolder.lineTo(rect.right - min, rect.top + min);
        pathHolder.lineTo(rect.left + min, rect.top + min);
        pathHolder.close();
        bVar3.b(eVar.f20610k);
        bVar3.f30011b = bVar;
        bVar3.c(pathHolder);
        s4.add(bVar3);
        if (bVar2 != null) {
            bVar = new b();
            bVar.c = (byte) 0;
            int i11 = bVar2.f16571d;
            bVar.f16571d = Color.rgb(b1.o(-0.4d, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.4d, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.4d, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }
        tg.b bVar4 = new tg.b();
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.right - min, rect.top + min);
        pathHolder2.lineTo(rect.right, rect.top);
        pathHolder2.lineTo(rect.right, rect.bottom);
        pathHolder2.lineTo(rect.right - min, rect.bottom - min);
        pathHolder2.close();
        bVar4.b(eVar.f20610k);
        bVar4.f30011b = bVar;
        bVar4.c(pathHolder2);
        s4.add(bVar4);
        if (bVar2 != null) {
            bVar = new b();
            bVar.c = (byte) 0;
            int i12 = bVar2.f16571d;
            bVar.f16571d = Color.rgb(b1.o(-0.2d, Color.red(i12) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.green(i12) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.blue(i12) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }
        tg.b bVar5 = new tg.b();
        PathHolder pathHolder3 = new PathHolder();
        pathHolder3.moveTo(rect.left + min, rect.bottom - min);
        pathHolder3.lineTo(rect.right - min, rect.bottom - min);
        pathHolder3.lineTo(rect.right, rect.bottom);
        pathHolder3.lineTo(rect.left, rect.bottom);
        pathHolder3.close();
        bVar5.b(eVar.f20610k);
        bVar5.f30011b = bVar;
        bVar5.c(pathHolder3);
        s4.add(bVar5);
        if (bVar2 != null) {
            bVar = new b();
            bVar.c = (byte) 0;
            int i13 = bVar2.f16571d;
            bVar.f16571d = Color.rgb(b1.o(0.4d, Color.red(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.4d, Color.green(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(0.4d, Color.blue(i13) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        }
        tg.b bVar6 = new tg.b();
        PathHolder pathHolder4 = new PathHolder();
        pathHolder4.moveTo(rect.left, rect.top);
        pathHolder4.lineTo(rect.left + min, rect.top + min);
        pathHolder4.lineTo(rect.left + min, rect.bottom - min);
        pathHolder4.lineTo(rect.left, rect.bottom);
        pathHolder4.close();
        bVar6.b(eVar.f20610k);
        bVar6.f30011b = bVar;
        bVar6.c(pathHolder4);
        s4.add(bVar6);
        tg.b bVar7 = new tg.b();
        PathHolder pathHolder5 = new PathHolder();
        pathHolder5.addRect(rect.left + min, rect.top + min, rect.right - min, rect.bottom - min, Path.Direction.CW);
        bVar7.b(eVar.f20610k);
        bVar7.f30011b = bVar2;
        bVar7.c(pathHolder5);
        s4.add(bVar7);
        return s4;
    }

    public static Path c(e eVar, Rect rect) {
        float f10;
        Path r4 = r();
        RectF u7 = u();
        float min = Math.min(rect.width(), rect.height()) * 0.25f;
        Float[] fArr = eVar.f20616n;
        float f11 = 180.0f;
        float f12 = 0.0f;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length >= 3) {
                Float f13 = fArr[0];
                if (f13 != null) {
                    f11 = (f13.floatValue() * 10.0f) / 6.0f;
                }
                Float f14 = fArr[1];
                if (f14 != null) {
                    f12 = (f14.floatValue() * 10.0f) / 6.0f;
                }
                if (fArr[2] != null) {
                    min = fArr[2].floatValue() * Math.min(rect.width(), rect.height());
                }
            }
        } else {
            if (fArr != null && fArr.length >= 1) {
                Float f15 = fArr[0];
                if (f15 != null) {
                    f10 = f15.floatValue() * 0.3295496f;
                } else {
                    f10 = 0.0f;
                }
                if (fArr.length >= 2 && fArr[1] != null) {
                    min = fArr[1].floatValue() * rect.width();
                } else {
                    min = rect.width() * 0.25f;
                }
            } else {
                min = rect.width() * 0.25f;
                f10 = 180.0f;
            }
            if (f10 >= 0.0f) {
                f12 = (90.0f - f10) + 90.0f;
            } else {
                f10 += 360.0f;
                f12 = 360.0f - (f10 - 180.0f);
            }
            f11 = f10;
        }
        if (f12 >= f11) {
            u7.set(rect.left, rect.top, rect.right, rect.bottom);
            r4.arcTo(u7, f11, f12 - f11);
            u7.set(rect.left + min, rect.top + min, rect.right - min, rect.bottom - min);
            r4.arcTo(u7, f12, f11 - f12);
        } else {
            u7.set(rect.left, rect.top, rect.right, rect.bottom);
            r4.arcTo(u7, f11, (f12 + 360.0f) - f11);
            u7.set(rect.left + min, rect.top + min, rect.right - min, rect.bottom - min);
            r4.arcTo(u7, f12, (f11 - f12) - 360.0f);
        }
        r4.close();
        return r4;
    }

    public static ArrayList d(e eVar, Rect rect) {
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        float min = Math.min(rect.width(), rect.height()) * 0.08f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            min = Math.min(rect.width(), rect.height()) * fArr[0].floatValue();
        }
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            float f10 = rect.right;
            float f11 = min * 3.0f;
            float f12 = rect.top;
            float f13 = min * 2.0f;
            u7.set(f10 - f11, f12, f10 - min, f12 + f13);
            pathHolder.arcTo(u7, 270.0f, 90.0f);
            u7.set(rect.right - min, rect.exactCenterY() - f13, rect.right + min, rect.exactCenterY());
            pathHolder.arcTo(u7, 180.0f, -90.0f);
            u7.set(rect.right - min, rect.exactCenterY(), rect.right + min, rect.exactCenterY() + f13);
            pathHolder.arcTo(u7, 270.0f, -90.0f);
            float f14 = rect.right;
            float f15 = rect.bottom;
            u7.set(f14 - f11, f15 - f13, f14 - min, f15);
            pathHolder.arcTo(u7, 0.0f, 90.0f);
            float f16 = rect.left;
            float f17 = rect.bottom;
            u7.set(f16 + min, f17 - f13, f16 + f11, f17);
            pathHolder.arcTo(u7, 90.0f, 90.0f);
            u7.set(rect.left - min, rect.exactCenterY(), rect.left + min, rect.exactCenterY() + f13);
            pathHolder.arcTo(u7, 0.0f, -90.0f);
            u7.set(rect.left - min, rect.exactCenterY() - f13, rect.left + min, rect.exactCenterY());
            pathHolder.arcTo(u7, 90.0f, -90.0f);
            float f18 = rect.left;
            float f19 = rect.top;
            u7.set(f18 + min, f19, f18 + f11, f19 + f13);
            pathHolder.arcTo(u7, 180.0f, 90.0f);
            pathHolder.close();
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            float f20 = 2.0f * min;
            pathHolder2.moveTo(rect.right - f20, rect.top);
            float f21 = rect.right;
            float f22 = 3.0f * min;
            float f23 = rect.top;
            u7.set(f21 - f22, f23, f21 - min, f23 + f20);
            pathHolder2.arcTo(u7, 270.0f, 90.0f);
            u7.set(rect.right - min, rect.exactCenterY() - f20, rect.right + min, rect.exactCenterY());
            pathHolder2.arcTo(u7, 180.0f, -90.0f);
            u7.set(rect.right - min, rect.exactCenterY(), rect.right + min, rect.exactCenterY() + f20);
            pathHolder2.arcTo(u7, 270.0f, -90.0f);
            float f24 = rect.right;
            float f25 = rect.bottom;
            u7.set(f24 - f22, f25 - f20, f24 - min, f25);
            pathHolder2.arcTo(u7, 0.0f, 90.0f);
            pathHolder2.moveTo(rect.left + f20, rect.bottom);
            float f26 = rect.left;
            float f27 = rect.bottom;
            u7.set(f26 + min, f27 - f20, f26 + f22, f27);
            pathHolder2.arcTo(u7, 90.0f, 90.0f);
            u7.set(rect.left - min, rect.exactCenterY(), rect.left + min, rect.exactCenterY() + f20);
            pathHolder2.arcTo(u7, 0.0f, -90.0f);
            u7.set(rect.left - min, rect.exactCenterY() - f20, rect.left + min, rect.exactCenterY());
            pathHolder2.arcTo(u7, 90.0f, -90.0f);
            float f28 = rect.left;
            float f29 = rect.top;
            u7.set(min + f28, f29, f28 + f22, f20 + f29);
            pathHolder2.arcTo(u7, 180.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static ArrayList e(e eVar, Rect rect) {
        float min;
        float f10;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            f10 = Math.min(rect.width(), rect.height());
            min = fArr[0].floatValue();
        } else {
            min = Math.min(rect.width(), rect.height());
            f10 = 0.18f;
        }
        float f11 = min * f10;
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            u7.set(rect.left, rect.top, rect.right, rect.bottom);
            pathHolder.addRoundRect(u7, new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, Path.Direction.CW);
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            float f12 = rect.right;
            float f13 = 2.0f * f11;
            float f14 = rect.top;
            u7.set(f12 - f13, f14, f12, f14 + f13);
            pathHolder2.arcTo(u7, 270.0f, 90.0f);
            float f15 = rect.right;
            float f16 = rect.bottom;
            u7.set(f15 - f13, f16 - f13, f15, f16);
            pathHolder2.arcTo(u7, 0.0f, 90.0f);
            pathHolder2.moveTo(rect.left + f11, rect.bottom);
            float f17 = rect.left;
            float f18 = rect.bottom;
            u7.set(f17, f18 - f13, f17 + f13, f18);
            pathHolder2.arcTo(u7, 90.0f, 90.0f);
            float f19 = rect.left;
            float f20 = rect.top;
            u7.set(f19, f20, f19 + f13, f13 + f20);
            pathHolder2.arcTo(u7, 180.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static Path f(e eVar, Rect rect) {
        Path r4 = r();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        float f10 = 45.0f;
        float f11 = 270.0f;
        if (fArr != null && fArr.length >= 2) {
            Float f12 = fArr[0];
            if (f12 != null) {
                f10 = (f12.floatValue() * 10.0f) / 6.0f;
            }
            Float f13 = fArr[1];
            if (f13 != null) {
                f11 = (f13.floatValue() * 10.0f) / 6.0f;
            }
        }
        u7.set(rect.left, rect.top, rect.right, rect.bottom);
        r4.arcTo(u7, f10, f11 - f10);
        r4.close();
        return r4;
    }

    public static Path g(Rect rect) {
        Path r4 = r();
        RectF u7 = u();
        Matrix c = e.a.f29807a.c("BaseShapePathBuilder");
        r4.reset();
        u7.set(0.0f, 160.0f, 90.0f, 285.0f);
        r4.arcTo(u7, 120.0f, 148.0f);
        u7.set(41.0f, 44.0f, 188.0f, 250.0f);
        r4.arcTo(u7, 172.5f, 127.5f);
        u7.set(140.0f, 14.0f, 264.0f, 220.0f);
        r4.arcTo(u7, 218.0f, 90.0f);
        u7.set(230.0f, 0.0f, 340.0f, 210.0f);
        r4.arcTo(u7, 219.0f, 92.0f);
        u7.set(296.0f, 0.0f, 428.0f, 246.0f);
        r4.arcTo(u7, 232.0f, 101.0f);
        u7.set(342.0f, 60.0f, 454.0f, 214.0f);
        r4.arcTo(u7, 293.0f, 89.0f);
        u7.set(324.0f, 130.0f, 468.0f, 327.0f);
        r4.arcTo(u7, 319.0f, 119.0f);
        u7.set(280.0f, 240.0f, 405.0f, 412.0f);
        r4.arcTo(u7, 1.0f, 122.0f);
        u7.set(168.0f, 274.0f, 312.0f, 468.0f);
        r4.arcTo(u7, 16.0f, 130.0f);
        u7.set(57.0f, 249.0f, 213.0f, 441.0f);
        r4.arcTo(u7, 56.0f, 74.0f);
        u7.set(11.0f, 259.0f, 99.0f, 386.0f);
        r4.arcTo(u7, 84.0f, 140.0f);
        r4.close();
        c.reset();
        c.postScale(rect.width() / 468.0f, rect.height() / 468.0f);
        r4.transform(c);
        r4.offset(rect.left, rect.top);
        return r4;
    }

    public static Path h(lh.e eVar, Rect rect) {
        Path r4 = r();
        float min = Math.min(rect.height(), rect.width()) * 0.5f;
        float min2 = Math.min(rect.height(), rect.width()) * 0.5f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 2) {
            if (fArr[0] != null) {
                min2 = Math.min(rect.height(), rect.width()) * fArr[0].floatValue();
            }
            if (fArr[1] != null) {
                min = Math.min(rect.height(), rect.width()) * fArr[1].floatValue();
            }
        }
        float height = rect.height() - min2;
        r4.moveTo(rect.left, rect.top);
        r4.lineTo(rect.left + min, rect.top);
        r4.lineTo(rect.left + min, rect.top + height);
        r4.lineTo(rect.right, rect.top + height);
        r4.lineTo(rect.right, rect.bottom);
        r4.lineTo(rect.left, rect.bottom);
        r4.close();
        return r4;
    }

    public static Path i(Rect rect) {
        Path r4 = r();
        float width = rect.width() * 0.1f;
        float width2 = rect.width() * 0.35f;
        float height = rect.height() * 0.2f;
        r4.moveTo(rect.left + width2, rect.top);
        r4.lineTo(rect.right - width2, rect.top);
        r4.lineTo(rect.right - width, rect.top + height);
        r4.lineTo(rect.right, rect.exactCenterY());
        r4.lineTo(rect.right - width, rect.bottom - height);
        r4.lineTo(rect.right - width2, rect.bottom);
        r4.lineTo(rect.left + width2, rect.bottom);
        r4.lineTo(rect.left + width, rect.bottom - height);
        r4.lineTo(rect.left, rect.exactCenterY());
        r4.lineTo(rect.left + width, rect.top + height);
        r4.close();
        return r4;
    }

    public static Path j(lh.e eVar, Rect rect) {
        Path r4 = r();
        float height = rect.height() * 0.5f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            height = rect.height() * fArr[0].floatValue();
        }
        float width = (rect.width() * height) / rect.height();
        r4.moveTo(rect.left, rect.top + height);
        r4.lineTo(rect.left + width, rect.top);
        r4.lineTo(rect.right, rect.top);
        r4.lineTo(rect.left, rect.bottom);
        r4.close();
        return r4;
    }

    public static Path k(Rect rect) {
        Path r4 = r();
        float width = rect.width() * 0.133f;
        float width2 = rect.width() * 0.35f;
        float height = rect.height() * 0.133f;
        float height2 = rect.height() * 0.35f;
        r4.moveTo(rect.left + width2, rect.top);
        r4.lineTo(rect.right - width2, rect.top);
        r4.lineTo(rect.right - width, rect.top + height);
        r4.lineTo(rect.right, rect.top + height2);
        r4.lineTo(rect.right, rect.bottom - height2);
        r4.lineTo(rect.right - width, rect.bottom - height);
        r4.lineTo(rect.right - width2, rect.bottom);
        r4.lineTo(rect.left + width2, rect.bottom);
        r4.lineTo(rect.left + width, rect.bottom - height);
        r4.lineTo(rect.left, rect.bottom - height2);
        r4.lineTo(rect.left, rect.top + height2);
        r4.lineTo(rect.left + width, rect.top + height);
        r4.close();
        return r4;
    }

    public static ArrayList l(lh.e eVar, Rect rect) {
        float f10;
        ArrayList<tg.b> s4 = s();
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            float min = Math.min(rect.width(), rect.height()) * 0.25f;
            if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
                min = Math.min(rect.width(), rect.height()) * fArr[0].floatValue();
            }
            b bVar = eVar.f20603d;
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            pathHolder.moveTo(rect.left, rect.top);
            pathHolder.lineTo(rect.right, rect.top);
            pathHolder.lineTo(rect.right, rect.bottom - min);
            pathHolder.lineTo(rect.right - min, rect.bottom);
            pathHolder.lineTo(rect.left, rect.bottom);
            pathHolder.close();
            bVar2.b(eVar.f20610k);
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
            if (bVar != null) {
                b bVar3 = new b();
                bVar3.c = (byte) 0;
                int i10 = bVar.f16571d;
                bVar3.f16571d = Color.rgb(b1.o(-0.2d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                bVar = bVar3;
            }
            tg.b bVar4 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            pathHolder2.moveTo(rect.right - (((((float) Math.sin(Math.toRadians(75.0d))) * min) * ((float) Math.sqrt(6.0d))) / 3.0f), rect.bottom - (((((float) Math.sin(Math.toRadians(75.0d))) * min) * ((float) Math.sqrt(6.0d))) / 3.0f));
            pathHolder2.lineTo(rect.right, rect.bottom - min);
            pathHolder2.lineTo(rect.right - min, rect.bottom);
            pathHolder2.close();
            bVar4.b(eVar.f20610k);
            bVar4.c(pathHolder2);
            bVar4.f30011b = bVar;
            s4.add(bVar4);
        } else {
            float min2 = Math.min(rect.width(), rect.height()) * 0.125f;
            if (fArr != null && fArr.length >= 1) {
                min2 = Math.min(rect.width(), rect.height()) * (1.0f - fArr[0].floatValue());
            }
            if (rect.height() > rect.width()) {
                min2 = (float) (min2 * 1.4286d);
                f10 = 0.7f;
            } else {
                f10 = 1.4286f;
            }
            tg.b bVar5 = new tg.b();
            PathHolder pathHolder3 = new PathHolder();
            pathHolder3.moveTo(rect.left, rect.top);
            pathHolder3.lineTo(rect.right, rect.top);
            pathHolder3.lineTo(rect.right, rect.bottom - min2);
            float f11 = f10 * min2;
            pathHolder3.lineTo(rect.right - f11, rect.bottom);
            pathHolder3.lineTo(rect.left, rect.bottom);
            pathHolder3.close();
            b bVar6 = eVar.f20603d;
            bVar5.b(eVar.f20610k);
            bVar5.c(pathHolder3);
            bVar5.f30011b = bVar6;
            s4.add(bVar5);
            if (bVar6 != null) {
                b bVar7 = new b();
                bVar7.c = (byte) 0;
                int i11 = bVar6.f16571d;
                bVar7.f16571d = Color.rgb(b1.o(-0.2d, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                bVar6 = bVar7;
            }
            tg.b bVar8 = new tg.b();
            PathHolder pathHolder4 = new PathHolder();
            pathHolder4.moveTo(rect.right - (((((float) Math.sin(Math.toRadians(75.0d))) * f11) * ((float) Math.sqrt(6.0d))) / 3.0f), rect.bottom - (((((float) Math.sin(Math.toRadians(75.0d))) * min2) * ((float) Math.sqrt(6.0d))) / 3.0f));
            pathHolder4.lineTo(rect.right, rect.bottom - min2);
            pathHolder4.lineTo(rect.right - f11, rect.bottom);
            pathHolder4.close();
            bVar8.b(eVar.f20610k);
            bVar8.c(pathHolder4);
            bVar8.f30011b = bVar6;
            s4.add(bVar8);
        }
        return s4;
    }

    public static Path m(lh.e eVar, Rect rect) {
        Path r4 = r();
        RectF u7 = u();
        float min = Math.min(rect.height(), rect.width()) * 0.1f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            min = Math.min(rect.height(), rect.width()) * fArr[0].floatValue();
        }
        u7.set(rect.left, rect.top, rect.right, rect.bottom);
        r4.addRect(u7, Path.Direction.CW);
        u7.set(rect.left + min, rect.top + min, rect.right - min, rect.bottom - min);
        r4.addRect(u7, Path.Direction.CCW);
        return r4;
    }

    public static Path n(lh.e eVar, Rect rect) {
        Path r4 = r();
        float min = Math.min(rect.height(), rect.width()) * 0.33333f;
        float min2 = Math.min(rect.height(), rect.width()) * 0.33333f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 2) {
            if (fArr[0] != null) {
                min2 = Math.min(rect.height(), rect.width()) * fArr[0].floatValue();
            }
            if (fArr[1] != null) {
                min = Math.min(rect.height(), rect.width()) * fArr[1].floatValue();
            }
        }
        float width = (rect.width() * min2) / rect.height();
        float height = (rect.height() * min) / rect.width();
        r4.reset();
        r4.moveTo(rect.left, rect.top);
        r4.lineTo(rect.right, rect.top);
        r4.lineTo(rect.right - width, rect.top + min2);
        r4.lineTo(rect.left + min, rect.top + min2);
        r4.lineTo(rect.left + min, rect.bottom - height);
        r4.lineTo(rect.left, rect.bottom);
        r4.close();
        return r4;
    }

    public static Path o(Rect rect) {
        Path r4 = r();
        float width = rect.width() * 0.1f;
        float width2 = rect.width() * 0.275f;
        float height = rect.height() * 0.2f;
        float height2 = rect.height() * 0.35f;
        r4.reset();
        r4.moveTo(rect.exactCenterX(), rect.top);
        r4.lineTo(rect.right - width, rect.top + height);
        r4.lineTo(rect.right, rect.bottom - height2);
        r4.lineTo(rect.right - width2, rect.bottom);
        r4.lineTo(rect.left + width2, rect.bottom);
        r4.lineTo(rect.left, rect.bottom - height2);
        r4.lineTo(rect.left + width, rect.top + height);
        r4.close();
        return r4;
    }

    public static ArrayList p(lh.e eVar, Rect rect) {
        float height;
        float height2;
        float floatValue;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        float height3 = rect.height() * 0.5f;
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            height = Math.min(rect.width(), rect.height()) * 0.08333f;
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    height = Math.min(rect.width(), rect.height()) * fArr[0].floatValue();
                }
                if (fArr[1] != null) {
                    height2 = rect.height();
                    floatValue = fArr[1].floatValue();
                    height3 = height2 * floatValue;
                }
            }
        } else {
            height = rect.height() * 0.08333f;
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    height = fArr[0].floatValue() * rect.height();
                }
                if (fArr[1] != null) {
                    height2 = rect.height();
                    floatValue = fArr[1].floatValue();
                    height3 = height2 * floatValue;
                }
            }
        }
        if ((height * 2.0f) + rect.top + height3 > rect.bottom) {
            height = (rect.height() - height3) / 2.0f;
        }
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            float f10 = height * 2.0f;
            u7.set(rect.exactCenterX(), rect.bottom - f10, (rect.width() / 2.0f) + rect.right, rect.bottom);
            pathHolder.arcTo(u7, 90.0f, 90.0f);
            u7.set(rect.left - (rect.width() / 2.0f), rect.top + height3, rect.exactCenterX(), rect.top + height3 + f10);
            pathHolder.arcTo(u7, 0.0f, -90.0f);
            u7.set(rect.left - (rect.width() / 2.0f), (rect.top + height3) - f10, rect.exactCenterX(), rect.top + height3);
            pathHolder.arcTo(u7, 90.0f, -90.0f);
            u7.set(rect.exactCenterX(), rect.top, (rect.width() / 2.0f) + rect.right, rect.top + f10);
            pathHolder.arcTo(u7, 180.0f, 90.0f);
            pathHolder.close();
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            float f11 = height * 2.0f;
            u7.set(rect.exactCenterX(), rect.bottom - f11, (rect.width() / 2.0f) + rect.right, rect.bottom);
            pathHolder2.arcTo(u7, 90.0f, 90.0f);
            u7.set(rect.left - (rect.width() / 2.0f), rect.top + height3, rect.exactCenterX(), rect.top + height3 + f11);
            pathHolder2.arcTo(u7, 0.0f, -90.0f);
            u7.set(rect.left - (rect.width() / 2.0f), (rect.top + height3) - f11, rect.exactCenterX(), rect.top + height3);
            pathHolder2.arcTo(u7, 90.0f, -90.0f);
            u7.set(rect.exactCenterX(), rect.top, (rect.width() / 2.0f) + rect.right, rect.top + f11);
            pathHolder2.arcTo(u7, 180.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static ArrayList q(lh.e eVar, Rect rect) {
        int height;
        float height2;
        float floatValue;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length >= 1) {
                height2 = Math.min(rect.width(), rect.height());
                floatValue = fArr[0].floatValue();
            } else {
                height = Math.min(rect.width(), rect.height());
                floatValue = height;
                height2 = 0.08f;
            }
        } else if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            height2 = rect.height();
            floatValue = fArr[0].floatValue();
        } else {
            height = rect.height();
            floatValue = height;
            height2 = 0.08f;
        }
        float f10 = floatValue * height2;
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            int i10 = rect.left;
            float f11 = rect.bottom;
            float f12 = f10 * 2.0f;
            u7.set(i10, f11 - f12, (rect.right * 2) - i10, f11);
            pathHolder.arcTo(u7, 90.0f, 90.0f);
            int i11 = rect.left;
            float f13 = rect.top;
            u7.set(i11, f13, (rect.right * 2) - i11, f12 + f13);
            pathHolder.arcTo(u7, 180.0f, 90.0f);
            pathHolder.close();
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            int i12 = rect.left;
            float f14 = rect.bottom;
            float f15 = f10 * 2.0f;
            u7.set(i12, f14 - f15, (rect.right * 2) - i12, f14);
            pathHolder2.arcTo(u7, 90.0f, 90.0f);
            int i13 = rect.left;
            float f16 = rect.top;
            u7.set(i13, f16, (rect.right * 2) - i13, f15 + f16);
            pathHolder2.arcTo(u7, 180.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static Path r() {
        return e.a.f29807a.d("BaseShapePathBuilder");
    }

    public static ArrayList<tg.b> s() {
        return e.a.f29807a.b("BaseShapePathBuilder");
    }

    public static Path t(lh.e eVar, Rect rect) {
        Path r4 = r();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        float f10 = 0.0f;
        float f11 = 270.0f;
        if (fArr != null && fArr.length >= 2) {
            Float f12 = fArr[0];
            if (f12 != null) {
                f10 = f12.floatValue() * 1.6666666f;
            }
            Float f13 = fArr[1];
            if (f13 != null) {
                f11 = f13.floatValue() * 1.6666666f;
            }
        }
        r4.moveTo(rect.centerX(), rect.centerY());
        u7.set(rect.left, rect.top, rect.right, rect.bottom);
        r4.arcTo(u7, f10, ((f11 - f10) + 360.0f) % 360.0f);
        r4.close();
        return r4;
    }

    public static RectF u() {
        return e.a.f29807a.f("BaseShapePathBuilder");
    }

    public static ArrayList v(lh.e eVar, Rect rect) {
        float height;
        float height2;
        float floatValue;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        float height3 = rect.height() * 0.5f;
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            height = Math.min(rect.width(), rect.height()) * 0.08333f;
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    height = Math.min(rect.width(), rect.height()) * fArr[0].floatValue();
                }
                if (fArr[1] != null) {
                    height2 = rect.height();
                    floatValue = fArr[1].floatValue();
                    height3 = height2 * floatValue;
                }
            }
        } else {
            height = rect.height() * 0.08333f;
            if (fArr != null && fArr.length >= 2) {
                if (fArr[0] != null) {
                    height = fArr[0].floatValue() * rect.height();
                }
                if (fArr[1] != null) {
                    height2 = rect.height();
                    floatValue = fArr[1].floatValue();
                    height3 = height2 * floatValue;
                }
            }
        }
        if ((height * 2.0f) + rect.top + height3 > rect.bottom) {
            height = (rect.height() - height3) / 2.0f;
        }
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            float f10 = rect.top;
            float f11 = height * 2.0f;
            u7.set(rect.left - (rect.width() / 2.0f), f10, (rect.right + rect.left) / 2.0f, f10 + f11);
            pathHolder.arcTo(u7, 270.0f, 90.0f);
            u7.set((rect.left + i12) / 2.0f, (rect.top + height3) - f11, (rect.width() / 2.0f) + rect.right, rect.top + height3);
            pathHolder.arcTo(u7, 180.0f, -90.0f);
            u7.set((rect.left + i13) / 2.0f, rect.top + height3, (rect.width() / 2.0f) + rect.right, rect.top + height3 + f11);
            pathHolder.arcTo(u7, 270.0f, -90.0f);
            float f12 = rect.bottom;
            u7.set(rect.left - (rect.width() / 2.0f), f12 - f11, (rect.right + rect.left) / 2.0f, f12);
            pathHolder.arcTo(u7, 0.0f, 90.0f);
            pathHolder.close();
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            float f13 = rect.top;
            float f14 = height * 2.0f;
            u7.set(rect.left - (rect.width() / 2.0f), f13, (rect.right + rect.left) / 2.0f, f13 + f14);
            pathHolder2.arcTo(u7, 270.0f, 90.0f);
            u7.set((rect.left + i10) / 2.0f, (rect.top + height3) - f14, (rect.width() / 2.0f) + rect.right, rect.top + height3);
            pathHolder2.arcTo(u7, 180.0f, -90.0f);
            u7.set((rect.left + i11) / 2.0f, rect.top + height3, (rect.width() / 2.0f) + rect.right, rect.top + height3 + f14);
            pathHolder2.arcTo(u7, 270.0f, -90.0f);
            float f15 = rect.bottom;
            u7.set(rect.left - (rect.width() / 2.0f), f15 - f14, (rect.right + rect.left) / 2.0f, f15);
            pathHolder2.arcTo(u7, 0.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static ArrayList w(lh.e eVar, Rect rect) {
        int height;
        float height2;
        float floatValue;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
                height2 = Math.min(rect.width(), rect.height());
                floatValue = fArr[0].floatValue();
            } else {
                height = Math.min(rect.width(), rect.height());
                floatValue = height;
                height2 = 0.08f;
            }
        } else if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            height2 = rect.height();
            floatValue = fArr[0].floatValue();
        } else {
            height = rect.height();
            floatValue = height;
            height2 = 0.08f;
        }
        float f10 = floatValue * height2;
        b bVar = eVar.f20603d;
        if (bVar != null) {
            tg.b bVar2 = new tg.b();
            PathHolder pathHolder = new PathHolder();
            int i10 = rect.right;
            float f11 = rect.top;
            float f12 = f10 * 2.0f;
            u7.set((rect.left * 2) - i10, f11, i10, f11 + f12);
            pathHolder.arcTo(u7, 270.0f, 90.0f);
            int i11 = rect.right;
            float f13 = rect.bottom;
            u7.set((rect.left * 2) - i11, f13 - f12, i11, f13);
            pathHolder.arcTo(u7, 0.0f, 90.0f);
            pathHolder.close();
            bVar2.c(pathHolder);
            bVar2.f30011b = bVar;
            s4.add(bVar2);
        }
        if (eVar.p()) {
            tg.b bVar3 = new tg.b();
            PathHolder pathHolder2 = new PathHolder();
            int i12 = rect.right;
            float f14 = rect.top;
            float f15 = f10 * 2.0f;
            u7.set((rect.left * 2) - i12, f14, i12, f14 + f15);
            pathHolder2.arcTo(u7, 270.0f, 90.0f);
            int i13 = rect.right;
            float f16 = rect.bottom;
            u7.set((rect.left * 2) - i13, f16 - f15, i13, f16);
            pathHolder2.arcTo(u7, 0.0f, 90.0f);
            bVar3.c(pathHolder2);
            bVar3.b(eVar.f20610k);
            s4.add(bVar3);
        }
        return s4;
    }

    public static ArrayList x(lh.e eVar, Rect rect) {
        float height;
        float floatValue;
        ArrayList<tg.b> s4 = s();
        RectF u7 = u();
        float height2 = rect.height() * 0.04653f * 2.0f;
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (eVar.f20617o) {
                if (fArr[0] != null) {
                    height = rect.height();
                    floatValue = fArr[0].floatValue();
                    height2 = floatValue * height * 2.0f;
                }
            } else if (fArr[0] != null) {
                height = rect.height();
                floatValue = fArr[0].floatValue() - 0.77f;
                height2 = floatValue * height * 2.0f;
            }
        }
        b bVar = eVar.f20603d;
        tg.b bVar2 = new tg.b();
        PathHolder pathHolder = new PathHolder();
        u7.set(rect.left, rect.top, rect.right, rect.bottom);
        pathHolder.addOval(u7, Path.Direction.CW);
        bVar2.c(pathHolder);
        bVar2.b(eVar.f20610k);
        bVar2.f30011b = bVar;
        s4.add(bVar2);
        float height3 = (rect.bottom - (rect.height() / 4.0f)) - Math.abs(height2);
        float abs = Math.abs(height2) + (rect.bottom - (rect.height() / 4.0f));
        tg.b bVar3 = new tg.b();
        PathHolder pathHolder2 = new PathHolder();
        u7.set((rect.width() / 4.0f) + rect.left, height3, rect.right - (rect.width() / 4.0f), abs);
        if (height2 >= 0.0f) {
            pathHolder2.arcTo(u7, 15.0f, 150.0f);
        } else {
            pathHolder2.arcTo(u7, 195.0f, 150.0f);
        }
        bVar3.c(pathHolder2);
        bVar3.b(eVar.f20610k);
        bVar3.f30011b = bVar;
        s4.add(bVar3);
        if (bVar != null) {
            b bVar4 = new b();
            bVar4.c = (byte) 0;
            int i10 = bVar.f16571d;
            bVar4.f16571d = Color.rgb(b1.o(-0.2d, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.2d, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            bVar = bVar4;
        }
        float exactCenterX = rect.exactCenterX() - (rect.width() / 5.0f);
        float exactCenterX2 = rect.exactCenterX() - (rect.width() / 10.0f);
        float exactCenterY = rect.exactCenterY() - (rect.height() / 5.0f);
        float exactCenterY2 = rect.exactCenterY() - (rect.height() / 10.0f);
        tg.b bVar5 = new tg.b();
        PathHolder pathHolder3 = new PathHolder();
        u7.set(exactCenterX, exactCenterY, exactCenterX2, exactCenterY2);
        pathHolder3.addOval(u7, Path.Direction.CW);
        bVar5.c(pathHolder3);
        bVar5.b(eVar.f20610k);
        bVar5.f30011b = bVar;
        s4.add(bVar5);
        float width = (rect.width() / 10.0f) + rect.exactCenterX();
        float width2 = (rect.width() / 5.0f) + rect.exactCenterX();
        tg.b bVar6 = new tg.b();
        PathHolder pathHolder4 = new PathHolder();
        u7.set(width, exactCenterY, width2, exactCenterY2);
        pathHolder4.addOval(u7, Path.Direction.CW);
        bVar6.c(pathHolder4);
        bVar6.b(eVar.f20610k);
        bVar6.f30011b = bVar;
        s4.add(bVar6);
        return s4;
    }

    public static Path y(lh.e eVar, Rect rect) {
        float width;
        float height;
        Path r4 = r();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = fArr[0].floatValue() * rect.width();
                height = fArr[0].floatValue() * rect.height();
            } else {
                width = 0.0f;
                height = 0.0f;
            }
        } else {
            width = rect.width() * 0.25f;
            height = rect.height() * 0.25f;
        }
        u7.set(rect.left + width, rect.top + height, rect.right - width, rect.bottom - height);
        r4.addOval(u7, Path.Direction.CW);
        r4.moveTo(rect.centerX(), rect.top);
        float f10 = height * 0.75f;
        r4.lineTo((rect.width() / 14) + rect.centerX(), rect.top + f10);
        r4.lineTo(rect.centerX() - (rect.width() / 14), rect.top + f10);
        r4.close();
        r4.moveTo(rect.centerX(), rect.bottom);
        r4.lineTo(rect.centerX() - (rect.width() / 14), rect.bottom - f10);
        r4.lineTo((rect.width() / 14) + rect.centerX(), rect.bottom - f10);
        r4.close();
        r4.moveTo(rect.left, rect.centerY());
        float f11 = width * 0.75f;
        r4.lineTo(rect.left + f11, rect.centerY() - (rect.height() / 14));
        r4.lineTo(rect.left + f11, (rect.height() / 14) + rect.centerY());
        r4.close();
        r4.moveTo(rect.right, rect.centerY());
        r4.lineTo(rect.right - f11, (rect.height() / 14) + rect.centerY());
        r4.lineTo(rect.right - f11, rect.centerY() - (rect.height() / 14));
        r4.close();
        float sqrt = ((float) (Math.sqrt(0.5d) * rect.width())) / 2.0f;
        float sqrt2 = ((float) (Math.sqrt(0.5d) * rect.height())) / 2.0f;
        float sqrt3 = ((float) (Math.sqrt(0.5d) * (rect.width() - (f11 * 2.0f)))) / 2.0f;
        float sqrt4 = ((float) (Math.sqrt(0.5d) * (rect.height() - (f10 * 2.0f)))) / 2.0f;
        float height2 = (rect.height() + rect.width()) / 28;
        float width2 = (float) ((rect.width() * height2) / Math.sqrt(Math.pow(rect.height(), 2.0d) + Math.pow(rect.width(), 2.0d)));
        float height3 = (float) ((height2 * rect.height()) / Math.sqrt(Math.pow(rect.height(), 2.0d) + Math.pow(rect.width(), 2.0d)));
        float f12 = sqrt3 + width2;
        float f13 = sqrt4 - height3;
        float f14 = sqrt3 - width2;
        float f15 = sqrt4 + height3;
        r4.moveTo(rect.centerX() + sqrt, rect.centerY() + sqrt2);
        r4.lineTo(rect.centerX() + f12, rect.centerY() + f13);
        r4.lineTo(rect.centerX() + f14, rect.centerY() + f15);
        r4.close();
        r4.moveTo(rect.centerX() - sqrt, rect.centerY() - sqrt2);
        r4.lineTo(rect.centerX() - f12, rect.centerY() - f13);
        r4.lineTo(rect.centerX() - f14, rect.centerY() - f15);
        r4.close();
        r4.moveTo(rect.centerX() + sqrt, rect.centerY() - sqrt2);
        r4.lineTo(rect.centerX() + f12, rect.centerY() - f13);
        r4.lineTo(rect.centerX() + f14, rect.centerY() - f15);
        r4.close();
        r4.moveTo(rect.centerX() - sqrt, rect.centerY() + sqrt2);
        r4.lineTo(rect.centerX() - f12, rect.centerY() + f13);
        r4.lineTo(rect.centerX() - f14, rect.centerY() + f15);
        r4.close();
        return r4;
    }

    public static Path z(lh.e eVar, Rect rect) {
        float width;
        float height;
        Path r4 = r();
        RectF u7 = u();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
            width = fArr[0].floatValue() * (rect.width() / 2.0f);
            height = fArr[0].floatValue() * (rect.height() / 2.0f);
        } else {
            width = rect.width() / 2.0f;
            height = rect.height() / 2.0f;
        }
        r4.moveTo(rect.right, rect.centerY());
        u7.set(rect.left, rect.top, rect.right, rect.bottom);
        r4.arcTo(u7, 0.0f, 270.0f);
        r4.quadTo((width / 2.0f) + rect.centerX(), rect.top, rect.centerX() + width, rect.centerY() - height);
        r4.quadTo(rect.right, rect.centerY() - (height / 2.0f), rect.right, rect.centerY());
        r4.close();
        return r4;
    }
}
