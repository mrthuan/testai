package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.Tgh.ac;
import com.bytedance.sdk.component.ROR.CJ.Sf;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.Eh;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.qMt;

/* loaded from: classes.dex */
public final class PAGConfig implements InitConfig {
    private static String Gm;
    private String Qhi;
    private boolean Sf;
    private String WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f8584ac;
    private boolean cJ;

    /* renamed from: hm  reason: collision with root package name */
    private String f8586hm;
    private int CJ = -1;

    /* renamed from: fl  reason: collision with root package name */
    private int f8585fl = -1;
    private int Tgh = -1;
    private int ROR = 0;

    public static void debugLog(boolean z10) {
        if (Eh.Qhi() != null) {
            if (z10) {
                Eh.Qhi().fl(1);
                Eh.Qhi().Qhi();
                return;
            }
            Eh.Qhi().fl(0);
            Sf.Qhi(Sf.Qhi.OFF);
            ABk.ac();
            ac.cJ();
            qMt.cJ();
        }
    }

    public static int getChildDirected() {
        if (!js.hm("getCoppa")) {
            return -1;
        }
        return Eh.Qhi().cJ();
    }

    public static int getDoNotSell() {
        if (!js.hm("getCCPA")) {
            return -1;
        }
        return Eh.Qhi().Tgh();
    }

    public static int getGDPRConsent() {
        if (!js.hm("getGdpr")) {
            return -1;
        }
        int ac2 = Eh.Qhi().ac();
        if (ac2 == 1) {
            return 0;
        }
        if (ac2 == 0) {
            return 1;
        }
        return ac2;
    }

    public static void setAppIconId(int i10) {
        if (Eh.Qhi() != null) {
            Eh.Qhi().Tgh(i10);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
        if (!js.hm("setCoppa")) {
            return;
        }
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        Eh.Qhi().cJ(i10);
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
        if (!js.hm("setCCPA")) {
            return;
        }
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        Eh.Qhi().CJ(i10);
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
        js.hm("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        Eh.Qhi().ac(i10);
    }

    public static void setPackageName(String str) {
        Gm = str;
    }

    public static void setUserData(String str) {
        if (Eh.Qhi() != null) {
            Eh.Qhi().cJ(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.f8584ac;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.WAv;
    }

    public boolean getDebugLog() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.f8585fl;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.f8586hm)) {
            return Gm;
        }
        return this.f8586hm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.ROR;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.Sf;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.Tgh = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void fl(int i10) {
        this.ROR = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.f8585fl = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str) {
        this.WAv = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(String str) {
        this.f8586hm = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(String str) {
        this.Qhi = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(boolean z10) {
        this.cJ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.CJ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10) {
        this.f8584ac = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10) {
        this.Sf = z10;
        com.bykv.vk.openvk.component.video.api.ac.Qhi(z10);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private String Gm;
        private String Qhi;
        private String WAv;

        /* renamed from: ac  reason: collision with root package name */
        private int f8587ac;
        private boolean cJ;

        /* renamed from: hm  reason: collision with root package name */
        private String[] f8589hm;
        private int CJ = -1;

        /* renamed from: fl  reason: collision with root package name */
        private int f8588fl = -1;
        private int Tgh = -1;
        private int ROR = 0;
        private boolean Sf = false;

        public Builder appIcon(int i10) {
            this.f8587ac = i10;
            return this;
        }

        public Builder appId(String str) {
            this.Qhi = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.cJ(this.Qhi);
            pAGConfig.cJ(this.CJ);
            pAGConfig.Qhi(this.f8587ac);
            pAGConfig.fl(this.ROR);
            pAGConfig.cJ(this.Sf);
            pAGConfig.ac(this.f8588fl);
            pAGConfig.CJ(this.Tgh);
            pAGConfig.Qhi(this.cJ);
            pAGConfig.ac(this.WAv);
            pAGConfig.Qhi(this.Gm);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.cJ = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.f8589hm = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i10) {
            this.CJ = i10;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i10) {
            this.Tgh = i10;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i10) {
            this.f8588fl = i10;
            return this;
        }

        public Builder setPackageName(String str) {
            this.WAv = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.Gm = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.Sf = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.ROR = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }
}
