package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.g;

/* compiled from: SplitRule.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    /* compiled from: SplitRule.kt */
    /* loaded from: classes.dex */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final Rect getBounds(WindowMetrics windowMetrics) {
            g.e(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            g.d(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* compiled from: SplitRule.kt */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean checkParentMetrics(WindowMetrics parentMetrics) {
        boolean z10;
        boolean z11;
        g.e(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(parentMetrics);
        if (this.minWidth != 0 && bounds.width() < this.minWidth) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.minSmallestWidth != 0 && Math.min(bounds.width(), bounds.height()) < this.minSmallestWidth) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.minWidth != splitRule.minWidth || this.minSmallestWidth != splitRule.minSmallestWidth) {
            return false;
        }
        if (this.splitRatio == splitRule.splitRatio) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.layoutDirection == splitRule.layoutDirection) {
            return true;
        }
        return false;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.splitRatio) + (((this.minWidth * 31) + this.minSmallestWidth) * 31)) * 31) + this.layoutDirection;
    }

    public /* synthetic */ SplitRule(int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.d dVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }

    public SplitRule(int i10, int i11, float f10, int i12) {
        this.minWidth = i10;
        this.minSmallestWidth = i11;
        this.splitRatio = f10;
        this.layoutDirection = i12;
    }
}
