package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class R1 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public A4 f14603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(Looper looper) {
        super(looper);
        kotlin.jvm.internal.g.e(looper, "looper");
    }

    public final void a(N1 click) {
        List list;
        A4 a42 = this.f14603a;
        if (a42 != null) {
            String f10 = Y1.f();
            ((B4) a42).a(f10, androidx.activity.r.f(A5.a(f10, "access$getTAG$p(...)", "Retry attemps exhausted for click ("), click.f14507b, ')'));
        }
        b(click);
        Y1.f14860a.a(click, "RETRY_EXHAUSTED");
        O1 b10 = AbstractC1882ya.b();
        b10.getClass();
        kotlin.jvm.internal.g.e(click, "click");
        b10.a("id = ?", new String[]{String.valueOf(click.f14506a)});
        list = Y1.f14863e;
        list.remove(click);
    }

    public final void b(N1 n12) {
        List list;
        List list2;
        int i10;
        List list3;
        int i11;
        AdConfig.ImaiConfig imaiConfig;
        list = Y1.f14863e;
        kotlin.jvm.internal.g.e(list, "<this>");
        int indexOf = list.indexOf(n12);
        if (-1 != indexOf) {
            list2 = Y1.f14863e;
            int i12 = 0;
            if (indexOf == list2.size() - 1) {
                i10 = 0;
            } else {
                i10 = indexOf + 1;
            }
            list3 = Y1.f14863e;
            N1 n13 = (N1) list3.get(i10);
            Message obtain = Message.obtain();
            if (n13.f14509e) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            obtain.what = i11;
            obtain.obj = n13;
            imaiConfig = Y1.f14865g;
            if (imaiConfig != null) {
                i12 = imaiConfig.getPingInterval();
            }
            long j10 = i12 * 1000;
            if (System.currentTimeMillis() - n13.f14511g < j10) {
                sendMessageDelayed(obtain, j10);
            } else {
                sendMessage(obtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        AtomicBoolean atomicBoolean;
        AdConfig.ImaiConfig imaiConfig;
        List list;
        List<N1> list2;
        List list3;
        AtomicBoolean atomicBoolean2;
        AdConfig.ImaiConfig imaiConfig2;
        AtomicBoolean atomicBoolean3;
        AdConfig.ImaiConfig imaiConfig3;
        AtomicBoolean atomicBoolean4;
        List list4;
        List list5;
        List list6;
        AtomicBoolean atomicBoolean5;
        kotlin.jvm.internal.g.e(msg, "msg");
        atomicBoolean = Y1.f14866h;
        if (!atomicBoolean.get()) {
            return;
        }
        try {
            int i10 = msg.what;
            int i11 = 3;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            A4 a42 = this.f14603a;
                            if (a42 != null) {
                                String f10 = Y1.f();
                                kotlin.jvm.internal.g.d(f10, "access$getTAG$p(...)");
                                ((B4) a42).b(f10, "Unhandled message ( " + msg.what + " ) in pingHandler");
                                return;
                            }
                            return;
                        }
                        Object obj = msg.obj;
                        kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                        N1 n12 = (N1) obj;
                        A4 a43 = this.f14603a;
                        if (a43 != null) {
                            String f11 = Y1.f();
                            kotlin.jvm.internal.g.d(f11, "access$getTAG$p(...)");
                            ((B4) a43).a(f11, "Processing click (" + n12.f14507b + ") completed");
                        }
                        Y1.b(Y1.f14860a, n12);
                        O1 b10 = AbstractC1882ya.b();
                        b10.getClass();
                        b10.a("id = ?", new String[]{String.valueOf(n12.f14506a)});
                        list4 = Y1.f14863e;
                        list4.remove(n12);
                        list5 = Y1.f14863e;
                        if (!list5.isEmpty()) {
                            list6 = Y1.f14863e;
                            N1 n13 = (N1) list6.get(0);
                            Message obtain = Message.obtain();
                            if (n13 == null || !n13.f14509e) {
                                i11 = 2;
                            }
                            obtain.what = i11;
                            obtain.obj = n13;
                            sendMessage(obtain);
                            return;
                        }
                        O1 b11 = AbstractC1882ya.b();
                        b11.getClass();
                        if (AbstractC1860x1.a((AbstractC1860x1) b11) == 0) {
                            A4 a44 = this.f14603a;
                            if (a44 != null) {
                                String f12 = Y1.f();
                                kotlin.jvm.internal.g.d(f12, "access$getTAG$p(...)");
                                ((B4) a44).a(f12, "Done processing all clicks!");
                            }
                            atomicBoolean5 = Y1.f14864f;
                            atomicBoolean5.set(false);
                            return;
                        }
                        Message obtain2 = Message.obtain();
                        obtain2.what = 1;
                        sendMessage(obtain2);
                        return;
                    } else if (K8.a() != null) {
                        atomicBoolean4 = Y1.f14864f;
                        atomicBoolean4.set(false);
                        Y1.a(Y1.f14860a);
                        return;
                    } else {
                        Object obj2 = msg.obj;
                        imaiConfig3 = Y1.f14865g;
                        if ((obj2 instanceof N1) && imaiConfig3 != null) {
                            if (((N1) obj2).f14510f != 0) {
                                N1 n14 = (N1) obj2;
                                long pingCacheExpiry = imaiConfig3.getPingCacheExpiry();
                                n14.getClass();
                                if (System.currentTimeMillis() - n14.f14512h <= pingCacheExpiry * 1000) {
                                    int maxRetries = (imaiConfig3.getMaxRetries() - ((N1) obj2).f14510f) + 1;
                                    if (maxRetries == 0) {
                                        A4 a45 = this.f14603a;
                                        if (a45 != null) {
                                            String f13 = Y1.f();
                                            kotlin.jvm.internal.g.d(f13, "access$getTAG$p(...)");
                                            ((B4) a45).a(f13, "Pinging click (" + ((N1) obj2).f14507b + ") in WebView");
                                        }
                                    } else {
                                        A4 a46 = this.f14603a;
                                        if (a46 != null) {
                                            String f14 = Y1.f();
                                            kotlin.jvm.internal.g.d(f14, "access$getTAG$p(...)");
                                            ((B4) a46).b(f14, "Retry attempt #" + maxRetries + " for click (" + ((N1) obj2).f14507b + ") using WebView");
                                        }
                                    }
                                    new T1(new Q1(this), this.f14603a).a((N1) obj2);
                                    return;
                                }
                            }
                            a((N1) obj2);
                            return;
                        }
                        A4 a47 = this.f14603a;
                        if (a47 != null) {
                            String f15 = Y1.f();
                            kotlin.jvm.internal.g.d(f15, "access$getTAG$p(...)");
                            ((B4) a47).b(f15, "Unhandled message due to ImaiConfig Null");
                            return;
                        }
                        return;
                    }
                } else if (K8.a() != null) {
                    atomicBoolean3 = Y1.f14864f;
                    atomicBoolean3.set(false);
                    Y1.a(Y1.f14860a);
                    return;
                } else {
                    Object obj3 = msg.obj;
                    imaiConfig2 = Y1.f14865g;
                    if ((obj3 instanceof N1) && imaiConfig2 != null) {
                        if (((N1) obj3).f14510f != 0) {
                            N1 n15 = (N1) obj3;
                            long pingCacheExpiry2 = imaiConfig2.getPingCacheExpiry();
                            n15.getClass();
                            if (System.currentTimeMillis() - n15.f14512h <= pingCacheExpiry2 * 1000) {
                                int maxRetries2 = (imaiConfig2.getMaxRetries() - ((N1) obj3).f14510f) + 1;
                                if (maxRetries2 == 0) {
                                    A4 a48 = this.f14603a;
                                    if (a48 != null) {
                                        String f16 = Y1.f();
                                        kotlin.jvm.internal.g.d(f16, "access$getTAG$p(...)");
                                        ((B4) a48).a(f16, "Pinging click (" + ((N1) obj3).f14507b + ") over HTTP");
                                    }
                                } else {
                                    A4 a49 = this.f14603a;
                                    if (a49 != null) {
                                        String f17 = Y1.f();
                                        kotlin.jvm.internal.g.d(f17, "access$getTAG$p(...)");
                                        ((B4) a49).a(f17, "Retry attempt #" + maxRetries2 + " for click (" + ((N1) obj3).f14507b + ") over HTTP");
                                    }
                                }
                                new U1(new P1(this), this.f14603a).a((N1) obj3);
                                return;
                            }
                        }
                        a((N1) obj3);
                        return;
                    }
                    A4 a410 = this.f14603a;
                    if (a410 != null) {
                        String f18 = Y1.f();
                        kotlin.jvm.internal.g.d(f18, "access$getTAG$p(...)");
                        ((B4) a410).b(f18, "Unhandled message due to ImaiConfig Null");
                        return;
                    }
                    return;
                }
            }
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            Config a10 = C1705l2.a("root", Ha.b(), null);
            kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
            if (!((RootConfig) a10).isMonetizationDisabled()) {
                imaiConfig = Y1.f14865g;
                O1 b12 = AbstractC1882ya.b();
                if (imaiConfig != null) {
                    Y1.f14863e = b12.a(imaiConfig.getMaxEventBatch(), imaiConfig.getPingInterval());
                    list = Y1.f14863e;
                    if (list.isEmpty()) {
                        if (AbstractC1860x1.a((AbstractC1860x1) b12) == 0) {
                            atomicBoolean2 = Y1.f14864f;
                            atomicBoolean2.set(false);
                            return;
                        }
                        Message obtain3 = Message.obtain();
                        obtain3.what = 1;
                        sendMessageDelayed(obtain3, imaiConfig.getPingInterval() * 1000);
                        return;
                    }
                    A4 a411 = this.f14603a;
                    if (a411 != null) {
                        String f19 = Y1.f();
                        kotlin.jvm.internal.g.d(f19, "access$getTAG$p(...)");
                        ((B4) a411).a(f19, "Processing following click batch");
                    }
                    list2 = Y1.f14863e;
                    for (N1 n16 : list2) {
                        kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
                        String str = n16.f14507b;
                    }
                    list3 = Y1.f14863e;
                    N1 n17 = (N1) list3.get(0);
                    Message obtain4 = Message.obtain();
                    if (!n17.f14509e) {
                        i11 = 2;
                    }
                    obtain4.what = i11;
                    obtain4.obj = n17;
                    long currentTimeMillis = System.currentTimeMillis() - n17.f14511g;
                    if (currentTimeMillis < imaiConfig.getPingInterval() * 1000) {
                        sendMessageDelayed(obtain4, (imaiConfig.getPingInterval() * 1000) - currentTimeMillis);
                        return;
                    } else {
                        sendMessage(obtain4);
                        return;
                    }
                }
                A4 a412 = this.f14603a;
                if (a412 != null) {
                    String f20 = Y1.f();
                    kotlin.jvm.internal.g.d(f20, "access$getTAG$p(...)");
                    ((B4) a412).b(f20, "Unhandled message due to ImaiConfig Null");
                }
            }
        } catch (Exception e10) {
            A4 a413 = this.f14603a;
            if (a413 != null) {
                String f21 = Y1.f();
                ((B4) a413).b(f21, Cc.a(e10, A5.a(f21, "access$getTAG$p(...)", "SDK encountered unexpected error in processing ping; ")));
            }
        }
    }
}
