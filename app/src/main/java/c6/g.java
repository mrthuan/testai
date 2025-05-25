package c6;

import android.os.Bundle;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.q;
import com.facebook.appevents.r;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f5608a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final q f5609b = new q(com.facebook.d.a());

    /* compiled from: AutomaticAnalyticsLogger.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final BigDecimal f5610a;

        /* renamed from: b  reason: collision with root package name */
        public final Currency f5611b;
        public final Bundle c;

        /* renamed from: d  reason: collision with root package name */
        public final r f5612d;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle, r rVar) {
            this.f5610a = bigDecimal;
            this.f5611b = currency;
            this.c = bundle;
            this.f5612d = rVar;
        }
    }

    public static final synchronized Bundle a(ArrayList arrayList) {
        Bundle c;
        synchronized (g.class) {
            a aVar = (a) arrayList.get(0);
            c = com.facebook.appevents.iap.g.c(ge.a.H(new a6.a("fb_mobile_purchase", aVar.f5610a.doubleValue(), aVar.f5611b)), System.currentTimeMillis(), true, ge.a.H(new Pair(aVar.c, aVar.f5612d)));
        }
        return c;
    }

    public static a b(String str, Bundle bundle, r rVar, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z10;
        boolean z11;
        if (kotlin.jvm.internal.g.a(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> map = r.f9657b;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            boolean z12 = false;
            String bool = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            kotlin.jvm.internal.g.d(bool, "toString(\n              …      )\n                )");
            r.a.a(operationalDataEnum, "fb_iap_subs_auto_renewing", bool, bundle, rVar);
            String optString = jSONObject2.optString("subscriptionPeriod");
            kotlin.jvm.internal.g.d(optString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            r.a.a(operationalDataEnum, "fb_iap_subs_period", optString, bundle, rVar);
            String optString2 = jSONObject2.optString("freeTrialPeriod");
            kotlin.jvm.internal.g.d(optString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            r.a.a(operationalDataEnum, "fb_free_trial_period", optString2, bundle, rVar);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            kotlin.jvm.internal.g.d(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                r.a.a(operationalDataEnum, "fb_intro_price_cycles", introductoryPriceCycles, bundle, rVar);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            kotlin.jvm.internal.g.d(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                r.a.a(operationalDataEnum, "fb_intro_period", introductoryPricePeriod, bundle, rVar);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            kotlin.jvm.internal.g.d(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                z12 = true;
            }
            if (z12) {
                r.a.a(operationalDataEnum, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle, rVar);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        kotlin.jvm.internal.g.d(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, currency, bundle, rVar);
    }

    public static ArrayList c(String str, Bundle bundle, r rVar, JSONObject jSONObject) {
        int i10 = 0;
        ArrayList arrayList = null;
        if (kotlin.jvm.internal.g.a(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            ArrayList arrayList2 = new ArrayList();
            String str2 = "subscriptionOfferDetails";
            JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            while (i10 < length) {
                JSONObject jSONObject2 = jSONObject.getJSONArray(str2).getJSONObject(i10);
                if (jSONObject2 == null) {
                    return arrayList;
                }
                Bundle bundle2 = new Bundle(bundle);
                r rVar2 = new r();
                LinkedHashMap linkedHashMap = rVar.f9658a;
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    OperationalDataEnum operationalDataEnum = (OperationalDataEnum) it.next();
                    Map map = (Map) linkedHashMap.get(operationalDataEnum);
                    if (map != null) {
                        for (String str3 : map.keySet()) {
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            Iterator it2 = it;
                            Object obj = map.get(str3);
                            if (obj != null) {
                                rVar2.a(operationalDataEnum, str3, obj);
                            }
                            it = it2;
                            linkedHashMap = linkedHashMap2;
                        }
                    }
                    it = it;
                    linkedHashMap = linkedHashMap;
                }
                String basePlanId = jSONObject2.getString("basePlanId");
                Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> map2 = r.f9657b;
                OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
                kotlin.jvm.internal.g.d(basePlanId, "basePlanId");
                r.a.a(operationalDataEnum2, "fb_iap_base_plan", basePlanId, bundle2, rVar2);
                JSONArray jSONArray2 = jSONObject2.getJSONArray("pricingPhases");
                JSONObject jSONObject3 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
                if (jSONObject3 == null) {
                    return null;
                }
                String optString = jSONObject3.optString("billingPeriod");
                kotlin.jvm.internal.g.d(optString, "subscriptionJSON.optStri…IOD\n                    )");
                r.a.a(operationalDataEnum2, "fb_iap_subs_period", optString, bundle2, rVar2);
                if (jSONObject3.has("recurrenceMode") && jSONObject3.getInt("recurrenceMode") != 3) {
                    r.a.a(operationalDataEnum2, "fb_iap_subs_auto_renewing", "true", bundle2, rVar2);
                } else {
                    r.a.a(operationalDataEnum2, "fb_iap_subs_auto_renewing", "false", bundle2, rVar2);
                }
                BigDecimal bigDecimal = new BigDecimal(jSONObject3.getLong("priceAmountMicros") / 1000000.0d);
                Currency currency = Currency.getInstance(jSONObject3.getString("priceCurrencyCode"));
                kotlin.jvm.internal.g.d(currency, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
                arrayList2.add(new a(bigDecimal, currency, bundle2, rVar2));
                i10++;
                str2 = str2;
                arrayList = null;
            }
            return arrayList2;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
        if (jSONObject4 == null) {
            return null;
        }
        BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
        Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
        kotlin.jvm.internal.g.d(currency2, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
        return ge.a.J(new a(bigDecimal2, currency2, bundle, rVar));
    }

    public static final boolean d() {
        com.facebook.internal.f b10 = FetchedAppSettingsManager.b(com.facebook.d.b());
        if (b10 != null && n.c() && b10.f9769e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.lang.String r14, java.lang.String r15, boolean r16, com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.g.e(java.lang.String, java.lang.String, boolean, com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion, boolean):void");
    }
}
