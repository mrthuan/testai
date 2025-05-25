package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0758Dh;
import com.facebook.ads.redexgen.X.IK;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ApicFrame extends Id3Frame {
    public static byte[] A04;
    public static String[] A05 = {"5zdrCQzyw7LGBZt2bR", "94h2cHlKu82ON", "UXCdbWakT4UeSWJHYp", "NJCEY3SlLFTG8A3lFBxha6EQ", "5QLBb0RtzLfAnzhUIvcqgNwpwZswqR66", "VBKPr5MCHLkK2A2pExgA1taPOMPGOmlK", "xRDeMM69RKfxJaGWHgM2IgB3dj0CBATA", "r5Ph5bZgG7AgDyEHuQeiaTUpJXkd"};
    public static final Parcelable.Creator<ApicFrame> CREATOR;
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A05[5] = "2QrrQ2NqaqUssUV0sturxMM6I2C1oI6u";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
            i13++;
        }
    }

    public static void A01() {
        A04 = new byte[]{Field.INCLUDETEXT, Field.NOTEREF, 12, 13, Field.NUMWORDS, 11, 26, 1, 24, Field.NUMCHARS, 1, 7, 6, Field.DOCPROPERTY, 106, 112, 61, Field.SYMBOL, 61, Field.AUTONUMLGL, 4, 41, 32, Field.AUTONUMLGL, 109, 13, Field.NUMCHARS, 5, 15};
    }

    static {
        A01();
        CREATOR = new C0758Dh();
    }

    public ApicFrame(Parcel parcel) {
        super(A00(25, 4, 124));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super(A00(25, 4, 124));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i10;
        this.A03 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.A00 == apicFrame.A00 && IK.A0g(this.A02, apicFrame.A02) && IK.A0g(this.A01, apicFrame.A01) && Arrays.equals(this.A03, apicFrame.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int result2 = ((17 * 31) + result) * 31;
        int result3 = this.A02 != null ? this.A02.hashCode() : 0;
        return ((((result2 + result3) * 31) + (this.A01 != null ? this.A01.hashCode() : 0)) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 96) + this.A02 + A00(0, 14, 88) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
