package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Wg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1227Wg implements SH {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C1313Zr A00;
    public final /* synthetic */ SF A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, Field.BIDIOUTLINE, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1227Wg(SF sf2, C1313Zr c1313Zr) {
        this.A01 = sf2;
        this.A00 = c1313Zr;
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final void A4R() {
        try {
            C0877Im.A0T(this.A00).A2u(this.A01.A75().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e10) {
            this.A00.A07().A3y(e10);
        }
    }
}
