package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class B9 extends Lambda implements cg.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9 f14146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B9(C9 c92, boolean z10) {
        super(0);
        this.f14146a = c92;
        this.f14147b = z10;
    }

    @Override // cg.a
    public final Object invoke() {
        C9 c92 = this.f14146a;
        if (!c92.f14169g.isEmpty() && !c92.f14170h.isEmpty()) {
            String c = c92.c();
            kotlin.jvm.internal.g.e(c, "<this>");
            if (!kotlin.jvm.internal.g.a(c, "{}")) {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (this.f14146a.f14172j.length() == 0) {
                    C9 c93 = this.f14146a;
                    ScheduledExecutorService scheduledExecutorService = AbstractC1597d6.f15014a;
                    Context context = c93.f14164a;
                    kotlin.jvm.internal.g.e(context, "context");
                    File file = new File(context.getFilesDir() + "/logging");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    c93.f14172j = context.getFilesDir() + "/logging/" + timeInMillis + ".txt";
                }
                C9 c94 = this.f14146a;
                if (AbstractC1611e6.a("RemoteLogger", c94.c(), c94.f14172j)) {
                    C9 c95 = this.f14146a;
                    boolean z10 = this.f14147b;
                    String str = c95.f14172j;
                    Q5 q5 = new Q5(str, timeInMillis, 0, 0L, z10, c95.f14173k.get(), 12);
                    R5 d10 = AbstractC1882ya.d();
                    d10.getClass();
                    if (!AbstractC1860x1.a(d10, "filename=\"" + str + '\"', null, null, null, null, null, 62).isEmpty()) {
                        d10.b(q5);
                    } else {
                        int i10 = this.f14146a.c;
                        d10.a((Object) q5);
                        if (d10.f14611b != null) {
                            D4.a();
                        }
                        ScheduledExecutorService scheduledExecutorService2 = AbstractC1597d6.f15014a;
                        C9 c96 = this.f14146a;
                        AbstractC1583c6.a(d10, timeInMillis - c96.f14165b, c96.c);
                    }
                }
            }
        }
        return tf.d.f30009a;
    }
}
