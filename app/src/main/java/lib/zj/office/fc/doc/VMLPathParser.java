package lib.zj.office.fc.doc;

import android.graphics.Path;
import android.graphics.PointF;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;
import lh.p;
import lib.zj.office.PathHolder;
import lib.zj.pdfeditor.Annotation;

/* loaded from: classes3.dex */
public class VMLPathParser {
    public static final byte Command_AngleEllipse = 11;
    public static final byte Command_AngleEllipseTo = 10;
    public static final byte Command_Arc = 13;
    public static final byte Command_ArcTo = 12;
    public static final byte Command_ClockwiseArc = 15;
    public static final byte Command_ClockwiseArcTo = 14;
    public static final byte Command_Close = 3;
    public static final byte Command_CurveTo = 2;
    private static final byte Command_EllipticalQaudrantX = 16;
    private static final byte Command_EllipticalQaudrantY = 17;
    public static final byte Command_End = 4;
    public static final byte Command_Invalid = -1;
    public static final byte Command_LineTo = 1;
    public static final byte Command_MoveTo = 0;
    public static final byte Command_NoFill = 8;
    public static final byte Command_NoStroke = 9;
    private static final byte Command_QuadraticBezier = 18;
    public static final byte Command_RCurveTo = 7;
    public static final byte Command_RLineTo = 6;
    public static final byte Command_RMoveTo = 5;
    private StringBuilder builder;
    private PointF ctrNode1;
    private PointF ctrNode2;
    private byte currentNodeType;
    Path endArrowPath;
    private int index;
    private PointF nextNode;
    private List<Integer> paraList;
    private PointF preNode;
    private byte preNodeType;
    Path startArrowPath;
    private static VMLPathParser instance = new VMLPathParser();
    private static byte NodeType_Invalidate = -1;
    private static byte NodeType_Start = 0;
    private static byte NodeType_Middle = 1;
    private static byte NodeType_End = 2;

    private VMLPathParser() {
        byte b10 = NodeType_Invalidate;
        this.currentNodeType = b10;
        this.preNodeType = b10;
        this.preNode = new PointF();
        this.ctrNode1 = new PointF();
        this.ctrNode2 = new PointF();
        this.nextNode = new PointF();
        this.startArrowPath = null;
        this.endArrowPath = null;
        this.builder = new StringBuilder();
        this.paraList = new ArrayList();
    }

    private boolean hasNextPoint(String str) {
        if (this.index < str.length() && !Character.isLetter(str.charAt(this.index))) {
            return true;
        }
        return false;
    }

    public static VMLPathParser instance() {
        return instance;
    }

    private byte nextCommand(String str) {
        StringBuilder sb2 = this.builder;
        sb2.delete(0, sb2.length());
        while (this.index < str.length() && Character.isLetter(str.charAt(this.index))) {
            StringBuilder sb3 = this.builder;
            int i10 = this.index;
            this.index = i10 + 1;
            sb3.append(str.charAt(i10));
        }
        String sb4 = this.builder.toString();
        if (sb4.contains("h")) {
            sb4 = sb4.substring(2);
        }
        if ("m".equalsIgnoreCase(sb4)) {
            return (byte) 0;
        }
        if (OperatorName.LINE_TO.equalsIgnoreCase(sb4)) {
            return (byte) 1;
        }
        if ("c".equalsIgnoreCase(sb4)) {
            return (byte) 2;
        }
        if ("x".equalsIgnoreCase(sb4)) {
            return (byte) 3;
        }
        if (Annotation.KEY_E.equalsIgnoreCase(sb4)) {
            return (byte) 4;
        }
        if ("t".equalsIgnoreCase(sb4)) {
            return (byte) 5;
        }
        if ("r".equalsIgnoreCase(sb4)) {
            return (byte) 6;
        }
        if (OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT.equalsIgnoreCase(sb4)) {
            return (byte) 7;
        }
        if ("nf".equalsIgnoreCase(sb4)) {
            return (byte) 8;
        }
        if ("ns".equalsIgnoreCase(sb4)) {
            return (byte) 9;
        }
        if ("ae".equalsIgnoreCase(sb4)) {
            return (byte) 10;
        }
        if ("al".equalsIgnoreCase(sb4)) {
            return (byte) 11;
        }
        if ("at".equalsIgnoreCase(sb4)) {
            return (byte) 12;
        }
        if ("ar".equalsIgnoreCase(sb4)) {
            return (byte) 13;
        }
        if ("wa".equalsIgnoreCase(sb4)) {
            return (byte) 14;
        }
        if ("wr".equalsIgnoreCase(sb4)) {
            return (byte) 15;
        }
        if ("qx".equalsIgnoreCase(sb4)) {
            return (byte) 16;
        }
        if ("qy".equalsIgnoreCase(sb4)) {
            return (byte) 17;
        }
        if ("qb".equalsIgnoreCase(sb4)) {
            return (byte) 18;
        }
        if (!sb4.contains("x") && !sb4.contains("X")) {
            return (byte) -1;
        }
        this.index -= sb4.length() - 1;
        return (byte) 3;
    }

