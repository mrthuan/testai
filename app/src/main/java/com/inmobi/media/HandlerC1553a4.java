package com.inmobi.media;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.inmobi.media.a4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC1553a4 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1553a4(Looper looper) {
        super(looper);
        kotlin.jvm.internal.g.e(looper, "looper");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        WifiManager wifiManager;
        kotlin.jvm.internal.g.e(msg, "msg");
        int i10 = msg.what;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.f14932a) {
                        sendEmptyMessage(2);
                        return;
                    }
                    Lc lc2 = Lc.f14439a;
                    Lc.f14440b = Ha.d();
                    Looper myLooper = Looper.myLooper();
                    synchronized (lc2) {
                        if (Lc.c == null) {
                            Context d10 = Ha.d();
                            if (d10 != null) {
                                Object systemService = d10.getSystemService("wifi");
                                if (systemService instanceof WifiManager) {
                                    wifiManager = (WifiManager) systemService;
                                } else {
                                    wifiManager = null;
                                }
                                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                                    kotlin.jvm.internal.g.b(myLooper);
                                    Handler handler = new Handler(myLooper);
                                    Lc.c = handler;
                                    handler.postDelayed(Lc.f14444g, 10000L);
                                    if (!Lc.f14441d) {
                                        Lc.f14441d = true;
                                        Context context = Lc.f14440b;
                                        if (context != null) {
                                            context.registerReceiver(Lc.f14445h, Lc.f14442e, null, Lc.c);
                                        }
                                    }
                                    wifiManager.startScan();
                                }
                            }
                        }
                    }
                    sendEmptyMessageDelayed(3, Na.a().getSampleInterval() * 1000);
                    return;
                }
                return;
            }
            removeMessages(3);
            return;
        }
        sendEmptyMessage(3);
    }
}
