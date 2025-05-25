package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzlh {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11908a;

    @VisibleForTesting
    public zzlh(Context context) {
        Preconditions.j(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.j(applicationContext);
        this.f11908a = applicationContext;
    }
}
