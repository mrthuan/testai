package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.redexgen.X.C0818Gd;
import com.facebook.ads.redexgen.X.IK;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I = {"8cmZQKSr4e", "iMp0vhQuApByAzd3UlzuqPNosBBIij56", "lQE7OUEJZwYk", "ijVF0TjJmPEEom5xXBBS3MNokpliI9Vz", "24priIiqAscL", "HHTbuc6jJnpbFValFtkFIwv24qRilhed", "j1grCTc2L", "MPdgTc6Z3sPUFClC4uSLQHQa2XebDs9v"};
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new C0818Gd();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A01(Parcel parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i10);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> r5, java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> r6) {
        /*
            int r1 = r5.size()
            int r0 = r6.size()
            r4 = 0
            if (r0 == r1) goto Lc
            return r4
        Lc:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r2 = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray) r2
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r6.get(r2)
            boolean r0 = com.facebook.ads.redexgen.X.IK.A0g(r1, r0)
            if (r0 != 0) goto L14
        L3a:
            return r4
        L3b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters.A04(java.util.Map, java.util.Map):boolean");
    }

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = IK.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = IK.A0f(parcel);
        this.A09 = IK.A0f(parcel);
        this.A0A = IK.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = IK.A0f(parcel);
        this.A0B = IK.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = IK.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = IK.A0L(str);
        this.A08 = IK.A0L(str2);
        this.A0E = z10;
        this.A00 = i10;
        this.A0D = z11;
        this.A09 = z12;
        this.A0A = z13;
        this.A03 = i11;
        this.A02 = i12;
        this.A01 = i13;
        this.A0C = z14;
        this.A0B = z15;
        this.A06 = i14;
        this.A05 = i15;
        this.A0F = z16;
        this.A04 = i16;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            int readInt2 = parcel.readInt();
            int overrideCount = parcel.readInt();
            HashMap hashMap = new HashMap(overrideCount);
            for (int i11 = 0; i11 < overrideCount; i11++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        return sparseArray;
    }

    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> second, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = second.size();
        int firstSize = sparseArray.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int keyAt = second.keyAt(indexInSecond);
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int indexInFirst = str.charAt(21);
            int firstSize2 = str2.charAt(21);
            if (indexInFirst == firstSize2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "cTRaF8RO9nXx";
            strArr2[4] = "EDqN0kPd4EtP";
            int firstSize3 = sparseArray.indexOfKey(keyAt);
            if (firstSize3 < 0 || !A04(second.valueAt(indexInSecond), sparseArray.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final DefaultTrackSelector$SelectionOverride A05(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i10);
        if (overrides != null) {
            return overrides.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i10) {
        return this.A0H.get(i10);
    }

    public final boolean A07(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i10);
        return overrides != null && overrides.containsKey(trackGroupArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
        if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02) {
            boolean z10 = this.A0C;
            boolean z11 = defaultTrackSelector$Parameters.A0C;
            String[] strArr = A0I;
            if (strArr[5].charAt(6) == strArr[7].charAt(6)) {
                String[] strArr2 = A0I;
                strArr2[2] = "sfh4v5JH9YfM";
                strArr2[4] = "60euWtnhJ0n7";
                if (z10 == z11 && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01) {
                    int i10 = this.A04;
                    String[] strArr3 = A0I;
                    if (strArr3[3].charAt(21) != strArr3[1].charAt(21)) {
                        String[] strArr4 = A0I;
                        strArr4[3] = "jFxDzMr4Wl6CXL9gL9bgBgUZ4CFyGZQQ";
                        strArr4[1] = "AvCBIiMA1IKKXmLhd6rc5nfLtcJ8dACa";
                        if (i10 == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0E ? 1 : 0;
        int i10 = result * 31;
        int result2 = this.A00;
        int result3 = this.A09 ? 1 : 0;
        int result4 = this.A03;
        int result5 = this.A0C ? 1 : 0;
        int result6 = this.A0F ? 1 : 0;
        int result7 = this.A05;
        int result8 = this.A04;
        return ((((((((((((((((((((((((((((i10 + result2) * 31) + (this.A0D ? 1 : 0)) * 31) + result3) * 31) + (this.A0A ? 1 : 0)) * 31) + result4) * 31) + this.A02) * 31) + result5) * 31) + (this.A0B ? 1 : 0)) * 31) + result6) * 31) + this.A06) * 31) + result7) * 31) + this.A01) * 31) + result8) * 31) + (this.A07 == null ? 0 : this.A07.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        IK.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        IK.A0V(parcel, this.A0D);
        IK.A0V(parcel, this.A09);
        IK.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        IK.A0V(parcel, this.A0C);
        IK.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        IK.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
