package com.inmobi.media;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class A6 extends Lambda implements cg.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f14124a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6(int[] iArr) {
        super(1);
        this.f14124a = iArr;
    }

    @Override // cg.l
    public final Object invoke(Object obj) {
        H1 event = (H1) obj;
        kotlin.jvm.internal.g.e(event, "event");
        int[] iArr = this.f14124a;
        int i10 = event.f14310a;
        kotlin.jvm.internal.g.e(iArr, "<this>");
        int length = iArr.length;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (i10 == iArr[i11]) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
