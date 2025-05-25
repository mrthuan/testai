package pdf.pdfreader.viewer.editor.free.billing;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* compiled from: BillingHelper.kt */
/* loaded from: classes3.dex */
public final class b implements z4.g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Boolean> f24052a = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<Boolean> f24053b;

    public b(kotlinx.coroutines.h hVar) {
        this.f24053b = hVar;
    }

    @Override // z4.f
    public final void a(boolean z10) {
        if (!this.f24052a.getAndSet(Boolean.TRUE).booleanValue()) {
            kotlinx.coroutines.g<Boolean> gVar = this.f24053b;
            if (gVar.a()) {
                gVar.resumeWith(Result.m13constructorimpl(Boolean.valueOf(z10)));
            }
        }
    }

    @Override // z4.a
    public final void f(String str) {
        if (!this.f24052a.getAndSet(Boolean.TRUE).booleanValue()) {
            g.a(this.f24053b, str, 1001);
        }
    }
}
