package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0760Dj;
import com.facebook.ads.redexgen.X.IK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static String[] A07 = {"xKlEfosPJh9yMYQbCpjDM6s3zVcpxbP5", "1lFQ4Yh1vie1DVx8Y9IEXTb70qub4TNk", "6NcFsoITlli6jci9nvzmOwHlbJumCDg8", "Ul6ETdKi4sSCw8OfXK8DwBAUtHNMz", "Qw", "1etWMItfpuVaeAJJ6tkaD2MNxiPHvPlN", "9RcPYWx5DIRFaHhOPvn0aLDVj5gcLBHE", "0abnNKrUxL1ELdZKmdvyuLuXX7NQ1wMW"};
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{0, 11, 2, 19};
        if (A07[2].charAt(31) == 'e') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Iz4TXcr6fUIHp2VorFlDJLDUzyiLCaPl";
        strArr[6] = "Hjeg8cIGsBVxKCP6C4PLXLTELLPGRiUg";
    }

    static {
        A01();
        CREATOR = new C0760Dj();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 18));
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A05[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 18));
        this.A04 = str;
        this.A01 = i10;
        this.A00 = i11;
        this.A03 = j10;
        this.A02 = j11;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame, android.os.Parcelable
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
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && IK.A0g(this.A04, chapterFrame.A04) && Arrays.equals(this.A05, chapterFrame.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result2 = (int) this.A03;
        int result3 = (((i10 + result2) * 31) + ((int) this.A02)) * 31;
        int result4 = this.A04 != null ? this.A04.hashCode() : 0;
        return result3 + result4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame id3Frame : this.A05) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
