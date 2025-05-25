package pdf.pdfreader.viewer.editor.free.billing;

import com.adjust.sdk.network.ErrorCodes;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: BillingHelper.kt */
/* loaded from: classes3.dex */
public final class e implements z4.d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Boolean> f24058a = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.g<List<? extends Purchase>> f24059b;

    public e(kotlinx.coroutines.h hVar) {
        this.f24059b = hVar;
    }

    @Override // z4.d
    public final void b(String str) {
        if (!this.f24058a.getAndSet(Boolean.TRUE).booleanValue()) {
            g.a(this.f24059b, str, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        }
    }

    @Override // z4.d
    public final void d(ArrayList<Purchase> arrayList) {
        if (!this.f24058a.getAndSet(Boolean.TRUE).booleanValue()) {
            kotlinx.coroutines.g<List<? extends Purchase>> gVar = this.f24059b;
            RandomAccess randomAccess = arrayList;
            if (gVar.a()) {
                if (arrayList == null) {
                    randomAccess = EmptyList.INSTANCE;
                }
                gVar.resumeWith(Result.m13constructorimpl(randomAccess));
            }
        }
    }

    @Override // z4.a
    public final void f(String str) {
        if (!this.f24058a.getAndSet(Boolean.TRUE).booleanValue()) {
            g.a(this.f24059b, str, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);
        }
    }
}
