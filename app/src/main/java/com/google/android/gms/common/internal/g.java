package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class g extends com.google.android.gms.internal.common.zzi {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f11248a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f11248a = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z10;
        boolean z11 = false;
        if (this.f11248a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                z11 = true;
            }
            if (z11) {
                zzc zzcVar = (zzc) message.obj;
                zzcVar.b();
                zzcVar.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && ((i11 != 4 || this.f11248a.enableLocalFallback()) && message.what != 5)) || this.f11248a.isConnecting()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                this.f11248a.zzB = new ConnectionResult(message.arg2);
                if (BaseGmsClient.zzo(this.f11248a)) {
                    BaseGmsClient baseGmsClient = this.f11248a;
                    z10 = baseGmsClient.zzC;
                    if (!z10) {
                        baseGmsClient.zzp(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.f11248a;
                connectionResult3 = baseGmsClient2.zzB;
                if (connectionResult3 != null) {
                    connectionResult4 = baseGmsClient2.zzB;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.f11248a.zzc.a(connectionResult4);
                this.f11248a.onConnectionFailed(connectionResult4);
                return;
            } else if (i12 == 5) {
                BaseGmsClient baseGmsClient3 = this.f11248a;
                connectionResult = baseGmsClient3.zzB;
                if (connectionResult != null) {
                    connectionResult2 = baseGmsClient3.zzB;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.f11248a.zzc.a(connectionResult2);
                this.f11248a.onConnectionFailed(connectionResult2);
                return;
            } else if (i12 == 3) {
                Object obj2 = message.obj;
                if (obj2 instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj2;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.f11248a.zzc.a(connectionResult5);
                this.f11248a.onConnectionFailed(connectionResult5);
                return;
            } else if (i12 == 6) {
                this.f11248a.zzp(5, null);
                BaseGmsClient baseGmsClient4 = this.f11248a;
                baseConnectionCallbacks = baseGmsClient4.zzw;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.zzw;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.f11248a.onConnectionSuspended(message.arg2);
                BaseGmsClient.zzn(this.f11248a, 5, 1, null);
                return;
            } else if (i12 == 2 && !this.f11248a.isConnected()) {
                zzc zzcVar2 = (zzc) message.obj;
                zzcVar2.b();
                zzcVar2.d();
                return;
            } else {
                int i13 = message.what;
                if (i13 == 2 || i13 == 1 || i13 == 7) {
                    z11 = true;
                }
                if (z11) {
                    zzc zzcVar3 = (zzc) message.obj;
                    synchronized (zzcVar3) {
                        obj = zzcVar3.f11293a;
                        if (zzcVar3.f11294b) {
                            zzcVar3.toString();
                        }
                    }
                    if (obj != null) {
                        zzcVar3.a();
                    }
                    synchronized (zzcVar3) {
                        zzcVar3.f11294b = true;
                    }
                    zzcVar3.d();
                    return;
                }
                Log.wtf("GmsClient", b.a.c("Don't know how to handle message: ", i13), new Exception());
                return;
            }
        }
        zzc zzcVar4 = (zzc) message.obj;
        zzcVar4.b();
        zzcVar4.d();
    }
}
