package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f11297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f11298b;

    public zze(BaseGmsClient baseGmsClient, int i10) {
        this.f11298b = baseGmsClient;
        this.f11297a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker fVar;
        BaseGmsClient baseGmsClient = this.f11298b;
        if (iBinder != null) {
            obj = baseGmsClient.zzq;
            synchronized (obj) {
                BaseGmsClient baseGmsClient2 = this.f11298b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                    fVar = (IGmsServiceBroker) queryLocalInterface;
                } else {
                    fVar = new f(iBinder);
                }
                baseGmsClient2.zzr = fVar;
            }
            this.f11298b.zzl(0, null, this.f11297a);
            return;
        }
        BaseGmsClient.zzk(baseGmsClient, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f11298b.zzq;
        synchronized (obj) {
            this.f11298b.zzr = null;
        }
        BaseGmsClient baseGmsClient = this.f11298b;
        int i10 = this.f11297a;
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
