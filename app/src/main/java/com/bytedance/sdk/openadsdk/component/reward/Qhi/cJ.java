package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.model.MQ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: RewardFullDataManager.java */
/* loaded from: classes.dex */
public class cJ {
    private static final SparseArray<WeakReference<tP>> Qhi = new SparseArray<>();

    public static void Qhi(Qhi qhi, Intent intent, Bundle bundle) {
        Qhi(intent, qhi);
        Qhi(bundle, qhi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.bytedance.sdk.openadsdk.core.model.tP] */
    public static tP Qhi(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            com.bytedance.sdk.openadsdk.core.model.Qhi ROR = Dww.Qhi().ROR();
            r3 = ROR != null ? new MQ(ROR) : null;
            if (cJVar != null) {
                cJVar.Qhi(bundle);
            }
            Dww.Qhi().Tgh();
        } else if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    r3 = new MQ(com.bytedance.sdk.openadsdk.core.model.Qhi.cJ(new JSONObject(stringExtra)));
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFDM", "", e10);
            }
        }
        if (bundle != null) {
            try {
                WeakReference<tP> weakReference = Qhi.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    r3 = weakReference.get();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFDM", "", th2);
            }
        }
        if (r3 != null) {
            r3.Qhi(r3.HzH(), 7);
        }
        return r3;
    }

    public static void Qhi(Intent intent, Qhi qhi) {
        if (intent == null) {
            return;
        }
        qhi.bxS.ac(intent.getBooleanExtra("video_is_cached", false));
        qhi.MND = intent.getStringExtra("multi_process_listener_key");
        qhi.dVA = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void Qhi(Bundle bundle, Qhi qhi) {
        if (bundle == null) {
            return;
        }
        qhi.MND = bundle.getString("multi_process_listener_key");
        qhi.bxS.ac(bundle.getBoolean("video_is_cached", false));
        qhi.dIT = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            qhi.bxS.Qhi(bundle.getLong("video_current", 0L));
        }
        qhi.Qhi(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void Qhi(Qhi qhi, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            tP tPVar = qhi.cJ;
            Qhi.append(tPVar.hashCode(), new WeakReference<>(tPVar));
            bundle.putInt("meta_tmp", tPVar.hashCode());
            bundle.putString("multi_process_listener_key", qhi.MND);
            bundle.putBoolean("video_is_cached", qhi.bxS.Dww());
            bundle.putLong("video_current", qhi.bxS.ROR());
            bundle.putBoolean("is_mute", qhi.dIT);
            bundle.putBoolean("has_show_skip_btn", qhi.zjb);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi(android.content.Intent r2, android.app.Activity r3, boolean r4, com.bytedance.sdk.openadsdk.core.model.Qhi r5, java.lang.String r6) {
        /*
            if (r3 != 0) goto L8
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            goto L1d
        L8:
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L15
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L15
            int r3 = r3.getRotation()     // Catch: java.lang.Exception -> L15
            goto L1e
        L15:
            r3 = move-exception
            java.lang.String r0 = "TTAD.RFDM"
            java.lang.String r1 = ""
            com.bytedance.sdk.component.utils.ABk.Qhi(r0, r1, r3)
        L1d:
            r3 = 0
        L1e:
            java.lang.String r0 = "orientation_angle"
            r2.putExtra(r0, r3)
            java.lang.String r3 = "video_is_cached"
            r2.putExtra(r3, r4)
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.cJ.ac()
            if (r3 == 0) goto L49
            org.json.JSONObject r3 = r5.zc()
            if (r3 != 0) goto L3a
            java.lang.String r2 = "toJsonObj return null"
            com.bytedance.sdk.component.utils.ABk.cJ(r2)
            return
        L3a:
            java.lang.String r4 = "multi_process_ad_info"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r4, r3)
            java.lang.String r3 = "multi_process_listener_key"
            r2.putExtra(r3, r6)
            return
        L49:
            com.bytedance.sdk.openadsdk.core.Dww r2 = com.bytedance.sdk.openadsdk.core.Dww.Qhi()
            r2.Tgh()
            com.bytedance.sdk.openadsdk.core.Dww r2 = com.bytedance.sdk.openadsdk.core.Dww.Qhi()
            r2.Qhi(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(android.content.Intent, android.app.Activity, boolean, com.bytedance.sdk.openadsdk.core.model.Qhi, java.lang.String):void");
    }
}
