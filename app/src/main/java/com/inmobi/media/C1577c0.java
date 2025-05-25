package com.inmobi.media;

import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1577c0 {
    public static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    public static final C1563b0 Companion = new C1563b0();
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = "c0";
    private final String adSetAuctionMeta;
    private String adType;
    private final boolean isPod;
    private Boolean isRewarded;
    private boolean logEnabled;
    private JSONObject macros;
    private long placementId;
    private final String adSetId = "";
    private String requestId = "";
    private boolean isAuctionClosed = true;
    private String transactionID = "";
    private final LinkedList<C1646h> ads = new LinkedList<>();

    public final String c() {
        return this.adSetId;
    }

    public final String d() {
        return this.adType;
    }

    public final LinkedList<C1646h> f() {
        return this.ads;
    }

    public final boolean g() {
        return this.logEnabled;
    }

    public final JSONObject h() {
        return this.macros;
    }

    public final C1646h i() {
        try {
            if (!this.ads.isEmpty()) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        return p();
    }

    public final long j() {
        return this.placementId;
    }

    public final String k() {
        return this.requestId;
    }

    public final String l() {
        return this.transactionID;
    }

    public final boolean m() {
        return this.isAuctionClosed;
    }

    public final boolean n() {
        return this.isPod;
    }

    public final Boolean o() {
        return this.isRewarded;
    }

    public final C1646h p() {
        if (!this.ads.isEmpty()) {
            return this.ads.getFirst();
        }
        return null;
    }

    public final String b() {
        return this.adSetAuctionMeta;
    }

    public final void a(Boolean bool) {
        this.isRewarded = bool;
    }

    public final void a(JSONObject responseJson, AdConfig adConfig, A4 a42) {
        C1646h c1646h;
        kotlin.jvm.internal.g.e(responseJson, "responseJson");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        if (!this.isAuctionClosed) {
            String string = responseJson.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = responseJson.getJSONArray(KEY_ADS);
            if (kotlin.jvm.internal.g.a(this.requestId, string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject.getString(KEY_IMPRESSION_ID);
                        this.macros = jSONObject.optJSONObject(KEY_MACROS);
                        kotlin.jvm.internal.g.b(string2);
                        Iterator<T> it = this.ads.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c1646h = null;
                                break;
                            }
                            c1646h = (C1646h) it.next();
                            if (kotlin.jvm.internal.g.a(string2, c1646h.s())) {
                                break;
                            }
                        }
                        if (c1646h != null) {
                            c1646h.a(this.macros);
                            try {
                                c1646h = AbstractC1832v.a(c1646h, adConfig, a42);
                            } catch (VastException unused) {
                            }
                            if (c1646h != null) {
                                JSONObject jSONObject2 = this.macros;
                                if (jSONObject2 != null) {
                                    if (jSONObject2.has(MACRO_ADV_PRICE)) {
                                        String string3 = jSONObject2.getString(MACRO_ADV_PRICE);
                                        kotlin.jvm.internal.g.d(string3, "getString(...)");
                                        c1646h.a(string3);
                                    }
                                    if (jSONObject2.has(MACRO_CTX_HASH)) {
                                        c1646h.b(jSONObject2.getString(MACRO_CTX_HASH));
                                    }
                                }
                                linkedList.add(c1646h);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render".toString());
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads".toString());
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId".toString());
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response".toString());
    }

    public static /* synthetic */ void e() {
    }

    public final void a(AdConfig adConfig, InterfaceC1645gc interfaceC1645gc, A4 a42) {
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        C1646h p10 = p();
        if (p10 != null) {
            C1631fc.a(p10, adConfig, interfaceC1645gc, a42);
        }
    }

    public final void a(C1646h ad2) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        try {
            if (p() != null) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        this.ads.addFirst(ad2);
    }
}
