package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.Q;

/* compiled from: HandlerWapper.java */
/* loaded from: classes2.dex */
public class N extends Q implements O {

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f15786b;

    public N(HandlerThread handlerThread, Q.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f15786b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f15786b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
