package pdf.pdfreader.viewer.editor.free.billing;

import com.adjust.sdk.network.ErrorCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* compiled from: BillingHelper.kt */
/* loaded from: classes3.dex */
public final class d implements z4.e {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Boolean> f24056a = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<List<com.android.billingclient.api.h>> f24057b;

    public d(kotlinx.coroutines.h hVar) {
        this.f24057b = hVar;
    }

    @Override // z4.e
    public final void b(String str) {
        if (!this.f24056a.getAndSet(Boolean.TRUE).booleanValue()) {
            g.a(this.f24057b, str, ErrorCodes.PROTOCOL_EXCEPTION);
        }
    }

    @Override // z4.a
    public final void f(String str) {
        if (!this.f24056a.getAndSet(Boolean.TRUE).booleanValue()) {
            g.a(this.f24057b, str, ErrorCodes.MALFORMED_URL_EXCEPTION);
        }
    }

    @Override // z4.e
    public final void g(ArrayList arrayList) {
        if (!this.f24056a.getAndSet(Boolean.TRUE).booleanValue()) {
            kotlinx.coroutines.g<List<com.android.billingclient.api.h>> gVar = this.f24057b;
            if (gVar.a()) {
                gVar.resumeWith(Result.m13constructorimpl(arrayList));
            }
        }
    }
}
