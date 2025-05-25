package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class f implements IGmsServiceBroker {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f11247a;

    public f(IBinder iBinder) {
        this.f11247a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11247a;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void q(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (iGmsCallbacks != null) {
                iBinder = iGmsCallbacks.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                zzn.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f11247a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
