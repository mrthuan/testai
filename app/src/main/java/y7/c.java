package y7;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class c implements Comparator<ActivityTransition> {
    @Override // java.util.Comparator
    public final int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        Preconditions.j(activityTransition3);
        Preconditions.j(activityTransition4);
        int i10 = activityTransition3.f11433a;
        int i11 = activityTransition4.f11433a;
        if (i10 != i11) {
            if (i10 < i11) {
                return -1;
            }
        } else {
            int i12 = activityTransition3.f11434b;
            int i13 = activityTransition4.f11434b;
            if (i12 == i13) {
                return 0;
            }
            if (i12 < i13) {
                return -1;
            }
        }
        return 1;
    }
}
