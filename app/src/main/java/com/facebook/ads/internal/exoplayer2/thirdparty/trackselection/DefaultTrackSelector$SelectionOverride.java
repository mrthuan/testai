package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0820Gg;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static String[] A03 = {"JDxg7tKUhtdUIhfIwWVDLdP283uC1zvF", "2iFGc0pCeEUmxWBYpAycAp3qF9I3P3Ut", "CY6jT2dpX", "Exq6DKTWLIzC5PVLQAd8YA2GF4DsQGTp", "Q4", "7IwF3iXkl0b", "WRMecujAG", "ZI"};
    public static final Parcelable.Creator<DefaultTrackSelector$SelectionOverride> CREATOR = new C0820Gg();
    public final int A00;
    public final int A01;
    public final int[] A02;

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readByte();
        this.A02 = new int[this.A01];
        parcel.readIntArray(this.A02);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A03[1] = "XHK065n3VHEeOH2YPoqOuBkTW3Rzvopo";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) obj;
        return this.A00 == defaultTrackSelector$SelectionOverride.A00 && Arrays.equals(this.A02, defaultTrackSelector$SelectionOverride.A02);
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeIntArray(this.A02);
    }
}
