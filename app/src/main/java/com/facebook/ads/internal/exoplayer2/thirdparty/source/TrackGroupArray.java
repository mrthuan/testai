package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcelable;
import com.facebook.ads.redexgen.X.FQ;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroupArray implements Parcelable {
    public static String[] A03 = {"", "Nsz3HOVG8K47", "9B0MFxoFwbiIxNv", "l4kItkL2rgGo3pW1X7LioUN1Ht", "8fyYvbIPnXp9ayPzd2rq2NXGd", "tQKmiB4adr0mBFsiSe1mIorsQq1f29kZ", "yFO4r3Iibj8MWWU2s3y3PrCR5g5ClbcE", "iBPKumYfmLb65bhUzcw7T4vxhwf25kYO"};
    public static final TrackGroupArray A04 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new FQ();
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TrackGroupArray(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            r3.A01 = r0
            int r0 = r3.A01
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[] r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[r0]
            r3.A02 = r0
            r2 = 0
        L10:
            int r0 = r3.A01
            if (r2 >= r0) goto L27
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[] r1 = r3.A02
            java.lang.Class<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup> r0 = com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L10
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.<init>(android.os.Parcel):void");
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    public final int A00(TrackGroup trackGroup) {
        int i10 = 0;
        while (true) {
            int i11 = this.A01;
            String[] strArr = A03;
            String str = strArr[3];
            String str2 = strArr[4];
            int length = str.length();
            int i12 = str2.length();
            if (length == i12) {
                throw new RuntimeException();
            }
            A03[7] = "4PF46ait35IDhLYsteRaFKZRZtm75ANA";
            if (i10 < i11) {
                if (this.A02[i10] == trackGroup) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final TrackGroup A01(int i10) {
        return this.A02[i10];
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
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.A01 == trackGroupArray.A01) {
            boolean equals = Arrays.equals(this.A02, trackGroupArray.A02);
            if (A03[7].charAt(28) != '5') {
                throw new RuntimeException();
            }
            A03[1] = "3D";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A01
            r4.writeInt(r0)
            r2 = 0
        L6:
            int r0 = r3.A01
            if (r2 >= r0) goto L15
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[] r0 = r3.A02
            r1 = r0[r2]
            r0 = 0
            r4.writeParcelable(r1, r0)
            int r2 = r2 + 1
            goto L6
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray.writeToParcel(android.os.Parcel, int):void");
    }
}
