package com.bytedance.sdk.openadsdk.core.ROR;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewabilitySessionManager.java */
/* loaded from: classes.dex */
public class ROR {
    final Set<Pair<View, FriendlyObstructionPurpose>> Qhi = new HashSet();
    private Sf cJ;

    private ROR() {
        Tgh.Qhi(HzH.Qhi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ROR() {
        Sf sf2 = this.cJ;
        if (sf2 != null) {
            try {
                sf2.CJ();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sf() {
        Sf sf2 = this.cJ;
        if (sf2 != null) {
            try {
                sf2.ac();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        if (this.cJ != null) {
            try {
                Qhi((View) null, (FriendlyObstructionPurpose) null);
                this.cJ.cJ();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler fl() {
        return com.bytedance.sdk.component.utils.Sf.cJ();
    }

    public void CJ() {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            Sf();
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.8
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.Sf();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(WebView webView) {
        try {
            if (this.cJ == null) {
                this.cJ = hm.Qhi(webView);
            }
        } catch (Throwable th2) {
            ABk.cJ("createWebViewSession failed : ".concat(String.valueOf(th2)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            Tgh.Qhi(hashMap);
        }
    }

    public void ac() {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            ROR();
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.7
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.ROR();
                }
            });
        }
    }

    public static ROR Qhi() {
        return new ROR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(View view, Set<Gm> set) {
        try {
            if (this.cJ == null) {
                this.cJ = hm.Qhi(view, set);
            }
        } catch (Throwable th2) {
            ABk.cJ("createVideoSession failed : ".concat(String.valueOf(th2)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            Tgh.Qhi(hashMap);
        }
    }

    public void Qhi(final WebView webView) {
        if (webView == null || this.cJ != null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(webView);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.1
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(webView);
                }
            });
        }
    }

    public void Qhi(final View view, final Set<Gm> set) {
        if (this.cJ != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(view, set);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.4
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(view, set);
                }
            });
        }
    }

    public void cJ() {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            Tgh();
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.5
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.Tgh();
                }
            });
        }
    }

    public void Qhi(final boolean z10, final float f10) {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(z10, f10);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.6
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(z10, f10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10, float f10) {
        if (this.cJ != null) {
            try {
                Qhi((View) null, (FriendlyObstructionPurpose) null);
                this.cJ.Qhi(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void Qhi(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(view, friendlyObstructionPurpose);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.9
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Sf sf2 = this.cJ;
        try {
            if (sf2 == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.Qhi.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                sf2.Qhi(view, friendlyObstructionPurpose);
            }
            if (this.Qhi.size() > 0) {
                sf2.Qhi(this.Qhi);
                this.Qhi.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void Qhi(final long j10, final boolean z10) {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(j10, z10);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.10
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(j10, z10);
                }
            });
        }
    }

    public void Qhi(final boolean z10) {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(z10);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.2
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(z10);
                }
            });
        }
    }

    public void cJ(long j10, boolean z10) {
        Sf sf2 = this.cJ;
        if (sf2 != null) {
            try {
                sf2.Qhi(((float) j10) / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    public void Qhi(final int i10) {
        if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
            cJ(i10);
        } else {
            fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ROR.3
                @Override // java.lang.Runnable
                public void run() {
                    ROR.this.cJ(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10) {
        Sf sf2 = this.cJ;
        if (sf2 != null) {
            try {
                sf2.Qhi(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10) {
        Sf sf2 = this.cJ;
        if (sf2 != null) {
            try {
                sf2.cJ(i10);
            } catch (Throwable unused) {
            }
        }
    }
}
