package io.flutter.embedding.engine.systemchannels;

import gf.h;
import gf.k;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class PlatformViewsChannel {

    /* renamed from: a  reason: collision with root package name */
    public final h f18679a;

    /* renamed from: b  reason: collision with root package name */
    public d f18680b;

    /* loaded from: classes.dex */
    public static class PlatformViewCreationRequest {

        /* renamed from: a  reason: collision with root package name */
        public final int f18681a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18682b;

        /* loaded from: classes.dex */
        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i10, String str, double d10, double d11, double d12, double d13, int i11, RequestedDisplayMode requestedDisplayMode, ByteBuffer byteBuffer) {
            this.f18681a = i10;
            this.f18682b = i11;
        }
    }

    /* loaded from: classes.dex */
    public class a implements h.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0320, code lost:
            r3 = io.flutter.plugin.platform.j.this;
            r7 = (io.flutter.plugin.platform.f) r3.f18812a.f4082a.get(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x032c, code lost:
            if (r7 == null) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x032e, code lost:
            if (r29 != null) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0330, code lost:
            r6 = r7.a();
            r7 = r6.getView();
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0338, code lost:
            if (r7 == null) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x033a, code lost:
            r7.setLayoutDirection(r0);
            r3.f18820j.put(r4, r6);
            r36.c(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x034e, code lost:
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x034f, code lost:
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0363, code lost:
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
            return;
         */
        @Override // gf.h.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(wk.g r35, gf.g r36) {
            /*
                Method dump skipped, instructions count: 1098
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.a.a(wk.g, gf.g):void");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f18685a;

        /* renamed from: b  reason: collision with root package name */
        public final double f18686b;
        public final double c;

        public b(double d10, double d11, int i10) {
            this.f18685a = i10;
            this.f18686b = d10;
            this.c = d11;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f18687a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f18688b;
        public final Number c;

        /* renamed from: d  reason: collision with root package name */
        public final int f18689d;

        /* renamed from: e  reason: collision with root package name */
        public final int f18690e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f18691f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f18692g;

        /* renamed from: h  reason: collision with root package name */
        public final int f18693h;

        /* renamed from: i  reason: collision with root package name */
        public final int f18694i;

        /* renamed from: j  reason: collision with root package name */
        public final float f18695j;

        /* renamed from: k  reason: collision with root package name */
        public final float f18696k;

        /* renamed from: l  reason: collision with root package name */
        public final int f18697l;

        /* renamed from: m  reason: collision with root package name */
        public final int f18698m;

        /* renamed from: n  reason: collision with root package name */
        public final int f18699n;

        /* renamed from: o  reason: collision with root package name */
        public final int f18700o;

        /* renamed from: p  reason: collision with root package name */
        public final long f18701p;

        public c(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f18687a = i10;
            this.f18688b = number;
            this.c = number2;
            this.f18689d = i11;
            this.f18690e = i12;
            this.f18691f = obj;
            this.f18692g = obj2;
            this.f18693h = i13;
            this.f18694i = i14;
            this.f18695j = f10;
            this.f18696k = f11;
            this.f18697l = i15;
            this.f18698m = i16;
            this.f18699n = i17;
            this.f18700o = i18;
            this.f18701p = j10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public PlatformViewsChannel(we.a aVar) {
        a aVar2 = new a();
        h hVar = new h(aVar, "flutter/platform_views", k.f17803b);
        this.f18679a = hVar;
        hVar.b(aVar2);
    }
}
