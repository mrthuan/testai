package p9;

import android.os.Process;
import com.google.ads.ADRequestList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f23808a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", ADRequestList.UNITY));
        f23808a = new HashMap();
        androidx.activity.f.k("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
