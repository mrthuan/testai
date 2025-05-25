package p9;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public abstract class i extends d implements j {
    public i() {
        super(0);
    }

    @Override // p9.d
    public final boolean K(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Parcelable parcelable = null;
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i12 = e.f23805a;
            if (parcel.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                zzb(bundle);
                return true;
            }
            throw new BadParcelableException(b.a.c("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        Parcelable.Creator creator2 = Bundle.CREATOR;
        int i13 = e.f23805a;
        if (parcel.readInt() != 0) {
            parcelable = (Parcelable) creator2.createFromParcel(parcel);
        }
        Bundle bundle2 = (Bundle) parcelable;
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            P(bundle2);
            return true;
        }
        throw new BadParcelableException(b.a.c("Parcel data not fully consumed, unread size: ", dataAvail2));
    }
}
