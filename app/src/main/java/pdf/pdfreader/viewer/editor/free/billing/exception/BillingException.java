package pdf.pdfreader.viewer.editor.free.billing.exception;

import ea.a;
import k5.d;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.billing.h;

/* compiled from: BillingException.kt */
/* loaded from: classes3.dex */
public final class BillingException extends RuntimeException {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingException(int i10, String str) {
        super(str);
        g.e(str, a.p("XmU4cxJnZQ==", "ZSCV1Jir"));
        this.errorCode = i10;
        String message = "logException: " + this;
        h.f24062a.getClass();
        g.e(message, "message");
        if (ge.a.f17758i != null) {
            d.a(message);
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i10 = this.errorCode;
        String runtimeException = super.toString();
        return "errorCode: " + i10 + " " + runtimeException;
    }
}
