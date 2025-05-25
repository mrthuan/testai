package w1;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f30904a;

    public c(IBinder iBinder) {
        this.f30904a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30904a;
    }

    @Override // w1.d
    public final void o(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f30904a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
