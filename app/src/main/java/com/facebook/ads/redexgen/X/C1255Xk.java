package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1255Xk implements InterfaceC0752Db {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0752Db
    public final Metadata A5N(EX ex) {
        ByteBuffer byteBuffer = ex.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        I4 i42 = new I4(array, limit);
        String A0Q = i42.A0Q();
        String A0Q2 = i42.A0Q();
        long A0M = i42.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, IK.A0F(i42.A0M(), 1000L, A0M), i42.A0M(), Arrays.copyOfRange(array, i42.A06(), limit), IK.A0F(i42.A0M(), 1000000L, A0M)));
    }
}
