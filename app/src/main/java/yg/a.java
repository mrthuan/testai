package yg;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import gh.b;
import lh.e;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.system.f;
import sg.e;

/* compiled from: FlowChartDrawing.java */
/* loaded from: classes.dex */
public final class a {
    public static void a(Canvas canvas, f fVar, int i10, e eVar, Rect rect, float f10) {
        int i11 = eVar.f20615m;
        if (i11 == 176) {
            Path c = c();
            RectF d10 = d();
            float min = Math.min(rect.width(), rect.height()) * 0.18f;
            c.reset();
            d10.set(rect.left, rect.top, rect.right, rect.bottom);
            c.addRoundRect(d10, new float[]{min, min, min, min, min, min, min, min}, Path.Direction.CW);
            tg.a.b(canvas, fVar, i10, eVar, c, rect, f10);
        } else if (i11 != 177) {
            switch (i11) {
                case 109:
                    Path c10 = c();
                    c10.reset();
                    c10.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    tg.a.b(canvas, fVar, i10, eVar, c10, rect, f10);
                    return;
                case 110:
                    Path c11 = c();
                    c11.reset();
                    c11.moveTo(rect.exactCenterX(), rect.top);
                    c11.lineTo(rect.right, rect.exactCenterY());
                    c11.lineTo(rect.exactCenterX(), rect.bottom);
                    c11.lineTo(rect.left, rect.exactCenterY());
                    c11.close();
                    tg.a.b(canvas, fVar, i10, eVar, c11, rect, f10);
                    return;
                case 111:
                    Path c12 = c();
                    float width = rect.width() * 0.2f;
                    c12.reset();
                    c12.moveTo(rect.left + width, rect.top);
                    c12.lineTo(rect.right, rect.top);
                    c12.lineTo(rect.right - width, rect.bottom);
                    c12.lineTo(rect.left, rect.bottom);
                    c12.close();
                    tg.a.b(canvas, fVar, i10, eVar, c12, rect, f10);
                    return;
                case 112:
                    Path c13 = c();
                    float width2 = rect.width() * 0.125f;
                    c13.reset();
                    c13.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    c13.moveTo(rect.left + width2, rect.top);
                    c13.lineTo(rect.left + width2, rect.bottom);
                    c13.moveTo(rect.right - width2, rect.top);
                    c13.lineTo(rect.right - width2, rect.bottom);
                    tg.a.b(canvas, fVar, i10, eVar, c13, rect, f10);
                    return;
                case 113:
                    Path c14 = c();
                    float width3 = rect.width() * 0.125f;
                    float height = rect.height() * 0.125f;
                    c14.reset();
                    c14.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                    c14.moveTo(rect.left + width3, rect.top);
                    c14.lineTo(rect.left + width3, rect.bottom);
                    c14.moveTo(rect.left, rect.top + height);
                    c14.lineTo(rect.right, rect.top + height);
                    tg.a.b(canvas, fVar, i10, eVar, c14, rect, f10);
                    return;
                case 114:
                    b(canvas, fVar, i10, eVar, rect, f10);
                    return;
                case 115:
                    Rect e10 = e.a.f29807a.e("FlowChartDrawing");
                    int width4 = (int) (rect.width() * 0.137d);
                    int height2 = (int) (rect.height() * 0.167d);
                    e10.set(rect.left + width4, rect.top, rect.right, rect.bottom - height2);
                    b(canvas, fVar, i10, eVar, e10, f10);
                    int i12 = width4 / 2;
                    int i13 = height2 / 2;
                    e10.set(rect.left + i12, rect.top + i13, rect.right - i12, rect.bottom - i13);
                    b(canvas, fVar, i10, eVar, e10, f10);
                    e10.set(rect.left, rect.top + height2, rect.right - width4, rect.bottom);
                    b(canvas, fVar, i10, eVar, e10, f10);
                    return;
                case 116:
                    Path c15 = c();
                    RectF d11 = d();
                    float width5 = rect.width() * 0.16f;
                    float height3 = rect.height() * 0.5f;
                    c15.reset();
                    d11.set(rect.left, rect.top, rect.right, rect.bottom);
                    c15.addRoundRect(d11, new float[]{width5, height3, width5, height3, width5, height3, width5, height3}, Path.Direction.CW);
                    tg.a.b(canvas, fVar, i10, eVar, c15, rect, f10);
                    return;
                case 117:
                    Path c16 = c();
                    float width6 = rect.width() * 0.2f;
                    c16.reset();
                    c16.moveTo(rect.left + width6, rect.top);
                    c16.lineTo(rect.right - width6, rect.top);
                    c16.lineTo(rect.right, rect.exactCenterY());
                    c16.lineTo(rect.right - width6, rect.bottom);
                    c16.lineTo(rect.left + width6, rect.bottom);
                    c16.lineTo(rect.left, rect.exactCenterY());
                    c16.close();
                    tg.a.b(canvas, fVar, i10, eVar, c16, rect, f10);
                    return;
                case 118:
                    Path c17 = c();
                    c17.reset();
                    c17.moveTo(rect.left, rect.top + (rect.height() * 0.2f));
                    c17.lineTo(rect.right, rect.top);
                    c17.lineTo(rect.right, rect.bottom);
                    c17.lineTo(rect.left, rect.bottom);
                    c17.close();
                    tg.a.b(canvas, fVar, i10, eVar, c17, rect, f10);
                    return;
                case 119:
                    Path c18 = c();
                    float width7 = rect.width() * 0.2f;
                    c18.reset();
                    c18.moveTo(rect.left, rect.top);
                    c18.lineTo(rect.right, rect.top);
                    c18.lineTo(rect.right - width7, rect.bottom);
                    c18.lineTo(rect.left + width7, rect.bottom);
                    c18.close();
                    tg.a.b(canvas, fVar, i10, eVar, c18, rect, f10);
                    return;
                case 120:
                    Path c19 = c();
                    RectF d12 = d();
                    c19.reset();
                    d12.set(rect.left, rect.top, rect.right, rect.bottom);
                    c19.addOval(d12, Path.Direction.CW);
                    tg.a.b(canvas, fVar, i10, eVar, c19, rect, f10);
                    return;
                case 121:
                    Path c20 = c();
                    c20.reset();
                    c20.moveTo(rect.left + (rect.width() * 0.2f), rect.top);
                    c20.lineTo(rect.right, rect.top);
                    c20.lineTo(rect.right, rect.bottom);
                    c20.lineTo(rect.left, rect.bottom);
                    c20.lineTo(rect.left, rect.top + (rect.height() * 0.2f));
                    c20.close();
                    tg.a.b(canvas, fVar, i10, eVar, c20, rect, f10);
                    return;
                case 122:
                    Path c21 = c();
                    RectF d13 = d();
                    c21.reset();
                    float height4 = rect.height() * 0.1f * 2.0f;
                    d13.set(rect.left, rect.top, rect.exactCenterX(), rect.top + height4);
                    c21.arcTo(d13, 180.0f, -180.0f);
                    float exactCenterX = rect.exactCenterX();
                    float f11 = rect.top;
                    d13.set(exactCenterX, f11, rect.right, f11 + height4);
                    c21.arcTo(d13, 180.0f, 180.0f);
                    float exactCenterX2 = rect.exactCenterX();
                    float f12 = rect.bottom;
                    d13.set(exactCenterX2, f12 - height4, rect.right, f12);
                    c21.arcTo(d13, 0.0f, -180.0f);
                    d13.set(rect.left, rect.bottom - height4, rect.exactCenterX(), rect.bottom);
                    c21.arcTo(d13, 0.0f, 180.0f);
                    c21.close();
                    tg.a.b(canvas, fVar, i10, eVar, c21, rect, f10);
                    return;
                case 123:
                    Path c22 = c();
                    RectF d14 = d();
                    float sqrt = (((float) Math.sqrt(2.0d)) * rect.width()) / 4.0f;
                    float sqrt2 = (((float) Math.sqrt(2.0d)) * rect.height()) / 4.0f;
                    float exactCenterX3 = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    c22.reset();
                    d14.set(rect.left, rect.top, rect.right, rect.bottom);
                    c22.addOval(d14, Path.Direction.CW);
                    float f13 = exactCenterX3 - sqrt;
                    float f14 = exactCenterY - sqrt2;
                    c22.moveTo(f13, f14);
                    float f15 = exactCenterX3 + sqrt;
                    float f16 = exactCenterY + sqrt2;
                    c22.lineTo(f15, f16);
                    c22.moveTo(f15, f14);
                    c22.lineTo(f13, f16);
                    tg.a.b(canvas, fVar, i10, eVar, c22, rect, f10);
                    return;
                case 124:
                    Path c23 = c();
                    RectF d15 = d();
                    c23.reset();
                    d15.set(rect.left, rect.top, rect.right, rect.bottom);
                    c23.addOval(d15, Path.Direction.CW);
                    c23.moveTo(rect.exactCenterX(), rect.top);
                    c23.lineTo(rect.exactCenterX(), rect.bottom);
                    c23.moveTo(rect.left, rect.exactCenterY());
                    c23.lineTo(rect.right, rect.exactCenterY());
                    tg.a.b(canvas, fVar, i10, eVar, c23, rect, f10);
                    return;
                case 125:
                    Path c24 = c();
                    c24.reset();
                    c24.moveTo(rect.left, rect.top);
                    c24.lineTo(rect.right, rect.top);
                    c24.lineTo(rect.exactCenterX(), rect.exactCenterY());
                    c24.lineTo(rect.right, rect.bottom);
                    c24.lineTo(rect.left, rect.bottom);
                    c24.lineTo(rect.exactCenterX(), rect.exactCenterY());
                    c24.close();
                    tg.a.b(canvas, fVar, i10, eVar, c24, rect, f10);
                    return;
                case 126:
                    Path c25 = c();
                    c25.reset();
                    c25.moveTo(rect.exactCenterX(), rect.top);
                    c25.lineTo(rect.right, rect.exactCenterY());
                    c25.lineTo(rect.exactCenterX(), rect.bottom);
                    c25.lineTo(rect.left, rect.exactCenterY());
                    c25.close();
                    c25.moveTo(rect.left, rect.exactCenterY());
                    c25.lineTo(rect.right, rect.exactCenterY());
                    tg.a.b(canvas, fVar, i10, eVar, c25, rect, f10);
                    return;
                case ShapeTypes.VERTICAL_SCROLL /* 127 */:
                    Path c26 = c();
                    c26.reset();
                    c26.moveTo(rect.exactCenterX(), rect.top);
                    c26.lineTo(rect.right, rect.bottom);
                    c26.lineTo(rect.left, rect.bottom);
                    c26.close();
                    tg.a.b(canvas, fVar, i10, eVar, c26, rect, f10);
                    return;
                case 128:
                    Path c27 = c();
                    c27.reset();
                    c27.moveTo(rect.left, rect.top);
                    c27.lineTo(rect.right, rect.top);
                    c27.lineTo(rect.exactCenterX(), rect.bottom);
                    c27.close();
                    tg.a.b(canvas, fVar, i10, eVar, c27, rect, f10);
                    return;
                default:
                    switch (i11) {
                        case ShapeTypes.DOUBLE_WAVE /* 130 */:
                            Path c28 = c();
                            RectF d16 = d();
                            float width8 = rect.width() * 0.16f;
                            c28.reset();
                            float f17 = rect.right;
                            d16.set(f17 - width8, rect.top, f17 + width8, rect.bottom);
                            c28.arcTo(d16, 90.0f, 180.0f);
                            float f18 = rect.left;
                            d16.set(f18, rect.top, (width8 * 2.0f) + f18, rect.bottom);
                            c28.arcTo(d16, 270.0f, -180.0f);
                            c28.close();
                            tg.a.b(canvas, fVar, i10, eVar, c28, rect, f10);
                            return;
                        case ShapeTypes.PLUS /* 131 */:
                            Path c29 = c();
                            RectF d17 = d();
                            float width9 = rect.width() * 0.15f;
                            float height5 = rect.height() * 0.15f;
                            c29.reset();
                            d17.set(rect.left, rect.top, rect.right, rect.bottom);
                            c29.addOval(d17, Path.Direction.CW);
                            tg.a.b(canvas, fVar, i10, eVar, c29, rect, f10);
                            boolean p10 = eVar.p();
                            c29.reset();
                            c29.moveTo(rect.exactCenterX(), rect.bottom - height5);
                            c29.lineTo(rect.right, rect.bottom - height5);
                            c29.lineTo(rect.right, rect.bottom);
                            c29.moveTo(rect.exactCenterX(), rect.bottom);
                            c29.close();
                            tg.a.b(canvas, fVar, i10, eVar, c29, rect, f10);
                            if (p10 && eVar.f20610k == null) {
                                eVar.f20610k = new b();
                            }
                            c29.reset();
                            c29.moveTo(rect.right - width9, rect.bottom - height5);
                            c29.lineTo(rect.right, rect.bottom - height5);
                            c29.lineTo(rect.right, rect.bottom);
                            c29.lineTo(rect.exactCenterX(), rect.bottom);
                            tg.a.b(canvas, fVar, i10, eVar, c29, rect, f10);
                            return;
                        case ShapeTypes.FLOW_CHART_PROCESS /* 132 */:
                            Path c30 = c();
                            RectF d18 = d();
                            float height6 = rect.height() * 0.32f;
                            c30.reset();
                            float f19 = rect.top;
                            d18.set(rect.left, f19, rect.right, f19 + height6);
                            c30.addOval(d18, Path.Direction.CW);
                            float f20 = rect.bottom;
                            d18.set(rect.left, f20 - height6, rect.right, f20);
                            c30.arcTo(d18, 0.0f, 180.0f);
                            float f21 = rect.top;
                            d18.set(rect.left, f21, rect.right, height6 + f21);
                            c30.arcTo(d18, 180.0f, -180.0f);
                            c30.close();
                            tg.a.b(canvas, fVar, i10, eVar, c30, rect, f10);
                            return;
                        case ShapeTypes.FLOW_CHART_DECISION /* 133 */:
                            Path c31 = c();
                            RectF d19 = d();
                            float width10 = rect.width() * 0.34f;
                            c31.reset();
                            float f22 = rect.right;
                            d19.set(f22 - width10, rect.top, f22, rect.bottom);
                            c31.addOval(d19, Path.Direction.CW);
                            c31.moveTo(rect.right - (width10 / 2.0f), rect.bottom);
                            float f23 = rect.right;
                            d19.set(f23 - width10, rect.top, f23, rect.bottom);
                            c31.arcTo(d19, 90.0f, 180.0f);
                            float f24 = rect.left;
                            d19.set(f24, rect.top, width10 + f24, rect.bottom);
                            c31.arcTo(d19, 270.0f, -180.0f);
                            c31.close();
                            tg.a.b(canvas, fVar, i10, eVar, c31, rect, f10);
                            return;
                        case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
                            Path c32 = c();
                            RectF d20 = d();
                            float width11 = rect.width() * 0.16f;
                            c32.reset();
                            c32.moveTo(rect.left, rect.exactCenterY());
                            c32.lineTo(rect.left + width11, rect.top);
                            float f25 = rect.right;
                            d20.set(f25 - (2.0f * width11), rect.top, f25, rect.bottom);
                            c32.arcTo(d20, 270.0f, 180.0f);
                            c32.lineTo(rect.left + width11, rect.bottom);
                            c32.close();
                            tg.a.b(canvas, fVar, i10, eVar, c32, rect, f10);
                            return;
                        case ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS /* 135 */:
                            Path c33 = c();
                            RectF d21 = d();
                            c33.reset();
                            c33.moveTo(rect.left, rect.top);
                            d21.set(rect.left, rect.top, rect.right, rect.bottom);
                            c33.arcTo(d21, 270.0f, 180.0f);
                            c33.lineTo(rect.left, rect.bottom);
                            c33.close();
                            tg.a.b(canvas, fVar, i10, eVar, c33, rect, f10);
                            return;
                        default:
                            return;
                    }
            }
        } else {
            Path c34 = c();
            float height7 = rect.height() * 0.2f;
            c34.reset();
            c34.moveTo(rect.left, rect.top);
            c34.lineTo(rect.right, rect.top);
            c34.lineTo(rect.right, rect.bottom - height7);
            c34.lineTo(rect.exactCenterX(), rect.bottom);
            c34.lineTo(rect.left, rect.bottom - height7);
            c34.close();
            tg.a.b(canvas, fVar, i10, eVar, c34, rect, f10);
        }
    }

    public static void b(Canvas canvas, f fVar, int i10, lh.e eVar, Rect rect, float f10) {
        Path c = c();
        RectF d10 = d();
        float height = rect.height() * 0.2f;
        c.reset();
        c.moveTo(rect.left, rect.top);
        c.lineTo(rect.right, rect.top);
        float width = rect.width() / 2.0f;
        float height2 = rect.height() * 0.07f * 2.0f;
        d10.set(rect.exactCenterX(), rect.bottom - height, width + rect.right, (rect.bottom + height) - height2);
        c.arcTo(d10, 270.0f, -90.0f);
        d10.set(rect.left, rect.bottom - height2, rect.exactCenterX(), rect.bottom);
        c.arcTo(d10, 0.0f, 180.0f);
        c.close();
        tg.a.b(canvas, fVar, i10, eVar, c, rect, f10);
    }

    public static Path c() {
        return e.a.f29807a.d("FlowChartDrawing");
    }

    public static RectF d() {
        return e.a.f29807a.f("FlowChartDrawing");
    }
}
