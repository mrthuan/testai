package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zaa implements SuccessContinuation {
    static {
        new zaa();
    }

    private /* synthetic */ zaa() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task j(Object obj) {
        Map map = (Map) obj;
        Object obj2 = GoogleApiAvailability.c;
        return Tasks.e(null);
    }
}
