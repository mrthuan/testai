package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.If  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0870If implements Runnable {
    public static String[] A02 = {"13oaU3ARqDr4RH9jpYNK93c", "TYF7Qt", "xUTRJm4Rg673ApQEKqlQsSs", "hRIg6SPEQXGq6T", "3QHfr38dRkY9JxUpCoLwEkFMMlSloeG2", "i8J6r6uMy266kC8rTF8mGIBzqV5dBCmb", "x98fVhayFhYlIbQQOJ9BjMfXcd34KCSx", "Z1GLpHy0HwkqSwW9khwr1bkH6PCRqbO5"};
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0872Ih A01;

    public RunnableC0870If(C0872Ih c0872Ih, Surface surface) {
        this.A01 = c0872Ih;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0873Ii = this.A01.A01;
            interfaceC0873Ii.ADM(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            if (A02[1].length() == 19) {
                throw new RuntimeException();
            }
            A02[6] = "65yeGhez1WQhZvxg8qVLZrzPC2Ou4KSa";
        }
    }
}
