package wg;

import a0.d;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.f;
import java.util.ArrayList;
import lh.e;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import sg.e;

/* compiled from: LaterArrowPathBuilder.java */
/* loaded from: classes.dex */
public final class b {
    public static double a(double d10, double d11) {
        double acos = (Math.acos(d10 / Math.sqrt((d11 * d11) + (d10 * d10))) * 180.0d) / 3.141592653589793d;
        if (d11 < 0.0d) {
            return 360.0d - acos;
        }
        return acos;
    }

    public static Object b(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        int round5;
        int round6;
        int round7;
        int round8;
        int round9;
        int round10;
        int round11;
        int round12;
        int round13;
        int round14;
        int round15;
        int i10;
        int round16;
        int round17;
        int round18;
        int round19;
        int round20;
        int round21;
        int round22;
        int round23;
        int round24;
        int round25;
        int round26;
        int round27;
        int round28;
        int round29;
        int round30;
        int round31;
        int round32;
        n().reset();
        int i11 = eVar.f20615m;
        if (i11 != 13) {
            if (i11 != 15) {
                if (i11 != 55) {
                    if (i11 != 83) {
                        if (i11 != 99) {
                            if (i11 != 182) {
                                if (i11 != 93) {
                                    if (i11 != 94) {
                                        switch (i11) {
                                            case 66:
                                                Path n10 = n();
                                                Float[] fArr = eVar.f20616n;
                                                int height = rect.height() / 2;
                                                int min = Math.min(rect.width(), rect.height());
                                                if (fArr != null && fArr.length == 2) {
                                                    round5 = a0.a.c(fArr[0], height);
                                                    round6 = a0.a.c(fArr[1], min);
                                                } else {
                                                    round5 = Math.round(height * 0.5f);
                                                    round6 = Math.round(min * 0.5f);
                                                }
                                                n10.moveTo(rect.left, rect.centerY());
                                                n10.lineTo(rect.left + round6, rect.top);
                                                n10.lineTo(rect.left + round6, rect.centerY() - round5);
                                                n10.lineTo(rect.right, rect.centerY() - round5);
                                                n10.lineTo(rect.right, rect.centerY() + round5);
                                                n10.lineTo(rect.left + round6, rect.centerY() + round5);
                                                n10.lineTo(rect.left + round6, rect.bottom);
                                                n10.close();
                                                return n10;
                                            case 67:
                                                Path n11 = n();
                                                Float[] fArr2 = eVar.f20616n;
                                                int width = rect.width() / 2;
                                                int min2 = Math.min(rect.width(), rect.height());
                                                if (fArr2 != null && fArr2.length == 2) {
                                                    round7 = a0.a.c(fArr2[0], width);
                                                    round8 = a0.a.c(fArr2[1], min2);
                                                } else {
                                                    round7 = Math.round(width * 0.5f);
                                                    round8 = Math.round(min2 * 0.5f);
                                                }
                                                n11.moveTo(rect.centerX() - round7, rect.top);
                                                n11.lineTo(d.a(n11, rect.centerX() + round7, rect.top, rect, round7), rect.bottom - round8);
                                                n11.lineTo(rect.right, rect.bottom - round8);
                                                n11.lineTo(rect.centerX(), rect.bottom);
                                                n11.lineTo(b.a.b(n11, rect.left, rect.bottom - round8, rect, round7), rect.bottom - round8);
                                                n11.close();
                                                return n11;
                                            case 68:
                                                Path n12 = n();
                                                Float[] fArr3 = eVar.f20616n;
                                                int width2 = rect.width() / 2;
                                                int min3 = Math.min(rect.width(), rect.height());
                                                if (fArr3 != null && fArr3.length == 2) {
                                                    round9 = a0.a.c(fArr3[0], width2);
                                                    round10 = a0.a.c(fArr3[1], min3);
                                                } else {
                                                    round9 = Math.round(width2 * 0.5f);
                                                    round10 = Math.round(min3 * 0.5f);
                                                }
                                                n12.moveTo(rect.centerX(), rect.top);
                                                n12.lineTo(b.a.b(n12, b.a.b(n12, d.a(n12, d.a(n12, rect.right, rect.top + round10, rect, round9), rect.top + round10, rect, round9), rect.bottom, rect, round9), rect.bottom, rect, round9), rect.top + round10);
                                                n12.lineTo(rect.left, rect.top + round10);
                                                n12.close();
                                                return n12;
                                            case 69:
                                                Path n13 = n();
                                                Float[] fArr4 = eVar.f20616n;
                                                int height2 = rect.height() / 2;
                                                int min4 = Math.min(rect.width(), rect.height());
                                                if (fArr4 != null && fArr4.length == 2) {
                                                    round11 = a0.a.c(fArr4[0], height2);
                                                    round12 = a0.a.c(fArr4[1], min4);
                                                    if (round12 * 2 > rect.width()) {
                                                        round12 = min4 * 2;
                                                    }
                                                } else {
                                                    round11 = Math.round(height2 * 0.5f);
                                                    round12 = Math.round(min4 * 0.5f);
                                                }
                                                n13.moveTo(rect.left, rect.centerY());
                                                n13.lineTo(rect.left + round12, rect.top);
                                                n13.lineTo(rect.left + round12, rect.centerY() - round11);
                                                n13.lineTo(rect.right - round12, rect.centerY() - round11);
                                                n13.lineTo(rect.right - round12, rect.top);
                                                n13.lineTo(rect.right, rect.centerY());
                                                n13.lineTo(rect.right - round12, rect.bottom);
                                                n13.lineTo(rect.right - round12, rect.centerY() + round11);
                                                n13.lineTo(rect.left + round12, rect.centerY() + round11);
                                                n13.lineTo(rect.left + round12, rect.bottom);
                                                n13.close();
                                                return n13;
                                            case 70:
                                                Path n14 = n();
                                                Float[] fArr5 = eVar.f20616n;
                                                int width3 = rect.width() / 2;
                                                int min5 = Math.min(rect.width(), rect.height());
                                                if (fArr5 != null && fArr5.length == 2) {
                                                    round13 = a0.a.c(fArr5[0], width3);
                                                    round14 = a0.a.c(fArr5[1], min5);
                                                    if (round14 * 2 > rect.height()) {
                                                        round14 = min5 * 2;
                                                    }
                                                } else {
                                                    round13 = Math.round(width3 * 0.5f);
                                                    round14 = Math.round(min5 * 0.5f);
                                                }
                                                n14.moveTo(rect.centerX(), rect.top);
                                                n14.lineTo(d.a(n14, d.a(n14, rect.right, rect.top + round14, rect, round13), rect.top + round14, rect, round13), rect.bottom - round14);
                                                n14.lineTo(rect.right, rect.bottom - round14);
                                                n14.lineTo(rect.exactCenterX(), rect.bottom);
                                                n14.lineTo(b.a.b(n14, b.a.b(n14, rect.left, rect.bottom - round14, rect, round13), rect.bottom - round14, rect, round13), rect.top + round14);
                                                n14.lineTo(rect.left, rect.top + round14);
                                                n14.close();
                                                return n14;
                                            default:
                                                switch (i11) {
                                                    case 76:
                                                        Path n15 = n();
                                                        Float[] fArr6 = eVar.f20616n;
                                                        int min6 = Math.min(rect.width(), rect.height()) / 2;
                                                        int min7 = Math.min(rect.width(), rect.height());
                                                        if (fArr6 != null && fArr6.length == 3) {
                                                            i10 = a0.a.c(fArr6[0], min6);
                                                            float f10 = min7;
                                                            round15 = a0.a.c(fArr6[1], f10);
                                                            round16 = a0.a.c(fArr6[2], f10);
                                                            if (i10 > round15) {
                                                                i10 = round15;
                                                            }
                                                            int i12 = min7 / 2;
                                                            if (round15 + round16 > i12) {
                                                                round16 = i12 - round15;
                                                            }
                                                        } else {
                                                            int round33 = Math.round(min6 * 0.225f);
                                                            float f11 = min7 * 0.225f;
                                                            round15 = Math.round(f11);
                                                            i10 = round33;
                                                            round16 = Math.round(f11);
                                                        }
                                                        n15.moveTo(rect.left, rect.centerY());
                                                        n15.lineTo(rect.left + round16, rect.centerY() - round15);
                                                        n15.lineTo(b.a.b(n15, b.a.b(n15, b.a.b(n15, rect.left + round16, rect.centerY() - i10, rect, i10), rect.centerY() - i10, rect, i10), rect.top + round16, rect, round15), rect.top + round16);
                                                        n15.lineTo(d.a(n15, d.a(n15, d.a(n15, rect.centerX(), rect.top, rect, round15), rect.top + round16, rect, i10), rect.top + round16, rect, i10), rect.centerY() - i10);
                                                        n15.lineTo(rect.right - round16, rect.centerY() - i10);
                                                        n15.lineTo(rect.right - round16, rect.centerY() - round15);
                                                        n15.lineTo(rect.right, rect.centerY());
                                                        n15.lineTo(rect.right - round16, rect.centerY() + round15);
                                                        n15.lineTo(d.a(n15, d.a(n15, d.a(n15, rect.right - round16, rect.centerY() + i10, rect, i10), rect.centerY() + i10, rect, i10), rect.bottom - round16, rect, round15), rect.bottom - round16);
                                                        n15.lineTo(b.a.b(n15, b.a.b(n15, b.a.b(n15, rect.centerX(), rect.bottom, rect, round15), rect.bottom - round16, rect, i10), rect.bottom - round16, rect, i10), rect.centerY() + i10);
                                                        n15.lineTo(rect.left + round16, rect.centerY() + i10);
                                                        n15.lineTo(rect.left + round16, rect.centerY() + round15);
                                                        n15.close();
                                                        return n15;
                                                    case 77:
                                                        Path n16 = n();
                                                        Float[] fArr7 = eVar.f20616n;
                                                        int min8 = Math.min(rect.width(), rect.height());
                                                        if (fArr7 != null && fArr7.length == 4) {
                                                            for (int i13 = 0; i13 < 4; i13++) {
                                                                if (fArr7[i13].floatValue() > 1.0f && i13 != 2) {
                                                                    fArr7[i13] = Float.valueOf(1.0f);
                                                                }
                                                            }
                                                            float f12 = min8;
                                                            round17 = a0.a.c(fArr7[0], f12);
                                                            round18 = a0.a.c(fArr7[1], f12);
                                                            round19 = a0.a.c(fArr7[2], f12);
                                                            round20 = a0.a.c(fArr7[3], rect.width());
                                                            int i14 = round18 * 2;
                                                            if (round17 > i14) {
                                                                round17 = i14;
                                                            }
                                                            if (round19 > rect.width()) {
                                                                round19 = rect.width();
                                                            }
                                                            if (round20 + round19 > rect.width()) {
                                                                round20 = rect.width() - round19;
                                                            }
                                                        } else {
                                                            float f13 = min8 * 0.25f;
                                                            round17 = Math.round(f13);
                                                            round18 = Math.round(f13);
                                                            round19 = Math.round(f13);
                                                            round20 = Math.round(rect.width() * 0.65f);
                                                        }
                                                        n16.moveTo(rect.left, rect.centerY());
                                                        n16.lineTo(rect.left + round19, rect.centerY() - round18);
                                                        int i15 = round17 / 2;
                                                        n16.lineTo(rect.left + round19, rect.centerY() - i15);
                                                        n16.lineTo(rect.right - round20, rect.centerY() - i15);
                                                        n16.lineTo(rect.right - round20, rect.top);
                                                        n16.lineTo(rect.right, rect.top);
                                                        n16.lineTo(rect.right, rect.bottom);
                                                        n16.lineTo(rect.right - round20, rect.bottom);
                                                        n16.lineTo(rect.right - round20, rect.centerY() + i15);
                                                        n16.lineTo(rect.left + round19, rect.centerY() + i15);
                                                        n16.lineTo(rect.left + round19, rect.centerY() + round18);
                                                        n16.close();
                                                        return n16;
                                                    case 78:
                                                        Path n17 = n();
                                                        Float[] fArr8 = eVar.f20616n;
                                                        int min9 = Math.min(rect.width(), rect.height());
                                                        if (fArr8 != null && fArr8.length == 4) {
                                                            for (int i16 = 0; i16 < 4; i16++) {
                                                                if (fArr8[i16].floatValue() > 1.0f && i16 != 2) {
                                                                    fArr8[i16] = Float.valueOf(1.0f);
                                                                }
                                                            }
                                                            float f14 = min9;
                                                            round21 = a0.a.c(fArr8[0], f14);
                                                            round22 = a0.a.c(fArr8[1], f14);
                                                            round23 = a0.a.c(fArr8[2], f14);
                                                            round24 = a0.a.c(fArr8[3], rect.width());
                                                            int i17 = round22 * 2;
                                                            if (round21 > i17) {
                                                                round21 = i17;
                                                            }
                                                            if (round23 > rect.width()) {
                                                                round23 = rect.width();
                                                            }
                                                            if (round24 + round23 > rect.width()) {
                                                                round24 = rect.width() - round23;
                                                            }
                                                        } else {
                                                            float f15 = min9 * 0.25f;
                                                            round21 = Math.round(f15);
                                                            round22 = Math.round(f15);
                                                            round23 = Math.round(f15);
                                                            round24 = Math.round(rect.width() * 0.65f);
                                                        }
                                                        n17.moveTo(rect.left, rect.top);
                                                        n17.lineTo(rect.left + round24, rect.top);
                                                        int i18 = round21 / 2;
                                                        n17.lineTo(rect.left + round24, rect.centerY() - i18);
                                                        n17.lineTo(rect.right - round23, rect.centerY() - i18);
                                                        n17.lineTo(rect.right - round23, rect.centerY() - round22);
                                                        n17.lineTo(rect.right, rect.centerY());
                                                        n17.lineTo(rect.right - round23, rect.centerY() + round22);
                                                        n17.lineTo(rect.right - round23, rect.centerY() + i18);
                                                        n17.lineTo(rect.left + round24, rect.centerY() + i18);
                                                        n17.lineTo(rect.left + round24, rect.bottom);
                                                        n17.lineTo(rect.left, rect.bottom);
                                                        n17.close();
                                                        return n17;
                                                    case 79:
                                                        Path n18 = n();
                                                        Float[] fArr9 = eVar.f20616n;
                                                        int min10 = Math.min(rect.width(), rect.height());
                                                        if (fArr9 != null && fArr9.length == 4) {
                                                            for (int i19 = 0; i19 < 4; i19++) {
                                                                if (fArr9[i19].floatValue() > 1.0f && i19 != 2) {
                                                                    fArr9[i19] = Float.valueOf(1.0f);
                                                                }
                                                            }
                                                            float f16 = min10;
                                                            round25 = a0.a.c(fArr9[0], f16);
                                                            round26 = a0.a.c(fArr9[1], f16);
                                                            round27 = a0.a.c(fArr9[2], f16);
                                                            round28 = a0.a.c(fArr9[3], rect.height());
                                                            int i20 = round26 * 2;
                                                            if (round25 > i20) {
                                                                round25 = i20;
                                                            }
                                                            if (round27 > rect.height()) {
                                                                round27 = rect.width();
                                                            }
                                                            if (round28 + round27 > rect.height()) {
                                                                round28 = rect.height() - round27;
                                                            }
                                                        } else {
                                                            float f17 = min10 * 0.25f;
                                                            round25 = Math.round(f17);
                                                            round26 = Math.round(f17);
                                                            round27 = Math.round(f17);
                                                            round28 = Math.round(rect.height() * 0.65f);
                                                        }
                                                        n18.moveTo(rect.centerX(), rect.top);
                                                        n18.lineTo(rect.centerX() + round26, rect.top + round27);
                                                        int i21 = round25 / 2;
                                                        n18.lineTo(d.a(n18, rect.centerX() + i21, rect.top + round27, rect, i21), rect.bottom - round28);
                                                        n18.lineTo(rect.right, rect.bottom - round28);
                                                        n18.lineTo(rect.right, rect.bottom);
                                                        n18.lineTo(rect.left, rect.bottom);
                                                        n18.lineTo(b.a.b(n18, b.a.b(n18, b.a.b(n18, rect.left, rect.bottom - round28, rect, i21), rect.bottom - round28, rect, i21), rect.top + round27, rect, round26), rect.top + round27);
                                                        n18.close();
                                                        return n18;
                                                    case 80:
                                                        Path n19 = n();
                                                        Float[] fArr10 = eVar.f20616n;
                                                        int min11 = Math.min(rect.width(), rect.height());
                                                        if (fArr10 != null && fArr10.length == 4) {
                                                            for (int i22 = 0; i22 < 4; i22++) {
                                                                if (fArr10[i22].floatValue() > 1.0f && i22 != 2) {
                                                                    fArr10[i22] = Float.valueOf(1.0f);
                                                                }
                                                            }
                                                            float f18 = min11;
                                                            round29 = a0.a.c(fArr10[0], f18);
                                                            round30 = a0.a.c(fArr10[1], f18);
                                                            round31 = a0.a.c(fArr10[2], f18);
                                                            round32 = a0.a.c(fArr10[3], rect.height());
                                                            int i23 = round30 * 2;
                                                            if (round29 > i23) {
                                                                round29 = i23;
                                                            }
                                                            if (round31 > rect.height()) {
                                                                round31 = rect.width();
                                                            }
                                                            if (round32 + round31 > rect.height()) {
                                                                round32 = rect.height() - round31;
                                                            }
                                                        } else {
                                                            float f19 = min11 * 0.25f;
                                                            round29 = Math.round(f19);
                                                            round30 = Math.round(f19);
                                                            round31 = Math.round(f19);
                                                            round32 = Math.round(rect.height() * 0.65f);
                                                        }
                                                        n19.moveTo(rect.centerX(), rect.bottom);
                                                        n19.lineTo(rect.centerX() - round30, rect.bottom - round31);
                                                        int i24 = round29 / 2;
                                                        n19.lineTo(b.a.b(n19, rect.centerX() - i24, rect.bottom - round31, rect, i24), rect.top + round32);
                                                        n19.lineTo(rect.left, rect.top + round32);
                                                        n19.lineTo(rect.left, rect.top);
                                                        n19.lineTo(rect.right, rect.top);
                                                        n19.lineTo(d.a(n19, d.a(n19, d.a(n19, rect.right, rect.top + round32, rect, i24), rect.top + round32, rect, i24), rect.bottom - round31, rect, round30), rect.bottom - round31);
                                                        n19.close();
                                                        return n19;
                                                    case 81:
                                                        return j(eVar, rect);
                                                    default:
                                                        switch (i11) {
                                                            case 89:
                                                                return l(eVar, rect);
                                                            case 90:
                                                                return d(eVar, rect);
                                                            case 91:
                                                                return c(eVar, rect);
                                                            default:
                                                                switch (i11) {
                                                                    case 101:
                                                                        return r(eVar, rect);
                                                                    case 102:
                                                                        return h(eVar, rect);
                                                                    case 103:
                                                                        return g(eVar, rect);
                                                                    case 104:
                                                                        return i(eVar, rect);
                                                                    case 105:
                                                                        return f(eVar, rect);
                                                                    default:
                                                                        return new PathHolder();
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                    return m(eVar, rect);
                                }
                                return q(eVar, rect);
                            }
                            return k(eVar, rect);
                        }
                        return e(eVar, rect);
                    }
                    return o(eVar, rect);
                }
                Path n20 = n();
                Float[] fArr11 = eVar.f20616n;
                int min12 = Math.min(rect.width(), rect.height());
                if (fArr11 != null && fArr11.length == 1) {
                    round4 = a0.a.c(fArr11[0], min12);
                } else {
                    round4 = Math.round(min12 * 0.5f);
                }
                n20.moveTo(rect.left, rect.top);
                n20.lineTo(rect.right - round4, rect.top);
                n20.lineTo(rect.right, rect.centerY());
                n20.lineTo(rect.right - round4, rect.bottom);
                n20.lineTo(rect.left, rect.bottom);
                n20.lineTo(rect.left + round4, rect.centerY());
                n20.close();
                return n20;
            }
            Path n21 = n();
            Float[] fArr12 = eVar.f20616n;
            int min13 = Math.min(rect.width(), rect.height());
            if (fArr12 != null && fArr12.length == 1) {
                round3 = a0.a.c(fArr12[0], min13);
            } else {
                round3 = Math.round(min13 * 0.5f);
            }
            n21.moveTo(rect.left, rect.top);
            n21.lineTo(rect.right - round3, rect.top);
            n21.lineTo(rect.right, rect.centerY());
            n21.lineTo(rect.right - round3, rect.bottom);
            n21.lineTo(rect.left, rect.bottom);
            n21.close();
            return n21;
        }
        Path n22 = n();
        Float[] fArr13 = eVar.f20616n;
        int height3 = rect.height() / 2;
        int min14 = Math.min(rect.width(), rect.height());
        if (fArr13 != null && fArr13.length == 2) {
            round = a0.a.c(fArr13[0], height3);
            round2 = a0.a.c(fArr13[1], min14);
        } else {
            round = Math.round(height3 * 0.5f);
            round2 = Math.round(min14 * 0.5f);
        }
        n22.moveTo(rect.left, rect.centerY() - round);
        n22.lineTo(rect.right - round2, rect.centerY() - round);
        n22.lineTo(rect.right - round2, rect.top);
        n22.lineTo(rect.right, rect.centerY());
        n22.lineTo(rect.right - round2, rect.bottom);
        n22.lineTo(rect.right - round2, rect.centerY() + round);
        n22.lineTo(rect.left, rect.centerY() + round);
        n22.close();
        return n22;
    }

    public static Path c(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path n10 = n();
        RectF p10 = p();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 4) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
            round4 = a0.a.c(fArr[3], f10);
            int i10 = round2 * 2;
            if (round > i10) {
                round = i10;
            }
            if (round3 + round4 > rect.width()) {
                round4 = rect.width() - round3;
            }
            if (round4 > rect.height()) {
                round4 = rect.height();
            }
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f12);
            round3 = Math.round(f12);
            round4 = Math.round(f11 * 0.4375f);
        }
        n10.moveTo(rect.left, rect.bottom);
        int i11 = round / 2;
        n10.lineTo(rect.left, ((rect.top + round2) - i11) + round4);
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = round4 * 2;
        p10.set(i12, (i13 + round2) - i11, i12 + i14, ((i13 + round2) - i11) + i14);
        n10.arcTo(p10, 180.0f, 90.0f);
        n10.lineTo(rect.right - round3, (rect.top + round2) - i11);
        n10.lineTo(rect.right - round3, rect.top);
        n10.lineTo(rect.right, rect.top + round2);
        n10.lineTo(rect.right - round3, (round2 * 2) + rect.top);
        n10.lineTo(rect.right - round3, rect.top + round2 + i11);
        if (round4 >= round) {
            n10.lineTo(rect.left + round4, rect.top + round2 + i11);
            int i15 = rect.left;
            int i16 = rect.top;
            int i17 = (round4 - round) * 2;
            p10.set(i15 + round, i16 + round2 + i11, i15 + i17, f.g(i16, round2, i11, i17));
            n10.arcTo(p10, 270.0f, -90.0f);
            n10.lineTo(rect.left + round, ((rect.top + round2) - i11) + round4);
        } else {
            n10.lineTo(rect.left + round, rect.top + round2 + i11);
        }
        n10.lineTo(rect.left + round, rect.bottom);
        n10.close();
        return n10;
    }

    public static Path d(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
        } else {
            float f11 = min * 0.25f;
            round = Math.round(f11);
            round2 = Math.round(f11);
            round3 = Math.round(f11);
        }
        n10.moveTo(rect.left, rect.bottom);
        n10.lineTo(rect.left, rect.bottom - round);
        int i10 = round / 2;
        n10.lineTo((rect.right - round2) - i10, rect.bottom - round);
        n10.lineTo((rect.right - round2) - i10, rect.top + round3);
        n10.lineTo(rect.right - (round2 * 2), rect.top + round3);
        n10.lineTo(rect.right - round2, rect.top);
        n10.lineTo(rect.right, rect.top + round3);
        n10.lineTo((rect.right - round2) + i10, rect.top + round3);
        n10.lineTo((rect.right - round2) + i10, rect.bottom);
        n10.close();
        return n10;
    }

    public static Path e(e eVar, Rect rect) {
        int round;
        int round2;
        int i10;
        int i11;
        int i12;
        Path n10 = n();
        RectF p10 = p();
        Float[] fArr = eVar.f20616n;
        if (fArr != null && fArr.length == 5) {
            float f10 = 100;
            round = a0.a.c(fArr[0], f10);
            i10 = a0.a.c(fArr[1], 1.6666666f);
            i11 = a0.a.c(fArr[2], 1.6666666f);
            i12 = a0.a.c(fArr[3], 1.6666666f);
            round2 = a0.a.c(fArr[4], f10);
        } else {
            float f11 = 100 * 0.125f;
            round = Math.round(f11);
            round2 = Math.round(f11);
            i10 = 20;
            i11 = 340;
            i12 = ShapeTypes.MATH_EQUAL;
        }
        int i13 = 50 - round2;
        double d10 = i13;
        double d11 = (i11 * 3.141592653589793d) / 180.0d;
        double sin = Math.sin(d11) * d10;
        double cos = Math.cos(d11) * d10;
        double d12 = ((i10 + i11) * 3.141592653589793d) / 180.0d;
        double tan = Math.tan(d12);
        double d13 = sin - (tan * cos);
        double sqrt = Math.sqrt(Math.pow(round2, 2.0d) / (Math.pow(tan, 2.0d) + 1.0d));
        int i14 = round / 2;
        int i15 = i12;
        double sqrt2 = Math.sqrt(Math.pow(i14, 2.0d) / (Math.pow(tan, 2.0d) + 1.0d));
        if (i11 > 90 && i11 < 270) {
            sqrt = -sqrt;
            sqrt2 = -sqrt2;
        }
        double d14 = cos + sqrt2;
        double d15 = sqrt;
        double a10 = a(d14, (tan * d14) + d13);
        double d16 = cos - sqrt2;
        double a11 = a(d16, (tan * d16) + d13);
        float f12 = (round2 - i14) - 50;
        float f13 = i13 + i14;
        p10.set(f12, f12, f13, f13);
        double d17 = i15;
        n10.arcTo(p10, i15, ((float) ((a10 - d17) + 360.0d)) % 360.0f);
        double d18 = cos + d15;
        n10.lineTo((float) d18, (float) ((d18 * tan) + d13));
        n10.lineTo((float) (Math.cos(d12) * d10), (float) (Math.sin(d12) * d10));
        double d19 = cos - d15;
        n10.lineTo((float) d19, (float) ((tan * d19) + d13));
        float f14 = (round2 + i14) - 50;
        float f15 = i13 - i14;
        p10.set(f14, f14, f15, f15);
        n10.arcTo(p10, (float) a11, ((float) ((d17 - a11) - 360.0d)) % 360.0f);
        n10.close();
        Matrix matrix = new Matrix();
        matrix.postScale(rect.width() / 100.0f, rect.height() / 100.0f);
        n10.transform(matrix);
        n10.offset(rect.centerX(), rect.centerY());
        return n10;
    }

    public static ArrayList f(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RectF p10 = p();
        ArrayList arrayList = new ArrayList(2);
        Float[] fArr = eVar.f20616n;
        PathHolder pathHolder = new PathHolder();
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f11 * 0.5f);
            round3 = Math.round(f12);
        }
        int i16 = round2 / 2;
        int i17 = round / 2;
        int width = ((rect.width() - i16) - i17) / 2;
        int height = rect.height();
        pathHolder.moveTo(rect.left, rect.bottom);
        int i18 = width * 2;
        int i19 = height * 2;
        p10.set(rect.left, rect.top, i10 + i18, i11 + i19);
        pathHolder.arcTo(p10, 180.0f, 90.0f);
        pathHolder.lineTo(rect.left + width + round, rect.top);
        int i20 = rect.left;
        p10.set(i20 + round, rect.top, i20 + i18 + round, i12 + i19);
        pathHolder.arcTo(p10, 270.0f, -90.0f);
        pathHolder.close();
        arrayList.add(pathHolder);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.left + width, rect.top);
        double d10 = height;
        int i21 = round;
        double d11 = round3;
        double sqrt = Math.sqrt(((Math.pow(d10, 2.0d) - Math.pow(d11, 2.0d)) * Math.pow(width, 2.0d)) / Math.pow(d10, 2.0d));
        int atan = (int) ((Math.atan(sqrt / d11) * 180.0d) / 3.141592653589793d);
        p10.set(rect.left, rect.top, i13 + i18, i14 + i19);
        pathHolder2.arcTo(p10, 270.0f, atan);
        float f13 = (float) sqrt;
        pathHolder2.setLastPoint(rect.left + width + f13, rect.bottom - round3);
        float f14 = i17;
        float f15 = i16;
        pathHolder2.lineTo((((rect.left + width) + f13) + f14) - f15, rect.bottom - round3);
        pathHolder2.lineTo(rect.right - i16, rect.bottom);
        pathHolder2.lineTo(rect.left + width + f13 + f14 + f15, rect.bottom - round3);
        pathHolder2.lineTo(rect.left + width + f13 + i21, rect.bottom - round3);
        int i22 = rect.left;
        p10.set(i22 + i21, rect.top, i22 + i18 + i21, i15 + i19);
        pathHolder2.arcTo(p10, atan + 270, -atan);
        pathHolder2.close();
        arrayList.add(pathHolder2);
        return arrayList;
    }

    public static ArrayList g(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RectF p10 = p();
        ArrayList arrayList = new ArrayList(2);
        Float[] fArr = eVar.f20616n;
        PathHolder pathHolder = new PathHolder();
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f11 * 0.5f);
            round3 = Math.round(f12);
        }
        int width = rect.width() * 2;
        int i15 = round / 2;
        int i16 = rect.top;
        pathHolder.moveTo(rect.right, i16 + i12);
        int i17 = round;
        double d10 = width / 2;
        double d11 = round3;
        double sqrt = Math.sqrt(((Math.pow(d10, 2.0d) - Math.pow(d11, 2.0d)) * Math.pow((((rect.bottom - (round2 / 2)) - i15) - i16) / 2, 2.0d)) / Math.pow(d10, 2.0d));
        int atan = (int) ((Math.atan(sqrt / d11) * 180.0d) / 3.141592653589793d);
        int i18 = rect.right;
        p10.set(i18 - width, rect.top, i18, i13 + i11);
        float f13 = atan;
        pathHolder.arcTo(p10, 0.0f, f13);
        int i19 = (int) sqrt;
        pathHolder.setLastPoint(rect.left + round3, rect.top + i12 + i19);
        pathHolder.lineTo(rect.left + round3, (((rect.top + i12) + i19) + i15) - i10);
        pathHolder.lineTo(rect.left, rect.bottom - i10);
        pathHolder.lineTo(rect.left + round3, rect.top + i12 + i19 + i15 + i10);
        pathHolder.lineTo(rect.left + round3, f.g(rect.top, i12, i19, i17));
        int i20 = rect.right;
        int i21 = rect.top;
        p10.set(i20 - width, i21 + i17, i20, i21 + i11 + i17);
        pathHolder.arcTo(p10, f13, -atan);
        pathHolder.close();
        arrayList.add(pathHolder);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.left, rect.top);
        int i22 = rect.right;
        p10.set(i22 - width, rect.top, i22, i14 + i11);
        pathHolder2.arcTo(p10, 270.0f, 90.0f);
        pathHolder2.lineTo(rect.right, rect.top + i12 + i17);
        int i23 = rect.right;
        int i24 = rect.top;
        p10.set(i23 - width, i24 + i17, i23, i24 + i11 + i17);
        pathHolder2.arcTo(p10, 0.0f, -90.0f);
        pathHolder2.close();
        arrayList.add(pathHolder2);
        return arrayList;
    }

    public static ArrayList h(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RectF p10 = p();
        ArrayList arrayList = new ArrayList(2);
        Float[] fArr = eVar.f20616n;
        PathHolder pathHolder = new PathHolder();
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f11 * 0.5f);
            round3 = Math.round(f12);
        }
        int width = rect.width() * 2;
        int i16 = round / 2;
        int i17 = rect.top;
        int i18 = ((rect.bottom - (round2 / 2)) - i16) - i17;
        pathHolder.moveTo(rect.right, i17);
        p10.set(rect.left, rect.top, i11 + width, i12 + i18);
        pathHolder.arcTo(p10, 270.0f, -90.0f);
        pathHolder.lineTo(rect.left, rect.top + i13 + round);
        int i19 = rect.left;
        int i20 = rect.top;
        p10.set(i19, i20 + round, i19 + width, i20 + i18 + round);
        pathHolder.arcTo(p10, 180.0f, 90.0f);
        pathHolder.close();
        arrayList.add(pathHolder);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.left, rect.top + i13);
        int i21 = round;
        double d10 = width / 2;
        double d11 = round3;
        double sqrt = Math.sqrt(((Math.pow(d10, 2.0d) - Math.pow(d11, 2.0d)) * Math.pow(i18 / 2, 2.0d)) / Math.pow(d10, 2.0d));
        int atan = (int) ((Math.atan(sqrt / d11) * 180.0d) / 3.141592653589793d);
        p10.set(rect.left, rect.top, i14 + width, i15 + i18);
        pathHolder2.arcTo(p10, 180.0f, -atan);
        int i22 = (int) sqrt;
        pathHolder2.setLastPoint(rect.right - round3, rect.top + i13 + i22);
        pathHolder2.lineTo(rect.right - round3, (((rect.top + i13) + i22) + i16) - i10);
        pathHolder2.lineTo(rect.right, rect.bottom - i10);
        pathHolder2.lineTo(rect.right - round3, rect.top + i13 + i22 + i16 + i10);
        pathHolder2.lineTo(rect.right - round3, f.g(rect.top, i13, i22, i21));
        int i23 = rect.left;
        int i24 = rect.top;
        p10.set(i23, i24 + i21, i23 + width, i24 + i18 + i21);
        pathHolder2.arcTo(p10, 180 - atan, atan);
        pathHolder2.close();
        arrayList.add(pathHolder2);
        return arrayList;
    }

    public static ArrayList i(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        RectF p10 = p();
        ArrayList arrayList = new ArrayList(2);
        Float[] fArr = eVar.f20616n;
        PathHolder pathHolder = new PathHolder();
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f11 * 0.5f);
            round3 = Math.round(f12);
        }
        int i10 = round2 / 2;
        int i11 = round / 2;
        int width = ((rect.width() - i10) - i11) / 2;
        int height = rect.height();
        pathHolder.moveTo(rect.left + width, rect.bottom);
        double d10 = height;
        int i12 = round;
        double d11 = round3;
        double sqrt = Math.sqrt(((Math.pow(d10, 2.0d) - Math.pow(d11, 2.0d)) * Math.pow(width, 2.0d)) / Math.pow(d10, 2.0d));
        int atan = (int) ((Math.atan(sqrt / d11) * 180.0d) / 3.141592653589793d);
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = width * 2;
        p10.set(i13, i14 - height, i13 + i15, i14 + height);
        pathHolder.arcTo(p10, 90.0f, -atan);
        float f13 = (float) sqrt;
        pathHolder.setLastPoint(rect.left + width + f13, rect.top + round3);
        float f14 = i11;
        float f15 = i10;
        pathHolder.lineTo((((rect.left + width) + f13) + f14) - f15, rect.top + round3);
        pathHolder.lineTo(rect.right - i10, rect.top);
        pathHolder.lineTo(rect.left + width + f13 + f14 + f15, rect.top + round3);
        pathHolder.lineTo(rect.left + width + f13 + i12, rect.top + round3);
        int i16 = rect.left;
        int i17 = rect.top;
        p10.set(i16 + i12, i17 - height, i16 + i15 + i12, i17 + height);
        pathHolder.arcTo(p10, 90 - atan, atan);
        pathHolder.close();
        arrayList.add(pathHolder);
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.left, rect.top);
        int i18 = rect.left;
        int i19 = rect.top;
        p10.set(i18, i19 - height, i18 + i15, i19 + height);
        pathHolder2.arcTo(p10, 180.0f, -90.0f);
        pathHolder2.lineTo(rect.left + width + i12, rect.bottom);
        int i20 = rect.left;
        int i21 = rect.top;
        p10.set(i20 + i12, i21 - height, i20 + i15 + i12, i21 + height);
        pathHolder2.arcTo(p10, 90.0f, 90.0f);
        pathHolder2.close();
        arrayList.add(pathHolder2);
        return arrayList;
    }

    public static Path j(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 4) {
            for (int i10 = 0; i10 < 4; i10++) {
                if (fArr[i10].floatValue() > 1.0f && i10 != 2) {
                    fArr[i10] = Float.valueOf(1.0f);
                }
            }
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
            round4 = a0.a.c(fArr[3], rect.width());
            if (round3 * 2 >= rect.width()) {
                round3 = rect.width() / 2;
            }
            int i11 = round3 * 2;
            if (i11 + round4 >= rect.width()) {
                round4 = rect.width() - i11;
            }
        } else {
            float f11 = min * 0.25f;
            round = Math.round(f11);
            round2 = Math.round(f11);
            round3 = Math.round(f11);
            round4 = Math.round(rect.width() * 0.5f);
        }
        n10.moveTo(rect.left, rect.centerY());
        n10.lineTo(rect.left + round3, rect.centerY() - round2);
        int i12 = round / 2;
        n10.lineTo(rect.left + round3, rect.centerY() - i12);
        int i13 = round4 / 2;
        n10.lineTo(d.a(n10, d.a(n10, b.a.b(n10, rect.centerX() - i13, rect.centerY() - i12, rect, i13), rect.top, rect, i13), rect.top, rect, i13), rect.centerY() - i12);
        n10.lineTo(rect.right - round3, rect.centerY() - i12);
        n10.lineTo(rect.right - round3, rect.centerY() - round2);
        n10.lineTo(rect.right, rect.centerY());
        n10.lineTo(rect.right - round3, rect.centerY() + round2);
        n10.lineTo(b.a.b(n10, b.a.b(n10, d.a(n10, d.a(n10, rect.right - round3, rect.centerY() + i12, rect, i13), rect.centerY() + i12, rect, i13), rect.bottom, rect, i13), rect.bottom, rect, i13), rect.centerY() + i12);
        n10.lineTo(rect.left + round3, rect.centerY() + i12);
        n10.lineTo(rect.left + round3, rect.centerY() + round2);
        n10.close();
        return n10;
    }

    public static Path k(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = Math.round((fArr[0].floatValue() * f10) / 2.0f);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
            if (round > round2) {
                round = round2;
            }
            if (round2 + round3 > rect.width()) {
                round3 = (min / 2) - round2;
            }
            int i10 = round2 * 2;
            if (i10 + round3 > rect.height()) {
                round3 = rect.height() - i10;
            }
        } else {
            float f11 = min * 0.225f;
            round = Math.round(f11 / 2.0f);
            round2 = Math.round(f11);
            round3 = Math.round(f11);
        }
        n10.moveTo(rect.left + round3, (rect.bottom - round2) + round);
        n10.lineTo(rect.left + round3, rect.bottom);
        n10.lineTo(rect.left, rect.bottom - round2);
        int i11 = round2 * 2;
        n10.lineTo(rect.left + round3, rect.bottom - i11);
        n10.lineTo(b.a.b(n10, b.a.b(n10, b.a.b(n10, rect.left + round3, (rect.bottom - round2) - round, rect, round), (rect.bottom - round2) - round, rect, round), rect.top + round3, rect, round2), rect.top + round3);
        n10.lineTo(d.a(n10, d.a(n10, d.a(n10, rect.centerX(), rect.top, rect, round2), rect.top + round3, rect, round), rect.top + round3, rect, round), (rect.bottom - round2) - round);
        n10.lineTo(rect.right - round3, (rect.bottom - round2) - round);
        n10.lineTo(rect.right - round3, rect.bottom - i11);
        n10.lineTo(rect.right, rect.bottom - round2);
        n10.lineTo(rect.right - round3, rect.bottom);
        n10.lineTo(rect.right - round3, (rect.bottom - round2) + round);
        n10.close();
        return n10;
    }

    public static Path l(e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 3) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
            int i10 = round2 * 2;
            if (round > i10) {
                round = i10;
            }
            if (i10 + round3 > min) {
                round3 = min - i10;
            }
        } else {
            float f11 = min * 0.25f;
            round = Math.round(f11);
            round2 = Math.round(f11);
            round3 = Math.round(f11);
        }
        int i11 = round / 2;
        n10.moveTo(rect.left + round3, (rect.bottom - round2) + i11);
        n10.lineTo(rect.left + round3, rect.bottom);
        n10.lineTo(rect.left, rect.bottom - round2);
        int i12 = round2 * 2;
        n10.lineTo(rect.left + round3, rect.bottom - i12);
        n10.lineTo(rect.left + round3, (rect.bottom - round2) - i11);
        n10.lineTo((rect.right - round2) - i11, (rect.bottom - round2) - i11);
        n10.lineTo((rect.right - round2) - i11, rect.top + round3);
        n10.lineTo(rect.right - i12, rect.top + round3);
        n10.lineTo(rect.right - round2, rect.top);
        n10.lineTo(rect.right, rect.top + round3);
        n10.lineTo((rect.right - round2) + i11, rect.top + round3);
        n10.lineTo((rect.right - round2) + i11, (rect.bottom - round2) + i11);
        n10.close();
        return n10;
    }

    public static Path m(e eVar, Rect rect) {
        int round;
        int round2;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int height = rect.height() / 2;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 2) {
            round = a0.a.c(fArr[0], height);
            round2 = a0.a.c(fArr[1], min);
        } else {
            round = Math.round(height * 0.5f);
            round2 = Math.round(min * 0.5f);
        }
        int height2 = ((round * 2) * round2) / rect.height();
        n10.moveTo(rect.left, rect.centerY() - round);
        n10.lineTo(rect.right - round2, rect.centerY() - round);
        n10.lineTo(rect.right - round2, rect.top);
        n10.lineTo(rect.right, rect.centerY());
        n10.lineTo(rect.right - round2, rect.bottom);
        n10.lineTo(rect.right - round2, rect.centerY() + round);
        n10.lineTo(rect.left, rect.centerY() + round);
        n10.lineTo(rect.left + height2, rect.centerY());
        n10.close();
        return n10;
    }

    public static Path n() {
        return e.a.f29807a.d("LaterArrowPathBuilder");
    }

    public static Path o(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 4) {
            round3 = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                if (fArr[i10].floatValue() > 1.0f && i10 != 2) {
                    fArr[i10] = Float.valueOf(1.0f);
                }
            }
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            int c = a0.a.c(fArr[2], f10);
            round4 = a0.a.c(fArr[3], f10);
            int i11 = round2 * 2;
            if (round > i11) {
                round = i11;
            }
            if (round4 > i11) {
                round4 = i11;
            }
            if (i11 >= min) {
                round2 = min / 2;
            } else {
                round3 = c;
            }
            if (round3 * 2 >= min) {
                round3 = min / 2;
            }
            int i12 = min / 2;
            if (round2 + round3 > i12) {
                round3 = i12 - round2;
            }
        } else {
            float f11 = min;
            float f12 = 0.18515f * f11;
            round = Math.round(f12);
            round2 = Math.round(f12);
            round3 = Math.round(f12);
            round4 = Math.round(f11 * 0.48f);
        }
        n10.moveTo(rect.left, rect.centerY());
        n10.lineTo(rect.left + round3, rect.centerY() - round2);
        int i13 = round / 2;
        n10.lineTo(rect.left + round3, rect.centerY() - i13);
        int i14 = round4 / 2;
        n10.lineTo(b.a.b(n10, b.a.b(n10, b.a.b(n10, b.a.b(n10, rect.centerX() - i14, rect.centerY() - i13, rect, i14), rect.centerY() - i14, rect, i13), rect.centerY() - i14, rect, i13), rect.top + round3, rect, round2), rect.top + round3);
        n10.lineTo(d.a(n10, d.a(n10, d.a(n10, d.a(n10, d.a(n10, rect.centerX(), rect.top, rect, round2), rect.top + round3, rect, i13), rect.top + round3, rect, i13), rect.centerY() - i14, rect, i14), rect.centerY() - i14, rect, i14), rect.centerY() - i13);
        n10.lineTo(rect.right - round3, rect.centerY() - i13);
        n10.lineTo(rect.right - round3, rect.centerY() - round2);
        n10.lineTo(rect.right, rect.centerY());
        n10.lineTo(rect.right - round3, rect.centerY() + round2);
        n10.lineTo(d.a(n10, d.a(n10, d.a(n10, d.a(n10, d.a(n10, rect.right - round3, rect.centerY() + i13, rect, i14), rect.centerY() + i13, rect, i14), rect.centerY() + i14, rect, i13), rect.centerY() + i14, rect, i13), rect.bottom - round3, rect, round2), rect.bottom - round3);
        n10.lineTo(b.a.b(n10, b.a.b(n10, b.a.b(n10, b.a.b(n10, b.a.b(n10, rect.centerX(), rect.bottom, rect, round2), rect.bottom - round3, rect, i13), rect.bottom - round3, rect, i13), rect.centerY() + i14, rect, i14), rect.centerY() + i14, rect, i14), rect.centerY() + i13);
        n10.lineTo(rect.left + round3, rect.centerY() + i13);
        n10.lineTo(rect.left + round3, rect.centerY() + round2);
        n10.close();
        return n10;
    }

    public static RectF p() {
        return e.a.f29807a.f("LaterArrowPathBuilder");
    }

    public static Path q(lh.e eVar, Rect rect) {
        int round;
        int round2;
        Path n10 = n();
        Float[] fArr = eVar.f20616n;
        int height = rect.height() / 2;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 2) {
            int c = a0.a.c(fArr[0], height);
            round2 = a0.a.c(fArr[1], min);
            round = c;
        } else {
            round = Math.round(height * 0.5f);
            round2 = Math.round(min * 0.5f);
        }
        int i10 = min / 32;
        n10.addRect(rect.left, rect.centerY() - round, rect.left + i10, rect.centerY() + round, Path.Direction.CW);
        n10.addRect((i10 * 2) + rect.left, rect.centerY() - round, (i10 * 4) + rect.left, rect.centerY() + round, Path.Direction.CW);
        int i11 = i10 * 5;
        n10.moveTo(rect.left + i11, rect.centerY() - round);
        n10.lineTo(rect.right - round2, rect.centerY() - round);
        n10.lineTo(rect.right - round2, rect.top);
        n10.lineTo(rect.right, rect.centerY());
        n10.lineTo(rect.right - round2, rect.bottom);
        n10.lineTo(rect.right - round2, rect.centerY() + round);
        n10.lineTo(rect.left + i11, rect.centerY() + round);
        n10.close();
        return n10;
    }

    public static Path r(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int round3;
        int round4;
        int round5;
        int i10;
        int i11;
        int i12;
        Path n10 = n();
        RectF p10 = p();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 5) {
            float f10 = min;
            round = a0.a.c(fArr[0], f10);
            round2 = a0.a.c(fArr[1], f10);
            round3 = a0.a.c(fArr[2], f10);
            round4 = a0.a.c(fArr[3], f10);
            round5 = a0.a.c(fArr[4], rect.height());
            int i13 = round2 * 2;
            if (round > i13) {
                round = i13;
            }
            int i14 = round4 + round3;
            if (i14 >= round5) {
                round5 = i14;
            }
            if (round5 > rect.height()) {
                round5 = rect.height();
                round3 = round5 - round4;
            }
            if (round5 - round3 < round) {
                round3 = round5 - round;
            }
        } else {
            float f11 = min;
            float f12 = 0.25f * f11;
            round = Math.round(f12);
            round2 = Math.round(f12);
            round3 = Math.round(f12);
            round4 = Math.round(f11 * 0.4375f);
            round5 = Math.round(rect.height() * 0.75f);
        }
        n10.moveTo(rect.left, rect.bottom);
        n10.lineTo(rect.left, rect.top + round4);
        int i15 = round4 * 2;
        p10.set(rect.left, rect.top, i10 + i15, i11 + i15);
        n10.arcTo(p10, 180.0f, 90.0f);
        int i16 = round / 2;
        n10.lineTo(((rect.right - round2) + i16) - round4, rect.top);
        int i17 = rect.right;
        p10.set(((i17 - round2) + i16) - i15, rect.top, (i17 - round2) + i16, i12 + i15);
        n10.arcTo(p10, 270.0f, 90.0f);
        n10.lineTo((rect.right - round2) + i16, (rect.top + round5) - round3);
        n10.lineTo(rect.right, (rect.top + round5) - round3);
        n10.lineTo(rect.right - round2, rect.top + round5);
        n10.lineTo(rect.right - (round2 * 2), (rect.top + round5) - round3);
        n10.lineTo((rect.right - round2) - i16, (rect.top + round5) - round3);
        if (round4 >= round) {
            n10.lineTo((rect.right - round2) - i16, rect.top + round4);
            int i18 = rect.right;
            int i19 = (round4 - round) * 2;
            int i20 = rect.top;
            p10.set(((i18 - round2) - i16) - i19, i20 + round, (i18 - round2) - i16, i20 + round + i19);
            n10.arcTo(p10, 0.0f, -90.0f);
            n10.lineTo(((rect.right - round2) + i16) - round4, rect.top + round);
            n10.lineTo(rect.left + round4, rect.top + round);
            int i21 = rect.left;
            int i22 = rect.top;
            p10.set(i21 + round, i22 + round, i21 + round + i19, i22 + round + i19);
            n10.arcTo(p10, 270.0f, -90.0f);
            n10.lineTo(rect.left + round, rect.top + round4);
        } else {
            n10.lineTo((rect.right - round2) - i16, rect.top + round);
            n10.lineTo(rect.left + round, rect.top + round);
        }
        n10.lineTo(rect.left + round, rect.bottom);
        n10.close();
        return n10;
    }
}
