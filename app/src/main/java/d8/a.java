package d8;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class a<T> implements OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f16122a = new CountDownLatch(1);

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void c() {
        this.f16122a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f16122a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t4) {
        this.f16122a.countDown();
    }
}
