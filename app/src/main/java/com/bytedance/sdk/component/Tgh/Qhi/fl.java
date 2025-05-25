package com.bytedance.sdk.component.Tgh.Qhi;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.kYc;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: EventMultiUtils.java */
/* loaded from: classes.dex */
public class fl {
    public static final fl Qhi = new fl();

    private boolean ac() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    private void cJ(Qhi qhi, Context context) {
        ac.Qhi(context, "context == null");
        ac.Qhi(qhi, "AdLogConfig == null");
        ac.Qhi(qhi.CJ(), "AdLogDepend ==null");
    }

    public void Qhi(Qhi qhi, Context context) {
        cJ(qhi, context);
        hm.ROR().Qhi(context);
        hm.ROR().Qhi(qhi.WAv());
        hm.ROR().cJ(qhi.ROR());
        hm.ROR().ac(qhi.Sf());
        hm.ROR().Qhi(qhi.cJ());
        hm.ROR().CJ(qhi.hm());
        hm.ROR().fl(qhi.Tgh());
        hm.ROR().Qhi(qhi.Qhi() == null ? com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Tgh.Qhi : qhi.Qhi());
        hm.ROR().cJ(qhi.Gm());
        hm.ROR().Qhi(qhi.CJ());
        hm.ROR().Qhi(qhi.ac());
        hm.ROR().Qhi(qhi.fl());
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.Qhi(qhi.ABk());
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac.ac.cJ(qhi.zc());
        Qhi(qhi);
    }

    public void cJ() {
        final Tgh hpZ = hm.ROR().hpZ();
        if (hpZ == null || hm.ROR().Tgh() == null || hpZ.CJ() == null) {
            return;
        }
        if (hm.ROR().cJ()) {
            if (Qhi(hm.ROR().Tgh(), hpZ)) {
                hm.ROR().Gm();
                return;
            } else if (ac()) {
                hpZ.CJ().execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("stop") { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        fl.this.cJ(hpZ.Tgh());
                    }
                });
                return;
            } else {
                cJ(hpZ.Tgh());
                return;
            }
        }
        hm.ROR().Gm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.Qhi.cJ();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.cJ();
        }
    }

    private void cJ(final com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh) {
        final Tgh hpZ = hm.ROR().hpZ();
        if (tgh == null || hpZ == null || hm.ROR().Tgh() == null || hpZ.CJ() == null) {
            return;
        }
        if (hm.ROR().cJ()) {
            if (Qhi(hm.ROR().Tgh(), hpZ)) {
                hm.ROR().Qhi(tgh);
                return;
            }
            ac();
            if (ac()) {
                hpZ.CJ().execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("dispatchEvent") { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        fl.this.Qhi(tgh, hpZ.Tgh());
                    }
                });
                return;
            } else {
                Qhi(tgh, hpZ.Tgh());
                return;
            }
        }
        hm.ROR().Qhi(tgh);
    }

    private void Qhi(Qhi qhi) {
        Executor fl2;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.cJ()) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi();
            return;
        }
        Tgh CJ = qhi.CJ();
        if (CJ == null || !com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.cJ() || (fl2 = CJ.fl()) == null) {
            return;
        }
        fl2.execute(new Runnable() { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.Qhi();
            }
        });
    }

    public void Qhi(boolean z10) {
        hm.ROR().Qhi(z10);
    }

    private boolean Qhi(Context context, Tgh tgh) {
        if (context == null || tgh == null) {
            return false;
        }
        if (tgh.Tgh() == 2) {
            return true;
        }
        if (tgh.Tgh() == 1) {
            return tgh.iMK();
        }
        try {
            return kYc.Qhi(context);
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void Qhi() {
        final Tgh hpZ = hm.ROR().hpZ();
        if (hpZ == null || hm.ROR().Tgh() == null || hpZ.CJ() == null) {
            return;
        }
        if (hm.ROR().cJ()) {
            if (Qhi(hm.ROR().Tgh(), hpZ)) {
                hm.ROR().hm();
                return;
            } else if (ac()) {
                hpZ.CJ().execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("start") { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        fl.this.Qhi(hpZ.Tgh());
                    }
                });
                return;
            } else {
                Qhi(hpZ.Tgh());
                return;
            }
        }
        hm.ROR().hm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.Qhi.Qhi();
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.Qhi();
        }
    }

    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh) {
        cJ(tgh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh, int i10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.Qhi.Qhi(tgh);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.Qhi(tgh);
        }
    }

    public void Qhi(final String str, final List<String> list, final boolean z10, Map<String, String> map, final int i10, final String str2) {
        final Tgh hpZ = hm.ROR().hpZ();
        if (hpZ == null || hm.ROR().Tgh() == null || hpZ.CJ() == null) {
            return;
        }
        if (hpZ.Sf()) {
            if (hpZ.Tgh() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (hpZ.Tgh() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (hm.ROR().cJ() && !Qhi(hm.ROR().Tgh(), hpZ)) {
                if (ac()) {
                    hpZ.CJ().execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("trackFailed") { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.5
                        @Override // java.lang.Runnable
                        public void run() {
                            fl.this.Qhi(str, list, z10, hpZ.Tgh(), i10, str2);
                        }
                    });
                    return;
                } else {
                    Qhi(str, list, z10, hpZ.Tgh(), i10, str2);
                    return;
                }
            }
            hm.ROR().Qhi(str, list, z10, map, i10, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str, List<String> list, boolean z10, int i10, int i11, String str2) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.Qhi.Qhi(str, list, z10);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.Qhi(str, list, z10, i11, str2);
        }
    }

    public void Qhi(final String str, final boolean z10) {
        final Tgh hpZ = hm.ROR().hpZ();
        if (hpZ == null || hm.ROR().Tgh() == null || hpZ.CJ() == null || !hpZ.Sf()) {
            return;
        }
        if (hpZ.Tgh() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (hm.ROR().cJ() && !Qhi(hm.ROR().Tgh(), hpZ)) {
            if (ac()) {
                hpZ.CJ().execute(new com.bytedance.sdk.component.Tgh.Qhi.fl.Tgh("trackFailed") { // from class: com.bytedance.sdk.component.Tgh.Qhi.fl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        fl.this.Qhi(str, hpZ.Tgh(), z10);
                    }
                });
                return;
            } else {
                Qhi(str, hpZ.Tgh(), z10);
                return;
            }
        }
        hm.ROR().Qhi(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str, int i10, boolean z10) {
        if (i10 == 0) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.Qhi.Qhi(str);
        } else if (i10 == 1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ.cJ.Qhi(str, z10);
        }
    }
}
