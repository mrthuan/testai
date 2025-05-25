package kotlinx.coroutines.channels;

import com.android.billingclient.api.a0;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final g<Object> f20015a = new g<>(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f20016b = b.b.c0("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = b.b.c0("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", Constants.CP_MAC_ROMAN, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f20017d = new a0("BUFFERED", 8);

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f20018e = new a0("SHOULD_BUFFER", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f20019f = new a0("S_RESUMING_BY_RCV", 8);

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f20020g = new a0("RESUMING_BY_EB", 8);

    /* renamed from: h  reason: collision with root package name */
    public static final a0 f20021h = new a0("POISONED", 8);

    /* renamed from: i  reason: collision with root package name */
    public static final a0 f20022i = new a0("DONE_RCV", 8);

    /* renamed from: j  reason: collision with root package name */
    public static final a0 f20023j = new a0("INTERRUPTED_SEND", 8);

    /* renamed from: k  reason: collision with root package name */
    public static final a0 f20024k = new a0("INTERRUPTED_RCV", 8);

    /* renamed from: l  reason: collision with root package name */
    public static final a0 f20025l = new a0("CHANNEL_CLOSED", 8);

    /* renamed from: m  reason: collision with root package name */
    public static final a0 f20026m = new a0("SUSPEND", 8);

    /* renamed from: n  reason: collision with root package name */
    public static final a0 f20027n = new a0("SUSPEND_NO_WAITER", 8);

    /* renamed from: o  reason: collision with root package name */
    public static final a0 f20028o = new a0("FAILED", 8);

    /* renamed from: p  reason: collision with root package name */
    public static final a0 f20029p = new a0("NO_RECEIVE_RESULT", 8);

    /* renamed from: q  reason: collision with root package name */
    public static final a0 f20030q = new a0("CLOSE_HANDLER_CLOSED", 8);

    /* renamed from: r  reason: collision with root package name */
    public static final a0 f20031r = new a0("CLOSE_HANDLER_INVOKED", 8);

    /* renamed from: s  reason: collision with root package name */
    public static final a0 f20032s = new a0("NO_CLOSE_CAUSE", 8);

    public static final <T> boolean a(kotlinx.coroutines.g<? super T> gVar, T t4, cg.l<? super Throwable, tf.d> lVar) {
        a0 g10 = gVar.g(t4, lVar);
        if (g10 != null) {
            gVar.A(g10);
            return true;
        }
        return false;
    }
}
