package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zadc {
    public static final Status c = new Status(8, "The connection to Google Play services was lost", null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f11144a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    public final j0 f11145b = new j0(this);

    public final void a() {
        BasePendingResult[] basePendingResultArr;
        Set set = this.f11144a;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                set.remove(basePendingResult);
            }
        }
    }
}
