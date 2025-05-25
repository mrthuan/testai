package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* compiled from: WrongNestedHierarchyViolation.kt */
/* loaded from: classes.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WrongNestedHierarchyViolation(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g.e(r3, r0)
            java.lang.String r0 = "expectedParentFragment"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempting to nest fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " within the view of parent fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " via container with ID "
            r0.append(r1)
            java.lang.String r1 = " without using parent's childFragmentManager"
            java.lang.String r0 = a6.h.g(r0, r5, r1)
            r2.<init>(r3, r0)
            r2.expectedParentFragment = r4
            r2.containerId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.strictmode.WrongNestedHierarchyViolation.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, int):void");
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
