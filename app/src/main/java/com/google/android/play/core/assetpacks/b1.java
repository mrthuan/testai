package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.s;
import cg.l;
import cg.p;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.ads.ADRequestList;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import lib.zj.office.PathHolder;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;
import lib.zj.pdfeditor.ReaderView;
import org.json.JSONArray;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import sg.e;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class b1 implements h5.d, c0, q9.l, Continuation, o3.d0, ua.b {

    /* renamed from: a  reason: collision with root package name */
    public static q0 f13178a = null;

    /* renamed from: b  reason: collision with root package name */
    public static b1 f13179b = null;

    /* renamed from: l  reason: collision with root package name */
    public static PopupWindow f13188l = null;

    /* renamed from: p  reason: collision with root package name */
    public static String f13192p = "";
    public static final char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f13180d = {"m", OperatorName.CONCAT, "d", "cd", "c", "xc", OperatorName.LINE_TO, "xl", "x", "ix", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "iv", OperatorName.SET_FLATNESS};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13181e = {1000, OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f13182f = {38646, 22777, 36144, 21441, 32902, 20237, 38470, 26578, 25420, 29590};

    /* renamed from: g  reason: collision with root package name */
    public static final char[] f13183g = {25342, 20336, 20191, 33836};

    /* renamed from: h  reason: collision with root package name */
    public static final char[] f13184h = {12295, 19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061, 21313};

    /* renamed from: i  reason: collision with root package name */
    public static final char[] f13185i = {21313, 30334, 21315, 19975};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f13186j = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f13187k = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

    /* renamed from: m  reason: collision with root package name */
    public static final kotlin.coroutines.c[] f13189m = new kotlin.coroutines.c[0];

    /* renamed from: n  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f13190n = new com.android.billingclient.api.a0("CLOSED", 8);

    /* renamed from: o  reason: collision with root package name */
    public static final b1 f13191o = new b1();

    public static int A(Object[] objArr) {
        Class<?> cls;
        int length = objArr.length * 1;
        for (Object obj : objArr) {
            int i10 = 8;
            if (obj != null && (cls = obj.getClass()) != Boolean.class && cls != Double.class && cls != nh.a.class) {
                i10 = StringUtil.getEncodedSize((String) obj);
            }
            length += i10;
        }
        return length;
    }

    public static final Class B(ig.c cVar) {
        kotlin.jvm.internal.g.e(cVar, "<this>");
        Class<?> a10 = ((kotlin.jvm.internal.b) cVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a10;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return Long.class;
                }
                return a10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a10;
            default:
                return a10;
        }
    }

    public static String C(int i10) {
        char[] cArr = c;
        if (i10 > 0 && i10 <= 780) {
            int i11 = 26;
            if (i10 <= 26) {
                return String.valueOf(cArr[i10 - 1]);
            }
            StringBuilder sb2 = new StringBuilder();
            int i12 = i10 / 26;
            int i13 = i10 % 26;
            if (i13 != 0) {
                i11 = i13;
            }
            for (int i14 = 0; i14 < i12; i14++) {
                sb2.append(cArr[i11 - 1]);
            }
            return sb2.toString();
        }
        return String.valueOf(cArr[0]);
    }

    public static ArrayList D(lh.h hVar, Rect rect, float f10) {
        tg.b bVar;
        ArrayList arrayList;
        eh.b bVar2;
        Rect rect2;
        gh.b bVar3;
        eh.b bVar4;
        byte b10;
        gh.b bVar5;
        byte b11;
        gh.b bVar6;
        eh.b bVar7;
        gh.b bVar8;
        eh.b bVar9;
        byte b12;
        gh.b bVar10;
        byte b13;
        gh.b bVar11;
        eh.b bVar12;
        gh.b bVar13;
        eh.b bVar14;
        byte b14;
        gh.b bVar15;
        byte b15;
        gh.b bVar16;
        eh.b bVar17;
        gh.b bVar18;
        eh.b bVar19;
        eh.b bVar20;
        PointF pointF;
        PointF pointF2;
        tg.b bVar21;
        PointF pointF3;
        tg.b bVar22;
        PointF pointF4;
        gh.b bVar23;
        eh.b bVar24;
        ArrayList F = F();
        F.clear();
        if (hVar == null) {
            return F;
        }
        if (rect == null) {
            return F;
        }
        int i10 = hVar.f20615m;
        if (i10 != 20) {
            switch (i10) {
                case 32:
                    break;
                case 33:
                    ArrayList F2 = F();
                    rect.width();
                    Float[] fArr = hVar.f20616n;
                    if (fArr != null && fArr.length >= 1 && fArr[0] != null) {
                        rect.width();
                        fArr[0].floatValue();
                    }
                    tg.b bVar25 = new tg.b();
                    Path pathHolder = new PathHolder();
                    int i11 = rect.left;
                    int i12 = rect.top;
                    int i13 = rect.right;
                    int i14 = rect.bottom;
                    if (hVar.t() && (((b13 = hVar.f20621p.c) == 1 || b13 == 2) && (bVar11 = hVar.f20610k) != null)) {
                        double d10 = i11;
                        int i15 = i13 - i11;
                        i11 = (int) (Math.ceil(((ug.b.c(bVar11.f17806a) * f10) / Math.abs(i15)) * i15 * 0.75f) + d10);
                    }
                    if (hVar.s() && (((b12 = hVar.f20622q.c) == 1 || b12 == 2) && (bVar10 = hVar.f20610k) != null)) {
                        i14 = (int) (Math.ceil(((ug.b.c(bVar10.f17806a) * f10) / Math.abs(i14 - i12)) * (i12 - i14) * 0.75f) + i14);
                    }
                    float f11 = i11;
                    pathHolder.moveTo(f11, i12);
                    pathHolder.lineTo(rect.right, rect.top);
                    float f12 = i14;
                    pathHolder.lineTo(i13, f12);
                    eh.b bVar26 = hVar.f20603d;
                    if (bVar26 == null && (bVar8 = hVar.f20610k) != null && (bVar9 = bVar8.f17807b) != null) {
                        bVar7 = bVar9;
                    } else {
                        bVar7 = bVar26;
                    }
                    bVar25.c(pathHolder);
                    bVar25.b(hVar.f20610k);
                    F2.add(bVar25);
                    if (hVar.s()) {
                        tg.b bVar27 = new tg.b();
                        bVar27.f30013e = true;
                        gh.b bVar28 = hVar.f20610k;
                        if (bVar28 != null) {
                            float f13 = rect.right;
                            pathHolder = ug.b.f(f13, f12, f13, rect.bottom, hVar.f20622q, bVar28.f17806a, f10).f30368a;
                        }
                        bVar27.c(pathHolder);
                        if (hVar.f20622q.c != 5) {
                            bVar27.f30011b = bVar7;
                        } else {
                            bVar27.b(hVar.f20610k);
                        }
                        F2.add(bVar27);
                    }
                    if (hVar.t()) {
                        tg.b bVar29 = new tg.b();
                        bVar29.f30013e = true;
                        gh.b bVar30 = hVar.f20610k;
                        if (bVar30 != null) {
                            float f14 = rect.top;
                            pathHolder = ug.b.f(f11, f14, rect.left, f14, hVar.f20621p, bVar30.f17806a, f10).f30368a;
                        }
                        bVar29.c(pathHolder);
                        if (hVar.f20621p.c != 5) {
                            bVar29.f30011b = bVar7;
                        } else {
                            bVar29.b(hVar.f20610k);
                        }
                        F2.add(bVar29);
                    }
                    return F2;
                case 34:
                    ArrayList F3 = F();
                    float width = rect.width() * 0.5f;
                    Float[] fArr2 = hVar.f20616n;
                    if (fArr2 != null && fArr2.length >= 1 && fArr2[0] != null) {
                        width = rect.width() * fArr2[0].floatValue();
                    }
                    float f15 = width;
                    tg.b bVar31 = new tg.b();
                    Path pathHolder2 = new PathHolder();
                    int i16 = rect.left;
                    int i17 = rect.top;
                    int i18 = rect.right;
                    int i19 = rect.bottom;
                    if (hVar.t() && (((b15 = hVar.f20621p.c) == 1 || b15 == 2) && (bVar16 = hVar.f20610k) != null)) {
                        double d11 = i16;
                        int i20 = i18 - i16;
                        i16 = (int) (Math.ceil(((ug.b.c(bVar16.f17806a) * f10) / Math.abs(i20)) * i20 * 0.75f) + d11);
                    }
                    if (hVar.s() && (((b14 = hVar.f20622q.c) == 1 || b14 == 2) && (bVar15 = hVar.f20610k) != null)) {
                        i18 = (int) (Math.ceil(((ug.b.c(bVar15.f17806a) * f10) / Math.abs(i18 - i16)) * (i16 - i18) * 0.75f) + i18);
                    }
                    pathHolder2.moveTo(i16, i17);
                    pathHolder2.lineTo(rect.left + f15, rect.top);
                    pathHolder2.lineTo(rect.left + f15, rect.bottom);
                    pathHolder2.lineTo(i18, i19);
                    eh.b bVar32 = hVar.f20603d;
                    if (bVar32 == null && (bVar13 = hVar.f20610k) != null && (bVar14 = bVar13.f17807b) != null) {
                        bVar12 = bVar14;
                    } else {
                        bVar12 = bVar32;
                    }
                    bVar31.c(pathHolder2);
                    bVar31.b(hVar.f20610k);
                    F3.add(bVar31);
                    if (hVar.s()) {
                        tg.b bVar33 = new tg.b();
                        bVar33.f30013e = true;
                        gh.b bVar34 = hVar.f20610k;
                        if (bVar34 != null) {
                            float f16 = rect.bottom;
                            pathHolder2 = ug.b.f(rect.left + f15, f16, rect.right, f16, hVar.f20622q, bVar34.f17806a, f10).f30368a;
                        }
                        bVar33.c(pathHolder2);
                        if (hVar.f20622q.c != 5) {
                            bVar33.f30011b = bVar12;
                        } else {
                            bVar33.b(hVar.f20610k);
                        }
                        F3.add(bVar33);
                    }
                    if (hVar.t()) {
                        tg.b bVar35 = new tg.b();
                        bVar35.f30013e = true;
                        gh.b bVar36 = hVar.f20610k;
                        if (bVar36 != null) {
                            float f17 = rect.left;
                            float f18 = rect.top;
                            pathHolder2 = ug.b.f(f17 + f15, f18, f17, f18, hVar.f20621p, bVar36.f17806a, f10).f30368a;
                        }
                        bVar35.c(pathHolder2);
                        if (hVar.f20621p.c != 5) {
                            bVar35.f30011b = bVar12;
                        } else {
                            bVar35.b(hVar.f20610k);
                        }
                        F3.add(bVar35);
                    }
                    return F3;
                default:
                    switch (i10) {
                        case 37:
                            ArrayList F4 = F();
                            tg.b bVar37 = new tg.b();
                            Path pathHolder3 = new PathHolder();
                            pathHolder3.reset();
                            pathHolder3.moveTo(rect.left, rect.top);
                            float f19 = rect.right;
                            pathHolder3.quadTo(f19, rect.top, f19, rect.bottom);
                            eh.b bVar38 = hVar.f20603d;
                            if (bVar38 == null && (bVar18 = hVar.f20610k) != null && (bVar19 = bVar18.f17807b) != null) {
                                bVar17 = bVar19;
                            } else {
                                bVar17 = bVar38;
                            }
                            bVar37.c(pathHolder3);
                            bVar37.b(hVar.f20610k);
                            F4.add(bVar37);
                            if (hVar.s()) {
                                tg.b bVar39 = new tg.b();
                                bVar39.f30013e = true;
                                gh.b bVar40 = hVar.f20610k;
                                if (bVar40 != null) {
                                    float f20 = rect.top;
                                    float f21 = rect.right;
                                    pathHolder3 = ug.b.g(rect.left, f20, f21, f20, f21, rect.bottom, hVar.f20622q, bVar40.f17806a, f10).f30368a;
                                }
                                bVar39.c(pathHolder3);
                                if (hVar.f20622q.c != 5) {
                                    bVar39.f30011b = bVar17;
                                } else {
                                    bVar39.b(hVar.f20610k);
                                }
                                F4.add(bVar39);
                            }
                            if (hVar.t()) {
                                tg.b bVar41 = new tg.b();
                                bVar41.f30013e = true;
                                gh.b bVar42 = hVar.f20610k;
                                if (bVar42 != null) {
                                    float f22 = rect.right;
                                    float f23 = rect.top;
                                    pathHolder3 = ug.b.g(f22, rect.bottom, f22, f23, rect.left, f23, hVar.f20621p, bVar42.f17806a, f10).f30368a;
                                }
                                bVar41.c(pathHolder3);
                                if (hVar.f20621p.c != 5) {
                                    bVar41.f30011b = bVar17;
                                } else {
                                    bVar41.b(hVar.f20610k);
                                }
                                F4.add(bVar41);
                            }
                            return F4;
                        case 38:
                            ArrayList F5 = F();
                            float width2 = rect.width() * 0.5f;
                            Float[] fArr3 = hVar.f20616n;
                            if (fArr3 != null && fArr3.length >= 1 && fArr3[0] != null) {
                                width2 = rect.width() * fArr3[0].floatValue();
                            }
                            float f24 = width2;
                            eh.b bVar43 = hVar.f20603d;
                            if (bVar43 == null && (bVar23 = hVar.f20610k) != null && (bVar24 = bVar23.f17807b) != null) {
                                bVar20 = bVar24;
                            } else {
                                bVar20 = bVar43;
                            }
                            if (hVar.s()) {
                                tg.b bVar44 = new tg.b();
                                bVar44.f30013e = true;
                                if (hVar.f20610k != null) {
                                    float f25 = rect.bottom;
                                    bVar22 = bVar44;
                                    ug.a g10 = ug.b.g(rect.left + f24, rect.exactCenterY(), rect.left + f24, f25, rect.right, f25, hVar.f20622q, hVar.f20610k.f17806a, f10);
                                    byte b16 = hVar.f20622q.c;
                                    if (b16 != 1 && b16 != 2) {
                                        pointF4 = null;
                                    } else {
                                        pointF4 = g10.f30369b;
                                    }
                                    bVar22.c(g10.f30368a);
                                    if (b16 != 5) {
                                        bVar22.f30011b = bVar20;
                                    } else {
                                        bVar22.b(hVar.f20610k);
                                    }
                                } else {
                                    bVar22 = bVar44;
                                    pointF4 = null;
                                }
                                F5.add(bVar22);
                                pointF = pointF4;
                            } else {
                                pointF = null;
                            }
                            if (hVar.t()) {
                                tg.b bVar45 = new tg.b();
                                bVar45.f30013e = true;
                                if (hVar.f20610k != null) {
                                    float exactCenterY = rect.exactCenterY();
                                    float f26 = rect.left;
                                    float f27 = rect.top;
                                    bVar21 = bVar45;
                                    ug.a g11 = ug.b.g(rect.left + f24, exactCenterY, f26 + f24, f27, f26, f27, hVar.f20621p, hVar.f20610k.f17806a, f10);
                                    byte b17 = hVar.f20621p.c;
                                    if (b17 != 1 && b17 != 2) {
                                        pointF3 = null;
                                    } else {
                                        pointF3 = g11.f30369b;
                                    }
                                    bVar21.c(g11.f30368a);
                                    if (b17 != 5) {
                                        bVar21.f30011b = bVar20;
                                    } else {
                                        bVar21.b(hVar.f20610k);
                                    }
                                } else {
                                    bVar21 = bVar45;
                                    pointF3 = null;
                                }
                                F5.add(bVar21);
                                pointF2 = pointF3;
                            } else {
                                pointF2 = null;
                            }
                            tg.b bVar46 = new tg.b();
                            PathHolder pathHolder4 = new PathHolder();
                            pathHolder4.reset();
                            if (pointF2 != null) {
                                PointF h10 = ug.b.h(rect.left, rect.top, pointF2.x, pointF2.y, hVar.f20621p.c);
                                pathHolder4.moveTo(h10.x, h10.y);
                            } else {
                                pathHolder4.moveTo(rect.left, rect.top);
                            }
                            float f28 = rect.left + f24;
                            pathHolder4.quadTo(f28, rect.top, f28, rect.exactCenterY());
                            pathHolder4.moveTo(rect.left + f24, rect.exactCenterY());
                            if (pointF != null) {
                                PointF h11 = ug.b.h(rect.right, rect.bottom, pointF.x, pointF.y, hVar.f20622q.c);
                                pathHolder4.quadTo(rect.left + f24, rect.bottom, h11.x, h11.y);
                            } else {
                                float f29 = rect.bottom;
                                pathHolder4.quadTo(rect.left + f24, f29, rect.right, f29);
                            }
                            bVar46.c(pathHolder4);
                            bVar46.b(hVar.f20610k);
                            F5.add(bVar46);
                            return F5;
                        case 39:
                            return z(hVar, rect, f10);
                        case 40:
                            return z(hVar, rect, f10);
                        default:
                            return null;
                    }
            }
        }
        ArrayList F6 = F();
        tg.b bVar47 = new tg.b();
        Path pathHolder5 = new PathHolder();
        int i21 = rect.left;
        int i22 = rect.top;
        int i23 = rect.right;
        int i24 = rect.bottom;
        double sqrt = Math.sqrt((rect.height() * rect.height()) + (rect.width() * rect.width()));
        if (hVar.t() && (((b11 = hVar.f20621p.c) == 1 || b11 == 2) && (bVar6 = hVar.f20610k) != null)) {
            int c10 = ug.b.c(bVar6.f17806a);
            int i25 = i23 - i21;
            if (Math.abs(i25) >= 1) {
                bVar = bVar47;
                i21 = (int) ((((c10 * f10) / sqrt) * i25 * 0.75d) + i21);
            } else {
                bVar = bVar47;
            }
            int i26 = i24 - i22;
            if (Math.abs(i26) >= 1) {
                i22 = (int) ((((c10 * f10) / sqrt) * i26 * 0.75d) + i22);
            }
        } else {
            bVar = bVar47;
        }
        if (hVar.s() && (((b10 = hVar.f20622q.c) == 1 || b10 == 2) && (bVar5 = hVar.f20610k) != null)) {
            int c11 = ug.b.c(bVar5.f17806a);
            if (Math.abs(i23 - i21) >= 1) {
                arrayList = F6;
                i23 = (int) ((((c11 * f10) / sqrt) * (i21 - i23) * 0.75d) + i23);
            } else {
                arrayList = F6;
            }
            if (Math.abs(i24 - i22) >= 1) {
                i24 = (int) ((((c11 * f10) / sqrt) * (i22 - i24) * 0.75d) + i24);
            }
        } else {
            arrayList = F6;
        }
        pathHolder5.moveTo(i21, i22);
        pathHolder5.lineTo(i23, i24);
        eh.b bVar48 = hVar.f20603d;
        if (bVar48 == null && (bVar3 = hVar.f20610k) != null && (bVar4 = bVar3.f17807b) != null) {
            bVar2 = bVar4;
        } else {
            bVar2 = bVar48;
        }
        tg.b bVar49 = bVar;
        bVar49.f30011b = bVar2;
        bVar49.b(hVar.f20610k);
        bVar49.c(pathHolder5);
        ArrayList arrayList2 = arrayList;
        arrayList2.add(bVar49);
        if (hVar.s()) {
            tg.b bVar50 = new tg.b();
            bVar50.f30013e = true;
            gh.b bVar51 = hVar.f20610k;
            rect2 = rect;
            if (bVar51 != null) {
                pathHolder5 = ug.b.f(rect2.left, rect2.top, rect2.right, rect2.bottom, hVar.f20622q, bVar51.f17806a, f10).f30368a;
            }
            bVar50.c(pathHolder5);
            if (hVar.f20622q.c != 5) {
                bVar50.f30011b = bVar2;
            } else {
                bVar50.b(hVar.f20610k);
            }
            arrayList2.add(bVar50);
        } else {
            rect2 = rect;
        }
        if (hVar.t()) {
            tg.b bVar52 = new tg.b();
            bVar52.f30013e = true;
            gh.b bVar53 = hVar.f20610k;
            if (bVar53 != null) {
                pathHolder5 = ug.b.f(rect2.right, rect2.bottom, rect2.left, rect2.top, hVar.f20621p, bVar53.f17806a, f10).f30368a;
            }
            bVar52.c(pathHolder5);
            if (hVar.f20621p.c != 5) {
                bVar52.f30011b = bVar2;
            } else {
                bVar52.b(hVar.f20610k);
            }
            arrayList2.add(bVar52);
        }
        return arrayList2;
    }

    public static String E(int i10, int i11) {
        String str;
        String str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        if (i11 != 22) {
            if (i11 != 30) {
                if (i11 != 31) {
                    if (i11 != 38) {
                        if (i11 != 39) {
                            switch (i11) {
                                case 1:
                                    return G(i10).toUpperCase();
                                case 2:
                                    return G(i10);
                                case 3:
                                    return C(i10).toUpperCase();
                                case 4:
                                    return C(i10);
                                case 5:
                                    int i12 = i10 % 10;
                                    if (i12 == 1) {
                                        str = "st";
                                    } else if (i12 == 2) {
                                        str = "nd";
                                    } else if (i12 == 3) {
                                        str = "rd";
                                    } else {
                                        str = "th";
                                    }
                                    return String.valueOf(i10) + str;
                                case 6:
                                    String V = V(String.valueOf(i10));
                                    String[] strArr = new String[5];
                                    int length = V.length() % 3;
                                    if (length != 1) {
                                        if (length == 2) {
                                            V = V.concat(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                                        }
                                    } else {
                                        V = V.concat("00");
                                    }
                                    String str3 = "";
                                    for (int i13 = 0; i13 <= (V.length() / 3) - 1; i13++) {
                                        int i14 = i13 * 3;
                                        String V2 = V(V.substring(i14, i14 + 3));
                                        strArr[i13] = V2;
                                        if (!V2.equals("000")) {
                                            if (i13 != 0) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(b0(strArr[i13]));
                                                sb2.append(" ");
                                                String valueOf = String.valueOf(i13);
                                                String[] strArr2 = new String[5];
                                                strArr2[0] = "";
                                                strArr2[1] = "thousand";
                                                strArr2[2] = "million";
                                                strArr2[3] = "billion";
                                                str3 = androidx.activity.f.o(sb2, strArr2[Integer.parseInt(valueOf)], " ", str3);
                                            } else {
                                                str3 = b0(strArr[i13]);
                                            }
                                        } else {
                                            str3 = b0(strArr[i13]) + str3;
                                        }
                                    }
                                    if (str3.equals("")) {
                                        return String.valueOf(0);
                                    }
                                    return Character.toUpperCase(str3.charAt(0)) + str3.substring(1);
                                default:
                                    return String.valueOf(i10);
                            }
                        }
                        char[] cArr = f13184h;
                        if (i10 > 0 && i10 <= 99999) {
                            if (i10 <= 9) {
                                return String.valueOf(cArr[i10]);
                            }
                            StringBuilder sb3 = new StringBuilder();
                            String valueOf2 = String.valueOf(i10);
                            int length2 = valueOf2.length();
                            boolean z10 = false;
                            for (int i15 = 0; i15 < length2; i15++) {
                                int charAt = valueOf2.charAt(i15) - '0';
                                if (charAt > 0) {
                                    sb3.append(cArr[charAt]);
                                    int i16 = (length2 - i15) - 2;
                                    if (i16 >= 0) {
                                        sb3.append(f13185i[i16]);
                                    }
                                    z10 = true;
                                } else if (z10 && i15 != length2 - 1) {
                                    sb3.append(cArr[0]);
                                    z10 = false;
                                }
                            }
                            if (sb3.charAt(sb3.length() - 1) == cArr[0]) {
                                sb3.deleteCharAt(sb3.length() - 1);
                            }
                            if (i10 > 10 && i10 < 20 && sb3.charAt(0) == cArr[1]) {
                                sb3.deleteCharAt(0);
                            }
                            return sb3.toString();
                        }
                        return String.valueOf(cArr[0]);
                    }
                    char[] cArr2 = f13182f;
                    if (i10 > 0 && i10 <= 99999) {
                        if (i10 <= 9) {
                            return String.valueOf(cArr2[i10]);
                        }
                        StringBuilder sb4 = new StringBuilder();
                        String valueOf3 = String.valueOf(i10);
                        int length3 = valueOf3.length();
                        boolean z11 = false;
                        for (int i17 = 0; i17 < length3; i17++) {
                            int charAt2 = valueOf3.charAt(i17) - '0';
                            if (charAt2 > 0) {
                                sb4.append(cArr2[charAt2]);
                                int i18 = (length3 - i17) - 2;
                                if (i18 >= 0) {
                                    sb4.append(f13183g[i18]);
                                }
                                z11 = true;
                            } else if (z11 && i17 != length3 - 1) {
                                sb4.append(cArr2[0]);
                                z11 = false;
                            }
                        }
                        if (sb4.charAt(sb4.length() - 1) == cArr2[0]) {
                            sb4.deleteCharAt(sb4.length() - 1);
                        }
                        return sb4.toString();
                    }
                    return String.valueOf(cArr2[0]);
                } else if (i10 <= 12) {
                    return f13187k[i10 - 1];
                } else {
                    return String.valueOf(i10);
                }
            } else if (i10 <= 10) {
                return f13186j[i10 - 1];
            } else {
                return String.valueOf(i10);
            }
        }
        StringBuilder sb5 = new StringBuilder();
        if (i10 >= 10) {
            str2 = "";
        }
        sb5.append(str2);
        sb5.append(String.valueOf(i10));
        return sb5.toString();
    }

    public static ArrayList F() {
        return e.a.f29807a.b("LinePathBuilder");
    }

    public static String G(int i10) {
        String[] strArr = f13180d;
        if (i10 <= 0) {
            return strArr[12];
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 13; i11++) {
            String str = strArr[i11];
            int i12 = f13181e[i11];
            while (i10 >= i12) {
                i10 -= i12;
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String H() {
        String h10 = de.e.h(ea.a.p("QmgociNQV2YOaQpleGk5aw==", "Hz1IF3nX"), "");
        if (TextUtils.isEmpty(h10)) {
            return ea.a.p("J3RFcAo6GC8pdGRkEGUYdF1vG2ctdEtpBGQsczZyC2U8L2RGF3l2Mw==", "cdnOjYBb");
        }
        return h10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r2.equals(ea.a.p("N2xCeA==", "mz6BOe41")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r2.equals(ea.a.p("N2xCbQ==", "rsFzKuyn")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r2.equals(ea.a.p("P3BFeA==", "DALimmlg")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (r2.equals(ea.a.p("P3BFbQ==", "6rbX1r6l")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r2.equals(ea.a.p("P29FeA==", "CwIkxEZp")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r2.equals(ea.a.p("Q28_bQ==", "8ai0NM9R")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (r2.equals(ea.a.p("WXAuZw==", "5HQaeNJQ")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
        if (r2.equals(ea.a.p("Bm9NeA==", "PGb97unI")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
        if (r2.equals(ea.a.p("FW9GbQ==", "dqq2FFBh")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if (r2.equals(ea.a.p("V28oeA==", "tCI1xaEY")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
        if (r2.equals(ea.a.p("Pmx0", "gEF89eYO")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
        if (r2.equals(ea.a.p("LGxz", "x6TH6HdU")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
        if (r2.equals(ea.a.p("HnB0", "wEnWYUsq")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
        if (r2.equals(ea.a.p("Q290", "epGSZriq")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
        if (r2.equals(ea.a.p("P25n", "mWo63sQU")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (r2.equals(ea.a.p("JXBn", "ZyNBGBCT")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r2.equals(ea.a.p("S2w_eA==", "uva5vYEt")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
        if (r2.equals(ea.a.p("V290", "RSrYEKWL")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ac, code lost:
        if (r2.equals(ea.a.p("K29j", "AMdQKoel")) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return ea.a.p("UnA7bBpjA3Qbb1ovH24yLilzH2U-YyZs", "aRNoQPmz");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        return ea.a.p("IHAobBtjKXQhbwgvQm4zLlVzf3Amd1NyBG8YbnQ=", "6JAXrHpL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return ea.a.p("LnBBbBBjVnQzbyQvGmMcZUEtHXQ3ZQRt", "UcGjjlsv");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        return ea.a.p("LnBBbBBjVnQzbyQvGHMfb0dk", "1gJTv4QL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r2.equals(ea.a.p("N2xFbQ==", "GEiWC6Wo")) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String I(java.io.File r2) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.b1.I(java.io.File):java.lang.String");
    }

    public static void J(Activity activity, boolean z10, boolean z11) {
        kotlin.jvm.internal.g.e(activity, "activity");
        mo.c.C0 = false;
        mo.c.D0 = false;
        int l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(activity, 0, ea.a.p("RWkudyxtDWRl", "6Is9YjSr"));
        if (l10 == 0) {
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = true;
        } else if (1 == l10) {
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = false;
        } else if (2 == l10) {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        } else if (3 == l10) {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = false;
        } else {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        }
        K(activity, z10, z11);
    }

    public static final void K(Context context, boolean z10, boolean z11) {
        boolean z12;
        kotlin.jvm.internal.g.e(context, "context");
        FlutterEncryptConfig.c = z10;
        boolean z13 = false;
        if (z10 && !z11) {
            pdf.pdfreader.viewer.editor.free.utils.c1 c1Var = pdf.pdfreader.viewer.editor.free.utils.c1.f28564a;
            String p10 = ea.a.p("MQ==", "u5XrQMTV");
            String h10 = de.e.h(ea.a.p("QGgqchZfBGkeZWtvGWU4XyVkbWMpdS10Rnk5cydpJGNo", "4fPPaG3R"), "");
            if (android.support.v4.media.session.h.b("LG9fZhBn", "YokmEyBG", h10) == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                p10 = h10;
            }
            if (TextUtils.equals(p10, ea.a.p("MQ==", "Mk6EsExM"))) {
                z13 = true;
            }
        }
        FlutterEncryptConfig.f25880d = z13;
    }

    public static final kotlin.coroutines.c L(kotlin.coroutines.c cVar) {
        ContinuationImpl continuationImpl;
        kotlin.coroutines.c<Object> intercepted;
        kotlin.jvm.internal.g.e(cVar, "<this>");
        if (cVar instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) cVar;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl != null && (intercepted = continuationImpl.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static final boolean M(File file) {
        boolean z10;
        kotlin.jvm.internal.g.e(file, "<this>");
        if (TextUtils.isEmpty(file.getName())) {
            return false;
        }
        String A0 = bg.b.A0(file);
        Locale locale = Locale.getDefault();
        String f10 = a6.h.f("VGU_RBZmA3UedBwp", "5jpIu4hI", locale, A0, locale);
        kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nRS4ubwVvQWVBQypzFigObxFhWGUp", "lZI62PaF"));
        if (!kotlin.jvm.internal.g.a(f10, ea.a.p("N2xz", "yK6KkJMg")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("GmwfeA==", "6gblh61q")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("D2x0", "9JwhUoA4")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("N2xFeA==", "XgZn2ep3")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("S2w_bQ==", "m0ld0kiH")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("S2w4bQ==", "F54pqViE")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("UHN2", "boPR7S03"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean N(File file) {
        kotlin.jvm.internal.g.e(file, "<this>");
        if (!TextUtils.isEmpty(file.getName())) {
            String A0 = bg.b.A0(file);
            Locale locale = Locale.getDefault();
            String f10 = a6.h.f("VGU_RBZmA3UedBwp", "INsHb5JN", locale, A0, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nYy4Gb3xvMWVBQypzFigObxFhWGUp", "Jr0FFsw4"));
            if (kotlin.jvm.internal.g.a(f10, ea.a.p("P2Rm", "VLDBCtoU")) && file.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean O(File file) {
        boolean z10;
        kotlin.jvm.internal.g.e(file, "<this>");
        if (TextUtils.isEmpty(file.getName())) {
            return false;
        }
        String A0 = bg.b.A0(file);
        Locale locale = Locale.getDefault();
        String f10 = a6.h.f("VGU_RBZmA3UedBwp", "G5oenebb", locale, A0, locale);
        kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnES4jbyBvL2U9Q1BzHChbbzlhJmUp", "3dde8WlX"));
        if (!kotlin.jvm.internal.g.a(f10, ea.a.p("Q3B0", "gOpn5vIU")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("Q3A_eA==", "XZD5RYFC")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("Q290", "UxrvRR0l")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("Q3A_bQ==", "jq0kKsmg")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("HG85eA==", "H1lMI2dT")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("OG8QbQ==", "4ZHdvLns"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean P(File file) {
        kotlin.jvm.internal.g.e(file, "<this>");
        if (!N(file) && !O(file) && !M(file) && !Q(file)) {
            return false;
        }
        return true;
    }

    public static final boolean Q(File file) {
        boolean z10;
        kotlin.jvm.internal.g.e(file, "<this>");
        if (TextUtils.isEmpty(file.getName())) {
            return false;
        }
        String A0 = bg.b.A0(file);
        Locale locale = Locale.getDefault();
        String f10 = a6.h.f("KGVFRBxmVnU2dGIp", "R8Fvouh8", locale, A0, locale);
        kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnES49bzlvDmU9Q1BzHChbbzlhJmUp", "T2gN8Iuy"));
        if (!kotlin.jvm.internal.g.a(f10, ea.a.p("K29j", "irFsMkDf")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("K29SeA==", "6wLJIETY")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("K290", "wFC4BwEM")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("V28_eA==", "TMN5rWwW")) && !kotlin.jvm.internal.g.a(f10, ea.a.p("V28_bQ==", "Q6SvXnnP"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static void R(String str, ArrayList arrayList) {
        yd.c cVar;
        if (str != null && !str.equals("")) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    androidx.activity.s.l(string, arrayList, arrayList2);
                    c.e(string, arrayList, arrayList2);
                    androidx.activity.s.k(string, arrayList, arrayList2);
                    c.c(string, arrayList, arrayList2);
                    if (string.equals("s")) {
                        cVar = b.b.D(le.a.f20548a, "n", arrayList);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void S(String str, ArrayList arrayList) {
        yd.c cVar;
        yd.c cVar2;
        if (str != null && !str.equals("")) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    androidx.activity.s.m(string, arrayList, arrayList2);
                    androidx.activity.s.q(string, arrayList, arrayList2);
                    c.f(string, arrayList, arrayList2);
                    c.h(string, arrayList, arrayList2);
                    yd.c cVar3 = null;
                    if (string.equals(ADRequestList.PANGLE_INTERSTITIAL)) {
                        cVar = b.b.D(v4.b.f30542d, "r", arrayList);
                    } else if (string.startsWith("pg-i-")) {
                        cVar = b.b.D(v4.b.f30542d, string, arrayList);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                    if (string.equals(ADRequestList.PANGLE_OPEN_AD)) {
                        cVar2 = b.b.D(v4.b.f30544f, "r", arrayList);
                    } else if (string.startsWith("pg-o-")) {
                        cVar2 = b.b.D(v4.b.f30544f, string, arrayList);
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        arrayList2.add(cVar2);
                    }
                    if (string.equals(ADRequestList.INMOBI_INTERSTITIAL)) {
                        cVar3 = b.b.D(u4.b.f30159d, "r", arrayList);
                    } else if (string.startsWith("in_m-i-")) {
                        cVar3 = b.b.D(u4.b.f30159d, string, arrayList);
                    }
                    if (cVar3 != null) {
                        arrayList2.add(cVar3);
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void T(String str, ArrayList arrayList) {
        yd.c cVar;
        yd.c cVar2;
        if (str != null && !str.equals("")) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    androidx.activity.s.p(string, arrayList, arrayList2);
                    c.g(string, arrayList, arrayList2);
                    yd.c cVar3 = null;
                    if (string.equals(ADRequestList.PANGLE_NATIVE)) {
                        cVar = b.b.D(v4.b.f30541b, "r", arrayList);
                    } else if (string.startsWith("pg-n-")) {
                        cVar = b.b.D(v4.b.f30541b, string, arrayList);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                    if (string.equals(ADRequestList.INMOBI_NATIVE)) {
                        cVar2 = b.b.D(u4.b.f30158b, "r", arrayList);
                    } else if (string.startsWith("in_m-n-")) {
                        cVar2 = b.b.D(u4.b.f30158b, string, arrayList);
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        arrayList2.add(cVar2);
                    }
                    if (string.equals("s")) {
                        cVar3 = b.b.D(le.a.f20549b, "n", arrayList);
                    }
                    if (cVar3 != null) {
                        arrayList2.add(cVar3);
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static Object[] U(LittleEndianInput littleEndianInput, int i10) {
        Object obj;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            byte readByte = littleEndianInput.readByte();
            if (readByte != 0) {
                if (readByte != 1) {
                    if (readByte != 2) {
                        if (readByte != 4) {
                            if (readByte == 16) {
                                int readUShort = littleEndianInput.readUShort();
                                littleEndianInput.readUShort();
                                littleEndianInput.readInt();
                                obj = nh.a.b(readUShort);
                            } else {
                                throw new RuntimeException(a0.a.g("Unknown grbit value (", readByte, ")"));
                            }
                        } else {
                            byte readLong = (byte) littleEndianInput.readLong();
                            if (readLong != 0) {
                                if (readLong == 1) {
                                    obj = Boolean.TRUE;
                                } else {
                                    throw new RuntimeException(a0.a.g("unexpected boolean encoding (", readLong, ")"));
                                }
                            } else {
                                obj = Boolean.FALSE;
                            }
                        }
                    } else {
                        obj = StringUtil.readUnicodeString(littleEndianInput);
                    }
                } else {
                    obj = new Double(littleEndianInput.readDouble());
                }
            } else {
                littleEndianInput.readLong();
                obj = null;
            }
            objArr[i11] = obj;
        }
        return objArr;
    }

    public static String V(String str) {
        int length = str.length();
        String[] strArr = new String[str.length()];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            strArr[i10] = str.substring(i10, i11);
            i10 = i11;
        }
        String str2 = "";
        for (int i12 = length - 1; i12 >= 0; i12--) {
            StringBuilder k10 = a0.a.k(str2);
            k10.append(strArr[i12]);
            str2 = k10.toString();
        }
        return str2;
    }

    public static int W(byte b10, byte b11, byte b12) {
        return ((b10 << 16) & 16711680) | (-16777216) | ((b11 << 8) & 65280) | (b12 & 255);
    }

    public static int X(int i10, int i11, int i12) {
        return ((i10 << 16) & 16711680) | (-16777216) | ((i11 << 8) & 65280) | (i12 & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static void Y() {
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        ig.h<Object> hVar = hVarArr[1];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32402f;
        if (!pdf.pdfreader.viewer.editor.free.utils.t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx0DW8ec2t1GmUJZCV5", "YrpDamjk"));
            aVar.c(hVarArr[1], Long.valueOf(System.currentTimeMillis()));
        }
        tn.a.a(m10, ea.a.p("LG9DZSZ0WG82cxV1BmU=", "i6gyIv3F"));
    }

    public static final String Z(Throwable th2) {
        kotlin.jvm.internal.g.e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.g.d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static String a0(String str) {
        if (str.substring(1, 2).equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            return d0(str);
        }
        if (str.substring(1, 2).equals("1")) {
            String[] strArr = new String[20];
            strArr[10] = "ten";
            strArr[11] = "eleven";
            strArr[12] = "twelve";
            strArr[13] = "thirteen";
            strArr[14] = "fourteen";
            strArr[15] = "fifteen";
            strArr[16] = "sixteen";
            strArr[17] = "seventeen";
            strArr[18] = "eighteen";
            strArr[19] = "nineteen";
            return strArr[Integer.parseInt(str.substring(1, 3))];
        } else if (str.substring(2, 3).equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            return c0(str);
        } else {
            return c0(str) + "-" + d0(str);
        }
    }

    public static String b0(String str) {
        if (str.substring(0, 1).equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
            return a0(str);
        }
        if (str.substring(1, 3).equals("00")) {
            return e0(str) + " hundred";
        }
        return e0(str) + " hundred " + a0(str);
    }

    public static String c0(String str) {
        String[] strArr = new String[10];
        strArr[1] = "ten";
        strArr[2] = "twenty";
        strArr[3] = "thirty";
        strArr[4] = "forty";
        strArr[5] = "fifty";
        strArr[6] = "sixty";
        strArr[7] = "seventy";
        strArr[8] = "eighty";
        strArr[9] = "ninety";
        return strArr[Integer.parseInt(str.substring(1, 2))];
    }

    public static String d0(String str) {
        return new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}[Integer.parseInt(str.substring(2, 3))];
    }

    public static String e0(String str) {
        return new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}[Integer.parseInt(str.substring(0, 1))];
    }

    public static synchronized q0 l(Context context) {
        q0 q0Var;
        synchronized (b1.class) {
            if (f13178a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                f13178a = new q0(new q2(context));
            }
            q0Var = f13178a;
        }
        return q0Var;
    }

    public static void m(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.p pVar, cg.l onBackPressed, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            pVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kotlin.jvm.internal.g.e(onBackPressed, "onBackPressed");
        androidx.activity.p pVar2 = new androidx.activity.p(onBackPressed, z10);
        if (pVar != null) {
            onBackPressedDispatcher.a(pVar, pVar2);
        } else {
            onBackPressedDispatcher.b(pVar2);
        }
    }

    public static final void n(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.g.e(th2, "<this>");
        kotlin.jvm.internal.g.e(exception, "exception");
        if (th2 != exception) {
            yf.b.f32140a.a(th2, exception);
        }
    }

    public static int o(double d10, int i10) {
        if (d10 > 0.0d) {
            i10 = (int) (((255 - i10) * d10) + i10);
        } else if (d10 < 0.0d) {
            i10 = (int) ((d10 + 1.0d) * i10);
        }
        if (i10 > 255) {
            return FunctionEval.FunctionID.EXTERNAL_FUNC;
        }
        return i10;
    }

    public static void p(StringBuilder sb2, androidx.lifecycle.p pVar) {
        int lastIndexOf;
        if (pVar == null) {
            sb2.append("null");
            return;
        }
        String simpleName = pVar.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = pVar.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(pVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g.e(r6, r0)
            r6 = 1
            r0 = 0
            r1 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r2 = "ad_config_rate"
            java.lang.String r3 = "{}"
            java.lang.String r2 = de.e.h(r2, r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = "adConfigRate"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L3c
            int r3 = r2.length()     // Catch: java.lang.Exception -> L3c
            if (r3 != 0) goto L1e
            r3 = r6
            goto L1f
        L1e:
            r3 = r0
        L1f:
            if (r3 == 0) goto L22
            goto L40
        L22:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r3.<init>(r2)     // Catch: java.lang.Exception -> L3c
            boolean r2 = r3.has(r7)     // Catch: java.lang.Exception -> L3c
            if (r2 == 0) goto L40
            org.json.JSONObject r7 = r3.getJSONObject(r7)     // Catch: java.lang.Exception -> L3c
            boolean r2 = r7.has(r8)     // Catch: java.lang.Exception -> L3c
            if (r2 == 0) goto L40
            int r7 = r7.getInt(r8)     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r7 = move-exception
            r7.printStackTrace()
        L40:
            r7 = r1
        L41:
            double r2 = java.lang.Math.random()
            double r4 = (double) r1
            double r2 = r2 * r4
            int r8 = (int) r2
            if (r8 >= r7) goto L4b
            goto L4c
        L4b:
            r6 = r0
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.b1.q(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static final boolean r(String string, String[] strArr) {
        kotlin.jvm.internal.g.e(string, "string");
        for (String str : strArr) {
            if (kotlin.jvm.internal.g.a(str, string)) {
                return true;
            }
        }
        return false;
    }

    public static final kotlin.coroutines.c s(final cg.l lVar, final kotlin.coroutines.c completion) {
        kotlin.jvm.internal.g.e(lVar, "<this>");
        kotlin.jvm.internal.g.e(completion, "completion");
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(completion);
        }
        final CoroutineContext context = completion.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(completion, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(completion);
                    this.$this_createCoroutineUnintercepted$inlined = lVar;
                    g.c(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj) {
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            this.label = 2;
                            s.u0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.label = 1;
                    s.u0(obj);
                    g.c(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    l lVar2 = this.$this_createCoroutineUnintercepted$inlined;
                    k.c(1, lVar2);
                    return lVar2.invoke(this);
                }
            };
        }
        return new ContinuationImpl(completion, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion, context);
                this.$this_createCoroutineUnintercepted$inlined = lVar;
                g.c(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.label = 2;
                        s.u0(obj);
                        return obj;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 1;
                s.u0(obj);
                g.c(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                l lVar2 = this.$this_createCoroutineUnintercepted$inlined;
                k.c(1, lVar2);
                return lVar2.invoke(this);
            }
        };
    }

    public static final kotlin.coroutines.c t(final cg.p pVar, final Object obj, final kotlin.coroutines.c completion) {
        kotlin.jvm.internal.g.e(pVar, "<this>");
        kotlin.jvm.internal.g.e(completion, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(obj, completion);
        }
        final CoroutineContext context = completion.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(completion, pVar, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(completion);
                    this.$this_createCoroutineUnintercepted$inlined = pVar;
                    this.$receiver$inlined = obj;
                    g.c(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public Object invokeSuspend(Object obj2) {
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            this.label = 2;
                            s.u0(obj2);
                            return obj2;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.label = 1;
                    s.u0(obj2);
                    g.c(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    p pVar2 = this.$this_createCoroutineUnintercepted$inlined;
                    k.c(2, pVar2);
                    return pVar2.invoke(this.$receiver$inlined, this);
                }
            };
        }
        return new ContinuationImpl(completion, context, pVar, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion, context);
                this.$this_createCoroutineUnintercepted$inlined = pVar;
                this.$receiver$inlined = obj;
                g.c(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object obj2) {
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        this.label = 2;
                        s.u0(obj2);
                        return obj2;
                    }
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.label = 1;
                s.u0(obj2);
                g.c(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                p pVar2 = this.$this_createCoroutineUnintercepted$inlined;
                k.c(2, pVar2);
                return pVar2.invoke(this.$receiver$inlined, this);
            }
        };
    }

    public static void u(LittleEndianOutput littleEndianOutput, Object[] objArr) {
        for (Object obj : objArr) {
            long j10 = 0;
            if (obj == null) {
                littleEndianOutput.writeByte(0);
                littleEndianOutput.writeLong(0L);
            } else if (obj instanceof Boolean) {
                littleEndianOutput.writeByte(4);
                if (((Boolean) obj).booleanValue()) {
                    j10 = 1;
                }
                littleEndianOutput.writeLong(j10);
            } else if (obj instanceof Double) {
                littleEndianOutput.writeByte(1);
                littleEndianOutput.writeDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                littleEndianOutput.writeByte(2);
                StringUtil.writeUnicodeString(littleEndianOutput, (String) obj);
            } else if (obj instanceof nh.a) {
                littleEndianOutput.writeByte(16);
                littleEndianOutput.writeLong(((nh.a) obj).f22487a);
            } else {
                throw new IllegalStateException("Unexpected value type (" + obj.getClass().getName() + OperatorName.SHOW_TEXT_LINE);
            }
        }
    }

    public static final Object v(kotlinx.coroutines.internal.q qVar, long j10, cg.p pVar) {
        boolean z10;
        while (true) {
            if (qVar.c >= j10 && !qVar.c()) {
                return qVar;
            }
            Object obj = kotlinx.coroutines.internal.c.f20170a.get(qVar);
            com.android.billingclient.api.a0 a0Var = f13190n;
            if (obj == a0Var) {
                return a0Var;
            }
            kotlinx.coroutines.internal.q qVar2 = (kotlinx.coroutines.internal.q) ((kotlinx.coroutines.internal.c) obj);
            if (qVar2 == null) {
                qVar2 = (kotlinx.coroutines.internal.q) pVar.invoke(Long.valueOf(qVar.c + 1), qVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.c.f20170a;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(qVar) != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    if (qVar.c()) {
                        qVar.d();
                    }
                }
            }
            qVar = qVar2;
        }
    }

    public static String w(hh.a aVar, hh.b bVar, ai.c cVar, int i10) {
        char[] cArr;
        int i11;
        if (bVar.c == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (char c10 : bVar.c) {
            if (c10 >= 0 && c10 < '\t') {
                hh.b a10 = aVar.a(c10);
                int i12 = a10.f18336a;
                if (cVar.f508a == 1) {
                    i11 = a10.f18342h;
                } else {
                    i11 = a10.f18341g;
                }
                int i13 = i11 + i12;
                if (c10 < i10 && i13 > i12) {
                    i13--;
                }
                stringBuffer.append(E(i13, a10.f18337b));
            } else {
                stringBuffer.append(c10);
            }
        }
        if (bVar.f18338d == 1) {
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public static final CoroutineSingletons x() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public static int y(double d10, int i10) {
        return Color.rgb(o(d10, Color.red(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), o(d10, Color.green(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC), o(d10, Color.blue(i10) & FunctionEval.FunctionID.EXTERNAL_FUNC));
    }

    public static ArrayList z(lh.h hVar, Rect rect, float f10) {
        byte b10;
        gh.b bVar;
        eh.b bVar2;
        ArrayList F = F();
        if (hVar == null) {
            return F;
        }
        if (rect == null) {
            return F;
        }
        float width = rect.width() * 0.5f;
        float height = rect.height() * 0.5f;
        Float[] fArr = hVar.f20616n;
        if (fArr != null && fArr.length >= 1) {
            if (fArr[0] != null) {
                width = rect.width() * fArr[0].floatValue();
            }
            if (fArr[1] != null) {
                height = rect.height() * fArr[1].floatValue();
            }
        }
        float f11 = rect.left + width;
        float f12 = rect.top;
        float f13 = (height / 2.0f) + f12;
        float f14 = (rect.right + f11) / 2.0f;
        float f15 = f12 + height;
        tg.b bVar3 = new tg.b();
        Path pathHolder = new PathHolder();
        pathHolder.reset();
        pathHolder.moveTo(rect.left, rect.top);
        pathHolder.quadTo(f11, rect.top, f11, f13);
        pathHolder.moveTo(f11, f13);
        pathHolder.quadTo(f11, f15, f14, f15);
        pathHolder.moveTo(f14, f15);
        float f16 = rect.right;
        pathHolder.quadTo(f16, f15, f16, rect.bottom);
        eh.b bVar4 = hVar.f20603d;
        if (bVar4 == null && (bVar = hVar.f20610k) != null && (bVar2 = bVar.f17807b) != null) {
            bVar4 = bVar2;
        }
        bVar3.c(pathHolder);
        bVar3.b(hVar.f20610k);
        F.add(bVar3);
        if (hVar.s()) {
            tg.b bVar5 = new tg.b();
            bVar5.f30013e = true;
            gh.b bVar6 = hVar.f20610k;
            if (bVar6 != null) {
                float f17 = rect.right;
                pathHolder = ug.b.g(f14, f15, f17, f15, f17, rect.bottom, hVar.f20622q, bVar6.f17806a, f10).f30368a;
            }
            bVar5.c(pathHolder);
            if (hVar.f20622q.c != 5) {
                bVar5.f30011b = bVar4;
            } else {
                bVar5.b(hVar.f20610k);
            }
            F.add(bVar5);
        }
        if (hVar.t()) {
            tg.b bVar7 = new tg.b();
            bVar7.f30013e = true;
            gh.b bVar8 = hVar.f20610k;
            if (bVar8 != null) {
                float f18 = rect.top;
                b10 = 5;
                pathHolder = ug.b.g(f11, f13, f11, f18, rect.left, f18, hVar.f20621p, bVar8.f17806a, f10).f30368a;
            } else {
                b10 = 5;
            }
            bVar7.c(pathHolder);
            if (hVar.f20621p.c != b10) {
                bVar7.f30011b = bVar4;
            } else {
                bVar7.b(hVar.f20610k);
            }
            F.add(bVar7);
        }
        return F;
    }

    @Override // com.google.android.play.core.assetpacks.c0
    public int a(int i10, String str) {
        return i10;
    }

    @Override // h5.d
    public d5.b b() {
        return null;
    }

    @Override // h5.d
    public String c(Activity context) {
        kotlin.jvm.internal.g.e(context, "context");
        return "en";
    }

    @Override // h5.d
    public void d(Context context, String msg) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(msg, "msg");
        Toast.makeText(context, msg, 0).show();
    }

    @Override // h5.d
    public f5.b e(Activity activity, h5.m mVar, e5.d dVar, f5.c cVar, c5.d upgradeCheck) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(upgradeCheck, "upgradeCheck");
        f5.i iVar = new f5.i(activity, mVar, dVar, cVar, upgradeCheck);
        iVar.x();
        iVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
        iVar.y();
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // ua.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] f(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L66
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L54
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L37
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L39
        L37:
            r9 = r3
            goto L3d
        L39:
            int r11 = r11 + 1
            goto L27
        L3c:
            r9 = r2
        L3d:
            if (r9 != 0) goto L40
            goto L54
        L40:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L50
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L50:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L5c
        L54:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L5c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L66:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6f
            return r0
        L6f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.b1.f(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // o3.d0
    public Object g(JsonReader jsonReader, float f10) {
        return Integer.valueOf(Math.round(o3.m.d(jsonReader) * f10));
    }

    @Override // h5.d
    public i5.a h() {
        return new i5.b();
    }

    @Override // h5.d
    public Pair i() {
        Boolean bool = Boolean.TRUE;
        return new Pair(bool, bool);
    }

    @Override // h5.d
    public com.facebook.appevents.m j() {
        return null;
    }

    @Override // h5.d
    public void k(String str, Throwable th2) {
        th2.printStackTrace();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // q9.m
    public /* synthetic */ Object a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new o2());
        o9.d.d(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
}
