package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.ROR;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Sf;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.fl;

/* loaded from: classes.dex */
public class BinderPoolService extends Service {
    public static volatile boolean Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static boolean f9342ac;
    private final Binder cJ = new Qhi();

    /* loaded from: classes.dex */
    public static class Qhi extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 4) {
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
                    return com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.ac.Qhi();
                }
                return Tgh.Qhi();
            }
            return Sf.Qhi();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.cJ;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HzH.cJ(getApplicationContext());
        Qhi = true;
        if (!f9342ac) {
            com.bytedance.sdk.component.utils.Sf.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        f9342ac = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
