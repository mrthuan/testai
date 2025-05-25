package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.u2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1822u2 extends G8 {
    public final int A;
    public final String B;

    /* renamed from: y  reason: collision with root package name */
    public final Map f15487y;

    /* renamed from: z  reason: collision with root package name */
    public final int f15488z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1822u2(java.util.Map r12, com.inmobi.media.Ib r13, java.lang.String r14, int r15, int r16, boolean r17, java.lang.String r18) {
        /*
            r11 = this;
            r8 = r11
            r9 = r12
            r10 = r18
            java.lang.String r0 = "requestedConfigMap"
            kotlin.jvm.internal.g.e(r12, r0)
            java.lang.String r0 = "uidMap"
            r3 = r13
            kotlin.jvm.internal.g.e(r13, r0)
            java.lang.String r0 = "url"
            r1 = r14
            kotlin.jvm.internal.g.e(r14, r0)
            java.lang.String r0 = "accountId"
            kotlin.jvm.internal.g.e(r10, r0)
            java.lang.String r2 = "POST"
            java.lang.String r0 = "root"
            java.lang.Object r0 = r12.get(r0)
            if (r0 == 0) goto L25
            goto L33
        L25:
            java.lang.CharSequence r0 = kotlin.text.k.n0(r14)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 != 0) goto L37
        L33:
            java.lang.String r0 = "https://config.inmobi.com/config-server/v1/config/secure.cfg"
            r4 = r0
            goto L38
        L37:
            r4 = r1
        L38:
            r5 = 0
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r7 = 64
            r0 = r11
            r1 = r2
            r2 = r4
            r3 = r13
            r4 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f15487y = r9
            r0 = r15
            r8.f15488z = r0
            r0 = r16
            r8.A = r0
            r8.B = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1822u2.<init>(java.util.Map, com.inmobi.media.Ib, java.lang.String, int, int, boolean, java.lang.String):void");
    }

    @Override // com.inmobi.media.G8
    public final void f() {
        String str;
        this.f14294u = false;
        super.f();
        HashMap hashMap = this.f14284k;
        if (hashMap != null) {
            C1758p2 c1758p2 = new C1758p2();
            try {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry entry : this.f15487y.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", entry.getKey());
                    jSONObject.put("t", c1758p2.a((String) entry.getKey(), ((Config) entry.getValue()).getAccountId$media_release()));
                    jSONArray.put(jSONObject);
                }
                str = jSONArray.toString();
                kotlin.jvm.internal.g.d(str, "toString(...)");
            } catch (JSONException unused) {
                str = "";
            }
            String str2 = (String) hashMap.put("p", str);
        }
        HashMap hashMap2 = this.f14284k;
        if (hashMap2 != null) {
            String str3 = (String) hashMap2.put("im-accid", this.B);
        }
    }
}
