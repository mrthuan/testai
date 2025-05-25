package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BK extends AbstractC1121Sd {
    public static byte[] A01;
    public static String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};
    public final /* synthetic */ PT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(28) != '0') {
                throw new RuntimeException();
            }
            A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 111);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{59, 44, 64, Field.USERADDRESS, 48};
    }

    static {
        A01();
    }

    public BK(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    public final void A03(C9P c9p) {
        PS ps;
        JSONObject A03;
        ps = this.A00.A0B;
        A03 = this.A00.A03();
        ps.AE1(A00(0, 5, 92), A03);
    }
}
