package jb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final t createFromParcel(Parcel parcel) {
        int t4 = SafeParcelReader.t(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.s(readInt, parcel);
            } else {
                bundle = SafeParcelReader.b(readInt, parcel);
            }
        }
        SafeParcelReader.k(t4, parcel);
        return new t(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final t[] newArray(int i10) {
        return new t[i10];
    }
}
