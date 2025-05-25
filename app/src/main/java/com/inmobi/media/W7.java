package com.inmobi.media;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes2.dex */
public final class W7 extends W6 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public int D;
    public int E;
    public HashMap F;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f14808x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f14809y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(String assetId, String assetName, V7 assetStyle, InterfaceC1673ic interfaceC1673ic, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ArrayList arrayList, boolean z15) {
        super(assetId, assetName, "VIDEO", assetStyle, 16);
        String str;
        ArrayList<P7> arrayList2;
        boolean z16;
        boolean z17;
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        this.f14808x = z15;
        this.f14789e = interfaceC1673ic;
        this.f14791g = "EXTERNAL";
        this.f14810z = z10;
        this.A = z11;
        this.B = z12;
        this.C = z13;
        this.f14809y = new ArrayList();
        Map map = null;
        if (interfaceC1673ic != null) {
            str = ((C1659hc) interfaceC1673ic).f15151h;
        } else {
            str = null;
        }
        this.f14800p = str;
        if (interfaceC1673ic != null) {
            arrayList2 = ((C1659hc) interfaceC1673ic).f15148e;
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                P7 p72 = (P7) it.next();
                if (kotlin.jvm.internal.g.a("OMID_VIEWABILITY", p72.c)) {
                    map = p72.f14578d;
                    if (!TextUtils.isEmpty(p72.f14579e)) {
                        if ((arrayList2 instanceof List) && (!(arrayList2 instanceof dg.a) || (arrayList2 instanceof dg.c))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            arrayList2.add(p72);
                        }
                    }
                } else {
                    if ((arrayList2 instanceof List) && (!(arrayList2 instanceof dg.a) || (arrayList2 instanceof dg.c))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        arrayList2.add(p72);
                    }
                }
            }
        }
        if (arrayList2 != null) {
            for (P7 p73 : arrayList2) {
                if (kotlin.jvm.internal.g.a("OMID_VIEWABILITY", p73.c)) {
                    p73.f14578d = map;
                }
            }
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            this.f14803s.addAll(arrayList2);
        }
        HashMap hashMap = this.f14804t;
        hashMap.put("placementType", (byte) 0);
        hashMap.put("lastVisibleTimestamp", Integer.valueOf((int) SlideAtom.USES_MASTER_SLIDE_ID));
        Boolean bool = Boolean.FALSE;
        hashMap.put("visible", bool);
        hashMap.put("seekPosition", 0);
        hashMap.put("didStartPlaying", bool);
        hashMap.put("didPause", bool);
        hashMap.put("didCompleteQ1", bool);
        hashMap.put("didCompleteQ2", bool);
        hashMap.put("didCompleteQ3", bool);
        hashMap.put("didCompleteQ4", bool);
        hashMap.put("didRequestFullScreen", bool);
        hashMap.put("isFullScreen", bool);
        hashMap.put("didImpressionFire", bool);
        hashMap.put("mapViewabilityParams", new HashMap());
        hashMap.put("didSignalVideoCompleted", bool);
        hashMap.put("shouldAutoPlay", Boolean.valueOf(z14));
        hashMap.put("lastMediaVolume", 0);
        hashMap.put("currentMediaVolume", 0);
        hashMap.put("didQ4Fire", bool);
    }

    public final boolean a() {
        if (this.f14808x) {
            return this.f14810z && !Ha.o();
        }
        return this.f14810z;
    }

    public final void b(int i10) {
        this.E = i10;
    }

    public final InterfaceC1673ic b() {
        Object obj = this.f14789e;
        if (obj instanceof InterfaceC1673ic) {
            return (InterfaceC1673ic) obj;
        }
        return null;
    }

    public final void a(int i10) {
        this.D = i10;
    }

    public final void a(HashMap hashMap) {
        this.F = new HashMap(hashMap);
    }

    public final void a(W7 source) {
        HashMap hashMap;
        kotlin.jvm.internal.g.e(source, "source");
        this.f14804t.putAll(source.f14804t);
        HashMap hashMap2 = source.F;
        if (hashMap2 != null && (hashMap = this.F) != null) {
            hashMap.putAll(hashMap2);
        }
        ArrayList trackers = source.f14803s;
        kotlin.jvm.internal.g.e(trackers, "trackers");
        this.f14803s.addAll(trackers);
    }
}
