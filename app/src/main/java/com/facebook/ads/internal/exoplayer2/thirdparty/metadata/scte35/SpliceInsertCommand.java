package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0771Du;
import com.facebook.ads.redexgen.X.C0772Dv;
import com.facebook.ads.redexgen.X.I4;
import com.facebook.ads.redexgen.X.IG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"o7T1oZxGxBAHWlRkOQbegsoO93grXIxk", "XvHj8Hk7hABY8IbbTIjHE9pA", "b34rJCODGAR2kw7", "DkxrTnoqNZJiwxANPjTMYz", "HEmBXoCf3O0IVvOMBCnyZOWE", "qlaxw3mTgaR0aM1", "MzIHyiWSWVKcGZIDQW3LWEN9ullkmdDP", "EF2bbwfelQ72cJWGrchq3sqAmXqEDeOA"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C0771Du();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C0772Dv> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<C0772Dv> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.A06 = j10;
        this.A0B = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0C = z13;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z14;
        this.A03 = j13;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(C0772Dv.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C0771Du c0771Du) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(I4 i42, long j10, IG ig2) {
        long A0M = i42.A0M();
        boolean z10 = (i42.A0E() & 128) != 0;
        boolean z11 = false;
        boolean outOfNetworkIndicator = false;
        boolean z12 = false;
        long j11 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j12 = -9223372036854775807L;
        if (!z10) {
            int A0E = i42.A0E();
            z11 = (A0E & 128) != 0;
            outOfNetworkIndicator = (A0E & 64) != 0;
            boolean autoReturn = (A0E & 32) != 0;
            int i13 = A0E & 16;
            if (A0D[3].length() != 22) {
                throw new RuntimeException();
            }
            A0D[3] = "PfD4phwgK3fDtd36VsgCIY";
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (outOfNetworkIndicator && !z12) {
                j11 = TimeSignalCommand.A00(i42, j10);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = i42.A0E();
                emptyList = new ArrayList(componentCount);
                for (int i14 = 0; i14 < componentCount; i14++) {
                    int componentTag = i42.A0E();
                    long j13 = -9223372036854775807L;
                    if (!z12) {
                        j13 = TimeSignalCommand.A00(i42, j10);
                    }
                    emptyList.add(new C0772Dv(componentTag, j13, ig2.A07(j13), null));
                }
            }
            if (autoReturn) {
                long A0E2 = i42.A0E();
                z13 = (A0E2 & 128) != 0;
                j12 = (1000 * (((A0E2 & 1) << 32) | i42.A0M())) / 90;
            }
            i10 = i42.A0I();
            i11 = i42.A0E();
            i12 = i42.A0E();
        }
        return new SpliceInsertCommand(A0M, z10, z11, outOfNetworkIndicator, z12, j11, ig2.A07(j11), emptyList, z13, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            List<C0772Dv> list = this.A07;
            String[] strArr = A0D;
            String str = strArr[2];
            String str2 = strArr[5];
            int i12 = str.length();
            int componentSpliceListSize = str2.length();
            if (i12 != componentSpliceListSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "4YWbA25kauTneX5iGtOo38Lw";
            strArr2[4] = "7oIVhYtWgczHhLZ4eBK9i0jf";
            list.get(i11).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize2 = this.A02;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A00;
        parcel.writeInt(componentSpliceListSize3);
        int componentSpliceListSize4 = this.A01;
        parcel.writeInt(componentSpliceListSize4);
    }
}
