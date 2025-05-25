package com.bytedance.sdk.openadsdk.CJ;

import com.bytedance.sdk.openadsdk.HzH.Qhi;
import com.bytedance.sdk.openadsdk.core.ac;
import com.bytedance.sdk.openadsdk.core.iMK;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: FeatureCaculateConfig.java */
/* loaded from: classes.dex */
public class tP {
    private static volatile tP Qhi;
    private boolean ABk;
    private boolean CJ;
    private boolean Gm;
    private int[] ROR;
    private int[] Sf;
    private int[] Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8471ac;
    private boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int[] f8472fl;

    /* renamed from: hm  reason: collision with root package name */
    private int[] f8473hm;
    private boolean hpZ;
    private boolean iMK;
    private int pA;

    /* renamed from: zc  reason: collision with root package name */
    private int[] f8474zc;

    private tP() {
        cJ();
    }

    public int[] ABk() {
        return this.f8473hm;
    }

    public int[] Gm() {
        return this.ROR;
    }

    public boolean HzH() {
        return this.ABk;
    }

    public int[] WAv() {
        return this.Tgh;
    }

    public int[] hm() {
        return this.f8472fl;
    }

    public int[] hpZ() {
        return this.f8474zc;
    }

    public boolean iMK() {
        return this.WAv;
    }

    public boolean pA() {
        return this.Gm;
    }

    public int[] zc() {
        return this.Sf;
    }

    public boolean ROR() {
        return this.f8471ac;
    }

    public boolean Sf() {
        return this.CJ;
    }

    public int CJ() {
        return this.pA;
    }

    public boolean Tgh() {
        return this.cJ;
    }

    public boolean fl() {
        return this.hpZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] ac(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i10] = parseInt;
                if (parseInt > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 != length) {
            int[] iArr2 = new int[i10];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            return iArr2;
        }
        return iArr;
    }

    public void cJ() {
        iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.CJ.tP.1
            @Override // java.lang.Runnable
            public void run() {
                tP.this.iMK = Qhi.Qhi("feature_switch", false);
                if (!tP.this.iMK) {
                    return;
                }
                try {
                    tP.this.pA = Qhi.Qhi("feature_timer_interval", (int) Constants.CP_MAC_ROMAN);
                    tP.this.hpZ = Qhi.Qhi("enable_feature_cids", true);
                    String[] split = Qhi.Qhi("pag_ad_show_cnt", "1,3,5&session").split("&");
                    String[] split2 = Qhi.Qhi("pag_ad_click_cnt", "1,3,5&session").split("&");
                    String[] split3 = Qhi.Qhi("pag_video_play_cnt", "1,3,5&session").split("&");
                    String[] split4 = Qhi.Qhi("pag_dislike_cnt", "1,3,5session").split(",");
                    tP tPVar = tP.this;
                    tPVar.cJ = tPVar.Qhi(split);
                    tP tPVar2 = tP.this;
                    tPVar2.f8471ac = tPVar2.Qhi(split2);
                    tP tPVar3 = tP.this;
                    tPVar3.CJ = tPVar3.Qhi(split3);
                    tP tPVar4 = tP.this;
                    tPVar4.f8472fl = tPVar4.cJ(split);
                    tP tPVar5 = tP.this;
                    tPVar5.Tgh = tPVar5.cJ(split2);
                    tP tPVar6 = tP.this;
                    tPVar6.ROR = tPVar6.cJ(split3);
                    tP tPVar7 = tP.this;
                    tPVar7.f8474zc = tPVar7.ac(split4);
                    String[] split5 = Qhi.Qhi("pag_landingPage_stay_time", "1,3,5&session").split("&");
                    String[] split6 = Qhi.Qhi("pag_video_stay_time", "1,3,5&session").split("&");
                    tP tPVar8 = tP.this;
                    tPVar8.WAv = tPVar8.Qhi(split5);
                    tP tPVar9 = tP.this;
                    tPVar9.Gm = tPVar9.Qhi(split6);
                    tP tPVar10 = tP.this;
                    tPVar10.Sf = tPVar10.cJ(split5);
                    tP tPVar11 = tP.this;
                    tPVar11.f8473hm = tPVar11.cJ(split6);
                    tP.this.ABk = Qhi.Qhi("pag_video_30p_session", true);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] cJ(String[] strArr) {
        return strArr.length > 0 ? ac(strArr[0].split(",")) : new int[0];
    }

    public static tP Qhi() {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = new tP();
                }
            }
        }
        return Qhi;
    }

    public boolean ac() {
        return this.iMK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
