package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class IX implements Choreographer.FrameCallback, Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"iaBjp1AwQpLLyKyeruBkx6nhfTHAU7OM", "YE4EgMmckJIUd", "A87", "Ho8PurbR6Cuk9", "5V8W8EI9U29WYa7jcvhHGtBRQdjRXn2G", "xaEjUNqWNgJl7N86hHENKKoi0wcRoA", "gba", "E6ac03H168kqXbQykfGaXhm8c3r5vcbJ"};
    public static final IX A07;
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public volatile long A04 = -9223372036854775807L;
    public final HandlerThread A03 = new HandlerThread(A01(0, 26, 0));

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {111, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.TOA, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.GREETINGLINE, 77, Field.BIDIOUTLINE, Field.INCLUDETEXT, Field.TOA, Field.GREETINGLINE, 99, Field.HTMLCONTROL, Field.SECTIONPAGES, Field.TOA, Field.GREETINGLINE, 22, 100, 77, Field.SECTIONPAGES, Field.NOTEREF, 64, Field.TOA, Field.GREETINGLINE};
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[1] = "IihRFBQ0QWx9C";
        strArr2[3] = "2DRBdjbeYJhWc";
        A05 = bArr;
    }

    static {
        A05();
        A07 = new IX();
    }

    public IX() {
        this.A03.start();
        this.A02 = new Handler(this.A03.getLooper(), this);
        this.A02.sendEmptyMessage(0);
    }

    public static IX A00() {
        return A07;
    }

    private void A02() {
        this.A00++;
        if (this.A00 == 1) {
            this.A01.postFrameCallback(this);
        }
    }

    private void A03() {
        this.A01 = Choreographer.getInstance();
    }

    private void A04() {
        this.A00--;
        if (this.A00 == 0) {
            this.A01.removeFrameCallback(this);
            this.A04 = -9223372036854775807L;
        }
    }

    public final void A06() {
        this.A02.sendEmptyMessage(1);
    }

    public final void A07() {
        this.A02.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.A04 = j10;
        this.A01.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A03();
                return true;
            case 1:
                A02();
                return true;
            case 2:
                A04();
                String[] strArr = A06;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[6] = "Hfi";
                strArr2[2] = "XBf";
                return true;
            default:
                return false;
        }
    }
}
