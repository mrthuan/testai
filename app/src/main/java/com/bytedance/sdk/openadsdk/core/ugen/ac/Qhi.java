package com.bytedance.sdk.openadsdk.core.ugen.ac;

import com.bytedance.adsdk.ugeno.core.HzH;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import org.json.JSONObject;

/* compiled from: UGRenderRequest.java */
/* loaded from: classes.dex */
public class Qhi extends iMK {
    private float CJ;
    private JSONObject Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private float f9189ac;
    private HzH cJ;

    /* compiled from: UGRenderRequest.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.ac.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126Qhi extends iMK.Qhi {
        private float CJ;
        private JSONObject Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private float f9190ac;
        private HzH cJ;

        public C0126Qhi cJ(float f10) {
            this.CJ = f10;
            return this;
        }

        public C0126Qhi Qhi(JSONObject jSONObject) {
            this.Qhi = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.cJ.iMK.Qhi
        /* renamed from: cJ */
        public Qhi Qhi() {
            return new Qhi(this);
        }

        public C0126Qhi Qhi(HzH hzH) {
            this.cJ = hzH;
            return this;
        }

        public C0126Qhi Qhi(float f10) {
            this.f9190ac = f10;
            return this;
        }
    }

    public Qhi(C0126Qhi c0126Qhi) {
        super(c0126Qhi);
        this.Qhi = c0126Qhi.Qhi;
        this.cJ = c0126Qhi.cJ;
        this.f9189ac = c0126Qhi.f9190ac;
        this.CJ = c0126Qhi.CJ;
    }

    public float Eh() {
        return this.CJ;
    }

    public HzH NFd() {
        return this.cJ;
    }

    public JSONObject aP() {
        return this.Qhi;
    }

    public float pM() {
        return this.f9189ac;
    }
}
