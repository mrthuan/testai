package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: ActivityStack.kt */
@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activities, boolean z10) {
        g.e(activities, "activities");
        this.activities = activities;
        this.isEmpty = z10;
    }

    public final boolean contains(Activity activity) {
        g.e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (!g.a(this.activities, activityStack.activities) && this.isEmpty != activityStack.isEmpty) {
            return true;
        }
        return false;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return this.activities.hashCode() + ((this.isEmpty ? 1 : 0) * 31);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityStack{");
        sb2.append(g.h(getActivities$window_release(), "activities="));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String sb3 = sb2.toString();
        g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, kotlin.jvm.internal.d dVar) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
