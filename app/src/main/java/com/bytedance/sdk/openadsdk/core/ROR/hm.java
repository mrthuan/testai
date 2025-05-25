package com.bytedance.sdk.openadsdk.core.ROR;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ABk;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: ViewabilityTrackerFactory.java */
/* loaded from: classes.dex */
public class hm {
    public static Sf Qhi(View view, Set<Gm> set) {
        AdSession Qhi = Qhi(CreativeType.VIDEO, set, Owner.NATIVE);
        return new WAv(Qhi, AdEvents.createAdEvents(Qhi), view, MediaEvents.createMediaEvents(Qhi));
    }

    public static Sf Qhi(WebView webView) {
        Partner Qhi = Tgh.Qhi();
        if (Qhi != null) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Qhi, webView, "", ""));
            return new Sf(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession Qhi(CreativeType creativeType, Set<Gm> set, Owner owner) {
        List<VerificationScriptResource> Qhi = Qhi(set);
        if (Qhi.isEmpty()) {
            ABk.cJ("verificationScriptResources is empty");
        }
        Partner Qhi2 = Tgh.Qhi();
        if (Qhi2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(Qhi2, Tgh.cJ(), Qhi, "", ""));
    }

    private static List<VerificationScriptResource> Qhi(Set<Gm> set) {
        ArrayList arrayList = new ArrayList();
        for (Gm gm2 : set) {
            if (!TextUtils.isEmpty(gm2.Qhi()) && !TextUtils.isEmpty(gm2.cJ())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(gm2.Qhi(), gm2.ac(), gm2.cJ()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(gm2.ac()));
        }
        return arrayList;
    }
}
