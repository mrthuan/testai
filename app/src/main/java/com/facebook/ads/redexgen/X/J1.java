package com.facebook.ads.redexgen.X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.process.ProcessUtils;

/* loaded from: assets/audience_network.dex */
public final class J1 implements AudienceNetworkRemoteServiceApi {
    public static String[] A03 = {"voPBjj5brgSJE0IwRb75go3GzJcvnTMA", "J1wnFcZJgSUrGWuJYgcC3S3AnUnV6DaW", "llX9DPYlWB8oU74zVWsUN0HTEWFOB3Un", "5Y7GwnMqNmRtmsztlHJac4MePUqBHcfA", "yIKXCcKqK5XToLwp", "ch8UU9t", "aylfh5n3ojaiLa86", "37SxUjf9oUYNOIJ9CYsuuXmfZZqWhF1X"};
    public Messenger A00;
    public AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final Service A02;

    public J1(Service service) {
        this.A02 = service;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final IBinder onBind(Intent intent) {
        if (this.A00 == null) {
            String[] strArr = A03;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "O6YEFSdI74rZHmUftXmRNGVlzUJePZUI";
            strArr2[3] = "gwoVm4uiBtJW0ezJGOCNGmmGAUT6CAuw";
            return null;
        }
        return this.A00.getBinder();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void onCreate() {
        ProcessUtils.setRemoteRenderingProcess(true);
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().initialize(this.A02, null, null, 2);
        this.A00 = new Messenger(new J2(this.A02.getApplicationContext(), this.A01));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void onDestroy() {
        C1222Wb.A00().A06();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi
    public final void setMessageHandler(AudienceNetworkRemoteServiceApi.MessageHandler messageHandler) {
        this.A01 = messageHandler;
    }
}
