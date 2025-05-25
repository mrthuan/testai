package sp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* compiled from: WPSExporter.java */
/* loaded from: classes3.dex */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f29848a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f29849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Looper looper, b bVar) {
        super(looper);
        this.f29849b = hVar;
        this.f29848a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        int i10 = message.what;
        b bVar = this.f29848a;
        h hVar = this.f29849b;
        switch (i10) {
            case 4097:
                if (hVar.f29860j) {
                    return;
                }
                float f10 = hVar.f29861k;
                if (f10 < 0.95d) {
                    float f11 = f10 + 0.01f;
                    hVar.f29861k = f11;
                    if (f11 < 0.3d) {
                        sendEmptyMessageDelayed(4097, 100L);
                    } else if (f11 < 0.5d) {
                        sendEmptyMessageDelayed(4097, 200L);
                    } else if (f11 < 0.6d) {
                        sendEmptyMessageDelayed(4097, 1000L);
                    } else if (f11 < 0.7d) {
                        sendEmptyMessageDelayed(4097, 3000L);
                    } else if (f11 < 0.8d) {
                        sendEmptyMessageDelayed(4097, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                    } else if (f11 < 0.9d) {
                        sendEmptyMessageDelayed(4097, 10000L);
                    } else {
                        sendEmptyMessageDelayed(4097, 18000L);
                    }
                    if (bVar != null) {
                        bVar.O0(Float.valueOf(hVar.f29861k));
                        return;
                    }
                    return;
                }
                return;
            case 4098:
                hVar.f29861k = ((Float) message.obj).floatValue();
                if (bVar != null) {
                    bVar.O0(Float.valueOf(hVar.f29861k));
                    return;
                }
                return;
            case 4099:
                if (bVar != null) {
                    Object obj = message.obj;
                    if (obj instanceof Throwable) {
                        bVar.y0(message.arg1, (Throwable) obj);
                        return;
                    }
                    return;
                }
                return;
            case 4100:
                if (bVar != null) {
                    bVar.f0(hVar.f29868r, hVar.f29863m);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
