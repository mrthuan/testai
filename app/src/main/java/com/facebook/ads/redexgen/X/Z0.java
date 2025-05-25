package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class Z0 implements InterfaceC0682Ag {
    public static String[] A06 = {"x4SLKw0ecPcHsWHgO1Td4vJ14144RMMS", "Zh7tfC3TFBRtLhPe9z1RavfnQghohUvM", "5a1nSgSc9ubjxiTpcQH3XZ5BSJHYyomE", "9hzCYTVbSoKGzhiGE0INbgm8vz2Ul1tD", "U5QynYTJKvqXrBDteFA3kKN8MUDMbs9q", "vYVMMAOqO79qbNxEgxq93Z6FBxHJHfxt", "X8bjNxmBNAlkg", "EWWs7bfWX2zABqEPcCAhkdtns4Cu5rHI"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = InterfaceC0682Ag.A00;
    public ByteBuffer A04 = InterfaceC0682Ag.A00;

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A4m(int i10, int i11, int i12) throws C0681Af {
        if (i12 == 3 || i12 == 2 || i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            if (this.A02 == i10 && this.A00 == i11 && this.A01 == i12) {
                return false;
            }
            this.A02 = i10;
            this.A00 = i11;
            this.A01 = i12;
            return true;
        }
        throw new C0681Af(i10, i11, i12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = InterfaceC0682Ag.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7v() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final int A7x() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A9L() {
        return (this.A01 == 0 || this.A01 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final boolean A9Q() {
        if (this.A05) {
            ByteBuffer byteBuffer = this.A04;
            ByteBuffer byteBuffer2 = InterfaceC0682Ag.A00;
            if (A06[3].charAt(27) != 'U') {
                throw new RuntimeException();
            }
            A06[6] = "37MFS79N5bC4O";
            if (byteBuffer == byteBuffer2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void AEh() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void AEi(ByteBuffer byteBuffer) {
        int limit;
        int i10 = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i10;
        int position = this.A01;
        switch (position) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case 1073741824:
                limit = limit2 / 2;
                break;
            default:
                throw new IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            this.A03 = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i11 = this.A01;
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[0];
        int limit3 = str.charAt(21);
        int position4 = str2.charAt(21);
        if (limit3 != position4) {
            throw new RuntimeException();
        }
        A06[4] = "sqNpl1OaV4AX2PiDopzrEiO6zTyyi8x2";
        switch (i11) {
            case SlideAtom.USES_MASTER_SLIDE_ID /* -2147483648 */:
                while (i10 < resampledSize) {
                    int position5 = i10 + 1;
                    this.A03.put(byteBuffer.get(position5));
                    int position6 = i10 + 2;
                    this.A03.put(byteBuffer.get(position6));
                    i10 += 3;
                }
                break;
            case 3:
                while (i10 < resampledSize) {
                    this.A03.put((byte) 0);
                    ByteBuffer byteBuffer2 = this.A03;
                    int position7 = byteBuffer.get(i10);
                    byteBuffer2.put((byte) ((position7 & FunctionEval.FunctionID.EXTERNAL_FUNC) - 128));
                    i10++;
                }
                break;
            case 1073741824:
                while (i10 < resampledSize) {
                    int position8 = i10 + 2;
                    this.A03.put(byteBuffer.get(position8));
                    int position9 = i10 + 3;
                    this.A03.put(byteBuffer.get(position9));
                    i10 += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void flush() {
        this.A04 = InterfaceC0682Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0682Ag
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = InterfaceC0682Ag.A00;
    }
}
