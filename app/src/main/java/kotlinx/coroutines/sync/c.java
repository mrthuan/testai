package kotlinx.coroutines.sync;

import com.android.billingclient.api.a0;

/* compiled from: Semaphore.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f20262a = b.b.c0("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f20263b = new a0("PERMIT", 8);
    public static final a0 c = new a0("TAKEN", 8);

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f20264d = new a0("BROKEN", 8);

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f20265e = new a0("CANCELLED", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final int f20266f = b.b.c0("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);
}
