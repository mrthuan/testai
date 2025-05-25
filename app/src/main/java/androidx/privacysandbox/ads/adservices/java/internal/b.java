package androidx.privacysandbox.ads.adservices.java.internal;

import cg.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c0;
import tf.d;

/* compiled from: CoroutineAdapter.kt */
/* loaded from: classes.dex */
public final class b {
    public static z.a a(final c0 c0Var) {
        final androidx.concurrent.futures.a aVar = new androidx.concurrent.futures.a();
        z.a<T> aVar2 = new z.a<>(aVar);
        aVar.f2750b = aVar2;
        aVar.f2749a = a.class;
        try {
            c0Var.X(new l<Throwable, d>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(Throwable th2) {
                    invoke2(th2);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    boolean z10 = false;
                    if (th2 != null) {
                        if (th2 instanceof CancellationException) {
                            androidx.concurrent.futures.a<Object> aVar3 = aVar;
                            aVar3.f2751d = true;
                            z.a<Object> aVar4 = aVar3.f2750b;
                            if (aVar4 != null && aVar4.f32213b.cancel(true)) {
                                z10 = true;
                            }
                            if (z10) {
                                aVar3.f2749a = null;
                                aVar3.f2750b = null;
                                aVar3.c = null;
                                return;
                            }
                            return;
                        }
                        androidx.concurrent.futures.a<Object> aVar5 = aVar;
                        aVar5.f2751d = true;
                        z.a<Object> aVar6 = aVar5.f2750b;
                        if (aVar6 != null && aVar6.f32213b.i(th2)) {
                            z10 = true;
                        }
                        if (z10) {
                            aVar5.f2749a = null;
                            aVar5.f2750b = null;
                            aVar5.c = null;
                            return;
                        }
                        return;
                    }
                    androidx.concurrent.futures.a<Object> aVar7 = aVar;
                    Object d10 = c0Var.d();
                    aVar7.f2751d = true;
                    z.a<Object> aVar8 = aVar7.f2750b;
                    if (aVar8 != null && aVar8.f32213b.h(d10)) {
                        z10 = true;
                    }
                    if (z10) {
                        aVar7.f2749a = null;
                        aVar7.f2750b = null;
                        aVar7.c = null;
                    }
                }
            });
            aVar.f2749a = "Deferred.asListenableFuture";
        } catch (Exception e10) {
            aVar2.f32213b.i(e10);
        }
        return aVar2;
    }
}
