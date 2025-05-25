package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.g;

/* compiled from: SplitInfo.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack primaryActivityStack, ActivityStack secondaryActivityStack, float f10) {
        g.e(primaryActivityStack, "primaryActivityStack");
        g.e(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f10;
    }

    public final boolean contains(Activity activity) {
        g.e(activity, "activity");
        if (!this.primaryActivityStack.contains(activity) && !this.secondaryActivityStack.contains(activity)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (!g.a(this.primaryActivityStack, splitInfo.primaryActivityStack) || !g.a(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return false;
        }
        if (this.splitRatio == splitInfo.splitRatio) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        int hashCode = this.secondaryActivityStack.hashCode();
        return Float.floatToIntBits(this.splitRatio) + ((hashCode + (this.primaryActivityStack.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb2.append("splitRatio=" + getSplitRatio() + '}');
        String sb3 = sb2.toString();
        g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
