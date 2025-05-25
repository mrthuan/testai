package com.facebook.appevents.integrity;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.a;
import kotlin.jvm.internal.g;
import tf.c;

/* compiled from: ProtectedModeManager.kt */
/* loaded from: classes.dex */
public final class ProtectedModeManager {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9606b;

    /* renamed from: d  reason: collision with root package name */
    public static HashSet<String> f9607d;

    /* renamed from: a  reason: collision with root package name */
    public static final ProtectedModeManager f9605a = new ProtectedModeManager();
    public static final c c = a.a(new cg.a<HashSet<String>>() { // from class: com.facebook.appevents.integrity.ProtectedModeManager$defaultStandardParameterNames$2
        @Override // cg.a
        public final HashSet<String> invoke() {
            return ea.a.u("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    });

    public static final void b(Bundle bundle) {
        if (k6.a.b(ProtectedModeManager.class)) {
            return;
        }
        try {
            if (f9606b && bundle != null && !bundle.isEmpty() && f9607d != null) {
                ArrayList<String> arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                g.d(keySet, "parameters.keySet()");
                for (String param : keySet) {
                    HashSet<String> hashSet = f9607d;
                    g.b(hashSet);
                    if (!hashSet.contains(param)) {
                        g.d(param, "param");
                        arrayList.add(param);
                    }
                }
                for (String str : arrayList) {
                    bundle.remove(str);
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            k6.a.a(ProtectedModeManager.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #2 {all -> 0x0061, blocks: (B:5:0x0007, B:8:0x0013, B:23:0x0048, B:31:0x005e, B:13:0x0020, B:16:0x0027, B:18:0x0032, B:26:0x004f), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            boolean r0 = k6.a.b(r7)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = com.facebook.d.b()     // Catch: java.lang.Throwable -> L61
            r1 = 0
            com.facebook.internal.f r0 = com.facebook.internal.FetchedAppSettingsManager.k(r0, r1)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L13
            return
        L13:
            org.json.JSONArray r0 = r0.f9776l     // Catch: java.lang.Throwable -> L61
            boolean r2 = k6.a.b(r7)     // Catch: java.lang.Throwable -> L61
            r3 = 0
            if (r2 == 0) goto L1e
        L1c:
            r2 = r3
            goto L46
        L1e:
            if (r0 == 0) goto L1c
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L27
            goto L1c
        L27:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L41
        L30:
            if (r1 >= r4) goto L46
            java.lang.String r5 = r0.getString(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = "jsonArray.getString(i)"
            kotlin.jvm.internal.g.d(r5, r6)     // Catch: java.lang.Throwable -> L41
            r2.add(r5)     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + 1
            goto L30
        L41:
            r0 = move-exception
            k6.a.a(r7, r0)     // Catch: java.lang.Throwable -> L61
            goto L1c
        L46:
            if (r2 != 0) goto L5e
            boolean r0 = k6.a.b(r7)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L4f
            goto L5d
        L4f:
            tf.c r0 = com.facebook.appevents.integrity.ProtectedModeManager.c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L59
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L59
            r3 = r0
            goto L5d
        L59:
            r0 = move-exception
            k6.a.a(r7, r0)     // Catch: java.lang.Throwable -> L61
        L5d:
            r2 = r3
        L5e:
            com.facebook.appevents.integrity.ProtectedModeManager.f9607d = r2     // Catch: java.lang.Throwable -> L61
            return
        L61:
            r0 = move-exception
            k6.a.a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.integrity.ProtectedModeManager.a():void");
    }

    public final boolean c(Bundle bundle) {
        if (k6.a.b(this) || bundle == null) {
            return false;
        }
        try {
            if (!bundle.containsKey("pm")) {
                return false;
            }
            if (!g.a(bundle.get("pm"), "1")) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }
}