    private Integer[] nextParameters(String str) {
        this.paraList.clear();
        while (hasNextPoint(str)) {
            int[] nextPoint = nextPoint(str);
            this.paraList.add(Integer.valueOf(nextPoint[0]));
            this.paraList.add(Integer.valueOf(nextPoint[1]));
        }
        List<Integer> list = this.paraList;
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

    private int[] nextPoint(String str) {
        int[] iArr = new int[2];
        StringBuilder sb2 = this.builder;
        sb2.delete(0, sb2.length());
        while (this.index < str.length() && (Character.isDigit(str.charAt(this.index)) || str.charAt(this.index) == '-')) {
            StringBuilder sb3 = this.builder;
            int i10 = this.index;
            this.index = i10 + 1;
            sb3.append(str.charAt(i10));
        }
        if (this.builder.length() > 0) {
            iArr[0] = Integer.parseInt(this.builder.toString());
        }
        if (this.index < str.length() && str.charAt(this.index) == ',') {
            this.index++;
            StringBuilder sb4 = this.builder;
            sb4.delete(0, sb4.length());
            while (this.index < str.length() && (Character.isDigit(str.charAt(this.index)) || str.charAt(this.index) == '-')) {
                StringBuilder sb5 = this.builder;
                int i11 = this.index;
                this.index = i11 + 1;
                sb5.append(str.charAt(i11));
            }
            if (this.builder.length() > 0) {
                iArr[1] = Integer.parseInt(this.builder.toString());
            }
            if (this.index < str.length() && str.charAt(this.index) == ',') {
                this.index++;
            }
        }
        return iArr;
    }

    private void processCommand_CurveTo(Path path, Integer[] numArr) {
        for (int i10 = 0; i10 < numArr.length - 5; i10 += 6) {
            int i11 = i10 + 1;
            int i12 = i10 + 2;
            int i13 = i10 + 3;
            int i14 = i10 + 4;
            int i15 = i10 + 5;
            path.cubicTo(numArr[i10].intValue(), numArr[i11].intValue(), numArr[i12].intValue(), numArr[i13].intValue(), numArr[i14].intValue(), numArr[i15].intValue());
            this.preNode.set(this.nextNode);
            this.ctrNode1.set(numArr[i10].intValue(), numArr[i11].intValue());
            this.ctrNode2.set(numArr[i12].intValue(), numArr[i13].intValue());
            this.nextNode.set(numArr[i14].intValue(), numArr[i15].intValue());
        }
    }

    private void processCommand_LineTo(Path path, Integer[] numArr) {
        for (int i10 = 0; i10 < numArr.length - 1; i10 += 2) {
            int i11 = i10 + 1;
            path.lineTo(numArr[i10].intValue(), numArr[i11].intValue());
            this.preNode.set(this.nextNode);
            this.nextNode.set(numArr[i10].intValue(), numArr[i11].intValue());
        }
    }

    private void processCommand_MoveTo(Path path, Integer[] numArr) {
        float f10;
        float f11;
        if (numArr.length == 2) {
            f11 = numArr[0].intValue();
            f10 = numArr[1].intValue();
        } else if (numArr.length == 1) {
            f11 = numArr[0].intValue();
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        path.moveTo(f11, f10);
        this.nextNode.set(f11, f10);
    }

    private void processCommand_rCurveTo(Path path, Integer[] numArr) {
        for (int i10 = 0; i10 < numArr.length - 5; i10 += 6) {
            int i11 = i10 + 1;
            int i12 = i10 + 2;
            int i13 = i10 + 3;
            int i14 = i10 + 4;
            int i15 = i10 + 5;
            path.rCubicTo(numArr[i10].intValue(), numArr[i11].intValue(), numArr[i12].intValue(), numArr[i13].intValue(), numArr[i14].intValue(), numArr[i15].intValue());
            this.preNode.set(this.nextNode);
            this.ctrNode1.offset(numArr[i10].intValue(), numArr[i11].intValue());
            this.ctrNode2.offset(numArr[i12].intValue(), numArr[i13].intValue());
            this.nextNode.offset(numArr[i14].intValue(), numArr[i15].intValue());
        }
    }

    private void processCommand_rLineTo(Path path, Integer[] numArr) {
        for (int i10 = 0; i10 < numArr.length - 1; i10 += 2) {
            int i11 = i10 + 1;
            path.rLineTo(numArr[i10].intValue(), numArr[i11].intValue());
            this.preNode.set(this.nextNode);
            this.nextNode.offset(numArr[i10].intValue(), numArr[i11].intValue());
        }
    }

    private void processCommand_rMoveTo(Path path, Integer[] numArr) {
        if (numArr.length == 2) {
            path.rMoveTo(numArr[0].intValue(), numArr[1].intValue());
            this.preNode.set(this.nextNode);
            this.nextNode.offset(numArr[0].intValue(), numArr[1].intValue());
        } else if (numArr.length == 1) {
            path.rMoveTo(numArr[0].intValue(), 0.0f);
            this.preNode.set(this.nextNode);
            this.nextNode.offset(numArr[0].intValue(), 0.0f);
        } else {
            path.rMoveTo(0.0f, 0.0f);
            this.preNode.set(this.nextNode);
            this.nextNode.offset(0.0f, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0446  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processPath(lh.p r26, int r27, android.graphics.Path r28, byte r29, java.lang.Integer[] r30) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.VMLPathParser.processPath(lh.p, int, android.graphics.Path, byte, java.lang.Integer[]):void");
    }

    public PathWithArrow createPath(p pVar, String str, int i10) {
        boolean z10;
        PathHolder pathHolder;
        try {
            this.index = 0;
            this.startArrowPath = null;
            this.endArrowPath = null;
            ArrayList arrayList = new ArrayList();
            byte nextCommand = nextCommand(str);
            this.currentNodeType = NodeType_Start;
            this.preNodeType = NodeType_Invalidate;
            byte b10 = nextCommand;
            PathHolder pathHolder2 = null;
            while (true) {
                boolean z11 = true;
                while (b10 != -1) {
                    if (b10 == 4) {
                        byte nextCommand2 = nextCommand(str);
                        if (nextCommand2 == -1) {
                            this.currentNodeType = NodeType_End;
                        }
                        b10 = nextCommand2;
                    } else {
                        if (z11) {
                            PathHolder pathHolder3 = new PathHolder();
                            arrayList.add(pathHolder3);
                            pathHolder = pathHolder3;
                            z10 = false;
                        } else {
                            z10 = z11;
                            pathHolder = pathHolder2;
                        }
                        Integer[] nextParameters = nextParameters(str);
                        byte nextCommand3 = nextCommand(str);
                        if (nextCommand3 == -1 || nextCommand3 == 4) {
                            this.currentNodeType = NodeType_End;
                        }
                        processPath(pVar, i10, pathHolder, b10, nextParameters);
                        this.preNodeType = this.currentNodeType;
                        this.currentNodeType = NodeType_Middle;
                        z11 = z10;
                        pathHolder2 = pathHolder;
                        b10 = nextCommand3;
                    }
                }
                PathWithArrow pathWithArrow = new PathWithArrow((Path[]) arrayList.toArray(new Path[arrayList.size()]), this.startArrowPath, this.endArrowPath);
                this.startArrowPath = null;
                this.endArrowPath = null;
                return pathWithArrow;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
