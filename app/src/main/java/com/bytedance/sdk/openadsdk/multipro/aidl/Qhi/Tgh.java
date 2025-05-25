package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FullScreenVideoListenerManagerImpl.java */
/* loaded from: classes.dex */
public class Tgh extends Qhi {
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> Qhi = Collections.synchronizedMap(new HashMap());
    private static volatile Tgh cJ;

    public static Tgh Qhi() {
        if (cJ == null) {
            synchronized (Tgh.class) {
                if (cJ == null) {
                    cJ = new Tgh();
                }
            }
        }
        return cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) {
        Qhi(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        Qhi.put(str, remoteCallbackList);
    }

    private synchronized void Qhi(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = Qhi;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i10 = 0; i10 < beginBroadcast; i10++) {
                        IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}
