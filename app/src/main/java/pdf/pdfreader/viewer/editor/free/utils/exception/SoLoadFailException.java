package pdf.pdfreader.viewer.editor.free.utils.exception;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

/* compiled from: SoLoadFailException.kt */
/* loaded from: classes3.dex */
public final class SoLoadFailException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoLoadFailException(Exception exception) {
        super("So load fail", exception);
        g.e(exception, "exception");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoLoadFailException(String message, Exception exception) {
        super(message, exception);
        g.e(message, "message");
        g.e(exception, "exception");
    }

    public /* synthetic */ SoLoadFailException(String str, Exception exc, int i10, d dVar) {
        this((i10 & 1) != 0 ? "So load fail" : str, exc);
    }
}
