package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0903Jq {
    public static byte[] A04;
    public static String[] A05 = {"ZYrzMRmVY0fKuwQx318rNacSlgEREo8W", "DFlEfnYj9N0tv35MBsRVrv0NQ03vrQp9", "7c1jEy6Yvwz0PD0sTLnvRvzL7JrMoPnP", "hf", "LVfRkpSB2W01n6UoKBvMpgi93s4V", "wjSsCSJEOA2zcxlJjQpf4WZQJP", "cgSUujLLCITlA6k0bkAALzG3bpp7bkqz", "L2ObalbYjPtjYVm4HCkeGK0BV8R2iNFP"};
    public final EnumC0902Jp A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C0903Jq(C7j c7j, String str, String str2, EnumC0898Jl enumC0898Jl) throws C0895Jh {
        String A01 = A01(270, 21, 91);
        String A012 = A01(291, 11, 58);
        String A013 = A01(247, 14, 109);
        String A014 = A01(310, 4, 38);
        String A015 = A01(302, 8, 37);
        if (TextUtils.isEmpty(str)) {
            this.A00 = EnumC0902Jp.A04;
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C0901Jo.A00[EnumC0902Jp.valueOf(jSONObject.getString(A014).toUpperCase()).ordinal()]) {
                case 1:
                    this.A00 = EnumC0902Jp.A03;
                    this.A01 = Long.valueOf(jSONObject.getString(A01(241, 6, ShapeTypes.VERTICAL_SCROLL)));
                    if (jSONObject.has(A013)) {
                        this.A02 = jSONObject.getString(A013);
                    } else {
                        this.A02 = null;
                    }
                    this.A03 = jSONObject.getString(A01(261, 9, 88));
                    if (!jSONObject.getString(A012).equals(c7j.A04().A8g()) && !ProcessUtils.isRemoteRenderingProcess()) {
                        throw new C0895Jh(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(0, 54, 122), this.A01, jSONObject.getString(A012), c7j.A04().A8g()));
                    }
                    if (!jSONObject.getString(A01).equals(str2)) {
                        throw new C0895Jh(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(54, 50, 11), this.A01, jSONObject.getString(A01), str2));
                    }
                    HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(EnumC0898Jl.A0H.A04()), Integer.valueOf(EnumC0898Jl.A0K.A04()), Integer.valueOf(EnumC0898Jl.A0I.A04()), Integer.valueOf(EnumC0898Jl.A0J.A04())));
                    if (jSONObject.getInt(A015) != enumC0898Jl.A04()) {
                        if (!hashSet.contains(Integer.valueOf(jSONObject.getInt(A015))) || !hashSet.contains(Integer.valueOf(enumC0898Jl.A04()))) {
                            throw new C0895Jh(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(104, 48, 28), this.A01, Integer.valueOf(jSONObject.getInt(A015)), enumC0898Jl));
                        }
                        return;
                    }
                    return;
                default:
                    throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, A01(210, 28, 68) + jSONObject.getString(A014));
            }
        } catch (JSONException e10) {
            c7j.A07().AA0(A01(238, 3, 5), C8E.A0P, new C8F(e10));
            throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, A01(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 18, 88), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{34, 9, 4, 64, Field.FILESIZE, 4, 64, 6, 15, 18, 64, Field.MACROBUTTON, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, Field.FILESIZE, 19, 64, 2, 5, 9, 14, 7, 64, 21, 19, 5, 4, 64, 15, 14, 64, Field.MACROBUTTON, 36, 43, 64, 22, 5, 18, 19, 9, 15, 14, 64, Field.FILESIZE, 19, Field.FORMDROPDOWN, 120, 117, Field.EQ, Field.AUTONUMOUT, 117, Field.EQ, 119, 126, 99, Field.EQ, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, Field.EQ, Field.AUTONUMOUT, 98, Field.EQ, 115, 116, 120, Byte.MAX_VALUE, 118, Field.EQ, 100, 98, 116, 117, Field.EQ, 126, Byte.MAX_VALUE, Field.EQ, 97, 125, 112, 114, 116, 124, 116, Byte.MAX_VALUE, 101, Field.EQ, Field.AUTONUMOUT, 98, Field.INCLUDETEXT, 111, 98, Field.ASK, Field.QUOTE, 98, Field.ASK, 96, 105, 116, Field.ASK, 114, 99, 107, 118, 106, 103, 114, 99, Field.ASK, Field.QUOTE, 117, Field.ASK, 100, 99, 111, 104, 97, Field.ASK, 115, 117, 99, 98, Field.ASK, 105, 104, Field.ASK, 114, 99, 107, 118, 106, 103, 114, 99, Field.ASK, Field.QUOTE, 117, 11, 44, Field.AUTONUMOUT, Field.QUOTE, Field.DDEAUTO, 43, Field.ASK, 98, 0, 43, Field.ASK, 18, Field.QUOTE, 59, Field.DDEAUTO, Field.DDE, Field.QUOTE, Field.ASK, Field.FORMCHECKBOX, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, Field.MACROBUTTON, Field.AUTONUM, 96, Field.MACROBUTTON, 122, 96, Field.MACROBUTTON, 125, 124, 103, Field.MACROBUTTON, 101, 114, Byte.MAX_VALUE, 122, 119, Field.MACROBUTTON, 113, 114, 125, 125, 118, 97, Field.MACROBUTTON, 103, 118, 126, 99, Byte.MAX_VALUE, 114, 103, 118, 11, 48, Field.DDE, 43, Field.DDEAUTO, Field.DDEAUTO, Field.EQ, 44, 42, 59, 58, 126, Field.NUMCHARS, Field.IMPORT, 58, 14, Field.BARCODE, Field.FILLIN, Field.GOTOBUTTON, Field.EQ, Field.BARCODE, 58, 126, 42, Field.FILLIN, Field.DDEAUTO, 59, 126, 126, 111, 118, 7, 12, 1, 58, 12, 1, 21, 30, 19, Field.DATA, 3, 30, 26, 18, Field.DATA, 3, 24, Field.NUMCHARS, 18, 25, Field.ASK, Field.FILLIN, Field.AUTONUMOUT, 43, 33, Field.FILLIN, 29, 43, Field.ASK, Field.MACROBUTTON, 36, Field.GOTOBUTTON, Field.DDEAUTO, Field.DDE, Field.IMPORT, 36, Field.PAGEREF, 30, Field.EQ, Field.DDE, 32, 34, 36, 44, 36, Field.GLOSSARY, Field.AUTONUMLGL, 30, Field.DATA, Field.PAGEREF, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.MERGESEQ, Byte.MAX_VALUE, 86, Field.FILESIZE, 82, Field.FORMDROPDOWN, Field.TOA, Field.AUTOTEXT, 78, Field.MERGESEQ, Field.LISTNUM, 82, Field.AUTOTEXT, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.MERGESEQ, Field.LISTNUM, Field.NOTEREF, Field.FILESIZE, 76, Field.AUTOTEXTLIST};
    }

    static {
        A02();
    }

    public C0903Jq() {
        this.A00 = EnumC0902Jp.A04;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    public static EnumC0898Jl A00(String str) throws C0895Jh {
        try {
            return EnumC0898Jl.A00(new JSONObject(str).getInt(A01(302, 8, 37)));
        } catch (JSONException e10) {
            throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, A01(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 18, 88), e10);
        }
    }

    public static void A03(EnumC0898Jl enumC0898Jl) throws C0895Jh {
        if (!EnumC0898Jl.A0G.equals(enumC0898Jl) && !EnumC0898Jl.A0E.equals(enumC0898Jl) && !EnumC0898Jl.A0F.equals(enumC0898Jl)) {
            boolean equals = EnumC0898Jl.A0D.equals(enumC0898Jl);
            if (A05[1].charAt(20) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "X5uVqi4FyBeSosvF2q5aVclYJStrMHB5";
            strArr[2] = "BOgVvqLcU58P5XEa1Smg5LyKHeBKxxT8";
            if (equals) {
                return;
            }
            throw new C0895Jh(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, A01(ShapeTypes.ACTION_BUTTON_DOCUMENT, 40, 9), Integer.valueOf(enumC0898Jl.A04())));
        }
    }

    public final String A04() {
        if (this.A01 == null) {
            return null;
        }
        Long l10 = this.A01;
        if (A05[4].length() != 4) {
            A05[7] = "9BRFtSg6abebTfCvkl6x8CVGG9ZYJ4hw";
            return l10.toString();
        }
        throw new RuntimeException();
    }

    public final String A05() {
        return this.A02;
    }

    public final boolean A06() {
        return this.A00 != EnumC0902Jp.A04;
    }
}
