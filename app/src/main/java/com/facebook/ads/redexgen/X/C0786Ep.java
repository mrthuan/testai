package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ep  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0786Ep {
    public static byte[] A03;
    public InterfaceC0723Bx A00;
    public final InterfaceC0725Bz A01;
    public final InterfaceC0723Bx[] A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.INCLUDEPICTURE, 74, 9, 5, 31, 6, 14, 74, 24, 15, 11, 14, 74, 30, 2, 15, 74, 25, 30, 24, 15, 11, 7, Field.INCLUDETEXT, 12, Field.DDE, 44, Field.FILLIN, 98, Field.DDE, 36, 98, Field.AUTONUM, 42, Field.FILLIN, 98, Field.QUOTE, Field.AUTONUMOUT, Field.QUOTE, 43, Field.DDEAUTO, Field.QUOTE, 32, Field.DDEAUTO, Field.FILLIN, 98, Field.FILLIN, 58, Field.AUTONUM, 48, Field.QUOTE, 33, Field.AUTONUM, Field.DDE, 48, Field.EQ, 98, 106};
    }

    public C0786Ep(InterfaceC0723Bx[] interfaceC0723BxArr, InterfaceC0725Bz interfaceC0725Bz) {
        this.A02 = interfaceC0723BxArr;
        this.A01 = interfaceC0725Bz;
    }

    public final InterfaceC0723Bx A02(InterfaceC0724By interfaceC0724By, Uri uri) throws IOException, InterruptedException {
        if (this.A00 != null) {
            return this.A00;
        }
        InterfaceC0723Bx[] interfaceC0723BxArr = this.A02;
        int length = interfaceC0723BxArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            InterfaceC0723Bx interfaceC0723Bx = interfaceC0723BxArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                interfaceC0724By.AFq();
                throw th2;
            }
            if (interfaceC0723Bx.AGs(interfaceC0724By)) {
                this.A00 = interfaceC0723Bx;
                interfaceC0724By.AFq();
                break;
            }
            continue;
            interfaceC0724By.AFq();
            i10++;
        }
        if (this.A00 != null) {
            this.A00.A9D(this.A01);
            return this.A00;
        }
        throw new XR(A00(24, 34, 107) + IK.A0S(this.A02) + A00(0, 24, 67), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
