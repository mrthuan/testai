package v9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class b implements d, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f30777a;

    public b(IBinder iBinder) {
        this.f30777a = iBinder;
    }

    @Override // v9.d
    public final void Z(String str, Bundle bundle, u9.g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i10 = a.f30776a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gVar);
        try {
            this.f30777a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30777a;
    }
}
