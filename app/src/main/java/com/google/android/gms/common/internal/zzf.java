package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzf extends e {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f11299g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f11300h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i10, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i10, bundle);
        this.f11300h = baseGmsClient;
        this.f11299g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.e
    public final void e(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f11300h;
        if (baseGmsClient.zzx != null) {
            baseGmsClient.zzx.onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.e
    public final boolean f() {
        String interfaceDescriptor;
        BaseGmsClient baseGmsClient;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        IBinder iBinder = this.f11299g;
        try {
            Preconditions.j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            baseGmsClient = this.f11300h;
        } catch (RemoteException unused) {
        }
        if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
            baseGmsClient.getServiceDescriptor();
            return false;
        }
        IInterface createServiceInterface = baseGmsClient.createServiceInterface(iBinder);
        if (createServiceInterface != null && (BaseGmsClient.zzn(baseGmsClient, 2, 4, createServiceInterface) || BaseGmsClient.zzn(baseGmsClient, 3, 4, createServiceInterface))) {
            baseGmsClient.zzB = null;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = baseGmsClient.zzw;
                baseConnectionCallbacks2.onConnected(connectionHint);
                return true;
            }
            return true;
        }
        return false;
    }
}
