package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.internal.play_billing.zzai;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f6239a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f6240b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6241d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6242e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6243f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6244g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f6245h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f6246i;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f6247a;

        public a(JSONObject jSONObject) {
            jSONObject.optString("formattedPrice");
            jSONObject.optLong("priceAmountMicros");
            jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            this.f6247a = true == optString.isEmpty() ? null : optString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            zzai.zzj(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject != null) {
                optJSONObject.getInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 != null) {
                optJSONObject2.getLong("startTimeMillis");
                optJSONObject2.getLong("endTimeMillis");
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (optJSONObject3 != null) {
                optJSONObject3.getInt("maximumQuantity");
                optJSONObject3.getInt("remainingQuantity");
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (optJSONObject4 != null) {
                optJSONObject4.getLong("preorderReleaseTimeMillis");
                optJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (optJSONObject5 != null) {
                optJSONObject5.getString("rentalPeriod");
                optJSONObject5.optString("rentalExpirationPeriod").isEmpty();
            }
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6248a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6249b;
        public final String c;

        public b(JSONObject jSONObject) {
            jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.f6248a = jSONObject.optString("formattedPrice");
            this.f6249b = jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6250a;

        public c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f6250a = arrayList;
        }
    }

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f6251a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6252b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final c f6253d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f6254e;

        public d(JSONObject jSONObject) {
            this.f6251a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f6252b = true == optString.isEmpty() ? null : optString;
            this.c = jSONObject.getString("offerIdToken");
            this.f6253d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (optJSONObject != null) {
                optJSONObject.getInt("commitmentPaymentsCount");
                optJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString(InMobiNetworkValues.TITLE);
                optJSONObject2.optString(NamingTable.TAG);
                optJSONObject2.optString(InMobiNetworkValues.DESCRIPTION);
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    optJSONObject3.optString("billingPeriod");
                    optJSONObject3.optString("priceCurrencyCode");
                    optJSONObject3.optString("formattedPrice");
                    optJSONObject3.optLong("priceAmountMicros");
                    optJSONObject3.optInt("recurrenceMode");
                    optJSONObject3.optInt("billingCycleCount");
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f6254e = arrayList;
        }
    }

    public h(String str) {
        ArrayList arrayList;
        this.f6239a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6240b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.f6241d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f6242e = jSONObject.optString(InMobiNetworkValues.TITLE);
                jSONObject.optString(NamingTable.TAG);
                jSONObject.optString(InMobiNetworkValues.DESCRIPTION);
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f6243f = jSONObject.optString("skuDetailsToken");
                this.f6244g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new d(optJSONArray.getJSONObject(i10)));
                    }
                    this.f6245h = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f6245h = arrayList;
                }
                JSONObject optJSONObject = this.f6240b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f6240b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new a(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f6246i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new a(optJSONObject));
                    this.f6246i = arrayList3;
                    return;
                } else {
                    this.f6246i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final a a() {
        ArrayList arrayList = this.f6246i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (a) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return TextUtils.equals(this.f6239a, ((h) obj).f6239a);
    }

    public final int hashCode() {
        return this.f6239a.hashCode();
    }

    public final String toString() {
        String obj = this.f6240b.toString();
        String valueOf = String.valueOf(this.f6245h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a6.h.l(sb2, this.f6239a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.c);
        sb2.append("', productType='");
        sb2.append(this.f6241d);
        sb2.append("', title='");
        sb2.append(this.f6242e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f6243f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
