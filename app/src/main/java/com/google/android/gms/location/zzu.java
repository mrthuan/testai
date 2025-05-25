package com.google.android.gms.location;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzu {

    /* renamed from: a  reason: collision with root package name */
    public static final Feature f11507a;

    /* renamed from: b  reason: collision with root package name */
    public static final Feature[] f11508b;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        Feature feature3 = new Feature("support_context_feature_id", 1L);
        f11507a = feature3;
        f11508b = new Feature[]{feature, feature2, feature3, new Feature("get_current_location", 1L), new Feature("get_last_activity_feature_id", 1L)};
    }
}
