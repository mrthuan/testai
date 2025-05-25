package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RewardAdVideoListenerManagerImpl.java */
/* loaded from: classes.dex */
public class Sf extends Qhi {
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> Qhi = Collections.synchronizedMap(new HashMap());
    private static volatile Sf cJ;

    public static Sf Qhi() {
        if (cJ == null) {
            synchronized (Sf.class) {
                if (cJ == null) {
                    cJ = new Sf();
                }
            }
        }
        return cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        Qhi(str, str2, z10, i10, str3, i11, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        Qhi.put(str, remoteCallbackList);
    }

    private synchronized void Qhi(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = Qhi;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i12 = 0; i12 < beginBroadcast; i12++) {
                        IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i12);
                        if (broadcastItem != null) {
                            if ("onAdShow".equals(str2)) {
                                broadcastItem.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                broadcastItem.onAdClose();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                broadcastItem.onAdVideoBarClick();
                            } else if ("onRewardVerify".equals(str2)) {
                                broadcastItem.onRewardVerify(z10, i10, str3, i11, str4);
                            } else if ("recycleRes".equals(str2)) {
                                broadcastItem.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            ABk.Qhi("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th2);
        }
    }
}
