package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.IK;
import com.facebook.ads.redexgen.X.IN;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ColorInfo implements Parcelable {
    public static byte[] A05;
    public static String[] A06 = {"kMwNdleMqzWVqcPvmmjgXOFb90HoR2aS", "JmhbiM", "HIloWDXljlsFtacoHr", "9trVsJZvswrK1Gdw5mQHa3", "KN84cRC", "hFGS8z", "RvezLLiD01uKKJ1jtQX7xEHNj6PkbMyI", "5wEn9ORXAeEptnWlekp2nQL4nWa"};
    public static final Parcelable.Creator<ColorInfo> CREATOR;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Field.AUTOTEXTLIST, 74, Field.USERADDRESS, -57, -13, -16, -13, -10, -51, -14, -22, -13, -84};
        if (A06[6].charAt(8) == 'i') {
            throw new RuntimeException();
        }
        A06[0] = "ZHrEhLiw2K0hjAL5R5GZQHqjxH9E80nU";
    }

    static {
        A01();
        CREATOR = new IN();
    }

    public ColorInfo(int i10, int i11, int i12, byte[] bArr) {
        this.A02 = i10;
        this.A01 = i11;
        this.A03 = i12;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = IK.A0f(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.A02 == colorInfo.A02) {
            int i10 = this.A01;
            int i11 = colorInfo.A01;
            if (A06[1].length() != 6) {
                throw new RuntimeException();
            }
            A06[1] = "x9YRcJ";
            if (i10 == i11 && this.A03 == colorInfo.A03 && Arrays.equals(this.A04, colorInfo.A04)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = this.A03;
            this.A00 = (((((((17 * 31) + result) * 31) + this.A01) * 31) + result2) * 31) + Arrays.hashCode(this.A04);
        }
        int result3 = this.A00;
        return result3;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(3, 10, 125)).append(this.A02);
        String A00 = A00(1, 2, 23);
        return append.append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A04 != null).append(A00(0, 1, 41)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        IK.A0V(parcel, this.A04 != null);
        if (this.A04 != null) {
            parcel.writeByteArray(this.A04);
        }
    }
}
