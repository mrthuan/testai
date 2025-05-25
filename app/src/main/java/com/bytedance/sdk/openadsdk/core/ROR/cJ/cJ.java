package com.bytedance.sdk.openadsdk.core.ROR.cJ;

import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import org.json.JSONObject;

/* compiled from: VastFractionalProgressTracker.java */
/* loaded from: classes.dex */
public class cJ extends ac implements Comparable<cJ> {
    private final float Qhi;

    /* compiled from: VastFractionalProgressTracker.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private final String Qhi;
        private final float cJ;

        /* renamed from: ac  reason: collision with root package name */
        private ac.EnumC0115ac f8978ac = ac.EnumC0115ac.TRACKING_URL;
        private boolean CJ = false;

        public Qhi(String str, float f10) {
            this.Qhi = str;
            this.cJ = f10;
        }

        public cJ Qhi() {
            return new cJ(this.cJ, this.Qhi, this.f8978ac, Boolean.valueOf(this.CJ));
        }
    }

    public boolean Qhi(float f10) {
        return this.Qhi <= f10 && !fl();
    }

    public JSONObject cJ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", ac());
        jSONObject.put("trackingFraction", this.Qhi);
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.cJ.ac
    public void k_() {
        super.k_();
    }

    private cJ(float f10, String str, ac.EnumC0115ac enumC0115ac, Boolean bool) {
        super(str, enumC0115ac, bool);
        this.Qhi = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(cJ cJVar) {
        if (cJVar != null) {
            float f10 = this.Qhi;
            float f11 = cJVar.Qhi;
            if (f10 > f11) {
                return 1;
            }
            return f10 < f11 ? -1 : 0;
        }
        return 1;
    }
}
