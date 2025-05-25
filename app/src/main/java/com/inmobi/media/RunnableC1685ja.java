package com.inmobi.media;

/* renamed from: com.inmobi.media.ja  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1685ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final C1643ga f15236a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.p f15237b;

    public RunnableC1685ja(C1643ga request, C1657ha c1657ha) {
        kotlin.jvm.internal.g.e(request, "request");
        this.f15236a = request;
        this.f15237b = c1657ha;
    }

    public static final void a(RunnableC1685ja this$0, C1727ma response) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(response, "$response");
        C1643ga c1643ga = this$0.f15236a;
        c1643ga.getClass();
        F8 f82 = c1643ga.f15111l;
        if (f82 != null) {
            H8 h82 = new H8();
            byte[] bArr = response.c;
            if (bArr != null) {
                if (bArr.length == 0) {
                    h82.f14321b = new byte[0];
                } else {
                    byte[] bArr2 = new byte[bArr.length];
                    h82.f14321b = bArr2;
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
            }
            h82.f14323e = response.f15320b;
            h82.f14322d = response.f15322e;
            h82.c = response.f15319a;
            G8 request = f82.f14248a;
            kotlin.jvm.internal.g.e(request, "request");
            f82.f14249b.invoke(h82);
        }
        c1643ga.f15111l = null;
        try {
            AbstractC1671ia.f15193a.remove(c1643ga);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC1849w3 enumC1849w3;
        this.f15236a.getClass();
        C1727ma a10 = C8.a(this.f15236a, this.f15237b);
        D8 d82 = a10.f15319a;
        if (d82 != null) {
            enumC1849w3 = d82.f14201a;
        } else {
            enumC1849w3 = null;
        }
        if (enumC1849w3 != EnumC1849w3.f15562m) {
            ExecutorC1639g6 executorC1639g6 = (ExecutorC1639g6) G3.f14269d.getValue();
            l1.a aVar = new l1.a(9, this, a10);
            executorC1639g6.getClass();
            executorC1639g6.f15096a.post(aVar);
            this.f15236a.getClass();
        }
    }
}
