package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes2.dex */
public interface zaq {
    ExecutorService zaa(ThreadFactory threadFactory, int i10);

    ExecutorService zab(int i10, int i11);

    ExecutorService zac(int i10, ThreadFactory threadFactory, int i11);
}
