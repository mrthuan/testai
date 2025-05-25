package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0759Di;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BinaryFrame extends Id3Frame {
    public static String[] A01 = {"v6RK6OSzPJ8ssi8MAkPxeSHb", "5iaWNhSEWXdQGqHhJWYkL3vAUnXTRhmq", "Lc2NFYXsFUM95", "ywPZ8", "moGnTq2WWr5ZsvpzbyzmCADJMv", "L7s4SUBCChL0YzkanmLdnighm5pk1EfG", "ewYMn9GjFuSxFQofwWKCBh7wdb0h2l2L", "1KoOvrfbG7PQp"};
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C0759Di();
    public final byte[] A00;

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (super.A00.equals(((Id3Frame) binaryFrame).A00)) {
            boolean equals = Arrays.equals(this.A00, binaryFrame.A00);
            if (A01[0].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "axoUf";
            strArr[4] = "0lWAINa21gVDBVCzmQ6kppciAl";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        return (((17 * 31) + result) * 31) + Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeByteArray(this.A00);
    }
}
