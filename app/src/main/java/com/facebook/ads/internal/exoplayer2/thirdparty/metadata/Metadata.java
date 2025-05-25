package com.facebook.ads.internal.exoplayer2.thirdparty.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.DY;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Metadata implements Parcelable {
    public static String[] A01 = {"zUrQL7GUAFocRwXemPY3yhr7l5S0xY70", "XA9ucE3fWwyEdcoFcQASvZGj6bcFZVPf", "ELtxf4Y1Jk8LgiiMyUKCki1FwOPJJgog", "B2kGyn7fabtxlQFxUauI1B2uFfXVCAPw", "ixu7mQ4Wy9aHS7V0bxaOfUuqyif4M3aJ", "47fcOB6GOJ9GbfMYvfTnL8sz1WC6cZa5", "IJISlEQyfUS3lhl3waK4regZPajL", "9B8Fyg4n1zOjDAkl95LqaeehXECnF5Gm"};
    public static final Parcelable.Creator<Metadata> CREATOR = new DY();
    public final Entry[] A00;

    /* loaded from: assets/audience_network.dex */
    public interface Entry extends Parcelable {
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Metadata(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry[] r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry[r0]
            r3.A00 = r0
            r2 = 0
        Lc:
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry[] r0 = r3.A00
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry[] r1 = r3.A00
            java.lang.Class<com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry> r0 = com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata$Entry r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.Entry) r0
            r1[r2] = r0
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata.<init>(android.os.Parcel):void");
    }

    public Metadata(List<? extends Entry> entries) {
        if (entries != null) {
            this.A00 = new Entry[entries.size()];
            entries.toArray(this.A00);
            return;
        }
        this.A00 = new Entry[0];
    }

    public Metadata(Entry... entryArr) {
        this.A00 = entryArr == null ? new Entry[0] : entryArr;
    }

    public final int A00() {
        return this.A00.length;
    }

    public final Entry A01(int i10) {
        return this.A00[i10];
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
        boolean equals = Arrays.equals(this.A00, ((Metadata) obj).A00);
        if (A01[6].length() != 24) {
            String[] strArr = A01;
            strArr[4] = "4knFxayiXxWd81AO688yXEIAIwBcfeff";
            strArr[1] = "lUV3PTeQde6UvfJepvohNqjkevUlt3kA";
            return equals;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A00.length);
        for (Entry entry : this.A00) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
