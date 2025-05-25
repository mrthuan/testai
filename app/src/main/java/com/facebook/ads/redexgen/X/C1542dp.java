package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.dp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1542dp<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final String A05;
    public List<InterfaceC1544dr<ModelType, StateType>> A01 = null;
    public Cdo A00 = Cdo.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1542dp(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A05 = str;
        this.A04 = str;
    }

    public static /* synthetic */ Cdo A00(C1542dp c1542dp) {
        return c1542dp.A00;
    }

    public static /* synthetic */ Object A01(C1542dp c1542dp) {
        return c1542dp.A02;
    }

    public static /* synthetic */ Object A02(C1542dp c1542dp) {
        return c1542dp.A03;
    }

    public static /* synthetic */ String A03(C1542dp c1542dp) {
        return c1542dp.A05;
    }

    public static /* synthetic */ List A04(C1542dp c1542dp) {
        return c1542dp.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dr != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1542dp<ModelType, StateType> A05(InterfaceC1544dr<ModelType, StateType> interfaceC1544dr) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1544dr);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final Cdo<ModelType, StateType> A06() {
        return new Cdo<>(this);
    }
}
