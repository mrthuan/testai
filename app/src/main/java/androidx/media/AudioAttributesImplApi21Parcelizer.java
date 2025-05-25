package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(h2.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelable = audioAttributesImplApi21.f4094a;
        if (aVar.h(1)) {
            parcelable = aVar.k();
        }
        audioAttributesImplApi21.f4094a = (AudioAttributes) parcelable;
        audioAttributesImplApi21.f4095b = aVar.j(audioAttributesImplApi21.f4095b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, h2.a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f4094a;
        aVar.n(1);
        aVar.t(audioAttributes);
        aVar.s(audioAttributesImplApi21.f4095b, 2);
    }
}
