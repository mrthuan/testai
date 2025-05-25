package q9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class n extends Binder implements IInterface {
    public n(String str) {
        attachInterface(this, str);
    }

    public boolean K(int i10, Parcel parcel) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return K(i10, parcel);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
