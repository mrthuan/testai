package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Gm;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.inmobi.media.C1646h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: IPMiEventWatcher.java */
/* loaded from: classes.dex */
public class ABk implements com.bytedance.sdk.openadsdk.oem.Qhi {
    private static final ABk Qhi = new ABk();

    /* renamed from: ac  reason: collision with root package name */
    private static boolean f9356ac;
    private static com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi cJ;

    public static void Qhi(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        com.bytedance.sdk.openadsdk.core.model.EBS NLs = qhi.cJ.NLs();
        if (NLs == null || !NLs.Qhi()) {
            return;
        }
        cJ = qhi;
        IPMiBroadcastReceiver Qhi2 = IPMiBroadcastReceiver.Qhi(qhi.f8800ip);
        if (Qhi2 != null) {
            Qhi2.Qhi(Qhi);
        }
    }

    public static void cJ() {
        f9356ac = true;
    }

    public static void Qhi() {
        if (cJ == null) {
            return;
        }
        cJ = null;
        IPMiBroadcastReceiver Qhi2 = IPMiBroadcastReceiver.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        if (Qhi2 != null) {
            Qhi2.Qhi();
        }
        f9356ac = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.Qhi
    public void Qhi(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.ac pv;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = cJ;
        if (qhi == null || (pv = qhi.cJ.pv()) == null) {
            return;
        }
        String ac2 = pv.ac();
        if (TextUtils.isEmpty(ac2) || !ac2.equals(str)) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ABk.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                boolean z10;
                if (ABk.cJ != null && (i11 = i10) > 0 && i11 <= 5) {
                    boolean z11 = true;
                    if (i11 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (ABk.f9356ac) {
                        ABk.cJ.PAe.CJ();
                        HashMap hashMap = new HashMap();
                        hashMap.put("click_scence", 4);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(C1646h.CLICK_BEACON, ABk.cJ.cJ, new Gm.Qhi().Qhi(), ABk.cJ.f8798fl, true, (Map<String, Object>) hashMap, 1);
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        ABk.Qhi();
                    }
                }
            }
        });
    }
}
