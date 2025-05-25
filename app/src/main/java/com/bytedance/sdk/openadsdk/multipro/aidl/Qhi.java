package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.ROR;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Sf;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.fl;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: BinderPool.java */
/* loaded from: classes.dex */
public class Qhi {
    private static final Qhi cJ = new Qhi();
    private IBinderPool Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private cJ f9343ac;
    private long CJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    private final ServiceConnection f9344fl = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            lG.Qhi(new hm("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.2.1
                @Override // java.lang.Runnable
                public void run() {
                    Qhi.this.Qhi = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        Qhi.this.Qhi.asBinder().linkToDeath(Qhi.this.Tgh, 0);
                    } catch (RemoteException e10) {
                        ABk.Qhi("TTAD.BinderPool", "onServiceConnected throws :", e10);
                    }
                    System.currentTimeMillis();
                    long unused = Qhi.this.CJ;
                    if (Qhi.this.f9343ac != null) {
                        Qhi.this.f9343ac.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private final IBinder.DeathRecipient Tgh = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            lG.Qhi(new hm("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (Qhi.this.Qhi.asBinder().isBinderAlive()) {
                            Qhi.this.Qhi.asBinder().unlinkToDeath(Qhi.this.Tgh, 0);
                        }
                    } catch (Exception e10) {
                        ABk.Qhi("TTAD.BinderPool", e10.getMessage());
                    }
                    Qhi.this.Qhi = null;
                    Qhi.this.CJ();
                }
            }, 5);
        }
    };

    private Qhi() {
        CJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            ac();
        }
    }

    public void ac() {
        try {
            Context Qhi = HzH.Qhi();
            Qhi.bindService(new Intent(Qhi, BinderPoolService.class), this.f9344fl, 1);
            this.CJ = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void cJ() {
        try {
            Context Qhi = HzH.Qhi();
            Qhi.startService(new Intent(Qhi, BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public static Qhi Qhi() {
        return cJ;
    }

    public void Qhi(cJ cJVar) {
        this.f9343ac = cJVar;
        if (this.Qhi != null) {
            lG.Qhi(new hm("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Qhi.this.f9343ac != null) {
                        Qhi.this.f9343ac.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder Qhi(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                try {
                    IBinderPool iBinderPool = this.Qhi;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                    return null;
                } catch (RemoteException e10) {
                    ABk.Qhi("TTAD.BinderPool", e10.getMessage());
                    js.Sf("queryBinder error");
                    return null;
                }
            } else if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                return null;
                            }
                            return com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.cJ.Qhi();
                        }
                        return fl.Qhi();
                    }
                    return ROR.cJ();
                }
                return Tgh.Qhi();
            } else {
                return Sf.Qhi();
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
