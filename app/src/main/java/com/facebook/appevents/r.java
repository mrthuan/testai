package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEvent;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OperationalData.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> f9657b = t0.h0(new Pair(OperationalDataEnum.IAPParameters, new Pair(ea.a.z("fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"), ea.a.z("fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"))));

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f9658a = new LinkedHashMap();

    /* compiled from: OperationalData.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: OperationalData.kt */
        /* renamed from: com.facebook.appevents.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0143a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9659a;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9659a = iArr;
            }
        }

        public static void a(OperationalDataEnum typeOfParameter, String key, String value, Bundle bundle, r rVar) {
            kotlin.jvm.internal.g.e(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.g.e(key, "key");
            kotlin.jvm.internal.g.e(value, "value");
            int i10 = C0143a.f9659a[d(typeOfParameter, key).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        rVar.a(typeOfParameter, key, value);
                        bundle.putCharSequence(key, value);
                        return;
                    }
                    return;
                }
                rVar.a(typeOfParameter, key, value);
                return;
            }
            bundle.putCharSequence(key, value);
        }

        public static Pair b(OperationalDataEnum typeOfParameter, String str, String str2, Bundle bundle, r rVar) {
            kotlin.jvm.internal.g.e(typeOfParameter, "typeOfParameter");
            int i10 = C0143a.f9659a[d(typeOfParameter, str).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (rVar == null) {
                            rVar = new r();
                        }
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        rVar.a(typeOfParameter, str, str2);
                        bundle.putCharSequence(str, str2);
                    }
                } else {
                    if (rVar == null) {
                        rVar = new r();
                    }
                    rVar.a(typeOfParameter, str, str2);
                }
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(str, str2);
            }
            return new Pair(bundle, rVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object c(com.facebook.appevents.OperationalDataEnum r2, java.lang.String r3, android.os.Bundle r4, com.facebook.appevents.r r5) {
            /*
                java.lang.String r0 = "typeOfParameter"
                kotlin.jvm.internal.g.e(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g.e(r3, r0)
                r0 = 0
                if (r5 == 0) goto L23
                java.util.LinkedHashMap r5 = r5.f9658a
                boolean r1 = r5.containsKey(r2)
                if (r1 != 0) goto L16
                goto L23
            L16:
                java.lang.Object r2 = r5.get(r2)
                java.util.Map r2 = (java.util.Map) r2
                if (r2 == 0) goto L23
                java.lang.Object r2 = r2.get(r3)
                goto L24
            L23:
                r2 = r0
            L24:
                if (r4 == 0) goto L2a
                java.lang.CharSequence r0 = r4.getCharSequence(r3)
            L2a:
                if (r2 != 0) goto L2d
                r2 = r0
            L2d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.r.a.c(com.facebook.appevents.OperationalDataEnum, java.lang.String, android.os.Bundle, com.facebook.appevents.r):java.lang.Object");
        }

        public static ParameterClassification d(OperationalDataEnum typeOfParameter, String parameter) {
            Set<String> set;
            kotlin.jvm.internal.g.e(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.g.e(parameter, "parameter");
            Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> map = r.f9657b;
            Pair<Set<String>, Set<String>> pair = map.get(typeOfParameter);
            Set<String> set2 = null;
            if (pair != null) {
                set = pair.getFirst();
            } else {
                set = null;
            }
            Pair<Set<String>, Set<String>> pair2 = map.get(typeOfParameter);
            if (pair2 != null) {
                set2 = pair2.getSecond();
            }
            if (set != null && set.contains(parameter)) {
                return ParameterClassification.OperationalData;
            }
            if (set2 != null && set2.contains(parameter)) {
                return ParameterClassification.CustomAndOperationalData;
            }
            return ParameterClassification.CustomData;
        }
    }

    public final void a(OperationalDataEnum type, String key, Object value) {
        kotlin.jvm.internal.g.e(type, "type");
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(value, "value");
        try {
            AppEvent.Companion.getClass();
            AppEvent.a.a(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                kotlin.jvm.internal.g.d(format, "format(format, *args)");
                throw new FacebookException(format);
            }
            LinkedHashMap linkedHashMap = this.f9658a;
            if (!linkedHashMap.containsKey(type)) {
                linkedHashMap.put(type, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }
}
