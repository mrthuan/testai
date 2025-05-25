package ma;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f21911a = d0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(Task<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.g(f21911a, new androidx.appcompat.libconvert.helper.b(countDownLatch, 4));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.o()) {
            return task.k();
        }
        if (!task.m()) {
            if (task.n()) {
                throw new IllegalStateException(task.j());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }
}
