package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g;

/* compiled from: SetUserVisibleHintViolation.kt */
/* loaded from: classes.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        g.e(fragment, "fragment");
        this.isVisibleToUser = z10;
    }

    public final boolean isVisibleToUser() {
        return this.isVisibleToUser;
    }
}
