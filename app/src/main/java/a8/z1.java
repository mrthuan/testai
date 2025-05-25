package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public final Clock f395a;

    /* renamed from: b  reason: collision with root package name */
    public long f396b;

    public z1(Clock clock) {
        Preconditions.j(clock);
        this.f395a = clock;
    }
}
