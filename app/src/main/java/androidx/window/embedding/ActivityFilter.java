package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.g;
import kotlin.text.k;

/* compiled from: ActivityFilter.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        g.e(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        g.d(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        g.d(className, "componentName.className");
        boolean z13 = true;
        if (packageName.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (className.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (k.O(packageName, "*", false) && k.V(packageName, "*", 0, false, 6) != packageName.length() - 1) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    if (k.O(className, "*", false) && k.V(className, "*", 0, false, 6) != className.length() - 1) {
                        z13 = false;
                    }
                    if (z13) {
                        return;
                    }
                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        if (g.a(this.componentName, activityFilter.componentName) && g.a(this.intentAction, activityFilter.intentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivity(Activity activity) {
        String action;
        g.e(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    action = null;
                } else {
                    action = intent.getAction();
                }
                if (g.a(str, action)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        g.e(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str != null && !g.a(str, intent.getAction())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
