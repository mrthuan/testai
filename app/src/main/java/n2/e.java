package n2;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: JavaScriptReplyProxyImpl.java */
/* loaded from: classes.dex */
public final class e implements Callable<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsReplyProxyBoundaryInterface f22321a;

    public e(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f22321a = jsReplyProxyBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new f(this.f22321a);
    }
}
