package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<PowerManager.WakeLock> f3969a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static int f3970b = 1;
}
