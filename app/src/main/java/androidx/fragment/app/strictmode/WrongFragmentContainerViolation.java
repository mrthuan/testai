package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.g;

/* compiled from: WrongFragmentContainerViolation.kt */
/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        g.e(fragment, "fragment");
        g.e(container, "container");
        this.container = container;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }
}
