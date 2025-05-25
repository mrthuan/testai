package lib.zj.pdfeditor;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Annotation extends RectF implements Serializable {
    public static final String KEY_A = "a";
    public static final String KEY_ANNOT_BMP = "Bitmap";
    public static final String KEY_ANNOT_BORDER = "Border";
    public static final String KEY_ANNOT_COLOR = "Color";
    public static final String KEY_ANNOT_INK_POINTS = "Points";
    public static final String KEY_ANNOT_NAME = "Name";
    public static final String KEY_ANNOT_QUAD_POINTS = "QPoints";
    public static final String KEY_ANNOT_ROTATE = "Rotate";
    public static final String KEY_ANNOT_TEXT_CONTENTS = "Contents";
    public static final String KEY_ANNOT_TEXT_SIZE = "Size";
    public static final String KEY_B = "b";
    public static final String KEY_C = "c";
    public static final String KEY_D = "d";
    public static final String KEY_E = "e";
    public static final String KEY_F = "f";
    public static final String KEY_IMG_HEIGHT = "ImgHeight";
    public static final String KEY_IMG_INDEX = "ImgIndex";
    public static final String KEY_IMG_NAME = "ImgName";
    public static final String KEY_IMG_QUAD_POINTS = "ImgQPoints";
    public static final String KEY_IMG_RENDER_OBJ_ID = "ImgRenderObjID";
    public static final String KEY_IMG_ROTATE_ANGLE = "ImgRotateAngle";
    public static final String KEY_IMG_SOURCE_OBJ_ID = "ImgSourceObjID";
    public static final String KEY_IMG_WIDTH = "ImgWidth";
    public static final String KEY_ZOOM = "Zoom";
    private HashMap<String, Object> dataMap;
    public final Type type;

    /* loaded from: classes3.dex */
    public enum Type {
        TEXT,
        LINK,
        FREETEXT,
        LINE,
        SQUARE,
        CIRCLE,
        POLYGON,
        POLYLINE,
        HIGHLIGHT,
        UNDERLINE,
        SQUIGGLY,
        STRIKEOUT,
        STAMP,
        CARET,
        INK,
        POPUP,
        FILEATTACHMENT,
        SOUND,
        MOVIE,
        WIDGET,
        SCREEN,
        PRINTERMARK,
        TRAPNET,
        WATERMARK,
        A3D,
        IMG,
        UNKNOWN
    }

    public Annotation(float f10, float f11, float f12, float f13, int i10) {
        super(f10, f11, f12, f13);
        Type type;
        this.dataMap = new HashMap<>();
        if (i10 == -1) {
            type = Type.UNKNOWN;
        } else {
            type = Type.values()[i10];
        }
        this.type = type;
    }

    private float parseMatrixValue(Object obj) {
        try {
            return Float.parseFloat(String.valueOf(obj));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0f;
        }
    }

    public Object getData(String str) {
        return this.dataMap.get(str);
    }

    public int getImgHeight() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Math.round(Float.parseFloat(String.valueOf(hashMap.get(KEY_IMG_HEIGHT))));
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public int getImgIndex() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Integer.parseInt(String.valueOf(hashMap.get(KEY_IMG_INDEX)));
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    public float[] getImgMatrixValue() {
        HashMap<String, Object> hashMap;
        float[] fArr = new float[6];
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    key.getClass();
                    char c = 65535;
                    switch (key.hashCode()) {
                        case 97:
                            if (key.equals("a")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 98:
                            if (key.equals("b")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 99:
                            if (key.equals("c")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 100:
                            if (key.equals("d")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 101:
                            if (key.equals(KEY_E)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 102:
                            if (key.equals("f")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            fArr[0] = parseMatrixValue(entry.getValue());
                            continue;
                        case 1:
                            fArr[3] = parseMatrixValue(entry.getValue());
                            continue;
                        case 2:
                            fArr[1] = parseMatrixValue(entry.getValue());
                            continue;
                        case 3:
                            fArr[4] = parseMatrixValue(entry.getValue());
                            continue;
                        case 4:
                            fArr[2] = parseMatrixValue(entry.getValue());
                            continue;
                        case 5:
                            fArr[5] = parseMatrixValue(entry.getValue());
                            continue;
                    }
                }
            }
        }
        return fArr;
    }

    public String getImgName() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            return String.valueOf(hashMap.get(KEY_IMG_NAME));
        }
        return "";
    }

    public int getImgRenderObjID() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Integer.parseInt(String.valueOf(hashMap.get(KEY_IMG_RENDER_OBJ_ID)));
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    public int getImgSourceObjID() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Integer.parseInt(String.valueOf(hashMap.get(KEY_IMG_SOURCE_OBJ_ID)));
            } catch (Exception e10) {
                e10.printStackTrace();
                return -1;
            }
        }
        return -1;
    }

    public int getImgWidth() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Math.round(Float.parseFloat(String.valueOf(hashMap.get(KEY_IMG_WIDTH))));
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public PointF[] getQuadPoints() {
        Object data = getData(KEY_ANNOT_QUAD_POINTS);
        if (data instanceof PointF[]) {
            return (PointF[]) data;
        }
        return null;
    }

    public float getZoom() {
        HashMap<String, Object> hashMap;
        if (this.type == Type.IMG && (hashMap = this.dataMap) != null) {
            try {
                return Float.parseFloat(String.valueOf(hashMap.get(KEY_ZOOM)));
            } catch (Exception e10) {
                e10.printStackTrace();
                return 1.0f;
            }
        }
        return 1.0f;
    }

    @Keep
    public void setData(String str, Object obj) {
        this.dataMap.put(str, obj);
    }

    public void setMatrixValue(Matrix matrix) {
        float[] fArr = new float[9];
        float[] imgMatrixValue = getImgMatrixValue();
        if (imgMatrixValue != null) {
            int i10 = 0;
            for (float f10 : imgMatrixValue) {
                fArr[i10] = f10;
                i10++;
            }
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
        }
        matrix.setValues(fArr);
    }

    @Override // android.graphics.RectF
    public String toString() {
        String name;
        StringBuilder sb2 = new StringBuilder("Annotation{type=");
        Type type = this.type;
        if (type == null) {
            name = "null";
        } else {
            name = type.name();
        }
        sb2.append(name);
        sb2.append(", left=");
        sb2.append(((RectF) this).left);
        sb2.append(", top=");
        sb2.append(((RectF) this).top);
        sb2.append(", right=");
        sb2.append(((RectF) this).right);
        sb2.append(", bottom=");
        sb2.append(((RectF) this).bottom);
        sb2.append(", dataMap=");
        sb2.append(this.dataMap);
        sb2.append('}');
        return sb2.toString();
    }
}
