package androidx.media;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(h2.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f4093a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        audioAttributesCompat.f4093a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, h2.a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4093a;
        aVar.n(1);
        aVar.v(audioAttributesImpl);
    }
}
