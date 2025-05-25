package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1646h {
    public static final String CLICK_BEACON = "click";
    public static final C1618f Companion = new C1618f();
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = "h";
    public static final String WIN_BEACON = "win_beacon";
    private final String adAuctionMeta;
    private JSONObject adContent;
    private final tf.c adMetaInfo$delegate;
    private AdQualityControl adQualityControl;
    private String adType;
    private final boolean allowAutoRedirection;
    private JSONArray assetUrls;
    private final JSONObject contextData;
    @InterfaceC1595d4
    private Z features;
    private final String impressionId;
    private boolean isPreloadWebView;
    private JSONArray landingPageParams;
    private long mExpiryDurationInMillis;
    private long mInsertionTimestampInMillis;
    private String markupType;
    private final JSONObject metaInfo;
    private String pubContent;

    /* renamed from: sf  reason: collision with root package name */
    private String f15113sf;
    private final JSONArray trackers;
    private final JSONObject transaction;
    private String webVast;

    public C1646h() {
        this.webVast = "";
        this.impressionId = "";
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = kotlin.a.a(new C1632g(this));
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    public final String A() {
        return this.f15113sf;
    }

    public final Boolean C() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean("enabled"));
        }
        return null;
    }

    public final JSONArray D() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optJSONArray("trackingEvents");
        }
        return null;
    }

    public final JSONObject E() {
        return this.transaction;
    }

    public final String F() {
        return this.webVast;
    }

    public final boolean G() {
        return this.isPreloadWebView;
    }

    public final void a(JSONArray jSONArray) {
        this.assetUrls = jSONArray;
    }

    public final String b() {
        return this.adAuctionMeta;
    }

    public final JSONObject c() {
        return this.adContent;
    }

    public final void d(String str) {
        this.f15113sf = str;
    }

    public final void e(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
        this.webVast = str;
    }

    public final String f() {
        return this.adType;
    }

    public final String h() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("advertisedContent", null);
    }

    public final boolean i() {
        return this.allowAutoRedirection;
    }

    public final Long j() {
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject == null || !jSONObject.has("asPlcId")) {
                return null;
            }
            return Long.valueOf(jSONObject.getLong("asPlcId"));
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        return null;
    }

    public final JSONArray k() {
        return this.assetUrls;
    }

    public final String l() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("baseEventUrl", null);
    }

    public final Long m() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("bidderId"));
        }
        return null;
    }

    public final int n() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optInt("casAdTypeId", -1);
    }

    public final String o() {
        String str;
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            str = jSONObject.optString("creativeId");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String p() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("creativeType", null);
    }

    public final Z q() {
        return this.features;
    }

    public final String s() {
        return this.impressionId;
    }

    public final String t() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.metaInfo;
        if (jSONObject2 == null) {
            return "DEFAULT";
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("landingPageParams");
        this.landingPageParams = optJSONArray;
        if (optJSONArray == null) {
            return "DEFAULT";
        }
        Object opt = optJSONArray.opt(0);
        if (opt instanceof JSONObject) {
            jSONObject = (JSONObject) opt;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return "DEFAULT";
        }
        String optString = jSONObject.optString("openMode", "DEFAULT");
        kotlin.jvm.internal.g.d(optString, "optString(...)");
        return optString;
    }

    public final String u() {
        return this.markupType;
    }

    public final String w() {
        String str;
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            str = jSONObject.optString("telemetryMetadataBlob");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String x() {
        return this.pubContent;
    }

    public final Set<C1894z9> y() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = this.assetUrls;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i10));
                    byte b10 = (byte) jSONObject.getInt("type");
                    String optString = jSONObject.optString(InMobiNetworkValues.URL);
                    kotlin.jvm.internal.g.b(optString);
                    if (optString.length() > 0) {
                        hashSet.add(new C1894z9(b10, optString));
                    }
                }
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        return hashSet;
    }

    public final Map<String, String> z() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("pubContent");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                Companion.getClass();
                if (!jSONObject.has("rewards")) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("rewards");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = optJSONObject.getString(next);
                        kotlin.jvm.internal.g.b(next);
                        kotlin.jvm.internal.g.b(string);
                        hashMap.put(next, string);
                    }
                }
                return hashMap;
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        return null;
    }

    public final void a(boolean z10) {
        this.isPreloadWebView = z10;
    }

    public final void b(String str) {
        try {
            this.transaction.put(C1577c0.CTX_HASH_KEY, str);
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
    }

    public final List<String> c(String type) {
        JSONArray optJSONArray;
        kotlin.jvm.internal.g.e(type, "type");
        if (this.trackers == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int length = this.trackers.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject jSONObject = this.trackers.getJSONObject(i10);
                if (kotlin.jvm.internal.g.a(type, jSONObject.optString("type")) && (optJSONArray = jSONObject.optJSONArray(InMobiNetworkValues.URL)) != null) {
                    int length2 = optJSONArray.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        linkedList.add(optJSONArray.getString(i11));
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final AdMetaInfo d() {
        return (AdMetaInfo) this.adMetaInfo$delegate.getValue();
    }

    public final AdQualityControl e() {
        return this.adQualityControl;
    }

    public final void f(String pubContent) {
        kotlin.jvm.internal.g.e(pubContent, "pubContent");
        if (kotlin.jvm.internal.g.a("inmobiJson", this.markupType)) {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("pubContent", new JSONObject(pubContent));
            }
        } else {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject2.put("pubContent", pubContent);
            }
        }
        this.pubContent = pubContent;
    }

    public final void a(Z z10) {
        this.features = z10;
    }

    public final void a() {
        if (!kotlin.jvm.internal.g.a(this.markupType, "unknown")) {
            if (this.impressionId.length() != 0) {
                return;
            }
            String TAG2 = TAG;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            Z5.a((byte) 1, TAG2, "Impression Id is Null");
            throw new IllegalArgumentException("Invalid Ad");
        }
        String TAG3 = TAG;
        kotlin.jvm.internal.g.d(TAG3, "TAG");
        Z5.a((byte) 1, TAG3, "UnKnown MarkUp Type");
        throw new IllegalArgumentException("Invalid Ad");
    }

    public C1646h(C1646h ad2, JSONArray jSONArray) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        this.webVast = "";
        this.impressionId = "";
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = kotlin.a.a(new C1632g(this));
        C1708l5.b(ad2, this);
        this.assetUrls = jSONArray;
    }

    public final void a(JSONObject jSONObject, String str, long j10) {
        this.adContent = jSONObject;
        this.adType = str;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
        this.mExpiryDurationInMillis = j10;
        String str2 = this.f15113sf;
        if (str2 != null) {
            if (!AbstractC1579c2.a(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                this.features = new Z(str2);
            }
        }
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v() {
    }

    public final boolean a(long j10) {
        long currentTimeMillis;
        long j11 = this.mExpiryDurationInMillis;
        long j12 = INVALID_AD_EXPIRY;
        int i10 = (j11 > INVALID_AD_EXPIRY ? 1 : (j11 == INVALID_AD_EXPIRY ? 0 : -1));
        if ((i10 == 0 ? -1L : this.mInsertionTimestampInMillis + j11) == INVALID_AD_EXPIRY) {
            currentTimeMillis = (TimeUnit.SECONDS.toMillis(j10) + this.mInsertionTimestampInMillis) - System.currentTimeMillis();
        } else {
            if (i10 != 0) {
                j12 = this.mInsertionTimestampInMillis + j11;
            }
            currentTimeMillis = j12 - System.currentTimeMillis();
        }
        return currentTimeMillis < 0;
    }

    public final void a(String buyerPrice) {
        kotlin.jvm.internal.g.e(buyerPrice, "buyerPrice");
        try {
            this.transaction.put(C1577c0.BUYER_PRICE, Double.parseDouble(buyerPrice));
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str = this.pubContent;
                kotlin.jvm.internal.g.b(next);
                String string = jSONObject.getString(next);
                kotlin.jvm.internal.g.d(string, "getString(...)");
                this.pubContent = kotlin.text.j.K(str, next, string);
            }
        }
        f(this.pubContent);
    }
}
