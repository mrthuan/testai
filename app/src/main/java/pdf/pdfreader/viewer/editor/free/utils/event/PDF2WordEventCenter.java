package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import android.text.TextUtils;
import ea.a;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import tf.c;

/* compiled from: PDF2WordEventCenter.kt */
/* loaded from: classes3.dex */
public final class PDF2WordEventCenter {
    public static final String c = a.p("P2RXMg5vRWQFcyVfRDcx", "Pv8LXjx8");

    /* renamed from: a  reason: collision with root package name */
    public static final PDF2WordEventCenter f28672a = new PDF2WordEventCenter();

    /* renamed from: b  reason: collision with root package name */
    public static final c f28673b = kotlin.a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });

    public static void a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        c cVar = f28673b;
        String str3 = c;
        if (isEmpty) {
            tn.a.b((Context) cVar.getValue(), str3, str);
        } else {
            tn.a.d((Context) cVar.getValue(), str3, str, str2, false);
        }
    }
}
