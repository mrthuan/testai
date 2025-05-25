package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.a;

/* compiled from: IPostMessageService.java */
/* loaded from: classes.dex */
public interface d extends IInterface {
    public static final String Y0 = "android$support$customtabs$IPostMessageService".replace('$', '.');

    /* compiled from: IPostMessageService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements d {
        public a() {
            attachInterface(this, d.Y0);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = d.Y0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 != 1598968902) {
                Object obj = null;
                if (i10 != 2) {
                    if (i10 != 3) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    e.a K = a.AbstractBinderC0200a.K(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    }
                    K.D0(readString, (Bundle) obj);
                    parcel2.writeNoException();
                } else {
                    e.a K2 = a.AbstractBinderC0200a.K(parcel.readStrongBinder());
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator2.createFromParcel(parcel);
                    }
                    K2.H0((Bundle) obj);
                    parcel2.writeNoException();
                }
                return true;
            }
            parcel2.writeString(str);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
