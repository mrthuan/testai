package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Ed  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0779Ed implements ZB {
    public static byte[] A0M;
    public static String[] A0N = {"w8VAAYxajCwIoAYYjD3lLavMTkUOaMKn", "LsuplI2AFLx33t6glLoweUUwBxsDM6eJ", "n5ZpgNe8kAkQTw0twR8R0sU4HpYvcw33", "rwAXW1DnXASIJgDkZIisH2bihwrxiuKR", "nh92Wxhsr0aH2lO7Xy4xTBv2WwV0hwN3", "", "RFoFjGknfB0i2", "f5Io1mcG5jEJO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C06589h A05;
    public A1 A06;
    public A2 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0778Ec A0E;
    public final AK A0F;
    public final AL A0G;
    public final AbstractC0827Go A0H;
    public final C0828Gp A0I;
    public final ArrayDeque<C06629l> A0J;
    public final CopyOnWriteArraySet<A5> A0K;
    public final ZA[] A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{-35, 24, -48, 3, -6, -37, -9, -20, 4, -16, -3, -44, -8, -5, -9, Field.PAGEREF, Field.HYPERLINK, Field.AUTOTEXT, 48, 76, Field.SECTION, Field.AUTOTEXTLIST, Field.FILESIZE, 82, 44, Field.TOA, Field.SECTIONPAGES, 15, 18, 14, 24, 14, 20, 4, 41, 36, Field.GLOSSARY, -37, -64, -45, -38, -45, -49, -31, -45, -114, 14, -35, -96, -37, 34, 20, 20, 26, 3, 30, -49, 24, 22, 29, 30, 33, 20, 19, -49, 17, 20, 18, 16, 36, 34, 20, -49, 16, 29, -49, 16, 19, -49, 24, 34, -49, 31, Field.NUMWORDS, 16, Field.DATA, 24, 29, 22};
    }

    static {
        A03();
    }

    public C0779Ed(ZA[] zaArr, AbstractC0827Go abstractC0827Go, InterfaceC06729w interfaceC06729w, InterfaceC0847Hi interfaceC0847Hi) {
        Log.i(A02(2, 13, 30), A02(33, 5, 78) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 80) + A02(15, 18, 115) + A02(47, 3, 19) + IK.A04 + A02(46, 1, 68));
        AbstractC0844Hf.A04(zaArr.length > 0);
        this.A0L = (ZA[]) AbstractC0844Hf.A01(zaArr);
        this.A0H = (AbstractC0827Go) AbstractC0844Hf.A01(abstractC0827Go);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new C0828Gp(new AG[zaArr.length], new InterfaceC0824Gl[zaArr.length], null);
        this.A0G = new AL();
        this.A0F = new AK();
        this.A07 = A2.A05;
        final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0C = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.9k
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    C0779Ed.this.A0A(msg);
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                }
            }
        };
        this.A06 = new A1(AM.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0778Ec(zaArr, abstractC0827Go, this.A0I, interfaceC06729w, this.A0A, this.A03, this.A0B, this.A0C, this, interfaceC0847Hi);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j10) {
        long A01 = AbstractC06529b.A01(j10);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return A01 + positionMs;
        }
        return A01;
    }

    private A1 A01(boolean z10, boolean z11, int i10) {
        C0828Gp c0828Gp;
        if (z10) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A74();
            this.A00 = A07();
            this.A04 = A71();
        }
        AM am2 = z11 ? AM.A01 : this.A06.A03;
        Object obj = z11 ? null : this.A06.A07;
        Et et = this.A06.A04;
        long j10 = this.A06.A02;
        long j11 = this.A06.A01;
        TrackGroupArray trackGroupArray = z11 ? TrackGroupArray.A04 : this.A06.A05;
        if (z11) {
            c0828Gp = this.A0I;
        } else {
            c0828Gp = this.A06.A06;
        }
        return new A1(am2, obj, et, j10, j11, i10, false, trackGroupArray, c0828Gp);
    }

    private void A04(A1 a12, int i10, boolean z10, int i11) {
        int i12;
        A1 a13 = a12;
        this.A02 -= i10;
        if (this.A02 == 0) {
            if (a13.A02 == -9223372036854775807L) {
                a13 = a13.A04(a13.A04, 0L, a13.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && a13.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                if (A0N[2].charAt(11) == 'f') {
                    throw new RuntimeException();
                }
                A0N[2] = "I0z9XBogSeP4xaPMoEVv8Y3CsXKu0t6N";
                this.A04 = 0L;
            }
            if (this.A08) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z11 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(a13, z10, i11, i12, z11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final A1 a12, final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C06629l> arrayDeque = this.A0J;
        final A1 a13 = this.A06;
        final CopyOnWriteArraySet<A5> copyOnWriteArraySet = this.A0K;
        final AbstractC0827Go abstractC0827Go = this.A0H;
        final boolean z13 = this.A0A;
        arrayDeque.addLast(new Object(a12, a13, copyOnWriteArraySet, abstractC0827Go, z10, i10, i11, z11, z13, z12) { // from class: com.facebook.ads.redexgen.X.9l
            public static String[] A0C = {"KYzLQiBmn0FiQRjPmzMoZyTMXJUCYazH", "8ZWwkBEIP5GpfkYlq", "GsiX37b8ObJA1d3iwpzM", "DZldgTYE3duYcDTffrrsish34ss3C", "owziJE4ETQEY5DqdH7kHnL5e4jEZYH", "elngO9mL6FpjJEe4il6taIIRZ5n02WzG", "vc3a7vRG", "Ibw5ifPZZc9LdA"};
            public final int A00;
            public final int A01;
            public final A1 A02;
            public final AbstractC0827Go A03;
            public final Set<A5> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = a12;
                this.A04 = copyOnWriteArraySet;
                this.A03 = abstractC0827Go;
                this.A08 = z10;
                this.A00 = i10;
                this.A01 = i11;
                this.A09 = z11;
                this.A06 = z13;
                this.A07 = z12 || a13.A00 != a12.A00;
                this.A0A = (a13.A03 == a12.A03 && a13.A07 == a12.A07) ? false : true;
                this.A05 = a13.A08 != a12.A08;
                this.A0B = a13.A06 != a12.A06;
            }

            public final void A00() {
                Iterator<A5> it;
                if (this.A0A || this.A01 == 0) {
                    for (A5 a52 : this.A04) {
                        a52.ADm(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (A5 listener : this.A04) {
                        listener.ADA(this.A00);
                    }
                }
                boolean z14 = this.A0B;
                if (A0C[0].charAt(4) == 'F') {
                    throw new RuntimeException();
                }
                A0C[0] = "NSO1YjE0K80ooc4jlLY2PvdGV0yqHKRo";
                if (z14) {
                    this.A03.A0U(this.A02.A06.A02);
                    Set<A5> set = this.A04;
                    String[] strArr = A0C;
                    if (strArr[1].length() != strArr[2].length()) {
                        A0C[0] = "IX8AzuZF3sh97knAPev8KtZkbQXBOL0k";
                        it = set.iterator();
                    } else {
                        String[] strArr2 = A0C;
                        strArr2[7] = "IystOXtUMajZr4";
                        strArr2[6] = "BmaC5zCJ";
                        it = set.iterator();
                    }
                    while (it.hasNext()) {
                        it.next().ADp(this.A02.A05, this.A02.A06.A01);
                    }
                }
                if (this.A05) {
                    for (A5 listener2 : this.A04) {
                        listener2.ACY(this.A02.A08);
                    }
                }
                if (this.A07) {
                    for (A5 a53 : this.A04) {
                        a53.AD8(this.A06, this.A02.A00);
                    }
                }
                boolean z15 = this.A09;
                if (A0C[5].charAt(19) == 't') {
                    String[] strArr3 = A0C;
                    strArr3[3] = "rZ5iCKv2iyJCL3c8gXhMhKHhXlzWd";
                    strArr3[4] = "JkBTkyzl6HurESuXa9ju20RiiMzRa3";
                    if (!z15) {
                        return;
                    }
                } else if (!z15) {
                    return;
                }
                for (A5 a54 : this.A04) {
                    a54.ADX();
                }
            }
        });
        this.A06 = a12;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i10) {
        A09(i10, -9223372036854775807L);
    }

    public final void A09(int i10, long j10) {
        long A00;
        AM am2 = this.A06.A03;
        if (i10 < 0 || (!am2.A0E() && i10 >= am2.A01())) {
            throw new C06719v(am2, i10, j10);
        }
        this.A09 = true;
        this.A02++;
        if (A0B()) {
            Log.w(A02(2, 13, 30), A02(50, 39, 66));
            this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
            return;
        }
        this.A01 = i10;
        if (am2.A0E()) {
            this.A04 = j10 == -9223372036854775807L ? 0L : j10;
            this.A00 = 0;
        } else {
            if (j10 == -9223372036854775807L) {
                A00 = am2.A0B(i10, this.A0G).A01();
            } else {
                A00 = AbstractC06529b.A00(j10);
            }
            Pair<Integer, Long> A07 = am2.A07(this.A0G, this.A0F, i10, A00);
            this.A04 = AbstractC06529b.A01(A00);
            this.A00 = ((Integer) A07.first).intValue();
        }
        this.A0E.A0y(am2, i10, AbstractC06529b.A00(j10));
        Iterator<A5> it = this.A0K.iterator();
        while (it.hasNext()) {
            it.next().ADA(1);
        }
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((A1) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                A2 a22 = (A2) message.obj;
                A2 playbackParameters = this.A07;
                if (!playbackParameters.equals(a22)) {
                    this.A07 = a22;
                    Iterator<A5> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        A5 next = it.next();
                        String[] strArr = A0N;
                        if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0N;
                        strArr2[1] = "Rx35SoFeg5J49OemA5SmkfILnHIw2zPV";
                        strArr2[4] = "AOCcqe8qUBOiNNfFwZNpwcN90njeUUle";
                        next.AD4(a22);
                    }
                    return;
                }
                return;
            case 2:
                C06589h c06589h = (C06589h) message.obj;
                this.A05 = c06589h;
                Iterator<A5> it2 = this.A0K.iterator();
                while (it2.hasNext()) {
                    it2.next().AD6(c06589h);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void A3m(A5 a52) {
        this.A0K.add(a52);
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final AD A51(AC ac2) {
        return new AD(this.A0E, ac2, this.A06.A03, A74(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6Z() {
        long A6a = A6a();
        long A7E = A7E();
        if (A6a == -9223372036854775807L || A7E == -9223372036854775807L) {
            return 0;
        }
        if (A7E == 0) {
            return 100;
        }
        return IK.A06((int) ((100 * A6a) / A7E), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A6a() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A6w() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AbstractC06529b.A01(this.A06.A01);
        }
        return A71();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6y() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A6z() {
        if (A0B()) {
            Et et = this.A06.A04;
            String[] strArr = A0N;
            if (strArr[1].charAt(26) != strArr[4].charAt(26)) {
                String[] strArr2 = A0N;
                strArr2[6] = "CcD4McdZf45PB";
                strArr2[7] = "2ShBxbZH9Pfqw";
                return et.A01;
            }
            throw new RuntimeException();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A71() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final AM A73() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final int A74() {
        if (A06()) {
            int i10 = this.A01;
            String[] strArr = A0N;
            if (strArr[1].charAt(26) != strArr[4].charAt(26)) {
                A0N[5] = "";
                return i10;
            }
            throw new RuntimeException();
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final long A7E() {
        AM am2 = this.A06.A03;
        if (am2.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            Et et = this.A06.A04;
            am2.A09(et.A02, this.A0F);
            return AbstractC06529b.A01(this.A0F.A0A(et.A00, et.A01));
        }
        return am2.A0B(A74(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final boolean A84() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final void AEY(Ev ev, boolean z10, boolean z11) {
        this.A05 = null;
        A1 A01 = A01(z10, z11, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(ev, z10, z11);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AEy() {
        StringBuilder append = new StringBuilder().append(A02(38, 8, 1)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 80)).append(A02(15, 18, 115));
        String A02 = A02(47, 3, 19);
        Log.i(A02(2, 13, 30), append.append(A02).append(IK.A04).append(A02).append(C06689r.A00()).append(A02(46, 1, 68)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AG9(long j10) {
        A09(A74(), j10);
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AGA() {
        A08(A74());
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AGZ(boolean z10) {
        if (this.A0A != z10) {
            this.A0A = z10;
            this.A0E.A10(z10);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AA
    public final void AH2(boolean z10) {
        if (z10) {
            this.A05 = null;
        }
        A1 A01 = A01(z10, z10, 1);
        this.A02++;
        this.A0E.A11(z10);
        A05(A01, false, 4, 1, false, false);
    }
}
