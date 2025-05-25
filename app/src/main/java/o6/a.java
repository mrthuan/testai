package o6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IReceiverService.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IReceiverService.java */
    /* renamed from: o6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0303a extends Binder implements a {

        /* compiled from: IReceiverService.java */
        /* renamed from: o6.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0304a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f22742a;

            public C0304a(IBinder iBinder) {
                this.f22742a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f22742a;
            }

            @Override // o6.a
            public final int h(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    this.f22742a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a K(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0304a(iBinder);
        }
    }

    int h(Bundle bundle);
}
