package e3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class j implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f16366a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16367b = null;

    public j(ByteArrayInputStream byteArrayInputStream) {
        this.f16366a = byteArrayInputStream;
    }

    @Override // java.util.concurrent.Callable
    public final p<e> call() {
        return f.c(this.f16366a, this.f16367b);
    }
}
