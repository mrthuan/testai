package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;

/* renamed from: com.facebook.ads.redexgen.X.Df  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0756Df implements Parcelable.Creator<EventMessage> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final EventMessage[] newArray(int i10) {
        return new EventMessage[i10];
    }
}
