package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        kotlin.jvm.internal.g.e(source, "source");
        return new J(source, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new J[i10];
    }
}
