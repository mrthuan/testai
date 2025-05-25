package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import com.inmobi.media.Bb;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$RenderTimeoutByType {
    public static final Bb Companion = new Bb();
    private int audio;
    private int banner;

    /* renamed from: int  reason: not valid java name */
    private int f8int;

    /* renamed from: native  reason: not valid java name */
    private int f9native;

    public /* synthetic */ TimeoutConfigurations$RenderTimeoutByType(d dVar) {
        this();
    }

    public final int getAudio$media_release() {
        return this.audio;
    }

    public final int getBanner$media_release() {
        return this.banner;
    }

    public final int getInt$media_release() {
        return this.f8int;
    }

    public final int getNative$media_release() {
        return this.f9native;
    }

    public final int getTimeoutByType$media_release(String adType, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        g.e(adType, "adType");
        int hashCode = adType.hashCode();
        if (hashCode != -1396342996) {
            if (hashCode != -1052618729) {
                if (hashCode != 104431) {
                    if (hashCode == 93166550 && adType.equals("audio") && (i14 = this.audio) > 0) {
                        return i14;
                    }
                } else if (adType.equals("int") && (i13 = this.f8int) > 0) {
                    return i13;
                }
            } else if (adType.equals("native") && (i12 = this.f9native) > 0) {
                return i12;
            }
        } else if (adType.equals("banner") && (i11 = this.banner) > 0) {
            return i11;
        }
        return i10;
    }

    public final void setAudio$media_release(int i10) {
        this.audio = i10;
    }

    public final void setBanner$media_release(int i10) {
        this.banner = i10;
    }

    public final void setInt$media_release(int i10) {
        this.f8int = i10;
    }

    public final void setNative$media_release(int i10) {
        this.f9native = i10;
    }

    public final void setTimeoutByType(String adType, int i10) {
        g.e(adType, "adType");
        int hashCode = adType.hashCode();
        if (hashCode != -1396342996) {
            if (hashCode != -1052618729) {
                if (hashCode != 104431) {
                    if (hashCode == 93166550 && adType.equals("audio")) {
                        this.audio = i10;
                    }
                } else if (adType.equals("int")) {
                    this.f8int = i10;
                }
            } else if (adType.equals("native")) {
                this.f9native = i10;
            }
        } else if (adType.equals("banner")) {
            this.banner = i10;
        }
    }

    private TimeoutConfigurations$RenderTimeoutByType() {
    }
}
