package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;

/* compiled from: MatcherUtils.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        boolean z10;
        if (!k.O(str2, "*", false)) {
            return false;
        }
        if (g.a(str2, "*")) {
            return true;
        }
        if (k.V(str2, "*", 0, false, 6) == k.Y(str2, "*", 6) && j.F(str2, "*", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String substring = str2.substring(0, str2.length() - 1);
            g.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return j.M(str, substring, false);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        g.e(activity, "activity");
        g.e(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r6, android.content.ComponentName r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.g.e(r7, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L22
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = kotlin.jvm.internal.g.a(r6, r0)
            if (r6 == 0) goto L20
            java.lang.String r6 = r7.getClassName()
            boolean r6 = kotlin.jvm.internal.g.a(r6, r0)
            if (r6 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.g.d(r3, r4)
            boolean r0 = kotlin.text.k.O(r3, r0, r2)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8d
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = kotlin.jvm.internal.g.a(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.g.d(r0, r3)
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.g.d(r3, r4)
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = kotlin.jvm.internal.g.a(r3, r4)
            if (r3 != 0) goto L85
            java.lang.String r6 = r6.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.g.d(r6, r3)
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.g.d(r7, r3)
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L83
            goto L85
        L83:
            r6 = r2
            goto L86
        L85:
            r6 = r1
        L86:
            if (r0 == 0) goto L8b
            if (r6 == 0) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            return r1
        L8d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Wildcard can only be part of the rule."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
