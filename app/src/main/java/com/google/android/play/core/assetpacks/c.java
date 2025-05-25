package com.google.android.play.core.assetpacks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.ADRequestList;
import com.google.android.gms.tasks.OnFailureListener;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import lib.zj.office.fc.ppt.reader.BackgroundReader;
import lib.zj.office.fc.ppt.reader.ReaderKit;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.datasource.sp.SharePreferencesImpl;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import sg.e;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class c implements OnFailureListener, f5.c, q9.l, n2.l {

    /* renamed from: a  reason: collision with root package name */
    public static String f13197a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f13198b = new com.android.billingclient.api.a0("RESUME_TOKEN", 8);
    public static final String[] c = new String[0];

    public static ArrayList A(lh.e eVar, Rect rect) {
        int round;
        int round2;
        float f10;
        int round3;
        int round4;
        float f11;
        int i10;
        Float f12;
        Float f13;
        ArrayList G = G();
        Matrix c10 = e.a.f29807a.c("BannerPathBuilder");
        Float[] fArr = eVar.f20616n;
        float min = Math.min(rect.width(), rect.height());
        if (eVar.f20617o) {
            if (fArr != null && fArr.length == 3) {
                if (fArr[0].floatValue() - fArr[2].floatValue() > 0.2f) {
                    fArr[2] = Float.valueOf(fArr[0].floatValue() - 0.2f);
                }
                if (fArr[1].floatValue() > 0.75f) {
                    fArr[1] = Float.valueOf(0.75f);
                }
                float floatValue = 0.5f - (fArr[1].floatValue() / 2.0f);
                int c11 = a0.a.c(fArr[0], min);
                Math.round(fArr[1].floatValue() * (min / 2.0f));
                round4 = a0.a.c(fArr[2], min);
                i10 = c11;
                f11 = floatValue;
            } else {
                round = Math.round(min * 0.25f);
                Math.round((min / 2.0f) * 0.5f);
                round2 = Math.round(min * 0.125f);
                int i11 = round2;
                int i12 = round;
                round4 = i11;
                f11 = 0.25f;
                i10 = i12;
            }
        } else if (fArr != null && fArr.length >= 1) {
            Float f14 = fArr[0];
            if (f14 != null) {
                f10 = f14.floatValue();
                Math.round((0.5f - fArr[0].floatValue()) * min);
            } else {
                Math.round(min * 0.25f);
                f10 = 0.25f;
            }
            if (fArr.length >= 2 && (f13 = fArr[1]) != null) {
                round3 = a0.a.c(f13, min);
            } else {
                round3 = Math.round(0.25f * min);
            }
            if (fArr.length >= 3 && (f12 = fArr[2]) != null) {
                round4 = Math.round((1.0f - f12.floatValue()) * min);
            } else {
                round4 = Math.round(min * 0.125f);
            }
            f11 = f10;
            i10 = round3;
        } else {
            round = Math.round(min * 0.25f);
            Math.round((min / 2.0f) * 0.5f);
            round2 = Math.round(min * 0.125f);
            int i112 = round2;
            int i122 = round;
            round4 = i112;
            f11 = 0.25f;
            i10 = i122;
        }
        c10.reset();
        c10.postScale(rect.width() / min, rect.height() / min);
        if (round4 >= i10) {
            float f15 = min / 2.0f;
            float f16 = i10;
            ArrayList p10 = p(0.0f, 0.0f, min, 0.0f, f15, f16, 0.5f);
            tg.b bVar = new tg.b();
            if (eVar.p()) {
                bVar.b(eVar.f20610k);
                bVar.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder = new PathHolder();
            pathHolder.moveTo(0.0f, 0.0f);
            pathHolder.cubicTo((((PointF) p10.get(0)).x + f15) / 2.0f, ((PointF) p10.get(0)).y, (((PointF) p10.get(1)).x + f15) / 2.0f, ((PointF) p10.get(1)).y, min, 0.0f);
            float f17 = min * 0.125f;
            pathHolder.lineTo(min - f17, f15);
            float f18 = min - f16;
            pathHolder.lineTo(min, f18);
            pathHolder.cubicTo((((PointF) p10.get(1)).x + f15) / 2.0f, (((PointF) p10.get(1)).y + min) - f16, (((PointF) p10.get(0)).x + f15) / 2.0f, (((PointF) p10.get(0)).y + min) - f16, 0.0f, f18);
            pathHolder.lineTo(f17, f15);
            pathHolder.close();
            pathHolder.transform(c10);
            pathHolder.offset(rect.left, rect.top);
            bVar.c(pathHolder);
            bVar.f30011b = eVar.f20603d;
            G.add(bVar);
            return G;
        }
        float f19 = min / 2.0f;
        float f20 = round4;
        int i13 = i10;
        ArrayList p11 = p(0.0f, 0.0f, min, 0.0f, f19, f20, 0.5f);
        PointF a10 = a(0.0f, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, 0.0f, 0.125f);
        a(0.0f, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, 0.0f, f11);
        float f21 = f11 + 0.125f;
        PointF a11 = a(0.0f, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, 0.0f, f21);
        float f22 = 0.125f / f21;
        ArrayList p12 = p(0.0f, 0.0f, a11.x, a11.y, a10.x, a10.y, f22);
        tg.b bVar2 = new tg.b();
        if (eVar.p()) {
            bVar2.b(eVar.f20610k);
            bVar2.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(0.0f, 0.0f);
        pathHolder2.cubicTo(((PointF) p12.get(0)).x, ((PointF) p12.get(0)).y, ((PointF) p12.get(1)).x, ((PointF) p12.get(1)).y, a11.x, a11.y);
        float f23 = i13;
        pathHolder2.lineTo(a11.x, (a11.y + min) - f23);
        float f24 = min - f23;
        pathHolder2.cubicTo(((PointF) p12.get(1)).x, (((PointF) p12.get(1)).y + min) - f23, ((PointF) p12.get(0)).x, (((PointF) p12.get(0)).y + min) - f23, 0.0f, f24);
        float f25 = f24 / 2.0f;
        ArrayList p13 = p(0.0f, f25, min, f25, f19, f25 + f20, 0.5f);
        PointF a12 = a(f25, (((PointF) p13.get(0)).x + f19) / 2.0f, ((PointF) p13.get(0)).y, (((PointF) p13.get(1)).x + f19) / 2.0f, ((PointF) p13.get(1)).y, min, f25, 0.125f);
        pathHolder2.lineTo(a12.x, a12.y);
        pathHolder2.close();
        ArrayList p14 = p(min - a11.x, a11.y, min, 0.0f, min - a10.x, a10.y, 1.0f - f22);
        pathHolder2.moveTo(min - a11.x, a11.y);
        pathHolder2.cubicTo(((PointF) p14.get(0)).x, ((PointF) p14.get(0)).y, ((PointF) p14.get(1)).x, ((PointF) p14.get(1)).y, min, 0.0f);
        pathHolder2.lineTo(min - a12.x, a12.y);
        pathHolder2.lineTo(min, f24);
        pathHolder2.cubicTo(((PointF) p14.get(1)).x, (((PointF) p14.get(1)).y + min) - f23, ((PointF) p14.get(0)).x, (((PointF) p14.get(0)).y + min) - f23, min - a11.x, (a11.y + min) - f23);
        pathHolder2.close();
        pathHolder2.transform(c10);
        pathHolder2.offset(rect.left, rect.top);
        bVar2.c(pathHolder2);
        bVar2.f30011b = eVar.f20603d;
        G.add(bVar2);
        float f26 = min - f20;
        ArrayList p15 = p(0.0f, f26, min, f26, f19, min, 0.5f);
        PointF a13 = a(f26, (((PointF) p15.get(0)).x + f19) / 2.0f, ((PointF) p15.get(0)).y, (((PointF) p15.get(1)).x + f19) / 2.0f, ((PointF) p15.get(1)).y, min, f26, f11);
        float f27 = a13.x;
        float f28 = a13.y;
        ArrayList p16 = p(f27, f28, min - f27, f28, f19, min, 0.5f);
        tg.b bVar3 = new tg.b();
        if (eVar.p()) {
            bVar3.b(eVar.f20610k);
            bVar3.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder3 = new PathHolder();
        pathHolder3.moveTo(a13.x, a13.y);
        pathHolder3.cubicTo((((PointF) p16.get(0)).x + f19) / 2.0f, ((PointF) p16.get(0)).y, (((PointF) p16.get(1)).x + f19) / 2.0f, ((PointF) p16.get(1)).y, min - a13.x, a13.y);
        pathHolder3.lineTo(min - a13.x, a13.y - f24);
        pathHolder3.cubicTo((((PointF) p16.get(1)).x + f19) / 2.0f, ((PointF) p16.get(1)).y - f24, (((PointF) p16.get(0)).x + f19) / 2.0f, ((PointF) p16.get(0)).y - f24, a13.x, a13.y - f24);
        pathHolder3.close();
        pathHolder3.moveTo(a13.x, a13.y - f24);
        pathHolder3.lineTo(a11.x, a11.y);
        pathHolder3.moveTo(min - a13.x, a13.y - f24);
        pathHolder3.lineTo(min - a11.x, a11.y);
        bVar3.c(pathHolder3);
        pathHolder3.transform(c10);
        pathHolder3.offset(rect.left, rect.top);
        bVar3.c(pathHolder3);
        bVar3.f30011b = eVar.f20603d;
        G.add(bVar3);
        return G;
    }

    public static ArrayList B(lh.e eVar, Rect rect) {
        float round;
        float round2;
        float f10;
        float f11;
        int round3;
        int round4;
        Float f12;
        float f13;
        float f14;
        eh.b bVar;
        float f15;
        float f16;
        int round5;
        int round6;
        int round7;
        int round8;
        int round9;
        Float f17;
        float f18;
        float f19;
        int round10;
        Float f20;
        int i10;
        int i11;
        G().clear();
        int i12 = eVar.f20615m;
        sg.e eVar2 = e.a.f29807a;
        int i13 = 0;
        if (i12 != 53) {
            if (i12 != 54) {
                if (i12 != 64) {
                    if (i12 != 188) {
                        if (i12 != 244) {
                            if (i12 != 97) {
                                if (i12 != 98) {
                                    if (i12 != 107) {
                                        if (i12 != 108) {
                                            return null;
                                        }
                                        return z(eVar, rect);
                                    }
                                    return A(eVar, rect);
                                }
                                return C(eVar, rect);
                            }
                            return I(eVar, rect);
                        }
                        return D(eVar, rect);
                    }
                    return y(eVar, rect);
                }
                ArrayList G = G();
                Float[] fArr = eVar.f20616n;
                int width = rect.width();
                int height = rect.height();
                if (eVar.f20617o) {
                    if (fArr != null && fArr.length == 2) {
                        round10 = a0.a.c(fArr[0], height);
                        i13 = a0.a.c(fArr[1], width);
                    } else {
                        round10 = Math.round(height * 0.125f);
                    }
                } else if (fArr != null && fArr.length >= 1) {
                    Float f21 = fArr[0];
                    if (f21 != null) {
                        round10 = a0.a.c(f21, height);
                    } else {
                        round10 = Math.round(height * 0.125f);
                    }
                    if (fArr.length >= 2 && (f20 = fArr[1]) != null) {
                        i13 = Math.round((f20.floatValue() - 0.5f) * width);
                    }
                } else {
                    round10 = Math.round(height * 0.125f);
                }
                int abs = width - Math.abs(i13 * 2);
                tg.b bVar2 = new tg.b();
                if (eVar.p()) {
                    bVar2.b(eVar.f20610k);
                    bVar2.f30011b = eVar.f20610k.f17807b;
                }
                PathHolder pathHolder = new PathHolder();
                if (i13 > 0) {
                    pathHolder.moveTo(rect.left, rect.top + round10);
                    float f22 = rect.left;
                    float f23 = abs;
                    float f24 = rect.top + round10;
                    float f25 = round10;
                    float f26 = f25 * 3.3333f;
                    float f27 = f23 * 0.6667f;
                    pathHolder.cubicTo((0.3333f * f23) + f22, f24 - f26, f22 + f27, f24 + f26, i10 + abs, f24);
                    pathHolder.lineTo(rect.right, rect.bottom - round10);
                    float f28 = rect.right;
                    float f29 = rect.bottom - round10;
                    pathHolder.cubicTo(f28 - (f23 * 0.333f), f29 + f26, f28 - f27, f29 - (f25 * 3.333f), i11 - abs, f29);
                    pathHolder.close();
                } else {
                    pathHolder.moveTo(rect.right - abs, rect.top + round10);
                    float f30 = rect.right;
                    float f31 = abs;
                    float f32 = f31 * 0.6667f;
                    float f33 = rect.top + round10;
                    float f34 = 3.333f * round10;
                    pathHolder.cubicTo(f30 - f32, f33 - f34, f30 - (0.3333f * f31), f33 + f34, f30, f33);
                    pathHolder.lineTo(rect.left + abs, rect.bottom - round10);
                    float f35 = rect.left;
                    float f36 = rect.bottom - round10;
                    pathHolder.cubicTo(f35 + f32, f36 + f34, (f31 * 0.333f) + f35, f36 - f34, f35, f36);
                    pathHolder.close();
                }
                bVar2.c(pathHolder);
                bVar2.f30011b = eVar.f20603d;
                G.add(bVar2);
                return G;
            }
            ArrayList G2 = G();
            RectF f37 = eVar2.f("BannerPathBuilder");
            Float[] fArr2 = eVar.f20616n;
            int width2 = rect.width();
            int height2 = rect.height();
            int i14 = width2 / 8;
            if (eVar.f20617o) {
                if (fArr2 != null && fArr2.length == 2) {
                    round6 = a0.a.c(fArr2[0], height2);
                    round7 = a0.a.c(fArr2[1], width2 / 2);
                } else {
                    round6 = Math.round(height2 * 0.16667f);
                    round7 = Math.round((width2 / 2) * 0.5f);
                }
            } else if (fArr2 != null && fArr2.length >= 1) {
                Float f38 = fArr2[0];
                if (f38 != null) {
                    round8 = Math.round((0.5f - f38.floatValue()) * width2);
                } else {
                    round8 = Math.round(width2 * 0.25f);
                }
                if (fArr2.length >= 2 && (f17 = fArr2[1]) != null) {
                    round9 = Math.round((1.0f - f17.floatValue()) * height2);
                } else {
                    round9 = Math.round(height2 * 0.125f);
                }
                round6 = round9;
                round7 = round8;
            } else {
                round6 = Math.round(height2 * 0.125f);
                round7 = Math.round(width2 * 0.25f);
            }
            float f39 = i14 / 4;
            float f40 = round6 / 4;
            tg.b bVar3 = new tg.b();
            if (eVar.p()) {
                bVar3.b(eVar.f20610k);
                bVar3.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder2 = new PathHolder();
            pathHolder2.moveTo(rect.left, rect.top + round6);
            int i15 = (height2 - round6) / 2;
            pathHolder2.lineTo(rect.left + i14, rect.bottom - i15);
            pathHolder2.lineTo(rect.left, rect.bottom);
            float f41 = f39 * 3.0f;
            pathHolder2.lineTo((rect.centerX() - round7) + f41, rect.bottom);
            float f42 = f39 * 2.0f;
            float f43 = 2.0f * f40;
            f37.set((rect.centerX() - round7) + f42, rect.bottom - f43, (rect.centerX() - round7) + i14, rect.bottom);
            pathHolder2.arcTo(f37, 90.0f, -180.0f);
            pathHolder2.lineTo((rect.centerX() - round7) + f39, rect.bottom - f43);
            float f44 = 4.0f * f40;
            f37.set(rect.centerX() - round7, rect.bottom - f44, (rect.centerX() - round7) + f42, rect.bottom - f43);
            pathHolder2.arcTo(f37, 90.0f, 90.0f);
            pathHolder2.lineTo(rect.centerX() - round7, rect.top + round6);
            pathHolder2.close();
            bVar3.c(pathHolder2);
            bVar3.f30011b = eVar.f20603d;
            tg.b i16 = androidx.activity.r.i(G2, bVar3);
            if (eVar.p()) {
                i16.b(eVar.f20610k);
                i16.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder3 = new PathHolder();
            pathHolder3.moveTo(rect.right, rect.top + round6);
            pathHolder3.lineTo(rect.right - i14, rect.bottom - i15);
            pathHolder3.lineTo(rect.right, rect.bottom);
            pathHolder3.lineTo((rect.centerX() + round7) - f41, rect.bottom);
            float f45 = 4.0f * f39;
            f37.set((rect.centerX() + round7) - f45, rect.bottom - f43, (rect.centerX() + round7) - f42, rect.bottom);
            pathHolder3.arcTo(f37, 90.0f, 180.0f);
            pathHolder3.lineTo((rect.centerX() + round7) - f39, rect.bottom - f43);
            f37.set((rect.centerX() + round7) - f42, rect.bottom - f44, rect.centerX() + round7, rect.bottom - f43);
            pathHolder3.arcTo(f37, 90.0f, -90.0f);
            pathHolder3.lineTo(rect.centerX() + round7, rect.top + round6);
            pathHolder3.close();
            i16.c(pathHolder3);
            i16.f30011b = eVar.f20603d;
            tg.b i17 = androidx.activity.r.i(G2, i16);
            if (eVar.p()) {
                i17.b(eVar.f20610k);
                i17.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder4 = new PathHolder();
            pathHolder4.moveTo(rect.centerX() - round7, rect.top + f40);
            f37.set(rect.centerX() - round7, rect.top, (rect.centerX() - round7) + f42, rect.top + f43);
            pathHolder4.arcTo(f37, 180.0f, 90.0f);
            pathHolder4.lineTo((rect.centerX() + round7) - f39, rect.top);
            f37.set((rect.centerX() + round7) - f42, rect.top, rect.centerX() + round7, rect.top + f43);
            pathHolder4.arcTo(f37, 270.0f, 90.0f);
            pathHolder4.lineTo(rect.centerX() + round7, rect.bottom - (3.0f * f40));
            f37.set((rect.centerX() + round7) - f42, rect.bottom - f44, rect.centerX() + round7, rect.bottom - f43);
            pathHolder4.arcTo(f37, 0.0f, -90.0f);
            pathHolder4.lineTo((rect.centerX() - round7) + f39, rect.bottom - f44);
            f37.set(rect.centerX() - round7, rect.bottom - f44, (rect.centerX() - round7) + f42, rect.bottom - f43);
            pathHolder4.arcTo(f37, 270.0f, -90.0f);
            pathHolder4.close();
            i17.c(pathHolder4);
            i17.f30011b = eVar.f20603d;
            tg.b i18 = androidx.activity.r.i(G2, i17);
            if (eVar.p()) {
                i18.b(eVar.f20610k);
                i18.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder5 = new PathHolder();
            pathHolder5.moveTo((rect.centerX() - round7) + i14, rect.bottom - f44);
            pathHolder5.lineTo((rect.centerX() - round7) + f39, rect.bottom - f44);
            f37.set(rect.centerX() - round7, rect.bottom - f44, (rect.centerX() - round7) + f42, rect.bottom - f43);
            pathHolder5.arcTo(f37, 270.0f, -180.0f);
            pathHolder5.lineTo((rect.centerX() - round7) + f41, rect.bottom - f43);
            f37.set((rect.centerX() - round7) + f42, rect.bottom - f43, (rect.centerX() - round7) + f45, rect.bottom);
            pathHolder5.arcTo(f37, 270.0f, 90.0f);
            pathHolder5.close();
            eh.b bVar4 = new eh.b();
            bVar4.c = (byte) 0;
            eh.b bVar5 = eVar.f20603d;
            if (bVar5 != null && bVar5.c == 0) {
                int i19 = bVar5.f16571d;
                f18 = f43;
                f19 = f42;
                bVar4.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i19) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i19) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i19) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                f18 = f43;
                f19 = f42;
                bVar4.f16571d = -1890233003;
            }
            i18.f30011b = bVar4;
            i18.c(pathHolder5);
            G2.add(i18);
            tg.b bVar6 = new tg.b();
            if (eVar.p()) {
                bVar6.b(eVar.f20610k);
                bVar6.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder6 = new PathHolder();
            pathHolder6.moveTo((rect.centerX() + round7) - i14, rect.bottom - f44);
            pathHolder6.lineTo((rect.centerX() + round7) - f39, rect.bottom - f44);
            f37.set((rect.centerX() + round7) - f19, rect.bottom - f44, rect.centerX() + round7, rect.bottom - f18);
            pathHolder6.arcTo(f37, 270.0f, 180.0f);
            pathHolder6.lineTo((rect.centerX() + round7) - f41, rect.bottom - f18);
            f37.set((rect.centerX() + round7) - f45, rect.bottom - f18, (rect.centerX() + round7) - f19, rect.bottom);
            pathHolder6.arcTo(f37, 270.0f, -90.0f);
            pathHolder6.close();
            if (bVar5 != null && bVar5.c == 0) {
                int i20 = bVar5.f16571d;
                bVar4.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i20) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i20) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i20) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                bVar4.f16571d = -1890233003;
            }
            bVar6.f30011b = bVar4;
            bVar6.c(pathHolder6);
            G2.add(bVar6);
            return G2;
        }
        ArrayList G3 = G();
        RectF f46 = eVar2.f("BannerPathBuilder");
        Float[] fArr3 = eVar.f20616n;
        int width3 = rect.width();
        int height3 = rect.height();
        int i21 = width3 / 8;
        if (eVar.f20617o) {
            if (fArr3 != null && fArr3.length == 2) {
                f10 = a0.a.c(fArr3[0], height3);
                round5 = a0.a.c(fArr3[1], width3 / 2);
            } else {
                f10 = Math.round(height3 * 0.16667f);
                round5 = Math.round((width3 / 2) * 0.5f);
            }
            f11 = round5;
        } else {
            if (fArr3 != null && fArr3.length >= 1) {
                Float f47 = fArr3[0];
                if (f47 != null) {
                    round3 = Math.round((0.5f - f47.floatValue()) * width3);
                } else {
                    round3 = Math.round(width3 * 0.25f);
                }
                round2 = round3;
                if (fArr3.length >= 2 && (f12 = fArr3[1]) != null) {
                    round4 = a0.a.c(f12, height3);
                } else {
                    round4 = Math.round(height3 * 0.125f);
                }
                round = round4;
            } else {
                round = Math.round(height3 * 0.125f);
                round2 = Math.round(width3 * 0.25f);
            }
            f10 = round;
            f11 = round2;
        }
        float f48 = i21 / 4;
        float f49 = f10 / 4.0f;
        tg.b bVar7 = new tg.b();
        if (eVar.p()) {
            bVar7.b(eVar.f20610k);
            bVar7.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder7 = new PathHolder();
        pathHolder7.moveTo(rect.left, rect.top);
        float f50 = (height3 - f10) / 2.0f;
        pathHolder7.lineTo(rect.left + i21, rect.top + f50);
        float f51 = 2.0f * f49;
        float f52 = 2.0f * f48;
        float f53 = f49 * 4.0f;
        f46.set(a6.h.b(rect.top, f13, pathHolder7, a6.h.b(rect.top, f13, pathHolder7, rect.left, rect) - f11, rect) - f11, rect.top + f51, (rect.centerX() - f11) + f52, rect.top + f53);
        pathHolder7.arcTo(f46, 180.0f, 90.0f);
        float f54 = f48 * 3.0f;
        float f55 = 4.0f * f48;
        f46.set((a6.h.b(rect.top, f51, pathHolder7, (rect.centerX() - f11) + f54, rect) - f11) + f52, rect.top, (rect.centerX() - f11) + f55, rect.top + f51);
        pathHolder7.arcTo(f46, 90.0f, -180.0f);
        pathHolder7.close();
        bVar7.c(pathHolder7);
        bVar7.f30011b = eVar.f20603d;
        tg.b i22 = androidx.activity.r.i(G3, bVar7);
        if (eVar.p()) {
            i22.b(eVar.f20610k);
            i22.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder8 = new PathHolder();
        pathHolder8.moveTo((rect.centerX() - f11) + f48, rect.bottom);
        f46.set(rect.centerX() - f11, rect.bottom - f51, (rect.centerX() - f11) + f52, rect.bottom);
        pathHolder8.arcTo(f46, 90.0f, 90.0f);
        pathHolder8.lineTo(rect.centerX() - f11, (3.0f * f49) + rect.top);
        f46.set(rect.centerX() - f11, rect.top + f51, (rect.centerX() - f11) + f52, rect.top + f53);
        pathHolder8.arcTo(f46, 180.0f, -90.0f);
        f46.set((a6.h.b(rect.top, f53, pathHolder8, (rect.centerX() + f11) - f48, rect) + f11) - f52, rect.top + f51, rect.centerX() + f11, rect.top + f53);
        pathHolder8.arcTo(f46, 90.0f, -90.0f);
        f46.set((androidx.activity.f.f(rect.bottom, f49, pathHolder8, rect.centerX() + f11, rect) + f11) - f52, rect.bottom - f51, rect.centerX() + f11, rect.bottom);
        pathHolder8.arcTo(f46, 0.0f, 90.0f);
        pathHolder8.close();
        i22.c(pathHolder8);
        i22.f30011b = eVar.f20603d;
        tg.b i23 = androidx.activity.r.i(G3, i22);
        if (eVar.p()) {
            i23.b(eVar.f20610k);
            i23.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder9 = new PathHolder();
        pathHolder9.moveTo(rect.right, rect.top);
        pathHolder9.lineTo(rect.right - i21, rect.top + f50);
        f46.set((a6.h.b(rect.top, f13, pathHolder9, a6.h.b(rect.top, f13, pathHolder9, rect.right, rect) + f11, rect) + f11) - f52, rect.top + f51, rect.centerX() + f11, rect.top + f53);
        pathHolder9.arcTo(f46, 0.0f, -90.0f);
        f46.set((a6.h.b(rect.top, f51, pathHolder9, (rect.centerX() + f11) - f54, rect) + f11) - f55, rect.top, (rect.centerX() + f11) - f52, rect.top + f51);
        pathHolder9.arcTo(f46, 90.0f, 180.0f);
        pathHolder9.close();
        i23.c(pathHolder9);
        i23.f30011b = eVar.f20603d;
        tg.b i24 = androidx.activity.r.i(G3, i23);
        if (eVar.p()) {
            i24.b(eVar.f20610k);
            i24.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder10 = new PathHolder();
        pathHolder10.moveTo((rect.centerX() - f11) + f48, rect.top + f53);
        f46.set(rect.centerX() - f11, rect.top + f51, (rect.centerX() - f11) + f52, rect.top + f53);
        pathHolder10.arcTo(f46, 90.0f, 180.0f);
        f46.set((a6.h.b(rect.top, f51, pathHolder10, (rect.centerX() - f11) + f54, rect) - f11) + f52, rect.top, (rect.centerX() - f11) + f55, rect.top + f51);
        pathHolder10.arcTo(f46, 90.0f, -90.0f);
        float f56 = i21;
        pathHolder10.lineTo((rect.centerX() - f11) + f56, rect.top + f53);
        pathHolder10.close();
        eh.b bVar8 = new eh.b();
        bVar8.c = (byte) 0;
        eh.b bVar9 = eVar.f20603d;
        if (bVar9 != null && bVar9.c == 0) {
            int i25 = bVar9.f16571d;
            f14 = f56;
            bVar = bVar9;
            f15 = f51;
            f16 = f53;
            bVar8.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i25) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i25) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i25) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            f14 = f56;
            bVar = bVar9;
            f15 = f51;
            f16 = f53;
            bVar8.f16571d = -1890233003;
        }
        i24.f30011b = bVar8;
        i24.c(pathHolder10);
        G3.add(i24);
        tg.b bVar10 = new tg.b();
        if (eVar.p()) {
            bVar10.b(eVar.f20610k);
            bVar10.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder11 = new PathHolder();
        pathHolder11.moveTo((rect.centerX() + f11) - f48, rect.top + f16);
        f46.set((rect.centerX() + f11) - f52, rect.top + f15, rect.centerX() + f11, rect.top + f16);
        pathHolder11.arcTo(f46, 90.0f, -180.0f);
        f46.set((a6.h.b(rect.top, f15, pathHolder11, (rect.centerX() + f11) - f54, rect) + f11) - f55, rect.top, (rect.centerX() + f11) - f52, rect.top + f15);
        pathHolder11.arcTo(f46, 90.0f, 90.0f);
        pathHolder11.lineTo((rect.centerX() + f11) - f14, rect.top + f16);
        pathHolder11.close();
        if (bVar != null) {
            eh.b bVar11 = bVar;
            if (bVar11.c == 0) {
                int i26 = bVar11.f16571d;
                bVar8.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i26) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                bVar10.f30011b = bVar8;
                bVar10.c(pathHolder11);
                G3.add(bVar10);
                return G3;
            }
        }
        bVar8.f16571d = -1890233003;
        bVar10.f30011b = bVar8;
        bVar10.c(pathHolder11);
        G3.add(bVar10);
        return G3;
    }

    public static ArrayList C(lh.e eVar, Rect rect) {
        int round;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList G = G();
        RectF f10 = e.a.f29807a.f("BannerPathBuilder");
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 1) {
            round = a0.a.c(fArr[0], min);
        } else {
            round = Math.round(min * 0.125f);
        }
        float f11 = round / 2.0f;
        tg.b bVar = new tg.b();
        if (eVar.p()) {
            bVar.b(eVar.f20610k);
            bVar.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder = new PathHolder();
        float f12 = 3.0f * f11;
        pathHolder.moveTo(rect.left, rect.top + f12);
        int i14 = rect.left;
        int i15 = rect.top;
        int i16 = round * 2;
        f10.set(i14, i15 + round, i14 + round, i15 + i16);
        pathHolder.arcTo(f10, 180.0f, -180.0f);
        pathHolder.lineTo(rect.left + round, rect.bottom - f11);
        f10.set(rect.left, i11 - round, i10 + round, rect.bottom);
        pathHolder.arcTo(f10, 0.0f, 180.0f);
        pathHolder.close();
        bVar.c(pathHolder);
        bVar.f30011b = eVar.f20603d;
        tg.b i17 = androidx.activity.r.i(G, bVar);
        if (eVar.p()) {
            i17.b(eVar.f20610k);
            i17.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(rect.left + round, rect.top + f12);
        int i18 = rect.left;
        int i19 = rect.top;
        f10.set(i18, i19 + round, i18 + round, i19 + i16);
        pathHolder2.arcTo(f10, 0.0f, 270.0f);
        pathHolder2.lineTo(rect.right - f11, rect.top + round);
        int i20 = rect.right;
        f10.set(i20 - round, rect.top, i20, i12 + round);
        pathHolder2.arcTo(f10, 90.0f, -90.0f);
        pathHolder2.lineTo(rect.right, (rect.bottom - round) - f11);
        int i21 = rect.right;
        int i22 = rect.bottom;
        f10.set(i21 - round, i22 - i16, i21, i22 - round);
        pathHolder2.arcTo(f10, 0.0f, 90.0f);
        pathHolder2.lineTo(rect.left + round, rect.bottom - round);
        pathHolder2.close();
        i17.c(pathHolder2);
        i17.f30011b = eVar.f20603d;
        tg.b i23 = androidx.activity.r.i(G, i17);
        if (eVar.p()) {
            i23.b(eVar.f20610k);
            i23.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder3 = new PathHolder();
        pathHolder3.moveTo(rect.right - round, rect.top + f11);
        int i24 = rect.right;
        float f13 = rect.top;
        float f14 = 0.5f * f11;
        float f15 = 1.5f * f11;
        f10.set(i24 - round, f13 + f14, i24 - f11, f13 + f15);
        pathHolder3.arcTo(f10, 180.0f, -180.0f);
        pathHolder3.lineTo(rect.right - f11, rect.top + round);
        pathHolder3.lineTo(rect.right - round, rect.top + round);
        pathHolder3.close();
        i23.c(pathHolder3);
        i23.f30011b = eVar.f20603d;
        tg.b i25 = androidx.activity.r.i(G, i23);
        if (eVar.p()) {
            i25.b(eVar.f20610k);
            i25.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder4 = new PathHolder();
        pathHolder4.moveTo(rect.left + f11, rect.top + i16);
        int i26 = rect.left;
        int i27 = rect.top;
        f10.set(i26, i27 + round, i26 + round, i27 + i16);
        pathHolder4.arcTo(f10, 90.0f, -90.0f);
        int i28 = rect.left;
        float f16 = rect.top + round;
        f10.set(i28 + f11, f16 + f14, i28 + round, f16 + f15);
        pathHolder4.arcTo(f10, 0.0f, -180.0f);
        pathHolder4.close();
        i25.c(pathHolder4);
        eh.b bVar2 = new eh.b();
        bVar2.c = (byte) 0;
        eh.b bVar3 = eVar.f20603d;
        if (bVar3 != null && bVar3.c == 0) {
            int i29 = bVar3.f16571d;
            bVar2.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i29) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar2.f16571d = -1890233003;
        }
        i25.f30011b = bVar2;
        tg.b i30 = androidx.activity.r.i(G, i25);
        if (eVar.p()) {
            i30.b(eVar.f20610k);
            i30.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder5 = new PathHolder();
        pathHolder5.moveTo(rect.right - f11, rect.top + f11);
        int i31 = rect.right;
        float f17 = rect.top;
        f10.set(i31 - round, f14 + f17, i31 - f11, f17 + f15);
        pathHolder5.arcTo(f10, 0.0f, 180.0f);
        int i32 = rect.right;
        f10.set(i32 - round, rect.top, i32, i13 + round);
        pathHolder5.arcTo(f10, 180.0f, 270.0f);
        pathHolder5.close();
        i30.c(pathHolder5);
        if (bVar3 != null && bVar3.c == 0) {
            int i33 = bVar3.f16571d;
            bVar2.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar2.f16571d = -1890233003;
        }
        i30.f30011b = bVar2;
        G.add(i30);
        return G;
    }

    public static ArrayList D(lh.e eVar, Rect rect) {
        int round;
        int round2;
        int i10;
        int i11;
        ArrayList G = G();
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        int height = rect.height();
        if (eVar.f20617o) {
            if (fArr != null && fArr.length == 3) {
                float f10 = height;
                i11 = a0.a.c(fArr[0], f10);
                round = a0.a.c(fArr[1], min);
                i10 = a0.a.c(fArr[2], rect.width());
                round2 = a0.a.c(fArr[2], f10);
            } else {
                float f11 = height;
                int round3 = Math.round(f11 * 0.5f);
                round = Math.round(min * 0.5f);
                int round4 = Math.round(rect.width() * 0.16667f);
                round2 = Math.round(f11 * 0.16667f);
                i10 = round4;
                i11 = round3;
            }
            int i12 = height - round2;
            tg.b bVar = new tg.b();
            if (eVar.p()) {
                bVar.b(eVar.f20610k);
                bVar.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder = new PathHolder();
            int i13 = i12 / 2;
            pathHolder.moveTo(rect.left, rect.top + i13);
            pathHolder.lineTo(rect.left + round, rect.top);
            int i14 = (i12 - i11) / 2;
            pathHolder.lineTo(rect.left + round, rect.top + i14);
            pathHolder.lineTo(rect.centerX(), rect.top + i14);
            int i15 = i10 / 4;
            int i16 = round2 / 2;
            pathHolder.arcTo(new RectF(rect.centerX() - i15, rect.top + i14, rect.centerX() + i15, rect.top + i14 + i16), 270.0f, 180.0f);
            pathHolder.arcTo(new RectF(rect.centerX() - i15, rect.top + i14 + i16, rect.centerX() + i15, rect.top + i14 + round2), 270.0f, -180.0f);
            pathHolder.lineTo(rect.right - round, (rect.bottom - i14) - i11);
            pathHolder.lineTo(rect.right - round, rect.bottom - i12);
            pathHolder.lineTo(rect.right, rect.bottom - i13);
            pathHolder.lineTo(rect.right - round, rect.bottom);
            pathHolder.lineTo(rect.right - round, rect.bottom - i14);
            pathHolder.arcTo(new RectF(rect.centerX() - i15, (rect.bottom - i14) - i16, rect.centerX() + i15, rect.bottom - i14), 90.0f, 90.0f);
            pathHolder.lineTo(rect.centerX() - i15, rect.top + i14 + i11);
            pathHolder.lineTo(rect.left + round, rect.top + i14 + i11);
            pathHolder.lineTo(rect.left + round, rect.top + i12);
            pathHolder.close();
            bVar.c(pathHolder);
            bVar.f30011b = eVar.f20603d;
            tg.b i17 = androidx.activity.r.i(G, bVar);
            if (eVar.p()) {
                i17.b(eVar.f20610k);
                i17.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder2 = new PathHolder();
            pathHolder2.arcTo(new RectF(rect.centerX() - i15, rect.top + i14 + i16, rect.centerX() + i15, rect.top + i14 + round2), 270.0f, -180.0f);
            pathHolder2.close();
            eh.b bVar2 = new eh.b();
            bVar2.c = (byte) 0;
            eh.b bVar3 = eVar.f20603d;
            if (bVar3 != null && bVar3.c == 0) {
                int i18 = bVar3.f16571d;
                bVar2.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i18) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            } else {
                bVar2.f16571d = -1890233003;
            }
            i17.f30011b = bVar2;
            i17.c(pathHolder2);
            G.add(i17);
            return G;
        }
        return null;
    }

    public static String E(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(), 0, str.getBytes().length);
            byte[] digest = messageDigest.digest();
            if (digest == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer(digest.length * 2);
            for (byte b10 : digest) {
                stringBuffer.append("0123456789abcdef".charAt((b10 >> 4) & 15));
                stringBuffer.append("0123456789abcdef".charAt(b10 & 15));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static final String F(nl.b bVar) {
        kotlin.jvm.internal.g.e(bVar, "<this>");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ea.a.p("OHMAbztpKGkrYRJpW24Zb0xGO24gc2g=", "w7QNONtn"), bVar.f22592m);
            jSONObject.put(ea.a.p("IW9FaR9pVGEuaSVuPGQ=", "1eKpQ1sU"), bVar.f22593n);
            jSONObject.put(ea.a.p("PGEPZTJvE250", "QKLhqftQ"), bVar.f22594o);
            jSONObject.put(ea.a.p("I2FCdCtlVmQKYS1l", "3d44pFI6"), bVar.f22595p);
            jSONObject.put(ea.a.p("WnMEcBZuMGUUbFt3", "dZaLmtjJ"), bVar.f22596q);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, ea.a.p("PXMnbhpiWGUrdEh0W1MjclFuNSgp", "EAWHU27O"));
            return jSONObject2;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static ArrayList G() {
        return e.a.f29807a.b("BannerPathBuilder");
    }

    public static final kotlinx.coroutines.internal.q H(Object obj) {
        if (obj != b1.f13190n) {
            return (kotlinx.coroutines.internal.q) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static ArrayList I(lh.e eVar, Rect rect) {
        int round;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ArrayList G = G();
        RectF f10 = e.a.f29807a.f("BannerPathBuilder");
        Float[] fArr = eVar.f20616n;
        int min = Math.min(rect.width(), rect.height());
        if (fArr != null && fArr.length == 1) {
            round = a0.a.c(fArr[0], min);
        } else {
            round = Math.round(min * 0.125f);
        }
        float f11 = round / 2.0f;
        tg.b bVar = new tg.b();
        if (eVar.p()) {
            bVar.b(eVar.f20610k);
            bVar.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder = new PathHolder();
        pathHolder.moveTo(rect.left + f11, rect.bottom);
        f10.set(rect.left, i11 - round, i10 + round, rect.bottom);
        pathHolder.arcTo(f10, 90.0f, -90.0f);
        pathHolder.lineTo(rect.left + round, rect.top + f11);
        int i22 = rect.left;
        int i23 = round * 2;
        f10.set(i22 + round, rect.top, i22 + i23, i12 + round);
        pathHolder.arcTo(f10, 180.0f, 270.0f);
        pathHolder.lineTo(rect.right - round, rect.top + round);
        pathHolder.lineTo(rect.right - round, rect.bottom - f11);
        int i24 = rect.right;
        f10.set(i24 - i23, i13 - round, i24 - round, rect.bottom);
        pathHolder.arcTo(f10, 0.0f, 90.0f);
        pathHolder.close();
        bVar.c(pathHolder);
        bVar.f30011b = eVar.f20603d;
        tg.b i25 = androidx.activity.r.i(G, bVar);
        if (eVar.p()) {
            i25.b(eVar.f20610k);
            i25.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo((3.0f * f11) + rect.left, rect.top);
        int i26 = rect.left;
        f10.set(i26 + round, rect.top, i26 + i23, i14 + round);
        pathHolder2.arcTo(f10, 270.0f, 180.0f);
        pathHolder2.lineTo(rect.right - f11, rect.top + round);
        int i27 = rect.right;
        f10.set(i27 - round, rect.top, i27, i15 + round);
        pathHolder2.arcTo(f10, 90.0f, -180.0f);
        pathHolder2.close();
        i25.c(pathHolder2);
        i25.f30011b = eVar.f20603d;
        tg.b i28 = androidx.activity.r.i(G, i25);
        if (eVar.p()) {
            i28.b(eVar.f20610k);
            i28.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder3 = new PathHolder();
        pathHolder3.moveTo(rect.left + round, rect.bottom - round);
        pathHolder3.lineTo(rect.left + round, rect.bottom - f11);
        pathHolder3.lineTo(rect.left + f11, rect.bottom - f11);
        float f12 = rect.left;
        float f13 = 0.5f * f11;
        float f14 = 1.5f * f11;
        f10.set(f12 + f13, i16 - round, f12 + f14, rect.bottom - f11);
        pathHolder3.arcTo(f10, 90.0f, -180.0f);
        pathHolder3.close();
        i28.c(pathHolder3);
        i28.f30011b = eVar.f20603d;
        tg.b i29 = androidx.activity.r.i(G, i28);
        if (eVar.p()) {
            i29.b(eVar.f20610k);
            i29.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder4 = new PathHolder();
        pathHolder4.moveTo(rect.left + round, rect.bottom - f11);
        f10.set(rect.left, i18 - round, i17 + round, rect.bottom);
        pathHolder4.arcTo(f10, 0.0f, 270.0f);
        float f15 = rect.left;
        f10.set(f15 + f13, i19 - round, f15 + f14, rect.bottom - f11);
        pathHolder4.arcTo(f10, 270.0f, 180.0f);
        pathHolder4.close();
        i29.c(pathHolder4);
        eh.b bVar2 = new eh.b();
        bVar2.c = (byte) 0;
        eh.b bVar3 = eVar.f20603d;
        if (bVar3 != null && bVar3.c == 0) {
            int i30 = bVar3.f16571d;
            bVar2.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i30) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar2.f16571d = -1890233003;
        }
        i29.f30011b = bVar2;
        tg.b i31 = androidx.activity.r.i(G, i29);
        if (eVar.p()) {
            i31.b(eVar.f20610k);
            i31.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder5 = new PathHolder();
        pathHolder5.moveTo(rect.left + i23, rect.top + f11);
        int i32 = rect.left;
        f10.set(i32 + round, rect.top, i32 + i23, i20 + round);
        pathHolder5.arcTo(f10, 0.0f, 90.0f);
        float f16 = rect.left + round;
        f10.set(f13 + f16, rect.top + f11, f16 + f14, i21 + round);
        pathHolder5.arcTo(f10, 90.0f, 180.0f);
        pathHolder5.close();
        i31.c(pathHolder5);
        if (bVar3 != null && bVar3.c == 0) {
            int i33 = bVar3.f16571d;
            bVar2.f16571d = Color.rgb(b1.o(-0.30000001192092896d, Color.red(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.green(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC), b1.o(-0.30000001192092896d, Color.blue(i33) & FunctionEval.FunctionID.EXTERNAL_FUNC));
        } else {
            bVar2.f16571d = -1890233003;
        }
        i31.f30011b = bVar2;
        G.add(i31);
        return G;
    }

    public static /* synthetic */ pdf.pdfreader.viewer.editor.free.datasource.sp.a J(SharePreferencesImpl sharePreferencesImpl, int i10, String str, int i11) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        return sharePreferencesImpl.e(i10, null, str);
    }

    public static boolean K(byte b10, int i10) {
        if (((1 << i10) & b10) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean L(Object obj) {
        if (obj == b1.f13190n) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ pdf.pdfreader.viewer.editor.free.datasource.sp.a M(SharePreferencesImpl sharePreferencesImpl, String str, int i10) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        return sharePreferencesImpl.f(0L, null, str);
    }

    public static final ul.b N(ul.b bVar, String str) {
        ul.b bVar2 = new ul.b();
        bVar2.f30405b = bVar.f30405b;
        bVar2.c = bVar.c;
        bVar2.f30404a = bVar.f30404a;
        bVar2.f30406d = bVar.f30406d;
        bVar2.b(bVar.f30407e);
        bVar2.c(bVar.f30408f);
        bVar2.f30409g = bVar.f30409g;
        bVar2.f30421s = bVar.f30421s;
        bVar2.f30422t = bVar.f30422t;
        bVar2.f30410h = str;
        String p10 = ea.a.p("JnQfaRRhUGUZbyRmHGc=", "PARGug1d");
        ul.c cVar = bVar2.f30419q;
        kotlin.jvm.internal.g.d(cVar, p10);
        String p11 = ea.a.p("R2gic11pD2EVZXdvB2Y_Zw==", "LxfemJ0m");
        ul.c cVar2 = bVar.f30419q;
        kotlin.jvm.internal.g.d(cVar2, p11);
        ge.a.p(cVar, cVar2);
        String p12 = ea.a.p("JnQfYR1qQnMuSSdhEmUrb1tmB2c=", "kNU16Qzb");
        ul.c cVar3 = bVar2.f30420r;
        kotlin.jvm.internal.g.d(cVar3, p12);
        String p13 = ea.a.p("JWgZc3ZhL2o9cxJJWWEwZXtvPGYgZw==", "7WQpXKhN");
        ul.c cVar4 = bVar.f30420r;
        kotlin.jvm.internal.g.d(cVar4, p13);
        ge.a.p(cVar3, cVar4);
        return bVar2;
    }

    public static void O(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void P(nl.b bVar, PdfPreviewEntity entity) {
        kotlin.jvm.internal.g.e(bVar, "<this>");
        kotlin.jvm.internal.g.e(entity, "entity");
        entity.setOtherStrTwo(F(bVar));
    }

    public static int Q(int i10, CharSequence charSequence) {
        char charAt;
        if (i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i10) == '<') {
            while (true) {
                i10++;
                if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\n' || charAt == '<') {
                    break;
                } else if (charAt != '>') {
                    if (charAt == '\\') {
                        int i11 = i10 + 1;
                        if (ge.a.E(i11, charSequence)) {
                            i10 = i11;
                        }
                    }
                } else {
                    return i10 + 1;
                }
            }
            return -1;
        }
        int i12 = 0;
        int i13 = i10;
        while (i13 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 != 0 && charAt2 != ' ') {
                if (charAt2 != '\\') {
                    if (charAt2 != '(') {
                        if (charAt2 != ')') {
                            if (Character.isISOControl(charAt2)) {
                                if (i13 == i10) {
                                    return -1;
                                }
                            }
                        } else if (i12 != 0) {
                            i12--;
                        }
                    } else {
                        i12++;
                        if (i12 > 32) {
                            return -1;
                        }
                    }
                } else {
                    int i14 = i13 + 1;
                    if (ge.a.E(i14, charSequence)) {
                        i13 = i14;
                    }
                }
                i13++;
            } else if (i13 == i10) {
                return -1;
            }
            return i13;
        }
        return charSequence.length();
    }

    public static int R(int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case '[':
                    return -1;
                case '\\':
                    int i11 = i10 + 1;
                    if (!ge.a.E(i11, charSequence)) {
                        break;
                    } else {
                        i10 = i11;
                        break;
                    }
                case ']':
                    return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int S(char c10, int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (ge.a.E(i11, charSequence)) {
                    i10 = i11;
                    i10++;
                }
            }
            if (charAt == c10) {
                return i10;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static /* synthetic */ pdf.pdfreader.viewer.editor.free.datasource.sp.a T(SharePreferencesImpl sharePreferencesImpl, String str, String str2, int i10) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return sharePreferencesImpl.g(str, null, str2);
    }

    public static final PdfPreviewEntity U(nl.b bVar) {
        kotlin.jvm.internal.g.e(bVar, "<this>");
        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
        pdfPreviewEntity.setId(bVar.f22581a);
        pdfPreviewEntity.setPath(bVar.f22582b);
        pdfPreviewEntity.setName(bVar.f22583d);
        pdfPreviewEntity.setDate(bVar.f22584e);
        pdfPreviewEntity.setSize(bVar.f22585f);
        pdfPreviewEntity.setOtherStrOne(bVar.f22586g);
        pdfPreviewEntity.setOtherBoolOne(bVar.f22587h);
        pdfPreviewEntity.setFavorite(bVar.f22588i ? 1 : 0);
        pdfPreviewEntity.setFavoriteDate(bVar.f22589j);
        pdfPreviewEntity.setRecent(bVar.f22590k ? 1 : 0);
        pdfPreviewEntity.setRecentDate(bVar.f22591l);
        pdfPreviewEntity.setOtherStrTwo(F(bVar));
        return pdfPreviewEntity;
    }

    public static final void V(View view, cg.l lVar) {
        kotlin.jvm.internal.g.e(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static boolean W(Activity activity) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static void c(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (str.equals(ADRequestList.INMOBI_BANNER)) {
            cVar = b.b.D(u4.b.f30157a, "r", arrayList);
        } else if (str.equals(ADRequestList.INMOBI_NATIVE)) {
            cVar = b.b.D(u4.b.c, "r", arrayList);
        } else if (str.startsWith("in_m-nb-")) {
            cVar = b.b.D(u4.b.c, str, arrayList);
        } else if (str.startsWith("in_m-b-")) {
            cVar = b.b.D(u4.b.f30157a, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static final void e(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_B_H)) {
            cVar = b.b.D(ud.a.f30279a, "h", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_B_M)) {
            cVar = b.b.D(ud.a.f30279a, "m", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_B_R)) {
            cVar = b.b.D(ud.a.f30279a, "r", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_H)) {
            cVar = b.b.D(ud.a.f30280b, "h", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_M)) {
            cVar = b.b.D(ud.a.f30280b, "m", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_R)) {
            cVar = b.b.D(ud.a.f30280b, "r", arrayList);
        } else if (kotlin.text.j.M(str, "ad_m-b-", false)) {
            cVar = b.b.D(ud.a.f30279a, str, arrayList);
        } else if (kotlin.text.j.M(str, "ad_m-nb-", false)) {
            cVar = b.b.D(ud.a.f30280b, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static final void f(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_I_H)) {
            cVar = b.b.D(ud.a.f30281d, "h", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_I_M)) {
            cVar = b.b.D(ud.a.f30281d, "m", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_I_R)) {
            cVar = b.b.D(ud.a.f30281d, "r", arrayList);
        } else if (kotlin.text.j.M(str, "ad_m-i-", false)) {
            cVar = b.b.D(ud.a.f30281d, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static final void g(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_H)) {
            cVar = b.b.D(ud.a.c, "h", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_M)) {
            cVar = b.b.D(ud.a.c, "m", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_N_R)) {
            cVar = b.b.D(ud.a.c, "r", arrayList);
        } else if (kotlin.text.j.M(str, "ad_m-n-", false)) {
            cVar = b.b.D(ud.a.c, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static final void h(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_S_H)) {
            cVar = b.b.D(ud.a.f30283f, "h", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_S_M)) {
            cVar = b.b.D(ud.a.f30283f, "m", arrayList);
        } else if (kotlin.jvm.internal.g.a(str, ADRequestList.ADMANAGER_S_R)) {
            cVar = b.b.D(ud.a.f30283f, "r", arrayList);
        } else if (kotlin.text.j.M(str, "ad_m-o-", false)) {
            cVar = b.b.D(ud.a.f30283f, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static /* synthetic */ pdf.pdfreader.viewer.editor.free.datasource.sp.a i(SharePreferencesImpl sharePreferencesImpl, boolean z10, String str, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return sharePreferencesImpl.a(null, str, z10);
    }

    public static final Integer j(int i10) {
        return new Integer(i10);
    }

    public static void k(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public static float m(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        if (f10 > f12) {
            return f12;
        }
        return f10;
    }

    public static int n(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        if (i10 > i12) {
            return i12;
        }
        return i10;
    }

    public static final int o(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static ArrayList p(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        if (f16 < 1.0E-5f && f16 - 1.0d > 9.999999747378752E-6d) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        arrayList.add(0, pointF);
        arrayList.add(1, pointF2);
        float f17 = 1.0f - f16;
        float f18 = f16 * 3.0f;
        float f19 = f18 * f17 * f17;
        float f20 = f18 * f16 * f17;
        float f21 = f17 * f17 * f17;
        float f22 = f16 * f16 * f16;
        float f23 = f16 / f17;
        float f24 = (3.0f * f22) + f19;
        float f25 = (((f14 - (f21 * f10)) - (f19 * f10)) - (f20 * f12)) - (f22 * f12);
        int i10 = (f24 > 1.0E-5f ? 1 : (f24 == 1.0E-5f ? 0 : -1));
        if (i10 < 0) {
            return null;
        }
        pointF.x = (f25 / f24) + f10;
        pointF2.x = ((f25 * f23) / f24) + f12;
        float f26 = (((f15 - (f21 * f11)) - (f19 * f11)) - (f20 * f13)) - (f22 * f13);
        if (i10 < 0) {
            return null;
        }
        pointF.y = (f26 / f24) + f11;
        pointF2.y = ((f23 * f26) / f24) + f13;
        return arrayList;
    }

    public static gh.b q(lib.zj.office.system.f fVar, ZipPackage zipPackage, PackagePart packagePart, Element element, Map map) {
        int i10;
        eh.b j02;
        boolean z10 = false;
        if (element != null) {
            if (element.attributeValue(OperatorName.SET_LINE_WIDTH) != null) {
                i10 = Math.round((Integer.parseInt(element.attributeValue(OperatorName.SET_LINE_WIDTH)) * 96.0f) / 914400.0f);
            } else {
                i10 = 1;
            }
            Element element2 = element.element("prstDash");
            if (element2 != null && !"solid".equalsIgnoreCase(element2.attributeValue("val"))) {
                z10 = true;
            }
            if (element.element("noFill") == null && (j02 = pdf.pdfreader.viewer.editor.free.utils.t0.j0(fVar, zipPackage, packagePart, element, map)) != null) {
                gh.b bVar = new gh.b();
                bVar.f17807b = j02;
                bVar.f17806a = i10;
                bVar.c = z10;
                return bVar;
            }
            return null;
        }
        gh.b bVar2 = new gh.b();
        eh.b bVar3 = new eh.b();
        bVar3.c = (byte) 0;
        bVar3.f16571d = -9145228;
        bVar2.f17807b = bVar3;
        bVar2.f17806a = 1;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gh.b r(lib.zj.office.system.f fVar, ZipPackage zipPackage, PackagePart packagePart, Element element, Map map) {
        eh.b bVar;
        int i10;
        int i11;
        int i12 = 1;
        boolean z10 = 0;
        if (element != null) {
            if (element.attributeValue(OperatorName.SET_LINE_WIDTH) != null) {
                i10 = Math.round((Integer.parseInt(element.attributeValue(OperatorName.SET_LINE_WIDTH)) * 96.0f) / 914400.0f);
            } else {
                i10 = 1;
            }
            Element element2 = element.element("prstDash");
            if (element2 == null || "solid".equalsIgnoreCase(element2.attributeValue("val"))) {
                i12 = 0;
            }
            if (element.element("noFill") == null) {
                bVar = pdf.pdfreader.viewer.editor.free.utils.t0.j0(fVar, zipPackage, packagePart, element, map);
                i11 = i12;
            } else {
                i11 = i12;
                bVar = null;
            }
            i12 = i10;
            z10 = i11;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        gh.b bVar2 = new gh.b();
        bVar2.f17807b = bVar;
        bVar2.f17806a = i12;
        bVar2.c = z10;
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gh.b s(lib.zj.office.system.f fVar, ZipPackage zipPackage, PackagePart packagePart, th.b bVar, Element element) {
        eh.b bVar2;
        int i10;
        Element element2 = element.element("spPr").element("ln");
        Element element3 = element.element("style");
        int i11 = 1;
        boolean z10 = 0;
        z10 = 0;
        if (element2 != null) {
            if (element2.element("noFill") == null) {
                if (element2.attributeValue(OperatorName.SET_LINE_WIDTH) != null) {
                    i10 = Math.round((Integer.parseInt(element2.attributeValue(OperatorName.SET_LINE_WIDTH)) * 96.0f) / 914400.0f);
                } else {
                    i10 = 1;
                }
                Element element4 = element2.element("prstDash");
                if (element4 == null || "solid".equalsIgnoreCase(element4.attributeValue("val"))) {
                    i11 = 0;
                }
                bVar2 = BackgroundReader.instance().processBackground(fVar, zipPackage, packagePart, bVar, element2);
                if (bVar2 == null && element3 != null && element3.element("lnRef") != null) {
                    bVar2 = new eh.b();
                    bVar2.c = (byte) 0;
                    bVar2.f16571d = ReaderKit.instance().getColor(bVar, element3.element("lnRef"));
                }
                z10 = i11;
                i11 = i10;
            }
            bVar2 = null;
        } else {
            if (element3 != null && element3.element("lnRef") != null) {
                int color = ReaderKit.instance().getColor(bVar, element3.element("lnRef"));
                if ((16777215 & color) != 0) {
                    eh.b bVar3 = new eh.b();
                    bVar3.c = (byte) 0;
                    bVar3.f16571d = color;
                    bVar2 = bVar3;
                }
            }
            bVar2 = null;
        }
        if (bVar2 == null) {
            return null;
        }
        gh.b bVar4 = new gh.b();
        bVar4.f17807b = bVar2;
        bVar4.f17806a = i11;
        bVar4.c = z10;
        return bVar4;
    }

    public static ai.a t(lib.zj.office.system.f fVar, zh.h hVar, zh.h hVar2, int i10) {
        gj.i iVar;
        ai.a nVar;
        switch (i10) {
            case 4:
                return new gj.k(hVar);
            case 5:
                return new gj.l(hVar);
            case 6:
                return new gj.g(hVar);
            case 7:
                zh.b bVar = zh.b.f32374b;
                zh.f d10 = hVar.d();
                bVar.getClass();
                if (zh.b.u(d10, (short) 13)) {
                    a2.a h10 = fVar.o().h();
                    int b10 = ((zh.c) hVar.d()).b((short) 13, true);
                    if (b10 == Integer.MIN_VALUE) {
                        b10 = -1;
                    }
                    lh.b h11 = h10.h(b10);
                    if (h11 != null) {
                        if (h11.getType() != 2 && h11.getType() != 5) {
                            if (h11.getType() != 0) {
                                return null;
                            }
                            if (h11 instanceof lh.p) {
                                nVar = new gj.i(fVar, hVar2, hVar, (lh.p) h11);
                            } else if (!(h11 instanceof lh.i)) {
                                return null;
                            } else {
                                lh.s sVar = new lh.s();
                                sVar.v((lh.i) h11);
                                sVar.f20604e = h11.getBounds();
                                iVar = new gj.i(fVar, hVar2, hVar, sVar);
                            }
                        } else {
                            nVar = new gj.n(fVar, hVar2, hVar, (lh.e) h11);
                        }
                        return nVar;
                    }
                    iVar = new gj.i(fVar, hVar2, hVar, null);
                    return iVar;
                } else if (zh.b.u(hVar.d(), (short) 16)) {
                    return new gj.d(fVar, hVar2, hVar);
                } else {
                    return new gj.f(fVar, hVar2, hVar);
                }
            case 8:
            default:
                return null;
            case 9:
                if (hVar.getType() == 2) {
                    return new gj.p(hVar);
                }
                return new gj.l(hVar);
            case 10:
                return new gj.m(hVar);
            case 11:
                return new gj.c(hVar);
            case 12:
                return new gj.q(hVar);
            case 13:
                return new gj.a();
        }
    }

    public static View u(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static final kotlinx.coroutines.r0 v(Executor executor) {
        if (executor instanceof kotlinx.coroutines.i0) {
            kotlinx.coroutines.i0 i0Var = (kotlinx.coroutines.i0) executor;
        }
        return new kotlinx.coroutines.r0(executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: Exception -> 0x0074, TRY_LEAVE, TryCatch #2 {Exception -> 0x0074, blocks: (B:3:0x000a, B:5:0x0010, B:11:0x001c), top: B:49:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final nl.b w(pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r31) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.c.w(pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity):nl.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String x(android.content.Context r3) {
        /*
            java.lang.String r0 = "UmQUYxx1DHQAeWtjBmRl"
            java.lang.String r1 = "PWma4klh"
            java.lang.String r0 = ea.a.p(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = de.e.h(r0, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L15
            goto L16
        L15:
            r0 = r1
        L16:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2c
            java.lang.String r3 = "UG8-bgdyG18Rb1Bl"
            java.lang.String r2 = "VZS5lwXY"
            ea.a.p(r3, r2)
            java.lang.String r3 = "YyBXaQtlVWEpZQ=="
            java.lang.String r2 = "keYIjrKD"
            ea.a.p(r3, r2)
            goto Lc0
        L2c:
            java.lang.String r0 = "Img1bmU="
            java.lang.String r2 = "opRZLUHZ"
            java.lang.String r0 = ea.a.p(r0, r2)     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L48
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L48
            if (r3 == 0) goto L4c
            java.lang.String r3 = r3.getSimCountryIso()     // Catch: java.lang.Exception -> L48
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L4c
            r0 = r3
            goto L4d
        L48:
            r3 = move-exception
            r3.printStackTrace()
        L4c:
            r0 = r1
        L4d:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L62
            java.lang.String r3 = "Dm84bjlyK18rbwJl"
            java.lang.String r2 = "J1mMMRqB"
            ea.a.p(r3, r2)
            java.lang.String r3 = "GyAaaW0="
            java.lang.String r2 = "dK7ipoUU"
            ea.a.p(r3, r2)
            goto Lc0
        L62:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> L85
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L85
            s0.h r3 = s0.e.a(r3)     // Catch: java.lang.Exception -> L85
            int r0 = r3.d()     // Catch: java.lang.Exception -> L85
            if (r0 <= 0) goto L89
            r0 = 0
            java.util.Locale r3 = r3.c(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Exception -> L85
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L85
            if (r0 != 0) goto L89
            r0 = r3
            goto L8a
        L85:
            r3 = move-exception
            r3.printStackTrace()
        L89:
            r0 = r1
        L8a:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L9f
            java.lang.String r3 = "NW8Qbi1yMF8rbwJl"
            java.lang.String r2 = "QsVeYItq"
            ea.a.p(r3, r2)
            java.lang.String r3 = "YyBCeQpMWGM7bA=="
            java.lang.String r2 = "njNMgZXt"
            ea.a.p(r3, r2)
            goto Lc0
        L9f:
            java.util.Locale r3 = java.util.Locale.getDefault()
            if (r3 == 0) goto Lb1
            java.lang.String r3 = r3.getCountry()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lb1
            r0 = r3
            goto Lb2
        Lb1:
            r0 = r1
        Lb2:
            java.lang.String r3 = "BW9Mbj9yKV8rbwJl"
            java.lang.String r2 = "N2f9KPYc"
            ea.a.p(r3, r2)
            java.lang.String r3 = "YyBdbxphbA=="
            java.lang.String r2 = "viLC3eZ4"
            ea.a.p(r3, r2)
        Lc0:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto Lc7
            goto Lcb
        Lc7:
            java.lang.String r1 = r0.toUpperCase()
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.c.x(android.content.Context):java.lang.String");
    }

    public static ArrayList y(lh.e eVar, Rect rect) {
        int round;
        Float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList G = G();
        Float[] fArr = eVar.f20616n;
        int width = rect.width();
        int height = rect.height();
        int i16 = 0;
        if (eVar.f20617o) {
            if (fArr != null && fArr.length == 2) {
                round = a0.a.c(fArr[0], height);
                i16 = a0.a.c(fArr[1], width);
            } else {
                round = Math.round(height * 0.125f);
            }
        } else if (fArr != null && fArr.length >= 1) {
            Float f11 = fArr[0];
            if (f11 != null) {
                round = a0.a.c(f11, height);
            } else {
                round = Math.round(height * 0.125f);
            }
            if (fArr.length >= 2 && (f10 = fArr[1]) != null) {
                i16 = Math.round((f10.floatValue() - 0.5f) * width);
            }
        } else {
            round = Math.round(height * 0.125f);
        }
        int abs = (width - Math.abs(i16 * 2)) / 2;
        tg.b bVar = new tg.b();
        if (eVar.p()) {
            bVar.b(eVar.f20610k);
            bVar.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder = new PathHolder();
        if (i16 > 0) {
            pathHolder.moveTo(rect.left, rect.top + round);
            float f12 = rect.left;
            float f13 = abs;
            float f14 = 0.3333f * f13;
            float f15 = rect.top + round;
            float f16 = round * 3.333f;
            float f17 = 0.6667f * f13;
            pathHolder.cubicTo(f12 + f14, f15 - f16, f12 + f17, f15 + f16, i12 + abs, f15);
            float f18 = rect.left;
            float f19 = 1.3333f * f13;
            float f20 = rect.top + round;
            float f21 = 1.6667f * f13;
            int i17 = abs * 2;
            pathHolder.cubicTo(f18 + f19, f20 - f16, f18 + f21, f20 + f16, i13 + i17, f20);
            pathHolder.lineTo(rect.right, rect.bottom - round);
            float f22 = rect.right;
            float f23 = f22 - f14;
            float f24 = rect.bottom - round;
            pathHolder.cubicTo(f23, f24 + f16, f22 - f17, f24 - f16, i14 - abs, f24);
            float f25 = rect.right;
            float f26 = rect.bottom - round;
            pathHolder.cubicTo(f25 - f19, f26 + f16, f25 - f21, f26 - f16, i15 - i17, f26);
            pathHolder.close();
        } else {
            int i18 = abs * 2;
            pathHolder.moveTo(rect.right - i18, rect.top + round);
            float f27 = rect.right;
            float f28 = abs;
            float f29 = 1.6667f * f28;
            float f30 = rect.top + round;
            float f31 = round * 3.333f;
            float f32 = 1.3333f * f28;
            pathHolder.cubicTo(f27 - f29, f30 - f31, f27 - f32, f30 + f31, i10 - abs, f30);
            float f33 = rect.right;
            float f34 = 0.6667f * f28;
            float f35 = rect.top + round;
            float f36 = 0.3333f * f28;
            pathHolder.cubicTo(f33 - f34, f35 - f31, f33 - f36, f35 + f31, f33, f35);
            pathHolder.lineTo(rect.left + i18, rect.bottom - round);
            float f37 = rect.left;
            float f38 = rect.bottom - round;
            pathHolder.cubicTo(f37 + f29, f38 + f31, f37 + f32, f38 - f31, i11 + abs, f38);
            float f39 = rect.left;
            float f40 = rect.bottom - round;
            pathHolder.cubicTo(f39 + f34, f40 + f31, f39 + f36, f40 - f31, f39, f40);
            pathHolder.close();
        }
        bVar.c(pathHolder);
        bVar.f30011b = eVar.f20603d;
        G.add(bVar);
        return G;
    }

    public static ArrayList z(lh.e eVar, Rect rect) {
        int round;
        int round2;
        float f10;
        int round3;
        int round4;
        float f11;
        int i10;
        Float f12;
        Float f13;
        ArrayList G = G();
        Matrix c10 = e.a.f29807a.c("BannerPathBuilder");
        Float[] fArr = eVar.f20616n;
        float min = Math.min(rect.width(), rect.height());
        if (eVar.f20617o) {
            if (fArr != null && fArr.length == 3) {
                if (fArr[0].floatValue() - fArr[2].floatValue() > 0.2f) {
                    fArr[2] = Float.valueOf(fArr[0].floatValue() - 0.2f);
                }
                if (fArr[1].floatValue() > 0.75f) {
                    fArr[1] = Float.valueOf(0.75f);
                }
                float floatValue = 0.5f - (fArr[1].floatValue() / 2.0f);
                i10 = a0.a.c(fArr[0], min);
                Math.round(fArr[1].floatValue() * (min / 2.0f));
                round4 = a0.a.c(fArr[2], min);
                f11 = floatValue;
            } else {
                round = Math.round(min * 0.25f);
                Math.round((min / 2.0f) * 0.5f);
                round2 = Math.round(min * 0.125f);
                int i11 = round2;
                i10 = round;
                round4 = i11;
                f11 = 0.25f;
            }
        } else if (fArr != null && fArr.length >= 1) {
            Float f14 = fArr[0];
            if (f14 != null) {
                f10 = f14.floatValue();
                Math.round((0.5f - fArr[0].floatValue()) * min);
            } else {
                Math.round(min * 0.25f);
                f10 = 0.25f;
            }
            if (fArr.length >= 2 && (f13 = fArr[1]) != null) {
                round3 = Math.round((1.0f - f13.floatValue()) * min);
            } else {
                round3 = Math.round(0.25f * min);
            }
            if (fArr.length >= 3 && (f12 = fArr[2]) != null) {
                round4 = a0.a.c(f12, min);
            } else {
                round4 = Math.round(min * 0.125f);
            }
            f11 = f10;
            i10 = round3;
        } else {
            round = Math.round(min * 0.25f);
            Math.round((min / 2.0f) * 0.5f);
            round2 = Math.round(min * 0.125f);
            int i112 = round2;
            i10 = round;
            round4 = i112;
            f11 = 0.25f;
        }
        c10.reset();
        c10.postScale(rect.width() / min, rect.height() / min);
        if (round4 >= i10) {
            float f15 = i10;
            float f16 = min / 2.0f;
            ArrayList p10 = p(0.0f, f15, min, f15, f16, 0.0f, 0.5f);
            tg.b bVar = new tg.b();
            if (eVar.p()) {
                bVar.b(eVar.f20610k);
                bVar.f30011b = eVar.f20610k.f17807b;
            }
            PathHolder pathHolder = new PathHolder();
            pathHolder.moveTo(0.0f, f15);
            pathHolder.cubicTo((((PointF) p10.get(0)).x + f16) / 2.0f, ((PointF) p10.get(0)).y, (((PointF) p10.get(1)).x + f16) / 2.0f, ((PointF) p10.get(1)).y, min, f15);
            float f17 = min * 0.125f;
            pathHolder.lineTo(min - f17, f16);
            pathHolder.lineTo(min, min);
            pathHolder.cubicTo((((PointF) p10.get(1)).x + f16) / 2.0f, (((PointF) p10.get(1)).y + min) - f15, (((PointF) p10.get(0)).x + f16) / 2.0f, (((PointF) p10.get(0)).y + min) - f15, 0.0f, min);
            pathHolder.lineTo(f17, f16);
            pathHolder.close();
            pathHolder.transform(c10);
            pathHolder.offset(rect.left, rect.top);
            bVar.c(pathHolder);
            bVar.f30011b = eVar.f20603d;
            G.add(bVar);
            return G;
        }
        float f18 = i10;
        float f19 = min / 2.0f;
        ArrayList p11 = p(0.0f, f18, min, f18, f19, i10 - round4, 0.5f);
        PointF a10 = a(f18, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, f18, 0.125f);
        a(f18, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, f18, f11);
        float f20 = f11 + 0.125f;
        PointF a11 = a(f18, (((PointF) p11.get(0)).x + f19) / 2.0f, ((PointF) p11.get(0)).y, (((PointF) p11.get(1)).x + f19) / 2.0f, ((PointF) p11.get(1)).y, min, f18, f20);
        float f21 = 0.125f / f20;
        ArrayList p12 = p(0.0f, f18, a11.x, a11.y, a10.x, a10.y, f21);
        tg.b bVar2 = new tg.b();
        if (eVar.p()) {
            bVar2.b(eVar.f20610k);
            bVar2.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder2 = new PathHolder();
        pathHolder2.moveTo(0.0f, f18);
        pathHolder2.cubicTo(((PointF) p12.get(0)).x, ((PointF) p12.get(0)).y, ((PointF) p12.get(1)).x, ((PointF) p12.get(1)).y, a11.x, a11.y);
        pathHolder2.lineTo(a11.x, (a11.y + min) - f18);
        pathHolder2.cubicTo(((PointF) p12.get(1)).x, (((PointF) p12.get(1)).y + min) - f18, ((PointF) p12.get(0)).x, (((PointF) p12.get(0)).y + min) - f18, 0.0f, min);
        float f22 = (min + f18) / 2.0f;
        float f23 = round4;
        ArrayList p13 = p(0.0f, f22, min, f22, f19, f22 - f23, 0.5f);
        PointF a12 = a(f22, (((PointF) p13.get(0)).x + f19) / 2.0f, ((PointF) p13.get(0)).y, (((PointF) p13.get(1)).x + f19) / 2.0f, ((PointF) p13.get(1)).y, min, f22, 0.125f);
        pathHolder2.lineTo(a12.x, a12.y);
        pathHolder2.close();
        ArrayList p14 = p(min - a11.x, a11.y, min, f18, min - a10.x, a10.y, 1.0f - f21);
        pathHolder2.moveTo(min - a11.x, a11.y);
        pathHolder2.cubicTo(((PointF) p14.get(0)).x, ((PointF) p14.get(0)).y, ((PointF) p14.get(1)).x, ((PointF) p14.get(1)).y, min, f18);
        pathHolder2.lineTo(min - a12.x, a12.y);
        pathHolder2.lineTo(min, min);
        pathHolder2.cubicTo(((PointF) p14.get(1)).x, (((PointF) p14.get(1)).y + min) - f18, ((PointF) p14.get(0)).x, (((PointF) p14.get(0)).y + min) - f18, min - a11.x, (a11.y + min) - f18);
        pathHolder2.close();
        pathHolder2.transform(c10);
        pathHolder2.offset(rect.left, rect.top);
        bVar2.c(pathHolder2);
        bVar2.f30011b = eVar.f20603d;
        G.add(bVar2);
        ArrayList p15 = p(0.0f, f23, min, f23, f19, 0.0f, 0.5f);
        PointF a13 = a(f23, (((PointF) p15.get(0)).x + f19) / 2.0f, ((PointF) p15.get(0)).y, (((PointF) p15.get(1)).x + f19) / 2.0f, ((PointF) p15.get(1)).y, min, f23, f11);
        float f24 = a13.x;
        float f25 = a13.y;
        ArrayList p16 = p(f24, f25, min - f24, f25, f19, 0.0f, 0.5f);
        tg.b bVar3 = new tg.b();
        if (eVar.p()) {
            bVar3.b(eVar.f20610k);
            bVar3.f30011b = eVar.f20610k.f17807b;
        }
        PathHolder pathHolder3 = new PathHolder();
        pathHolder3.moveTo(a13.x, a13.y);
        pathHolder3.cubicTo((((PointF) p16.get(0)).x + f19) / 2.0f, ((PointF) p16.get(0)).y, (((PointF) p16.get(1)).x + f19) / 2.0f, ((PointF) p16.get(1)).y, min - a13.x, a13.y);
        pathHolder3.lineTo(min - a13.x, (a13.y + min) - f18);
        pathHolder3.cubicTo((((PointF) p16.get(1)).x + f19) / 2.0f, (((PointF) p16.get(1)).y + min) - f18, (((PointF) p16.get(0)).x + f19) / 2.0f, (((PointF) p16.get(0)).y + min) - f18, a13.x, (a13.y + min) - f18);
        pathHolder3.close();
        pathHolder3.moveTo(a13.x, (a13.y + min) - f18);
        pathHolder3.lineTo(a11.x, (a11.y + min) - f18);
        pathHolder3.moveTo(min - a13.x, (a13.y + min) - f18);
        pathHolder3.lineTo(min - a11.x, (a11.y + min) - f18);
        bVar3.c(pathHolder3);
        pathHolder3.transform(c10);
        pathHolder3.offset(rect.left, rect.top);
        bVar3.c(pathHolder3);
        bVar3.f30011b = eVar.f20603d;
        G.add(bVar3);
        return G;
    }

    @Override // q9.m
    public /* synthetic */ Object a() {
        return new y0();
    }

    @Override // n2.l
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // n2.l
    public String[] d() {
        return c;
    }

    @Override // n2.l
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        m2.f13314k.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }

    public static PointF a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        PointF pointF = new PointF();
        float f18 = 1.0f - f17;
        float f19 = f18 * f18 * f18;
        float f20 = 0.0f * f19;
        float f21 = f19 * f10;
        float f22 = 3.0f * f17;
        float f23 = f22 * f18 * f18;
        float f24 = f22 * f17 * f18;
        float f25 = (f13 * f24) + (f11 * f23) + f20;
        float f26 = f17 * f17 * f17;
        pointF.x = (f15 * f26) + f25;
        float f27 = f26 * f16;
        pointF.y = f27 + (f24 * f14) + (f23 * f12) + f21;
        return pointF;
    }
}
