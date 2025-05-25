package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.redexgen.X.C0756Df;
import com.facebook.ads.redexgen.X.IK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EventMessage implements Metadata.Entry {
    public static byte[] A07;
    public static String[] A08 = {"FMjxbvFdyXplLIcqmQRblVNaYinTFJot", "lsOkAII0H3p85vNUKB6UfhRm5qanyVzp", "h24iUNFade0Ph", "g7c0fS0YYb6oSowt", "heP9AS8gF02VUJcvkTVaFkcx4c9WIelE", "r19", "kAss9yK6DE047", "5GwHlBoWLrNf5h"};
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{125, 113, -70, -75, -114, Byte.MAX_VALUE, 115, -55, -76, -65, -56, -72, -112, -99, -91, -85, -97, -110, 120, -53, -69, -64, -67, -59, -67, -107};
    }

    static {
        A01();
        CREATOR = new C0756Df();
    }

    public EventMessage(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A06 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr, long j12) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = j10;
        this.A02 = j11;
        this.A06 = bArr;
        this.A03 = j12;
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
        EventMessage eventMessage = (EventMessage) obj;
        if (this.A03 == eventMessage.A03 && this.A01 == eventMessage.A01 && this.A02 == eventMessage.A02) {
            boolean A0g = IK.A0g(this.A04, eventMessage.A04);
            String[] strArr = A08;
            if (strArr[1].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            A08[6] = "WDjrqrwL3frpQ";
            if (A0g && IK.A0g(this.A05, eventMessage.A05) && Arrays.equals(this.A06, eventMessage.A06)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            int result = this.A04 != null ? this.A04.hashCode() : 0;
            int result2 = (i10 + result) * 31;
            int hashCode = this.A05 != null ? this.A05.hashCode() : 0;
            int result3 = (int) (this.A03 ^ (this.A03 >>> 32));
            int result4 = (int) (this.A02 ^ (this.A02 >>> 32));
            this.A00 = ((((((((result2 + hashCode) * 31) + result3) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + result4) * 31) + Arrays.hashCode(this.A06);
        }
        int result5 = this.A00;
        return result5;
    }

    public final String toString() {
        return A00(13, 13, 23) + this.A04 + A00(0, 5, 16) + this.A02 + A00(5, 8, 18) + this.A05;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A06);
    }
}
