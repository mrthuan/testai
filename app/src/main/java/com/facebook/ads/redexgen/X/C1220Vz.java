package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Vz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1220Vz extends KY {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ K6 A00;
    public final /* synthetic */ K9 A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, 18, Field.MACROBUTTON, 124, Field.GOTOBUTTON, Field.SYMBOL, Field.DATA, 43, Field.MACROBUTTON, Field.DDEAUTO, Field.IMPORT, 124, Field.BARCODE, Field.MACROBUTTON, Field.GOTOBUTTON, Field.GOTOBUTTON, Field.SYMBOL, Field.BARCODE, Field.DATA, Field.AUTONUMLGL, Field.MACROBUTTON, Field.GOTOBUTTON};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1314Zs c1314Zs;
        C1314Zs c1314Zs2;
        C1314Zs c1314Zs3;
        C1314Zs c1314Zs4;
        C1314Zs c1314Zs5;
        long j10;
        C1314Zs c1314Zs6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC1109Rr A022;
        C1314Zs c1314Zs7;
        C1314Zs c1314Zs8;
        C1314Zs c1314Zs9;
        C1314Zs c1314Zs10;
        long j11;
        c1314Zs = this.A01.A04;
        if (AbstractC0954Ls.A00(c1314Zs) == EnumC0953Lr.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c1314Zs10 = this.A01.A04;
            C0S A0E = c1314Zs10.A0E();
            j11 = this.A01.A00;
            A0E.A3H(C0956Lu.A01(j11), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C0894Jg(adErrorType, A00));
            return;
        }
        c1314Zs2 = this.A01.A04;
        C8N.A08(c1314Zs2);
        c1314Zs3 = this.A01.A04;
        C6H.A07(c1314Zs3);
        C06418q A002 = C06418q.A00();
        c1314Zs4 = this.A01.A04;
        boolean z10 = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c1314Zs4, true).A7K(this.A00.A05()));
        this.A01.A02 = A0A;
        try {
            c1314Zs7 = this.A01.A04;
            PackageManager packageManager = c1314Zs7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb2 = new StringBuilder();
                c1314Zs8 = this.A01.A04;
                StringBuilder append = sb2.append(c1314Zs8.getPackageName()).append(A00(0, 1, 59));
                c1314Zs9 = this.A01.A04;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1314Zs9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC0898Jl.A04 && this.A00.A07() != EnumC0898Jl.A06 && this.A00.A07() != EnumC0898Jl.A05 && this.A00.A07() != null) {
                z10 = false;
            }
            c1314Zs6 = this.A01.A04;
            InterfaceC1108Rq A023 = S8.A02(z10, c1314Zs6);
            str = this.A01.A06;
            S4 s4 = new S4();
            map = this.A01.A02;
            byte[] A08 = s4.A05(map).A08();
            A022 = this.A01.A02(C0956Lu.A00(), this.A00);
            A023.AET(str, A08, A022);
        } catch (Exception e10) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e10.getMessage();
            c1314Zs5 = this.A01.A04;
            C0S A0E2 = c1314Zs5.A0E();
            j10 = this.A01.A00;
            A0E2.A3H(C0956Lu.A01(j10), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            K9 k92 = this.A01;
            C0894Jg A01 = C0894Jg.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            k92.A0D(A01);
        }
    }

    static {
        A02();
    }

    public C1220Vz(K9 k92, K6 k62) {
        this.A01 = k92;
        this.A00 = k62;
    }
}
