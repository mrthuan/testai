package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.E0;
import com.facebook.ads.redexgen.X.I4;
import com.facebook.ads.redexgen.X.IG;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new E0();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, E0 e02) {
        this(j10, j11);
    }

    public static long A00(I4 i42, long j10) {
        long A0E = i42.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        long firstByte = i42.A0M();
        return (((ptsTime << 32) | firstByte) + j10) & 8589934591L;
    }

    public static TimeSignalCommand A01(I4 i42, long j10, IG ig2) {
        long A00 = A00(i42, j10);
        return new TimeSignalCommand(A00, ig2.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
