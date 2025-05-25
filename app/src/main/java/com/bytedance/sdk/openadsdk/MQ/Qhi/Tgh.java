package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PAGMrcTrackerManager.java */
/* loaded from: classes.dex */
public class Tgh {
    private static final Map<Integer, cJ> Qhi = new ConcurrentHashMap();

    /* compiled from: PAGMrcTrackerManager.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public int Qhi;
        public int cJ = -1;

        public Qhi(int i10) {
            this.Qhi = i10;
        }
    }

    public static void Qhi(View view, tP tPVar, Qhi qhi) {
        if (view == null || tPVar == null || tPVar.HWc()) {
            return;
        }
        boolean ac2 = ac(tPVar);
        if (bxS.cJ(tPVar) && qhi != null) {
            qhi.Qhi = -1;
        }
        Qhi(Qhi(view, tPVar, ac2, qhi));
    }

    private static boolean ac(tP tPVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (tPVar == null) {
            return false;
        }
        String Qhi2 = js.Qhi(tPVar);
        if (!"open_ad".equals(Qhi2) && !"fullscreen_interstitial_ad".equals(Qhi2) && !"rewarded_video".equals(Qhi2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && !bxS.cJ(tPVar)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && tPVar.hpZ() != 5) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && tPVar.hpZ() != 33) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 || !tP.fl(tPVar) || tPVar.FQ() == null) {
            return false;
        }
        return true;
    }

    public static void cJ(Integer num) {
        Qhi.remove(num);
    }

    public static Integer cJ(tP tPVar) {
        return Integer.valueOf((tPVar.jWV() + tPVar.HLI()).hashCode());
    }

    private static cJ Qhi(View view, tP tPVar, boolean z10, Qhi qhi) {
        if (view == null || tPVar == null || tPVar.HLI() == null) {
            return null;
        }
        Integer cJ = cJ(tPVar);
        Map<Integer, cJ> map = Qhi;
        if (map.containsKey(cJ)) {
            cJ cJVar = map.get(cJ);
            if (cJVar != null) {
                cJVar.Qhi(view);
            }
            return cJVar;
        }
        cJ Qhi2 = cJ.Qhi(z10, cJ, view, tPVar, qhi);
        map.put(cJ, Qhi2);
        return Qhi2;
    }

    private static void Qhi(cJ cJVar) {
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi();
    }

    public static void Qhi(tP tPVar, int i10) {
        if (tPVar == null || tPVar.HLI() == null) {
            return;
        }
        Qhi(Qhi.get(cJ(tPVar)), i10);
    }

    public static void Qhi(cJ cJVar, int i10) {
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi(i10);
    }

    public static void Qhi(tP tPVar) {
        if (tPVar == null || tPVar.HLI() == null) {
            return;
        }
        Integer cJ = cJ(tPVar);
        Map<Integer, cJ> map = Qhi;
        cJ cJVar = map.get(cJ);
        if (cJVar != null) {
            cJVar.WAv();
        }
        cJ(cJ);
        if (map.size() <= 0) {
            Sf.Qhi();
        }
    }

    public static cJ Qhi(Integer num) {
        return Qhi.get(num);
    }
}
