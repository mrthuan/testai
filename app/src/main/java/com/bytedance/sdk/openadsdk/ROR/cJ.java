package com.bytedance.sdk.openadsdk.ROR;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.fl.HzH;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* compiled from: ImageLoaderLogListenerWrapper.java */
/* loaded from: classes.dex */
public class cJ<T> implements HzH<T> {
    private final tP CJ;
    private final long Qhi = SystemClock.elapsedRealtime();

    /* renamed from: ac  reason: collision with root package name */
    private final HzH<T> f8508ac;
    private final String cJ;

    public cJ(tP tPVar, String str, HzH<T> hzH) {
        this.f8508ac = hzH;
        this.CJ = tPVar;
        this.cJ = str;
    }

    @Override // com.bytedance.sdk.component.fl.HzH
    public void Qhi(zc<T> zcVar) {
        HzH<T> hzH = this.f8508ac;
        if (hzH != null) {
            hzH.Qhi(zcVar);
        }
        if (this.CJ != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime() - this.Qhi;
            final int ROR = zcVar.ROR() / 1024;
            final int i10 = zcVar.Tgh() ? 1 : 0;
            com.bytedance.sdk.openadsdk.Gm.ac.Qhi("load_image_success", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.ROR.cJ.1
                @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", elapsedRealtime);
                    jSONObject.put(InMobiNetworkValues.URL, cJ.this.cJ);
                    jSONObject.put("preload_size", ROR);
                    jSONObject.put("local_cache", i10);
                    jSONObject.put("image_mode", cJ.this.CJ.gga());
                    return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("load_image_success").Qhi(cJ.this.CJ.eN()).cJ(jSONObject.toString());
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.fl.HzH
    public void Qhi(final int i10, final String str, Throwable th2) {
        HzH<T> hzH = this.f8508ac;
        if (hzH != null) {
            hzH.Qhi(i10, str, th2);
        }
        tP tPVar = this.CJ;
        if (tPVar == null || TextUtils.isEmpty(js.Qhi(tPVar))) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - this.Qhi;
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("load_image_error", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.ROR.cJ.2
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", elapsedRealtime);
                jSONObject.put(InMobiNetworkValues.URL, cJ.this.cJ);
                jSONObject.put("error_code", i10);
                jSONObject.put("error_message", str);
                jSONObject.put("image_mode", cJ.this.CJ.gga());
                return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("load_image_error").Qhi(cJ.this.CJ.eN()).cJ(jSONObject.toString());
            }
        });
    }
}
