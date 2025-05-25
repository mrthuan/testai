package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbzj extends ScheduledThreadPoolExecutor {
    public zzbzj(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
