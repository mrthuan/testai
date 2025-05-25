package com.inmobi.ads;

import kotlin.jvm.internal.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AudioStatus {
    private static final /* synthetic */ xf.a $ENTRIES;
    private static final /* synthetic */ AudioStatus[] $VALUES;
    public static final Companion Companion;
    public static final AudioStatus PLAYING = new AudioStatus("PLAYING", 0);
    public static final AudioStatus PAUSED = new AudioStatus("PAUSED", 1);
    public static final AudioStatus COMPLETED = new AudioStatus("COMPLETED", 2);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        public AudioStatus from(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return AudioStatus.COMPLETED;
                }
                return AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        public Integer to(AudioStatus item) {
            g.e(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    private static final /* synthetic */ AudioStatus[] $values() {
        return new AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        AudioStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new Companion(null);
    }

    private AudioStatus(String str, int i10) {
    }

    public static AudioStatus from(int i10) {
        return Companion.from(i10);
    }

    public static xf.a<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    public static int to(AudioStatus audioStatus) {
        return Companion.to(audioStatus).intValue();
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }
}
