// Auto-fixed: added missing class declaration
public class ABk {
package com.bytedance.adsdk.ugeno.core;

/* compiled from: UGenEventEnum.java */
/* loaded from: classes.dex */
public enum ABk {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17);
    
    private int MQ;
    private String tP;

    ABk(String str, int i10) {
        this.tP = str;
        this.MQ = i10;
    }

    public int Qhi() {
        return this.MQ;
    }

    public static ABk Qhi(String str) {
        ABk[] values;
        for (ABk aBk : values()) {
            if (aBk.tP.equals(str)) {
                return aBk;
            }
        }
        return UNKNOWN_EVENT;
    }
}

}
