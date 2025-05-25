package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zab implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11323a = 0;

    static {
        new zab();
    }

    private /* synthetic */ zab() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        if (!feature.f10880a.equals(feature2.f10880a)) {
            return feature.f10880a.compareTo(feature2.f10880a);
        }
        return (feature.d() > feature2.d() ? 1 : (feature.d() == feature2.d() ? 0 : -1));
    }
}
