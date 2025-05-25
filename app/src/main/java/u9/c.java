package u9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z10;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(a.class.getClassLoader());
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new b(pendingIntent, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
