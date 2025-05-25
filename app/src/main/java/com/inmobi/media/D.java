package com.inmobi.media;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class D extends G8 {
    public static String E;
    public String A;
    public String B;
    public String C;
    public Map D;

    /* renamed from: y  reason: collision with root package name */
    public final J f14176y;

    /* renamed from: z  reason: collision with root package name */
    public final M8 f14177z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D(java.lang.String r12, com.inmobi.media.Ib r13, java.lang.String r14, com.inmobi.media.J r15, com.inmobi.media.M8 r16, com.inmobi.media.A4 r17, boolean r18) {
        /*
            r11 = this;
            r8 = r11
            r9 = r14
            r10 = r15
            java.lang.String r0 = "adPlacement"
            kotlin.jvm.internal.g.e(r15, r0)
            java.lang.String r1 = "POST"
            java.lang.String r0 = com.inmobi.media.D.E
            if (r0 != 0) goto L10
            r2 = r12
            goto L15
        L10:
            com.inmobi.media.D.E = r0
            tf.d r2 = tf.d.f30009a
            r2 = r0
        L15:
            r4 = 0
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r0 = r11
            r3 = r13
            r5 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f14176y = r10
            r0 = r16
            r8.f14177z = r0
            java.lang.String r0 = "json"
            r8.A = r0
            java.lang.String r0 = com.inmobi.media.Ha.b()
            r8.f14286m = r0
            java.util.HashMap r0 = r8.f14284k
            if (r0 == 0) goto L5f
            java.util.HashMap r1 = com.inmobi.media.AbstractC1692k3.c()
            r0.putAll(r1)
            java.lang.String r1 = com.inmobi.media.I0.f14335b
            if (r1 == 0) goto L48
            java.lang.String r2 = "u-appIS"
            java.lang.Object r1 = r0.put(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
        L48:
            java.lang.String r1 = r15.d()
            java.lang.String r2 = "client-request-id"
            r0.put(r2, r1)
            if (r9 == 0) goto L58
            java.lang.String r1 = "u-appcache"
            r0.put(r1, r14)
        L58:
            java.lang.String r1 = "sdk-flavor"
            java.lang.String r2 = "row"
            r0.put(r1, r2)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.D.<init>(java.lang.String, com.inmobi.media.Ib, java.lang.String, com.inmobi.media.J, com.inmobi.media.M8, com.inmobi.media.A4, boolean):void");
    }

    public static JSONObject a(String adType) {
        kotlin.jvm.internal.g.e(adType, "adType");
        if (kotlin.jvm.internal.g.a(adType, "banner")) {
            return C1850w4.c.a();
        }
        if (kotlin.jvm.internal.g.a("audio", adType)) {
            C1798s4 c1798s4 = C1798s4.c;
            JSONObject jSONObject = new JSONObject();
            long j10 = c1798s4.f15548a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
            }
            int i10 = c1798s4.f15549b;
            if (i10 > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i10));
            }
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                int i11 = AbstractC1838v5.a(d10, "audio_pref_file").f15579a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i11));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    @Override // com.inmobi.media.G8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.D.f():void");
    }
}
