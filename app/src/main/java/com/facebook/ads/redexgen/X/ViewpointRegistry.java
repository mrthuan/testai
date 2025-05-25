package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0007J*\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\f0\u0013J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\bR.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointRegistry;", "", "qeConfig", "Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "(Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;)V", "multiViewpointDataMap", "", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "Lcom/instagram/common/viewpoint/core/SharedViewpointManager$UniqueKey;", "Lcom/instagram/common/viewpoint/core/ViewpointData;", "viewpointDataMap", "getEligibleViews", "", "result", "", "getViewpointData", "node", "iterateMultiViewpointData", "action", "Lkotlin/Function1;", "registerView", "key", "viewpointData", "unregisterView", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dh  reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewpointRegistry {
    public static byte[] A03;
    public static String[] A04 = {"hdmlO0", "Pao0VUuQuwhiUKXn89wfKbyo9VlN", "lRas", "TeEMb6eZZD5whrU9be0IX5ZV1M9RKr26", "Qnqbn5lACluJ2ApCqm5BpSPW4vhAMGtg", "gvJZrbHq4P5HQU5ufyPQZZXTOJgB", "vCidj0D7LJg5PqPuMk2VvvwKDqfmQpdZ", "0ZH2VL3AtCsRULFWGVsN9oD"};
    public final II A00;
    public final Map<DspViewableNode, Map<C1545dt, Cdo<?, ?>>> A01;
    public final Map<DspViewableNode, Cdo<?, ?>> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[2].length() == 16) {
                throw new RuntimeException();
            }
            A04[4] = "98jXpaahab3bDGJdYqYLl1lSw3QVyboZ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 47);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-18, -10, -7, -3, 2, -98, -96, -79, -90, -84, -85, -94, -100, -80, -16, -15, -26, -25, 16, 4, -30, 14, 13, 5, 8, 6, -13, -26, -12, -10, -19, -11, -49, -62, -66, -48, -55, -56, -62, -57, -51, -99, -70, -51, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A05(DspViewableNode dspViewableNode, C1545dt c1545dt, Cdo<?, ?> cdo) {
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        C1512d7.A07(c1545dt, A00(11, 3, 8));
        C1512d7.A07(cdo, A00(32, 13, 42));
        Map<DspViewableNode, Map<C1545dt, Cdo<?, ?>>> map = this.A01;
        WeakHashMap weakHashMap = map.get(dspViewableNode);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            map.put(dspViewableNode, weakHashMap);
        }
        weakHashMap.put(c1545dt, cdo);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07(DspViewableNode dspViewableNode, InterfaceC0842Hd<? super Cdo<?, ?>, C1521dK> interfaceC0842Hd) {
        Collection<Cdo<?, ?>> values;
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        C1512d7.A07(interfaceC0842Hd, A00(5, 6, 14));
        Cdo<?, ?> cdo = this.A02.get(dspViewableNode);
        if (cdo != null) {
            interfaceC0842Hd.A9K(cdo);
        }
        Map<C1545dt, Cdo<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                interfaceC0842Hd.A9K((Cdo) it.next());
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A08(Collection<DspViewableNode> collection) {
        C1512d7.A07(collection, A00(26, 6, 82));
        collection.addAll(this.A02.keySet());
        if (this.A00.A00) {
            ArrayList<DspViewableNode> arrayList = new ArrayList();
            for (Object obj : this.A01.keySet()) {
                if (!this.A02.containsKey((DspViewableNode) obj)) {
                    arrayList.add(obj);
                }
            }
            for (DspViewableNode dspViewableNode : arrayList) {
                collection.add(dspViewableNode);
            }
        }
    }

    static {
        A01();
    }

    public ViewpointRegistry(II ii2) {
        C1512d7.A07(ii2, A00(18, 8, 112));
        this.A00 = ii2;
        this.A02 = new WeakHashMap();
        this.A01 = new WeakHashMap();
    }

    public final synchronized Cdo<?, ?> A02(DspViewableNode dspViewableNode) {
        Cdo<?, ?> cdo;
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        cdo = this.A02.get(dspViewableNode);
        if (cdo == null) {
            cdo = Cdo.A08;
            C1512d7.A06(cdo, A00(0, 5, 122));
        }
        return cdo;
    }

    public final synchronized void A03(DspViewableNode dspViewableNode) {
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        this.A02.remove(dspViewableNode);
    }

    public final synchronized void A04(DspViewableNode dspViewableNode, C1545dt c1545dt) {
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        C1512d7.A07(c1545dt, A00(11, 3, 8));
        Map nodeDataMap = this.A01.get(dspViewableNode);
        if (nodeDataMap != null) {
            nodeDataMap.remove(c1545dt);
            if (nodeDataMap.isEmpty()) {
                this.A01.remove(dspViewableNode);
            }
        }
    }

    public final synchronized void A06(DspViewableNode dspViewableNode, Cdo<?, ?> cdo) {
        C1512d7.A07(dspViewableNode, A00(14, 4, 83));
        C1512d7.A07(cdo, A00(32, 13, 42));
        this.A02.put(dspViewableNode, cdo);
    }
}
