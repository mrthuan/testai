package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class GW {
    public static byte[] A01;
    public static String[] A02 = {OperatorName.LINE_TO, "0bXtqnK7VrdXD0OF7yjeOhZXwD", "4DjlIcJyMhOrx13zbyn9Ua1RUzJozfx0", "beOSLAv7e2KhfeXoZ7t1Cc5ewaJxOMdg", "GNaumKrLUMzUxNnx56k9DhfmMoIfnfS2", "0kngC87KKeD1AW87c5HXBxKU7GMyFl67", "rK5XcwzMLXV02PJ3vhhpqELTOW5ZlmlZ", "bQ0kVf6GKUjzG3PLoijh7NiGkCWFuG9r"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, -53, -115, -65, -13, -22, -62, -42, -64, -47, -65, -13, -22, -62, -64, -99, -43, -63, -47, -10, -2, -23, -12, -15, -20, -88, -23, -12, -15, -17, -10, -11, -19, -10, -4, -88, -2, -23, -12, -3, -19, -62, -88, -31, 6, 14, -7, 4, 1, -4, -72, -7, 6, -5, 0, 7, 10, -72, 14, -7, 4, 13, -3, -46, -72, 13, Field.PAGEREF, Field.QUOTE, 42, 42, Field.QUOTE, Field.DATA, 33, -38, Field.NUMCHARS, Field.NUMWORDS, 30, -38, 29, Field.GLOSSARY, 31, -38, Field.DDE, 31, Field.DDEAUTO, Field.DDEAUTO, Field.QUOTE, Field.DATA, 33, -12, -38, -57, -33, -35, -28, -28, -35, -30, -37, -108, -41, -23, -39, -108, -21, -35, -24, -36, -108, -42, -43, -40, -108, -36, -39, -43, -40, -39, -26, -82, -108, -79, -54, -57, -54, -53, -45, -54, 124, -65, -47, -63, 124, -49, -63, -48, -48, -59, -54, -61, 124, 3, 17, 14, 34, 32, 32, -17, 33, 17, -4, 13, 30, 31, 17, 30, -6, -65, -5, -51, -4, -54, -108, -56, -65, -105, -107, -56, -33, -105, -103, -103, -86, -56, -33, -105, -108, -56, -65, -105, -107, -108, -102, -106, -107, -85, -112, -8, 3, 0, -2, 5, -10, 2, 5, Field.GLOSSARY, 13, -45, -43, -34, -28, -43, -30, Field.GOTOBUTTON, 59, Field.EQ, -26, -13, 5, 43, 41, 48, Field.EQ, Field.AUTONUMOUT, 43, 48, 41, -30, Field.IMPORT, 48, Field.AUTONUMLGL, Field.IMPORT, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.EQ, Field.AUTONUMOUT, Field.AUTONUM, Field.FILLIN, Field.ASK, -30, Field.FILLIN, 48, Field.AUTONUM, 43, Field.AUTONUM, 59, -4, -30, -23, -24, -27, -38, -25, -32, -57, -64, -63, -49, Field.AUTONUM, Field.MACROBUTTON, 56, Field.GLOSSARY, -36, -28, -30, -34, -39, -39, -31, -38, -66, -78, -61, -64, Field.DDEAUTO, Field.DDE, Field.EQ, Field.FILLIN, Field.GOTOBUTTON, Field.FILLIN, Field.DDE, 44, -13, -22, -24, -23, -11, Field.DDE, Field.QUOTE, Field.AUTONUMOUT, 31, -59, -58, -77, -60, -58, 13, -51};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final boolean A0G(I4 i42, GT gt, List<GR> list) {
        String A0P = i42.A0P();
        if (A0P == null) {
            return false;
        }
        Matcher matcher = A03.matcher(A0P);
        if (matcher.matches()) {
            return A0F(null, matcher, i42, gt, this.A00, list);
        }
        String A0P2 = i42.A0P();
        if (A0P2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(A0P2);
        if (matcher2.matches()) {
            String trim = A0P.trim();
            StringBuilder sb2 = this.A00;
            if (A02[0].length() != 11) {
                A02[0] = "E";
                return A0F(trim, matcher2, i42, gt, sb2, list);
            }
            throw new RuntimeException();
        }
        return false;
    }

    static {
        A05();
        A03 = Pattern.compile(A03(ShapeTypes.ACTION_BUTTON_BLANK, 26, 28));
        A04 = Pattern.compile(A03(3, 12, 71));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 32))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, 37))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals(A03(203, 3, 125))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals(A03(281, 5, 2))) {
                    c = 0;
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
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                Log.w(A03(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 15, 92), A03(43, 22, 72) + str);
                return SlideAtom.USES_MASTER_SLIDE_ID;
        }
    }

    public static int A01(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        if (indexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = indexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        if (r6.equals(A03(244, 4, 11)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (r6.equals(A03(244, 3, 7)) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout.Alignment A02(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GW.A02(java.lang.String):android.text.Layout$Alignment");
    }

    public static String A04(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            String[] strArr = A02;
            if (strArr[1].length() != strArr[2].length()) {
                A02[5] = "42liCGy7Kchgdz7EhWQaYXlXohgkwLqz";
                return null;
            }
            throw new RuntimeException();
        }
        return IK.A0m(trim, A03(ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, 5, 79))[0];
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, GR gr, int i10, int i11) {
        if (gr == null) {
            return;
        }
        int A08 = gr.A08();
        if (A02[5].charAt(4) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "VsLQDcA6s0fbGy4oRFjLDoSCdNYz0JtP";
        strArr[4] = "T1bcli7rjR90dcoQEJFyzT2kGGWOMofL";
        if (A08 != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(gr.A08()), i10, i11, 33);
        }
        if (gr.A0O()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gr.A0P()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gr.A0N()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(gr.A06()), i10, i11, 33);
        }
        if (gr.A0M()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(gr.A05()), i10, i11, 33);
        }
        if (gr.A0H() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(gr.A0H()), i10, i11, 33);
        }
        if (gr.A0A() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(gr.A0A()), i10, i11, 33);
        }
        switch (gr.A07()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) gr.A04(), true), i10, i11, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gr.A04()), i10, i11, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gr.A04() / 100.0f), i10, i11, 33);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals(A03(206, 2, 47))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3464:
                if (str.equals(A03(252, 2, 32))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96708:
                if (str.equals(A03(192, 3, 69))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3374865:
                if (str.equals(A03(260, 4, 0))) {
                    c = 2;
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
                spannableStringBuilder.append('<');
                return;
            case 1:
                spannableStringBuilder.append('>');
                return;
            case 2:
                spannableStringBuilder.append(' ');
                return;
            case 3:
                spannableStringBuilder.append('&');
                return;
            default:
                Log.w(A03(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 15, 92), A03(209, 31, 114) + str + A03(16, 2, 74));
                return;
        }
    }

    public static void A08(String str, GT gt) {
        String name = A03(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 15, 92);
        Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if (A03(248, 4, 122).equals(group)) {
                    A09(group2, gt);
                } else if (A03(ShapeTypes.CHART_PLUS, 5, 71).equals(group)) {
                    gt.A0B(A02(group2));
                } else if (A03(264, 8, 110).equals(group)) {
                    A0A(group2, gt);
                } else if (A03(277, 4, 106).equals(group)) {
                    gt.A05(GX.A00(group2));
                } else {
                    Log.w(name, A03(121, 20, 12) + group + A03(15, 1, 19) + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w(name, A03(65, 26, 106) + matcher.group());
            }
        }
    }

    public static void A09(String str, GT gt) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            gt.A06(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            gt.A06(SlideAtom.USES_MASTER_SLIDE_ID);
        }
        if (str.endsWith(A03(2, 1, 24))) {
            gt.A03(GX.A00(str)).A07(0);
            return;
        }
        int commaIndex = Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        gt.A03(commaIndex).A07(1);
    }

    public static void A0A(String str, GT gt) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            gt.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, indexOf);
        } else {
            gt.A08(SlideAtom.USES_MASTER_SLIDE_ID);
        }
        gt.A04(GX.A00(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0B(String str, GU gu, SpannableStringBuilder spannableStringBuilder, List<GR> list, List<GV> list2) {
        int start;
        int i10 = gu.A00;
        int i11 = spannableStringBuilder.length();
        String str2 = gu.A01;
        int start2 = str2.hashCode();
        switch (start2) {
            case 0:
                if (str2.equals(A03(0, 0, 62))) {
                    start = 6;
                    break;
                }
                start = -1;
                break;
            case 98:
                if (str2.equals(A03(195, 1, 125))) {
                    start = 0;
                    break;
                }
                start = -1;
                break;
            case 99:
                if (str2.equals(A03(196, 1, 90))) {
                    start = 3;
                    break;
                }
                start = -1;
                break;
            case 105:
                String[] strArr = A02;
                String str3 = strArr[1];
                String str4 = strArr[2];
                int end = str3.length();
                int start3 = str4.length();
                if (end == start3) {
                    throw new RuntimeException();
                }
                A02[7] = "bxBhnpp4r3F9KkdBNWptBBHUc7fuMdsj";
                if (str2.equals(A03(208, 1, 76))) {
                    start = 1;
                    break;
                }
                start = -1;
                break;
            case 117:
                if (str2.equals(A03(286, 1, 72))) {
                    start = 2;
                    break;
                }
                start = -1;
                break;
            case 118:
                if (str2.equals(A03(287, 1, 7))) {
                    start = 5;
                    break;
                }
                start = -1;
                break;
            case 3314158:
                if (str2.equals(A03(240, 4, 41))) {
                    start = 4;
                    break;
                }
                start = -1;
                break;
            default:
                start = -1;
                break;
        }
        switch (start) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, i11, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                return;
        }
        list2.clear();
        A0D(list, str, gu, list2);
        int styleMatchesCount = list2.size();
        for (int end2 = 0; end2 < styleMatchesCount; end2++) {
            A06(spannableStringBuilder, list2.get(end2).A01, i10, i11);
        }
    }

    public static void A0C(String str, String str2, GT gt, List<GR> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            switch (charAt) {
                case '&':
                    int spaceEndIndex = str2.indexOf(59, i10 + 1);
                    int indexOf = str2.indexOf(32, i10 + 1);
                    if (spaceEndIndex == -1) {
                        spaceEndIndex = indexOf;
                    } else if (indexOf != -1) {
                        spaceEndIndex = Math.min(spaceEndIndex, indexOf);
                    }
                    if (spaceEndIndex != -1) {
                        A07(str2.substring(i10 + 1, spaceEndIndex), spannableStringBuilder);
                        if (spaceEndIndex == indexOf) {
                            spannableStringBuilder.append((CharSequence) A03(1, 1, 91));
                        }
                        i10 = spaceEndIndex + 1;
                        break;
                    } else {
                        spannableStringBuilder.append(charAt);
                        i10++;
                        break;
                    }
                case '<':
                    if (i10 + 1 >= str2.length()) {
                        i10++;
                        break;
                    } else {
                        int i11 = i10;
                        boolean z10 = str2.charAt(i11 + 1) == '/';
                        i10 = A01(str2, i11 + 1);
                        boolean z11 = str2.charAt(i10 + (-2)) == '/';
                        String fullTagExpression = str2.substring((z10 ? 2 : 1) + i11, z11 ? i10 - 2 : i10 - 1);
                        String A042 = A04(fullTagExpression);
                        if (A042 != null) {
                            boolean A0E = A0E(A042);
                            if (A02[7].charAt(0) == 'b') {
                                A02[5] = "hEv4CEbT3Ty4Wl9Tcg95bymjL25J8k7D";
                                if (!A0E) {
                                    break;
                                } else if (z10) {
                                    while (!arrayDeque.isEmpty()) {
                                        GU gu = (GU) arrayDeque.pop();
                                        A0B(str, gu, spannableStringBuilder, list, arrayList);
                                        if (gu.A01.equals(A042)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z11) {
                                    arrayDeque.push(GU.A01(fullTagExpression, spannableStringBuilder.length()));
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    }
                default:
                    spannableStringBuilder.append(charAt);
                    i10++;
                    break;
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (GU) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, GU.A00(), spannableStringBuilder, list, arrayList);
        gt.A0C(spannableStringBuilder);
    }

    public static void A0D(List<GR> list, String str, GU gu, List<GV> list2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            GR gr = list.get(i10);
            int i11 = gr.A09(str, gu.A01, gu.A03, gu.A02);
            if (i11 > 0) {
                list2.add(new GV(i11, gr));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 0
            r6 = 1
            switch(r0) {
                case 98: goto L92;
                case 99: goto L80;
                case 105: goto L6f;
                case 117: goto L4a;
                case 118: goto L3a;
                case 3314158: goto Le;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La4;
                case 3: goto La4;
                case 4: goto La4;
                case 5: goto La4;
                default: goto Ld;
            }
        Ld:
            return r7
        Le:
            r5 = 240(0xf0, float:3.36E-43)
            r4 = 4
            r3 = 41
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GW.A02
            r0 = 3
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 55
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GW.A02
            java.lang.String r1 = "3MdATCvstDHTUNUzCjQVNt1ukZ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "71LSpmQiAj9rYHqnoAGWnfkbV1NfksJ2"
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = A03(r5, r4, r3)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 3
            goto La
        L3a:
            r2 = 287(0x11f, float:4.02E-43)
            r1 = 1
            r0 = 7
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 5
            goto La
        L4a:
            r5 = 286(0x11e, float:4.01E-43)
            r4 = 1
            r3 = 72
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GW.A02
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GW.A02
            java.lang.String r1 = "TB71hBx7ht8z"
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = A03(r5, r4, r3)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 4
            goto La
        L6f:
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 1
            r0 = 76
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        L80:
            r2 = 196(0xc4, float:2.75E-43)
            r1 = 1
            r0 = 90
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L92:
            r2 = 195(0xc3, float:2.73E-43)
            r1 = 1
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        La4:
            return r6
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GW.A0E(java.lang.String):boolean");
    }

    public static boolean A0F(String str, Matcher matcher, I4 i42, GT gt, StringBuilder sb2, List<GR> list) {
        try {
            gt.A0A(GX.A01(matcher.group(1))).A09(GX.A01(matcher.group(2)));
            A08(matcher.group(3), gt);
            sb2.setLength(0);
            while (true) {
                String A0P = i42.A0P();
                if (!TextUtils.isEmpty(A0P)) {
                    int length = sb2.length();
                    if (A02[0].length() == 11) {
                        throw new RuntimeException();
                    }
                    A02[0] = "L6eB6jb6lgXv7JHHOjxuHI";
                    if (length > 0) {
                        sb2.append(A03(0, 1, 26));
                    }
                    sb2.append(A0P.trim());
                } else {
                    A0C(str, sb2.toString(), gt, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(ShapeTypes.FLOW_CHART_MANUAL_INPUT, 15, 92), A03(91, 30, 36) + matcher.group());
            return false;
        }
    }
}
