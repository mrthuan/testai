package com.google.android.gms.measurement.internal;

import a8.r0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.billingclient.api.e0;
import com.android.billingclient.api.n;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import v7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzjx implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f11856a;

    /* renamed from: b  reason: collision with root package name */
    public volatile zzeq f11857b;
    public final /* synthetic */ zzjy c;

    public zzjx(zzjy zzjyVar) {
        this.c = zzjyVar;
    }

    public final void a(Intent intent) {
        this.c.m();
        Context context = ((zzge) this.c.f3529a).f11773a;
        ConnectionTracker b10 = ConnectionTracker.b();
        synchronized (this) {
            if (this.f11856a) {
                zzeu zzeuVar = ((zzge) this.c.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.a("Connection attempt already in progress");
                return;
            }
            zzeu zzeuVar2 = ((zzge) this.c.f3529a).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11720n.a("Using local app measurement service");
            this.f11856a = true;
            b10.a(context, intent, this.c.c, 129);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.j(this.f11857b);
                zzgb zzgbVar = ((zzge) this.c.f3529a).f11781j;
                zzge.f(zzgbVar);
                zzgbVar.u(new e0(this, (zzek) this.f11857b.getService(), 4));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11857b = null;
                this.f11856a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.e("MeasurementServiceConnection.onConnectionFailed");
        zzeu zzeuVar = ((zzge) this.c.f3529a).f11780i;
        if (zzeuVar == null || !zzeuVar.f219b) {
            zzeuVar = null;
        }
        if (zzeuVar != null) {
            zzeuVar.f11715i.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f11856a = false;
            this.f11857b = null;
        }
        zzgb zzgbVar = ((zzge) this.c.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new a(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.e("MeasurementServiceConnection.onConnectionSuspended");
        zzjy zzjyVar = this.c;
        zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.a("Service connection suspended");
        zzgb zzgbVar = ((zzge) zzjyVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new d0(this, 1));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object zzeiVar;
        Preconditions.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f11856a = false;
                zzeu zzeuVar = ((zzge) this.c.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.a("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof zzek) {
                        zzeiVar = (zzek) queryLocalInterface;
                    } else {
                        zzeiVar = new zzei(iBinder);
                    }
                    obj = zzeiVar;
                    zzeu zzeuVar2 = ((zzge) this.c.f3529a).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11720n.a("Bound to IMeasurementService interface");
                } else {
                    zzeu zzeuVar3 = ((zzge) this.c.f3529a).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                zzeu zzeuVar4 = ((zzge) this.c.f3529a).f11780i;
                zzge.f(zzeuVar4);
                zzeuVar4.f11712f.a("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.f11856a = false;
                try {
                    ConnectionTracker b10 = ConnectionTracker.b();
                    zzjy zzjyVar = this.c;
                    b10.c(((zzge) zzjyVar.f3529a).f11773a, zzjyVar.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                zzgb zzgbVar = ((zzge) this.c.f3529a).f11781j;
                zzge.f(zzgbVar);
                zzgbVar.u(new r0(3, this, obj));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.e("MeasurementServiceConnection.onServiceDisconnected");
        zzjy zzjyVar = this.c;
        zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.a("Service disconnected");
        zzgb zzgbVar = ((zzge) zzjyVar.f3529a).f11781j;
        zzge.f(zzgbVar);
        zzgbVar.u(new n(2, this, componentName));
    }
}
