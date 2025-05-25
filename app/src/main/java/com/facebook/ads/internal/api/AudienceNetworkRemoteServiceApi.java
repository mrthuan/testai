package com.facebook.ads.internal.api;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
/* loaded from: classes.dex */
public interface AudienceNetworkRemoteServiceApi {

    /* loaded from: classes.dex */
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);
}
