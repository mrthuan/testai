package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f11255a;

    public /* synthetic */ k(l lVar) {
        this.f11255a = lVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f11255a.f11256d) {
                zzo zzoVar = (zzo) message.obj;
                j jVar = (j) this.f11255a.f11256d.get(zzoVar);
                if (jVar != null && jVar.f11250b == 3) {
                    String.valueOf(zzoVar);
                    new Exception();
                    ComponentName componentName = jVar.f11253f;
                    if (componentName == null) {
                        zzoVar.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zzoVar.f11307b;
                        Preconditions.j(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    jVar.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
        synchronized (this.f11255a.f11256d) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                j jVar2 = (j) this.f11255a.f11256d.get(zzoVar2);
                if (jVar2 != null && jVar2.f11249a.isEmpty()) {
                    if (jVar2.c) {
                        jVar2.f11254g.f11258f.removeMessages(1, jVar2.f11252e);
                        l lVar = jVar2.f11254g;
                        lVar.f11259g.c(lVar.f11257e, jVar2);
                        jVar2.c = false;
                        jVar2.f11250b = 2;
                    }
                    this.f11255a.f11256d.remove(zzoVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
