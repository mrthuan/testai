package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* compiled from: CommonPermissionListenerManagerImpl.java */
/* loaded from: classes.dex */
public class ac extends Qhi {
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> Qhi = new HashMap<>();
    private static volatile ac cJ;

    public static ac Qhi() {
        if (cJ == null) {
            synchronized (ac.class) {
                if (cJ == null) {
                    cJ = new ac();
                }
            }
        }
        return cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) {
        RemoteCallbackList<ICommonPermissionListener> remove = Qhi.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i10 = 0; i10 < beginBroadcast; i10++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i10);
            if (broadcastItem != null) {
                if (str2 == null) {
                    broadcastItem.onGranted();
                } else {
                    broadcastItem.onDenied(str2);
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        Qhi.put(str, remoteCallbackList);
    }
}
