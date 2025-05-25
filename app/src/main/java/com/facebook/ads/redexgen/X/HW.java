package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class HW {
    public static byte[] A05;
    public static String[] A06 = {"2revu11PJC5JJW9Wa0yU7IMUA1J5NejP", "fJ5JOQQqtdBcbj27U0gmUjzU2HCLlz0g", "ET0kkCf4ARvl2PzoyLeVITbW2fplMVfR", "GxObTRUuHNyvHf6tkdVAqKD8xwa6jlLn", "B7q0fr4uC5I7vD4MQhzL4Z47zRUcP8kJ", "568trPd6mwfCGSMgqCQm2IVOVBWhAbWi", "EbkNl16qbhIMOqvfmLsDQ8wggfaUXum1", "SV9S1jJDj189NNWmtagkrr9CNMxjn3Dk"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1233Wm A00 = C1233Wm.A04;
    public final TreeSet<C1231Wk> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[3].charAt(30) == 'V') {
                throw new RuntimeException();
            }
            A06[6] = "S0u5zKZmiQfdscAZx2bCvjbBnL2oTB1W";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 28);
            i13++;
        }
    }

    public static void A02() {
        A05 = new byte[]{120, Field.USERADDRESS, Field.SYMBOL, Field.EQ, Field.AUTONUMOUT, 61, 60, 118, 117, 33, 58, 117, 64, 119, 124, 115, Byte.MAX_VALUE, 123, 124, 117, Field.GOTOBUTTON, 125, 116, Field.GOTOBUTTON};
    }

    static {
        A02();
    }

    public HW(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static HW A00(int i10, DataInputStream dataInputStream) throws IOException {
        HW hw = new HW(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long readLong = dataInputStream.readLong();
            C0840Hb c0840Hb = new C0840Hb();
            AbstractC0839Ha.A05(c0840Hb, readLong);
            hw.A0F(c0840Hb);
        } else {
            hw.A00 = C1233Wm.A00(dataInputStream);
        }
        return hw;
    }

    public final int A03(int i10) {
        int result = this.A02;
        int i11 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long A00 = AbstractC0839Ha.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j10, long j11) {
        C1231Wk A062 = A06(j10);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j11);
        }
        long j12 = j10 + j11;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j12) {
            for (C1231Wk c1231Wk : this.A04.tailSet(A062, false)) {
                String[] strArr = A06;
                if (strArr[2].charAt(8) == strArr[1].charAt(8)) {
                    throw new RuntimeException();
                }
                A06[7] = "b0ZaIIxnoqImZ25xzDHzhq2wNwo0sHmR";
                long currentEndPosition = c1231Wk.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = c1231Wk.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + c1231Wk.A01);
                if (queryEndPosition >= j12) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j10, j11);
    }

    public final C1233Wm A05() {
        return this.A00;
    }

    public final C1231Wk A06(long j10) {
        C1231Wk A01 = C1231Wk.A01(this.A03, j10);
        C1231Wk floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j10) {
            return floor;
        }
        C1231Wk lookupSpan = this.A04.ceiling(A01);
        if (lookupSpan == null) {
            return C1231Wk.A02(this.A03, j10);
        }
        return C1231Wk.A03(this.A03, j10, lookupSpan.A02 - j10);
    }

    public final C1231Wk A07(C1231Wk c1231Wk) throws HN {
        AbstractC0844Hf.A04(this.A04.remove(c1231Wk));
        C1231Wk A08 = c1231Wk.A08(this.A02);
        if (c1231Wk.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new HN(A01(12, 12, 14) + c1231Wk.A03 + A01(8, 4, 73) + A08.A03 + A01(0, 8, 68));
    }

    public final TreeSet<C1231Wk> A08() {
        return this.A04;
    }

    public final void A09(C1231Wk c1231Wk) {
        this.A04.add(c1231Wk);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HT ht) {
        if (this.A04.remove(ht)) {
            ht.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(C0840Hb c0840Hb) {
        C1233Wm c1233Wm = this.A00;
        C1233Wm oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(c0840Hb);
        C1233Wm oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c1233Wm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HW hw = (HW) obj;
        if (this.A02 == hw.A02 && this.A03.equals(hw.A03)) {
            TreeSet<C1231Wk> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].charAt(21) != strArr[0].charAt(21)) {
                throw new RuntimeException();
            }
            A06[4] = "6WixUlfTKGOdvAUaxQ2Z5ifCzkckXFCZ";
            if (treeSet.equals(hw.A04) && this.A00.equals(hw.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int i10 = result * 31;
        int result2 = this.A04.hashCode();
        return i10 + result2;
    }
}
