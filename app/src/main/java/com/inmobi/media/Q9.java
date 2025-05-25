package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Q9 implements Y0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S9 f14602a;

    public Q9(S9 s92) {
        this.f14602a = s92;
    }

    @Override // com.inmobi.media.Y0
    public final void a(C1688k assetBatch, byte b10) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        if (assetBatch.c == null || assetBatch.f15245g.size() <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InMobiNetworkValues.URL, ((C1674j) assetBatch.f15245g.get(0)).f15197b);
            jSONObject.put("reason", (int) ((C1674j) assetBatch.f15245g.get(0)).f15206l);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        String str = "sendSaveContentResult(\"saveContent_" + assetBatch.f15244f + "\", 'failed', \"" + kotlin.text.j.K(jSONObject2, OperatorName.SHOW_TEXT_LINE_AND_SPACE, "\\\"") + "\");";
        A4 a42 = this.f14602a.f14665j;
        if (a42 != null) {
            String str2 = S9.O0;
            ((B4) a42).b(str2, AbstractC1890z5.a(str2, "access$getTAG$cp(...)", "Failure injection ", str));
        }
        this.f14602a.a(assetBatch.c, str);
    }

    @Override // com.inmobi.media.Y0
    public final void a(C1688k assetBatch) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        if (assetBatch.c == null || assetBatch.f15245g.size() <= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("sendSaveContentResult(\"saveContent_");
        sb2.append(assetBatch.f15244f);
        sb2.append("\", 'success', \"");
        String g10 = androidx.activity.r.g(sb2, ((C1674j) assetBatch.f15245g.get(0)).f15204j, "\");");
        A4 a42 = this.f14602a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            ((B4) a42).a(str, AbstractC1890z5.a(str, "access$getTAG$cp(...)", "Success injection ", g10));
        }
        this.f14602a.a(assetBatch.c, g10);
    }
}
