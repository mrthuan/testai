package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;

/* renamed from: com.inmobi.media.b9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1572b9 extends AbstractC1558a9 {

    /* renamed from: b  reason: collision with root package name */
    public Partner f14968b = Partner.createPartner("Inmobi", "a".concat(kotlin.text.j.K("10.7.8", ".", "")));

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r6 != null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.commons.core.configs.AdConfig r6) {
        /*
            r5 = this;
            java.lang.String r0 = "a"
            if (r6 == 0) goto L10
            com.inmobi.commons.core.configs.AdConfig$ViewabilityConfig r6 = r6.getViewability()     // Catch: java.lang.Exception -> L31
            if (r6 == 0) goto L10
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r6 = r6.getOmidConfig()     // Catch: java.lang.Exception -> L31
            if (r6 != 0) goto L15
        L10:
            com.inmobi.commons.core.configs.AdConfig$OmidConfig r6 = new com.inmobi.commons.core.configs.AdConfig$OmidConfig     // Catch: java.lang.Exception -> L31
            r6.<init>()     // Catch: java.lang.Exception -> L31
        L15:
            java.lang.String r1 = r6.getPartnerKey()     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "10.7.8"
            java.lang.String r3 = "."
            java.lang.String r4 = ""
            java.lang.String r2 = kotlin.text.j.K(r2, r3, r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Exception -> L31
            com.iab.omid.library.inmobi.adsession.Partner r0 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r1, r0)     // Catch: java.lang.Exception -> L31
            r5.f14968b = r0     // Catch: java.lang.Exception -> L31
            com.inmobi.media.V8.a(r6)     // Catch: java.lang.Exception -> L31
            goto L3f
        L31:
            r6 = move-exception
            com.inmobi.media.Q4 r0 = com.inmobi.media.Q4.f14590a
            java.lang.String r0 = "event"
            com.inmobi.media.J1 r6 = com.inmobi.media.AbstractC1863x4.a(r6, r0)
            com.inmobi.media.y5 r0 = com.inmobi.media.Q4.c
            r0.a(r6)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1572b9.a(com.inmobi.commons.core.configs.AdConfig):void");
    }
}
