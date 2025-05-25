package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f29095a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29096b;

    public a(IBinder iBinder, String str) {
        this.f29095a = iBinder;
        this.f29096b = str;
    }

    public final Parcel K() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29096b);
        return obtain;
    }

    public final void L0(int i10, Parcel parcel) {
        try {
            this.f29095a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29095a;
    }
}
