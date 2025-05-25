package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Wd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1224Wd implements JJ {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public View$OnAttachStateChangeListenerC1225We A00;
    public Cdo<C0882It, C0887Iy> A01;
    public final C1313Zr A02;
    public final C0881Is A03 = C0881Is.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 121);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{Field.AUTOTEXT, 115, 126, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, Field.AUTONUMLGL, 121, Field.SECTIONPAGES, Field.GREETINGLINE, Field.TOA, Field.MERGESEQ, Field.FILESIZE, Field.SHAPE, Field.HYPERLINK, Field.TOA, Field.GREETINGLINE, Field.FILESIZE, Field.SECTIONPAGES, Field.MERGESEQ, 12, 77, 12, Field.SECTIONPAGES, Field.AUTOTEXTLIST, 64, 64, 12, Field.AUTOTEXT, Field.GREETINGLINE, Field.TOA, 77, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, Field.TOA, 12, Field.LISTNUM, Field.FILESIZE, Field.TOA, Field.HTMLCONTROL, 13, Field.FORMDROPDOWN, 108, 96, 114, 117, 106, 108, 107, 113, Field.SECTION, 100, 113, 100, Field.PAGEREF, 108, 118, Field.PAGEREF, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, Field.AUTONUMLGL, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = C1224Wd.class.getSimpleName();
    }

    public C1224Wd(C1313Zr c1313Zr) {
        this.A02 = c1313Zr;
    }

    private void A01() {
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(67, 22, 124)));
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void ABh() {
        if (this.A01 != null) {
            this.A01.A04.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AE9() {
        if (this.A01 != null) {
            this.A01.A04.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AHC(View view) {
        if (this.A01 == null) {
            this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AHO(View view, String str, boolean z10) {
        AHP(view, str, z10, false);
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AHP(View view, String str, boolean z10, boolean z11) {
        AHQ(view, str, z10, z11, false);
    }

    @Override // com.facebook.ads.redexgen.X.JJ
    public final void AHQ(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            this.A00 = new View$OnAttachStateChangeListenerC1225We(view);
            this.A03.A0A(this.A00, view);
            if (z11) {
                this.A00.A03();
            }
            this.A01 = Cdo.A00(new C0882It(this.A02, view, str, z10, z12), new C0887Iy(), A06).A05(new C1226Wf(new C1223Wc())).A06();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A07().AA0(A00(89, 14, 19), 3600, new C8F(A00(0, 32, 98)));
    }
}
