package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.utils.g1.a;

/* compiled from: SyncMsgHandler.java */
/* loaded from: classes3.dex */
public final class g1<T extends a> extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<T> f28701a;

    /* compiled from: SyncMsgHandler.java */
    /* loaded from: classes3.dex */
    public interface a {
        void Q(Message message);
    }

    public g1(T t4) {
        Context r4;
        this.f28701a = new WeakReference<>(t4);
        if (t4 instanceof Context) {
            new WeakReference((Context) t4);
        } else if ((t4 instanceof Fragment) && (r4 = ((Fragment) t4).r()) != null) {
            new WeakReference(r4);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T t4 = this.f28701a.get();
        if (t4 != null) {
            try {
                t4.Q(message);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
