// Auto-fixed: added missing class declaration
public class EnumC1522dN {
package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import kotlin.Metadata;
import lib.zj.office.fc.hwpf.usermodel.Field;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1522dN {
    A05,
    A03,
    A04;
    
    public static byte[] A00;
    public static final /* synthetic */ InterfaceC0843He A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{126, 105, 105, 116, 105, 78, Field.AUTOTEXT, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.NOTEREF, 100, 114, 97, 125, 122, 125, 116};
    }

    static {
        A01();
        A01 = AbstractC1515dB.A01(A02);
    }
}

}
