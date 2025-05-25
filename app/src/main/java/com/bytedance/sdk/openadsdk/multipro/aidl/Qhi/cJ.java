package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AppOpenAdListenerManagerImpl.java */
/* loaded from: classes.dex */
public class cJ extends Qhi {
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> Qhi = Collections.synchronizedMap(new HashMap());
    private static volatile cJ cJ;

    public static cJ Qhi() {
        if (cJ == null) {
            synchronized (cJ.class) {
                if (cJ == null) {
                    cJ = new cJ();
                }
            }
        }
        return cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) {
        Qhi(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        Qhi.put(str, remoteCallbackList);
    }

    private synchronized void Qhi(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = Qhi;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i10 = 0; i10 < beginBroadcast; i10++) {
                        IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                broadcastItem.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                broadcastItem.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                broadcastItem.onAdTimeOver();
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
            ABk.Qhi("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th2);
        }
    }
}
