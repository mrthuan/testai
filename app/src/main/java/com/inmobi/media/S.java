package com.inmobi.media;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class S extends AbstractC1860x1 {

    /* renamed from: b  reason: collision with root package name */
    public Q f14621b;

    public S() {
        super("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)");
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.g.e(contentValues, "contentValues");
        String asString = contentValues.getAsString("image_location");
        String asString2 = contentValues.getAsString("beacon_url");
        String asString3 = contentValues.getAsString("sdk_model_result");
        String asString4 = contentValues.getAsString("extras");
        if ((asString2 != null && asString2.length() != 0) || (asString != null && asString.length() != 0)) {
            kotlin.jvm.internal.g.b(asString);
            kotlin.jvm.internal.g.b(asString2);
            return new AdQualityResult(asString, asString3, asString2, asString4);
        }
        String asString5 = contentValues.getAsString(FacebookMediationAdapter.KEY_ID);
        kotlin.jvm.internal.g.d(asString5, "getAsString(...)");
        a("id=?", new String[]{asString5});
        return null;
    }

    @Override // com.inmobi.media.AbstractC1860x1
    public final ContentValues b(Object obj) {
        AdQualityResult item = (AdQualityResult) obj;
        kotlin.jvm.internal.g.e(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("image_location", item.getImageLocation());
        String sdkModelResult = item.getSdkModelResult();
        if (sdkModelResult == null) {
            sdkModelResult = "";
        }
        contentValues.put("sdk_model_result", sdkModelResult);
        contentValues.put("beacon_url", item.getBeaconUrl());
        contentValues.put("extras", item.getExtras());
        return contentValues;
    }

    public final void a(AdQualityResult result) {
        kotlin.jvm.internal.g.e(result, "result");
        a((Object) result);
        Q q5 = this.f14621b;
        if (q5 != null) {
            N n10 = (N) q5;
            if (n10.c.get()) {
                n10.c.set(false);
                L l10 = new L(n10);
                ScheduledExecutorService scheduledExecutorService = P.f14562a;
                P.a(new C1576c(l10));
            }
        }
    }
}
