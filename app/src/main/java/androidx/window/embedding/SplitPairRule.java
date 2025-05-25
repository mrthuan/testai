package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.m;
import kotlin.jvm.internal.g;

/* compiled from: SplitPairRule.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    public /* synthetic */ SplitPairRule(Set set, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.d dVar) {
        this(set, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? false : z12, (i13 & 16) != 0 ? 0 : i10, (i13 & 32) == 0 ? i11 : 0, (i13 & 64) != 0 ? 0.5f : f10, (i13 & 128) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        if (g.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop) {
            return true;
        }
        return false;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.filters.hashCode() + (super.hashCode() * 31)) * 31;
        int i12 = 1231;
        if (this.finishPrimaryWithSecondary) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = (hashCode + i10) * 31;
        if (this.finishSecondaryWithPrimary) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = (i13 + i11) * 31;
        if (!this.clearTop) {
            i12 = 1237;
        }
        return i14 + i12;
    }

    public final SplitPairRule plus$window_release(SplitPairFilter filter) {
        g.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPairRule(m.G0(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> filters, boolean z10, boolean z11, boolean z12, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        g.e(filters, "filters");
        this.finishPrimaryWithSecondary = z10;
        this.finishSecondaryWithPrimary = z11;
        this.clearTop = z12;
        this.filters = m.G0(filters);
    }
}
