package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.cm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1491cm extends AbstractC04390h {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public final boolean A00;
    public final C04450o A01;
    public final boolean A02;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        byte[] bArr = {60, 19, 22, Field.NUMCHARS, 20, Field.SHAPE, 19, 16, 24, 24, 26, Field.NUMWORDS, 24, 23, 29, 11, 22, 16, 29, Field.CONTROL, 16, 23, 13, Field.NUMCHARS, 23, 13, Field.CONTROL, 24, 26, 13, 16, 22, 23, Field.CONTROL, Field.GLOSSARY, 48, 60, Field.DDEAUTO, 17, 18, 16, 24, 44, 7, 26, 30, 22, Field.QUOTE, 42, Field.DDEAUTO, Field.SYMBOL, 42, 16, 59, Field.ASK, 34, 42, 34, 56, Field.SYMBOL, Field.DDEAUTO, 34, 32, Field.DATA, 41, Field.GLOSSARY, Field.SYMBOL, Field.SYMBOL, Field.BARCODE, 41, 41, Field.SECTION, Field.LISTNUM, Field.ADDRESSBLOCK, Field.SECTIONPAGES, Field.ADDIN, Field.FORMTEXT, Field.FORMCHECKBOX, Field.DOCPROPERTY, Field.HYPERLINK, 107, Field.HYPERLINK, Field.ADDRESSBLOCK, Field.LISTNUM, Field.SHAPE, 20, 18, 4, 19, Field.USERADDRESS, 21, 19, 0, 2, 10, 4, 19, Field.USERADDRESS, 8, 18, Field.USERADDRESS, 15, 14, 21, Field.USERADDRESS, 15, 20, 13, 13, 5, 19, 6, 17, 26, Field.DDE, 19, Field.NUMCHARS, 22, Field.DDE, 16, 0, 29, 5, 1, 23};
        if (A07[1].length() != 9) {
            throw new RuntimeException();
        }
        A07[7] = "E0qxoPtldo8saq";
        A06 = bArr;
    }

    public abstract EnumC04380g A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 106);
        A04 = A0A(85, 24, 81);
        A05 = A0A(109, 16, 66);
    }

    public AbstractC1491cm(C1314Zs c1314Zs, J7 j72, String str, C04450o c04450o, boolean z10) {
        this(c1314Zs, j72, str, c04450o, z10, false);
    }

    public AbstractC1491cm(C1314Zs c1314Zs, J7 j72, String str, C04450o c04450o, boolean z10, boolean z11) {
        super(c1314Zs, j72, str);
        this.A01 = c04450o;
        this.A02 = z10;
        this.A00 = z11;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04390h
    public final EnumC04380g A0C() {
        if (this.A01 != null) {
            this.A01.A07(super.A02);
        }
        C1314Zs c1314Zs = super.A00;
        if (A07[7].length() != 14) {
            throw new RuntimeException();
        }
        A07[3] = "9d6GoSvBACG6VCN4qR5bPjffs9IY5LAp";
        if (OH.A03(c1314Zs)) {
            return EnumC04380g.A06;
        }
        return A0D();
    }

    public final void A0E(Map<String, String> extraData, EnumC04380g enumC04380g) {
        if (!TextUtils.isEmpty(super.A02)) {
            if (this instanceof C0819Gf) {
                super.A01.AAY(super.A02, extraData);
            } else {
                super.A01.AA9(super.A02, extraData);
            }
            boolean A02 = EnumC04380g.A02(enumC04380g);
            boolean z10 = this.A01 != null;
            boolean isError = C0877Im.A2J(super.A00);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !A02;
                navigationDataMap.put(A03, Boolean.toString(isError2));
                navigationDataMap.put(A04, Boolean.toString(z10));
                String str = A05;
                boolean isError3 = this.A00;
                navigationDataMap.put(str, Boolean.toString(isError3));
                super.A01.AAI(super.A02, navigationDataMap);
            }
            if (this.A01 != null) {
                this.A01.A06(enumC04380g);
                if (A02) {
                    this.A01.A05();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(47, 10, ShapeTypes.VERTICAL_SCROLL), Long.toString(-1L));
                hashMap.put(A0A(38, 9, 67), Long.toString(-1L));
                hashMap.put(A0A(57, 7, 125), EnumC04380g.A05.name());
                super.A01.AAZ(super.A02, hashMap);
            }
        }
        LC.A04(super.A00, A0A(0, 12, 79));
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 4));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 73), L5.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C0928Kq.A0C(super.A00, intent);
        } catch (C0926Ko unused) {
            return false;
        }
    }
}
