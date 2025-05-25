package wg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.r;
import lh.e;
import sg.e;

/* compiled from: EarlyArrowPathBuilder.java */
/* loaded from: classes.dex */
public final class a extends ea.a {
    public static Path C(e eVar, Rect rect) {
        int round;
        int round2;
        Path O = O();
        RectF Q = Q();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.width());
            } else {
                round = Math.round(rect.width() * 0.7f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.height());
            } else {
                round2 = Math.round(rect.height() * 0.125f);
            }
        } else {
            round = Math.round(rect.width() * 0.7f);
            round2 = Math.round(rect.height() * 0.125f);
        }
        float height = rect.height() * 0.57f;
        O.moveTo(rect.left, rect.bottom);
        O.lineTo(rect.left, rect.top + height);
        int i10 = rect.left;
        Q.set(i10, rect.top + round2, (rect.width() * 1.04f) + i10, (height - round2) + rect.top + height);
        O.arcTo(Q, 180.0f, 90.0f);
        O.lineTo(rect.left + round, rect.top + round2);
        O.lineTo(rect.left + round, rect.top);
        float f10 = height / 2.0f;
        O.lineTo(rect.right, rect.top + f10);
        O.lineTo(rect.left + round, rect.top + height);
        float f11 = height - (round2 * 2);
        float f12 = f11 / 2.0f;
        O.lineTo(rect.left + round, rect.top + f10 + f12);
        float height2 = f11 / rect.height();
        Q.set((rect.width() * height2) + rect.left, rect.top + f10 + f12, r.l(1.14f, height2, rect.width(), rect.left), ((rect.top + height) + height) - (f10 + f12));
        O.arcTo(Q, 270.0f, -90.0f);
        O.lineTo((rect.width() * height2) + rect.left, rect.bottom);
        O.close();
        return O;
    }

    public static Path D(e eVar, Rect rect) {
        float round;
        float round2;
        int round3;
        float f10;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = fArr[0].floatValue() * rect.width();
            } else {
                round = Math.round(rect.width() * 0.43f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = fArr[1].floatValue() * rect.width();
            } else {
                round2 = Math.round(rect.width() * 0.86f);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                f10 = fArr[2].floatValue() * rect.height();
                float width = rect.width() - round;
                float width2 = width - ((rect.width() - round2) * 2.0f);
                O.moveTo((rect.left + round2) - width2, rect.top + f10);
                O.lineTo(rect.left + round, rect.top + f10);
                O.lineTo(rect.right - (width / 2.0f), rect.top);
                O.lineTo(rect.right, rect.top + f10);
                O.lineTo(rect.left + round2, rect.top + f10);
                O.lineTo(rect.left + round2, rect.bottom);
                O.lineTo(rect.left, rect.bottom);
                float height = (rect.height() * width2) / rect.width();
                O.lineTo(rect.left, rect.bottom - height);
                O.lineTo((rect.left + round2) - (width - ((rect.width() - round2) * 2.0f)), rect.bottom - height);
                O.close();
                return O;
            }
            round3 = Math.round(rect.height() * 0.28f);
        } else {
            round = Math.round(rect.width() * 0.43f);
            round2 = Math.round(rect.width() * 0.86f);
            round3 = Math.round(rect.height() * 0.28f);
        }
        f10 = round3;
        float width3 = rect.width() - round;
        float width22 = width3 - ((rect.width() - round2) * 2.0f);
        O.moveTo((rect.left + round2) - width22, rect.top + f10);
        O.lineTo(rect.left + round, rect.top + f10);
        O.lineTo(rect.right - (width3 / 2.0f), rect.top);
        O.lineTo(rect.right, rect.top + f10);
        O.lineTo(rect.left + round2, rect.top + f10);
        O.lineTo(rect.left + round2, rect.bottom);
        O.lineTo(rect.left, rect.bottom);
        float height2 = (rect.height() * width22) / rect.width();
        O.lineTo(rect.left, rect.bottom - height2);
        O.lineTo((rect.left + round2) - (width3 - ((rect.width() - round2) * 2.0f)), rect.bottom - height2);
        O.close();
        return O;
    }

    public static Path E(e eVar, Rect rect) {
        float f10;
        Float f11;
        Float f12;
        Path O = O();
        RectF Q = Q();
        Float[] fArr = eVar.f20616n;
        float f13 = 0.25f;
        float f14 = 180.0f;
        float f15 = 0.0f;
        if (fArr != null && fArr.length >= 1) {
            Float f16 = fArr[0];
            if (f16 != null) {
                f14 = f16.floatValue() * 0.3295496f;
                if (f14 < 0.0f) {
                    f14 += 360.0f;
                }
            }
            if (fArr.length >= 2 && (f12 = fArr[1]) != null) {
                float floatValue = f12.floatValue() * 0.3295496f;
                if (floatValue < 0.0f) {
                    floatValue += 360.0f;
                }
                f15 = floatValue;
            }
            if (fArr.length >= 3 && (f11 = fArr[2]) != null) {
                f10 = f11.floatValue();
                f13 = 100;
                float f17 = f10 * f13;
                float f18 = 50;
                double d10 = f18;
                double d11 = (f14 * 3.141592653589793d) / 180.0d;
                O.moveTo((float) (Math.cos(d11) * d10), (float) (Math.sin(d11) * d10));
                float f19 = -f18;
                Q.set(f19, f19, f18, f18);
                float f20 = (f15 - f14) + 360.0f;
                O.arcTo(Q, f14, f20 % 360.0f);
                float f21 = 100 * 0.125f;
                double d12 = f18 + f21;
                double d13 = (f15 * 3.141592653589793d) / 180.0d;
                O.lineTo((float) (Math.cos(d13) * d12), (float) (d12 * Math.sin(d13)));
                double d14 = (f18 + f17) * 0.5f;
                double d15 = ((30.0f + f15) * 3.141592653589793d) / 180.0d;
                O.lineTo((float) (Math.cos(d15) * d14), (float) (Math.sin(d15) * d14));
                double d16 = f17 - f21;
                O.lineTo((float) (Math.cos(d13) * d16), (float) (Math.sin(d13) * d16));
                float f22 = -f17;
                Q.set(f22, f22, f17, f17);
                O.arcTo(Q, f15, (-f20) % 360.0f);
                O.close();
                Matrix matrix = new Matrix();
                matrix.postScale(rect.width() / 100.0f, rect.height() / 100.0f);
                O.transform(matrix);
                O.offset(rect.centerX(), rect.centerY());
                return O;
            }
        }
        f10 = 100;
        float f172 = f10 * f13;
        float f182 = 50;
        double d102 = f182;
        double d112 = (f14 * 3.141592653589793d) / 180.0d;
        O.moveTo((float) (Math.cos(d112) * d102), (float) (Math.sin(d112) * d102));
        float f192 = -f182;
        Q.set(f192, f192, f182, f182);
        float f202 = (f15 - f14) + 360.0f;
        O.arcTo(Q, f14, f202 % 360.0f);
        float f212 = 100 * 0.125f;
        double d122 = f182 + f212;
        double d132 = (f15 * 3.141592653589793d) / 180.0d;
        O.lineTo((float) (Math.cos(d132) * d122), (float) (d122 * Math.sin(d132)));
        double d142 = (f182 + f172) * 0.5f;
        double d152 = ((30.0f + f15) * 3.141592653589793d) / 180.0d;
        O.lineTo((float) (Math.cos(d152) * d142), (float) (Math.sin(d152) * d142));
        double d162 = f172 - f212;
        O.lineTo((float) (Math.cos(d132) * d162), (float) (Math.sin(d132) * d162));
        float f222 = -f172;
        Q.set(f222, f222, f172, f172);
        O.arcTo(Q, f15, (-f202) % 360.0f);
        O.close();
        Matrix matrix2 = new Matrix();
        matrix2.postScale(rect.width() / 100.0f, rect.height() / 100.0f);
        O.transform(matrix2);
        O.offset(rect.centerX(), rect.centerY());
        return O;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList F(lh.e r22, android.graphics.Rect r23) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a.F(lh.e, android.graphics.Rect):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList G(lh.e r22, android.graphics.Rect r23) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a.G(lh.e, android.graphics.Rect):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList H(lh.e r23, android.graphics.Rect r24) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a.H(lh.e, android.graphics.Rect):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList I(lh.e r22, android.graphics.Rect r23) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.a.I(lh.e, android.graphics.Rect):java.util.ArrayList");
    }

    public static Path J(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.height());
            } else {
                round = Math.round(rect.height() * 0.67f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.width());
            } else {
                round2 = Math.round(rect.width() * 0.25f);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                round3 = a0.a.c(fArr[2], rect.height());
            } else {
                round3 = Math.round(rect.height() * 0.83f);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                round4 = a0.a.c(fArr[3], rect.width());
            } else {
                round4 = Math.round(rect.width() * 0.375f);
            }
        } else {
            round = Math.round(rect.height() * 0.67f);
            round2 = Math.round(rect.width() * 0.25f);
            round3 = Math.round(rect.height() * 0.83f);
            round4 = Math.round(rect.width() * 0.375f);
        }
        O.moveTo(rect.left, rect.top + round);
        O.lineTo(rect.left, rect.top);
        O.lineTo(rect.right, rect.top);
        O.lineTo(rect.right, rect.top + round);
        O.lineTo(rect.right - round4, rect.top + round);
        O.lineTo(rect.right - round4, rect.top + round3);
        O.lineTo(rect.right - round2, rect.top + round3);
        O.lineTo(rect.centerX(), rect.bottom);
        O.lineTo(rect.left + round2, rect.top + round3);
        O.lineTo(rect.left + round4, rect.top + round3);
        O.lineTo(rect.left + round4, rect.top + round);
        O.close();
        return O;
    }

    public static Path K(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.width());
            } else {
                round = Math.round(rect.width() * 0.35f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.height());
            } else {
                round2 = Math.round(rect.height() * 0.25f);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                round3 = a0.a.c(fArr[2], rect.width());
            } else {
                round3 = Math.round(rect.width() * 0.13f);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                round4 = a0.a.c(fArr[3], rect.height());
            } else {
                round4 = Math.round(rect.height() * 0.375f);
            }
        } else {
            round = Math.round(rect.width() * 0.35f);
            round2 = Math.round(rect.height() * 0.25f);
            round3 = Math.round(rect.width() * 0.13f);
            round4 = Math.round(rect.height() * 0.375f);
        }
        O.moveTo(rect.left + round, rect.bottom - round4);
        O.lineTo(rect.left + round3, rect.bottom - round4);
        O.lineTo(rect.left + round3, rect.bottom - round2);
        O.lineTo(rect.left, rect.centerY());
        O.lineTo(rect.left + round3, rect.top + round2);
        O.lineTo(rect.left + round3, rect.top + round4);
        O.lineTo(rect.left + round, rect.top + round4);
        O.lineTo(rect.left + round, rect.top);
        O.lineTo(rect.right - round, rect.top);
        O.lineTo(rect.right - round, rect.top + round4);
        O.lineTo(rect.right - round3, rect.top + round4);
        O.lineTo(rect.right - round3, rect.top + round2);
        O.lineTo(rect.right, rect.centerY());
        O.lineTo(rect.right - round3, rect.bottom - round2);
        O.lineTo(rect.right - round3, rect.bottom - round4);
        O.lineTo(rect.right - round, rect.bottom - round4);
        O.lineTo(rect.right - round, rect.bottom);
        O.lineTo(rect.left + round, rect.bottom);
        O.close();
        return O;
    }

    public static Path L(e eVar, Rect rect) {
        int round;
        int round2;
        int i10;
        int round3;
        int i11;
        int i12;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                i10 = Math.round((((0.5f - fArr[0].floatValue()) * rect.height()) * 10.0f) / 7.0f);
                round2 = a0.a.c(fArr[0], rect.width());
            } else {
                int round4 = Math.round(((rect.height() * 0.2f) * 10.0f) / 7.0f);
                round2 = Math.round(rect.width() * 0.3f);
                i10 = round4;
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                i12 = Math.round((((0.5f - fArr[1].floatValue()) * rect.height()) * 10.0f) / 7.0f);
                i11 = a0.a.c(fArr[1], rect.width());
            } else {
                int round5 = Math.round(((rect.height() * 0.1f) * 10.0f) / 7.0f);
                i11 = Math.round(rect.width() * 0.4f);
                i12 = round5;
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                round = Math.round(fArr[2].floatValue() * rect.width() * 0.7f);
                round3 = a0.a.c(fArr[2], rect.height());
            } else {
                round = Math.round(rect.width() * 0.2f * 0.7f);
                round3 = Math.round(rect.height() * 0.2f);
            }
        } else {
            int round6 = Math.round(((rect.height() * 0.2f) * 10.0f) / 7.0f);
            int round7 = Math.round(((rect.height() * 0.1f) * 10.0f) / 7.0f);
            round = Math.round(rect.width() * 0.3f * 0.7f);
            round2 = Math.round(rect.width() * 0.3f);
            int round8 = Math.round(rect.width() * 0.4f);
            i10 = round6;
            round3 = Math.round(rect.height() * 0.2f);
            i11 = round8;
            i12 = round7;
        }
        O.moveTo(rect.left + round, (rect.bottom - i10) + i12);
        O.lineTo(rect.left + round, rect.bottom);
        O.lineTo(rect.left, rect.bottom - i10);
        int i13 = i10 * 2;
        O.lineTo(rect.left + round, rect.bottom - i13);
        O.lineTo(rect.left + round, (rect.bottom - i10) - i12);
        O.lineTo(rect.left + i11, (rect.bottom - i10) - i12);
        O.lineTo(rect.left + i11, rect.top + round3);
        O.lineTo(rect.left + round2, rect.top + round3);
        O.lineTo(rect.centerX(), rect.top);
        O.lineTo(rect.right - round2, rect.top + round3);
        O.lineTo(rect.right - i11, rect.top + round3);
        O.lineTo(rect.right - i11, (rect.bottom - i10) - i12);
        O.lineTo(rect.right - round, (rect.bottom - i10) - i12);
        O.lineTo(rect.right - round, rect.bottom - i13);
        O.lineTo(rect.right, rect.bottom - i10);
        O.lineTo(rect.right - round, rect.bottom);
        O.lineTo(rect.right - round, (rect.bottom - i10) + i12);
        O.close();
        return O;
    }

    public static Path M(e eVar, Rect rect) {
        float round;
        float height;
        float round2;
        float height2;
        float round3;
        float width;
        float height3;
        float height4;
        float width2;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        float f10 = 0.28f;
        float f11 = 0.86f;
        float f12 = 0.43f;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = fArr[0].floatValue() * rect.width();
                f12 = rect.height();
                height3 = fArr[0].floatValue();
            } else {
                round = Math.round(rect.width() * 0.43f);
                height3 = rect.height();
            }
            height2 = height3 * f12;
            if (fArr.length >= 2 && fArr[1] != null) {
                round3 = fArr[1].floatValue() * rect.width();
                f11 = rect.height();
                height4 = fArr[1].floatValue();
            } else {
                round3 = Math.round(rect.width() * 0.86f);
                height4 = rect.height();
            }
            height = height4 * f11;
            if (fArr.length >= 3 && fArr[2] != null) {
                round2 = fArr[2].floatValue() * rect.height();
                f10 = rect.width();
                width2 = fArr[2].floatValue();
            } else {
                round2 = Math.round(rect.height() * 0.28f);
                width2 = rect.width();
            }
            width = width2 * f10;
        } else {
            round = Math.round(rect.width() * 0.43f);
            height = rect.height() * 0.86f;
            round2 = Math.round(rect.height() * 0.28f);
            height2 = 0.43f * rect.height();
            round3 = Math.round(rect.width() * 0.86f);
            width = 0.28f * rect.width();
        }
        float height5 = rect.height() - height2;
        float height6 = height5 - ((rect.height() - height) * 2.0f);
        O.moveTo(rect.left + width, rect.top + height);
        O.lineTo(rect.left + width, rect.bottom);
        O.lineTo(rect.left, rect.bottom - (height5 / 2.0f));
        O.lineTo(rect.left + width, rect.top + height2);
        O.lineTo(rect.left + width, (rect.top + height) - height6);
        float width3 = rect.width() - round;
        O.lineTo((rect.left + round3) - (width3 - ((rect.width() - round3) * 2.0f)), (rect.top + height) - height6);
        O.lineTo((rect.left + round3) - (width3 - ((rect.width() - round3) * 2.0f)), rect.top + round2);
        O.lineTo(rect.left + round, rect.top + round2);
        O.lineTo(rect.right - (width3 / 2.0f), rect.top);
        O.lineTo(rect.right, rect.top + round2);
        O.lineTo(rect.left + round3, rect.top + round2);
        O.lineTo(rect.left + round3, rect.top + height);
        O.close();
        return O;
    }

    public static Path N(e eVar, Rect rect) {
        int round;
        int round2;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.width());
            } else {
                round = Math.round(rect.width() * 0.75f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.height());
            } else {
                round2 = Math.round(rect.height() * 0.25f);
            }
        } else {
            round = Math.round(rect.width() * 0.75f);
            round2 = Math.round(rect.height() * 0.25f);
        }
        O.moveTo(rect.left, rect.bottom - round2);
        O.lineTo((((rect.width() - round) * (rect.height() - (round2 * 2))) / rect.height()) + rect.left, rect.centerY());
        O.lineTo(rect.left, rect.top + round2);
        O.lineTo(rect.left + round, rect.top + round2);
        O.lineTo(rect.left + round, rect.top);
        O.lineTo(rect.right, rect.centerY());
        O.lineTo(rect.left + round, rect.bottom);
        O.lineTo(rect.left + round, rect.bottom - round2);
        O.close();
        return O;
    }

    public static Path O() {
        return e.a.f29807a.d("EarlyArrowPathBuilder");
    }

    public static Path P(lh.e eVar, Rect rect) {
        int i10;
        int round;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                i10 = a0.a.c(fArr[0], rect.width());
                i16 = a0.a.c(fArr[0], rect.height());
            } else {
                int round2 = Math.round(rect.width() * 0.25f);
                i16 = Math.round(rect.height() * 0.25f);
                i10 = round2;
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                i15 = a0.a.c(fArr[1], rect.height());
                i14 = a0.a.c(fArr[1], rect.width());
            } else {
                int round3 = Math.round(rect.height() * 0.375f);
                i14 = Math.round(rect.width() * 0.375f);
                i15 = round3;
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                i13 = a0.a.c(fArr[2], rect.width());
                i12 = a0.a.c(fArr[2], rect.height());
            } else {
                int round4 = Math.round(rect.width() * 0.125f);
                i12 = Math.round(rect.height() * 0.125f);
                i13 = round4;
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                i11 = a0.a.c(fArr[3], rect.height());
                round = a0.a.c(fArr[3], rect.width());
            } else {
                i11 = Math.round(rect.height() * 0.45f);
                round = Math.round(rect.width() * 0.45f);
            }
        } else {
            int round5 = Math.round(rect.width() * 0.25f);
            int round6 = Math.round(rect.height() * 0.375f);
            int round7 = Math.round(rect.width() * 0.125f);
            int round8 = Math.round(rect.height() * 0.45f);
            int round9 = Math.round(rect.height() * 0.25f);
            int round10 = Math.round(rect.width() * 0.375f);
            int round11 = Math.round(rect.height() * 0.125f);
            i10 = round5;
            round = Math.round(rect.width() * 0.45f);
            i11 = round8;
            i12 = round11;
            i13 = round7;
            i14 = round10;
            i15 = round6;
            i16 = round9;
        }
        O.moveTo(rect.left + i10, rect.bottom - i11);
        O.lineTo(rect.left + i13, rect.bottom - i11);
        O.lineTo(rect.left + i13, rect.bottom - i15);
        O.lineTo(rect.left, rect.centerY());
        O.lineTo(rect.left + i13, rect.top + i15);
        O.lineTo(rect.left + i13, rect.top + i11);
        O.lineTo(rect.left + i10, rect.top + i11);
        O.lineTo(rect.left + i10, rect.top + i16);
        O.lineTo(rect.left + round, rect.top + i16);
        O.lineTo(rect.left + round, rect.top + i12);
        O.lineTo(rect.left + i14, rect.top + i12);
        O.lineTo(rect.centerX(), rect.top);
        O.lineTo(rect.right - i14, rect.top + i12);
        O.lineTo(rect.right - round, rect.top + i12);
        O.lineTo(rect.right - round, rect.top + i16);
        O.lineTo(rect.right - i10, rect.top + i16);
        O.lineTo(rect.right - i10, rect.top + i11);
        O.lineTo(rect.right - i13, rect.top + i11);
        O.lineTo(rect.right - i13, rect.top + i15);
        O.lineTo(rect.right, rect.centerY());
        O.lineTo(rect.right - i13, rect.bottom - i15);
        O.lineTo(rect.right - i13, rect.bottom - i11);
        O.lineTo(rect.right - i10, rect.bottom - i11);
        O.lineTo(rect.right - i10, rect.bottom - i16);
        O.lineTo(rect.right - round, rect.bottom - i16);
        O.lineTo(rect.right - round, rect.bottom - i12);
        O.lineTo(rect.right - i14, rect.bottom - i12);
        O.lineTo(rect.centerX(), rect.bottom);
        O.lineTo(rect.left + i14, rect.bottom - i12);
        O.lineTo(rect.left + round, rect.bottom - i12);
        O.lineTo(rect.left + round, rect.bottom - i16);
        O.lineTo(rect.left + i10, rect.bottom - i16);
        O.close();
        return O;
    }

    public static RectF Q() {
        return e.a.f29807a.f("EarlyArrowPathBuilder");
    }

    public static Path R(lh.e eVar, Rect rect) {
        int round;
        int round2;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.width());
            } else {
                round = Math.round(rect.width() * 0.75f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.height());
            } else {
                round2 = Math.round(rect.height() * 0.25f);
            }
        } else {
            round = Math.round(rect.width() * 0.75f);
            round2 = Math.round(rect.height() * 0.25f);
        }
        int i10 = round;
        float width = rect.width() * 0.03f;
        int i11 = rect.left;
        O.addRect(i11, rect.top + round2, i11 + width, rect.bottom - round2, Path.Direction.CW);
        int i12 = rect.left;
        O.addRect(i12 + (2.0f * width), rect.top + round2, (4.0f * width) + i12, rect.bottom - round2, Path.Direction.CW);
        float f10 = width * 5.0f;
        O.moveTo(rect.left + f10, rect.top + round2);
        O.lineTo(rect.left + i10, rect.top + round2);
        O.lineTo(rect.left + i10, rect.top);
        O.lineTo(rect.right, rect.centerY());
        O.lineTo(rect.left + i10, rect.bottom);
        O.lineTo(rect.left + i10, rect.bottom - round2);
        O.lineTo(rect.left + f10, rect.bottom - round2);
        O.close();
        return O;
    }

    public static Path S(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.height());
            } else {
                round = Math.round(rect.height() * 0.33f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.width());
            } else {
                round2 = Math.round(rect.width() * 0.25f);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                round3 = a0.a.c(fArr[2], rect.height());
            } else {
                round3 = Math.round(rect.height() * 0.17f);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                round4 = a0.a.c(fArr[3], rect.width());
            } else {
                round4 = Math.round(rect.width() * 0.375f);
            }
        } else {
            round = Math.round(rect.height() * 0.33f);
            round2 = Math.round(rect.width() * 0.25f);
            round3 = Math.round(rect.height() * 0.17f);
            round4 = Math.round(rect.width() * 0.375f);
        }
        O.moveTo(rect.left, rect.bottom);
        O.lineTo(rect.left, rect.top + round);
        O.lineTo(rect.left + round4, rect.top + round);
        O.lineTo(rect.left + round4, rect.top + round3);
        O.lineTo(rect.left + round2, rect.top + round3);
        O.lineTo(rect.centerX(), rect.top);
        O.lineTo(rect.right - round2, rect.top + round3);
        O.lineTo(rect.right - round4, rect.top + round3);
        O.lineTo(rect.right - round4, rect.top + round);
        O.lineTo(rect.right, rect.top + round);
        O.lineTo(rect.right, rect.bottom);
        O.close();
        return O;
    }

    public static Path T(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path O = O();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                round = a0.a.c(fArr[0], rect.height());
            } else {
                round = Math.round(rect.height() * 0.25f);
            }
            if (fArr.length >= 2 && fArr[1] != null) {
                round2 = a0.a.c(fArr[1], rect.width());
            } else {
                round2 = Math.round(rect.width() * 0.25f);
            }
            if (fArr.length >= 3 && fArr[2] != null) {
                round3 = a0.a.c(fArr[2], rect.height());
            } else {
                round3 = Math.round(rect.height() * 0.125f);
            }
            if (fArr.length >= 4 && fArr[3] != null) {
                round4 = a0.a.c(fArr[3], rect.width());
            } else {
                round4 = Math.round(rect.width() * 0.375f);
            }
        } else {
            round = Math.round(rect.height() * 0.25f);
            round2 = Math.round(rect.width() * 0.25f);
            round3 = Math.round(rect.height() * 0.125f);
            round4 = Math.round(rect.width() * 0.375f);
        }
        O.moveTo(rect.left, rect.top + round);
        O.lineTo(rect.left + round4, rect.top + round);
        O.lineTo(rect.left + round4, rect.top + round3);
        O.lineTo(rect.left + round2, rect.top + round3);
        O.lineTo(rect.centerX(), rect.top);
        O.lineTo(rect.right - round2, rect.top + round3);
        O.lineTo(rect.right - round4, rect.top + round3);
        O.lineTo(rect.right - round4, rect.top + round);
        O.lineTo(rect.right, rect.top + round);
        O.lineTo(rect.right, rect.bottom - round);
        O.lineTo(rect.right - round4, rect.bottom - round);
        O.lineTo(rect.right - round4, rect.bottom - round3);
        O.lineTo(rect.right - round2, rect.bottom - round3);
        O.lineTo(rect.centerX(), rect.bottom);
        O.lineTo(rect.left + round2, rect.bottom - round3);
        O.lineTo(rect.left + round4, rect.bottom - round3);
        O.lineTo(rect.left + round4, rect.bottom - round);
        O.lineTo(rect.left, rect.bottom - round);
        O.close();
        return O;
    }
}
