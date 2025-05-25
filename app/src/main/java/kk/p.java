package kk;

import java.util.ArrayList;
import java.util.RandomAccess;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import okio.ByteString;

/* compiled from: Options.kt */
/* loaded from: classes3.dex */
public final class p extends kotlin.collections.b<ByteString> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final ByteString[] f19840a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f19841b;

    /* compiled from: Options.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(long j10, f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
            boolean z10;
            int i13;
            int i14;
            boolean z11;
            int i15;
            int i16;
            f fVar2;
            long j11;
            boolean z12;
            int i17 = i10;
            if (i11 < i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                for (int i18 = i11; i18 < i12; i18++) {
                    if (((ByteString) arrayList.get(i18)).size() >= i17) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) arrayList.get(i11);
                ByteString byteString2 = (ByteString) arrayList.get(i12 - 1);
                int i19 = -1;
                if (i17 == byteString.size()) {
                    int intValue = ((Number) arrayList2.get(i11)).intValue();
                    int i20 = i11 + 1;
                    ByteString byteString3 = (ByteString) arrayList.get(i20);
                    i13 = i20;
                    i14 = intValue;
                    byteString = byteString3;
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (byteString.getByte(i17) != byteString2.getByte(i17)) {
                    int i21 = 1;
                    for (int i22 = i13 + 1; i22 < i12; i22++) {
                        if (((ByteString) arrayList.get(i22 - 1)).getByte(i17) != ((ByteString) arrayList.get(i22)).getByte(i17)) {
                            i21++;
                        }
                    }
                    long j12 = 4;
                    long j13 = (i21 * 2) + (fVar.f19826b / j12) + j10 + 2;
                    fVar.t(i21);
                    fVar.t(i14);
                    for (int i23 = i13; i23 < i12; i23++) {
                        int i24 = ((ByteString) arrayList.get(i23)).getByte(i17);
                        if (i23 == i13 || i24 != ((ByteString) arrayList.get(i23 - 1)).getByte(i17)) {
                            fVar.t(i24 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        }
                    }
                    f fVar3 = new f();
                    while (i13 < i12) {
                        byte b10 = ((ByteString) arrayList.get(i13)).getByte(i17);
                        int i25 = i13 + 1;
                        int i26 = i25;
                        while (true) {
                            if (i26 < i12) {
                                if (b10 != ((ByteString) arrayList.get(i26)).getByte(i17)) {
                                    i15 = i26;
                                    break;
                                }
                                i26++;
                            } else {
                                i15 = i12;
                                break;
                            }
                        }
                        if (i25 == i15 && i17 + 1 == ((ByteString) arrayList.get(i13)).size()) {
                            fVar.t(((Number) arrayList2.get(i13)).intValue());
                            i16 = i15;
                            fVar2 = fVar3;
                            j11 = j12;
                        } else {
                            fVar.t(((int) ((fVar3.f19826b / j12) + j13)) * i19);
                            i16 = i15;
                            fVar2 = fVar3;
                            j11 = j12;
                            a(j13, fVar3, i17 + 1, arrayList, i13, i16, arrayList2);
                        }
                        fVar3 = fVar2;
                        i13 = i16;
                        j12 = j11;
                        i19 = -1;
                    }
                    fVar.M(fVar3);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i27 = 0;
                for (int i28 = i17; i28 < min && byteString.getByte(i28) == byteString2.getByte(i28); i28++) {
                    i27++;
                }
                long j14 = 4;
                long j15 = (fVar.f19826b / j14) + j10 + 2 + i27 + 1;
                fVar.t(-i27);
                fVar.t(i14);
                int i29 = i17 + i27;
                while (i17 < i29) {
                    fVar.t(byteString.getByte(i17) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i29 == ((ByteString) arrayList.get(i13)).size()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        fVar.t(((Number) arrayList2.get(i13)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar4 = new f();
                fVar.t(((int) ((fVar4.f19826b / j14) + j15)) * (-1));
                a(j15, fVar4, i29, arrayList, i13, i12, arrayList2);
                fVar.M(fVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kk.p b(okio.ByteString... r13) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kk.p.a.b(okio.ByteString[]):kk.p");
        }
    }

    public p(ByteString[] byteStringArr, int[] iArr) {
        this.f19840a = byteStringArr;
        this.f19841b = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ByteString)) {
            return false;
        }
        return super.contains((ByteString) obj);
    }

    @Override // kotlin.collections.b, java.util.List
    public final Object get(int i10) {
        return this.f19840a[i10];
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f19840a.length;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return super.indexOf((ByteString) obj);
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return super.lastIndexOf((ByteString) obj);
    }
}
