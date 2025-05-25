package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1097Rf {
    void A8o();

    boolean A90();

    boolean A91();

    boolean A9a();

    void AEN(boolean z10, int i10);

    void AGo(int i10);

    void AGt(EnumC1084Qs enumC1084Qs, int i10);

    void AH1(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1084Qs getStartReason();

    EnumC1099Rh getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1100Ri interfaceC1100Ri);

    void setup(Uri uri);
}
