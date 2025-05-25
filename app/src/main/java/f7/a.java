package f7;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<Priority> f17139a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Priority, Integer> f17140b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f17140b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        hashMap.put(Priority.VERY_LOW, 1);
        hashMap.put(Priority.HIGHEST, 2);
        for (Priority priority : hashMap.keySet()) {
            f17139a.append(f17140b.get(priority).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = f17140b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i10) {
        Priority priority = f17139a.get(i10);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(b.a.c("Unknown Priority for value ", i10));
    }
}
