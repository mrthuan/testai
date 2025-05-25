package com.inmobi.media;

/* renamed from: com.inmobi.media.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1605e0 implements Y0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1633g0 f15022a;

    public C1605e0(C1633g0 c1633g0) {
        this.f15022a = c1633g0;
    }

    @Override // com.inmobi.media.Y0
    public final void a(C1688k assetBatch, byte b10) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        C1633g0 c1633g0 = this.f15022a;
        A4 a42 = c1633g0.f15084f;
        if (a42 != null) {
            String str = c1633g0.f15082d;
            kotlin.jvm.internal.g.d(str, "access$getTAG$p(...)");
            ((B4) a42).b(str, "onAssetsFetchFailure of batch " + assetBatch);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    @Override // com.inmobi.media.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.C1688k r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1605e0.a(com.inmobi.media.k):void");
    }
}
