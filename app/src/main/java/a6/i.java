package a6;

import android.os.Bundle;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.r;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: InAppPurchaseDedupeConfig.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f77a = ge.a.H("fb_currency");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f78b = ge.a.H("_valueToSum");
    public static final long c = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: d  reason: collision with root package name */
    public static final List<Pair<String, List<String>>> f79d = ge.a.I(new Pair("fb_iap_product_id", ge.a.H("fb_iap_product_id")), new Pair("fb_iap_product_description", ge.a.H("fb_iap_product_description")), new Pair("fb_iap_product_title", ge.a.H("fb_iap_product_title")), new Pair("fb_iap_purchase_token", ge.a.H("fb_iap_purchase_token")));

    public static Pair a(Bundle bundle, Bundle bundle2, r rVar) {
        if (bundle == null) {
            return new Pair(bundle2, rVar);
        }
        try {
            for (String key : bundle.keySet()) {
                String string = bundle.getString(key);
                if (string != null) {
                    Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> map = r.f9657b;
                    OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                    kotlin.jvm.internal.g.d(key, "key");
                    Pair b10 = r.a.b(operationalDataEnum, key, string, bundle2, rVar);
                    Bundle bundle3 = (Bundle) b10.component1();
                    rVar = (r) b10.component2();
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, rVar);
    }

    public static List b(boolean z10) {
        List<Pair<String, List<String>>> list;
        com.facebook.internal.f b10 = FetchedAppSettingsManager.b(com.facebook.d.b());
        if (b10 != null) {
            list = b10.f9785u;
        } else {
            list = null;
        }
        if (list != null && !b10.f9785u.isEmpty()) {
            List<Pair<String, List<String>>> list2 = b10.f9785u;
            if (!z10) {
                return list2;
            }
            ArrayList arrayList = new ArrayList();
            for (Pair<String, List<String>> pair : list2) {
                for (String str : pair.getSecond()) {
                    arrayList.add(new Pair(str, ge.a.H(pair.getFirst())));
                }
            }
            return arrayList;
        }
        return f79d;
    }

    public static List c(boolean z10) {
        boolean z11;
        com.facebook.internal.f b10 = FetchedAppSettingsManager.b(com.facebook.d.b());
        if (b10 == null) {
            return null;
        }
        List<Pair<String, List<String>>> list = b10.f9786v;
        List<Pair<String, List<String>>> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        if (!z10) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : list) {
            for (String str : pair.getSecond()) {
                arrayList.add(new Pair(str, ge.a.H(pair.getFirst())));
            }
        }
        return arrayList;
    }
}
