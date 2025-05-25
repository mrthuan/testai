package com.bytedance.sdk.openadsdk.core.fl;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.Gm.Qhi.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MSSdkImpl.java */
/* loaded from: classes.dex */
public class Qhi {
    private PglSSManager Qhi;
    private volatile boolean cJ;

    /* renamed from: ac  reason: collision with root package name */
    private volatile boolean f9034ac = true;
    private volatile boolean CJ = false;

    public Qhi() {
        Qhi();
    }

    private boolean ROR() {
        if (!this.cJ && this.f9034ac) {
            Qhi();
        }
        return this.cJ;
    }

    private void Sf() {
        if (this.Qhi == null) {
            this.Qhi = PglSSManager.getInstance();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0006
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private java.lang.Class hm() {
        /*
            r2 = this;
            java.lang.Class<com.pgl.ssdk.ces.out.PglSSManager> r0 = com.pgl.ssdk.ces.out.PglSSManager.class
            r1 = 1
            r2.f9034ac = r1     // Catch: java.lang.Throwable -> L7
            goto La
        L6:
            r0 = 0
        L7:
            r1 = 0
            r2.f9034ac = r1
        La:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.fl.Qhi.hm():java.lang.Class");
    }

    public String CJ() {
        if (ROR()) {
            Sf();
            PglSSManager pglSSManager = this.Qhi;
            return pglSSManager != null ? pglSSManager.getToken() : "";
        }
        return "";
    }

    public int Tgh() {
        if (this.f9034ac) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void ac() {
        if (ROR()) {
            Sf();
            if (this.Qhi != null) {
                iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fl.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, HzH.CJ().bM());
                            Qhi.this.Qhi.setCustomInfo(hashMap);
                        } catch (Throwable th2) {
                            qMt.cJ("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public boolean cJ() {
        return this.cJ;
    }

    public String fl() {
        if (!ROR()) {
            return "";
        }
        Sf();
        PglSSManager pglSSManager = this.Qhi;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getSofChara();
    }

    public synchronized void Qhi() {
        if (this.cJ) {
            return;
        }
        Context Qhi = HzH.Qhi();
        String CJ = hm.cJ().CJ();
        if (TextUtils.isEmpty(CJ)) {
            CJ = hm.Qhi("app_id", Long.MAX_VALUE);
        }
        if (TextUtils.isEmpty(CJ)) {
            return;
        }
        PglSSManager.init(Qhi, PglSSConfig.builder().setAppId(CJ).setOVRegionType(0).setAdsdkVersionCode(BuildConfig.VERSION_CODE).build(), null, null, zc.Qhi(Qhi), com.bytedance.sdk.openadsdk.pA.Qhi.cJ.Qhi.Qhi().cJ());
        Sf();
        this.cJ = true;
        if (this.f9034ac) {
            CJ(PglSSManager.getLoadError());
        }
    }

    public void cJ(final String str) {
        if (ROR()) {
            Sf();
            if (this.Qhi != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    lG.cJ(new com.bytedance.sdk.component.Sf.hm("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.fl.Qhi.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Qhi.this.Qhi != null) {
                                Qhi.this.Qhi.setDeviceId(str);
                            }
                        }
                    });
                } else {
                    this.Qhi.setDeviceId(str);
                }
            }
        }
    }

    private void CJ(final String str) {
        if (this.CJ || TextUtils.isEmpty(str)) {
            return;
        }
        HzH.fl().Qhi(new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.core.fl.Qhi.3
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return fl.cJ().Qhi("secsdk_init_error").cJ(str);
            }
        }, false);
        this.CJ = true;
    }

    public void ac(String str) {
        if (ROR()) {
            Sf();
            PglSSManager pglSSManager = this.Qhi;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str);
            }
        }
    }

    public void Qhi(String str) {
        if (ROR()) {
            Sf();
            PglSSManager pglSSManager = this.Qhi;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void Qhi(MotionEvent motionEvent) {
        if (cJ()) {
            Sf();
            PglSSManager pglSSManager = this.Qhi;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> Qhi(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!ROR() || (featureHash = this.Qhi.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
