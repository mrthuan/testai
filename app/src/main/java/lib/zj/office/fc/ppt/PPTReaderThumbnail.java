package lib.zj.office.fc.ppt;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class PPTReaderThumbnail {
    private static PPTReaderThumbnail kit = new PPTReaderThumbnail();

    private Bitmap getThumbnailForPPT(String str) {
        return null;
    }

    private Bitmap getThumbnailForPPTX(String str) {
        return null;
    }

    public static PPTReaderThumbnail instance() {
        return kit;
    }

    public Bitmap getThumbnail(String str) {
        try {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.endsWith("ppt") && !lowerCase.endsWith("pot")) {
                if (!lowerCase.endsWith("pptx") && !lowerCase.endsWith("pptm") && !lowerCase.endsWith("potx") && !lowerCase.endsWith("potm")) {
                    return null;
                }
                return getThumbnailForPPT(str);
            }
            return getThumbnailForPPT(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
