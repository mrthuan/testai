package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class GO extends AbstractC1188Us {
    public static byte[] A02;
    public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};
    public final /* synthetic */ GL A00;
    public final /* synthetic */ C1466cN A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Field.INCLUDEPICTURE, 116, 116, 105, 116, Field.ASK, 99, 126, 99, 101, 115, 114, 111, 104, 97, Field.ASK, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, Field.SECTIONPAGES, 77, Field.NOTEREF, 80, Field.SECTION, 86, Field.SECTION, 64, 123, Field.FORMCHECKBOX, Field.NOTEREF, 77, Field.FORMCHECKBOX, Field.AUTOTEXT, 123, 64, Field.SECTION, Field.NOTEREF, Field.FILESIZE, Field.ADDRESSBLOCK, 123, Field.TOA, Field.CONTROL, 2, 24, Field.AUTONUMOUT, 8, 25, 14, 10, 31, 2, 29, 14, Field.AUTONUMOUT, 10, 24, Field.AUTONUMOUT, 8, 31, 10, Field.AUTONUMOUT, 29, Field.AUTOTEXTLIST, 102, 125, 122, 98, 102, 118, Field.LISTNUM, 119};
    }

    static {
        A01();
    }

    public GO(GL gl2, C1466cN c1466cN) {
        this.A00 = gl2;
        this.A01 = c1466cN;
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void ABD() {
        boolean z10;
        this.A00.A0G = true;
        z10 = this.A00.A0H;
        if (z10) {
            this.A00.A0A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractC1188Us, com.facebook.ads.redexgen.X.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ABV(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GO.ABV(java.lang.String, java.util.Map):void");
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void ACA() {
        C0783Ei c0783Ei;
        C1464cL c1464cL;
        C1464cL c1464cL2;
        C1464cL c1464cL3;
        c0783Ei = this.A00.A04;
        InterfaceC1498ct A0E = c0783Ei.A0E();
        c1464cL = this.A00.A02;
        A0E.A46(c1464cL != null);
        c1464cL2 = this.A00.A02;
        if (c1464cL2 != null) {
            c1464cL3 = this.A00.A02;
            c1464cL3.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1188Us, com.facebook.ads.redexgen.X.O1
    public final void ACx() {
        C0783Ei c0783Ei;
        C1464cL c1464cL;
        c0783Ei = this.A00.A04;
        c0783Ei.A0E().A48();
        c1464cL = this.A00.A02;
        c1464cL.A07();
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void AEC() {
    }
}
