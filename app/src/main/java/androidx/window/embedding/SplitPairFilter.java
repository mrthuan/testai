package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.g;

/* compiled from: SplitPairFilter.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SplitPairFilter(android.content.ComponentName r7, android.content.ComponentName r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        if (g.a(this.primaryActivityName, splitPairFilter.primaryActivityName) && g.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && g.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.secondaryActivityName.hashCode() + (this.primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        g.e(primaryActivity, "primaryActivity");
        g.e(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str != null && !g.a(str, secondaryActivityIntent.getAction())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (matchesActivityIntentPair(r6, r7) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean matchesActivityPair(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            kotlin.jvm.internal.g.e(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            kotlin.jvm.internal.g.e(r7, r0)
            androidx.window.embedding.MatcherUtils r0 = androidx.window.embedding.MatcherUtils.INSTANCE
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.primaryActivityName
            boolean r1 = r0.areComponentsMatching$window_release(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.secondaryActivityName
            boolean r0 = r0.areComponentsMatching$window_release(r1, r4)
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r3
        L29:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L41
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            kotlin.jvm.internal.g.d(r7, r0)
            boolean r6 = r5.matchesActivityIntentPair(r6, r7)
            if (r6 == 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            r0 = r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.matchesActivityPair(android.app.Activity, android.app.Activity):boolean");
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
