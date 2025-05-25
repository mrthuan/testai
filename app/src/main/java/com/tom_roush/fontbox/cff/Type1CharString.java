package com.tom_roush.fontbox.cff;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b.a;
import com.tom_roush.fontbox.encoding.StandardEncoding;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Type1CharString {
    protected int commandCount;
    private PointF current;
    private final List<PointF> flexPoints;
    private Type1CharStringReader font;
    private final String fontName;
    private final String glyphName;
    private boolean isFlex;
    private PointF leftSideBearing;
    private Path path;
    protected List<Object> type1Sequence;
    private int width;

    public Type1CharString(Type1CharStringReader type1CharStringReader, String str, String str2, List<Object> list) {
        this(type1CharStringReader, str, str2);
        this.type1Sequence = list;
    }

    private void callothersubr(int i10) {
        if (i10 == 0) {
            this.isFlex = false;
            if (this.flexPoints.size() < 7) {
                return;
            }
            PointF pointF = this.flexPoints.get(0);
            PointF pointF2 = this.current;
            pointF.set(pointF2.x + pointF.x, pointF2.y + pointF.y);
            PointF pointF3 = this.flexPoints.get(1);
            pointF3.set(pointF.x + pointF3.x, pointF.y + pointF3.y);
            float f10 = pointF3.x;
            PointF pointF4 = this.current;
            pointF3.set(f10 - pointF4.x, pointF3.y - pointF4.y);
            rrcurveTo(Float.valueOf(this.flexPoints.get(1).x), Float.valueOf(this.flexPoints.get(1).y), Float.valueOf(this.flexPoints.get(2).x), Float.valueOf(this.flexPoints.get(2).y), Float.valueOf(this.flexPoints.get(3).x), Float.valueOf(this.flexPoints.get(3).y));
            rrcurveTo(Float.valueOf(this.flexPoints.get(4).x), Float.valueOf(this.flexPoints.get(4).y), Float.valueOf(this.flexPoints.get(5).x), Float.valueOf(this.flexPoints.get(5).y), Float.valueOf(this.flexPoints.get(6).x), Float.valueOf(this.flexPoints.get(6).y));
            this.flexPoints.clear();
        } else if (i10 == 1) {
            this.isFlex = true;
        } else {
            throw new IllegalArgumentException(a.c("Unexpected other subroutine: ", i10));
        }
    }

    private void closeCharString1Path() {
        if (!this.path.isEmpty()) {
            this.path.close();
        }
        Path path = this.path;
        PointF pointF = this.current;
        path.moveTo(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Number> handleCommand(List<Number> list, CharStringCommand charStringCommand) {
        this.commandCount++;
        String str = CharStringCommand.TYPE1_VOCABULARY.get(charStringCommand.getKey());
        if ("rmoveto".equals(str)) {
            if (list.size() >= 2) {
                if (this.isFlex) {
                    this.flexPoints.add(new PointF(list.get(0).floatValue(), list.get(1).floatValue()));
                    return null;
                }
                rmoveTo(list.get(0), list.get(1));
                return null;
            }
            return null;
        } else if ("vmoveto".equals(str)) {
            if (!list.isEmpty()) {
                if (this.isFlex) {
                    this.flexPoints.add(new PointF(0.0f, list.get(0).floatValue()));
                    return null;
                }
                rmoveTo(0, list.get(0));
                return null;
            }
            return null;
        } else if ("hmoveto".equals(str)) {
            if (!list.isEmpty()) {
                if (this.isFlex) {
                    this.flexPoints.add(new PointF(list.get(0).floatValue(), 0.0f));
                    return null;
                }
                rmoveTo(list.get(0), 0);
                return null;
            }
            return null;
        } else if ("rlineto".equals(str)) {
            if (list.size() >= 2) {
                rlineTo(list.get(0), list.get(1));
                return null;
            }
            return null;
        } else if ("hlineto".equals(str)) {
            if (!list.isEmpty()) {
                rlineTo(list.get(0), 0);
                return null;
            }
            return null;
        } else if ("vlineto".equals(str)) {
            if (!list.isEmpty()) {
                rlineTo(0, list.get(0));
                return null;
            }
            return null;
        } else if ("rrcurveto".equals(str)) {
            if (list.size() >= 6) {
                rrcurveTo(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
                return null;
            }
            return null;
        } else if ("closepath".equals(str)) {
            closeCharString1Path();
            return null;
        } else if ("sbw".equals(str)) {
            if (list.size() >= 3) {
                this.leftSideBearing = new PointF(list.get(0).floatValue(), list.get(1).floatValue());
                this.width = list.get(2).intValue();
                this.current.set(this.leftSideBearing);
                return null;
            }
            return null;
        } else if ("hsbw".equals(str)) {
            if (list.size() >= 2) {
                this.leftSideBearing = new PointF(list.get(0).floatValue(), 0.0f);
                this.width = list.get(1).intValue();
                this.current.set(this.leftSideBearing);
                return null;
            }
            return null;
        } else if ("vhcurveto".equals(str)) {
            if (list.size() >= 4) {
                rrcurveTo(0, list.get(0), list.get(1), list.get(2), list.get(3), 0);
                return null;
            }
            return null;
        } else if ("hvcurveto".equals(str)) {
            if (list.size() >= 4) {
                rrcurveTo(list.get(0), 0, list.get(1), list.get(2), 0, list.get(3));
                return null;
            }
            return null;
        } else if ("seac".equals(str)) {
            if (list.size() >= 5) {
                seac(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                return null;
            }
            return null;
        } else if ("setcurrentpoint".equals(str)) {
            if (list.size() >= 2) {
                setcurrentpoint(list.get(0), list.get(1));
                return null;
            }
            return null;
        } else if ("callothersubr".equals(str)) {
            if (!list.isEmpty()) {
                callothersubr(list.get(0).intValue());
                return null;
            }
            return null;
        } else if ("div".equals(str)) {
            float floatValue = list.get(list.size() - 2).floatValue() / list.get(list.size() - 1).floatValue();
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(Float.valueOf(floatValue));
            return arrayList;
        } else if (!"hstem".equals(str) && !"vstem".equals(str) && !"hstem3".equals(str) && !"vstem3".equals(str) && !"dotsection".equals(str) && !"endchar".equals(str)) {
            if ("return".equals(str)) {
                Objects.toString(charStringCommand.getKey());
                return null;
            } else if (str == null) {
                Objects.toString(charStringCommand.getKey());
                return null;
            } else {
                throw new IllegalArgumentException("Unhandled command: ".concat(str));
            }
        } else {
            return null;
        }
    }

    private void render() {
        this.path = new Path();
        this.leftSideBearing = new PointF(0.0f, 0.0f);
        this.width = 0;
        new CharStringHandler() { // from class: com.tom_roush.fontbox.cff.Type1CharString.1
            @Override // com.tom_roush.fontbox.cff.CharStringHandler
            public List<Number> handleCommand(List<Number> list, CharStringCommand charStringCommand) {
                return Type1CharString.this.handleCommand(list, charStringCommand);
            }
        }.handleSequence(this.type1Sequence);
    }

    private void rlineTo(Number number, Number number2) {
        float floatValue = number.floatValue() + this.current.x;
        float floatValue2 = number2.floatValue() + this.current.y;
        if (this.path.isEmpty()) {
            this.path.moveTo(floatValue, floatValue2);
        } else {
            this.path.lineTo(floatValue, floatValue2);
        }
        this.current.set(floatValue, floatValue2);
    }

    private void rmoveTo(Number number, Number number2) {
        float floatValue = number.floatValue() + this.current.x;
        float floatValue2 = number2.floatValue() + this.current.y;
        this.path.moveTo(floatValue, floatValue2);
        this.current.set(floatValue, floatValue2);
    }

    private void rrcurveTo(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        float floatValue = number.floatValue() + this.current.x;
        float floatValue2 = number2.floatValue() + this.current.y;
        float floatValue3 = number3.floatValue() + floatValue;
        float floatValue4 = number4.floatValue() + floatValue2;
        float floatValue5 = number5.floatValue() + floatValue3;
        float floatValue6 = number6.floatValue() + floatValue4;
        if (this.path.isEmpty()) {
            this.path.moveTo(floatValue5, floatValue6);
        } else {
            this.path.cubicTo(floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6);
        }
        this.current.set(floatValue5, floatValue6);
    }

    private void seac(Number number, Number number2, Number number3, Number number4, Number number5) {
        try {
            this.path.op(this.font.getType1CharString(StandardEncoding.INSTANCE.getName(number4.intValue())).getPath(), Path.Op.UNION);
        } catch (IOException unused) {
        }
        try {
            Type1CharString type1CharString = this.font.getType1CharString(StandardEncoding.INSTANCE.getName(number5.intValue()));
            AffineTransform.getTranslateInstance((this.leftSideBearing.x + number2.floatValue()) - number.floatValue(), this.leftSideBearing.y + number3.floatValue());
            this.path.op(type1CharString.getPath(), Path.Op.UNION);
        } catch (IOException unused2) {
        }
    }

    private void setcurrentpoint(Number number, Number number2) {
        this.current.set(number.floatValue(), number2.floatValue());
    }

    public RectF getBounds() {
        if (this.path == null) {
            render();
        }
        RectF rectF = new RectF();
        this.path.computeBounds(rectF, true);
        return rectF;
    }

    public String getName() {
        return this.glyphName;
    }

    public Path getPath() {
        if (this.path == null) {
            render();
        }
        return this.path;
    }

    public List<Object> getType1Sequence() {
        return this.type1Sequence;
    }

    public int getWidth() {
        if (this.path == null) {
            render();
        }
        return this.width;
    }

    public String toString() {
        return this.type1Sequence.toString().replace("|", "\n").replace(",", " ");
    }

    public Type1CharString(Type1CharStringReader type1CharStringReader, String str, String str2) {
        this.path = null;
        this.width = 0;
        this.leftSideBearing = null;
        this.current = null;
        this.isFlex = false;
        this.flexPoints = new ArrayList();
        this.font = type1CharStringReader;
        this.fontName = str;
        this.glyphName = str2;
        this.current = new PointF(0.0f, 0.0f);
    }
}
