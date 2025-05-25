package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.m;
import kotlin.jvm.internal.g;

/* compiled from: SplitPlaceholderRule.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i10, int i11, float f10, int i12, int i13, kotlin.jvm.internal.d dVar) {
        this(set, intent, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? 0.5f : f10, (i13 & 32) != 0 ? 3 : i12);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        if (g.a(this.filters, splitPlaceholderRule.filters) && g.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent)) {
            return true;
        }
        return false;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        int hashCode = this.filters.hashCode();
        return this.placeholderIntent.hashCode() + ((hashCode + (super.hashCode() * 31)) * 31);
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter filter) {
        g.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPlaceholderRule(m.G0(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> filters, Intent placeholderIntent, int i10, int i11, float f10, int i12) {
        super(i10, i11, f10, i12);
        g.e(filters, "filters");
        g.e(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = m.G0(filters);
    }
}
