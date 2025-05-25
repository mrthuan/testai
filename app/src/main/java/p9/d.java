package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public class d extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23804a;

    public d(int i10) {
        this.f23804a = i10;
        if (i10 != 1) {
            attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        } else {
            attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        }
    }

    public boolean K(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f23804a) {
            case 0:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return K(i10, parcel, parcel2, i11);
            default:
                if (i10 > 16777215) {
                    if (super.onTransact(i10, parcel, parcel2, i11)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return K(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
