package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.content.Intent;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.y0;

/* compiled from: PermissionIntroducer.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedChannel f24807a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24808b;
    public y0 c;

    public b(androidx.appcompat.app.c cVar) {
        kotlin.jvm.internal.g.e(cVar, ea.a.p("WWMFaUBpE3k=", "W88q6gyf"));
        this.f24807a = kotlinx.coroutines.channels.e.a(0, null, 7);
        androidx.activity.result.c<Intent> registerForActivityResult = cVar.registerForActivityResult(new j.d(), new h5.a(this, 12));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("IGM2aThpTXlmcgNnXXMjZUpGPXIIY0JploDXbjRsbHQzeRFlIGQRaTwpbCAUIHcgGCByfQ==", "tmABN9G1"));
        this.f24808b = registerForActivityResult;
    }
}
