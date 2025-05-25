package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import u.d;
import u.g;

/* loaded from: classes.dex */
public class ActServiceConnection extends g {
    private cJ mConnectionCallback;

    public ActServiceConnection(cJ cJVar) {
        this.mConnectionCallback = cJVar;
    }

    @Override // u.g
    public void onCustomTabsServiceConnected(ComponentName componentName, d dVar) {
        cJ cJVar = this.mConnectionCallback;
        if (cJVar != null) {
            cJVar.Qhi(dVar);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        cJ cJVar = this.mConnectionCallback;
        if (cJVar != null) {
            cJVar.Qhi();
        }
    }
}
