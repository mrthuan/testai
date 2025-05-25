package u9;

import android.os.Bundle;
import android.os.Process;
import com.google.ads.ADRequestList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f30273a;

    static {
        new HashSet(Arrays.asList("native", ADRequestList.UNITY));
        f30273a = new HashMap();
        androidx.activity.f.k("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (i.class) {
            hashMap = f30273a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey(ADRequestList.UNITY)) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get(ADRequestList.UNITY)).intValue());
        }
        return bundle;
    }
}
