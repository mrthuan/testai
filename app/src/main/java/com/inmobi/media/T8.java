package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;

/* loaded from: classes2.dex */
public final class T8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14710a;

    /* renamed from: b  reason: collision with root package name */
    public final ImpressionType f14711b;
    public AdSessionContext c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14712d;

    /* renamed from: e  reason: collision with root package name */
    public byte f14713e;

    /* renamed from: f  reason: collision with root package name */
    public AdSession f14714f;

    /* renamed from: g  reason: collision with root package name */
    public C1793s f14715g;

    public T8(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        kotlin.jvm.internal.g.e(mAdSessionType, "mAdSessionType");
        kotlin.jvm.internal.g.e(impressionType, "impressionType");
        this.f14710a = mAdSessionType;
        this.f14711b = impressionType;
        this.c = adSessionContext;
        this.f14712d = z10;
    }

    public static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        Q4 q42 = Q4.f14590a;
        Q4.c.a(new J1(new Exception(a0.d.b("Omid AdSession State Error currentState :: ", b10, ", expectedState :: ", b11))));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(View trackingView, Map map, View view) {
        AdSession adSession;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        kotlin.jvm.internal.g.e(trackingView, "trackingView");
        if (this.f14714f == null) {
            boolean z10 = this.f14712d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.f14710a;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        owner2 = Owner.NATIVE;
                        owner = Owner.NONE;
                        creativeType = CreativeType.NATIVE_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        owner = Owner.NONE;
                        creativeType = CreativeType.HTML_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        owner2 = Owner.NATIVE;
                        creativeType2 = CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 363190080:
                    if (str.equals("html_audio_ad")) {
                        creativeType2 = CreativeType.AUDIO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        creativeType2 = CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f14711b, owner2, owner, z10), this.c);
            kotlin.jvm.internal.g.d(createAdSession, "createAdSession(...)");
            this.f14714f = createAdSession;
            this.f14715g = new C1793s(createAdSession, this.f14710a);
            this.f14713e = (byte) 1;
        }
        if (a(this.f14713e, (byte) 1) && (adSession = this.f14714f) != null) {
            adSession.registerAdView(trackingView);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a((View) entry.getKey(), (FriendlyObstructionPurpose) entry.getValue());
            }
        }
        if (view != null && (view instanceof ViewGroup)) {
            a(trackingView, map, (ViewGroup) view);
        }
        if (a(this.f14713e, (byte) 1)) {
            AdSession adSession2 = this.f14714f;
            if (adSession2 != null) {
                adSession2.start();
            }
            this.f14713e = (byte) 2;
        }
        AdSession adSession3 = this.f14714f;
        kotlin.jvm.internal.g.b(adSession3);
        adSession3.getAdSessionId();
    }

    public final void a(int i10, int i11, float f10, VastProperties vastProperties) {
        C1793s c1793s;
        AdEvents adEvents;
        MediaEvents mediaEvents;
        AdSession adSession;
        kotlin.jvm.internal.g.e(vastProperties, "vastProperties");
        if (a(this.f14713e, (byte) 2)) {
            byte b10 = (byte) i10;
            if (b10 == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                kotlin.jvm.internal.g.e(errorType, "errorType");
                if (a(this.f14713e, (byte) 2) && (adSession = this.f14714f) != null) {
                    adSession.error(errorType, "Unknown Player error");
                }
            } else if (b10 == 0 && (c1793s = this.f14715g) != null && (adEvents = c1793s.f15425a) != null) {
                adEvents.impressionOccurred();
            }
            C1793s c1793s2 = this.f14715g;
            if (c1793s2 == null || (mediaEvents = c1793s2.f15426b) == null) {
                return;
            }
            if (b10 == 7) {
                mediaEvents.pause();
            } else if (b10 == 5) {
                AdEvents adEvents2 = c1793s2.f15425a;
                if (adEvents2 != null) {
                    adEvents2.loaded(vastProperties);
                }
            } else if (b10 == 6) {
                mediaEvents.start(i11, f10);
            } else if (b10 == 8 || b10 == 16) {
                mediaEvents.resume();
            } else if (b10 == 15) {
                mediaEvents.skipped();
            } else if (b10 == 9) {
                mediaEvents.firstQuartile();
            } else if (b10 == 10) {
                mediaEvents.midpoint();
            } else if (b10 == 11) {
                mediaEvents.thirdQuartile();
            } else if (b10 == 12) {
                mediaEvents.complete();
            } else if (b10 == 13) {
                mediaEvents.volumeChange(0.0f);
            } else if (b10 == 14) {
                mediaEvents.volumeChange(f10);
            } else if (b10 == 1) {
                mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
            } else if (b10 == 2) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            } else if (b10 == 4) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
            } else if (b10 == 18) {
                mediaEvents.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
            }
        }
    }

    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
        byte b10 = this.f14713e;
        if (b10 > 0) {
            AdSession adSession = this.f14714f;
            if (adSession != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
                return;
            }
            return;
        }
        Q4 q42 = Q4.f14590a;
        Q4.c.a(new J1(new Exception(a0.a.g("Omid AdSession State Error currentState :: ", b10, ", expectedState :: 1"))));
    }

    public final void a() {
        AdSession adSession = this.f14714f;
        if (adSession != null) {
            adSession.getAdSessionId();
        }
        if (a(this.f14713e, (byte) 2)) {
            AdSession adSession2 = this.f14714f;
            if (adSession2 != null) {
                adSession2.finish();
            }
            this.f14714f = null;
            this.f14713e = (byte) 3;
        }
    }

    public final void a(View view, Map map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!kotlin.jvm.internal.g.a(childAt, view)) {
                if (map == null || !map.containsKey(childAt)) {
                    kotlin.jvm.internal.g.b(childAt);
                    a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        a(view, map, viewGroup2);
                    }
                }
            }
        }
    }
}
