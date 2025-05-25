package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.adjust.sdk.network.ErrorCodes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.text.ttml.TtmlRegion;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: assets/audience_network.dex */
public class XP implements InterfaceC0810Fv {
    public static byte[] A00;
    public static String[] A01 = {"q1g32zvoAQJitbnj3kQF8wmNW7veOCWn", "KsaAC8YjoMGJChouvV8VId7KrUuqOJCk", "o6f3mRIKrW8efzr6XwfXPwRcZoghN3oD", "REIwhco5kB4G3k30FaVNZH5vs6sRKT21", "qQ8hwRe1NnEjdiH7DukqvWEYyVCX6RS7", "NOEtA1tjy6NxfLNTeEpIfmePtNQlRpNw", "432pej62syR5Z0UxeGKhT0qGaSDmzBGz", "Pr1x84V6QjFlC6ENVmoBp9zzcVDIgNGT"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Field.SYMBOL, 12, 12, 29, 21, 8, 12, 29, Field.NUMCHARS, Field.HYPERLINK, 12, 23, Field.HYPERLINK, Field.NUMWORDS, 10, 29, 25, 12, 29, Field.HYPERLINK, Field.NUMCHARS, 29, Field.NUMWORDS, 23, Field.NUMCHARS, 29, 10, Field.HYPERLINK, 30, 23, 10, Field.HYPERLINK, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, Field.NUMCHARS, Field.HYPERLINK, 30, 23, 10, 21, 25, 12, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, Field.AUTOTEXT, 3, 5, 1, 77, 86, 80, Field.HYPERLINK, 118, 103, 103, 123, 126, 116, 118, 99, 126, 120, 121, 56, 116, 114, 118, 58, 32, Field.FILLIN, Field.GLOSSARY, 120, 105, 105, 117, 112, 122, 120, 109, 112, 118, 119, Field.AUTONUM, 125, 111, 123, 106, 108, 123, 106, Field.EQ, 32, 32, 60, Field.SYMBOL, Field.MACROBUTTON, Field.EQ, 36, Field.SYMBOL, Field.BARCODE, Field.USERADDRESS, Byte.MAX_VALUE, 32, Field.IMPORT, Field.QUOTE, 13, Field.NUMCHARS, Field.NUMCHARS, 0, 5, 15, 13, 24, 5, 3, 2, Field.INCLUDEPICTURE, 24, 24, 1, 0, Field.FORMCHECKBOX, 20, 1, 0, 100, 117, 117, 105, 108, 102, 100, 113, 108, 106, 107, 42, 125, Field.DATA, 104, 117, Field.EQ, Field.DATA, 102, 96, 100, Field.DATA, Field.MACROBUTTON, Field.AUTONUMLGL, 61, 20, 5, 5, 25, Field.NUMCHARS, 22, 20, 1, Field.NUMCHARS, 26, Field.NUMWORDS, Field.LISTNUM, 13, Field.HYPERLINK, 24, 5, Field.SECTION, Field.HYPERLINK, 3, 1, 1, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, Field.AUTOTEXT, 24, 77, 17, 21, 9, 3, 11, 20, 9, 13, 5, 77, 20, 24, Field.FORMDROPDOWN, 7, 126, 111, 111, 115, 118, 124, 126, 107, 118, 112, 113, 48, 103, Field.GOTOBUTTON, 108, 106, 125, 109, 118, 111, 77, Field.BIDIOUTLINE, Field.SECTION, 77, 22, Field.AUTOTEXT, 77, 77, 17, 0, 29, 17, 74, 29, Field.NOTEREF, 22, 22, 4};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0810Fv
    public final XQ A4v(Format format) {
        char c;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 38))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(107, 15, 111))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(ShapeTypes.ACTION_BUTTON_END, 21, 74))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, 6))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 691401887:
                if (str.equals(A00(188, 28, 95))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 90))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 930165504:
                if (str.equals(A00(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 25, 58))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, 95))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 40))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 32))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 83))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new DP() { // from class: com.facebook.ads.redexgen.X.44
                    public static byte[] A05;
                    public static String[] A06 = {"5F5cxYdx0LKPil0ajw3GbpYLT7etgF31", "fOxzE9ZV4JlsRGjdoo7dV8KulyNBfr9E", "eEUtzxx4vW", "aDPglCd54FV7XTVXwPGrLoRK5PMilD0L", "T8", "NkWz0HAqjAnp44zCa91cwSe9MeY1HrSH", "IMzm5Ejj5mH4jimf0JzHbRqQJ285LAhr", "T9e7N5pQDbPcuWmbFwNGAPupqQB687yI"};
                    public final GN A00;
                    public final GT A01;
                    public final GW A02;
                    public final I4 A03;
                    public final List<GR> A04;

                    public static String A02(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 93);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{-51, -84, -1, 0, 5, -8, -15, -84, -18, -8, -5, -17, -9, -84, 3, -19, -1, -84, -14, -5, 1, -6, -16, -84, -19, -14, 0, -15, -2, -84, 0, -12, -15, -84, -14, -11, -2, -1, 0, -84, -17, 1, -15, -70, -84, -83, -78, -93, -15, -14, -9, -22, -29, -66, -52, -55, -35, -37, -37, -85, -52, -54, -42, -53, -52, -39};
                    }

                    static {
                        A03();
                    }

                    {
                        A02(53, 13, 10);
                        this.A02 = new GW();
                        this.A03 = new I4();
                        this.A01 = new GT();
                        this.A00 = new GN();
                        this.A04 = new ArrayList();
                    }

                    public static int A00(I4 i42) {
                        int currentInputPosition = -1;
                        int i10 = 0;
                        while (currentInputPosition == -1) {
                            i10 = i42.A06();
                            String A0P = i42.A0P();
                            if (A0P == null) {
                                currentInputPosition = 0;
                            } else if (A02(48, 5, 65).equals(A0P)) {
                                currentInputPosition = 2;
                            } else if (A02(44, 4, 1).startsWith(A0P)) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        i42.A0Y(i10);
                        return currentInputPosition;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.DP
                    /* renamed from: A01 */
                    public final XE A0b(byte[] bArr, int i10, boolean z10) throws C0809Fu {
                        this.A03.A0b(bArr, i10);
                        this.A01.A0E();
                        this.A04.clear();
                        GX.A04(this.A03);
                        do {
                        } while (!TextUtils.isEmpty(this.A03.A0P()));
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A002 = A00(this.A03);
                            if (A002 != 0) {
                                if (A002 == 1) {
                                    A04(this.A03);
                                } else if (A002 == 2) {
                                    if (arrayList.isEmpty()) {
                                        this.A03.A0P();
                                        GR styleBlock = this.A00.A0E(this.A03);
                                        if (styleBlock != null) {
                                            this.A04.add(styleBlock);
                                        }
                                    } else {
                                        throw new C0809Fu(A02(0, 44, 47));
                                    }
                                } else if (A002 == 3 && this.A02.A0G(this.A03, this.A01, this.A04)) {
                                    arrayList.add(this.A01.A0D());
                                    this.A01.A0E();
                                }
                            } else {
                                return new XE(arrayList);
                            }
                        }
                    }

                    public static void A04(I4 i42) {
                        boolean isEmpty;
                        do {
                            isEmpty = TextUtils.isEmpty(i42.A0P());
                            if (A06[0].charAt(19) != 'G') {
                                throw new RuntimeException();
                            }
                            A06[6] = "CZqzLdLpoWwYlPjJuNUsakBQS84mnH0T";
                        } while (!isEmpty);
                    }
                };
            case 1:
                return new C05404g(format.A0P);
            case 2:
                return new DP() { // from class: com.facebook.ads.redexgen.X.45
                    public static byte[] A02;
                    public static String[] A03 = {"jrvdoaDBM3cqePrWf", "m40r4JyL3iKqeGLO2h6Tk", "RcvraOg6mbbP34aEVmi7jYPv5OcRlKTM", "myTPvQ3QT6z6", "YpxDkO8RECuwBTRpYFK7ysMlySnmjB", "CwlHvyUXkKbItp91Wk", "ZsF2mL", "xPpZ8RCHbSet6uyWCTIV2"};
                    public static final int A04;
                    public static final int A05;
                    public static final int A06;
                    public final GT A00;
                    public final I4 A01;

                    public static String A02(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 9);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{124, -95, -106, -94, -96, -93, -97, -104, -89, -104, Field.FORMDROPDOWN, Byte.MIN_VALUE, -93, 103, -118, -104, -107, -87, -89, -89, Field.FORMDROPDOWN, -121, -94, -93, Field.FORMDROPDOWN, Byte.MAX_VALUE, -104, -87, -104, -97, Field.FORMDROPDOWN, -107, -94, -85, Field.FORMDROPDOWN, -101, -104, -108, -105, -104, -91, Field.FORMDROPDOWN, -103, -94, -88, -95, -105, 97, Field.FORMDROPDOWN, 120, 109, 121, 119, 122, 118, 111, 126, 111, 42, Byte.MIN_VALUE, 126, 126, 42, 109, Byte.MAX_VALUE, 111, 42, 108, 121, -126, 42, 114, 111, 107, 110, 111, 124, 42, 112, 121, Byte.MAX_VALUE, 120, 110, 56, -61, -26, -86, -51, -37, -40, -20, -22, -22, -70, -37, -39, -27, -38, -37, -24, -80, -95, -71, -84, -55, -54, -54, -67, -109, -111, -111, Byte.MIN_VALUE};
                    }

                    static {
                        A03();
                        A04 = IK.A08(A02(100, 4, 55));
                        A05 = IK.A08(A02(104, 4, 77));
                        A06 = IK.A08(A02(108, 4, 20));
                    }

                    {
                        A02(84, 16, 109);
                        this.A01 = new I4();
                        this.A00 = new GT();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.DP
                    /* renamed from: A00 */
                    public final XG A0b(byte[] bArr, int i10, boolean z10) throws C0809Fu {
                        this.A01.A0b(bArr, i10);
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int A042 = this.A01.A04();
                            String[] strArr = A03;
                            if (strArr[6].length() == strArr[5].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[3] = "2AOvC9NWdqZd";
                            strArr2[0] = "YZRt9rHsEfBtjbBQ4";
                            if (A042 > 0) {
                                if (this.A01.A04() >= 8) {
                                    int A08 = this.A01.A08();
                                    int boxSize = this.A01.A08();
                                    if (boxSize == A06) {
                                        arrayList.add(A01(this.A01, this.A00, A08 - 8));
                                    } else {
                                        this.A01.A0Z(A08 - 8);
                                    }
                                } else {
                                    throw new C0809Fu(A02(0, 48, 42));
                                }
                            } else {
                                return new XG(arrayList);
                            }
                        }
                    }

                    public static XF A01(I4 i42, GT gt, int i10) throws C0809Fu {
                        gt.A0E();
                        while (i10 > 0) {
                            if (i10 >= 8) {
                                int boxSize = i42.A08();
                                int A08 = i42.A08();
                                int payloadLength = boxSize - 8;
                                byte[] bArr = i42.A00;
                                int boxSize2 = i42.A06();
                                String A0R = IK.A0R(bArr, boxSize2, payloadLength);
                                i42.A0Z(payloadLength);
                                i10 = (i10 - 8) - payloadLength;
                                int boxSize3 = A05;
                                if (A08 == boxSize3) {
                                    GW.A08(A0R, gt);
                                } else {
                                    int boxSize4 = A04;
                                    if (A08 == boxSize4) {
                                        GW.A0C(null, A0R.trim(), gt, Collections.emptyList());
                                    }
                                }
                            } else {
                                throw new C0809Fu(A02(48, 36, 1));
                            }
                        }
                        return gt.A0D();
                    }
                };
            case 3:
                return new DP() { // from class: com.facebook.ads.redexgen.X.47
                    public static byte[] A01;
                    public static String[] A02 = {"Q7JJv3z7PkgXqFR6EtNnsFWUhkJfDLEs", "gmWMr9Qk53qaXSdnVHvemR", "OW99De4FTdA6Oa6qk4bO3w", "WoL", "rm8iY0Glnb70LQ8B0", "dizBvxRUVycGfpYpaNZ336Cn8ei27tcP", "ilEcyhsvi9H23eDmjQBvPkD3CdelIFai", "Rua8GDCisFLxJnBCYVdBnrEUaSrihtBi"};
                    public static final GE A03;
                    public static final GF A04;
                    public static final Pattern A05;
                    public static final Pattern A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
                        if (r3.equals(A08(1374, 1, 62)) != false) goto L22;
                     */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 12
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static long A00(java.lang.String r10, com.facebook.ads.redexgen.X.GF r11) throws com.facebook.ads.redexgen.X.C0809Fu {
                        /*
                            Method dump skipped, instructions count: 480
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass47.A00(java.lang.String, com.facebook.ads.redexgen.X.GF):long");
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 23
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private GG A03(XmlPullParser xmlPullParser, GG gg2, Map<String, GH> map, GF gf2) throws C0809Fu {
                        char c10;
                        AnonymousClass47 anonymousClass47 = this;
                        long j10 = -9223372036854775807L;
                        long j11 = -9223372036854775807L;
                        long j12 = -9223372036854775807L;
                        String A082 = A08(0, 0, 90);
                        String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        GM A062 = anonymousClass47.A06(xmlPullParser, null);
                        int i10 = 0;
                        while (i10 < attributeCount) {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[2].length()) {
                                A02[4] = "YixuFoEwtSnXH8w7l";
                                String attributeValue = xmlPullParser.getAttributeValue(i10);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        if (attributeName.equals(A08(1291, 6, 32))) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 99841:
                                        if (attributeName.equals(A08(1058, 3, 21))) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 100571:
                                        if (attributeName.equals(A08(1063, 3, 72))) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 93616297:
                                        if (attributeName.equals(A08(ErrorCodes.MALFORMED_URL_EXCEPTION, 5, 98))) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 109780401:
                                        if (attributeName.equals(A08(1350, 5, 103))) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                        j11 = A00(attributeValue, gf2);
                                        if (A02[3].length() != 29) {
                                            A02[4] = "dQoDQglF0B7EvNpDs";
                                            break;
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    case 1:
                                        j12 = A00(attributeValue, gf2);
                                        if (A02[0].charAt(22) == 'S') {
                                            break;
                                        } else {
                                            A02[4] = "ntIDxfuQXDdGI2t9y";
                                            break;
                                        }
                                    case 2:
                                        j10 = A00(attributeValue, gf2);
                                        break;
                                    case 3:
                                        String[] A0D = anonymousClass47.A0D(attributeValue);
                                        if (A0D.length <= 0) {
                                            break;
                                        } else {
                                            strArr = A0D;
                                            break;
                                        }
                                    case 4:
                                        boolean containsKey = map.containsKey(attributeValue);
                                        String[] strArr3 = A02;
                                        if (strArr3[6].charAt(31) != strArr3[7].charAt(31)) {
                                            A02[0] = "5h0BzYvwjwJJ0RRHlMSIfGfJueQmiYKk";
                                            if (!containsKey) {
                                                break;
                                            }
                                            A082 = attributeValue;
                                            break;
                                        } else {
                                            A02[3] = "L0ZtifNqpxSGUOW";
                                            if (!containsKey) {
                                                break;
                                            }
                                            A082 = attributeValue;
                                        }
                                }
                                i10++;
                                anonymousClass47 = this;
                            }
                            throw new RuntimeException();
                        }
                        if (gg2 != null && gg2.A02 != -9223372036854775807L) {
                            if (j11 != -9223372036854775807L) {
                                j11 += gg2.A02;
                            }
                            if (j12 != -9223372036854775807L) {
                                j12 += gg2.A02;
                            }
                        }
                        if (j12 == -9223372036854775807L) {
                            if (j10 != -9223372036854775807L) {
                                j12 = j11 + j10;
                            } else if (gg2 != null) {
                                int i11 = (gg2.A01 > (-9223372036854775807L) ? 1 : (gg2.A01 == (-9223372036854775807L) ? 0 : -1));
                                if (A02[5].charAt(13) != 'p') {
                                    throw new RuntimeException();
                                }
                                A02[0] = "hz7aEmxbm3wpG3zoF0cWffVXztLcHnN4";
                                if (i11 != 0) {
                                    j12 = gg2.A01;
                                }
                            }
                        }
                        return GG.A05(xmlPullParser.getName(), j11, j12, A062, strArr, A082);
                    }

                    public static String A08(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            if (A02[3].length() == 29) {
                                throw new RuntimeException();
                            }
                            A02[5] = "lfPYUvG2csO3ophSdE9ghMM7c7M5WNIy";
                            if (i13 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 70);
                            i13++;
                        }
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private Map<String, GM> A09(XmlPullParser xmlPullParser, Map<String, GM> map, Map<String, GH> map2, GE ge2) throws IOException, XmlPullParserException {
                        GH A042;
                        do {
                            xmlPullParser.next();
                            String A082 = A08(1350, 5, 103);
                            if (IL.A04(xmlPullParser, A082)) {
                                String A002 = IL.A00(xmlPullParser, A082);
                                GM A062 = A06(xmlPullParser, new GM());
                                if (A002 != null) {
                                    String[] A0D = A0D(A002);
                                    for (String str2 : A0D) {
                                        A062.A0E(map.get(str2));
                                    }
                                }
                                String A0M = A062.A0M();
                                if (A02[4].length() != 17) {
                                    throw new RuntimeException();
                                }
                                A02[5] = "7fn6ufwdKmfvopYXTYWOtezKPVwS6HMn";
                                if (A0M != null) {
                                    map.put(A062.A0M(), A062);
                                }
                            } else if (IL.A04(xmlPullParser, A08(1291, 6, 32)) && (A042 = A04(xmlPullParser, ge2)) != null) {
                                map2.put(A042.A07, A042);
                            }
                        } while (!IL.A03(xmlPullParser, A08(1179, 4, 5)));
                        return map;
                    }

                    public static void A0A() {
                        A01 = new byte[]{13, 60, 13, 4, Field.FORMTEXT, 33, 13, 23, 14, 6, 12, Field.FILESIZE, 22, Field.SECTIONPAGES, 1, 16, 7, 3, 22, 7, Field.SECTIONPAGES, 58, 15, 14, Field.GOTOBUTTON, 23, 14, 14, Field.GOTOBUTTON, 3, 16, 17, 7, 16, 36, 3, 1, 22, 13, 16, Field.NUMWORDS, Field.SECTIONPAGES, 11, 12, 17, 22, 3, 12, 1, 7, Field.FORMDROPDOWN, 116, 124, 121, 112, 113, Field.AUTONUMLGL, 101, 116, 103, 102, 124, 123, 114, Field.AUTONUMLGL, 119, 116, 118, 126, 114, 103, 122, 96, 123, 113, Field.AUTONUMLGL, 99, 116, 121, 96, 112, Field.GLOSSARY, Field.AUTONUMLGL, Field.NUMCHARS, 59, Field.MACROBUTTON, Field.AUTONUM, Field.BARCODE, Field.USERADDRESS, 122, 42, 59, Field.DATA, 41, Field.MACROBUTTON, Field.AUTONUMOUT, 61, 122, Field.SYMBOL, Field.AUTONUMLGL, Field.AUTONUM, Field.AUTONUMLGL, Field.DATA, 122, 44, 59, Field.AUTONUM, Field.GLOSSARY, Field.BARCODE, 96, 122, 96, Field.FORMCHECKBOX, Field.AUTOTEXT, 74, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 6, 86, Field.FORMCHECKBOX, Field.ADVANCE, Field.DOCPROPERTY, Field.AUTOTEXT, Field.NOTEREF, Field.SECTION, 6, 64, Field.TOA, Field.NOTEREF, 82, 117, Field.AUTOTEXT, Field.BIDIOUTLINE, Field.INCLUDEPICTURE, 6, 80, Field.FORMCHECKBOX, 74, Field.FORMDROPDOWN, Field.INCLUDEPICTURE, Field.NUMCHARS, 6, Field.GREETINGLINE, 112, 121, 120, 101, 126, 121, 112, Field.IMPORT, 122, 118, 123, 113, 120, 101, 122, 114, 115, Field.IMPORT, 116, 114, 123, 123, Field.IMPORT, 101, 114, 100, 120, 123, 98, 99, 126, 120, 121, Field.DDE, Field.IMPORT, 64, 110, 103, 102, 123, 96, 103, 110, 41, 123, 108, 110, 96, 102, 103, 41, 126, 96, 125, 97, 41, 100, 104, 101, 111, 102, 123, 100, 108, 109, 41, 108, 113, 125, 108, 103, 125, Field.MACROBUTTON, 41, Field.BARCODE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, Field.NUMWORDS, 23, 26, 16, 25, 4, Field.NUMWORDS, 19, 18, 86, 25, 4, 31, 17, 31, 24, 76, 86, Field.BARCODE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 86, 19, 14, 2, 19, 24, 2, 76, 86, 25, Field.IMPORT, Field.USERADDRESS, Field.BARCODE, 34, Field.SYMBOL, Field.USERADDRESS, Field.IMPORT, 112, 34, Field.AUTONUMLGL, Field.IMPORT, Field.SYMBOL, Field.BARCODE, Field.USERADDRESS, 112, Field.FILLIN, Field.SYMBOL, 36, 56, 112, Field.PAGEREF, Field.USERADDRESS, Field.QUOTE, Field.PAGEREF, 32, 32, Field.BARCODE, 34, 36, Field.AUTONUMLGL, Field.AUTONUMOUT, 112, Field.BARCODE, 34, Field.SYMBOL, Field.IMPORT, Field.SYMBOL, Field.USERADDRESS, 106, 112, Field.ADVANCE, 122, 115, 114, 111, 116, 115, 122, 61, 111, 120, 122, 116, 114, 115, 61, 106, 116, 105, 117, 114, 104, 105, 61, 124, 115, 61, 120, 101, 105, 120, 115, 105, Field.PAGEREF, 11, 2, 3, 30, 5, 2, 11, 76, 30, 9, 11, 5, 3, 2, 76, Field.NUMWORDS, 5, 24, 4, 3, 25, 24, 76, 13, 2, 76, 3, 30, 5, 11, 5, 2, 112, Field.GREETINGLINE, Field.CONTROL, 86, Field.MERGESEQ, 80, Field.CONTROL, Field.GREETINGLINE, 25, 76, Field.CONTROL, 74, 76, Field.TOA, Field.TOA, 86, Field.MERGESEQ, 77, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 25, 77, Field.HYPERLINK, Field.GREETINGLINE, 3, 25, 99, Field.INCLUDETEXT, Field.BIDIOUTLINE, Field.MERGESEQ, Field.FORMTEXT, Field.INCLUDEPICTURE, 78, 10, Field.TOA, Field.AUTOTEXT, Field.FORMTEXT, Field.FORMTEXT, 10, Field.HYPERLINK, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.FILESIZE, Field.FORMTEXT, Field.SHAPE, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.INCLUDETEXT, 10, 123, Field.BIDIOUTLINE, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.HTMLCONTROL, 86, 18, Field.CONTROL, 74, Field.SECTIONPAGES, 64, Field.CONTROL, Field.SECTION, Field.SECTION, Field.HTMLCONTROL, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 18, Field.ADVANCE, Field.ADDRESSBLOCK, 64, 18, Field.ADVANCE, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.FORMTEXT, 97, Field.HTMLCONTROL, Field.NOTEREF, Field.CONTROL, 8, 18, 21, 32, 7, 31, 8, 5, 0, 13, Field.TOA, 7, Field.NUMCHARS, 4, 11, 12, Field.NUMWORDS, Field.TOA, 6, 15, Field.TOA, 12, 7, 29, Field.NUMWORDS, 0, 12, 26, Field.TOA, 15, 6, Field.NUMWORDS, Field.TOA, 15, 6, 7, 29, 58, 0, 19, 12, Field.FORMDROPDOWN, Field.TOA, 25, Field.USERADDRESS, Field.ASK, Field.EQ, 60, Field.SYMBOL, Field.AUTONUMOUT, 112, Field.PAGEREF, Field.USERADDRESS, Field.SYMBOL, 36, 112, Field.AUTONUM, Field.BARCODE, 34, 112, Field.AUTONUM, Field.BARCODE, Field.USERADDRESS, 36, 3, Field.SYMBOL, 42, Field.AUTONUMLGL, 106, 112, 119, 23, 59, Field.AUTONUM, 60, Field.AUTONUMLGL, Field.DATA, Field.IMPORT, Field.BARCODE, Field.USERADDRESS, 122, Field.DDEAUTO, Field.MACROBUTTON, Field.IMPORT, Field.BARCODE, 122, Field.BARCODE, 34, 42, Field.DATA, Field.BARCODE, 41, 41, Field.MACROBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, 96, 122, Field.TOA, 113, 104, 112, 109, 116, 104, 97, 36, 114, 101, 104, 113, 97, 119, 36, 109, 106, 36, 98, 107, 106, 112, Field.CONTROL, 109, 126, 97, 36, 101, 112, 112, 118, 109, 102, 113, 112, 97, 42, 36, Field.ADVANCE, 109, 103, 111, 109, 106, 99, 36, 112, 108, 97, 36, 119, 97, 103, 107, 106, 96, 36, 114, 101, 104, 113, 97, 36, 98, 107, 118, 36, 114, 97, 118, 112, 109, 103, 101, 104, 36, 98, 107, 106, 112, 36, 119, 109, 126, 97, 36, 101, 106, 96, 36, 109, 99, 106, 107, 118, 109, 106, 99, 36, 112, 108, 97, 36, 98, 109, 118, 119, 112, 42, Field.DATA, 14, 11, 11, 9, 30, 8, 8, 18, 21, Field.NUMCHARS, Field.HTMLCONTROL, 11, 26, 9, 8, 30, 9, Field.HTMLCONTROL, 30, 9, 9, 20, 9, 99, Field.INCLUDEPICTURE, Field.LISTNUM, Field.HTMLCONTROL, 115, 82, Field.ADVANCE, Field.HYPERLINK, Field.FORMDROPDOWN, 82, Field.FILESIZE, 117, 78, Field.SECTION, Field.SECTIONPAGES, 76, Field.FILESIZE, 0, Field.ADVANCE, Field.AUTOTEXT, 0, Field.INCLUDETEXT, Field.FILESIZE, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.INCLUDETEXT, Field.FILESIZE, 0, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.DOCPROPERTY, 82, Field.INCLUDEPICTURE, Field.FILESIZE, 14, Field.AUTONUMLGL, Field.USERADDRESS, Field.QUOTE, 43, Field.USERADDRESS, 56, Field.GLOSSARY, Field.USERADDRESS, Field.BARCODE, 123, Field.USERADDRESS, 41, 41, Field.AUTONUMOUT, 41, 123, 44, Field.MACROBUTTON, Field.USERADDRESS, Field.AUTONUMLGL, 123, 41, Field.USERADDRESS, 58, Field.BARCODE, Field.GOTOBUTTON, Field.AUTONUMLGL, 60, 123, Field.GOTOBUTTON, Field.AUTONUMLGL, 43, Field.DDEAUTO, Field.GLOSSARY, 117, Field.INCLUDETEXT, 107, Field.MACROBUTTON, 21, 99, 99, 16, 123, 102, 114, 22, 97, 101, 98, 116, 16, 123, 102, 114, 22, 96, 98, 99, 59, Field.MACROBUTTON, Field.IMPORT, Field.DDEAUTO, Field.ASK, Field.IMPORT, 110, 98, 111, 107, 29, 110, 5, 24, 12, 104, 30, 29, 10, 15, 105, Field.NUMWORDS, 110, 5, 24, 12, 104, 30, Field.NUMCHARS, 10, Field.NUMCHARS, 29, Field.ADDRESSBLOCK, Field.TOA, Field.HYPERLINK, Field.TOA, Field.FORMTEXT, Field.TOA, Field.HYPERLINK, Field.FORMTEXT, Field.TOA, Field.FORMDROPDOWN, Field.TOA, Field.SECTION, Field.NUMCHARS, 17, Field.DDE, Field.HTMLCONTROL, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.HYPERLINK, Field.LISTNUM, Field.TOA, Field.HTMLCONTROL, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.LISTNUM, Field.TOA, Field.HTMLCONTROL, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.LISTNUM, Field.HTMLCONTROL, 76, Field.TOA, Field.HTMLCONTROL, Field.GLOSSARY, Field.ADDRESSBLOCK, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.HYPERLINK, Field.LISTNUM, 15, Field.TOA, Field.HTMLCONTROL, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.LISTNUM, Field.HTMLCONTROL, 76, Field.TOA, Field.GLOSSARY, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.DATA, Field.INCLUDEPICTURE, Field.GREETINGLINE, 74, Field.DDEAUTO, Field.HYPERLINK, Field.LISTNUM, Field.LISTNUM, 76, Field.LISTNUM, 76, Field.CONTROL, Field.FILLIN, Field.ADDIN, Field.PAGEREF, 29, 82, 80, Field.AUTOTEXTLIST, Field.ADDIN, Field.PAGEREF, 29, 82, 80, Field.ADDRESSBLOCK, Field.DATA, Field.GREETINGLINE, 42, 18, Field.ADDRESSBLOCK, 42, Field.HYPERLINK, Field.TOA, 42, 18, Field.BIDIOUTLINE, Field.TOA, Field.SHAPE, Field.FORMDROPDOWN, 86, Field.GREETINGLINE, 42, 18, Field.ADDRESSBLOCK, 42, Field.HYPERLINK, Field.TOA, 42, 18, Field.BIDIOUTLINE, Field.TOA, Field.SHAPE, Field.FORMDROPDOWN, 82, 111, 104, 122, 107, 124, Field.NOTEREF, Field.MERGESEQ, Field.TOA, Field.SECTION, 77, Field.HYPERLINK, Field.FILESIZE, Field.SHAPE, Field.INCLUDETEXT, 78, 105, Field.FILESIZE, 
                        Field.FORMTEXT, Field.FILESIZE, Field.HYPERLINK, Field.FORMTEXT, Field.SECTION, Field.INCLUDEPICTURE, 77, 74, 26, 23, Field.NUMCHARS, 1, 36, 41, 42, 34, 116, 100, 10, 12, 5, 5, 59, 12, 26, 6, 5, Field.NUMCHARS, 29, 0, 6, 7, Field.ADVANCE, 82, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 82, Field.FILESIZE, 0, 12, 15, 12, 17, Field.PAGEREF, Field.DATA, Field.GOTOBUTTON, Field.EQ, Field.DDE, 32, 56, 0, Field.DDE, Field.DATA, Field.ASK, Field.GLOSSARY, 98, 111, 112, Field.IMPORT, Field.ASK, 33, 121, 113, 107, 96, 106, Field.DATA, Field.AUTONUMLGL, Field.SYMBOL, Field.DATA, Field.QUOTE, Field.SYMBOL, 96, 74, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.HYPERLINK, 106, 77, Field.SECTION, Field.FILESIZE, 64, Field.DOCPROPERTY, 80, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.SECTIONPAGES, 101, Field.SHAPE, 76, Field.FORMDROPDOWN, 0, 9, 8, 18, Field.AUTONUMLGL, 18, 31, 10, 3, 118, Byte.MAX_VALUE, 126, 100, Field.FORMCHECKBOX, 117, 121, 119, 120, 100, 21, 1, 18, 30, 22, 33, 18, 7, 22, 105, 125, 110, 98, 106, Field.ADDRESSBLOCK, 110, 123, 106, Field.SECTIONPAGES, 122, 99, 123, 102, Byte.MAX_VALUE, 99, 102, 106, 125, 58, Field.DDEAUTO, 61, Field.EQ, Field.SYMBOL, 14, 61, Field.DATA, Field.SYMBOL, 17, 41, 48, Field.DATA, Field.AUTONUMLGL, 44, 48, Field.AUTONUMLGL, Field.SYMBOL, Field.DDEAUTO, 124, 56, Field.MACROBUTTON, Field.SYMBOL, Field.GLOSSARY, Field.GOTOBUTTON, 123, Field.DATA, 124, Field.AUTONUMOUT, 61, 42, Field.SYMBOL, 124, 110, 124, 44, 61, Field.DDEAUTO, Field.DATA, Field.GLOSSARY, 64, 43, Field.ASK, 34, Field.FILLIN, Field.DDE, Field.EQ, Field.EQ, Field.AUTONUMLGL, Byte.MAX_VALUE, 106, 106, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.GOTOBUTTON, 107, Field.GOTOBUTTON, 118, 107, 42, Field.IMPORT, 34, 106, 43, Field.AUTONUM, 106, Field.EQ, Field.EQ, Field.DATA, 41, 102, Field.AUTONUMLGL, 36, Field.IMPORT, 36, Field.DATA, 32, Field.EQ, 32, Field.IMPORT, Field.HTMLCONTROL, 86, Field.MERGESEQ, 86, Field.INCLUDEPICTURE, 78, Field.MERGESEQ, Field.SECTION, 11, 6, 30, 8, 18, 19, 118, Byte.MAX_VALUE, 124, 110, 13, 8, 15, 4, 21, 9, 19, 14, 20, 6, 9, 26, Field.AUTONUMOUT, 60, Field.DDE, 56, 61, 56, Field.DDE, 56, 122, 100, 17, 16, 19, 22, 17, 26, 11, 23, 13, 16, 10, 24, 23, 64, Field.SECTION, Field.HTMLCONTROL, 64, 74, Field.MERGESEQ, Field.BIDIOUTLINE, Field.SECTIONPAGES, Field.FORMCHECKBOX, 64, Field.MERGESEQ, 25, 4, 31, 17, 31, 24, Field.DDE, 110, 102, 20, 3, 1, 15, 9, 8, 125, 102, 104, 103, 123, 124, 56, Field.ASK, 59, Field.BARCODE, Field.DDEAUTO, 113, Field.GLOSSARY, 42, Field.BARCODE, 42, 29, 3, 30, 26, 11, Field.ADVANCE, 7, 3, 15, 9, 11, Field.EQ, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUM, Field.FILLIN, 120, 43, 44, 36, Field.DDE, 48, Field.GLOSSARY, Field.QUOTE, Field.AUTONUM, 43, Field.DDE, 44, 58, Field.SYMBOL, Field.DATA, Field.FILLIN, Field.DATA, Field.GLOSSARY, 58, 41, Field.GLOSSARY, 82, Field.DOCPROPERTY, Field.HYPERLINK, 77, Field.INCLUDETEXT, Byte.MAX_VALUE, 120, 117, 96, 101, 98, 107, Field.MACROBUTTON, Field.AUTONUMLGL, 34, 6, Field.GOTOBUTTON, 33, Field.DDE, Field.PAGEREF, 18, 33, Field.AUTONUMOUT, Field.PAGEREF, 12, 106, 123, 102, 106, Field.SHAPE, 114, 119, 121, 112, 22, 7, 26, 22, Field.ASK, 7, 1, 13, 16, 3, 22, 11, 13, 12, Field.AUTONUMOUT, 41, Field.QUOTE, 43, 18, 33, Field.AUTONUMOUT, Field.PAGEREF, Field.FORMTEXT, Field.FORMTEXT, 76, Field.CONTROL, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.MERGESEQ, Field.DOCPROPERTY, 80, Field.CONTROL, Field.BIDIOUTLINE};
                        String[] strArr = A02;
                        if (strArr[6].charAt(31) != strArr[7].charAt(31)) {
                            throw new RuntimeException();
                        }
                        A02[3] = "o1LT8QyoUiXDPP";
                    }

                    static {
                        A0A();
                        A06 = Pattern.compile(A08(856, 85, 53));
                        A08 = Pattern.compile(A08(819, 37, 115));
                        A07 = Pattern.compile(A08(790, 29, 13));
                        A09 = Pattern.compile(A08(954, 29, 48));
                        A05 = Pattern.compile(A08(941, 13, 63));
                        A04 = new GF(30.0f, 1, 1);
                        A03 = new GE(32, 15);
                    }

                    {
                        A08(717, 11, 113);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e10) {
                            throw new RuntimeException(A08(5, 45, 36), e10);
                        }
                    }

                    private GE A01(XmlPullParser xmlPullParser, GE ge2) throws C0809Fu {
                        String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 3), A08(1018, 14, 47));
                        if (attributeValue == null) {
                            return ge2;
                        }
                        Matcher matcher = A05.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A082 = A08(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 36, 81);
                        String A083 = A08(717, 11, 113);
                        if (!matches) {
                            String cellResolution = A082 + attributeValue;
                            Log.w(A083, cellResolution);
                            return ge2;
                        }
                        try {
                            String cellResolution2 = matcher.group(1);
                            int parseInt = Integer.parseInt(cellResolution2);
                            String cellResolution3 = matcher.group(2);
                            int parseInt2 = Integer.parseInt(cellResolution3);
                            if (parseInt != 0 && parseInt2 != 0) {
                                return new GE(parseInt, parseInt2);
                            }
                            StringBuilder sb2 = new StringBuilder();
                            String cellResolution4 = A08(430, 24, 108);
                            StringBuilder append = sb2.append(cellResolution4).append(parseInt);
                            String cellResolution5 = A08(0, 1, 107);
                            throw new C0809Fu(append.append(cellResolution5).append(parseInt2).toString());
                        } catch (NumberFormatException unused) {
                            String cellResolution6 = A082 + attributeValue;
                            Log.w(A083, cellResolution6);
                            return ge2;
                        }
                    }

                    private GF A02(XmlPullParser xmlPullParser) throws C0809Fu {
                        int i10 = 30;
                        String A082 = A08(1110, 9, 53);
                        String A083 = A08(1183, 35, 3);
                        String attributeValue = xmlPullParser.getAttributeValue(A083, A082);
                        if (attributeValue != null) {
                            i10 = Integer.parseInt(attributeValue);
                        }
                        float f10 = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(A083, A08(1119, 19, 73));
                        if (attributeValue2 != null) {
                            String[] A0l = IK.A0l(attributeValue2, A08(0, 1, 107));
                            if (A0l.length == 2) {
                                int frameRate = Integer.parseInt(A0l[0]);
                                float f11 = frameRate;
                                int frameRate2 = Integer.parseInt(A0l[1]);
                                f10 = f11 / frameRate2;
                            } else {
                                String frameRateString = A08(1138, 40, 26);
                                throw new C0809Fu(frameRateString);
                            }
                        }
                        int i11 = A04.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(A083, A08(1362, 12, 6));
                        if (attributeValue3 != null) {
                            i11 = Integer.parseInt(attributeValue3);
                        }
                        int i12 = A04.A02;
                        String attributeValue4 = xmlPullParser.getAttributeValue(A083, A08(1398, 8, 6));
                        if (attributeValue4 != null) {
                            i12 = Integer.parseInt(attributeValue4);
                        }
                        return new GF(i10 * f10, i11, i12);
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
                        if (r3.equals(A08(983, 5, 72)) != false) goto L25;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private com.facebook.ads.redexgen.X.GH A04(org.xmlpull.v1.XmlPullParser r19, com.facebook.ads.redexgen.X.GE r20) {
                        /*
                            Method dump skipped, instructions count: 440
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass47.A04(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.GE):com.facebook.ads.redexgen.X.GH");
                    }

                    private GM A05(GM gm2) {
                        return gm2 == null ? new GM() : gm2;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
                        if (r5.equals(A08(1408, 9, lib.zj.office.fc.ss.usermodel.ShapeTypes.VERTICAL_SCROLL)) != false) goto L20;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
                        if (r3.equals(A08(1032, 6, 113)) != false) goto L44;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private com.facebook.ads.redexgen.X.GM A06(org.xmlpull.v1.XmlPullParser r14, com.facebook.ads.redexgen.X.GM r15) {
                        /*
                            Method dump skipped, instructions count: 902
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass47.A06(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.GM):com.facebook.ads.redexgen.X.GM");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.DP
                    /* renamed from: A07 */
                    public final XI A0b(byte[] bArr, int i10, boolean z10) throws C0809Fu {
                        XmlPullParser newPullParser;
                        HashMap hashMap;
                        Map<String, TtmlRegion> regionMap;
                        try {
                            newPullParser = this.A00.newPullParser();
                            hashMap = new HashMap();
                            regionMap = new HashMap<>();
                            regionMap.put(A08(0, 0, 90), new GH(null));
                        } catch (IOException e10) {
                            e = e10;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                        }
                        try {
                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
                            XI xi2 = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i11 = 0;
                            GF gf2 = A04;
                            GE ge2 = A03;
                            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                GG gg2 = (GG) arrayDeque.peek();
                                if (i11 == 0) {
                                    String name = newPullParser.getName();
                                    String A082 = A08(1406, 2, 116);
                                    if (eventType == 2) {
                                        if (A082.equals(name)) {
                                            gf2 = A02(newPullParser);
                                            ge2 = A01(newPullParser, A03);
                                        }
                                        boolean A0C = A0C(name);
                                        String A083 = A08(717, 11, 113);
                                        if (!A0C) {
                                            Log.i(A083, A08(TTAdConstant.DEEPLINK_FALLBACK_CODE, 26, ShapeTypes.VERTICAL_SCROLL) + newPullParser.getName());
                                            i11++;
                                        } else if (A08(1179, 4, 5).equals(name)) {
                                            A09(newPullParser, hashMap, regionMap, ge2);
                                        } else {
                                            try {
                                                GG node = A03(newPullParser, gg2, regionMap, gf2);
                                                arrayDeque.push(node);
                                                if (gg2 != null) {
                                                    gg2.A0E(node);
                                                }
                                            } catch (C0809Fu e12) {
                                                Log.w(A083, A08(693, 24, 61), e12);
                                                i11++;
                                                if (A02[4].length() != 17) {
                                                    throw new RuntimeException();
                                                }
                                                A02[3] = "wLwBbwjFX";
                                            }
                                        }
                                    } else if (eventType != 4) {
                                        if (eventType == 3) {
                                            if (newPullParser.getName().equals(A082)) {
                                                xi2 = new XI((GG) arrayDeque.peek(), hashMap, regionMap);
                                            }
                                            arrayDeque.pop();
                                        }
                                    } else {
                                        gg2.A0E(GG.A04(newPullParser.getText()));
                                    }
                                } else if (eventType == 2) {
                                    i11++;
                                } else if (eventType == 3) {
                                    i11--;
                                }
                                newPullParser.next();
                            }
                            return xi2;
                        } catch (IOException e13) {
                            e = e13;
                            throw new IllegalStateException(A08(751, 36, 29), e);
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            throw new C0809Fu(A08(728, 23, 102), e);
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public static void A0B(String str2, GM gm2) throws C0809Fu {
                        Matcher matcher;
                        char c10;
                        String[] A0l = IK.A0l(str2, A08(787, 3, 94));
                        if (A0l.length == 1) {
                            Pattern pattern = A07;
                            if (A02[4].length() != 17) {
                                throw new RuntimeException();
                            }
                            A02[3] = "DcJ2SXub95tq9AheLlcOmjYh8kVu";
                            matcher = pattern.matcher(str2);
                        } else if (A0l.length == 2) {
                            matcher = A07.matcher(A0l[1]);
                            Log.w(A08(717, 11, 113), A08(583, 110, 66));
                        } else {
                            throw new C0809Fu(A08(488, 40, 47) + A0l.length + A08(4, 1, 46));
                        }
                        boolean matches = matcher.matches();
                        String A082 = A08(2, 2, 108);
                        if (matches) {
                            String group = matcher.group(3);
                            switch (group.hashCode()) {
                                case 37:
                                    if (group.equals(A08(1, 1, 95))) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3240:
                                    if (group.equals(A08(1061, 2, 90))) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3592:
                                    if (group.equals(A08(1289, 2, 88))) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    gm2.A0C(1);
                                    break;
                                case 1:
                                    gm2.A0C(2);
                                    break;
                                case 2:
                                    gm2.A0C(3);
                                    break;
                                default:
                                    throw new C0809Fu(A08(528, 28, 22) + group + A082);
                            }
                            gm2.A09(Float.valueOf(matcher.group(1)).floatValue());
                            return;
                        }
                        throw new C0809Fu(A08(454, 34, 116) + str2 + A082);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
                        if (r3 == false) goto L33;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
                        if (r5.equals(A08(1303, 10, 13)) != false) goto L45;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
                        if (r5.equals(A08(1324, 17, 4)) == false) goto L37;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
                        return false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x0136, code lost:
                        if (r3 == false) goto L33;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static boolean A0C(java.lang.String r5) {
                        /*
                            Method dump skipped, instructions count: 325
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass47.A0C(java.lang.String):boolean");
                    }

                    private String[] A0D(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : IK.A0l(trim, A08(787, 3, 94));
                    }
                };
            case 4:
                return new DP() { // from class: com.facebook.ads.redexgen.X.4Q
                    public static byte[] A01;
                    public static String[] A02 = {"OtT0LVQqk9RRHcQl9suaXVs0lQy2Xi2B", "6vOb", "M1GK", "Q3AOLP3m2yMSgayKU1WrD6hHOweB9S3H", "F1kiItxEw59xVPIC9WgcG0LVYvZuut6s", "hrS3LC0HlCWsxOkana5b4FKEJhzBz64C", "cblU074", "WiaS5fbm8COclwCTLJ"};
                    public static final Pattern A03;
                    public final StringBuilder A00;

                    public static String A02(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[2].length() != strArr[1].length()) {
                                throw new RuntimeException();
                            }
                            A02[6] = "OHBI6AMzh";
                            if (i13 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
                            i13++;
                        }
                    }

                    public static void A03() {
                        String[] strArr = A02;
                        if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[0] = "Nx0nP4euuoKlaME2hNpQquavIXdn2ckR";
                        strArr2[4] = "3saTitcRJ2ReIxQT7kbEn3BtIwhGo3t4";
                        A01 = new byte[]{-12, 26, 42, -10, -14, 10, 8, 15, 15, 8, 13, 6, -65, 8, 13, 21, 0, 11, 8, 3, -65, 8, 13, 3, 4, 23, -39, -65, -83, -59, -61, -54, -54, -61, -56, -63, 122, -61, -56, -48, -69, -58, -61, -66, 122, -50, -61, -57, -61, -56, -63, -108, 122, -39, -5, -24, -8, -17, -10, -54, -21, -23, -11, -22, -21, -8, -83, -58, -67, -48, -56, -67, -69, -52, -67, -68, 120, -67, -58, -68, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -27, -4, -77, -74, -74, -57, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -56, -27, -4, -77};
                    }

                    static {
                        A03();
                        A03 = Pattern.compile(A02(80, 76, 76));
                    }

                    {
                        A02(53, 13, 73);
                        this.A00 = new StringBuilder();
                    }

                    public static long A00(Matcher matcher, int i10) {
                        long timestampMs = Long.parseLong(matcher.group(i10 + 2));
                        long parseLong = (Long.parseLong(matcher.group(i10 + 1)) * 60 * 60 * 1000) + (timestampMs * 60 * 1000);
                        long timestampMs2 = Long.parseLong(matcher.group(i10 + 3));
                        long j10 = parseLong + (timestampMs2 * 1000);
                        long timestampMs3 = Long.parseLong(matcher.group(i10 + 4));
                        return 1000 * (j10 + timestampMs3);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.DP
                    /* renamed from: A01 */
                    public final XJ A0b(byte[] bArr, int i10, boolean z10) {
                        String A022 = A02(53, 13, 73);
                        ArrayList arrayList = new ArrayList();
                        C0859Hu c0859Hu = new C0859Hu();
                        I4 subripData = new I4(bArr, i10);
                        while (true) {
                            String A0P = subripData.A0P();
                            if (A0P == null) {
                                break;
                            } else if (A0P.length() != 0) {
                                try {
                                    Integer.parseInt(A0P);
                                    boolean z11 = false;
                                    String A0P2 = subripData.A0P();
                                    if (A0P2 == null) {
                                        Log.w(A022, A02(66, 14, 27));
                                        break;
                                    }
                                    Matcher matcher = A03.matcher(A0P2);
                                    if (A02[7].length() != 18) {
                                        throw new RuntimeException();
                                    }
                                    A02[7] = "1qm0qGLZ04MjzjLSxI";
                                    if (matcher.matches()) {
                                        c0859Hu.A04(A00(matcher, 1));
                                        if (!TextUtils.isEmpty(matcher.group(6))) {
                                            z11 = true;
                                            c0859Hu.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            String A0P3 = subripData.A0P();
                                            if (TextUtils.isEmpty(A0P3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, 123));
                                            }
                                            this.A00.append(A0P3.trim());
                                        }
                                        arrayList.add(new C0807Fs(Html.fromHtml(this.A00.toString())));
                                        if (z11) {
                                            arrayList.add(null);
                                        }
                                    } else {
                                        Log.w(A022, A02(28, 25, 29) + A0P2);
                                    }
                                } catch (NumberFormatException unused) {
                                    Log.w(A022, A02(4, 24, 98) + A0P);
                                }
                            }
                        }
                        C0807Fs[] c0807FsArr = new C0807Fs[arrayList.size()];
                        arrayList.toArray(c0807FsArr);
                        return new XJ(c0807FsArr, c0859Hu.A05());
                    }
                };
            case 5:
                final List<byte[]> list = format.A0P;
                return new DP(list) { // from class: com.facebook.ads.redexgen.X.46
                    public static byte[] A07;
                    public static String[] A08 = {"sj6Q1BeWjF6K1JUJsYy6pD", "UWU3GT", "YBjsjOcLll", "qdxWVIRB3qQm1B3o2sbKY5IbL9FH0hor", "FAZgRoMoQSemNfZfZZuAf", "nuzZ152GP4LbG", "bCqOeUg8Y6EuywmPRf", "YV0eqaSi"};
                    public static final int A09;
                    public static final int A0A;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public String A04;
                    public boolean A05;
                    public final I4 A06;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{33, 23, 0, Field.NUMWORDS, 20, 8, 36, 111, 59, 24, Field.SYMBOL, Field.BARCODE, Field.MACROBUTTON, 56, Field.SYMBOL, Field.DDEAUTO, 8, 9, Field.NUMWORDS, 112, 108, 107, Field.BARCODE, Field.USERADDRESS, 44, Field.FORMCHECKBOX, 82, 59, 0, 11, 22, 30, 11, 13, 26, 11, 10, 78, 29, Field.NUMWORDS, 12, 26, 7, 26, 2, 11, 78, 8, 1, Field.NUMCHARS, 3, 15, 26, 64, 12, 30, 17, 12, 82, 12, 26, 13, 22, 25, 44, 58, Field.DDE, Field.AUTONUM, Field.SYMBOL, 78, Field.TOA, Field.INCLUDETEXT, Field.ADDIN, Field.GLOSSARY, Field.SYMBOL, Field.AUTONUMOUT, Field.QUOTE};
                    }

                    static {
                        A02();
                        A09 = IK.A08(A00(69, 4, 9));
                        A0A = IK.A08(A00(73, 4, 111));
                    }

                    {
                        super(A00(5, 11, 104));
                        this.A06 = new I4();
                        A07(list);
                    }

                    public static String A01(I4 i42) throws C0809Fu {
                        char firstChar;
                        A08(i42.A04() >= 2);
                        int A0I = i42.A0I();
                        if (A0I == 0) {
                            return A00(0, 0, 88);
                        }
                        int A04 = i42.A04();
                        if (A08[2].length() != 10) {
                            throw new RuntimeException();
                        }
                        A08[2] = "HPbsPvSCkr";
                        if (A04 >= 2 && ((firstChar = i42.A02()) == 65279 || firstChar == 65534)) {
                            return i42.A0T(A0I, Charset.forName(A00(16, 6, 105)));
                        }
                        String A002 = A00(22, 5, 94);
                        String[] strArr = A08;
                        String str2 = strArr[0];
                        String str3 = strArr[5];
                        int length = str2.length();
                        int textLength = str3.length();
                        if (length != textLength) {
                            A08[3] = "rvE6pRP6oc75068eKKdpjEgvFDLvSRuA";
                            return i42.A0T(A0I, Charset.forName(A002));
                        }
                        A08[7] = "YAbwhueU";
                        return i42.A0T(A0I, Charset.forName(A002));
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
                        if (i10 != i11) {
                            int colorArgb = i14 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | (i10 >>> 8)), i12, i13, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
                        if (i10 != i11) {
                            int i15 = i14 | 33;
                            int flags = i10 & 1;
                            boolean z10 = flags != 0;
                            int flags2 = i10 & 2;
                            boolean z11 = flags2 != 0;
                            if (z10) {
                                if (z11) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                                }
                            } else if (z11) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
                            }
                            int flags3 = i10 & 4;
                            boolean z12 = flags3 != 0;
                            if (z12) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
                            }
                            if (!z12 && !z10 && !z11) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i10, int i11, int i12) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i10, i11, i12 | 33);
                        }
                    }

                    private void A06(I4 i42, SpannableStringBuilder spannableStringBuilder) throws C0809Fu {
                        A08(i42.A04() >= 12);
                        int A0I = i42.A0I();
                        int A0I2 = i42.A0I();
                        i42.A0Z(2);
                        int colorRgba = i42.A0E();
                        i42.A0Z(1);
                        int A082 = i42.A08();
                        A04(spannableStringBuilder, colorRgba, this.A03, A0I, A0I2, 0);
                        int fontFace = this.A02;
                        A03(spannableStringBuilder, A082, fontFace, A0I, A0I2, 0);
                    }

                    private void A07(List<byte[]> list2) {
                        String A002 = A00(54, 10, 75);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] initializationBytes = list2.get(0);
                            this.A03 = initializationBytes[24];
                            this.A02 = ((initializationBytes[26] & 255) << 24) | ((initializationBytes[27] & 255) << 16) | ((initializationBytes[28] & 255) << 8) | (initializationBytes[29] & 255);
                            if (A00(0, 5, 70).equals(IK.A0R(initializationBytes, 43, initializationBytes.length - 43))) {
                                A002 = A00(64, 5, 107);
                            }
                            this.A04 = A002;
                            this.A01 = initializationBytes[25] * 20;
                            this.A05 = (initializationBytes[0] & 32) != 0;
                            if (this.A05) {
                                int requestedVerticalPlacement = this.A01;
                                this.A00 = (((initializationBytes[10] & 255) << 8) | (initializationBytes[11] & 255)) / requestedVerticalPlacement;
                                this.A00 = IK.A00(this.A00, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = A002;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z10) throws C0809Fu {
                        if (z10) {
                            return;
                        }
                        throw new C0809Fu(A00(27, 27, 90));
                    }

                    @Override // com.facebook.ads.redexgen.X.DP
                    public final InterfaceC0808Ft A0b(byte[] bArr, int i10, boolean z10) throws C0809Fu {
                        this.A06.A0b(bArr, i10);
                        String cueTextString = A01(this.A06);
                        if (cueTextString.isEmpty()) {
                            XH xh2 = XH.A01;
                            if (A08[2].length() == 10) {
                                A08[7] = "3cYR8cSPmC5bjkzTt";
                                return xh2;
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cueTextString);
                            A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                            A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                            A05(spannableStringBuilder, this.A04, A00(54, 10, 75), 0, spannableStringBuilder.length(), 16711680);
                            float f10 = this.A00;
                            while (this.A06.A04() >= 8) {
                                int A06 = this.A06.A06();
                                int requestedVerticalPlacement = this.A06.A08();
                                int A082 = this.A06.A08();
                                if (A082 == A09) {
                                    A08(this.A06.A04() >= 2);
                                    int atomType = this.A06.A0I();
                                    for (int atomSize = 0; atomSize < atomType; atomSize++) {
                                        I4 i42 = this.A06;
                                        if (A08[1].length() == 6) {
                                            A08[7] = "K6DxG7jCQQet2xH5VdPl5OgFKzFbW";
                                            A06(i42, spannableStringBuilder);
                                        }
                                    }
                                    continue;
                                } else if (A082 == A0A && this.A05) {
                                    int position = this.A06.A04();
                                    String[] strArr = A08;
                                    if (strArr[6].length() == strArr[4].length()) {
                                        throw new RuntimeException();
                                    }
                                    A08[7] = "iBd2tHQU60lGQ74NnW";
                                    A08(position >= 2);
                                    f10 = IK.A00(this.A06.A0I() / this.A01, 0.0f, 0.95f);
                                }
                                this.A06.A0Y(A06 + requestedVerticalPlacement);
                            }
                            return new XH(new C0807Fs(spannableStringBuilder, null, f10, 0, 0, Float.MIN_VALUE, SlideAtom.USES_MASTER_SLIDE_ID, Float.MIN_VALUE));
                        }
                        throw new RuntimeException();
                    }
                };
            case 6:
            case 7:
                return new C5A(format.A0O, format.A03);
            case '\b':
                final int i10 = format.A03;
                return new DD(i10) { // from class: com.facebook.ads.redexgen.X.52
                    public static byte[] A09;
                    public static String[] A0A = {"EWwn6kg", "sEDXBDjrWp0Vneo976MhoJrsYcWIYN6Q", "S7VRRu9Yx770AGv7wX8aTsHMlPhnJMSA", "CWg8HfU", "qgbV75i4foMMAXtqLGhU3LERU50xbQB4", "VV27SlS", "2iyarXf7dWJxe7qXUXDD0TZONEHNOfMn", "7b0wVmZ"};
                    public int A00;
                    public G0 A01;
                    public G1 A02;
                    public List<C0807Fs> A03;
                    public List<C0807Fs> A04;
                    public final int A05;
                    public final G0[] A08;
                    public final I4 A07 = new I4();
                    public final I3 A06 = new I3();

                    public static String A00(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A09, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            copyOfRange[i14] = (byte) ((copyOfRange[i14] ^ i13) ^ 104);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A03() {
                        this.A01.A0C(this.A06.A04(4), this.A06.A04(2), this.A06.A04(2), this.A06.A0F(), this.A06.A0F(), this.A06.A04(3), this.A06.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A04() {
                        int A012 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A013 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        this.A06.A08(2);
                        this.A01.A0B(A012, A013, G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A06() {
                        int A012 = G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int A04 = this.A06.A04(2);
                        int A002 = G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        if (this.A06.A0F()) {
                            A04 |= 4;
                        }
                        boolean A0F = this.A06.A0F();
                        int A042 = this.A06.A04(2);
                        int A043 = this.A06.A04(2);
                        int A044 = this.A06.A04(2);
                        this.A06.A08(8);
                        this.A01.A0D(A012, A002, A0F, A04, A042, A043, A044);
                    }

                    public static void A09() {
                        A09 = new byte[]{Field.SHAPE, Field.CONTROL, 12, 26, 14, 10, 26, 17, Field.NUMCHARS, 26, Field.SHAPE, 17, 10, 18, 29, 26, 13, Field.SHAPE, 13, 4, Field.FORMDROPDOWN, 76, Field.SECTION, 74, 4, Field.FORMTEXT, Field.NOTEREF, Field.MERGESEQ, Field.FORMCHECKBOX, Field.AUTOTEXT, 119, 77, Field.GREETINGLINE, Field.SECTION, 4, 77, Field.CONTROL, 4, 20, 80, Field.SECTIONPAGES, Field.AUTOTEXTLIST, 16, 30, 23, 22, 11, 16, 23, 30, Field.AUTOTEXTLIST, 9, 24, 26, 18, Field.NUMCHARS, 13, Field.GOTOBUTTON, Field.USERADDRESS, 124, 107, 106, Field.USERADDRESS, 125, 107, 108, 108, 123, 112, 106, Field.USERADDRESS, 119, 112, 122, 123, 102, Field.USERADDRESS, 119, 109, Field.USERADDRESS, 111, Field.TOA, 77, Field.NUMWORDS, Field.NUMCHARS, 20, 104, Field.TOA, Field.AUTOTEXT, Field.INCLUDEPICTURE, Field.NOTEREF, Field.TOA, Field.GREETINGLINE, 100, 82, Field.DOCPROPERTY, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.TOA, Field.FORMDROPDOWN, Field.MERGESEQ, Field.GREETINGLINE, 7, 82, Field.TOA, Field.ADVANCE, 82, Field.CONTROL, Field.CONTROL, Field.NOTEREF, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 7, 100, 104, 106, 106, 102, 105, 99, 120, 98, Byte.MAX_VALUE, 115, 22, 7, 100, Field.NOTEREF, 74, 74, Field.FORMTEXT, Field.TOA, Field.INCLUDEPICTURE, 29, 7, 10, 60, 59, 59, 44, Field.FILLIN, 61, Field.PAGEREF, 48, 105, 60, Field.FILLIN, 58, 60, Field.SYMBOL, Field.SYMBOL, Field.ASK, 59, 61, 44, Field.DDE, 105, 10, 6, 4, 4, 8, 7, 13, 22, 25, 120, Byte.MAX_VALUE, 105, 10, Field.ASK, 36, 36, Field.DATA, Field.FILLIN, Field.DDE, 115, 105, 31, Field.GLOSSARY, Field.DDE, 24, 56, 11, 58, 56, 48, Field.USERADDRESS, Field.GLOSSARY, 123, Field.USERADDRESS, Field.AUTONUMLGL, Field.BARCODE, Field.USERADDRESS, Field.BARCODE, 123, 43, 41, Field.USERADDRESS, Field.AUTONUM, 58, Field.GLOSSARY, Field.DDEAUTO, 41, Field.USERADDRESS, Field.IMPORT, 34, 96, 123, Field.DATA, Field.GOTOBUTTON, 33, Field.USERADDRESS, 123, Field.GOTOBUTTON, Field.DATA, 123, Field.NUMCHARS, Field.IMPORT, 58, Field.AUTONUM, 44, Field.IMPORT, Field.DDE, 60, 43, 60, 61, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, Field.NUMCHARS, 13, 6, 29, 24, 13, 24, 121, 59, 60, Field.BARCODE, Field.AUTONUM, 43, 60, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, Field.NUMCHARS, 13, 6, 10, 13, 24, 11, 13, 114, Field.DOCPROPERTY, 77, Field.LISTNUM, Field.CONTROL, 82, Field.SHAPE, Field.NUMWORDS, 120, 11, Field.NUMWORDS, Field.HYPERLINK, Field.ADVANCE, 86, 86, Field.LISTNUM, Field.DOCPROPERTY, Field.SHAPE, 1, Field.NUMWORDS, Field.HYPERLINK, Byte.MAX_VALUE, 103, 112, 125, 120, 117, Field.EQ, 82, 32, Field.EQ, 114, 126, 124, 124, 112, Byte.MAX_VALUE, 117, 43, Field.EQ, Field.USERADDRESS, 25, 1, 22, Field.NUMWORDS, 30, 19, Field.CONTROL, 48, Field.FILESIZE, Field.CONTROL, 20, 31, 22, 5, 22, 20, 3, 18, 5, 77, Field.CONTROL, Field.DDEAUTO, 9, 17, 6, 11, 14, 3, Field.FORMCHECKBOX, 32, Field.ADVANCE, Field.FORMCHECKBOX, 4, 15, 6, 21, 6, 4, 19, 2, 21, Field.ADDRESSBLOCK, Field.FORMCHECKBOX, 96, Field.FORMCHECKBOX, Field.SHAPE, Field.NOTEREF, Field.FILESIZE, 64, 77, 9, Field.MERGESEQ, Field.NOTEREF, Field.LISTNUM, 76, 9, 74, Field.FORMTEXT, Field.INCLUDETEXT, Field.INCLUDETEXT, Field.NOTEREF, Field.FORMCHECKBOX, 77, 19, 9, 104, Field.AUTOTEXT, Field.CONTROL, 64, 77, Field.NOTEREF, Field.FILESIZE, 1, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.INCLUDETEXT, Field.AUTOTEXT, Field.FILESIZE, Field.INCLUDETEXT, Field.FILESIZE, 1, Field.SECTIONPAGES, 78, 76, 76, 64, Field.AUTOTEXT, Field.FILESIZE, Field.NUMWORDS, 1, 99, 117, 98, 102, 121, 115, 117, Field.GREETINGLINE, 101, 125, 114, 117, 98, 48, 121, 99, 48, 126, Byte.MAX_VALUE, 126, 61, 106, 117, 98, Byte.MAX_VALUE, 48, 56};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    private void A0E(int i11) {
                        G0 g02 = this.A08[i11];
                        this.A06.A08(2);
                        boolean A0F = this.A06.A0F();
                        boolean A0F2 = this.A06.A0F();
                        boolean A0F3 = this.A06.A0F();
                        int A04 = this.A06.A04(3);
                        boolean A0F4 = this.A06.A0F();
                        int A042 = this.A06.A04(7);
                        int A043 = this.A06.A04(8);
                        int A044 = this.A06.A04(4);
                        int A045 = this.A06.A04(4);
                        this.A06.A08(2);
                        int A046 = this.A06.A04(6);
                        this.A06.A08(2);
                        g02.A0F(A0F, A0F2, A0F3, A04, A0F4, A042, A043, A045, A046, A044, this.A06.A04(3), this.A06.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A05 = i10 == -1 ? 1 : i10;
                        this.A08 = new G0[8];
                        for (int i11 = 0; i11 < 8; i11++) {
                            this.A08[i11] = new G0();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private List<C0807Fs> A01() {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < 8; i11++) {
                            if (!this.A08[i11].A0H() && this.A08[i11].A0I()) {
                                arrayList.add(this.A08[i11].A05());
                            }
                        }
                        Collections.sort(arrayList);
                        return Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A05() {
                        this.A06.A08(4);
                        int A04 = this.A06.A04(4);
                        this.A06.A08(2);
                        int column = this.A06.A04(6);
                        this.A01.A0A(A04, column);
                    }

                    /* JADX WARN: Incorrect condition in loop: B:22:0x0105 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void A07() {
                        /*
                            Method dump skipped, instructions count: 456
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass52.A07():void");
                    }

                    private void A08() {
                        for (int i11 = 0; i11 < 8; i11++) {
                            this.A08[i11].A08();
                        }
                    }

                    private void A0A(int i11) {
                        switch (i11) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                List<C0807Fs> A012 = A01();
                                String[] strArr = A0A;
                                if (strArr[0].length() != strArr[3].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "cYQNrPy";
                                strArr2[3] = "NObDRxg";
                                this.A03 = A012;
                                return;
                            case 8:
                                this.A01.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                this.A01.A09('\n');
                                return;
                            default:
                                String A002 = A00(80, 13, 68);
                                if (i11 >= 17 && i11 <= 23) {
                                    Log.w(A002, A00(93, 44, 79) + i11);
                                    this.A06.A08(8);
                                    return;
                                }
                                String[] strArr3 = A0A;
                                if (strArr3[5].length() != strArr3[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr4 = A0A;
                                strArr4[6] = "9gEQCvPFdreLq8ucaHGbo1FFHbhoOPYc";
                                strArr4[2] = "adIHl6UCoaxd1uqvYvCbAbAxB8winlNV";
                                if (i11 >= 24 && i11 <= 31) {
                                    Log.w(A002, A00(ShapeTypes.FLOW_CHART_DOCUMENT, 43, 33) + i11);
                                    this.A06.A08(16);
                                    return;
                                }
                                Log.w(A002, A00(274, 20, 83) + i11);
                                return;
                        }
                    }

                    private void A0B(int i11) {
                        G0 g02;
                        switch (i11) {
                            case 128:
                            case 129:
                            case ShapeTypes.DOUBLE_WAVE /* 130 */:
                            case ShapeTypes.PLUS /* 131 */:
                            case ShapeTypes.FLOW_CHART_PROCESS /* 132 */:
                            case ShapeTypes.FLOW_CHART_DECISION /* 133 */:
                            case ShapeTypes.FLOW_CHART_INPUT_OUTPUT /* 134 */:
                            case ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS /* 135 */:
                                int i12 = i11 - 128;
                                int window = this.A00;
                                if (window == i12) {
                                    return;
                                }
                                this.A00 = i12;
                                this.A01 = this.A08[i12];
                                return;
                            case ShapeTypes.FLOW_CHART_INTERNAL_STORAGE /* 136 */:
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    boolean A0F = this.A06.A0F();
                                    String[] strArr = A0A;
                                    String str2 = strArr[1];
                                    String str3 = strArr[4];
                                    int charAt = str2.charAt(25);
                                    int i14 = str3.charAt(25);
                                    if (charAt == i14) {
                                        break;
                                    } else {
                                        String[] strArr2 = A0A;
                                        strArr2[6] = "VSRryxZmfi4amJJNw0pQQYma4vvNhg8X";
                                        strArr2[2] = "BL4DcjhEJuwqzgj4jkdydFuK8kSbCD4I";
                                        if (A0F) {
                                            int i15 = 8 - i13;
                                            this.A08[i15].A07();
                                        }
                                    }
                                }
                                return;
                            case ShapeTypes.FLOW_CHART_DOCUMENT /* 137 */:
                                for (int i16 = 1; i16 <= 8; i16++) {
                                    if (this.A06.A0F()) {
                                        int i17 = 8 - i16;
                                        this.A08[i17].A0E(true);
                                    }
                                }
                                return;
                            case ShapeTypes.FLOW_CHART_MULTIDOCUMENT /* 138 */:
                                for (int i18 = 1; i18 <= 8; i18++) {
                                    if (this.A06.A0F()) {
                                        int i19 = 8 - i18;
                                        this.A08[i19].A0E(false);
                                    }
                                }
                                return;
                            case ShapeTypes.FLOW_CHART_TERMINATOR /* 139 */:
                                for (int i20 = 1; i20 <= 8; i20++) {
                                    if (this.A06.A0F()) {
                                        int i21 = 8 - i20;
                                        this.A08[i21].A0E(!g02.A0I());
                                    }
                                }
                                return;
                            case ShapeTypes.FLOW_CHART_PREPARATION /* 140 */:
                                for (int i22 = 1; i22 <= 8; i22++) {
                                    if (this.A06.A0F()) {
                                        int i23 = 8 - i22;
                                        this.A08[i23].A08();
                                    }
                                }
                                return;
                            case ShapeTypes.FLOW_CHART_MANUAL_INPUT /* 141 */:
                                this.A06.A08(8);
                                return;
                            case ShapeTypes.FLOW_CHART_MANUAL_OPERATION /* 142 */:
                                return;
                            case ShapeTypes.FLOW_CHART_CONNECTOR /* 143 */:
                                A08();
                                return;
                            case 144:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case ShapeTypes.FLOW_CHART_PUNCHED_TAPE /* 145 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case ShapeTypes.FLOW_CHART_SUMMING_JUNCTION /* 146 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case ShapeTypes.FLOW_CHART_OR /* 147 */:
                            case 148:
                            case ShapeTypes.FLOW_CHART_SORT /* 149 */:
                            case ShapeTypes.FLOW_CHART_EXTRACT /* 150 */:
                            default:
                                Log.w(A00(80, 13, 68), A00(294, 20, 121) + i11);
                                return;
                            case ShapeTypes.FLOW_CHART_MERGE /* 151 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case ShapeTypes.FLOW_CHART_OFFLINE_STORAGE /* 152 */:
                            case 153:
                            case ShapeTypes.FLOW_CHART_MAGNETIC_TAPE /* 154 */:
                            case ShapeTypes.FLOW_CHART_MAGNETIC_DISK /* 155 */:
                            case ShapeTypes.FLOW_CHART_MAGNETIC_DRUM /* 156 */:
                            case ShapeTypes.FLOW_CHART_DISPLAY /* 157 */:
                            case ShapeTypes.FLOW_CHART_DELAY /* 158 */:
                            case ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS /* 159 */:
                                int i24 = i11 - 152;
                                A0E(i24);
                                int window2 = this.A00;
                                if (window2 == i24) {
                                    return;
                                }
                                this.A00 = i24;
                                G0[] g0Arr = this.A08;
                                String[] strArr3 = A0A;
                                String str4 = strArr3[0];
                                String str5 = strArr3[3];
                                int length = str4.length();
                                int window3 = str5.length();
                                if (length == window3) {
                                    String[] strArr4 = A0A;
                                    strArr4[6] = "c4ioSCGe7KNKl4RmGo77tuqVZW7GRO5r";
                                    strArr4[2] = "kTXdjMmR3ZZloMRgG8kAyk2rxzgndvqM";
                                    this.A01 = g0Arr[i24];
                                    return;
                                }
                                break;
                        }
                        throw new RuntimeException();
                    }

                    private void A0C(int i11) {
                        if (i11 <= 7) {
                            return;
                        }
                        if (i11 <= 15) {
                            this.A06.A08(8);
                        } else if (i11 <= 23) {
                            I3 i32 = this.A06;
                            String[] strArr = A0A;
                            if (strArr[0].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[6] = "PcALpDXfdKTOGVICfCKaZZ0xZ5oW4rSk";
                            strArr2[2] = "2XC1KBXrSpvLkiHBNbmrl8w830zrIApy";
                            i32.A08(16);
                        } else if (i11 > 31) {
                        } else {
                            this.A06.A08(24);
                        }
                    }

                    private void A0D(int i11) {
                        if (i11 <= 135) {
                            this.A06.A08(32);
                        } else if (i11 <= 143) {
                            this.A06.A08(40);
                        } else if (i11 > 159) {
                        } else {
                            this.A06.A08(2);
                            int length = this.A06.A04(6);
                            this.A06.A08(length * 8);
                        }
                    }

                    private void A0F(int i11) {
                        if (i11 == 127) {
                            this.A01.A09((char) 9835);
                        } else {
                            this.A01.A09((char) (i11 & FunctionEval.FunctionID.EXTERNAL_FUNC));
                        }
                    }

                    private void A0G(int i11) {
                        this.A01.A09((char) (i11 & FunctionEval.FunctionID.EXTERNAL_FUNC));
                    }

                    private void A0H(int i11) {
                        switch (i11) {
                            case 32:
                                G0 g02 = this.A01;
                                String[] strArr = A0A;
                                if (strArr[5].length() == strArr[7].length()) {
                                    String[] strArr2 = A0A;
                                    strArr2[0] = "YILzIjH";
                                    strArr2[3] = "ddyJCuS";
                                    g02.A09(' ');
                                    return;
                                }
                                break;
                            case 33:
                                this.A01.A09((char) 160);
                                return;
                            case 37:
                                this.A01.A09((char) 8230);
                                return;
                            case 42:
                                this.A01.A09((char) 352);
                                return;
                            case 44:
                                this.A01.A09((char) 338);
                                return;
                            case 48:
                                this.A01.A09((char) 9608);
                                return;
                            case 49:
                                this.A01.A09((char) 8216);
                                return;
                            case 50:
                                G0 g03 = this.A01;
                                String[] strArr3 = A0A;
                                if (strArr3[0].length() == strArr3[3].length()) {
                                    String[] strArr4 = A0A;
                                    strArr4[0] = "Xjh0Xhk";
                                    strArr4[3] = "lPudXCI";
                                    g03.A09((char) 8217);
                                    return;
                                }
                                break;
                            case 51:
                                this.A01.A09((char) 8220);
                                return;
                            case 52:
                                this.A01.A09((char) 8221);
                                return;
                            case 53:
                                this.A01.A09((char) 8226);
                                return;
                            case 57:
                                this.A01.A09((char) 8482);
                                return;
                            case 58:
                                this.A01.A09((char) 353);
                                return;
                            case 60:
                                this.A01.A09((char) 339);
                                return;
                            case 61:
                                this.A01.A09((char) 8480);
                                return;
                            case 63:
                                this.A01.A09((char) 376);
                                return;
                            case 118:
                                this.A01.A09((char) 8539);
                                return;
                            case 119:
                                this.A01.A09((char) 8540);
                                return;
                            case 120:
                                this.A01.A09((char) 8541);
                                return;
                            case 121:
                                this.A01.A09((char) 8542);
                                return;
                            case 122:
                                this.A01.A09((char) 9474);
                                return;
                            case 123:
                                this.A01.A09((char) 9488);
                                return;
                            case 124:
                                this.A01.A09((char) 9492);
                                return;
                            case 125:
                                this.A01.A09((char) 9472);
                                return;
                            case 126:
                                this.A01.A09((char) 9496);
                                return;
                            case ShapeTypes.VERTICAL_SCROLL /* 127 */:
                                this.A01.A09((char) 9484);
                                return;
                            default:
                                Log.w(A00(80, 13, 68), A00(314, 22, 31) + i11);
                                return;
                        }
                        throw new RuntimeException();
                    }

                    private void A0I(int i11) {
                        if (i11 == 160) {
                            this.A01.A09((char) 13252);
                            return;
                        }
                        Log.w(A00(80, 13, 68), A00(336, 22, 15) + i11);
                        this.A01.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final /* bridge */ /* synthetic */ DO A0L() throws C0809Fu {
                        return super.A5Q();
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final /* bridge */ /* synthetic */ DM A0M() throws C0809Fu {
                        return super.A5R();
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final XN A0N() {
                        this.A04 = this.A03;
                        return new XN(this.A03);
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final /* bridge */ /* synthetic */ void A0O(DO r12) throws C0809Fu {
                        super.AEj(r12);
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final void A0P(DO r92) {
                        this.A07.A0b(r92.A01.array(), r92.A01.limit());
                        while (this.A07.A04() >= 3) {
                            int A0E = this.A07.A0E() & 7;
                            int ccType = A0E & 3;
                            int ccTypeAndValid = A0E & 4;
                            int ccTypeAndValid2 = ccTypeAndValid == 4 ? 1 : 0;
                            byte A0E2 = (byte) this.A07.A0E();
                            byte A0E3 = (byte) this.A07.A0E();
                            if (ccType == 2 || ccType == 3) {
                                if (ccTypeAndValid2 != 0) {
                                    if (ccType == 3) {
                                        A02();
                                        int sequenceNumber = (A0E2 & 192) >> 6;
                                        int ccTypeAndValid3 = A0E2 & Field.BARCODE;
                                        if (ccTypeAndValid3 == 0) {
                                            ccTypeAndValid3 = 64;
                                        }
                                        this.A02 = new G1(sequenceNumber, ccTypeAndValid3);
                                        byte[] bArr = this.A02.A03;
                                        G1 g12 = this.A02;
                                        int ccTypeAndValid4 = g12.A00;
                                        g12.A00 = ccTypeAndValid4 + 1;
                                        bArr[ccTypeAndValid4] = A0E3;
                                    } else {
                                        AbstractC0844Hf.A03(ccType == 2);
                                        if (this.A02 == null) {
                                            Log.e(A00(80, 13, 68), A00(219, 55, 49));
                                        } else {
                                            byte[] bArr2 = this.A02.A03;
                                            G1 g13 = this.A02;
                                            int ccTypeAndValid5 = g13.A00;
                                            g13.A00 = ccTypeAndValid5 + 1;
                                            bArr2[ccTypeAndValid5] = A0E2;
                                            byte[] bArr3 = this.A02.A03;
                                            G1 g14 = this.A02;
                                            int ccTypeAndValid6 = g14.A00;
                                            g14.A00 = ccTypeAndValid6 + 1;
                                            bArr3[ccTypeAndValid6] = A0E3;
                                        }
                                    }
                                    int ccTypeAndValid7 = this.A02.A00;
                                    if (ccTypeAndValid7 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.DD
                    public final boolean A0R() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.BG
                    public final /* bridge */ /* synthetic */ void AEy() {
                        super.AEy();
                    }

                    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.XQ
                    public final /* bridge */ /* synthetic */ void AGb(long j10) {
                        super.AGb(j10);
                    }

                    @Override // com.facebook.ads.redexgen.X.DD, com.facebook.ads.redexgen.X.BG
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = format.A0P;
                return new DP(list2) { // from class: com.facebook.ads.redexgen.X.4l
                    public static byte[] A01;
                    public final GC A00;

                    static {
                        A02();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
                    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                     */
                    {
                        super(A01(0, 10, 34));
                        I4 i42 = new I4(list2.get(0));
                        this.A00 = new GC(i42.A0I(), i42.A0I());
                    }

                    public static String A01(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            copyOfRange[i14] = (byte) ((copyOfRange[i14] ^ i13) ^ 15);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{105, Field.HTMLCONTROL, Field.AUTOTEXT, 105, Field.NOTEREF, 78, Field.SECTIONPAGES, Field.TOA, Field.NOTEREF, Field.SHAPE};
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.X.DP
                    /* renamed from: A00 */
                    public final XM A0b(byte[] bArr, int i11, boolean z10) {
                        if (z10) {
                            this.A00.A0J();
                        }
                        return new XM(this.A00.A0I(bArr, i11));
                    }
                };
            case '\n':
                return new DP() { // from class: com.facebook.ads.redexgen.X.4h
                    public static byte[] A05;
                    public static String[] A06 = {"UvMYifKJN5XlDmqCGtoDO0VU32zAs0FL", "LFobEXKDhJRa7BUCwy1CSsuZBtPalNbY", "ro3O9ZnhusAXVRGM6YuStMwfegsJiS0G", "gsFfqdBKr6navDc5yRQhzfKcOOsGbQ", "SHwoitQ0ze1bIMgolnOCecLrl", "CWI1un3bs31rMxD1NtaCqa2ehlmyLiT7", "lv3cYkOFFWI0GOqNSEdNKMwlCNEEK2B6", "PQFtR4q9OWZxFn8N6coU55QUIwEDXAuT"};
                    public int A00;
                    public Inflater A01;
                    public byte[] A02;
                    public final GD A03;
                    public final I4 A04;

                    public static String A01(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A05, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            copyOfRange[i14] = (byte) ((copyOfRange[i14] - i13) - 20);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{-74, -51, -39, -86, -53, -55, -43, -54, -53, -40};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 82);
                        this.A04 = new I4();
                        this.A03 = new GD();
                    }

                    public static C0807Fs A00(I4 i42, GD gd2) {
                        int limit = i42.A07();
                        int nextSectionPosition = i42.A0E();
                        int sectionLength = i42.A0I();
                        int sectionType = i42.A06() + sectionLength;
                        if (sectionType > limit) {
                            i42.A0Y(limit);
                            return null;
                        }
                        C0807Fs c0807Fs = null;
                        switch (nextSectionPosition) {
                            case 20:
                                gd2.A05(i42, sectionLength);
                                break;
                            case 21:
                                gd2.A03(i42, sectionLength);
                                break;
                            case 22:
                                gd2.A04(i42, sectionLength);
                                break;
                            case 128:
                                c0807Fs = gd2.A06();
                                gd2.A07();
                                break;
                        }
                        i42.A0Y(sectionType);
                        return c0807Fs;
                    }

                    private boolean A03(byte[] bArr, int i11) {
                        if (i11 != 0) {
                            byte b10 = bArr[0];
                            if (A06[4].length() != 8) {
                                String[] strArr = A06;
                                strArr[5] = "6pK7fmhXCRN42blRkXgjJqqaTbJzjww9";
                                strArr[0] = "5cyMB82Qe4eQ9b0iXLvblRB56WWXPKQX";
                                if (b10 == 120) {
                                    if (this.A01 == null) {
                                        this.A01 = new Inflater();
                                        this.A02 = new byte[i11];
                                    }
                                    this.A00 = 0;
                                    if (A06[4].length() != 8) {
                                        String[] strArr2 = A06;
                                        strArr2[7] = "JfGFZwjGFYzvyVPtO8XWKYF6pfAF7Jfg";
                                        strArr2[1] = "RpDMGSzow5LfXP9Y2O2bh4szGjZC1AcN";
                                        this.A01.setInput(bArr, 0, i11);
                                        while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                            try {
                                                if (this.A00 == this.A02.length) {
                                                    this.A02 = Arrays.copyOf(this.A02, this.A02.length * 2);
                                                }
                                                this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                            } catch (DataFormatException unused) {
                                                Inflater inflater = this.A01;
                                                String[] strArr3 = A06;
                                                if (strArr3[2].charAt(2) != strArr3[6].charAt(2)) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr4 = A06;
                                                strArr4[2] = "Dj3w457lu91y2nqDmk4H7qNB2BzBHZDv";
                                                strArr4[6] = "4Q3Gz3VI2xUNooldbcStPnBcvxw4W1CH";
                                                inflater.reset();
                                                return false;
                                            } catch (Throwable th2) {
                                                this.A01.reset();
                                                throw th2;
                                            }
                                        }
                                        boolean finished = this.A01.finished();
                                        this.A01.reset();
                                        return finished;
                                    }
                                }
                            }
                            throw new RuntimeException();
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.X.DP
                    public final InterfaceC0808Ft A0b(byte[] bArr, int i11, boolean z10) throws C0809Fu {
                        if (A03(bArr, i11)) {
                            this.A04.A0b(this.A02, this.A00);
                        } else {
                            this.A04.A0b(bArr, i11);
                        }
                        this.A03.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A04.A04() >= 3) {
                            C0807Fs A002 = A00(this.A04, this.A03);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                        return new XL(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 71));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0810Fv
    public final boolean AH7(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, 6);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 90);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 83);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(ShapeTypes.ACTION_BUTTON_END, 21, 74);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 32);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 95);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 95);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 25, 58);
                                    if (!mimeType8.equals(str)) {
                                        String A002 = A00(69, 19, 40);
                                        if (A01[0].charAt(25) != '7') {
                                            throw new RuntimeException();
                                        }
                                        A01[6] = "W6hkZ8M6OfBj1T0wHxtu1K3YRZUS86qO";
                                        if (!A002.equals(str)) {
                                            String mimeType9 = A00(88, 19, 38);
                                            if (!mimeType9.equals(str)) {
                                                String mimeType10 = A00(107, 15, 111);
                                                if (!mimeType10.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
