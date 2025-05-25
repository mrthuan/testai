package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0763Dm;
import com.facebook.ads.redexgen.X.IK;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class GeobFrame extends Id3Frame {
    public static byte[] A04;
    public static String[] A05 = {"y6OzAPeSPf3ee7TzPORpB7Bf5APB3S1", "bT", "nmoLNEgpJzlygAWMz61JvwnNXURrvdZm", "gZwWTlO5ujx", "dfSXnSphWSbSkA9E1qvUuQDXnNV6bDm2", "4eRrIz7", "1K0raUp", "bvAgnfJmo0WzPc7U"};
    public static final Parcelable.Creator<GeobFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{36, Field.DATA, 108, 109, 123, 107, 122, 97, 120, 124, 97, 103, 102, Field.AUTONUMLGL, 16, Field.NUMCHARS, Field.LISTNUM, Field.DOCPROPERTY, 80, Field.AUTOTEXTLIST, 82, Field.ADDRESSBLOCK, Field.ADDIN, Field.AUTOTEXTLIST, 1, Field.MERGESEQ, Field.ADDIN, Field.NUMCHARS, 24, Field.NUMCHARS, 20, Field.PAGEREF, 8, 1, 20, 76, Field.AUTONUM, Field.AUTONUMOUT, Field.USERADDRESS, Field.MACROBUTTON};
    }

    static {
        A01();
        CREATOR = new C0763Dm();
    }

    public GeobFrame(Parcel parcel) {
        super(A00(36, 4, 2));
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(A00(36, 4, 2));
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (IK.A0g(this.A02, geobFrame.A02)) {
            String str = this.A01;
            String str2 = geobFrame.A01;
            if (A05[2].charAt(31) == 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "a9pLgNB";
            strArr[5] = "CzZ6eht";
            if (IK.A0g(str, str2) && IK.A0g(this.A00, geobFrame.A00) && Arrays.equals(this.A03, geobFrame.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result;
        int i10 = 17 * 31;
        int i11 = 0;
        if (this.A02 != null) {
            String str = this.A02;
            String[] strArr = A05;
            String str2 = strArr[6];
            String str3 = strArr[5];
            int length = str2.length();
            int result2 = str3.length();
            if (length != result2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "I7fOo4JalOo0WGey3tlmi8nSFYyfGBZ";
            strArr2[3] = "6S0ZiFCNHMZ";
            result = str.hashCode();
        } else {
            result = 0;
        }
        int result3 = (i10 + result) * 31;
        int result4 = this.A01 != null ? this.A01.hashCode() : 0;
        int i12 = (result3 + result4) * 31;
        if (this.A00 != null) {
            String str4 = this.A00;
            String[] strArr3 = A05;
            String str5 = strArr3[6];
            String str6 = strArr3[5];
            int length2 = str5.length();
            int result5 = str6.length();
            if (length2 != result5) {
                throw new RuntimeException();
            }
            A05[2] = "XOLeb9Yz2wj8Kp6a21le7nVhqJT2mzr6";
            i11 = str4.hashCode();
        }
        int result6 = (i12 + i11) * 31;
        return result6 + Arrays.hashCode(this.A03);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(25, 11, 2) + this.A02 + A00(14, 11, 79) + this.A01 + A00(0, 14, 123) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
