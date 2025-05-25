package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import q7.c;
import q7.e;
import w4.a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzh implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f10852a;

    public /* synthetic */ zzh(c cVar) {
        this.f10852a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f10852a;
        while (true) {
            synchronized (cVar) {
                if (cVar.f29086a != 2) {
                    return;
                }
                if (cVar.f29088d.isEmpty()) {
                    cVar.c();
                    return;
                }
                final e<?> eVar = (e) cVar.f29088d.poll();
                cVar.f29089e.put(eVar.f29091a, eVar);
                cVar.f29090f.f10860b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar2 = c.this;
                        int i10 = eVar.f29091a;
                        synchronized (cVar2) {
                            e<?> eVar2 = cVar2.f29089e.get(i10);
                            if (eVar2 != null) {
                                cVar2.f29089e.remove(i10);
                                eVar2.c(new zzq(3, "Timed out waiting for response", null));
                                cVar2.c();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    new StringBuilder(String.valueOf(eVar).length() + 8);
                }
                Context context = cVar.f29090f.f10859a;
                Messenger messenger = cVar.f29087b;
                Message obtain = Message.obtain();
                obtain.what = eVar.c;
                obtain.arg1 = eVar.f29091a;
                obtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", eVar.b());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", eVar.f29093d);
                obtain.setData(bundle);
                try {
                    a aVar = cVar.c;
                    Messenger messenger2 = (Messenger) aVar.f30970a;
                    if (messenger2 != null) {
                        messenger2.send(obtain);
                    } else {
                        zzd zzdVar = (zzd) aVar.f30971b;
                        if (zzdVar != null) {
                            Messenger messenger3 = zzdVar.f10845a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        } else {
                            throw new IllegalStateException("Both messengers are null");
                            break;
                        }
                    }
                } catch (RemoteException e10) {
                    cVar.a(2, e10.getMessage());
                }
            }
        }
    }
}
