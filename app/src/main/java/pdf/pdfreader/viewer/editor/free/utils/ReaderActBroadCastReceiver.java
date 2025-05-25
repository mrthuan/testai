package pdf.pdfreader.viewer.editor.free.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a;

/* loaded from: classes3.dex */
public class ReaderActBroadCastReceiver<T extends a> extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<T> f28529a;

    /* loaded from: classes3.dex */
    public interface a {
        void d0(String str, Intent intent);
    }

    public ReaderActBroadCastReceiver(T t4) {
        this.f28529a = new WeakReference<>(t4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        T t4 = this.f28529a.get();
        if (action != null && t4 != null) {
            t4.d0(action, intent);
        }
    }
}
