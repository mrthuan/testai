package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.m;
import kotlin.jvm.internal.g;

/* compiled from: EmbeddingAdapter.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        g.e(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        g.e(pair, "<this>");
        return (S) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3  reason: not valid java name */
    public static final boolean m0translateActivityIntentPredicates$lambda3(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        g.e(this$0, "this$0");
        g.e(splitPairFilters, "$splitPairFilters");
        g.d(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Intent intent = (Intent) this$0.component2(pair);
        Set<SplitPairFilter> set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : set) {
            if (splitPairFilter.matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1  reason: not valid java name */
    public static final boolean m1translateActivityPairPredicates$lambda1(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        g.e(this$0, "this$0");
        g.e(splitPairFilters, "$splitPairFilters");
        g.d(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Activity activity2 = (Activity) this$0.component2(pair);
        Set<SplitPairFilter> set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : set) {
            if (splitPairFilter.matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6  reason: not valid java name */
    public static final boolean m2translateActivityPredicates$lambda6(Set activityFilters, Activity activity) {
        g.e(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            g.d(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8  reason: not valid java name */
    public static final boolean m3translateIntentPredicates$lambda8(Set activityFilters, Intent intent) {
        g.e(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            g.d(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4  reason: not valid java name */
    public static final boolean m4translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        g.e(splitRule, "$splitRule");
        g.d(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        g.e(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(list, 10));
        for (androidx.window.extensions.embedding.SplitInfo splitInfo : list) {
            arrayList.add(translate(splitInfo));
        }
        return arrayList;
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(final Set<SplitPairFilter> splitPairFilters) {
        g.e(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m0translateActivityIntentPredicates$lambda3;
                m0translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m0translateActivityIntentPredicates$lambda3(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m0translateActivityIntentPredicates$lambda3;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(final Set<SplitPairFilter> splitPairFilters) {
        g.e(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m1translateActivityPairPredicates$lambda1;
                m1translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m1translateActivityPairPredicates$lambda1(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m1translateActivityPairPredicates$lambda1;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> translateActivityPredicates(final Set<ActivityFilter> activityFilters) {
        g.e(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m2translateActivityPredicates$lambda6;
                m2translateActivityPredicates$lambda6 = EmbeddingAdapter.m2translateActivityPredicates$lambda6(activityFilters, (Activity) obj);
                return m2translateActivityPredicates$lambda6;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> translateIntentPredicates(final Set<ActivityFilter> activityFilters) {
        g.e(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m3translateIntentPredicates$lambda8;
                m3translateIntentPredicates$lambda8 = EmbeddingAdapter.m3translateIntentPredicates$lambda8(activityFilters, (Intent) obj);
                return m3translateIntentPredicates$lambda8;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(final SplitRule splitRule) {
        g.e(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m4translateParentMetricsPredicate$lambda4;
                m4translateParentMetricsPredicate$lambda4 = EmbeddingAdapter.m4translateParentMetricsPredicate$lambda4(SplitRule.this, (WindowMetrics) obj);
                return m4translateParentMetricsPredicate$lambda4;
            }
        };
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z10;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        g.d(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z11 = false;
        try {
            z10 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z10 = false;
        }
        List activities = primaryActivityStack.getActivities();
        g.d(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z10);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        g.d(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z11 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        g.d(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z11), splitInfo.getSplitRatio());
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule build;
        g.e(rules, "rules");
        Set<? extends EmbeddingRule> set = rules;
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                build = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                g.d(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                g.d(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                build = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                g.d(build, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) build);
        }
        return m.G0(arrayList);
    }
}
