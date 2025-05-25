package com.inmobi.media;

import java.util.Calendar;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z4 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1554a5 f14903a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14904b = "IncompleteLogFinalizer";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(C1554a5 c1554a5) {
        super(0);
        this.f14903a = c1554a5;
    }

    @Override // cg.a
    public final Object invoke() {
        W4 w42 = this.f14903a.f14933a;
        JSONObject jSONObject = w42.f14782a;
        JSONArray jSONArray = w42.f14783b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.g.d(jSONObject3, "toString(...)");
        AbstractC1611e6.a(this.f14904b, jSONObject3, this.f14903a.f14933a.c.f14592a);
        String str = this.f14903a.f14933a.c.f14592a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Q5 q5 = this.f14903a.f14933a.c;
        AbstractC1882ya.d().b(new Q5(str, timeInMillis, 0, q5.f14594d, true, q5.f14596f));
        return tf.d.f30009a;
    }
}
