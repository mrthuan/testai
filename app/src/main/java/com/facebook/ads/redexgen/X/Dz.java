package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Dz {
    public static String[] A0B = {"MbQlclBS93OpAIrGgy", "fr4nhdwawCkfl6xe", "", "jazGPK14ugDp9XSpPVwjXwSunadlaYol", "c8hCDXw30CLUJvo3hmXfNwPZepkI4Dm3", "1stzsAzc5mICw7Ui", "zsUepILv7pzPEMGeAcwpA2C", "FE9c5HnV3VVOUNIp57h4JuspLxtKtT80"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0775Dy> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Dz A02(I4 i42) {
        long A0M = i42.A0M();
        boolean z10 = (i42.A0E() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j10 = -9223372036854775807L;
        if (!z10) {
            int A0E = i42.A0E();
            z11 = (A0E & 128) != 0;
            z12 = (A0E & 64) != 0;
            int i13 = A0E & 32;
            if (A0B[4].charAt(19) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[1] = "lR24oTmvDHmhIRnH";
            strArr[5] = "ZGf4jEcTYFHAfCYP";
            boolean z14 = i13 != 0;
            r14 = z12 ? i42.A0M() : -9223372036854775807L;
            if (!z12) {
                int A0E2 = i42.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i14 = 0; i14 < A0E2; i14++) {
                    arrayList.add(new C0775Dy(i42.A0E(), i42.A0M(), null));
                }
            }
            if (z14) {
                long A0E3 = i42.A0E();
                z13 = (128 & A0E3) != 0;
                j10 = (1000 * (((1 & A0E3) << 32) | i42.A0M())) / 90;
            }
            i10 = i42.A0I();
            i11 = i42.A0E();
            i12 = i42.A0E();
        }
        return new Dz(A0M, z10, z11, z12, arrayList, r14, z13, j10, i10, i11, i12);
    }

    public Dz(long j10, boolean z10, boolean z11, boolean z12, List<C0775Dy> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public Dz(Parcel parcel) {
        C0775Dy A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = C0775Dy.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static Dz A00(Parcel parcel) {
        return new Dz(parcel);
    }

    public static /* synthetic */ Dz A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ Dz A03(I4 i42) {
        return A02(i42);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }

    public static /* synthetic */ void A05(Dz dz, Parcel parcel) {
        dz.A04(parcel);
    }
}
