package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class ZC implements AH {
    public static byte[] A04;
    public static String[] A05 = {"dOZBGOfLcl", "6uZ5xK6", "", "aWXZitIb3s7c1Spgern6jNUgdVKtVpLL", "irucub8L3DoxCd6BUALfs2", "TD", "6AS6vcfZrF", "uC"};
    public final int A00;
    public final long A01;
    public final Context A02;
    public final InterfaceC0707Bh<FrameworkMediaCrypto> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{59, 26, 25, 30, 10, 19, 11, Field.DDE, 26, 17, Field.NUMWORDS, 26, 13, 26, 13, 12, Field.SYMBOL, 30, Field.NUMCHARS, 11, 16, 13, 6, 44, Field.NUMWORDS, Field.NUMWORDS, 6, Field.NUMWORDS, Field.TOA, 0, 7, 26, 29, 8, 7, 29, 0, 8, 29, 0, 7, 14, Field.TOA, Field.GLOSSARY, Field.GLOSSARY, 4, 25, 12, 14, Field.TOA, 12, 17, 29, 12, 7, 26, 0, 6, 7, 103, 80, 80, 77, 80, 2, Field.MERGESEQ, 76, Field.ADDIN, 86, Field.INCLUDEPICTURE, 76, 86, Field.MERGESEQ, Field.INCLUDEPICTURE, 86, Field.MERGESEQ, 76, Field.FILESIZE, 2, 100, 110, 99, 97, 2, Field.FORMCHECKBOX, Field.LISTNUM, 86, Field.FORMCHECKBOX, 76, Field.ADDIN, Field.MERGESEQ, 77, 76, Field.DDEAUTO, 25, 25, 4, 25, Field.MERGESEQ, 2, 5, 24, 31, 10, 5, 31, 2, 10, 31, 2, 5, 12, Field.MERGESEQ, 36, Field.NUMWORDS, 30, 24, Field.MERGESEQ, 14, 19, 31, 14, 5, 24, 2, 4, 5, Field.MACROBUTTON, 4, 4, 25, 4, 86, 31, 24, 5, 2, 23, 24, 2, 31, 23, 2, 31, 24, 17, 86, 32, Field.ASK, Field.AUTOTEXT, 86, 19, 14, 2, 19, 24, 5, 31, 25, 24, 77, 110, 96, 101, 100, 101, 33, Field.FORMCHECKBOX, 103, 108, 113, 100, 102, 64, 116, 101, 104, 110, Field.FORMDROPDOWN, 100, 111, 101, 100, 115, 100, 115, Field.GLOSSARY, Field.NUMWORDS, 56, Field.AUTONUM, Field.MACROBUTTON, Field.GOTOBUTTON, Field.MACROBUTTON, 119, Field.NUMWORDS, Field.USERADDRESS, Field.AUTONUMLGL, Field.EQ, 59, Field.AUTONUM, Field.AUTONUMOUT, 22, 34, Field.MACROBUTTON, Field.USERADDRESS, 56, 5, Field.GOTOBUTTON, Field.SYMBOL, Field.MACROBUTTON, Field.GOTOBUTTON, Field.PAGEREF, Field.GOTOBUTTON, Field.PAGEREF, 121, 41, 10, 4, 1, 0, 1, Field.FILESIZE, 41, 12, 7, 10, 21, 16, 22, 36, 16, 1, 12, 10, Field.IMPORT, 0, 11, 1, 0, 23, 0, 23, Field.MERGESEQ, Field.DOCPROPERTY, 118, 120, 125, 124, 125, Field.SYMBOL, Field.DOCPROPERTY, 112, 123, 111, 105, 97, Field.AUTOTEXT, 112, 125, 124, 118, Field.MERGESEQ, 124, 119, 125, 124, 107, 124, 107, Field.IMPORT, Field.USERADDRESS, Field.GOTOBUTTON, 48, 115, 59, 60, Field.USERADDRESS, 56, Field.BARCODE, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.AUTONUM, 115, 60, Field.SYMBOL, Field.DDEAUTO, 115, Field.AUTONUMOUT, Field.MACROBUTTON, 41, 56, Field.GLOSSARY, Field.MACROBUTTON, 60, Field.EQ, 115, 56, Field.PAGEREF, Field.GOTOBUTTON, Field.DDE, Field.EQ, 60, 36, 56, Field.GLOSSARY, 111, 115, 56, Field.PAGEREF, 41, 115, 59, 59, 48, Field.DDE, 56, 58, 115, Field.NUMWORDS, 59, 48, Field.DDE, 56, 58, Field.NUMCHARS, Field.DATA, Field.SYMBOL, Field.AUTONUMOUT, Field.GOTOBUTTON, 15, 56, Field.MACROBUTTON, Field.SYMBOL, 56, Field.GLOSSARY, 56, Field.GLOSSARY, Field.GREETINGLINE, 82, 80, 19, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.HYPERLINK, Field.SHAPE, 82, 82, 86, 19, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, 78, 19, Field.ADVANCE, Field.FORMDROPDOWN, Field.TOA, Field.HYPERLINK, Field.AUTOTEXT, Field.FORMDROPDOWN, Field.BIDIOUTLINE, Field.ADDIN, 19, Field.HYPERLINK, Field.FILESIZE, 82, 77, Field.ADDIN, Field.BIDIOUTLINE, Field.INCLUDETEXT, Field.HYPERLINK, Field.AUTOTEXT, 15, 19, Field.HYPERLINK, Field.FILESIZE, Field.TOA, 19, Field.HTMLCONTROL, Field.ADDIN, Field.BIDIOUTLINE, Field.GREETINGLINE, 19, 113, Field.ADVANCE, Field.SHAPE, Field.HTMLCONTROL, Field.ADDIN, Field.BIDIOUTLINE, Field.GREETINGLINE, 124, Field.NOTEREF, Field.AUTOTEXTLIST, Field.ADVANCE, 82, 111, Field.HYPERLINK, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.AUTOTEXT, Field.HYPERLINK, Field.AUTOTEXT, 96, 108, 110, Field.DDE, 101, 98, 96, 102, 97, 108, 108, 104, Field.DDE, 98, 103, 112, Field.DDE, 106, 109, 119, 102, 113, 109, 98, 111, Field.DDE, 102, 123, 108, 115, 111, 98, 122, 102, 113, Field.EQ, Field.DDE, 102, 123, 119, Field.DDE, 108, 115, 118, 112, Field.DDE, Field.AUTOTEXT, 106, 97, 108, 115, 118, 112, Field.SECTIONPAGES, 118, 103, 106, 108, Field.ADDIN, 102, 109, 103, 102, 113, 102, 113, 21, 25, Field.NUMWORDS, Field.HYPERLINK, 16, 23, 21, 19, 20, 25, 25, 29, Field.HYPERLINK, 23, 18, 5, Field.HYPERLINK, 31, 24, 2, 19, 4, 24, 23, 26, Field.HYPERLINK, 19, 14, 25, 6, 26, 23, 15, 19, 4, Field.INCLUDETEXT, Field.HYPERLINK, 19, 14, 2, Field.HYPERLINK, 0, 6, Field.AUTOTEXT, Field.HYPERLINK, 58, 31, 20, 0, 6, 14, 32, 31, 18, 19, 25, 36, 19, 24, 18, 19, 4, 19, 4};
    }

    static {
        A01();
    }

    public ZC(Context context) {
        this(context, 0);
    }

    public ZC(Context context, int i10) {
        this(context, null, i10, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public ZC(Context context, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, int i10, long j10) {
        this.A02 = context;
        this.A00 = i10;
        this.A01 = j10;
        this.A03 = interfaceC0707Bh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, long j10, Handler handler, InterfaceC0873Ii interfaceC0873Ii, int extensionRendererIndex, ArrayList<ZA> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C3F(context, DR.A00, j10, interfaceC0707Bh, false, handler, interfaceC0873Ii, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int extensionRendererIndex2 = arrayList.size();
        if (extensionRendererIndex == 2) {
            extensionRendererIndex2--;
            if (A05[3].charAt(6) != 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "tL";
            strArr[7] = "Fr";
        }
        try {
            try {
                cls = Class.forName(A00(469, 64, 50));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (Exception e10) {
                e = e10;
            }
            try {
                arrayList.add(extensionRendererIndex2, (ZA) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC0873Ii.class, clazz3).newInstance(true, Long.valueOf(j10), handler, interfaceC0873Ii, 50));
                Log.i(A00(0, 23, 59), A00(243, 27, 93));
            } catch (Exception e11) {
                e = e11;
                throw new RuntimeException(A00(ShapeTypes.VERTICAL_SCROLL, 33, 50), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)|8|(2:9|10)|(2:11|12)|14|15|17|18|(3:19|20|(3:21|22|23))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(1:7)|8|9|10|(2:11|12)|14|15|17|18|(3:19|20|(3:21|22|23))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        throw new java.lang.RuntimeException(A00(59, 34, 102), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        r6 = r7;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(android.content.Context r15, com.facebook.ads.redexgen.X.InterfaceC0707Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r16, com.facebook.ads.redexgen.X.InterfaceC0682Ag[] r17, android.os.Handler r18, com.facebook.ads.redexgen.X.InterfaceC0690Ao r19, int r20, java.util.ArrayList<com.facebook.ads.redexgen.X.ZA> r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZC.A03(android.content.Context, com.facebook.ads.redexgen.X.Bh, com.facebook.ads.redexgen.X.Ag[], android.os.Handler, com.facebook.ads.redexgen.X.Ao, int, java.util.ArrayList):void");
    }

    private final void A04(Context context, InterfaceC0755De interfaceC0755De, Looper looper, int i10, ArrayList<ZA> arrayList) {
        arrayList.add(new C6Z(interfaceC0755De, looper));
    }

    private final void A05(Context context, InterfaceC0811Fw interfaceC0811Fw, Looper looper, int i10, ArrayList<ZA> arrayList) {
        arrayList.add(new AnonymousClass66(interfaceC0811Fw, looper));
    }

    private final InterfaceC0682Ag[] A06() {
        return new InterfaceC0682Ag[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.AH
    public final ZA[] A57(Handler handler, InterfaceC0873Ii interfaceC0873Ii, InterfaceC0690Ao interfaceC0690Ao, InterfaceC0811Fw interfaceC0811Fw, InterfaceC0755De interfaceC0755De, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh) {
        InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh2 = interfaceC0707Bh;
        if (interfaceC0707Bh2 == null) {
            interfaceC0707Bh2 = null;
        }
        ArrayList<ZA> arrayList = new ArrayList<>();
        A02(this.A02, interfaceC0707Bh2, this.A01, handler, interfaceC0873Ii, this.A00, arrayList);
        A03(this.A02, interfaceC0707Bh2, A06(), handler, interfaceC0690Ao, this.A00, arrayList);
        A05(this.A02, interfaceC0811Fw, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, interfaceC0755De, handler.getLooper(), this.A00, arrayList);
        return (ZA[]) arrayList.toArray(new ZA[arrayList.size()]);
    }
}
