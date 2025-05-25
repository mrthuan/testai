package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class WS implements InterfaceC1109Rr {
    public static byte[] A01;
    public static String[] A02 = {"tUJYxHq8rXjSvzNkaZErPg", "Hl6JSJOVoKK9bKT5jd2Pvq0tZsDPJ0dE", "oSGC6AFXBpr4lbJyv6MQNQ9waO2ute48", "z7WBfzJJ407mMZZPgmkMQfCriHOQCxec", "E0947yqUj", "IMqeF", "h4IMHr5Sq", "nmzUvfQCAff3ThOCongsk2"};
    public final /* synthetic */ C7j A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-104, -74, -61, 124, -55, 117, -71, -66, -56, -59, -74, -55, -72, -67, 117, -72, -60, -54, -61, -55, -70, -57, -56, -125, 4, 41, Field.MACROBUTTON, 48, 33, Field.AUTONUMOUT, Field.QUOTE, Field.DATA, Field.PAGEREF, 36, -32, Field.QUOTE, Field.GLOSSARY, Field.AUTONUMLGL, Field.DDEAUTO, Field.AUTONUMOUT, Field.PAGEREF, Field.GOTOBUTTON, Field.MACROBUTTON, -18, -32, 18, Field.PAGEREF, Field.MACROBUTTON, 48, Field.GLOSSARY, Field.DDEAUTO, Field.MACROBUTTON, Field.PAGEREF, -6, -32};
    }

    static {
        A01();
    }

    public WS(C7j c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABa(InterfaceC1107Rp interfaceC1107Rp) {
        if (this.A00.A04().A9O() && interfaceC1107Rp != null) {
            String str = A00(24, 31, 122) + interfaceC1107Rp.A6X();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1109Rr
    public final void ABt(Exception exc) {
        String str;
        if (this.A00.A04().A9O()) {
            str = JI.A01;
            String A00 = A00(0, 24, 15);
            String[] strArr = A02;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "IahxZOLaTB1sAAwpoanyBYHnO0M02siA";
            strArr2[3] = "J682L6mt58ljZzHK0luG4OOmc7ySlZqX";
            Log.e(str, A00, exc);
        }
    }
}
