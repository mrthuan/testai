package p9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class f implements h, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f23806a;

    public f(IBinder iBinder) {
        this.f23806a = iBinder;
    }

    @Override // p9.h
    public final void C0(String str, Bundle bundle, o9.l lVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i10 = e.f23805a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(lVar);
        try {
            this.f23806a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p9.h
    public final void X(String str, Bundle bundle, o9.k kVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i10 = e.f23805a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(kVar);
        try {
            this.f23806a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23806a;
    }
}
