package l0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* compiled from: IUnusedAppRestrictionsBackportService.java */
/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {
    public c() {
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        b aVar;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }
        if (i10 != 1598968902) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    aVar = (b) queryLocalInterface;
                } else {
                    aVar = new a(readStrongBinder);
                }
            }
            UnusedAppRestrictionsBackportService.a aVar2 = (UnusedAppRestrictionsBackportService.a) this;
            if (aVar != null) {
                UnusedAppRestrictionsBackportService.this.a();
            }
            return true;
        }
        parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
