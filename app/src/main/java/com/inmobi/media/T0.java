package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class T0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14703a;

    /* renamed from: b  reason: collision with root package name */
    public final S0 f14704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(Looper looper, X0 assetStore) {
        super(looper);
        kotlin.jvm.internal.g.e(looper, "looper");
        kotlin.jvm.internal.g.e(assetStore, "assetStore");
        this.f14703a = new WeakReference(assetStore);
        this.f14704b = new S0(this);
    }

    public final void a() {
        try {
            sendEmptyMessage(1);
        } catch (Exception unused) {
            X0 x02 = X0.f14813a;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.g.e(msg, "msg");
        try {
        } catch (Exception e10) {
            X0 x02 = X0.f14813a;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
        if (!X0.f14824m.get()) {
            return;
        }
        X0 x03 = (X0) this.f14703a.get();
        int i10 = msg.what;
        String str = null;
        C1674j c1674j = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        if (x03 != null) {
                            Object obj = msg.obj;
                            if (obj instanceof C1674j) {
                                c1674j = (C1674j) obj;
                            }
                            if (c1674j != null) {
                                Q0 a10 = AbstractC1882ya.a();
                                a10.getClass();
                                a10.a("id = ?", new String[]{String.valueOf(c1674j.f15196a)});
                            }
                        }
                        a();
                        return;
                    }
                    return;
                }
                a();
                return;
            } else if (x03 != null) {
                Object obj2 = msg.obj;
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                if (str == null) {
                    return;
                }
                C1674j b10 = AbstractC1882ya.a().b(str);
                if (b10 == null) {
                    a();
                    return;
                } else if (!b10.a()) {
                    AdConfig.AssetCacheConfig assetCacheConfig = X0.c;
                    if (assetCacheConfig != null) {
                        assetCacheConfig.getMaxRetries();
                    }
                    if (b10.f15198d <= 0) {
                        b10.f15206l = (byte) 6;
                        x03.a(b10, (byte) 6);
                        try {
                            Message obtain = Message.obtain();
                            obtain.what = 4;
                            obtain.obj = b10;
                            sendMessage(obtain);
                            return;
                        } catch (Exception unused) {
                            X0 x04 = X0.f14813a;
                            return;
                        }
                    } else if (K8.a() != null) {
                        x03.a(b10, b10.f15206l);
                        X0.d();
                        return;
                    } else if (!X0.a(b10, this.f14704b)) {
                        a();
                        return;
                    } else {
                        return;
                    }
                } else {
                    try {
                        sendEmptyMessage(3);
                    } catch (Exception unused2) {
                        X0 x05 = X0.f14813a;
                    }
                    x03.a(b10, (byte) -1);
                    return;
                }
            } else {
                return;
            }
        } else if (x03 != null) {
            AdConfig.AssetCacheConfig assetCacheConfig2 = X0.c;
            if (assetCacheConfig2 == null) {
                LinkedHashMap linkedHashMap = C1732n2.f15334a;
                Config a11 = C1705l2.a("ads", Ha.b(), null);
                kotlin.jvm.internal.g.c(a11, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
                assetCacheConfig2 = ((AdConfig) a11).getAssetCacheConfig();
            }
            ArrayList b11 = AbstractC1882ya.a().b();
            if (b11.isEmpty()) {
                X0.d();
                return;
            }
            C1674j c1674j2 = (C1674j) b11.get(0);
            Iterator it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1674j c1674j3 = (C1674j) it.next();
                if (!X0.f14822k.containsKey(c1674j2.f15197b)) {
                    c1674j2 = c1674j3;
                    break;
                }
            }
            Message obtain2 = Message.obtain();
            obtain2.what = 1;
            long currentTimeMillis = System.currentTimeMillis() - c1674j2.f15199e;
            try {
                if (currentTimeMillis < assetCacheConfig2.getRetryInterval() * 1000) {
                    sendMessageDelayed(obtain2, (assetCacheConfig2.getRetryInterval() * 1000) - currentTimeMillis);
                } else if (X0.f14822k.containsKey(c1674j2.f15197b)) {
                    sendMessageDelayed(obtain2, assetCacheConfig2.getRetryInterval() * 1000);
                } else {
                    Message obtain3 = Message.obtain();
                    obtain3.what = 2;
                    obtain3.obj = c1674j2.f15197b;
                    sendMessage(obtain3);
                }
                return;
            } catch (Exception unused3) {
                X0 x06 = X0.f14813a;
                return;
            }
        } else {
            return;
        }
        X0 x022 = X0.f14813a;
        Q4 q422 = Q4.f14590a;
        Q4.c.a(AbstractC1863x4.a(e10, "event"));
    }
}
