package com.bytedance.sdk.openadsdk.multipro.aidl.Qhi;

import android.os.RemoteCallbackList;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DislikeClosedListenerManagerImpl.java */
/* loaded from: classes.dex */
public class fl extends Qhi {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> Qhi = new ConcurrentHashMap<>();
    private static volatile fl cJ;

    public static fl Qhi() {
        if (cJ == null) {
            synchronized (fl.class) {
                if (cJ == null) {
                    cJ = new fl();
                }
            }
        }
        return cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) {
        Qhi(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        Qhi.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) {
        if (!TextUtils.isEmpty(str)) {
            Qhi.remove(str);
        }
    }

    private synchronized void Qhi(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = Qhi;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                    if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                        broadcastItem.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            ABk.Qhi("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
