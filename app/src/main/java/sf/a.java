package sf;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* compiled from: OpenGlUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glGetShaderInfoLog(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static int b(Bitmap bitmap, int i10, boolean z10) {
        int[] iArr = new int[1];
        if (i10 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i10);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i10;
        }
        if (z10) {
            bitmap.recycle();
        }
        return iArr[0];
    }
}
