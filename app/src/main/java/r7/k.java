package r7;

import com.google.android.gms.common.zze;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: d  reason: collision with root package name */
    public final Callable f29479d;

    public /* synthetic */ k(zze zzeVar) {
        super(false, null, null);
        this.f29479d = zzeVar;
    }

    @Override // r7.l
    public final void a() {
        try {
            String str = (String) this.f29479d.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
