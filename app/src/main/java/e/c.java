package e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import u.k;

/* compiled from: IEngagementSignalsCallback.java */
/* loaded from: classes.dex */
public interface c extends IInterface {
    public static final String X0 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* compiled from: IEngagementSignalsCallback.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements c {
        public a() {
            attachInterface(this, c.X0);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = c.X0;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 != 1598968902) {
                Object obj = null;
                boolean z10 = false;
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = creator.createFromParcel(parcel);
                        }
                        ((k) this).L0(z10, (Bundle) obj);
                    } else {
                        int readInt = parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            obj = creator2.createFromParcel(parcel);
                        }
                        ((k) this).K(readInt, (Bundle) obj);
                    }
                } else {
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator3.createFromParcel(parcel);
                    }
                    ((k) this).M0(z10, (Bundle) obj);
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
