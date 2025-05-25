package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0762Dl;
import com.facebook.ads.redexgen.X.IK;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class CommentFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"DUn7", "DRjBJdg6i5DjaqZT9xtKW9OtehwlvUrA", "sLyx3xsvCq1vrvDIOYc9pqL1bJ6C1jBj", "54TYRanHXsZ6kGDBcRIxVBGHBRHjWieI", "PsznUfBovfWVPTPTeXeHOSrkMPYOlziD", "O1tIaafDMGp1i0", "7qjDKaDRQc0Nql42std83YrFyKnWrUw", "hlvVSUP428eV4RdTvjr"};
    public static final Parcelable.Creator<CommentFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.TOA, Field.FILESIZE, 1, 0, 22, 6, 23, 12, 21, 17, 12, 10, 11, Field.HYPERLINK, 86, 76, 0, 13, 2, 11, 25, 13, 11, 9, Field.ADDIN, 8, 4, 6, 6};
    }

    static {
        A01();
        CREATOR = new C0762Dl();
    }

    public CommentFrame(Parcel parcel) {
        super(A00(25, 4, 125));
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super(A00(25, 4, 125));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (IK.A0g(this.A00, commentFrame.A00) && IK.A0g(this.A01, commentFrame.A01) && IK.A0g(this.A02, commentFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17 * 31;
        int result = this.A01 != null ? this.A01.hashCode() : 0;
        int hashCode = ((i10 + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[7];
        int result2 = str.length();
        if (result2 != str2.length()) {
            A04[0] = "BRvGxta5fbsybelplClSK";
            int result3 = (hashCode * 31) + (this.A02 != null ? this.A02.hashCode() : 0);
            return result3;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(14, 11, 90) + this.A01 + A00(0, 14, 83) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
