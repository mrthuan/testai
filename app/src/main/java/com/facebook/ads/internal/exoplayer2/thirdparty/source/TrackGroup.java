package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.redexgen.X.AbstractC0844Hf;
import com.facebook.ads.redexgen.X.FO;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new FO();
    public int A00;
    public final int A01;
    public final Format[] A02;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TrackGroup(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            r3.A01 = r0
            int r0 = r3.A01
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[r0]
            r3.A02 = r0
            r2 = 0
        L10:
            int r0 = r3.A01
            if (r2 >= r0) goto L27
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r1 = r3.A02
            java.lang.Class<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L10
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup.<init>(android.os.Parcel):void");
    }

    public TrackGroup(Format... formatArr) {
        AbstractC0844Hf.A04(formatArr.length > 0);
        this.A02 = formatArr;
        this.A01 = formatArr.length;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A00(com.facebook.ads.internal.exoplayer2.thirdparty.Format r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = r2.A02
            int r0 = r0.length
            if (r1 >= r0) goto L10
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = r2.A02
            r0 = r0[r1]
            if (r3 != r0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup.A00(com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    public final Format A01(int i10) {
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
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.A01 == trackGroup.A01 && Arrays.equals(this.A02, trackGroup.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
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
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = r3.A02
            r1 = r0[r2]
            r0 = 0
            r4.writeParcelable(r1, r0)
            int r2 = r2 + 1
            goto L6
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup.writeToParcel(android.os.Parcel, int):void");
    }
}
