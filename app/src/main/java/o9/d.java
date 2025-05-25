package o9;

import android.os.Bundle;
import com.android.billingclient.api.a0;
import com.google.android.play.core.assetpacks.b1;
import java.io.Closeable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public class d implements h4.b, okhttp3.l {

    /* renamed from: a  reason: collision with root package name */
    public static q f22758a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f22759b = "";
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final d f22760d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f22761e = new a0("STATE_REG", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f22762f = new a0("STATE_COMPLETED", 8);

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f22763g = new a0("STATE_CANCELLED", 8);

    public static int b(int i10) {
        if (i10 == -1 || i10 == 16777215) {
            return -16777216;
        }
        int i11 = i10 & 16777215;
        return ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 16) | (-16777216) | (65280 & i11) | ((i11 & 16711680) >> 16);
    }

    public static final XorWowRandom c(long j10) {
        return new XorWowRandom((int) j10, (int) (j10 >> 32));
    }

    public static void d(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final void f(ArrayList arrayList, wk.g gVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        if (gVar != null) {
            String str = (String) gVar.f31334b;
            boolean z11 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String str2 = (String) gVar.f31333a;
                if (str2 == null || str2.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    j3.h hVar = new j3.h(str);
                    ((Bundle) hVar.c).putString("account_id", (String) gVar.f31333a);
                    arrayList.add(new yd.c(u4.b.f30157a, order, hVar));
                }
            }
        }
    }

    public static final void g(ArrayList arrayList, a2.a aVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        String str = (String) aVar.c;
        boolean z11 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String str2 = (String) aVar.f26b;
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                j3.h hVar = new j3.h((String) aVar.c);
                ((Bundle) hVar.c).putString("account_id", (String) aVar.f26b);
                arrayList.add(new yd.c(u4.b.f30159d, order, hVar));
            }
        }
    }

    public static final void h(ArrayList arrayList, w4.a aVar, je.a aVar2, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        String str = (String) aVar.f30971b;
        boolean z11 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String str2 = (String) aVar.f30970a;
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                j3.h hVar = new j3.h(str);
                ((Bundle) hVar.c).putString("account_id", str2);
                if (aVar2 != null) {
                    int i10 = aVar2.f19174a;
                    if (i10 != 0) {
                        ((Bundle) hVar.c).putInt("layout_id", i10);
                    }
                    ie.h hVar2 = aVar2.f19175b;
                    if (hVar2 != null && hVar2.f18489a > 0.0f) {
                        kotlin.jvm.internal.g.b(hVar2);
                        ((Bundle) hVar.c).putFloat("cover_width", hVar2.f18489a);
                    }
                }
                arrayList.add(new yd.c(u4.b.f30158b, order, hVar));
            }
        }
    }

    public static final void i(ArrayList arrayList, w4.a aVar, je.a aVar2, String order) {
        boolean z10;
        int i10;
        kotlin.jvm.internal.g.e(order, "order");
        if (aVar != null) {
            String str = (String) aVar.f30971b;
            boolean z11 = false;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String str2 = (String) aVar.f30970a;
                if (str2 == null || str2.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    j3.h hVar = new j3.h(str);
                    ((Bundle) hVar.c).putString("account_id", str2);
                    if (aVar2 != null && (i10 = aVar2.f19174a) != 0) {
                        ((Bundle) hVar.c).putInt("layout_id", i10);
                    }
                    arrayList.add(new yd.c(u4.b.c, order, hVar));
                }
            }
        }
    }

    public static boolean j(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        } else {
            return false;
        }
    }

    public static final String k(Number from, Number until) {
        kotlin.jvm.internal.g.e(from, "from");
        kotlin.jvm.internal.g.e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void l(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                b1.n(th2, th3);
            }
        }
    }

    public static final void m(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException(androidx.activity.f.k("toIndex (", i10, ") is greater than size (", i11, ")."));
    }

    public static int n(String str) {
        if (str.equals("line")) {
            return 20;
        }
        if (str.equals("straightConnector1")) {
            return 32;
        }
        if (str.equals("bentConnector2")) {
            return 33;
        }
        if (str.equals("bentConnector3")) {
            return 34;
        }
        if (str.equals("curvedConnector2")) {
            return 37;
        }
        if (str.equals("curvedConnector3")) {
            return 38;
        }
        if (str.equals("curvedConnector4")) {
            return 39;
        }
        if (str.equals("curvedConnector5")) {
            return 40;
        }
        if (!str.equals("rect") && !str.equals("Rect")) {
            if (str.equals("roundRect")) {
                return 2;
            }
            if (str.equals("round1Rect")) {
                return 210;
            }
            if (str.equals("round2SameRect")) {
                return 211;
            }
            if (str.equals("round2DiagRect")) {
                return 212;
            }
            if (str.equals("snip1Rect")) {
                return 213;
            }
            if (str.equals("snip2SameRect")) {
                return 214;
            }
            if (str.equals("snip2DiagRect")) {
                return 215;
            }
            if (str.equals("snipRoundRect")) {
                return 216;
            }
            if (str.equals("ellipse")) {
                return 3;
            }
            if (str.equals("triangle")) {
                return 5;
            }
            if (str.equals("rtTriangle")) {
                return 6;
            }
            if (str.equals("parallelogram")) {
                return 7;
            }
            if (str.equals("trapezoid")) {
                return 8;
            }
            if (str.equals("diamond")) {
                return 4;
            }
            if (str.equals("pentagon")) {
                return 56;
            }
            if (str.equals("hexagon")) {
                return 9;
            }
            if (str.equals("heptagon")) {
                return 217;
            }
            if (str.equals("octagon")) {
                return 10;
            }
            if (str.equals("decagon")) {
                return 218;
            }
            if (str.equals("dodecagon")) {
                return 219;
            }
            if (str.equals("pie")) {
                return 220;
            }
            if (str.equals("chord")) {
                return 221;
            }
            if (str.equals("teardrop")) {
                return 222;
            }
            if (str.equals("frame")) {
                return 223;
            }
            if (str.equals("halfFrame")) {
                return 224;
            }
            if (str.equals("corner")) {
                return 225;
            }
            if (str.equals("diagStripe")) {
                return 226;
            }
            if (str.equals("plus")) {
                return 11;
            }
            if (str.equals("plaque")) {
                return 21;
            }
            if (str.equals("can")) {
                return 22;
            }
            if (str.equals("cube")) {
                return 16;
            }
            if (str.equals("bevel")) {
                return 84;
            }
            if (str.equals("donut")) {
                return 23;
            }
            if (str.equals("noSmoking")) {
                return 57;
            }
            if (str.equals("blockArc")) {
                return 95;
            }
            if (str.equals("foldedCorner")) {
                return 65;
            }
            if (str.equals("smileyFace")) {
                return 96;
            }
            if (str.equals("heart")) {
                return 74;
            }
            if (str.equals("lightningBolt")) {
                return 73;
            }
            if (str.equals("sun")) {
                return ShapeTypes.SQUARE_TABS;
            }
            if (str.equals("moon")) {
                return ShapeTypes.PLAQUE_TABS;
            }
            if (str.equals("cloud")) {
                return 234;
            }
            if (str.equals("arc")) {
                return 19;
            }
            if (str.equals("bracketPair")) {
                return ShapeTypes.CHART_X;
            }
            if (str.equals("bracePair")) {
                return ShapeTypes.CHART_STAR;
            }
            if (str.equals("leftBracket")) {
                return 85;
            }
            if (str.equals("rightBracket")) {
                return 86;
            }
            if (str.equals("leftBrace")) {
                return 87;
            }
            if (str.equals("rightBrace")) {
                return 88;
            }
            if (str.equals("mathPlus")) {
                return 227;
            }
            if (str.equals("mathMinus")) {
                return 228;
            }
            if (str.equals("mathMultiply")) {
                return 229;
            }
            if (str.equals("mathDivide")) {
                return 230;
            }
            if (str.equals("mathEqual")) {
                return 231;
            }
            if (str.equals("mathNotEqual")) {
                return 232;
            }
            if (str.equals("rightArrow")) {
                return 13;
            }
            if (str.equals("leftArrow")) {
                return 66;
            }
            if (str.equals("upArrow")) {
                return 68;
            }
            if (str.equals("downArrow")) {
                return 67;
            }
            if (str.equals("leftRightArrow")) {
                return 69;
            }
            if (str.equals("upDownArrow") || str.equals("upDownArrow")) {
                return 70;
            }
            if (str.equals("quadArrow")) {
                return 76;
            }
            if (str.equals("leftRightUpArrow")) {
                return ShapeTypes.CORNER_TABS;
            }
            if (str.equals("bentArrow")) {
                return 91;
            }
            if (str.equals("uturnArrow")) {
                return 101;
            }
            if (str.equals("leftUpArrow")) {
                return 89;
            }
            if (str.equals("bentUpArrow")) {
                return 90;
            }
            if (str.equals("curvedRightArrow")) {
                return 102;
            }
            if (str.equals("curvedLeftArrow")) {
                return 103;
            }
            if (str.equals("curvedUpArrow")) {
                return 104;
            }
            if (str.equals("curvedDownArrow")) {
                return 105;
            }
            if (str.equals("stripedRightArrow")) {
                return 93;
            }
            if (str.equals("notchedRightArrow")) {
                return 94;
            }
            if (str.equals("homePlate")) {
                return 15;
            }
            if (str.equals("chevron")) {
                return 55;
            }
            if (str.equals("rightArrowCallout")) {
                return 78;
            }
            if (str.equals("leftArrowCallout")) {
                return 77;
            }
            if (str.equals("downArrowCallout")) {
                return 80;
            }
            if (str.equals("upArrowCallout")) {
                return 79;
            }
            if (str.equals("leftRightArrowCallout")) {
                return 81;
            }
            if (str.equals("quadArrowCallout")) {
                return 83;
            }
            if (str.equals("circularArrow")) {
                return 99;
            }
            if (str.equals("flowChartProcess")) {
                return 109;
            }
            if (str.equals("flowChartAlternateProcess")) {
                return ShapeTypes.MATH_PLUS;
            }
            if (str.equals("flowChartDecision")) {
                return 110;
            }
            if (str.equals("flowChartInputOutput")) {
                return 111;
            }
            if (str.equals("flowChartPredefinedProcess")) {
                return 112;
            }
            if (str.equals("flowChartInternalStorage")) {
                return 113;
            }
            if (str.equals("flowChartDocument")) {
                return 114;
            }
            if (str.equals("flowChartMultidocument")) {
                return 115;
            }
            if (str.equals("flowChartTerminator")) {
                return 116;
            }
            if (str.equals("flowChartPreparation")) {
                return 117;
            }
            if (str.equals("flowChartManualInput")) {
                return 118;
            }
            if (str.equals("flowChartManualOperation")) {
                return 119;
            }
            if (str.equals("flowChartConnector")) {
                return 120;
            }
            if (str.equals("flowChartOffpageConnector")) {
                return ShapeTypes.MATH_MINUS;
            }
            if (str.equals("flowChartPunchedCard")) {
                return 121;
            }
            if (str.equals("flowChartPunchedTape")) {
                return 122;
            }
            if (str.equals("flowChartSummingJunction")) {
                return 123;
            }
            if (str.equals("flowChartOr")) {
                return 124;
            }
            if (str.equals("flowChartCollate")) {
                return 125;
            }
            if (str.equals("flowChartSort")) {
                return 126;
            }
            if (str.equals("flowChartExtract")) {
                return ShapeTypes.VERTICAL_SCROLL;
            }
            if (str.equals("flowChartMerge")) {
                return 128;
            }
            if (str.equals("flowChartOnlineStorage")) {
                return ShapeTypes.DOUBLE_WAVE;
            }
            if (str.equals("flowChartDelay")) {
                return ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS;
            }
            if (str.equals("flowChartMagneticTape")) {
                return ShapeTypes.PLUS;
            }
            if (str.equals("flowChartMagneticDisk")) {
                return ShapeTypes.FLOW_CHART_PROCESS;
            }
            if (str.equals("flowChartMagneticDrum")) {
                return ShapeTypes.FLOW_CHART_DECISION;
            }
            if (str.equals("flowChartDisplay")) {
                return ShapeTypes.FLOW_CHART_INPUT_OUTPUT;
            }
            if (str.equals("wedgeRectCallout")) {
                return 61;
            }
            if (str.equals("wedgeRoundRectCallout")) {
                return 62;
            }
            if (str.equals("wedgeEllipseCallout")) {
                return 63;
            }
            if (str.equals("cloudCallout")) {
                return 106;
            }
            if (str.equals("borderCallout1")) {
                return ShapeTypes.MATH_EQUAL;
            }
            if (str.equals("borderCallout2")) {
                return 47;
            }
            if (str.equals("borderCallout3")) {
                return 48;
            }
            if (str.equals("accentCallout1")) {
                return ShapeTypes.MATH_DIVIDE;
            }
            if (str.equals("accentCallout2")) {
                return 44;
            }
            if (str.equals("accentCallout3")) {
                return 45;
            }
            if (str.equals("callout1")) {
                return ShapeTypes.MATH_MULTIPLY;
            }
            if (str.equals("callout2")) {
                return 41;
            }
            if (str.equals("callout3")) {
                return 42;
            }
            if (str.equals("accentBorderCallout1")) {
                return ShapeTypes.MATH_NOT_EQUAL;
            }
            if (str.equals("accentBorderCallout2")) {
                return 50;
            }
            if (str.equals("accentBorderCallout3")) {
                return 51;
            }
            if (str.equals("actionButtonBackPrevious")) {
                return 194;
            }
            if (str.equals("actionButtonForwardNext")) {
                return 193;
            }
            if (str.equals("actionButtonBeginning")) {
                return 196;
            }
            if (str.equals("actionButtonEnd")) {
                return 195;
            }
            if (str.equals("actionButtonHome")) {
                return 190;
            }
            if (str.equals("actionButtonInformation")) {
                return 192;
            }
            if (str.equals("actionButtonReturn")) {
                return 197;
            }
            if (str.equals("actionButtonMovie")) {
                return 200;
            }
            if (str.equals("actionButtonDocument")) {
                return 198;
            }
            if (str.equals("actionButtonSound")) {
                return 199;
            }
            if (str.equals("actionButtonHelp")) {
                return 191;
            }
            if (str.equals("actionButtonBlank")) {
                return 189;
            }
            if (str.equals("irregularSeal1")) {
                return 71;
            }
            if (str.equals("irregularSeal2")) {
                return 72;
            }
            if (str.equals("star4")) {
                return ShapeTypes.CHART_PLUS;
            }
            if (str.equals("star5")) {
                return 235;
            }
            if (str.equals("star6")) {
                return 236;
            }
            if (str.equals("star7")) {
                return 237;
            }
            if (str.equals("star8")) {
                return 58;
            }
            if (str.equals("star10")) {
                return 238;
            }
            if (str.equals("star12")) {
                return UnknownRecord.PHONETICPR_00EF;
            }
            if (str.equals("star16")) {
                return 59;
            }
            if (str.equals("star24")) {
                return 92;
            }
            if (str.equals("star32")) {
                return 60;
            }
            if (str.equals("ribbon2")) {
                return 54;
            }
            if (str.equals("ribbon")) {
                return 53;
            }
            if (str.equals("ellipseRibbon2")) {
                return 108;
            }
            if (str.equals("ellipseRibbon")) {
                return 107;
            }
            if (str.equals("verticalScroll")) {
                return 97;
            }
            if (str.equals("horizontalScroll")) {
                return 98;
            }
            if (str.equals("wave")) {
                return 64;
            }
            if (str.equals("doubleWave")) {
                return 188;
            }
            if (str.equals("funnel")) {
                return 240;
            }
            if (str.equals("gear6")) {
                return 241;
            }
            if (str.equals("gear9")) {
                return 242;
            }
            if (str.equals("leftCircularArrow")) {
                return 243;
            }
            if (str.equals("leftRightRibbon")) {
                return 244;
            }
            if (str.equals("pieWedge")) {
                return 245;
            }
            if (str.equals("swooshArrow")) {
                return 246;
            }
            return 0;
        }
        return 1;
    }

    public static String o(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 < 2) {
                                return "V-" + (2 - i10);
                            }
                            return "E+" + (i10 - 6);
                        }
                        return "E";
                    }
                    return "W";
                }
                return "I";
            }
            return "D";
        }
        return "V";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(lib.zj.office.wp.control.Word r6, long r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.d.p(lib.zj.office.wp.control.Word, long):void");
    }

    public static void q() {
        String str = n0.f28727a;
    }

    public static void r(String str) {
        if (str != null) {
            s("LogUtil-->", str);
        }
    }

    public static void s(String str, String str2) {
        if (str != null && str2 != null) {
            t1.b(str + " - " + str2);
        }
    }

    public static final int t(Random.Default r22, hg.c cVar) {
        kotlin.jvm.internal.g.e(r22, "<this>");
        if (!cVar.isEmpty()) {
            int i10 = cVar.f18326a;
            int i11 = cVar.f18327b;
            if (i11 < Integer.MAX_VALUE) {
                return r22.nextInt(i10, i11 + 1);
            }
            if (i10 > Integer.MIN_VALUE) {
                return r22.nextInt(i10 - 1, i11) + 1;
            }
            return r22.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + cVar);
    }

    public static final boolean u(String method) {
        kotlin.jvm.internal.g.e(method, "method");
        if (!kotlin.jvm.internal.g.a(method, "GET") && !kotlin.jvm.internal.g.a(method, "HEAD")) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.l
    public List a(String hostname) {
        kotlin.jvm.internal.g.e(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.g.d(allByName, "getAllByName(hostname)");
            return kotlin.collections.f.H(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.g.h(hostname, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    @Override // h4.b
    public v3.l e(v3.l lVar, t3.e eVar) {
        return lVar;
    }
}
