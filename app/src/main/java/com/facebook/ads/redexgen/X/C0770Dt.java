package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;

/* renamed from: com.facebook.ads.redexgen.X.Dt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0770Dt implements Parcelable.Creator<PrivateCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivateCommand[] newArray(int i10) {
        return new PrivateCommand[i10];
    }
}
